package X;

import android.graphics.Path;

/* loaded from: classes5.dex */
public final class EtD extends C06G implements InterfaceC7430Evn {
    public final long A00;
    public final long A01;

    @Override // X.InterfaceC7430Evn
    public final void A4c(Path path, C7377EtL c7377EtL) {
        C7384Etj.A0Y(path, 0);
        long j = this.A00;
        float fA00 = AnonymousClass001.A00(j);
        float fA002 = AnonymousClass004.A00(j);
        long j2 = this.A01;
        path.quadTo(fA00, fA002, AnonymousClass001.A00(j2), AnonymousClass004.A00(j2));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EtD) {
                EtD etD = (EtD) obj;
                if (this.A00 != etD.A00 || this.A01 != etD.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A01, AnonymousClass005.A07(this.A00));
    }

    public EtD(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
