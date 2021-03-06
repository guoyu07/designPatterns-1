### template pattern
### 模版模式

又叫模板方法模式，在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情冴下，重新定义算法中的某些步骤。

对于茶和咖啡等饮料的调制，都是通过先把水煮沸，然后放入杯子中、冲泡，最后加入调味品，完成调制。但是对于不同的饮料需要加入不同的原材料进行冲泡，当然，调味品也是不一样的。这个时候，也就有了如下抽象类及对应的抽象方法的定义，将具体的实现交给子类，这也是抽象类的一个用途。
关键代码如下：
``` java
public abstract class CoffeineBeverage {

	// 煮沸水
	void boilWater(){
		System.out.println("Boiling water");
	}

	// 放入杯子
	public void pourInCup(){
		System.out.println("Pouring into cup");
	}

	// 冲泡
	abstract void brew();

	// 加入调味品
	abstract void addCondiments();
}
```

### 关于模板模式
1. 模板模式定义了算法的步骤，把这些步骤的实现延迟到子类
2. 模板模式为我们提供了一个代码复用的技巧
3. 模板抽象类中可以定义具体方法、抽象方法和钩子方法
4. 为了防止子类改变模板中的算法，可以将模板方法声明为final
5. 钩子是一种方法，它在抽象类中不做事，或只做默认的事，子类可以选择要不要实现它