package com.krizelrika.Controller;

import com.krizelrika.SoftwareEngineer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/softwareEngineer")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(1, "Jean", "js, node, java"),
                new SoftwareEngineer(2, "Leah", "js, node, python, spring")
        );
    }
}
