package com.boot;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class ShipwreckControllerTest {
    @InjectMocks
    private ShipwreckController sc;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet(){
        Shipwreck sw = new Shipwreck();
        sw.setId(1l);
        when(shipwreckRepository.findOne(1l)).thenReturn(sw);

        Shipwreck wreck = sc.get(1L);
//        assertEquals(1l, wreck.getId().longValue());
        assertThat(wreck.getId(), is(1l));

    }



//    @Before
//    public void setUp() {
//        Employee alex = new Employee("alex");
//
//        Mockito.when(employeeRepository.findByName(alex.getName()))
//                .thenReturn(alex);
//    }
//
//    @Test
//    public void whenValidName_thenEmployeeShouldBeFound() {
//        String name = "alex";
//        Employee found = employeeService.getEmployeeByName(name);
//
//        assertThat(found.getName())
//                .isEqualTo(name);
//    }

}
