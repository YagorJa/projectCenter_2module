package by.ankudovich.center.controller;
import by.ankudovich.center.api.service.ServiceCreateRequest;

import by.ankudovich.center.api.service.ServiceResponse;
import by.ankudovich.center.service.interf.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@RequiredArgsConstructor
@RequestMapping("services")
public class ServiceRestControler {

    private final ServiceService serviceService;

    @PostMapping
    public ServiceResponse addService(@RequestBody ServiceCreateRequest createRequest) {
        return serviceService.addService(createRequest);
    }

    @GetMapping
    public Collection<ServiceResponse> services() {
        return serviceService.getServices();
    }


}