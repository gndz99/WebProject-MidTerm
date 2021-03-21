# WebProject-MidTerm

- Name: Gunduzalp Dogrutekin
- Contact: gunduzalp.dogrutekin@iaau.edu.kg
- Computer Science Department of Ala-too International University.

## Porject Description

This project is a data storing based web application which has a function of storing the data given.

It is a sample representetive web application for Ala-Too International Univeristy

This web applciation uses Heroku as its storage cloud service and the link:
> Link: [Web-Page](https://alatooweb204.herokuapp.com)
> 
Please add your information if you have clicked the link and read the about API page which is inside the Nav-Bar

### Below are some screen shots from the web-application:
## Main Page and Navbar
<img src="https://user-images.githubusercontent.com/65071516/111913866-f7fb4100-8a99-11eb-8f00-0e6d5aa6acb9.PNG">

So the main page consists of a big data table above it there is a short description of the web application and also there is a Nav-Bar.

The Nav-Bar consists of a Home page return button, an add inforamtion button where data is added, an Ala-Too University Logo and a button called 
About API where the information is about how API is been used.

***ABOUT API Page***

<img src="https://user-images.githubusercontent.com/65071516/111916532-9e990f00-8aa5-11eb-8893-180805c1cec2.PNG">

## Database

The database used is PGADMIN4 and POSTGRESQL13

<img src="https://user-images.githubusercontent.com/65071516/111914641-f121fd80-8a9c-11eb-86c1-8e147fcb85b7.PNG">



## The REST API

POST,PUT,DELETE is requested by an extension in Mozzila FireFox called HTTP request Maker.

***POST***

Lets start from the first one which is POST.("/datalar/add")

This is the code

<img src="https://user-images.githubusercontent.com/65071516/111914483-56c1ba00-8a9c-11eb-81cb-cb0799460e98.PNG">

Here we type the information

<img src="https://user-images.githubusercontent.com/65071516/111915450-8a9ede80-8aa0-11eb-9dfe-c2a1f7bac82f.PNG">

The data is posted to the server

<img src="https://user-images.githubusercontent.com/65071516/111915452-8d99cf00-8aa0-11eb-9c44-0a85bce1e4b3.PNG">

***GET***

To view the particular id("/datalar/id")

The code

<img src="https://user-images.githubusercontent.com/65071516/111915590-47913b00-8aa1-11eb-8969-55894997fb48.PNG">

The individual id shown:

<img src="https://user-images.githubusercontent.com/65071516/111915452-8d99cf00-8aa0-11eb-9c44-0a85bce1e4b3.PNG">

***PUT***

To change the id's data("/datalar/id")

The code:

<img src="https://user-images.githubusercontent.com/65071516/111915668-aa82d200-8aa1-11eb-928e-db9b03facfbb.PNG">

The process:

<img src="https://user-images.githubusercontent.com/65071516/111915676-ae165900-8aa1-11eb-879e-9e8245898a7f.PNG">

The change in id 1:

<img src="https://user-images.githubusercontent.com/65071516/111915680-afe01c80-8aa1-11eb-8167-6427eb6c237a.PNG">

***DELETE***

To delete particular id ("/datalar/id")

The code:

<img src="https://user-images.githubusercontent.com/65071516/111915853-7360f080-8aa2-11eb-9887-f7ae63640988.PNG">

The deleting process:

<img src="https://user-images.githubusercontent.com/65071516/111915858-75c34a80-8aa2-11eb-8f34-6ead6e908a87.PNG">

Id 1 has been deleted from the server:

<img src="https://user-images.githubusercontent.com/65071516/111915861-778d0e00-8aa2-11eb-838a-4344bf44b075.PNG">






