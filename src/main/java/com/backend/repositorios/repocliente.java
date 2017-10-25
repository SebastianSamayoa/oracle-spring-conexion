/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.repositorios;

import com.backend.entidades.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 *
 * @author jhoan
 */
public interface repocliente extends PagingAndSortingRepository<Cliente, Integer>, QueryByExampleExecutor<Cliente>{
    
}
