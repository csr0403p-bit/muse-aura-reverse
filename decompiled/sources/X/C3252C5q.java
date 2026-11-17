package X;

import android.os.SystemClock;

/* renamed from: X.C5q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3252C5q implements InterfaceC3231C4o {
    public long A00;
    public Integer A01;

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A0U;
    }

    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) {
        C3221C4e c3221C4e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis() - this.A00;
        Integer num = this.A01;
        if (num == C79.A00) {
            C3228C4l.A01(C6B.A3f, c3228C4l, jCurrentTimeMillis);
            c3221C4e = C6B.A3h;
        } else {
            if (num != C79.A01) {
                return;
            }
            C3228C4l.A01(C6B.A2X, c3228C4l, jCurrentTimeMillis);
            c3221C4e = C6B.A2Y;
        }
        C3228C4l.A01(c3221C4e, c3228C4l, jUptimeMillis);
    }
}
