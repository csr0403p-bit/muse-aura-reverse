package X;

import android.content.Context;
import android.os.Build;
import com.google.wear.Sdk;

/* renamed from: X.CwJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4447CwJ {
    public final Context A00;

    public final int A00() {
        if (!(this.A00.getPackageManager().hasSystemFeature("android.hardware.type.watch")) || Build.VERSION.SDK_INT < 34) {
            return 0;
        }
        return Sdk.VERSION.WEAR_SDK_INT;
    }

    public C4447CwJ(Context context) {
        this.A00 = context;
    }
}
