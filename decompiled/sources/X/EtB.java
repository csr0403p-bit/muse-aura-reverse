package X;

import android.graphics.Path;

/* loaded from: classes5.dex */
public final class EtB extends C06G implements InterfaceC7430Evn {
    public final long A00;

    @Override // X.InterfaceC7430Evn
    public final void A4c(Path path, C7377EtL c7377EtL) {
        C7384Etj.A0Y(path, 0);
        long j = this.A00;
        path.moveTo(AnonymousClass003.A03(j), AnonymousClass004.A00(j));
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EtB) && this.A00 == ((EtB) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public EtB(long j) {
        this.A00 = j;
    }
}
