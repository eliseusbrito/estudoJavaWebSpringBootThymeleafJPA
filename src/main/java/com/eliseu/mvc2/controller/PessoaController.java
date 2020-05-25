package com.eliseu.mvc2.controller;

import com.eliseu.mvc2.model.Pessoa;
import com.eliseu.mvc2.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepository;

    @RequestMapping(method = RequestMethod.GET,value = "/cadastropessoa")
    public String inicio(){
        return "cadastro/cadastropessoa";
    }

    @RequestMapping(method = RequestMethod.POST, value="/salvarpessoa")
    public String salvar(Pessoa pessoa){
        pessoaRepository.save(pessoa);

        return "cadastro/cadastropessoa";
    }

    @RequestMapping(method = RequestMethod.GET, value= "/listapessoas" )
    public ModelAndView pessoas(){
        ModelAndView andView = new ModelAndView("cadastro/cadastropessoa");
        Iterable<Pessoa> pessoasIt = pessoaRepository.findAll();
        andView.addObject("pessoas", pessoasIt);
        return andView;

    }


}
