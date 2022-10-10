package ivyprograd.project.ordersrailway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/auth")
public class BookingOrderController {
    @Autowired
    private BookingOrderRepository bookrepository;

    @PostMapping("/addOrder")
    public String saveBook(@RequestBody BookingOrder book) {
        bookrepository.save(book);
        return "Booked ticket with id :  " + book.getTrainid();
    }

    @GetMapping("/{id}")
    public Optional<BookingOrder> getBook(@PathVariable long trainid){
        return bookrepository.findById(trainid);
    }
    @PutMapping("/update/{id}")
    public BookingOrder updateOrder(@PathVariable("id") long trainid,@RequestBody BookingOrder order ) {
        order.setTrainid(trainid);
        bookrepository.save(order);
        return order;
    }

    @DeleteMapping("/del/{id}")
    public String deleteOrder (@PathVariable long id) {
        bookrepository.deleteById(id);
        return "Order deleted with id : "+id;
    }
}
