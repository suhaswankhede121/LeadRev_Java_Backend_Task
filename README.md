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

<br><br>

2.Response : <br>
->Status Code: 201 Created <br>
->Response Body: The created product object <br><br><br>

2. Retrieve All Products
   ->Request :
      ->Method : GET
      ->Endpoint : '/product' <br>
      -> Query Parameter : <br>
           1. 'page': Page number (optional, default is 0)
           2. 'size' : Number of items per page (optional, default is 10)
           3. 'sortBy' : Field to sort by (optional, default is "name")
   <br><br>
   -> Response : <br>
     -> Status Code: 200 OK <br>
     -> Response Body: Array of product objects or paginated list of product objects
