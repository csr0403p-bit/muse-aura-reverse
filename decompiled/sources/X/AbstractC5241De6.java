package X;

/* renamed from: X.De6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5241De6 {
    public static final <Type> C4989DKl<Type> A00(int i) {
        C5249DeE c5249DeEA00 = C5249DeE.A00();
        C5242De7 c5242De7 = null;
        int iIntValue = ((De5) C3bH.A00(i, AbstractC5257DeM.get(C4JM.A00()).AK2(), null)).A00.intValue();
        if (iIntValue != -1) {
            c5242De7 = c5249DeEA00 != null ? new C5242De7(c5249DeEA00, iIntValue) : new C5242De7(iIntValue);
        }
        return new C4989DKl<>(new C3628CaH(c5242De7));
    }
}
