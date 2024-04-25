// package com.sheryians.major.controller;

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.multipart.MultipartFile;

// import com.sheryians.major.dto.ProductDTO;
// import com.sheryians.major.model.Category;
// import com.sheryians.major.model.Product;
// import com.sheryians.major.service.CategoryService;
// import com.sheryians.major.service.ProductService;
// import com.sheryians.major.factory.ProductFactory;

// import java.nio.file.Path;

// @Controller
// public class AdminController {
//     public static String uploadDir=System.getProperty("user.dir")+"/src/main/resources/static/productImages";
//     @Autowired
//     CategoryService categoryService;
//     @Autowired
//     ProductService productService;
//     @Autowired
//     ProductFactory productFactory;

//     @GetMapping("/admin")
//     public String adminHome() {
//         return "adminHome";
//     }
    
//     @GetMapping("/admin/categories")
//     public String getCat(Model model) {
//         model.addAttribute("categories", categoryService.getAllCategory());
//         return "categories";
//     }

//     @GetMapping("/admin/categories/add")
//     public String getCatAdd(Model model) {
//         model.addAttribute("category", new Category());
//         return "categoriesAdd";
//     }

//     @PostMapping("/admin/categories/add")
//     public String postCatAdd(@ModelAttribute("category") Category category) {
//         categoryService.addCategory(category);
//         return "redirect:/admin/categories";
//     }

//     @GetMapping("/admin/categories/delete/{id}")
//     public String deleteCat(@PathVariable int id) {
//         categoryService.removeCategoryById(id);
//         return "redirect:/admin/categories";
//     }

//     @GetMapping("/admin/categories/update/{id}")
//     public String updateCat(@PathVariable int id,Model model) {
//         Optional<Category> category=categoryService.getCategoryById(id);
//         if(category.isPresent()){
//             model.addAttribute("category", category.get());
//             return "categoriesAdd";
//         }
//         else{
//             return "404";
//         }
//     }

//     @GetMapping("/admin/products")
//     public String getProduct(Model model) {
//         model.addAttribute("products", productService.getAllProduct());
//         return "products";
//     }
    
//     @GetMapping("/admin/products/add")
//     public String getProductAdd(Model model) {
//         model.addAttribute("productDTO", new ProductDTO());
//         model.addAttribute("categories", categoryService.getAllCategory());
//         return "productsAdd";
//     }
//     @PostMapping("/admin/products/add")
//     public String productAddPost(@ModelAttribute("productDTO") ProductDTO productDTO,
//                                 @RequestParam("productImage") MultipartFile file,
//                                 @RequestParam("imgName") String imgName) throws IOException {
//         // Use the factory design pattern to create Product instances
//         Product product = productFactory.createProduct(productDTO);        
//         String imageUUID;

//         if(!file.isEmpty()){
//             imageUUID=file.getOriginalFilename();
//             Path fileNameAndPath=Paths.get(uploadDir,imageUUID);
//             Files.write(fileNameAndPath,file.getBytes());
//         }
//         else{
//             imageUUID = imgName;
//         }
//         product.setImageName(imageUUID);
//         productService.addProduct(product);

//         return "redirect:/admin/products";
//     }

//     @GetMapping ("/admin/product/delete/{id}")
//     public String deleteProduct(@PathVariable long id){
//         productService.removeProductsById(id);
//         return  "redirect:/admin/products";
//     }
// @GetMapping("/admin/product/update/{id}")
// public String updateProductGet(@PathVariable long id, Model model) {
//     Product product = productService.getProductById(id).get();
//     ProductDTO productDTO = new ProductDTO();
//     productDTO.setId(product.getId());
//     productDTO.setName(product.getName());
//     productDTO.setCategoryId(product.getCategory().getId());
//     // productDTO.setWeight(product.getWeight());
//     productDTO.setDescription(product.getDescription());
//     productDTO.setImageName(product.getImageName());
//     model.addAttribute("categories", categoryService.getAllCategory());
//     model.addAttribute("productDTO", productDTO);



