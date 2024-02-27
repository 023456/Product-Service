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
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
@EnableAsync
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

//		Category category = new Category();
//		category.setName("Electronics");
//		Category savedCategory= categoryRepo.save(category);
//
//		Category category1 = new Category();
//		category1.setName("Clothing");
//		Category savedCategory1= categoryRepo.save(category1);
//
//		Price price = new Price(129000.0  ,"INR");
//		Price savedprice = priceRepo.save(price);
//		Price price1 = new Price(80000.0  ,"INR");
//		Price savedprice1 = priceRepo.save(price1);
//
//		Product product = new Product();
//		product.setTitle("iPhone4");
//		product.setImage("image url");
//		product.setDescription("Best phone ever");
//		product.setCategory(savedCategory);
//		product.setPrice(savedprice);
//		productRepo.save(product);
//
//
//		Product product1 = new Product();
//		product1.setTitle("woman wear");
//		product1.setImage("image url");
//		product1.setDescription("Best dres");
//		product1.setCategory(savedCategory1);
//		product1.setPrice(savedprice1);
//		productRepo.save(product1);



////		product.setPrice(1000);


////		Product product1 = productRepo.findByTitle("iPhone4");
////		Product product1 = productRepo.findByTitleAndPrice_currency("iPhone4", )
//		System.out.println("DEBUG");
////		System.out.println(product1);
//		product.setTitle("iPhone3");
//		product.setImage("image url");
//		product.setDescription("Best phone ever");
//		product.setCategory(savedCategory);
//		product.setPrice(savedprice);
//		productRepo.save(product);

//		Orders order = new Orders();
//		List<Product> products = productRepo.findAll();
//			order.setProductList(products);
//		Orders savedOrder = orderRepo.save(order);


//		Optional<Category> categoryOptional = categoryRepo.findById(UUID.fromString("9cd36deb-c96c-46c4-9ab1-88ed189a911b"));
//
//		if(!categoryOptional.isEmpty()){
//			Category category1 = categoryOptional.get();
//			System.out.println(category1.getProductList());
//
//		}

//		productRepo.deleteById(UUID.fromString("f04f00a8-a21b-4a46-8989-d5129865946c"));


//		Optional<Category> categoryOptional = categoryRepo.findById(UUID.fromString("27c3ba8d-f413-4c45-bcc1-aea4d06ec42e"));
//
//		Category category1 = categoryOptional.get();
//		 System.out.println(category1);
//         List<Product> products = category1.getProductList();
//		 System.out.println(products);
	}
}
