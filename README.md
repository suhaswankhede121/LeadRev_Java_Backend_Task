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