//     return "productsAdd";
// }
// }



package com.sheryians.major.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sheryians.major.dto.ProductDTO;
import com.sheryians.major.model.Category;
import com.sheryians.major.model.Product;
import com.sheryians.major.service.CategoryService;
import com.sheryians.major.service.ProductService;
import com.sheryians.major.factory.ProductFactory;

import java.nio.file.Path;

@Controller
public class AdminController {
    public static String uploadDir=System.getProperty("user.dir")+"/src/main/resources/static/productImages";
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @Autowired
    ProductFactory productFactory;

    @GetMapping("/freelancer")
    public String freelancerHome() {
        return "adminHome"; // Assuming "adminHome" is the freelancer's home page
    }
    
    @GetMapping("/freelancer/categories")
    public String getCat(Model model) {
        model.addAttribute("categories", categoryService.getAllCategory());
        return "categories";
    }

    @GetMapping("/freelancer/categories/add")
    public String getCatAdd(Model model) {
        model.addAttribute("category", new Category());
        return "categoriesAdd";
    }

    @PostMapping("/freelancer/categories/add")
    public String postCatAdd(@ModelAttribute("category") Category category) {
        categoryService.addCategory(category);
        return "redirect:/freelancer/categories";
    }

    @GetMapping("/freelancer/categories/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        categoryService.removeCategoryById(id);
        return "redirect:/freelancer/categories";
    }

    @GetMapping("/freelancer/categories/update/{id}")
    public String updateCat(@PathVariable int id,Model model) {
        Optional<Category> category=categoryService.getCategoryById(id);
        if(category.isPresent()){
            model.addAttribute("category", category.get());
            return "categoriesAdd";
        }
        else{
            return "404";
        }
    }

    @GetMapping("/freelancer/products")
    public String getProduct(Model model) {
        model.addAttribute("products", productService.getAllProduct());
        return "products";
    }
    
    @GetMapping("/freelancer/products/add")
    public String getProductAdd(Model model) {
        model.addAttribute("productDTO", new ProductDTO());
        model.addAttribute("categories", categoryService.getAllCategory());
        return "productsAdd";
    }
    @PostMapping("/freelancer/products/add")
    public String productAddPost(@ModelAttribute("productDTO") ProductDTO productDTO,
                                @RequestParam("productImage") MultipartFile file,
                                @RequestParam("imgName") String imgName) throws IOException {
        // Use the factory design pattern to create Product instances
        Product product = productFactory.createProduct(productDTO);        
        String imageUUID;

        if(!file.isEmpty()){
            imageUUID=file.getOriginalFilename();
            Path fileNameAndPath=Paths.get(uploadDir,imageUUID);
            Files.write(fileNameAndPath,file.getBytes());
        }
        else{
            imageUUID = imgName;
        }
        product.setImageName(imageUUID);
        productService.addProduct(product);

        return "redirect:/freelancer/products";
    }

    @GetMapping ("/freelancer/product/delete/{id}")
    public String deleteProduct(@PathVariable long id){
        productService.removeProductsById(id);
        return  "redirect:/freelancer/products";
    }
@GetMapping("/freelancer/product/update/{id}")
public String updateProductGet(@PathVariable long id, Model model) {
    Product product = productService.getProductById(id).get();
    ProductDTO productDTO = new ProductDTO();
    productDTO.setId(product.getId());
    productDTO.setName(product.getName());
    productDTO.setCategoryId(product.getCategory().getId());
    // productDTO.setWeight(product.getWeight());
    productDTO.setDescription(product.getDescription());
    productDTO.setImageName(product.getImageName());
    model.addAttribute("categories", categoryService.getAllCategory());
    model.addAttribute("productDTO", productDTO);

    return "productsAdd";
}
}
