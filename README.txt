Đây là yêu cầu cho từng design pattern trong code em gửi, những bài tập này em lấy trên mạng về để thực hành thêm! 

**Bài 1: cho đối tượng Book có các thuộc tính: 
(String) name, 
(String) author, 
(double) price, 
(int) numbers, 
Genre(thể loại) gồm: (String) name, (boolean ) isSaleOff 
a/.Áp dụng builder pattern để xây dựng đối tượng Book.
			
b/.Xây dựng phương thức totalMoney() tính tổng tiền cho các quyển sách trong các Test Case phía trên. Công thức tính tiền như sau:
			- Nếu Genre là Scien && isSaleOff -> giảm 15%
			- Nếu Genre là Education && isSaleOff -> giảm 50%
			- Nếu Genre là Social && !isSaleOff -> giảm 10%
			- Nếu Genre là Social && isSaleOff -> giảm 20%
			
**Bài 2: xây dựng đối tượng Meal, ta sẽ xây dựng bữa ăn có rau và ko rau với các thưc đơn bao gồm đồ ăn VegBurge, ChickenBurge và đồ uống Coka, Pepsi (xem sơ đồ UML đính kèm)

=================================================================================
*** Factory & Decorator
	Design an application following instructions. The application should be able to:
		1. Display price of an order
		2. Display the name of the drink
			Ex: Ice Coffee: 15$
			Drinks: Coffee (10$), Mineral Water(8$), Fruit (12$)
			Gradients: Ice (2$), Milk (3$), Lemon (5$)
			
			It is able to combine any drink with gradients except: Mineral Water and Milk.
		3. The application must apply “Factory” && "Decorator" Design Pattern


- Abstract Factory:

	Trong thế giới động vật (AnimalWorld) có các loài động vật ăn cỏ (Herbivore) và các loài động vật ăn thịt (Carnivore). Ở mỗi châu lục (Continent) lại có các loài đặc thù khác nhau thuộc 2 nhóm trên. 
	
	VD: châu Phi (Africa) có Sư tử (Lion), Dê núi (Wildebeest), Nai (Deer), Báo (Panther)
		châu Mỹ (America) có Sói (Wolf) và Bò rừng Bi-dông (Bison). 
	
	Biết rằng bọn ăn thịt chỉ ăn những loài nó biết.
	Hãy áp dụng Abstract Factory để mô phỏng lại bài toán trên. 

	Test Case: 
				- Lion eat Wildebeest
				- Lion eat Deer
				- Wolf eat Bison
	