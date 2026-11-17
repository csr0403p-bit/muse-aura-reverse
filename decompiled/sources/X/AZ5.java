package X;

import android.graphics.Paint;

/* loaded from: classes4.dex */
public abstract class AZ5 {
    public static final Paint A00(InterfaceC1330AhH interfaceC1330AhH) {
        if (interfaceC1330AhH instanceof C1776AqX) {
            return ((C1776AqX) interfaceC1330AhH).A01;
        }
        throw new IllegalArgumentException(FGI.A0M("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received ", C0861A6i.A00(interfaceC1330AhH.getClass())));
    }
}
