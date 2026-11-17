package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.GmD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9953GmD extends C9950Gm8 {
    public final Set<String> A00;

    public C9953GmD(AbstractC9901Gkh<?> abstractC9901Gkh, C9909Gkr c9909Gkr) {
        Set<String> setA0v;
        super(abstractC9901Gkh, c9909Gkr, null, "get", "is");
        Class<?> cls = c9909Gkr.A05;
        RuntimeException runtimeException = C9832GiV.A04;
        if (runtimeException != null) {
            throw runtimeException;
        }
        C9832GiV c9832GiV = C9832GiV.A03;
        Object[] objArrA00 = C9832GiV.A00(c9832GiV, cls);
        if (objArrA00 == null) {
            setA0v = Collections.EMPTY_SET;
        } else {
            int length = objArrA00.length;
            String[] strArr = new String[length];
            int i = 0;
            while (i < length) {
                try {
                    strArr[i] = (String) c9832GiV.A00.invoke(objArrA00[i], null);
                    i++;
                } catch (Exception e) {
                    throw BV4.A0Q(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(length), AbstractC9855Gj3.A06(cls)), e);
                }
            }
            setA0v = BV5.A0v(strArr);
        }
        this.A00 = setA0v;
    }

    @Override // X.C9950Gm8, X.AbstractC10164GqZ
    public final String A04(C9934Glc c9934Glc, String str) {
        return this.A00.contains(str) ? str : super.A04(c9934Glc, str);
    }
}
