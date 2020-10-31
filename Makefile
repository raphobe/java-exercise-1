exercise1:
	cd src/main/java; \
	javac com/martinezmanor/fib/FibCalc.java com/martinezmanor/exercises/Exercise1.java
	cd src/main/java; java com.martinezmanor.exercises.Exercise1

exercise2:
	cd src/main/java; \
	javac com/martinezmanor/fib/FibCalc.java com/martinezmanor/refactor/FibOtherCalc.java com/martinezmanor/exercises/Exercise2.java
	cd src/main/java; java com.martinezmanor.exercises.Exercise2

exercise3:
	cd src/main/java; \
	javac com/martinezmanor/fib/FibCalc.java com/martinezmanor/refactor/FibThirdCalc.java com/martinezmanor/exercises/Exercise3.java
	cd src/main/java; java com.martinezmanor.exercises.Exercise3

clean:
	cd src; \
	find . -name '*.class' | xargs rm
