package com.ProductService.Product.Services;


import com.ProductService.Product.Services.inheritanceexample.joinedtable.Mentor;
import com.ProductService.Product.Services.inheritanceexample.joinedtable.MentorRepository;
import com.ProductService.Product.Services.inheritanceexample.joinedtable.StudentRepo;
import com.ProductService.Product.Services.models.Category;
import com.ProductService.Product.Services.models.Orders;
import com.ProductService.Product.Services.models.Price;
import com.ProductService.Product.Services.models.Product;
import com.ProductService.Product.Services.repositories.CategoryRepo;
import com.ProductService.Product.Services.repositories.OrderRepo;
import com.ProductService.Product.Services.repositories.PriceRepo;
import com.ProductService.Product.Services.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductServicesApplication implements CommandLineRunner {

//	private MentorRepository mentorRepository;
//	private StudentRepo studentRepo;

	private CategoryRepo categoryRepo;
	private ProductRepo productRepo;
	private PriceRepo priceRepo;
	private OrderRepo orderRepo;



	public ProductServicesApplication(CategoryRepo categoryRepo , ProductRepo productRepo ,
									  PriceRepo priceRepo , OrderRepo orderRepo) {
	this.categoryRepo = categoryRepo;
	this.productRepo = productRepo;
	this.priceRepo = priceRepo;
	this.orderRepo = orderRepo;

	}


	public static void main(String[] args) {

		SpringApplication.run(ProductServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Mentor mentor = new Mentor();
//		mentor.setName("fatema");
//		mentor.setEmail("fatema@gmail.com");
//		mentor.setAvg_rating(98.0);
//		mentorRepository.save(mentor);


//		User user = new User();
//		user.setId(3L);
//		user.setName("Hasan");
//		user.setEmail("hasan@gmail.com");
//	    userRepo.save(user);
//
//
//		Student student = new Student();
//		student.setId(2L);
//		student.setName("meera");
//		student.setEmail("m@gmail.com");
//		student.setBatch("batch1");
//		student.setPsp(99.0);
//		studentRepo.save(student);
//
//		List<User> users = userRepo.findAll();
//		users.forEach(user2 -> {
//			System.out.println(user2.getName());
//		});

//		Mentor mentor = new Mentor();
//		mentor.setName("Zainab");
//		mentor.setEmail("zainab@gmail.com");
//		mentor.setAvg_rating(4.7);
//		mentor.setId(5L);
//		mentorRepository.save(mentor);

		Category category = new Category();
		category.setName("electronics");
		Category savedCategory= categoryRepo.save(category);

		Product product = new Product();
		Price price = new Price(99.0 ,"INR");
		Price savedprice = priceRepo.save(price);

		product.setTitle("iPhone4");
		product.setImage("image url");
		product.setDescription("Best phone ever");
		product.setCategory(savedCategory);
//		product.setPrice(1000);
		product.setPrice(savedprice);
	    productRepo.save(product);
//		Product product1 = productRepo.findByTitle("iPhone4");
//		Product product1 = productRepo.findByTitleAndPrice_currency("iPhone4", )
		System.out.println("DEBUG");
//		System.out.println(product1);

		Orders order = new Orders();
		List<Product> products = productRepo.findAll();
			order.setProductList(products);
		Orders savedOrder = orderRepo.save(order);


//		Optional<Category> categoryOptional = categoryRepo.findById(UUID.fromString("9cd36deb-c96c-46c4-9ab1-88ed189a911b"));
//
//		if(!categoryOptional.isEmpty()){
//			Category category1 = categoryOptional.get();
//			System.out.println(category1.getProductList());
//
//		}

//		productRepo.deleteById(UUID.fromString("f04f00a8-a21b-4a46-8989-d5129865946c"));


	}
}
