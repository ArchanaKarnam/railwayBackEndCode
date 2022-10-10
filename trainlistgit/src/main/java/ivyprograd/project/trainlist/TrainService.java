package ivyprograd.project.trainlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    @Autowired
    private TrainRepository repo;
    public List<Train> getTrains() {
        return repo.findAll();
    }
}
