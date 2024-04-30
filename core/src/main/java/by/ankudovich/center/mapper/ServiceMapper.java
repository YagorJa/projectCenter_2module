package by.ankudovich.center.mapper;

import by.ankudovich.center.api.service.ServiceCreateRequest;
import by.ankudovich.center.api.service.ServiceResponse;
import by.ankudovich.center.api.service.ServiceUpdateRequest;
import by.ankudovich.center.entity.Service;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
@Mapper(componentModel = "spring")
public interface ServiceMapper {
    ServiceResponse toResponse(Service service);
    Service toEntity(ServiceCreateRequest serviceCreateRequest);

    //    @Mapping(target = "id", ignore = true)
    void updateService(@MappingTarget Service service, ServiceUpdateRequest serviceUpdateRequest);
}