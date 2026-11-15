package com.xworkz.gym;

import com.xworkz.gym.workout.CardioTraining;
import com.xworkz.gym.workout.StrengthTraining;
import com.xworkz.gym.workout.Workout;

public class GymRunner {
    public static void main(String[] args) {
        Workout workout = new StrengthTraining();
        workout.performWorkout();

        System.out.println("-------------------");

        workout = new CardioTraining();
        workout.performWorkout();
    }
}
