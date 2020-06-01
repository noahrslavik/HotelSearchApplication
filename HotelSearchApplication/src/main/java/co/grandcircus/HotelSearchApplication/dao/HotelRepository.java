package co.grandcircus.HotelSearchApplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.HotelSearchApplication.Entity.Hotel;

public interface HotelRepository extends JpaRepository <Hotel, Long>{

	public List<Hotel> findAllByCity(String city);
	
}
