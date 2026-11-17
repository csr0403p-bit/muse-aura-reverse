package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BU9 extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: Removed duplicated region for block: B:8:0x003e A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r6 = r8
            int r1 = r8.$t
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r3 = 1
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L64
            X.Hwg.A00(r9)
            java.lang.Object r0 = r8.A01
            X.3Q0 r0 = (X.C3Q0) r0
            java.lang.Object r1 = r8.A04
            androidx.compose.foundation.lazy.grid.LazyGridState r1 = (androidx.compose.foundation.lazy.grid.LazyGridState) r1
            X.Ad6 r4 = new X.Ad6
            r4.<init>(r0, r1)
            int r7 = r8.A02
            int r8 = r8.A03
            X.AFs<androidx.compose.foundation.lazy.grid.LazyGridState, ?> r0 = androidx.compose.foundation.lazy.grid.LazyGridState.A0O
            androidx.compose.runtime.MutableState<X.Ad2> r1 = r1.A0I
            java.lang.Object r0 = r1.getValue()
            X.Ad2 r0 = (X.Ad2) r0
            int r0 = r0.A05
            int r9 = r0 * 100
            java.lang.Object r0 = r1.getValue()
            X.Ad2 r0 = (X.Ad2) r0
            X.AXN r5 = r0.A0C
            r6.A00 = r3
        L38:
            java.lang.Object r0 = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.A00(r4, r5, r6, r7, r8, r9)
            if (r0 != r2) goto L67
            return r2
        L3f:
            if (r0 != 0) goto L64
            X.Hwg.A00(r9)
            java.lang.Object r1 = r8.A01
            X.3Q0 r1 = (X.C3Q0) r1
            java.lang.Object r0 = r8.A04
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.AdG r4 = new X.AdG
            r4.<init>(r1, r0)
            int r7 = r8.A02
            int r8 = r8.A03
            androidx.compose.runtime.MutableState<X.Act> r0 = r0.A0K
            java.lang.Object r0 = r0.getValue()
            X.Act r0 = (X.C1161Act) r0
            X.AXN r5 = r0.A0C
            r6.A00 = r3
            r9 = 100
            goto L38
        L64:
            X.Hwg.A00(r9)
        L67:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BU9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BU9(Object obj, LazyListState lazyListState, int i, int i2, HtJ<? super BU9> htJ) {
        super(2, lazyListState);
        this.$t = htJ;
        this.A04 = obj;
        this.A02 = i;
        this.A03 = i2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        BU9 bu9 = new BU9(this.A04, htJ, this.A02, this.A03, this.$t != 0 ? 1 : 0);
        bu9.A01 = obj;
        return bu9;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BU9) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}
