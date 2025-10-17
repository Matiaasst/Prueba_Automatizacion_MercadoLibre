Feature: Busqueda y filtrado de productos en el sitio web


    @SearchProduct
    Scenario: Search for “PlayStation 5” and apply filters
        Given El usuario ingresa al sitio web
        When Selecciona Mexico como pais
        And Busca el termino PlayStation 5
        And Filtra los resultados por condicion Nuevos
        And Filtra los resultados por ubicacion CDMX
        And Ordena los productos de mayor a menor precio
        Then Obtiene el nombre y el precio de los primeros 5 productos
        
      
     