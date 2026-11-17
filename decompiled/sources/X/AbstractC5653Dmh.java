package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.Dmh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5653Dmh {
    public static final Map<EnumC5618Dlz, Boolean> A01 = new EnumMap(EnumC5618Dlz.class);
    public static final Map<EnumC5679DnI, Integer> A02 = new EnumMap(EnumC5679DnI.class);
    public static final Map<BW4, Long> A00 = new EnumMap(BW4.class);

    static {
        for (EnumC5618Dlz enumC5618Dlz : EnumC5618Dlz.values()) {
            A01.put(enumC5618Dlz, false);
        }
        for (EnumC5679DnI enumC5679DnI : EnumC5679DnI.values()) {
            A02.put(enumC5679DnI, -1);
        }
        for (BW4 bw4 : BW4.values()) {
            A00.put(bw4, -1L);
        }
        Map<EnumC5618Dlz, Boolean> map = A01;
        EnumC5618Dlz enumC5618Dlz2 = EnumC5618Dlz.A0Z;
        Boolean boolA0i = AnonymousClass001.A0i();
        map.put(enumC5618Dlz2, boolA0i);
        map.put(EnumC5618Dlz.A0R, boolA0i);
        map.put(EnumC5618Dlz.A2K, boolA0i);
        map.put(EnumC5618Dlz.A1b, boolA0i);
        map.put(EnumC5618Dlz.A1Q, boolA0i);
        map.put(EnumC5618Dlz.A2J, boolA0i);
        BV4.A1H(EnumC5679DnI.A06, A02, 100);
    }

    public static final int A00(EnumC5679DnI enumC5679DnI) {
        Integer num = A02.get(enumC5679DnI);
        if (num != null) {
            return AnonymousClass001.A0F(num);
        }
        throw BV4.A0U();
    }

    public static final void A01(EnumC5618Dlz enumC5618Dlz, boolean z) {
        A01.put(enumC5618Dlz, Boolean.valueOf(z));
    }

    public static final void A02(EnumC5679DnI enumC5679DnI, int i) {
        A02.put(enumC5679DnI, Integer.valueOf(i));
    }

    public static final boolean A03(EnumC5618Dlz enumC5618Dlz) {
        return AnonymousClass001.A0i().equals(A01.get(enumC5618Dlz));
    }
}
