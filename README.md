## CINE PROGRAMACION CONCURRENTE 

PROGRAMA DE CONTROL DE VENTAS DE TICKETS EN UN CINE POR SALAS IMPLEMENTANDO PROGRAMACION CONCURRENTE EN JAVA
## Comenzando 🚀
Para Descargar y desplegar el proyecto Es necesario contar Con git ,una terminal o algun cliente git como lo es GitKraken,Plugins en VSC
```bash
    $ git clone https://github.com/DanyeDarko/Cine.git
 ```
 ### CLASE CINE ABSTRACTA
 La clase 'DatosCineAbstracta' contiene todas las variables utiles y metodos implementados de la interfaz 'interfazCine'
 El ArrayList de tipo ArrayList Bidimensional tiene la siguiente arquitectura: 

![ARQUITECTURA DEL ARRAYLIST PRINCIPAL O RECURSO DE LO SHULOS](https://raw.githubusercontent.com/DanyeDarko/Cine/master/ARREGLO.png)

en donde la definicion del arreglo es :

```java
ArrayList< List< List<Integer>>> listaTaquillas = new ArrayList< List< List< Integer>>>(); 
```

Declarando asi ,Un Arreglo de 3 dimensiones donde Cada una de estas dimensiones,Representara Una **Taquilla**,Que a su ves contendran Datos almacenados en un Array de 4 columnas **Numero cliente(numero de hilo),Cant Boletos,Sala,Compra(1) o Devolucion(0)**.

### NOTA : el largo de las filas no es predeterminado ,Puesto que es un arreglo dinamico con el que se manejan los Datos

#### ESTABLECER DIMENSIONES AL ARREGLO
```java
 for (int dimension = 0; dimension < cantidadTaquillas; dimension++) {
            // ITERADOR QUE PERMITE LA CREACION DE N CANTIDAD ESTIPULADA DE DIMENSIONES O TAQUILLAS

            this.listaTaquillas.add(new ArrayList<List<Integer>>());
            // POR CADA ITERACION AGREGA UN ARREGLO BIDIMENSIONAL A LA LISTA DE AREGLOS
            // CADA ARREGLO BIDIMENSIONAL CONTENDRA DATOS DE VENTAS Y DEVOLUCIONES 
            // ACERCA DE UNA ESPECIFICA TAQUILLA,ES DECIR LA DIMENSION EN LA QUE SE ENCUENTRA DICHO ARREGLO
```
       
Cada Dimension que vamos agregando en el primer for dentro del constructor en la clase **'Cine'** representa una taquilla ,si observamos el for ,las 'dimensiones' deben ser **menor a** 'cantidadTaquillas' Parametro que se recibe al instanciar una nueva clase del cine '(MONITORA DE HILOS) '  

#### ESTABLECER COLUMNAS DE TABLA  AL ARREGLO BIDIMENSIONAL ALMACENADO EN CADA DIMENSION
```java
 for (int columna = 0; columna < 4; columna++) {
                // ITERADOR QUE PERMITE AGREGAR 4 COLUMNAS A CADA ARREGLO BIDIMENSIONAL
                // ES DECIR AGREGA UNA LISTA NUEVA POR CADA ITERACION EN CADA UNA DE LAS 4 DIMENSIONES

                this.listaTaquillas.get(dimension).add(new ArrayList<Integer>());
                //SE UTILIZA 'get'(indice) EQUIVALENTE A [indice] EN ARREGLOS COMUNES
                //'add' SE UTILISA PARA AGREGAR ELEMENTOS AL INDICE INDICADO
            }
```
Agregamos 4 columnas  o nuevos `ArrayList <Integer>` a cada una de las dimensiones ,este for se itera dentro del anterior para lograrlo 


Por lo tanto la Tabla de cada taquilla o  ``List<List<Integer>>``  seria la siguiente: 

| Num Cliente | Cant Boletos | Sala | AccionTaquilla|
| ----- | ---- | ----- | ---- |
| 1 | 5 | 2 | 1 | 
| 2 | 3 | 5 | 0 | 

📌 **1 REPRESENTA UNA VENTA,POR LO TANTO SUMA VENTAS EN LA SALA QUE VENDIO Y POR SUPUESTO SUMA A LA TAQUILLA QUE VENDIO** 

📌 **0 REPRESENTA UNA DEVOLUCION POR LO TANTO RESTA VENTAS EN LA SALA QUE DEVOLVIO,Y SUMA DEVOLUCIONES,POR SUPUESTO RESTA LA TAQUILLA DONDE SE DEVOLVIO** 

 Estas Variables seran definida por la variables que pasan al metodo **operacionTaquilla** de la clase **'DatosCineAbstracta'** el cual implementa con *Implements* los metodos de la interfaz **'InterfazCine'**  <-- ESTAS VARIABLE SE CONSTRUYE DESDE EL EL CONSTRUCTOR DEL HILO EL PARAMETRO SE DEFINNE EN **'mainServicioCine'** o clase principal.
 
 ### INTERFAZ CINE
 Construye de manera abstracta los metodos usados principalmente en un cine, son implementados en la **'DatosCineAbstracta'**
 
 - *ObtenerDatosTaquilla *: Recibe como parametro la taquilla que queremos imprimir en este caso (Dimension de el arreglo principal de donde obtendremos los datos) 
 ```java
     public void obtenerDatosTaquilla(int numeroTaquilla);
```
- *operacionTaquilla* : Realisa una nueva compra(nueva insercion)de acuerdo a la Taquilla donde se desea comprar,Normalmente esta accion la realisa un cliente(Hilo Representa al cliente) que planea devolver(0) o comprar(1) **N** cantidad de boletos para **X** sala

 ```java
    public void operacionTaquilla(int numeroCliente, int numTaquilla, int cantidadBoletos, int numeroSala, int tipoOperacion);
```
- *llenarTaquillas*: Las taquillas simplemente transponen los datos de un *'Arreglo Bidimensional'* definido en la clase **'DatosCineAbstract'**  
 ```java
    public void LlenarTaquillas(int numeroTaquillaAllenar);
    
    // DEFINICION DE MATRICES BIDIMENSIONALES EN CLASE 'DatosCineAbstract'     
    protected Integer[][] Taquilla1;
    protected Integer[][] Taquilla2; 
    protected Integer[][] Taquilla3;
    protected Integer[][] Taquilla4;
 ```
 las cuales se Inicialisan en la Clase **'Cine'** objeto que herededa de **'DatosCineAbstracta'** todos sus atributos y metodos ,solo inicialisa valores en esta clase , la inicialisacion de los arreglos se basan en la lectura de un archivo plano 
 Gracias Al metodo 'leerMatrizTxt'
 
 - *leerMatrizTxt* : Permite la lectura de un archivo plano ,Donde se encuentran los datos preescritos de cada *Taquilla* ,Los datos los inserta en una matriz de tipo 'Integer' que es Devuelta para trasnponer *'List < List <Integer>>'* con los datos de el arreglo  *'Integer [][]'* con cada uno de sus elementos
    
```java
    public Integer[][] leerMatrizTxt(String URLArcqyuhivo);
 ```


Mira Deployment para conocer como desplegar el proyecto desde Netbeans o Visual Studio Code.
## Pre-requisitos 📋

- JAVA SDK](#)
- NETBEANS ,VISUAL STUDIO CODE O IDE JAVA (#)
- GIT(#)



## Despliegue  📦

Proximamente

## Construido con 🛠️ 

Menciona las herramientas que utilizaste para crear tu proyecto

    Visual Studio Code - IDE de programacion
    Ant - Constructor de Proyectos Java
    Java SDK -JVM para compilar proyecto 
    Apache Netbeans - Usado para Generar el Proyecto ANT

## Contribuyendo 🖇️  

Por favor lee el CONTRIBUTING.md para detalles de nuestro código de conducta, y el proceso para enviarnos pull requests.
Wiki book

## LICENCIA 📄
Este proyecto está bajo una licencia libre ,sientete libre de hacer fork de el codigo o modificarlo . :))

    
