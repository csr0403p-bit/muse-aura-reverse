package X;

import X.AOd;
import androidx.compose.animation.core.Animatable$runAnimation$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AT5<T, V extends AOd> {
    public V A00;
    public V A01;
    public T A02;
    public T A03;
    public final AT7<T, V> A04;
    public final V A05;
    public final V A06;
    public final AOZ A07;
    public final C1003AOr<T> A08;
    public final C31w<T, V> A09;
    public final MutableState A0A;
    public final MutableState A0B;
    public final T A0C;

    public static final Object A00(AT5 at5, AOc aOc, Object obj, Object obj2, HtJ htJ, G0U g0u) {
        AT7<T, V> at7 = at5.A04;
        Object value = at7.A05.getValue();
        C31w<T, V> c31w = at5.A09;
        C0997AOa c0997AOa = new C0997AOa(aOc, ((AOl) c31w).A01.invoke(obj2), c31w, value, obj);
        long j = at7.A01;
        return Hxb.A00(new BUK(C3UZ.A02, at5.A07, null, new Animatable$runAnimation$2(at5, c0997AOa, obj2, null, g0u, j)), htJ);
    }

    public static final Object A01(AT5 at5, Object obj) {
        if (!at5.A00.equals(at5.A05) || !at5.A01.equals(at5.A06)) {
            AOl aOl = (AOl) at5.A09;
            V vInvoke = aOl.A01.invoke(obj);
            int iA02 = vInvoke.A02();
            boolean z = false;
            for (int i = 0; i < iA02; i++) {
                float fA01 = vInvoke.A01(i);
                V v = at5.A00;
                if (fA01 < v.A01(i) || vInvoke.A01(i) > at5.A01.A01(i)) {
                    vInvoke.A05(i, ATD.A03(vInvoke.A01(i), v.A01(i), at5.A01.A01(i)));
                    z = true;
                }
            }
            if (z) {
                return aOl.A00.invoke(vInvoke);
            }
        }
        return obj;
    }

    public static final void A02(AT5 at5) {
        AT7<T, V> at7 = at5.A04;
        at7.A02.A04();
        at7.A01 = Long.MIN_VALUE;
        MutableState.A09(false, at5.A0A);
    }

    public final T A03() {
        return ((AOl) this.A09).A00.invoke(this.A04.A02);
    }

    public final Object A04(T t, HtJ<? super Unit> htJ) {
        Object objA00 = Hxb.A00(new BUK(C3UZ.A02, this.A07, null, new BU7(this, t, null, 0)), htJ);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final boolean A05() {
        return MutableState.A0A(this.A0A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AT5(C31w c31w, Object obj, Object obj2) {
        this.A09 = c31w;
        this.A0C = obj2;
        this.A04 = new AT7<>(null, c31w, obj, Long.MIN_VALUE, Long.MIN_VALUE, false);
        AGE age = AGE.A00;
        this.A0A = new ParcelableSnapshotMutableState(age, false);
        this.A0B = new ParcelableSnapshotMutableState(age, obj);
        this.A07 = new AOZ();
        this.A08 = new C1003AOr<>(obj2, 1.0f, 1500.0f);
        V v = this.A04.A02;
        boolean z = v instanceof AOW;
        V v2 = z ? AT8.A00 : v instanceof ARY ? AT8.A02 : v instanceof ATA ? AT8.A04 : AT8.A06;
        this.A05 = v2;
        V v3 = z ? AT8.A01 : v instanceof ARY ? AT8.A03 : v instanceof ATA ? AT8.A05 : AT8.A07;
        this.A06 = v3;
        this.A00 = v2;
        this.A01 = v3;
    }
}
