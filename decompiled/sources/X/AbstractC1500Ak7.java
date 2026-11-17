package X;

import android.content.Context;

/* renamed from: X.Ak7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1500Ak7 {
    public static final C1498Ak5 A00(Context context) {
        float f = C8j3.A0Z(context).fontScale;
        float f2 = C60Q.A0B(context).density;
        InterfaceC1502Ak9 interfaceC1502Ak9A01 = C1672Anz.A00.A01(f);
        if (interfaceC1502Ak9A01 == null) {
            interfaceC1502Ak9A01 = new C1501Ak8(f);
        }
        return new C1498Ak5(interfaceC1502Ak9A01, f2, f);
    }
}
