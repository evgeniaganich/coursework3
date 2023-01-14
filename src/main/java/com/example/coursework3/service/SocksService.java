package com.example.coursework3.service;

import com.example.coursework3.dto.SockRequest;
import com.example.coursework3.model.Color;
import com.example.coursework3.model.Size;
import com.example.coursework3.model.Socks;
import org.springframework.stereotype.Service;

@Service
public interface SocksService {

    void addSocks(SockRequest sockRequest);

    void decreaseSocks(SockRequest sockRequest);


    int getSocksQuantity(Color color, Size size, Integer cottonMin, Integer cottonMax);

    void validateRequest(SockRequest sockRequest);

    Socks mapToSocks(SockRequest sockRequest);
}
