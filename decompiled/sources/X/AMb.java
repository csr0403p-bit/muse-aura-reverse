package X;

import X.AMZ;
import androidx.compose.runtime.MutableState;
import java.util.List;

/* loaded from: classes4.dex */
public final class AMb<T extends AMZ> {
    public B9Z<? extends AMZ> A00;
    public final MutableState A01;
    public final MutableState A02;
    public final MutableState A03;
    public final MutableState A04;

    public AMb(T t, List<? extends T> list, List<? extends T> list2) {
        AMc aMc = AMc.A00;
        AGE age = AGE.A00;
        this.A04 = C3cG.A08(age, aMc);
        this.A01 = C3cG.A08(age, list);
        this.A02 = C3cG.A08(age, t);
        this.A03 = C3cG.A08(age, list2);
    }
}
