package packageB;

import packageA.ClasseTest;

public class ClasseTestC {
	ClasseTest y=new ClasseTest();
	int a1=y.a;//public			SEMPRE
	int b1=y.b;//private      MAI
	int c1=y.c;//protected		no perch� non c'� l extends e package diverso
	int d1=y.d;//default      no perch� package diverso
}
