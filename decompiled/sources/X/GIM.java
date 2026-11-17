package X;

/* loaded from: classes6.dex */
public final class GIM {
    public final int A00;
    public final GIF A01;
    public final String A02;
    public final Object[] A03;

    public GIM(GIF gif, String str, Object[] objArr) {
        char cCharAt;
        this.A01 = gif;
        this.A02 = str;
        this.A03 = objArr;
        int iA00 = AbstractC7607F5u.A00(str);
        if (iA00 >= 55296) {
            int iA0C = iA00 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                cCharAt = str.charAt(i2);
                if (cCharAt < '\ud800') {
                    break;
                }
                iA0C = AbstractC7607F5u.A0C(cCharAt, i, iA0C);
                i += 13;
                i2 = i3;
            }
            iA00 = iA0C | (cCharAt << i);
        }
        this.A00 = iA00;
    }
}
