package com.nilesh.zerodefectdeveloper;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
public class SkillService {
	
	@Autowired
	private SkillRepository repository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Skill> getAll() {
		return repository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value= "/id")
	public Optional<Skill> getById(@PathVariable("id") String id) {
		return repository.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Skill add(@RequestBody Skill skill) {
		return repository.save(skill);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value= "/id")
	public void delete(@PathVariable("id") String id) {
		repository.deleteById(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Skill update(@RequestBody Skill skill) {
		return repository.save(skill);
	}
}
