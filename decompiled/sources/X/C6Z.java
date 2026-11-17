package X;

import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes5.dex */
public final class C6Z implements InterfaceC3231C4o {
    public Context A00;

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A0J;
    }

    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) {
        if (((ActivityManager) this.A00.getSystemService("activity")) != null) {
            C3228C4l.A01(C6B.A2f, c3228C4l, r3.getMemoryClass());
            C3228C4l.A01(C6B.A2I, c3228C4l, r3.getLargeMemoryClass());
        }
    }
}
