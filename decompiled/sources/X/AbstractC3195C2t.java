package X;

/* renamed from: X.C2t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3195C2t {
    public static final byte[] A00;
    public static final String[] A01;

    public static final void A00(StringBuilder sb, String str) {
        C7384Etj.A0Y(str, 1);
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            String[] strArr = A01;
            if (cCharAt < ']' && strArr[cCharAt] != null) {
                sb.append((CharSequence) str, i, i2);
                sb.append(strArr[cCharAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, length);
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    static {
        String[] strArr = new String[93];
        int i = 0;
        int i2 = 0;
        do {
            int i3 = (i2 >> 12) & 15;
            int i4 = i3 + 87;
            if (i3 < 10) {
                i4 = i3 + 48;
            }
            char c = (char) i4;
            int i5 = (i2 >> 8) & 15;
            int i6 = i5 + 87;
            if (i5 < 10) {
                i6 = i5 + 48;
            }
            char c2 = (char) i6;
            int i7 = (i2 >> 4) & 15;
            int i8 = i7 + 87;
            if (i7 < 10) {
                i8 = i7 + 48;
            }
            char c3 = (char) i8;
            int i9 = i2 & 15;
            int i10 = i9 + 87;
            if (i9 < 10) {
                i10 = i9 + 48;
            }
            char c4 = (char) i10;
            StringBuilder sb = new StringBuilder("\\u");
            sb.append(c);
            sb.append(c2);
            sb.append(c3);
            sb.append(c4);
            strArr[i2] = sb.toString();
            i2++;
        } while (i2 < 32);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        A01 = strArr;
        byte[] bArr = new byte[93];
        do {
            bArr[i] = 1;
            i++;
        } while (i < 32);
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        A00 = bArr;
    }
}
