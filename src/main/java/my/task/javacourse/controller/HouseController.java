package my.task.javacourse.controller;


import my.task.javacourse.controller.dto.HouseRequestDTO;
import my.task.javacourse.controller.dto.HouseResponseDTO;
import my.task.javacourse.entity.House;
import my.task.javacourse.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HouseController {

    private  HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/hello")
    public String helloSpring(){
        return "hello Spring!";
    }

    @PostMapping("/houses")
    public Long createHouse(@RequestBody HouseRequestDTO houseRequestDTO){
        return houseService.createHouse(houseRequestDTO.getName(),houseRequestDTO.getType(),
                houseRequestDTO.getRating_plus(),
                houseRequestDTO.getRating(),houseRequestDTO.getPrise(),
                houseRequestDTO.getDate_to_build(),houseRequestDTO.getNumber_of_flat());

    }
    @GetMapping("/houses/{id}")
    public HouseResponseDTO getHouse(@PathVariable Long id){
        return new HouseResponseDTO(houseService.getHouseById(id));
    }

    @GetMapping("/houses")
    public List<HouseResponseDTO> getAllHouses(){
        return houseService.getAll().stream().map(HouseResponseDTO::new).collect(Collectors.toList());
    }
    @DeleteMapping("/houses/{id}")
    public HouseResponseDTO delete(@PathVariable Long id){
        return new HouseResponseDTO(houseService.deleteByID(id));


    }
}
