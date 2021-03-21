package com19.midterm.cs208midterm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/datalar")

public class DatalarController {
    @Autowired
    private DatalarRepository datalarRepository;
    @PostMapping("/add")
    public @ResponseBody String addNewprojctdata(@RequestBody Datalar user) {
        datalarRepository.save(user); // insert into users values (name, email);
        return "OK";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Datalar> getAllDatalar() {
        return datalarRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Datalar one(@PathVariable Integer id) {
        return datalarRepository.findById(id).orElseThrow(() -> new DatalarNotFoundException(id));
    }

    @PutMapping("/{id}")
    public @ResponseBody Datalar put(@RequestBody Datalar replaceDatalar, @PathVariable Integer id) {
        return datalarRepository.findById(id).map(datalar -> {
            datalar = replaceDatalar;
            datalar.setId(id);
            return datalarRepository.save(datalar);
        }).orElseThrow(() -> new DatalarNotFoundException(id));
    }
    @DeleteMapping("/{id}")
    void del(@PathVariable Integer id) {
        datalarRepository.deleteById(id);
    }
}
