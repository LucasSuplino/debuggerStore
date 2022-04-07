![Debugger Store](https://i.imgur.com/5C8Sm1M.png "Debugger Store")

**E-commerce RESTful API made by developers for developers**

![Version](https://img.shields.io/badge/Version-1.0-green "Version")
![Stars](https://img.shields.io/github/stars/phricardorj/debuggerStore?style=social "Stars")
![Contributors](https://img.shields.io/github/contributors/phricardorj/debuggerStore?color=#00fd13 "Contributors")

## ⚙️ Technologies

- [Java](https://www.java.com/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [PostgreSQL](https://www.postgresql.org/)
- [Maven](https://maven.apache.org/)
- [Lombok](https://projectlombok.org/)

## 🗺️ API Documentation

1. (POST) `/store/product` - Register a new Product
```Json 
{
  "name": "The Best and Most Complete Book of Java",
  "productQuantity": "500",
  "price": 15
}
```

2. (POST) `/store/customer` - Register a new Consumer
```Json 
{
  "name": "Richard"
}
```

3. (POST) `/store/order` - Register a new Purchase Order
```Json 
{
   "productIdList":[1, 2],
   "clientId":1
}
```