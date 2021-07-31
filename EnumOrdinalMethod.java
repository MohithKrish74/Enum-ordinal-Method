package com.keyword;
enum Weeks {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
public class EnumOrdinalMethod
{
    public static void main(String[] args)
    {
        for(Weeks week : Weeks.values())
        {
            System.out.println((week.ordinal()+1)+" "+week);
        }
    }
}
