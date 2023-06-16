package pro.sky.shopbasket.Service;

import pro.sky.shopbasket.Item.Item;

import java.util.Collection;

public interface BasketService {

    Item add(Integer item);

    Collection<Item> get();
}
