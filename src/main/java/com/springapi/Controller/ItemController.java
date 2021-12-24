package com.springapi.Controller;

import com.springapi.Model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    List<Item> itemList = new ArrayList<>();

    public ItemController() {
        itemList.add(new Item("Air", 10));
        itemList.add(new Item("Brush", 20));
        itemList.add(new Item("Candy", 30));
    }

    @GetMapping("/getitem")
    public Item getItem(@RequestParam int idx) {
        return itemList.get(idx);
    }

    @PutMapping("/putitem")
    public Boolean putItem(@RequestParam int idx, @RequestBody Item item) {
        if (idx < itemList.size()) {
            itemList.get(idx).setName(item.Name);
            itemList.get(idx).setQuantity(item.Quantity);
           return true;
        }
        else
            return false;
    }

    @PostMapping("/postitem")
    public Boolean postItem(@RequestBody Item item) {
        itemList.add(item);
        return true;
    }

    @DeleteMapping("deleteitem")
    public Boolean deleteItem(@RequestParam int idx) {
        if (idx < itemList.size()) {
            itemList.remove(idx);
            return true;
        }
        else
            return false;
    }
}
