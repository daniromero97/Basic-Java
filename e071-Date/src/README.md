# Date

- There are several ways to work with dates in java.
- Let's see the Date class, from the java.util package.
- As of Java 8, the handling of dates and time has changed in Java.
- There is a new API for handling dates and time in the java.time package.
- However, we may find that we need to work with code that continues to use the Date class of the java.util package.
- Being the Date class of the first in this package, it has many deprecated methods.
- Its use is not recommended, although for compatibility it is still allowed.


### Examples:

##### Get the current date

```
Date date = new Date();
System.out.println(date);

System.out.println(date.getHours());      // obsolete
System.out.println(date.getMinutes());      // obsolete

/*
output:
    Mon Nov 26 9:36:47 CET 2018
    9
    36
*/
```


##### Create our own date

```
Date date2 = new Date(118, 10, 26);     // obsolete
System.out.println(date2);

/*
output:
    Mon Nov 26 00:00:00 CET 2018
*/
```


##### Format a date

```
Date date3 = new Date();
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
System.out.println(simpleDateFormat.format(date3));

/*
output:
    2018-11-26
*/
```

| Use  | Meaning     |
|------|-------------|
| yy   | year        |
| yyyy | year        |
| MM   | month       |
| dd   | day         |
| hh   | hour (0-12) |
| HH   | hour (0-23) |
| mm   | minute      |
| ss   | second      |
| SSS  | millisecond |
| z    | time zone   |
| Z    | time zone   |

- Oficial documentation: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html


##### Parser a date

```
String my_date = "26 9:39:01 EDT 2018";
SimpleDateFormat parser = new SimpleDateFormat("d HH:mm:ss zzz yyyy");

try
{
    Date d = parser.parse(my_date);
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println(simpleDateFormat2.format(d));
}
catch (ParseException e)
{
    e.printStackTrace();
}

/*
output:
    2018-11-26
*/
```

