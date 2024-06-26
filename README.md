<b>Proper Documentation of API's Endpoint</b> <br><br>

1. Add Product
   -> Request :
      ->Method : POST
      ->Endpoint : '/product'

      ->Request Body :

{
    "name": "string",
    "description": "string",
    "price": "number",
    "categories": ["string"],
    "attributes": [{"key": "string", "value": "string"}],
    "availability": {"inStock": "boolean", "quantity": "number"},
    "ratings": [{"userId": "string", "rating": "number", "comment": "string"}]
 }

<br>

 -> Response : <br>
->Status Code: 201 Created <br>
->Response Body: The created product object <br><br><br>

2. Retrieve All Products
   ->Request :
      ->Method : GET
      ->Endpoint : '/product' <br>
      -> Query Parameter : <br>
           1. 'page': Page number (optional, default is 0) <br>
           2. 'size' : Number of items per page (optional, default is 10)<br>
           3. 'sortBy' : Field to sort by (optional, default is "name")<br>
   <br><br>
   -> Response : <br>
     -> Status Code: 200 OK <br>
     -> Response Body: Array of product objects or paginated list of product objects


3. Retrieve a Product by ID <br>
   -> Request : <br>
       -> Method : GET
       -> Endpoint: '/products/{id}' <br><br>

   -> Response : <br>
     -> Status Code: 200 OK
     -> Response Body: The requested product object
     <br><br><br>

4. Update a Product <br>
   -> Request:
      -> Method: PUT
       -> Endpoint: /products/{id}
       -> Request Body:

   {
    "name": "string",
    "description": "string",
    "price": "number",
    "categories": ["string"],
    "attributes": [{"key": "string", "value": "string"}],
    "availability": {"inStock": "boolean", "quantity": "number"},
    "ratings": [{"userId": "string", "rating": "number", "comment": "string"}]
 }
    <br>

   -> Response:
      ->Status Code: 200 OK
       -> Response Body: The updated product object

   <br><br><br>

5.Delete Product :
  -> Request: <br>
      -> Method: DELETE
        -> Endpoint: '/products/{id}'
        <br>
   -> Response: <br>
       -> Status Code: 204 No Content   
<br><br><br>

6.Search Products : 
   -> Request: <br>
      ->Method: GET
       -> Endpoint: /products/search 
         -> Query Parameters: <br>
            ->name: Search by product name (optional)<br>
            ->category: Search by category (optional)<br>
             ->attribute: Search by attribute key-value pair (optional) <br><br>


   -> Response : 
     -> Status Code: 200 OK
      -> Response Body: Array of product objects matching the search criteria
<br><br><br>

7. Rate a Product <br>
     -> Request:<br>
      -> Method: PUT
       -> Endpoint: /products/{id}/rate <br><br>
       -> Request Body: <br>
    {
    "userId": "string",
    "rating": "number",
    "comment": "string"
   }
   <br><br>
   
   -> Response: <br>
      -> Status Code: 200 OK
       -> Response Body: The updated product object


<br><br> <br> <br> 


<b> Data Model Diagram</b> <br><br>

   --------------
    |    Product   |
     -------------- 
    | id           |
    | name         |
    | description  |
    | price        |
    | categories   |
    | attributes   |
    | availability |
    | ratings      |
     -------------

  
   <br><br><br>


# for the following API's Testing through postman

1. POST Method 

![Screenshot (23)](https://github.com/suhaswankhede121/LeadRev_Java_Backend_Task/assets/132128817/4b1b9fe5-4cf5-4a75-9966-1d1ed5dc5b8f) 


2. GET Method

![Screenshot (24)](https://github.com/suhaswankhede121/LeadRev_Java_Backend_Task/assets/132128817/bf729855-d10b-4e67-874e-f0be81c26ace)



3.  PUT Method

![Screenshot (25)](https://github.com/suhaswankhede121/LeadRev_Java_Backend_Task/assets/132128817/8c6b5a54-549c-4bac-aa1d-96864cba2b99)  

4. Delete

![Screenshot (26)](https://github.com/suhaswankhede121/LeadRev_Java_Backend_Task/assets/132128817/e8f5ed87-5d1b-4873-bc2a-4768535a9efc)

5. Searching
![Screenshot (27)](https://github.com/suhaswankhede121/LeadRev_Java_Backend_Task/assets/132128817/9d90015b-6c37-440c-8906-c93852e2bfb0)
