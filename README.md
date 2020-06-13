# Втора лабораториска вежба по Софтверско инженерство
Ванеса Михаилова, бр. на индекс 151133

# Група на код:
Ја добив групата на код 2

# Control Flow Graph
![alt text](https://github.com/vmihailova/SI_Lab2_151133/blob/master/151133_Control_Flow.png?raw=true)

# Цикломатска комплексност
Цикломатската комплексност на овој код е 8, истата ја добив со користење на 3-те формули за одредување на комплексноста.

1. Преку бројот на региони
   V(G) = 8
   
2. Со помош на формулата V(G) = E - N + 2, каде E го претставува вкупниот број на врски помеѓу јазлите, додека N е бројот на јазли.     
   Според горе наведениот граф ги имаме следните податоци:
   - E: 23
   - N: 17   
   V(G) = E - N + 2 = 23 - 17 + 2 = 8

3. Преку формулата P + 1, каде што P е бројот на предикатни јазли. Во овој случај имаме 7 предикатни јазли, со што следува
   V(G) = P + 1 = 7 + 1 = 8


# Тест случаи според критериумот Multiple condtition

Во овој код, според Multiple condition критериумот, можеме да разликуваме 6 тест случаеви:

 1. if (user==null) 
    Во овој чекор проверуваме дали внесениот user објект е валиден, поточно дали воопшто имаме user објект. 
    За овој тест случај имаме 2 можни тестови, односно кога имаме user објект и кога немаме
    ![alt text](https://github.com/vmihailova/SI_lab2_151133/blob/master/MultipleConditionsDATA/MC1.png?raw=true)
    
 
 2. if (user.getUsername()==null || allUsers.contains(user.getUsername()))
    Во овој чекор проверуваме дали внесениот user објект содржи корисничко име или дали овој корисник постои во листата со сите корисници.
    Овде имаме 3 можни тестови:
    - Доколку корисникот нема корисничко име, ќе се фрли исклучок и нема да се провери вториот услов.
    - Ако корисникот има корисничко име, тогаш ќе се провери и вториот услов, и доколку го нема во листата на корисници, повторно ќе се фрли исклучок
    - Ако корисникот има корисничко име и го има во листата на корисници, тогаш продолжува да се извршува кодот.
    ![alt text](https://github.com/vmihailova/SI_lab2_151133/blob/master/MultipleConditionsDATA/MC2.png?raw=true)
    
 
 3. if (user.getEmail()==null)
 
 
 4. if (user.getEmail().charAt(i)=='@')
 
 
 5. if (atChar && user.getEmail().charAt(i)=='.')
 
 
 6. if (!atChar || !dotChar)


# Тест случаи според критериумот Every path
....

# Објаснување на напишаните unit tests
... ...
