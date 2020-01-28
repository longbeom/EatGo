package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.MenuItem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MenuItemServiceTests {

    private MenuItemService menuItemService;

    @Test
    public void bulkUpdate() {
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        menuItemService.bulkUpdate(1L, menuItems);
    }
}