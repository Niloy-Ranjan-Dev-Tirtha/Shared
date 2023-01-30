class Circle {
    public float area(float radious) {
        float circleArea = (3.1416f * (radious * radious));
        return circleArea;
    }
}

class Cylinder extends Circle {
    public float volume(float radious, float height) {
        float cylinderVolume = 0.0f;
        cylinderVolume = this.area(radious) * height;
        return cylinderVolume;
    }

    public static void main(String[] args) {
        float radious = 2, height = 3.5f;

        Cylinder obj_01 = new Cylinder();
        System.out.println("Vloume of the cylinder is " + obj_01.volume(radious, height));
    }
}
