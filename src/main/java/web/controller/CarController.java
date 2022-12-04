package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "numb", required = false) int numb, Model model) {
        if (numb > 0 && numb < 5) {
            model.addAttribute("cars", carService.getCars(numb));
        } else {
            model.addAttribute("cars", carService.getAllCars());
        }
        return "cars";
    }
}
