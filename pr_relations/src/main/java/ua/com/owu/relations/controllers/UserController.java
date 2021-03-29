package ua.com.owu.relations.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.owu.relations.dao.UserDAO;
import ua.com.owu.relations.models.Car;
import ua.com.owu.relations.models.Product;
import ua.com.owu.relations.models.User;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserDAO userDAO;

    @GetMapping()
        public List<User> getUsers() {
        return userDAO.findAll();
        }


    @GetMapping("/save")
    public void save() {
        User user = new User();
        user.setName("petro");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("bread"));
        productList.add(new Product("milk"));
        user.setProducts(productList);


        userDAO.save(user);
    }


    @GetMapping("/saveWithCars")
    public void saveWithCars() {

        User user  = new User("Anna");

        List<Car> cars = new ArrayList<>(); //Create List Car
        cars.add(new Car("Opel")); // Наповнюємо масив
        cars.add(new Car("Mazda"));
        user.setCars(cars);
        userDAO.save(user);
    }
}
