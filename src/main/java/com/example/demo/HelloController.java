package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	  @Autowired
	    private CountryRepository repository;


		// ------------------- Ricerca Per Nome ------------------------------------
		//api/ciao
			@RequestMapping(value = "/cercaid/{countryId}", method = RequestMethod.GET, produces = "application/json")
			public ResponseEntity<Optional<Country>> ricercaPerId(@PathVariable("countryId") Integer countryId)

			{

				Optional<Country> res = repository.findById(countryId);

				return new ResponseEntity<>(res, HttpStatus.OK);
			}


	// ------------------- Ricerca Per Nome ------------------------------------
	//api/ciao
		@RequestMapping(value = "/cercanome/{countryName}", method = RequestMethod.GET, produces = "application/json")
		public ResponseEntity<List<Country>> ricercaPerNome(@PathVariable("countryName") String countryName)

		{
			System.out.println("****** dentro *******");
			System.out.println("countryName:"+countryName);
			List<Country> res = repository.findByCountryName(countryName);

			return new ResponseEntity<>(res, HttpStatus.OK);
		}



		// ------------------- tutti i country ------------------------------------
			@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
			public ResponseEntity<Iterable<Country>> listaCompleta()

			{
				Iterable<Country> res = repository.findAll();

				for (Country country : res) {
					System.out.println("country.getCountryName():"+country.getCountryName());
				}

				return new ResponseEntity<>(res, HttpStatus.OK);
			}


			// ------------------- countr per nome ------------------------------------
			@RequestMapping(value = "/cercanomelike/{countryName}", method = RequestMethod.GET, produces = "application/json")
			public ResponseEntity<List<Country>> cercanomelike(@PathVariable("countryName") String countryName)

			{
				List<Country> res = repository.SelByDescrizioneLike(countryName);


				return new ResponseEntity<>(res, HttpStatus.OK);
			}


			@RequestMapping(value = "/cercanomelikejpql/{countryName}", method = RequestMethod.GET, produces = "application/json")
			public ResponseEntity<List<Country>> cercanomelikeJPQL(@PathVariable("countryName") String countryName)

			{
				List<Country> res = repository.SelByDescrizioneLike(countryName);


				return new ResponseEntity<>(res, HttpStatus.OK);
			}


			@RequestMapping(value = "/delete/{countryName}", method = RequestMethod.DELETE, produces = "application/json")
			public ResponseEntity<String> deleteNome(@PathVariable("countryName") String countryName)

			{
				repository.DelRowCountryName(countryName);


				return new ResponseEntity<>("ok", HttpStatus.OK);
			}

}
