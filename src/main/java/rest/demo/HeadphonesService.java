package rest.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeadphonesService {
	@Autowired
	public HeadphonesService(HeadphonesRepo repo) {
		this.repo = repo;
	}
	public HeadphonesRepo getRepo() {
		return repo;
	}
	public void setRepo(HeadphonesRepo repo) {
		this.repo = repo;
	}
	public Optional<Headphones> getByID(long id) {
		return repo.findById(id);
	}
	public Iterable<Headphones> getAll() {
		return repo.findAll();
	}
	public Headphones save(Headphones h) {
		return repo.save(h);
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
	HeadphonesRepo repo;
}
