package com.bizonos;
class B {
	def methodMissing(String name, args) {
		try {
			def method = this.metaClass.owner.metaClass.getMetaMethod("say"+name.capitalize(), args)
			method.doMethodInvoke(this.metaClass.owner, args)
		} catch (Exception e) {
			throw new RuntimeException(e)
		}
	}
}