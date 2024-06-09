package com.rahul.enums;

/*
 * enums cannot be extended ,
 * it can implement interface but cannot extend any other class,
 * as it is already extending java.lang.enum,
 * all constants are private static
 * constructors are private
 * it can have abstract methods ,
 * but constants needs to implement the methods ,
 * every jvm will have only one instance of enum (protection
 * from reflection in case of singleton )
 */

/*some methods of enum
valueOf()
* values()
* ordinal()
* name()*/

//its constants are basically objects
public enum Weekdays {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
//todo
//abstract class , interface , singleton ex using enum