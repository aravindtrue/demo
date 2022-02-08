package com.example.demo.controller;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


@DgsComponent
@RequiredArgsConstructor
public class SampleController {

  @DgsQuery
  public boolean vehicles(@RequestParam(defaultValue = "0") int pageNumber,
      @RequestParam(defaultValue = "25") int pageSize) {
    return true;
  }
}
