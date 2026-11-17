package X;

import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes4.dex */
public final class BSN implements C78g {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public BSN(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C78g
    public final void dispose() {
        AOP aop;
        Object obj;
        SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList;
        switch (this.$t) {
            case 2:
                ((C1049ASt) this.A00).A03.A0I(this.A01);
                return;
            case 3:
                AOP aop2 = (AOP) this.A00;
                obj = this.A01;
                snapshotStateList = aop2.A0B;
                snapshotStateList.remove(obj);
                return;
            case 4:
                aop = (AOP) this.A01;
                AOT aot = (AOT) ((AOS) this.A00).A00.getValue();
                if (aot != null) {
                    obj = aot.A02;
                    snapshotStateList = aop.A0A;
                    snapshotStateList.remove(obj);
                    return;
                }
                return;
            case 5:
                aop = (AOP) this.A00;
                obj = this.A01;
                snapshotStateList = aop.A0A;
                snapshotStateList.remove(obj);
                return;
            case 6:
                C1743Apg c1743Apg = (C1743Apg) this.A00;
                View view = (View) this.A01;
                int i = c1743Apg.A00 - 1;
                c1743Apg.A00 = i;
                if (i == 0) {
                    AbstractC8082FSn.A00(view, null);
                    C8490Fex.A01(view, null);
                    view.removeOnAttachStateChangeListener(c1743Apg.A08);
                    return;
                }
                return;
            case 7:
                C0917AHt<Object> c0917AHt = ((AGD) this.A01).A00;
                Object obj2 = this.A00;
                c0917AHt.A04[C0917AHt.A01(c0917AHt, obj2)] = obj2;
                return;
            case 8:
                ((C1695AoZ) this.A01).A02.remove(this.A00);
                return;
            case 9:
                ((C1HY) this.A00).getLifecycle().A05((C2Kw) this.A01);
                return;
            case 10:
                ((B9Z) this.A00).A01();
                ((AMb) this.A01).A00 = null;
                return;
            default:
                B83 b83 = (B83) this.A00;
                B9U b9u = (B9U) this.A01;
                if (b83.A01 != null) {
                    b9u.A01.A01();
                    return;
                } else {
                    if (b83.A00 == null) {
                        throw C3cG.A0Q("Unreachable");
                    }
                    b9u.A00.A01();
                    return;
                }
        }
    }
}
