package com.fran.springboot.backend.eventos.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fran.springboot.backend.eventos.entidades.Articulo;
import com.fran.springboot.backend.eventos.services.IArticuloService;
import org.json.JSONArray;
import org.json.JSONObject;

@RestController
@RequestMapping("/api/articuls")
public class ArticuloCotroller {
	
	@Autowired
	private IArticuloService service;
	
	@GetMapping
	public List<Articulo> listar(){
	List<Articulo> articulos = service.listar();
	for (Articulo a : articulos) {
		ArrayList<String> fotos = new ArrayList<>();
		fotos = getFotos(a.getId());
		a.setFotos(fotos);
	}
	return articulos;
	}
	@GetMapping("/{id}")
	public Articulo listarPorId(@PathVariable Long id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Articulo registrar(@RequestBody Articulo articulo) {
	return service.registrar(articulo);
	}
	@PutMapping
	public Articulo modificar(@RequestBody Articulo articulo) {
	return service.modificar(articulo);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id){
	service.eliminar(id);
	}
	@GetMapping("/cat/{cat}")
	public List<Articulo> getArticulosCat(
	@PathVariable(value = "cat") String cat){
	return service.getArticulosCat(cat);
	}
	@GetMapping("/catuser/{cat}/{id}")
	public List<Articulo> getArticulosCatNouser(
	@PathVariable(value = "cat") String cat,@PathVariable(value = "id") Long id){
	return service.getArticulosCatNouser(cat,id);
	}
	@GetMapping("/user/{id}")
	public List<Articulo> getArticulosUser(
	@PathVariable(value = "id") Long id){
	return service.getArticulosUser(id);
	}
	@GetMapping("/nouser/{id}")
	public List<Articulo> getArticulosNoUser(
	@PathVariable(value = "id") Long id){
	return service.getArticulosNoUser(id);
	}
	@GetMapping("/buscador/{name}")
	public List<Articulo> getArticulosBuscador(
	@PathVariable(value = "name") String name){
	return service.getArticulosBuscador(name);
	}
	
	public ArrayList<String> getFotos(long id) {
		ArrayList<String> fotos = new ArrayList<>();
		System.out.println("DENTROOOO");
		
		URL url;
		try {
			url = new URL("http://192.168.8.99:8069/jsonrpc");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			
			String jsonInputString = "{\"jsonrpc\":\"2.0\", \"method\":\"call\",\"params\":{\"service\":\"object\",\"method\":\"execute\",\"args\":[\"jessica2dam\",2,\"1234\",\"simarropop.foto\",\"search_read\",[[\"articulo\",\"=\","
					+ id + "]],[\"foto_articulo\"]]},\"id\":970249153}";
			
			System.out.println(jsonInputString);
			
			// Enviar la consulta al servidor
			try (OutputStream os = con.getOutputStream()) {
				byte[] input = jsonInputString.getBytes("utf-8");
				os.write(input, 0, input.length);
			}
			
			try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}

				JSONObject jsonResponse = new JSONObject(response.toString());
				JSONArray result = jsonResponse.getJSONArray("result");

				for (int i = 0; i < result.length(); i++) {
					JSONObject objeto = result.getJSONObject(i);
					String foto = objeto.getString("foto_articulo");
					System.out.println(foto);
					fotos.add(foto);
				}
				//fotos.add("Holaaa");
				return fotos;
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fotos;
		
	}
	
}
