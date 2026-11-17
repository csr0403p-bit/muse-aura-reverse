package X;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class AdK {
    public static final int A00(Ae5 ae5) {
        Ad2 ad2 = (Ad2) ae5;
        int i = 0;
        boolean zA1Z = AnonymousClass002.A1Z(ad2.A09, EnumC1108AYu.A03);
        List<Ad0> list = ad2.A0D;
        if (list.isEmpty()) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Ad0 ad0 = list.get(i2);
            int i4 = zA1Z ? ad0.A03 : ad0.A00;
            if (i4 == -1) {
                i2++;
            } else {
                int iMax = 0;
                while (i2 < list.size()) {
                    Ad0 ad02 = list.get(i2);
                    if ((zA1Z ? ad02.A03 : ad02.A00) != i4) {
                        break;
                    }
                    long j = list.get(i2).A0B;
                    iMax = Math.max(iMax, (int) (zA1Z ? j & 4294967295L : j >> 32));
                    i2++;
                }
                i += iMax;
                i3++;
            }
        }
        return (i / i3) + ad2.A04;
    }
}
