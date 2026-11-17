package X;

import com.facebook.aura.network.AuraAcceptLanguage;
import java.util.Arrays;

/* renamed from: X.DhZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5382DhZ {
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C6154Dwx[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C5382DhZ c5382DhZ = (C5382DhZ) obj;
                if (!this.A03.equals(c5382DhZ.A03) || !Arrays.equals(this.A04, c5382DhZ.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iA0B = BV8.A0B(this.A03) + Arrays.hashCode(this.A04);
        this.A00 = iA0B;
        return iA0B;
    }

    public final String toString() {
        return FGI.A0U(this.A03, ": ", Arrays.toString(this.A04));
    }

    public C5382DhZ(String str, C6154Dwx... c6154DwxArr) {
        String str2;
        int length = c6154DwxArr.length;
        C1G.A07(AnonymousClass002.A1N(length));
        this.A03 = str;
        this.A04 = c6154DwxArr;
        this.A01 = length;
        int iA01 = AbstractC6161Dx4.A01(c6154DwxArr[0].A0b);
        this.A02 = iA01 == -1 ? AbstractC6161Dx4.A01(c6154DwxArr[0].A0X) : iA01;
        C6154Dwx[] c6154DwxArr2 = this.A04;
        C6154Dwx c6154Dwx = c6154DwxArr2[0];
        String binaryString = c6154Dwx.A0a;
        String str3 = (binaryString == null || binaryString.equals(AuraAcceptLanguage.UNDETERMINED_TAG)) ? "" : binaryString;
        int i = c6154Dwx.A0J;
        int i2 = i | 16384;
        for (int i3 = 1; i3 < c6154DwxArr2.length; i3++) {
            String binaryString2 = c6154DwxArr2[i3].A0a;
            if (str3.equals((binaryString2 == null || binaryString2.equals(AuraAcceptLanguage.UNDETERMINED_TAG)) ? "" : binaryString2)) {
                int i4 = c6154DwxArr2[i3].A0J;
                if (i2 != (i4 | 16384)) {
                    binaryString = Integer.toBinaryString(i);
                    binaryString2 = Integer.toBinaryString(i4);
                    str2 = "role flags";
                }
            } else {
                str2 = "languages";
            }
            StringBuilder sbA0x = C3cI.A0x("Different ", str2);
            sbA0x.append(" combined in one TrackGroup: '");
            sbA0x.append(binaryString);
            sbA0x.append("' (track 0) and '");
            sbA0x.append(binaryString2);
            sbA0x.append("' (track ");
            sbA0x.append(i3);
            CNC.A05("TrackGroup", "", C3cG.A0Q(BV7.A10(sbA0x)));
            return;
        }
    }
}
