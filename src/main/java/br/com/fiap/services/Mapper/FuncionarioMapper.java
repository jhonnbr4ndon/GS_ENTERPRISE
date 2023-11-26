package br.com.fiap.services.Mapper;

import br.com.fiap.controllers.dto.FuncionarioDTO;
import br.com.fiap.entities.Funcionario;

public class FuncionarioMapper {

    public static Funcionario toEntity(FuncionarioDTO funcionarioDTO) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(funcionarioDTO.getNome());
        funcionario.setCpf(funcionarioDTO.getCpf());
        funcionario.setData(funcionarioDTO.getData());
        funcionario.setCep(funcionarioDTO.getCep());
        return funcionario;
    }

    public static FuncionarioDTO toDTO(Funcionario entity) {
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        funcionarioDTO.setNome(entity.getNome());
        funcionarioDTO.setCpf(entity.getCpf());
        funcionarioDTO.setData(entity.getData());
        funcionarioDTO.setCep(entity.getCep());
        return  funcionarioDTO;
    }
}
