package com.example.administracion.Services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

<<<<<<< HEAD
=======
import java.sql.Time;
>>>>>>> f908e9a2a46fd677166a7c78da7a9aa913602964
import java.util.ArrayList;
import java.util.Optional;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.administracion.Models.Empresa;
import com.example.administracion.Repositories.EmpresaRepository;

public class EmpresaServiceTest {

    @Mock
    EmpresaRepository empresaRepository;

    @InjectMocks
    EmpresaService empresaService;
    Empresa empresa;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        empresa = new Empresa();
    }

    @Test
    public void obtenerEmpresas(){
        ArrayList<Empresa> empresas = new ArrayList<>();
        empresas.add(empresa);
        when(empresaRepository.findAll()).thenReturn(empresas);
        assertNotNull(empresaService.obtenerEmpresas());
    }
    @Test
    public void getEmpresaById() {
        when(empresaRepository.findById(anyLong())).thenReturn(Optional.of(empresa));
        assertNotNull(empresaService.getEmpresaById());
    }

    @Test
    public void obtenerEmpresas(){
        ArrayList<Empresa> empresaArrayList = new ArrayList<>();

        when(empresaRepository.findAll()).thenReturn(empresaArrayList);
        assertNotNull(empresaService.obtenerEmpresas());
    }

    @Test
    public void obtenerEmpresaId(){
        when(empresaRepository.findById(anyLong())).thenReturn(Optional.of(empresa));
        assertNotNull(empresaService.obtenerEmpresaId(anyLong()));
    }

    @Test
    public void actualizarEmpresa(){
        when(empresaRepository.save(empresa)).thenReturn(empresa);
        assertNotNull(empresaService.actualizarEmpresa(empresa));
    }

    @Test
    public void getHoraEntredaEmpresa(){
        when(empresaRepository.findById(anyLong())).thenReturn(Optional.of(empresa));
        assertSame(empresaService.getHoraEntredaEmpresa(), null);
    }

}
