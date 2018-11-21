| OPERATOR | USE      | OPERATION                           |
|----------|----------|-------------------------------------|
| &&       | a && b   | And logical. Returns true if both   |
|          |          | are true, and false if either       |
|          |          | is false. If the first is false,    |
|          |          | the second is not evaluated.        |
|          |          |                                     |
| &        | a & b    | And logical. Returns true if both   |
|          |          | are true, and false if either       |
|          |          | is false.                           |
|          |          |                                     |
| ||       | a||b     | Or logical. Returns false if both   |
|          |          | are false, and true if either is    |
|          |          | true. If the first one is true,     |
|          |          | the second one is not evaluated.    |
|          |          |                                     |
| |        | a|b      | Or logical. Returns false if both   |
|          |          | are false, and true if either       |
|          |          | is true                             |
|          |          |                                     |
| !        | !(a)     | Not logical Returns true if the     |
|          |          | operand is false; and false, if     |
|          |          | the operand is true                 |
|          |          |                                     |
| ^        | a^b      | Or exclusive. Returns false if      |
|          |          | both are false or true;             |
|          |          | true, otherwise.                    |