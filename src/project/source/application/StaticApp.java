package project.source.application;

import project.source.data.Constant;
import project.source.data.Country;
import utils.MathUtils;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtils.sum(1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("banyuwangi");
        System.out.println(city.getName());

    }
}
