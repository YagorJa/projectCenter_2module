package by.ankudovich.center.api.service;

import lombok.Data;

@Data
public class ServiceUpdateRequest extends ServiceCreateRequest {
    private Long id;
}
