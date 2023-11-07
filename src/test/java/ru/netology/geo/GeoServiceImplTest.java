package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Location;

public class GeoServiceImplTest {
    @Test
    void testByIp() {
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp("127.0.0.1");
        Location expected = new Location(null, null, null, 0);
        Assertions.assertEquals(expected, actual);

    }
}