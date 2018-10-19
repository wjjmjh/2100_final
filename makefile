Test.class : Test.java
	javac Test.java 
run : Test.class 
	java Test 
clean : 
	rm Test.class
	rm Circular.class
	rm Square.class
	rm Shape.class
	rm Sculpture.class
