package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.AyE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2089AyE {
    public static G0U<? super View, ? extends InterfaceC2147AzZ> A00 = new C2279BSf(22);

    public static final Azl A00(View view) {
        return Build.VERSION.SDK_INT >= 34 ? new C2088AyD(view) : new Azl(view);
    }
}
