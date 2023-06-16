package rest.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/headphones")
@RestController
public class HeadphonesAPI {
	@GetMapping("/get")
	public Iterable<Headphones> getService() {
		return service.getAll();
	}
	@GetMapping("/get/{id}")
	public Headphones getHeadphonesByID(@PathVariable("id") long id) {
		return service.getByID(id).get();
	}
	@PostMapping("/add")
	public boolean addHeadphones(@RequestBody Headphones h) {
		service.save(h);
		return true;
	}
	@PutMapping("/modify/{id}")
	public boolean modifyHeadphones(@PathVariable("id") long id, @RequestBody Headphones h) {
		Optional<Headphones> hh =  service.getByID(id);
		hh.get().setName(h.getName());
		hh.get().setBrand(h.getBrand());
		hh.get().setImpedance(h.getImpedance());
		return true;
	}
	@DeleteMapping("/delete/{id}")
	public boolean deleteHeadphones(@PathVariable("id") long id) {
		service.delete(id);
		return true;
	}
	@Autowired
	public HeadphonesAPI(HeadphonesService service) {
		this.service = service;
		var h1 = new Headphones();
		h1.setBrand("b1");
		h1.setImpedance(8);
		h1.setName("n1");
		var h2 = new Headphones();
		h2.setBrand("b2");
		h2.setImpedance(8);
		h2.setName("n2");
		var h3 = new Headphones();
		h3.setBrand("b3");
		h3.setImpedance(8);
		h3.setName("n3");
		service.save(h1);
		service.save(h2);
		service.save(h3);
	}
	private HeadphonesService service;
}
