package br.com.fiap.services.Mapper;

import br.com.fiap.controllers.dto.BeneficiarioDTO;
import br.com.fiap.entities.Beneficiario;

public class BeneficiarioMapper {

    public static Beneficiario toEntity(BeneficiarioDTO beneficiarioDTO) {
        Beneficiario beneficiario = new Beneficiario();
        beneficiario.setNome(beneficiarioDTO.getNome());
        beneficiario.setEmail(beneficiarioDTO.getEmail());
        beneficiario.setCpf(beneficiarioDTO.getCpf());
        beneficiario.setData(beneficiarioDTO.getData());
        beneficiario.setCep(beneficiarioDTO.getCep());
        beneficiario.setSenha(beneficiarioDTO.getSenha());
        return beneficiario;
    }

    public static BeneficiarioDTO toDTO(Beneficiario entity) {
        BeneficiarioDTO beneficiarioDTO = new BeneficiarioDTO();
        beneficiarioDTO.setNome(entity.getNome());
        beneficiarioDTO.setEmail(entity.getEmail());
        beneficiarioDTO.setCpf(entity.getCpf());
        beneficiarioDTO.setData(entity.getData());
        beneficiarioDTO.setCep(entity.getCep());
        beneficiarioDTO.setSenha(entity.getSenha());
        return  beneficiarioDTO;
    }

}
