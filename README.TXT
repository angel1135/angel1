Library: Representación de un administrador de información
de libros de una biblioteca, en base a dos clases principales:
- Book: variante de la clase 'Book' de los proyectos de
BlueJ. Representa un libro, con su id, título, autor, cantidad de páginas, 
cantidad de ejemplares, y cantidad de ejemplares en existencia (no prestados).
- Library: clase que representa una biblioteca, a través de una colección
de libros. Los libros están almacenados en una lista de libros, ordenados por
id. 

Tareas a implementar en clase Book:
- Implementar el constructor de la clase, incluyendo el chequeo de precondición 
    (se describe funcionalidad esperada en el comentario de los métodos)
- Implementar funcionalidad de:
    public String toString()
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de:
    public boolean repOK()
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de 
    public void lendCopy()
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de 
    public void returnCopy()
    (se describe funcionalidad esperada en el comentario del método)    
    
Tareas a implementar en clase Library:
- Implementar funcionalidad de: 
    public void addBook(Book book)
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de: 
    public void lendBook(int id)
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de: 
    public Book mostWordsInTitle()
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de: 
    public void deleteBooksWithAuthor(String author)
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de:
    public boolean repOK()
    (se describe funcionalidad esperada en el comentario del método)

IMPORTANTE: Puede agregar todos los métodos adicionales que considere necesarios para 
las implementaciones de estas funcionalidades.    
