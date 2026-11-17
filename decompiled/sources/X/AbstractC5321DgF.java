package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.DgF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5321DgF {
    public static final F0C A02(Integer num, Function0 function0) {
        Object c5322DgG;
        C7384Etj.A0Y(function0, 1);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            c5322DgG = new C5322DgG(null, function0);
        } else if (iIntValue != 1) {
            C5320DgE c5320DgE = new C5320DgE();
            c5320DgE.initializer = function0;
            c5320DgE._value = C5324DgI.A00;
            c5322DgG = c5320DgE;
        } else {
            c5322DgG = new C5319DgD(function0);
        }
        return (F0C) c5322DgG;
    }

    public static final <T> F0C<T> A03(Function0<? extends T> function0) {
        C7384Etj.A0Y(function0, 0);
        return new C5322DgG(null, function0);
    }

    public static F0C A00(Integer num, int i) {
        return A02(num, new C6724EXi(i));
    }

    public static F0C A01(Integer num, Object obj, int i) {
        return A02(num, new EQf(obj, i));
    }
}
