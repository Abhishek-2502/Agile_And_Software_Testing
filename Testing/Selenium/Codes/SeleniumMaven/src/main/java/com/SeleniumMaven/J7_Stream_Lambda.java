package com.SeleniumMaven;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

// Normal Interface -- Multiple Abstract method
// Marker Interface -- Interface with 0 method
// Functional Interface -- Interface with single abstract method ( Previously called SAM (Single Abstract Method))
@FunctionalInterface
interface myFunctionalInteface {
    // public void meth1();     //Will through error if other function is not commented
    public void meth1(int a);
    String toString();  //Don't through error as it is in Object Class

}

class B implements myFunctionalInteface{
    @Override
    public void meth1(int a) {
        System.out.println("Meth 1 from Class");
    }
}


public class J7_Stream_Lambda {
    public static void main(String[] args) {
//        For Each
//        List<Integer> nums = Arrays.asList(4,5,7,8,9);
//        nums.forEach(n -> System.out.println(n));


        System.out.println("Calling Interface Method from Class");
        B obj= new B();
        obj.meth1(5);

        System.out.println("Calling Interface Method from Anonymous Inner Class");
        myFunctionalInteface obj1 = new myFunctionalInteface(){
            public void meth1(int a) {
                System.out.println("Meth1() from Anonymous Inner Class");
            }
        };

        obj1.meth1(5);


        System.out.println("Lambda (Calling Interface method without creating class)");
        // myFunctionalInteface obj= ()->{
        //     System.out.println("I am Meth 1");
        // };
        myFunctionalInteface obj2= (a)->{
            System.out.println("Meth1() from Lambda");
        };
        obj2.meth1(5);







//        Stream
        List<Integer> nums1 = Arrays.asList(2,5,1,8,0);

        Stream<Integer> data = nums1.stream();
//        data.forEach(n -> System.out.println(n));     // Stream do not change Original data
//        data.forEach(n -> System.out.println(n));   // Stream can be used once


//        System.out.println("COUNT");
//        long count = data.count();
//        System.out.println(count);


//        System.out.println("Sorted");
//        Stream<Integer> sorteddata = data.sorted();
//        sorteddata.forEach(n -> System.out.println(n));


//        System.out.println("MAP");
//        Stream<Integer> mappeddata=data.map(n -> n*2);
//        mappeddata.forEach(n -> System.out.println(n));


//        System.out.println("SINGLE LINE");
//        List<Integer> nums2 = Arrays.asList(2,5,1,8,0);
//        nums2.stream()
//                .sorted()
//                .map(n -> n*3)
//                .forEach(n -> System.out.println(n));

//        System.out.println("FILTER");
//        List<Integer> nums3 = Arrays.asList(2,5,1,8,0);
//        nums3.stream()
//                .filter(n -> n%2==0)
//                .sorted()
//                .map(n -> n*3)
//                .forEach(n -> System.out.println(n));

//        System.out.println("REDUCE");
//        List<Integer> nums4 = Arrays.asList(2,5,1,8,0);
//        int result=nums4.stream()
//                .filter(n -> n%2==1)
//                .map(n -> n*2)
//                .reduce(0,(c,e)->c+e);
//        System.out.println(result);










//        // How single line is working (Step 1) (Original)
//        Predicate<Integer> predi = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                if(n%2==0)
//                    return true;
//                else
//                    return false;
//            }
//        };

//        // How single line is working (Step 2) (Reduced)
//        Predicate<Integer> predi = (Integer n) -> {
//                if(n%2==0)
//                    return true;
//                else
//                    return false;
//
//        };

//        // How single line is working (Step 3) (More Reduced)
//        Predicate<Integer> predi = (Integer n) -> {
//                return n%2==0;
//        };

//        // How single line is working (Step 4) (More MoreReduced)
//        Predicate<Integer> predi = (Integer n) -> n%2==0;

        // How single line is working (Step 5) (More More MoreReduced)
        Predicate<Integer> predi = n -> n%2==0;


        List<Integer> nums3 = Arrays.asList(2,5,1,8,0);
        nums3.stream()
                .filter(predi)
                .sorted()
                .map(n -> n*3)
                .forEach(n -> System.out.println(n));



    }
}
