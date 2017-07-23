import java.util.HashSet;

import java.util.Set;

public class Is{

public static void main(String[] args) {

Is.findIsomorphicString("egg", "add");

}

public static void findIsomorphicString(String s1, String s2) {

char string1Array[] = s1.toCharArray();

char stringArray2[] = s2.toCharArray();

Set<String> stringSet1 = new HashSet<String>();

Set<String> stringSet2 = new HashSet<String>();

int i = 0;

while (i < string1Array.length) {

stringSet1.add(String.valueOf(string1Array[i]));

i++;

}

int j = 0;

while (j < stringArray2.length) {

stringSet2.add(String.valueOf(stringArray2[j]));

j++;

}

if ((stringSet1.size() - stringSet2.size()) == 0) {

System.out.println("true");

} else {

System.out.println("false");

}

}

}
