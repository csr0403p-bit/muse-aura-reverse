package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Ez2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7520Ez2 implements DK9 {
    public long A00;
    public final InterfaceC7539F0o A01;

    @Override // X.DK9
    public final long now() {
        long jMax = Math.max(this.A00, this.A01.now());
        this.A00 = jMax;
        return jMax;
    }

    @Override // X.DK9
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    public C7520Ez2(InterfaceC7539F0o interfaceC7539F0o) {
        this.A01 = interfaceC7539F0o;
        this.A00 = interfaceC7539F0o.now();
    }
}
