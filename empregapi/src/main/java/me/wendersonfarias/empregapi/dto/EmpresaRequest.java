package me.wendersonfarias.empregapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmpresaRequest {

  @NotBlank(message = "O nome da empresa é obrigatório.")
  private String nome;

  @NotBlank(message = "O CNPJ da empresa é obrigatório.")
  @Size(min = 14, max = 14, message = "O CNPJ deve conter 14 dígitos.")
  private String cnpj;

  private String description;

  private String website;

  @NotBlank(message = "O e-mail é obrigatório.")
  @Email(message = "Formato de e-mail inválido.")
  private String email;

  @NotBlank(message = "A senha é obrigatória.")
  @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres.")
  private String senha;
}