package com.bizonos;

import com.bizonos.B;
import org.junit.Test;


class GroovyTest {
	
	@Test public void test() {
		def a = new A("John")
		a.metaClass.mixin B
		a.sayHello()
		a.hello() //Resolves to sayHello through B.methodMissing
		a.with { //Shoudl resolve to sayHello but fails and methodMissing is not invoked
			hello() 
		}
	} 
}