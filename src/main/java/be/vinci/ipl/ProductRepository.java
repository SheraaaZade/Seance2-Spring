package be.vinci.ipl;

import org.springframework.data.repository.CrudRepository;

//c'est le DAO
public interface ProductRepository extends CrudRepository<Product, String> {
}
