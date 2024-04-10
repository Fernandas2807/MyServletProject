package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.StudentDto;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Dhanush");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public String insertdata(StudentDto SDTO) {
		entityTransaction.begin();
		entityManager.persist(SDTO);
		entityTransaction.commit();
		return "Data inserted sccuessfully";
	}
	public StudentDto fetchById(int id) {
		StudentDto studentDto=entityManager.find(StudentDto.class, id);
				return studentDto;
	}

	
	public List<StudentDto> fetchAll() {
		Query q=entityManager.createQuery("select var from StudentDto var");
		List<StudentDto> list=q.getResultList();
		return list;
		
	}
		public String deleteById(int id) {
			StudentDto studentDto=entityManager.find(StudentDto.class, id);
				if(studentDto!=null) {
					entityTransaction.begin();
					entityManager.remove(studentDto);
					entityTransaction.commit();
					return "data is deleted";
				}
				else {
					return "No data is found";
					
					
				}
		}
		
		public String deleteAll() 
		{
			
			Query q=entityManager.createQuery("select var from StudentDto var");
			List<StudentDto> list=q.getResultList();
			
			if(list.isEmpty()) 
			{
				return "no data is found";
			}
			else 
			{
				for(StudentDto var : list) 
				{
					entityTransaction.begin();
					entityManager.remove(var);
					entityTransaction.commit();
				}
				return "data is deleted";
			}
		}
}