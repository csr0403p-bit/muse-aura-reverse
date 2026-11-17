package X;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Etn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7386Etn {
    public static final F0C A00 = C5322DgG.A01((Function0) C6724EXi.A00(12));

    public static final int A00(Bitmap.Config config) {
        switch (F2C.A00[config.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw C8j3.A18("The provided Bitmap.Config is not supported");
        }
    }

    public static final int A01(Bitmap.Config config, int i, int i2) {
        if (i <= 0) {
            throw BV5.A0Q("width must be > 0, width is: ", i);
        }
        if (i2 <= 0) {
            throw BV5.A0Q("height must be > 0, height is: ", i2);
        }
        int iA00 = A00(config);
        int i3 = i * i2 * iA00;
        if (i3 > 0) {
            return i3;
        }
        StringBuilder sbA0y = C60O.A0y("size must be > 0: size: ", i3);
        sbA0y.append(", width: ");
        sbA0y.append(i);
        sbA0y.append(", height: ");
        sbA0y.append(i2);
        throw C3cG.A0Q(C60P.A1O(", pixelSize: ", sbA0y, iA00));
    }
}
