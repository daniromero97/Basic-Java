<table>
    <tr>
      <th>OPERATOR</th>
      <th>USE</th>
      <th>OPERATION</th>
      <th></th>
    </tr>
    <tr>
      <td> += </td>
      <td> a+=b </td>
      <td> 
        a = a + b
      </td>
      <td> </td>      
    </tr>
    <tr>
      <td> -= </td>
      <td> a-=b </td>
      <td> 
        a = a - b
      </td>
      <td> </td>      
    </tr>
    <tr>
      <td> *= </td>
      <td> a*=b </td>
      <td> 
        a = a * b
      </td>
      <td> </td>      
    </tr>
    <tr>
      <td> /= </td>
      <td> a/=b </td>
      <td> 
        a = a / b
      </td>
      <td> </td>      
    </tr>
    <tr>
      <td> %= </td>
      <td> a%=b </td>
      <td> 
        a = a % b
      </td>
      <td> </td>      
    </tr>
    <tr>
      <td> &= </td>
      <td> a&=b </td>
      <td> 
        a = a & b
      </td>
      <td>
        If both bits compared are 1, it sets the result to 1. Otherwise it returns 0.   (bit operators)
      </td>      
    </tr>
    <tr>
      <td> |= </td>
      <td> a|=b </td>
      <td> 
        a = a | b
      </td>
      <td> 
        If at least one of the two bits compared is 1, it sets the result to 1. Otherwise it returns 0.     (bit operators)
      </td>      
    </tr>
    <tr>
      <td> ^= </td>
      <td> a^=b </td>
      <td> 
        a = a ^ b
      </td>
      <td> 
        If one of the compared bits is 0 and the other 1, the result is 1. If both bits are equal, the result is 0.     (bit operators)
      </td>      
    </tr>
    <tr>
      <td> <<= </td>
      <td> a<<=b </td>
      <td> 
        a = a << b
      </td>
      <td> 
         A shift to the left in B positions.     (bit operators) 
      </td>      
    </tr>
    <tr>
      <td> >>= </td>
      <td> a>>=b </td>
      <td> 
        a = a >> b
      </td>
      <td> 
        A shift to the right in B positions, takes into account the sign.   (bit operators)
      </td>      
    </tr>
    <tr>
      <td> >>>= </td>
      <td> a>>>=b </td>
      <td> 
        a = a >>> b
      </td>
      <td> 
        A shift to the right in B positions, does not take into account the sign.   (bit operators)
      </td>      
    </tr>
    


### ( operator &  &= )
```
int a = 2;      // a:  000000010
int b = 3;      // b:  000000011

a = a & b;      // a:  000000010
a &= b;         // a:  000000010
```

### ( operator |  |= )
```
int c = 4;      // c:  000000100
int d = 67;     // d:  001000011

c = c | d;      // c:  001000111
c |= d;         // c:  001000111
```

### ( operator ^  ^= )
```
int e = 15;     // c:  000001111
int f = 18;     // d:  000010010

e = e ^ f;      // e:  000011101
e ^= f;         // e:  000011101
```    
    --------------------------------- 
### ( operator <<  <<= )
```
int g = 15;     // g:  000001111
int h = 2;

g = g << h;     // g:  000111100    g: 60
g <<= h;        // g:  000111100    g: 60
```        
       
### ( operator >>  >>= )
```
int g = 60;     // g:  000111100
int h = 2;

g = g >> h;     // g:  000001111    g: 15
g >>= h;        // g:  000001111    g: 15
```
        
### ( operator >>>  >>>= )
```
int x = -1;

x>>>29;         // 00...0111        x: 7
x>>>30;         // 00...0011        x: 3
x>>>31;         // 00...0001        x: 1
```     

### ( operator ~ )
```
int k = 132;   // k: 00000000000000000000000010000100
int m = ~k;    // m: 11111111111111111111111101111011       (-133)
```