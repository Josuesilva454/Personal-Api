package Dito;


import lombok.AllArgsConstructor;
import  lombok.Getter;


@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME( "Home"),
    MOBILE ("Mobile"),
    COMERCIAL ( "Comercial");


    private final String description ;


}




