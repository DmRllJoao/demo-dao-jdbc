package application;

import java.util.Date;

import model.dao.ComposicaoExameDao;
import model.dao.DaoFactory;
import model.entities.ComposicaoExame;
import model.entities.ConsultaMedica;
import model.entities.Medico;
import model.entities.Paciente;

public class Program {

	public static void main(String[] args) {
		
		ComposicaoExameDao composicaoexameDao = DaoFactory.createComposicaoExameDao();
		
		ComposicaoExame composicaoexame = composicaoexameDao.findById(2);
				
		System.out.println(composicaoexame);
		
		
		//ConsultaMedica consultamedica = new ConsultaMedica(23, new Date(), null, null, null);
		//System.out.println(consultamedica);
		
		
	}

}
