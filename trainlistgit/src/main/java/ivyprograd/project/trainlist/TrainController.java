package ivyprograd.project.trainlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/trains")
public class TrainController {
    @Autowired
    private TrainService service;
    @GetMapping("/getlist")
    public
    List<Train> getDetails() {
        return service.getTrains();
    }

}
