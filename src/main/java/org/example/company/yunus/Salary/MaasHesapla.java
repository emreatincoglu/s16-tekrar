package org.example.company.yunus.Salary;

import org.example.company.yunus.Employee;
import org.example.company.yunus.Interfaces.MaasHesaplayici;

public class MaasHesapla implements MaasHesaplayici{

    @Override
    public double hesapla(Employee employee){
     double brutMaas = employee.getSalary() * employee.getTitle().getMaasKatsayisi();
     double alinacakVergi = brutMaas * taxRate;
     employee.setSalary(brutMaas - alinacakVergi);

        return brutMaas - alinacakVergi;
    }
}
