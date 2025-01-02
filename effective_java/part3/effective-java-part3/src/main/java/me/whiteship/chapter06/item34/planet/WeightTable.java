package me.whiteship.chapter06.item34.planet;

// 어떤 객체의 지구에서의 무게를 입력받아 여덟 행성에서의 무게를 출력한다. (212쪽)
public class WeightTable {
   public static void main(String[] args) {
      double earthWeight = 10;
      double mass = earthWeight / Planet.EARTH.surfaceGravity();
      Planet[] values = Planet.values();
      for (Planet p : values)
         System.out.printf("%s에서의 무게는 %f이다.%n", p, p.surfaceWeight(mass));
   }
}
