package X;

/* renamed from: X.GFt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9360GFt implements GFw {
    public final int A00;
    public final AnonymousClass777 A01;
    public final String A02;
    public final Object[] A03;

    public C9360GFt(AnonymousClass777 defaultInstance, String info, Object[] objects) {
        char cCharAt;
        this.A01 = defaultInstance;
        this.A02 = info;
        this.A03 = objects;
        int iA00 = AbstractC7607F5u.A00(info);
        if (iA00 >= 55296) {
            int iA0C = iA00 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                cCharAt = info.charAt(i2);
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
