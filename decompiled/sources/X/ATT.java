package X;

import X.AOd;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ATT<T, V extends AOd> {
    public long A00;
    public long A01;
    public V A02;
    public final long A03;
    public final C31w<T, V> A04;
    public final MutableState A05;
    public final MutableState A06;
    public final T A07;
    public final Function0<Unit> A08;

    /* JADX WARN: Multi-variable type inference failed */
    public ATT(AOd aOd, C31w c31w, Object obj, Object obj2, Function0 function0, long j, long j2) {
        this.A04 = c31w;
        this.A07 = obj2;
        this.A03 = j2;
        this.A08 = function0;
        AGE age = AGE.A00;
        this.A06 = C3cG.A08(age, obj);
        this.A02 = (V) AOg.A00(aOd);
        this.A01 = j;
        this.A00 = Long.MIN_VALUE;
        this.A05 = C3cG.A08(age, true);
    }

    public final void A00() {
        MutableState.A09(false, this.A05);
        this.A08.invoke();
    }
}
