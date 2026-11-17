package X;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class EL1 {
    public static final int[] A00 = {13, 15, 14};

    public static final int[] A00(NetworkRequest networkRequest) {
        if (Build.VERSION.SDK_INT >= 31) {
            return EM0.A00(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        do {
            int i2 = iArr[i];
            if (networkRequest.hasCapability(i2)) {
                C60Q.A1P(arrayListA0h, i2);
            }
            i++;
        } while (i < 30);
        return AbstractC0878AGe.A0n(arrayListA0h);
    }

    public static final int[] A01(NetworkRequest networkRequest) {
        if (Build.VERSION.SDK_INT >= 31) {
            return EM0.A01(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        do {
            int i2 = iArr[i];
            if (networkRequest.hasTransport(i2)) {
                C60Q.A1P(arrayListA0h, i2);
            }
            i++;
        } while (i < 10);
        return AbstractC0878AGe.A0n(arrayListA0h);
    }
}
