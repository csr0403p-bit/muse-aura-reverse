package X;

/* renamed from: X.FId, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7866FId extends Enum<AbstractC7866FId> {
    public final int mIntValue;

    public static Integer A02(int i) {
        if (i == 0) {
            return C79.A00;
        }
        if (i == 1) {
            return C79.A01;
        }
        if (i == 2) {
            return C79.A0C;
        }
        if (i == 3) {
            return C79.A0K;
        }
        throw BV5.A0Q("Unknown enum value: ", i);
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    public static int A01(Integer num, float[] fArr, int i, int i2) {
        fArr[i] = A00(num);
        return i2 + 1;
    }

    public static String A03(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "LEFT";
            case 1:
                return "TOP";
            case 2:
                return "RIGHT";
            default:
                return "BOTTOM";
        }
    }
}
