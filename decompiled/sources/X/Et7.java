package X;

import android.graphics.Path;

/* loaded from: classes5.dex */
public final class Et7 extends C06G implements InterfaceC7430Evn {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;

    @Override // X.InterfaceC7430Evn
    public final void A4c(Path path, C7377EtL c7377EtL) {
        C7384Etj.A0Y(path, 0);
        long j = this.A03;
        path.addRoundRect(BV8.A0P(AnonymousClass001.A00(j), AnonymousClass004.A00(j), this.A02), this.A00, this.A01, Path.Direction.CW);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Et7) {
                Et7 et7 = (Et7) obj;
                if (this.A03 != et7.A03 || this.A02 != et7.A02 || Float.compare(this.A00, et7.A00) != 0 || Float.compare(this.A01, et7.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A02(AnonymousClass006.A06(this.A02, AnonymousClass005.A07(this.A03)), this.A00) + Float.floatToIntBits(this.A01);
    }

    public Et7(long j, long j2, float f, float f2) {
        this.A03 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A01 = f2;
    }
}
