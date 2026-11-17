package X;

import android.graphics.Path;

/* renamed from: X.EtA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7372EtA extends C06G implements InterfaceC7430Evn {
    public final long A00;

    @Override // X.InterfaceC7430Evn
    public final void A4c(Path path, C7377EtL c7377EtL) {
        C7384Etj.A0Y(path, 0);
        long j = this.A00;
        path.lineTo(AnonymousClass003.A03(j), AnonymousClass004.A00(j));
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7372EtA) && this.A00 == ((C7372EtA) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public C7372EtA(long j) {
        this.A00 = j;
    }
}
