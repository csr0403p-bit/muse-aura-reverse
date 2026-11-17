package X;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CD0 {
    public static final Map<Integer, String> A00 = C3cG.A0j();

    public static final String A01(int i) {
        Map<Integer, String> map = A00;
        Integer numValueOf = Integer.valueOf(i);
        String strA0M = map.get(numValueOf);
        if (strA0M == null) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(FGI.A0I("Index ", i, " is out of bounds"));
            }
            strA0M = FGI.A0M(CCn.getModuleName(i % 6), EnumC3180C1k.values()[i / 6].postfix);
            map.put(numValueOf, strA0M);
        }
        return strA0M;
    }

    public static final boolean A02(int i) {
        return i >= 0 && i < CD1.A06.A00().A00;
    }

    public static final int A00(String str) {
        int iA00 = CCn.A00(AbstractC7473ExH.A00(str));
        if (iA00 >= 0) {
            return (EnumC3180C1k.A00(str).ordinal() * 6) + iA00;
        }
        return -3;
    }
}
