package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.B0e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2166B0e {
    float A8n(Context context);

    static InterfaceC2166B0e A00() {
        return Build.VERSION.SDK_INT >= 34 ? B0b.A00 : B0f.A00;
    }
}
