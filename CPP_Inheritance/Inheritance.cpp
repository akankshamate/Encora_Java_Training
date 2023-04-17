#include<iostream>

class A{
	public: A(){
		std::cout<<"This is class A's constructor\n";
	}
	~A(){
		std::cout<<"This is class A's destructor\n";
	}
};
class B: public A{
	public: B(){
		std::cout<<"This is class B's constructor\n";
	}
	~B(){
		std::cout<<"This is class B's destructor\n";
	}
};
class C: public A{
	public: C(){
		std::cout<<"This is class C's constructor\n";
	}
	~C(){
		std::cout<<"This is class C's destructor\n";
	}
};
class D: public B{
	public: D(){
		std::cout<<"This is class D's constructor\n";
	}
	~D(){
		std::cout<<"This is class D's destructor\n";
	}
};
class E: public B{
	public: E(){
		std::cout<<"This is class E's constructor\n";
	}
	~E(){
		std::cout<<"This is class E's destructor\n";
	}
};
class F: public C{
	public: F(){
		std::cout<<"This is class F's constructor\n";
	}
	~F(){
		std::cout<<"This is class F's destructor\n";
	}
};
class G: public C{
	public: G(){
		std::cout<<"This is class G's constructor\n";
	}
	~G(){
		std::cout<<"This is class G's destructor\n";
	}
};
class H: public D,public E{
	public: H(){
		std::cout<<"This is class H's constructor\n";
	}
	~H(){
		std::cout<<"This is class H's destructor\n";
	}
};
class I: public F,public G{
	public: I(){
		std::cout<<"This is class I's constructor\n";
	}
	~I(){
		std::cout<<"This is class I's destructor\n";
	}
};
class J: public H,public I{
	public: J(){
		std::cout<<"This is class J's constructor\n";
	}
	~J(){
		std::cout<<"This is class J's destructor\n";
	}
};
int main(){
	J j;
	return 0;
}
