package src.ru.avdotchenkov.lessonCar;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

public class TheBeginningOfTheChampionship extends Car {
	public static final int CARS_COUNT = 4;
	
	public TheBeginningOfTheChampionship (Race race, int speed) {
		super(race, speed);
	}
	
	public static void main (String[] args) {
		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
		Race race = new Race(new Road(60), new Tunnel(), new Road(40));
		Car[] cars = new Car[CARS_COUNT];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
		}
		
		List <Thread> participants = new ArrayList <>();
		
		for (int i = 0; i < cars.length; i++) {
			participants.add(new Thread(cars[i]));
		}
		
		for (Thread participant : participants) {
			participant.start();
		}
		
		try {
			t.await();
			t.await();
			t.await();
		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} catch (BrokenBarrierException e) {
			throw new RuntimeException(e);
		}
	


		for (Thread participant : participants) {
			try {
				participant.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
	}
}

