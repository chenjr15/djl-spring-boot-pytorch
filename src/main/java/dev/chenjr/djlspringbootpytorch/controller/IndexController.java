package dev.chenjr.djlspringbootpytorch.controller;

import dev.chenjr.djlspringbootpytorch.dto.RestResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SecurityRequirements
@Tag(name = "首页", description = "Spring boot Pytorch")
public class IndexController {


  @GetMapping("/")
  @Operation(description = "Hello world！")
  public RestResponse<String> index(@RequestParam(value = "name", defaultValue = "World") String name) {
    return RestResponse.okWithData(String.format("Hello %s!", name));
  }


}
