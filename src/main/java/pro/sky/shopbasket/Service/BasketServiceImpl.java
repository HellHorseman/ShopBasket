package pro.sky.shopbasket.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.shopbasket.Item.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    private final List<Item> items;

    public BasketServiceImpl() {
        this.items = new ArrayList<>();
    }

    @Override
    public Item add(Integer item) {
        return new Item(new Item(item).setItem());
    }

    @Override
    public Collection<Item> get() {
        return Collections.unmodifiableCollection(items);

    }
}
