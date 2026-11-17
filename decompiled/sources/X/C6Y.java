package X;

import android.os.Process;

/* loaded from: classes5.dex */
public final class C6Y implements InterfaceC3231C4o {
    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) throws IllegalArgumentException {
        C7384Etj.A0Y(c3228C4l, 0);
        C3228C4l.A01(C6B.A4J, c3228C4l, Process.getThreadPriority(Process.myPid()));
    }

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A0a;
    }
}
