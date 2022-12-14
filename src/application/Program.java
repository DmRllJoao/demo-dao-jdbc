package application;

import java.util.Date;

import model.dao.ComposicaoExameDao;
import model.dao.ConsultaMedicaDao;
import model.dao.DaoFactory;
import model.entities.ComposicaoExame;
import model.entities.ConsultaMedica;
import model.entities.Medico;
import model.entities.Paciente;

public class Program {

	public static void main(String[] args) {
		
		ConsultaMedicaDao consultamedicaDao = DaoFactory.createConsultaMedicaDao();
		
		ConsultaMedica consultamedica = consultamedicaDao.findById(2);
				
		System.out.println(consultamedica);
		
		
		//ConsultaMedica consultamedica = new ConsultaMedica(23, new Date(), null, null, null);
		//System.out.println(consultamedica);
		
		
	}

}
