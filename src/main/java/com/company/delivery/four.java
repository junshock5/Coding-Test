//package main.java.com.company.delivery;
//
//import org.jetbrains.annotations.NotNull;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.mockito.BDDMockito.given;
//
//
//@RunWith(SpringRunner.class)
//class four {
//
//    boolean checkString(String str) {
//        char ch;
//        boolean capitalFlag = false;
//        boolean lowerCaseFlag = false;
//        boolean numberFlag = false;
//        for(int i=0;i < str.length();i++) {
//            ch = str.charAt(i);
//            if( Character.isDigit(ch)) {
//                numberFlag = true;
//            }
//            else if (Character.isLowerCase(ch)) {
//                capitalFlag = true;
//            } else if (Character.isUpperCase(ch)) {
//                lowerCaseFlag = true;
//            }
//            if(numberFlag && capitalFlag && lowerCaseFlag)
//                return true;
//        }
//        return false;
//    }
//    @Test
//    public void exampleTest(String constructorParameter) {
//
//        if(constructorParameter ==null){
//            throw new IllegalArgumentException(errorVersionMustNotBeNull);
//        }
//        if (!constructorParameter.matches("\\d+(\\.\\d+){0,2}(-SNAPSHOT)?")){
//            throw new IllegalArgumentException(errorOtherMustNotBeNull);
//        }
//        String[] array = constructorParameter.split("-");
//        if(checkString(array[1])){
//            System.out.println("It has lowerCase");
//        }
//
//        //given
//        given(new Version(null)).willReturn(null);
//
//        Version version = new Version(constructorParameter);
//
//    }
//
//    @Test
//    public void exampleTest2() {
//
//
//    }
//
//    // expected error messages:
//    static final String errorVersionMustNotBeNull = "'version' must not be null!";
//    static final String errorOtherMustNotBeNull =  "'other' must not be null!";
//    static final String errorVersionMustMatchPattern =  "'version' must match: 'major.minor.patch(-SN";
//
//    class Version implements Comparable<Version> {
//        Version(String version) {
//
//        }
//
//        boolean isSnapShot() {
//            return false;
//        }
//
//        @Override
//        public int compareTo(@NotNull Version o) {
//            return 0;
//        }
//    }
//}
//
