package X;

import java.time.Instant;

/* renamed from: X.FyD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9086FyD {
    public final int A00;
    public final long A01;
    public final C9012Fwp A02;
    public final C10457Hje A03;
    public final String A04;
    public final String A05;
    public final Instant A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9086FyD) {
                C9086FyD c9086FyD = (C9086FyD) obj;
                if (!this.A05.equals(c9086FyD.A05) || !this.A02.equals(c9086FyD.A02) || !this.A06.equals(c9086FyD.A06) || !C7384Etj.areEqual(this.A04, c9086FyD.A04) || this.A01 != c9086FyD.A01 || !C7384Etj.areEqual(this.A03, c9086FyD.A03) || this.A00 != c9086FyD.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C60R.A00(this.A01, (AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A02, AnonymousClass001.A0G(this.A05))) + BV7.A0I(this.A04)) * 31) + C8j4.A0E(this.A03, 0)) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Metadata(id='");
        sbA0x.append(this.A05);
        sbA0x.append("', dataOrigin=");
        sbA0x.append(this.A02);
        sbA0x.append(", lastModifiedTime=");
        sbA0x.append(this.A06);
        sbA0x.append(", clientRecordId=");
        sbA0x.append(this.A04);
        sbA0x.append(", clientRecordVersion=");
        sbA0x.append(this.A01);
        sbA0x.append(", device=");
        sbA0x.append(this.A03);
        sbA0x.append(", recordingMethod=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C9086FyD(C9012Fwp c9012Fwp, C10457Hje c10457Hje, String str, String str2, Instant instant, int i, long j) {
        this.A00 = i;
        this.A05 = str;
        this.A02 = c9012Fwp;
        this.A06 = instant;
        this.A04 = str2;
        this.A01 = j;
        this.A03 = c10457Hje;
    }
}
