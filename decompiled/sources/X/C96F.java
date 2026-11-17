package X;

import java.util.Collection;
import java.util.HashMap;
import kotlin.Unit;

/* renamed from: X.96F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C96F {
    public final HashMap<Object, Integer> A03 = new HashMap<>();
    public float A02 = Float.NaN;
    public AXN A00 = new ATH(1.0f, 1.0f);
    public G0U<? super C1DG, Unit> A01 = new BUU(24);

    public static final void A00(C96F c96f) {
        Collection<Integer> collectionValues = c96f.A03.values();
        C7384Etj.A0U(collectionValues);
        Number number = (Number) AbstractC0878AGe.A07(collectionValues);
        if (number != null) {
            float fAgy = c96f.A00.Agy(number.intValue());
            float f = c96f.A02;
            if (C1DG.A08(f, Float.NaN) || C8j3.A01(fAgy, f) > 0.5f) {
                c96f.A02 = fAgy;
                c96f.A01.invoke(C8j3.A0k(fAgy));
            }
        }
    }
}
