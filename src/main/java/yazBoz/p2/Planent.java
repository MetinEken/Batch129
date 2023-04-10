package yazBoz.p2;

public  class Planent {
    public String name;
    public int moons;
    public Planent(String name, int moons){
        this.name=name;
        this.moons=moons;
    }

    public static void main(String[] args) {
        Planent[] planents ={
                new Planent("hsjdhj", 0),
                new Planent("hsjdhj", 0),
                new Planent("xxx", 1),
                new Planent("hsjdhj", 2),
        };
        System.out.println(planents);
        System.out.println(planents[2].name);
        System.out.println(planents[2].moons);

        float x= 11f;
        int r=67;
        x=r;
        System.out.println(x);
        r= (int) x;

        String er="sdskqq";
      String t=  er.substring(2,6);
        System.out.println(t);
    }


}
