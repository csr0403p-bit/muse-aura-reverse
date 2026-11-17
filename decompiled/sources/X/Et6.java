package X;

import android.graphics.Path;

/* loaded from: classes5.dex */
public final class Et6 extends C06G implements InterfaceC7430Evn {
    public final long A00;
    public final long A01;

    @Override // X.InterfaceC7430Evn
    public final void A4c(Path path, C7377EtL c7377EtL) {
        C7384Etj.A0Y(path, 0);
        long j = this.A01;
        path.addOval(BV8.A0P(AnonymousClass001.A00(j), AnonymousClass004.A00(j), this.A00), Path.Direction.CW);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Et6) {
                Et6 et6 = (Et6) obj;
                if (this.A01 != et6.A01 || this.A00 != et6.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A00, AnonymousClass005.A07(this.A01));
    }

    public Et6(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
