package by.ankudovich.center.mapper;

import by.tms.sportcenter.api.service.ServiceCreateRequest;
import by.tms.sportcenter.api.service.ServiceResponse;
import by.tms.sportcenter.api.service.ServiceUpdateRequest;
import by.tms.sportcenter.entity.Service;
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
