package com.store.api.service;

import com.store.api.domain.Customer;
import com.store.api.dto.CustomerResponse;
import com.store.api.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CustomerService {

    private final ClientRepository clientRepository;

    public void create(Customer customer) {
        clientRepository.save(customer);
    }

    public List<CustomerResponse> getCustomers(Integer pageNo, Integer pageSize) {
        Sort sort = Sort.by("id").descending();
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return clientRepository.findAll(pageable).getContent().stream().map(CustomerResponse::converter).collect(Collectors.toList());
    }

}
