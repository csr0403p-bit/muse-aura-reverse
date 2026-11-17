package X;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class F0M {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ F0M[] A01;

    static {
        F0M[] f0mArr = {new F0M("ARGB_8888", 0), new F0M("RGBA_1010102", 1), new F0M("HARDWARE", 2)};
        A01 = f0mArr;
        A00 = C3cG.A0w(f0mArr);
    }

    public static F0M valueOf(String str) {
        return (F0M) Enum.valueOf(F0M.class, str);
    }

    public static F0M[] values() {
        return (F0M[]) A01.clone();
    }

    public final Bitmap.Config A00() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return Bitmap.Config.HARDWARE;
                }
                throw C3cG.A0q();
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return Bitmap.Config.RGBA_1010102;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public F0M(String str, int i) {
    }
}
