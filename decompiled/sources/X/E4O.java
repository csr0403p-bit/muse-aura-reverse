package X;

import java.math.RoundingMode;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class E4O {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        A00 = iArr;
        try {
            AnonymousClass002.A13(RoundingMode.UNNECESSARY, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass002.A14(RoundingMode.DOWN, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AnonymousClass002.A15(RoundingMode.FLOOR, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            AnonymousClass002.A16(RoundingMode.UP, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            AnonymousClass002.A17(RoundingMode.CEILING, iArr);
        } catch (NoSuchFieldError unused5) {
        }
        try {
            AnonymousClass002.A18(RoundingMode.HALF_DOWN, iArr);
        } catch (NoSuchFieldError unused6) {
        }
        try {
            AnonymousClass006.A1G(RoundingMode.HALF_UP, iArr);
        } catch (NoSuchFieldError unused7) {
        }
        try {
            AnonymousClass006.A1H(RoundingMode.HALF_EVEN, iArr);
        } catch (NoSuchFieldError unused8) {
        }
    }
}
