package X;

import android.graphics.Path;

/* loaded from: classes5.dex */
public final class EtC extends C06G implements InterfaceC7430Evn {
    public final long A00;
    public final long A01;
    public final long A02;

    @Override // X.InterfaceC7430Evn
    public final void A4c(Path path, C7377EtL c7377EtL) {
        C7384Etj.A0Y(path, 0);
        long j = this.A00;
        float fA00 = AnonymousClass001.A00(j);
        float fA002 = AnonymousClass004.A00(j);
        long j2 = this.A01;
        float fA003 = AnonymousClass001.A00(j2);
        float fA004 = AnonymousClass004.A00(j2);
        long j3 = this.A02;
        path.cubicTo(fA00, fA002, fA003, fA004, AnonymousClass001.A00(j3), AnonymousClass004.A00(j3));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EtC) {
                EtC etC = (EtC) obj;
                if (this.A00 != etC.A00 || this.A01 != etC.A01 || this.A02 != etC.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A02, AnonymousClass006.A06(this.A01, AnonymousClass005.A07(this.A00)));
    }

    public EtC(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }
}
