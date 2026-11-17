package X;

/* loaded from: classes5.dex */
public abstract class CbU {
    public static int A00(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw BV5.A0Q("Invalid rotation: ", i);
    }
}
