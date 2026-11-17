package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class EuG {
    public long A00;
    public String A01;
    public int A02;
    public long A03;
    public long A04;
    public String A05;
    public final F2V A06;
    public final String A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                EuG euG = (EuG) obj;
                if (this.A04 != euG.A04 || this.A03 != euG.A03 || this.A02 != euG.A02 || this.A00 != euG.A00 || this.A08 != euG.A08 || !C6xC.A00(this.A05, euG.A05) || !C6xC.A00(this.A07, euG.A07) || !C6xC.A00(this.A01, euG.A01) || !C6xC.A00(this.A06, euG.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A04), Long.valueOf(this.A03), Integer.valueOf(this.A02), this.A05, this.A07, this.A01, this.A06, Long.valueOf(this.A00), Boolean.valueOf(this.A08)});
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ReferrerDetails{installedVersionCode=");
        sbA0x.append(this.A02);
        sbA0x.append(", installedVersionName='");
        sbA0x.append(this.A05);
        sbA0x.append("', installationMethodType='");
        sbA0x.append(this.A07);
        sbA0x.append("', utm=");
        sbA0x.append(this.A06);
        sbA0x.append(", isZeroRatedContext=");
        sbA0x.append(this.A08);
        return C8j3.A15(sbA0x);
    }

    public EuG(F2V f2v, String str, String str2, String str3, int i, long j, long j2, long j3, boolean z) {
        this.A04 = j;
        this.A03 = j2;
        this.A00 = j3;
        this.A02 = i;
        this.A05 = str;
        this.A07 = str2;
        this.A01 = str3;
        this.A06 = f2v;
        this.A08 = z;
    }
}
