package X;

import java.util.Locale;

/* renamed from: X.Eum, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7408Eum {
    public final int A00;
    public final int[] A01;
    public final String[] A02;
    public final String[] A03;

    public C7408Eum(int[] iArr, String[] strArr, String[] strArr2, int i) {
        this.A03 = strArr;
        this.A01 = iArr;
        this.A02 = strArr2;
        this.A00 = i;
    }

    public final String A00(String str, int i, long j, long j2) {
        Locale locale;
        String str2;
        Object objValueOf;
        StringBuilder sbA0w = C60O.A0w();
        int i2 = 0;
        while (true) {
            int i3 = this.A00;
            String[] strArr = this.A03;
            if (i2 >= i3) {
                return AnonymousClass001.A0v(strArr[i3], sbA0w);
            }
            sbA0w.append(strArr[i2]);
            int i4 = this.A01[i2];
            if (i4 == 1) {
                sbA0w.append(str);
            } else {
                if (i4 == 2) {
                    locale = Locale.US;
                    str2 = this.A02[i2];
                    objValueOf = Long.valueOf(j);
                } else if (i4 == 3) {
                    locale = Locale.US;
                    str2 = this.A02[i2];
                    objValueOf = Integer.valueOf(i);
                } else if (i4 == 4) {
                    locale = Locale.US;
                    str2 = this.A02[i2];
                    objValueOf = Long.valueOf(j2);
                }
                sbA0w.append(String.format(locale, str2, objValueOf));
            }
            i2++;
        }
    }
}
