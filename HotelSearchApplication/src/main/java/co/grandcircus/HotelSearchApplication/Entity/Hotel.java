package co.grandcircus.HotelSearchApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "hotel_listing")
public class Hotel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "hotel_id")
	private Long id;  
	@Column (name = "hotel_name")
	private String name;
	private String city;
	private Integer pricePerNight;
	@Column (name = "image_link")
	private String imageLink;
	@Column (name = "hotel_link")
	private String hotelLink;
	@Column (name = "map_link")
	private String mapLink;
	
	
	public Hotel () {
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(Integer pricePerNight) {
		this.pricePerNight = pricePerNight;
	}


	public String getImageLink() {
		return imageLink;
	}


	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public String getHotelLink() {
		return hotelLink;
	}


	public void setHotelLink(String hotelLink) {
		this.hotelLink = hotelLink;
	}


	public String getMapLink() {
		return mapLink;
	}


	public void setMapLink(String mapLink) {
		this.mapLink = mapLink;
	}
	

}
