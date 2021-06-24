package packageA;

public class ClasseTestA {
	ClasseTest x= new ClasseTest();

	int a1=x.a;//public     SEMPRE
	int b1=x.b;//private     MAI
	int c1=x.c;//protected   si perchè stesso package anche se non c'è extends
	int d1=x.d;//default    si perchè stesso package
}
