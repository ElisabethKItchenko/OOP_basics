public class StudentsNames {

    String [][] nameReference = new String [10][2];

    public StudentsNames() {

        nameReference[0][0]= "Brown"; nameReference[0][1]= "John" ;
        nameReference[1][0]= "Smith"; nameReference[1][1]= "Patric" ;
        nameReference[2][0]= "Johnson"; nameReference[2][1]= "Michael" ;
        nameReference[3][0]= "Eckel"; nameReference[3][1]= "Tom" ;
        nameReference[4][0]= "Schild"; nameReference[4][1]= "Andrew" ;
        nameReference[5][0]= "Thomson"; nameReference[5][1]= "Frederik" ;
        nameReference[6][0]= "Jefferson"; nameReference[6][1]= "Victor" ;
        nameReference[7][0]= "Mammilton"; nameReference[7][1]= "Jack" ;
        nameReference[8][0]= "Milton"; nameReference[8][1]= "Peter" ;
        nameReference[9][0]= "Chest"; nameReference[9][1]= "Plat" ;

    }

    public String getName(){
        return nameReference[(int) (Math.random() * 10)][0];
    }
    public String getSurname(){
        return nameReference[(int) (Math.random() * 10)][1];
    }

}
