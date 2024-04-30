package by.ankudovich.center.service.interf;

import by.ankudovich.center.api.service.ServiceCreateRequest;
import by.ankudovich.center.api.service.ServiceResponse;
import by.ankudovich.center.api.service.ServiceUpdateRequest;

import java.time.LocalDate;
import java.util.Collection;

public interface ServiceService {

    ServiceResponse addService(ServiceCreateRequest createRequest);

    ServiceResponse getServiceById(Long id);

    Collection<ServiceResponse> getServices();

    void deleteService(Long id);

    ServiceResponse updateBrand(ServiceUpdateRequest updateRequest);

}
