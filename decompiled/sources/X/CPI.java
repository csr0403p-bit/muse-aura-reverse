package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CPI {
    public volatile boolean A03;
    public String[] A02 = new String[10];
    public int[] A01 = new int[5];
    public int A00 = 0;

    public final void A00(String str, String str2, int i) {
        if (this.A03) {
            throw new IllegalStateException("Attempted to modify locked instance of PointData");
        }
        int i2 = this.A00;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i2 >= length) {
            int i3 = length + (length >> 1);
            this.A01 = Arrays.copyOf(iArr, i3);
            this.A02 = (String[]) Arrays.copyOf(this.A02, i3 * 2);
        }
        int i4 = this.A00;
        int i5 = i4 * 2;
        String[] strArr = this.A02;
        strArr[i5] = str;
        strArr[i5 + 1] = str2;
        this.A01[i4] = i;
        this.A00 = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CPI) {
            CPI cpi = (CPI) obj;
            int i = this.A00;
            if (i == cpi.A00) {
                int i2 = i * 2;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        for (int i4 = 0; i4 < i; i4++) {
                            if (this.A01[i4] == cpi.A01[i4]) {
                            }
                        }
                        return true;
                    }
                    String str = this.A02[i3];
                    String str2 = cpi.A02[i3];
                    if (str == null) {
                        if (str2 != null) {
                            break;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    i3++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = i * 2;
        int iA0H = 31;
        for (int i3 = 0; i3 < i2; i3++) {
            String str = this.A02[i3];
            if (str != null) {
                iA0H = AnonymousClass001.A0H(str, iA0H * 31);
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            iA0H = (iA0H * 31) + this.A01[i4];
        }
        return iA0H;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 1 && this.A01[0] == 1) {
            String[] strArr = this.A02;
            if ("__key".equals(strArr[0])) {
                return strArr[1];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append('\"');
            String[] strArr2 = this.A02;
            sb.append(strArr2[i2]);
            sb.append("\":\"");
            sb.append(strArr2[i2 + 1]);
            sb.append("\",");
            i2 += 2;
        }
        sb.replace(sb.length() - 1, sb.length(), "}");
        return sb.toString();
    }
}
