package com.geekymon2.carmarketplace.carinfoservice.controller;

import com.geekymon2.carmarketplace.carinfoservice.models.CarMakeDto;
import com.geekymon2.carmarketplace.carinfoservice.models.CarModelDto;
import com.geekymon2.carmarketplace.carinfoservice.serviceimpl.CarInfoServiceImpl;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@AutoConfigureTestDatabase
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
public class CarInfoControllerIntegrationTest {
    private final CarInfoController controller;

    @Autowired
    public CarInfoControllerIntegrationTest(CarInfoServiceImpl service, ModelMapper mapper) {
        this.controller = new CarInfoController(service, mapper);
    }

    @Test
    void testGetCarMakeById() {
        CarMakeDto actual = controller.getCarMakeById(1L);
        CarMakeDto expected = new CarMakeDto(1l, "FORD", "USA");
        assertThat(expected.equals(actual)).isTrue();
    }

    @Test
    void testGetCarMakes() {
        List<CarMakeDto> actual = controller.getCarMakes();
        List<CarMakeDto> expected = generateValidMakeData();
        assertThat(expected.equals(actual)).isTrue();
    }

    @Test
    void testGetCarMakesCount() {

    }

    @Test
    void testGetCarModels() {
        List<CarModelDto> actual = controller.getCarModelsByMakeAndType(null, null);
        List<CarModelDto> expected = generateValidModelsData();
        assertThat(expected.equals(actual)).isTrue();
    }

    @Test
    void testGetCarModelsByMakeAndType() {

    }

    //* This needs to match the make data in data.sql for the integration tests to be successful.
    private List<CarMakeDto> generateValidMakeData() {
        List<CarMakeDto> makes = new ArrayList<>();
        makes.add(new CarMakeDto(1L,"FORD","USA"));
        makes.add(new CarMakeDto(2L,"AUDI","Germany"));
        return makes;
    }

    //* This needs to match the make data in data.sql for the integration tests to be successful.
    private List<CarModelDto> generateValidModelsData() {
        List<CarModelDto> models = new ArrayList<>();
        CarMakeDto ford = new CarMakeDto(1L,"FORD","USA");
        CarMakeDto audi = new CarMakeDto(2L,"AUDI","Germany");

        models.add(new CarModelDto(1L, "Ford Falcon", "SEDAN"));
        models.add(new CarModelDto(2L, "Ford Focus Sedan", "SEDAN"));
        models.add(new CarModelDto(3L, "Ford Focus Hatch", "HATCHBACK"));
        models.add(new CarModelDto(4L, "Ford Puma", "SUV"));

        models.add(new CarModelDto(5L, "Audi A4 Sedan", "SEDAN"));
        models.add(new CarModelDto(6L, "Audi S4 Sedan", "SEDAN"));
        models.add(new CarModelDto(7L, "Audi A6 Sedan", "SEDAN"));
        models.add(new CarModelDto(8L, "Audi Q2", "SUV"));

        return models;
    }
}
