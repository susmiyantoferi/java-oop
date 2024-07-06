 class Shape {

    int getCorner(){
        return 0;
    }
}


class Rectangle extends Shape{

    int getCorner(){
        return 4;
    }

    //SUPER KEYWORD DIGUNAKAN UNTUK MENGAKSES PARENT apabila sudah terbuat overide method
    int getParentCorner(){
        return super.getCorner();
    }
}