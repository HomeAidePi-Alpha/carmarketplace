package com.geekymon2.carmarketplace.carinfoservice.controller;

import com.geekymon2.carmarketplace.carinfoservice.entities.CarMake;
import com.geekymon2.carmarketplace.carinfoservice.entities.CarModel;
import com.geekymon2.carmarketplace.carinfoservice.models.CarMakeDto;
import com.geekymon2.carmarketplace.carinfoservice.models.CarModelDto;
import com.geekymon2.carmarketplace.carinfoservice.serviceimpl.CarInfoServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/car")
public class CarInfoController {

    private CarInfoServiceImpl service;
    private ModelMapper mapper;

    public CarInfoController(CarInfoServiceImpl service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping(value = "/makes")
    public List<CarMakeDto> getCarMakes() {
        return service.getAllCarMakes().stream().map(this::makeToDto).collect(Collectors.toList());
    }

    @GetMapping(value = "/makes/{id}")
    public CarMakeDto getCarMakeById(@PathVariable("id") long id) {
        return makeToDto(service.getCarMakeById(id));
    }

    @GetMapping(value = "/makes/count")
    public ResponseEntity<Long> getCarMakesCount() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getCarMakesCount());
    }

    @GetMapping(value = "/models")
    public List<CarModelDto> getCarModelsByMakeAndType(String make, String type) {
        if (make != null || type != null) {
            return service.getCarModels(make, type).stream().map(this::modelToDto).collect(Collectors.toList());
        }
        else {
            return service.getAllCarModels().stream().map(this::modelToDto).collect(Collectors.toList());
        }
    }

    @GetMapping(value = "/models/{id}")
    public CarModelDto getCarModels(@PathVariable("id") long id) {
        return modelToDto(service.getCarModelById(id));
    }

    private CarMakeDto makeToDto(CarMake make) {
        return mapper.map(make, CarMakeDto.class);
    }

    private CarModelDto modelToDto(CarModel model) {
        CarModelDto dto = mapper.map(model, CarModelDto.class);
        dto.setId(model.getId());
        dto.setType(model.getModelType().toString());
        return dto;
    }    
}
