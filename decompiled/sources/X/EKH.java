package X;

import android.os.Build;

/* loaded from: classes5.dex */
public abstract class EKH {
    public static final int A00(EnumC6619EKm enumC6619EKm) {
        switch (AnonymousClass001.A0E(enumC6619EKm, 0)) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                throw C3cG.A0q();
        }
    }

    public static final Integer A01(int i) {
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
        if (i == 4) {
            return C79.A0P;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(FGI.A0I("Could not convert ", i, " to NetworkType"));
        }
        return C79.A0T;
    }

    public static final Integer A02(int i) {
        if (i == 0) {
            return C79.A00;
        }
        if (i == 1) {
            return C79.A01;
        }
        throw new IllegalArgumentException(FGI.A0I("Could not convert ", i, " to OutOfQuotaPolicy"));
    }
}
