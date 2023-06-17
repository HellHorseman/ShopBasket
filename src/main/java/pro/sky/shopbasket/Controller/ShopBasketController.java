package pro.sky.shopbasket.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shopbasket.Item.Item;
import pro.sky.shopbasket.Service.BasketService;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class ShopBasketController {
    private final BasketService service;

    public ShopBasketController(BasketService service) {
        this.service = service;
    }

    @RequestMapping("/add")
    public Item addItem(@RequestParam Integer item) {
        return service.add(item);
    }

    @RequestMapping("/get")
    public Collection<Item> getItem() {
        return service.get();
    }
}
