package com.mycompany.HorstmannTasks.ch03;

public interface IntSequence {

    default boolean hasNext() {
        return true;
    }

    int next();

    static IntSequence of(int... nums) {
        return new IntSequence() {
            int pointer = 0;
            @Override
            public int next() {
                return nums[pointer++];
            }

            public boolean hasNext() {
                return nums.length > pointer;
            }
        };
    }

    static IntSequence constant(int n) {
        return () -> n;
    }
}
