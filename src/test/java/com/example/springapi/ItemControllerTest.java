package com.example.springapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemControllerTest {

    ItemController itemController;

    ItemControllerTest() {
        itemController = new ItemController();
    }

    @Test
    void getItem() {
        Item actual = itemController.getItem(0);
        Item expected = new Item("Air", 10);
        assertEquals(actual.Name, expected.Name);
        assertEquals(actual.Quantity, expected.Quantity);
    }


    @Test
    void putItem() {
        Boolean actual = itemController.putItem(0, new Item("Stick", 20));
        Boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void postItem() {
        Boolean actual = itemController.postItem(new Item("Carrot", 40));
        Boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void deleteItem() {
        Boolean actual = itemController.deleteItem(2);
        Boolean expected = true;
        assertEquals(actual, expected);
    }
}