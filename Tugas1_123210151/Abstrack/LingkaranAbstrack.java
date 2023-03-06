package Tugas1_123210151.Abstrack;

public class LingkaranAbstrack extends Abstrack {
    private float r;

    public LingkaranAbstrack(float r) {
        this.r = r;
    }

    @Override
    public float getLuas() {
        return (float) (Math.PI * r * r);
    }
}
