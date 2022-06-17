package my.task.javacourse.service;

import my.task.javacourse.entity.House;
import my.task.javacourse.exception.HouseNotFoundException;
import my.task.javacourse.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    private final HouseRepository houseRepository;

    @Autowired
    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public Long createHouse(String name, String type, int rating_plus, int rating,
                            int prise, int date_to_build, int number_of_flat) {
        House house = new House(name,type,rating_plus,rating,prise,date_to_build,number_of_flat);
        return houseRepository.save(house).getHouseId();
    }

    public House getHouseById(Long id){
        return houseRepository.findById(id).orElseThrow(()-> new HouseNotFoundException("Can't finde house with this ID:"+id));
    }

    public List<House> getAll(){
        return houseRepository.findAll();
    }

    public House deleteByID(Long id){
        House house= getHouseById(id);
        houseRepository.deleteById(id);
        return house;
    }

}
