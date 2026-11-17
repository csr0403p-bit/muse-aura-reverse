package X;

import androidx.glance.state.GlanceState;

/* renamed from: X.8iX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iX extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iX(GlanceState glanceState, GlanceState glanceState2, HtJ<? super C8iX> htJ) {
        super(glanceState2);
        this.$t = htJ;
        this.A06 = glanceState;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A05 = obj;
        this.A00 |= Integer.MIN_VALUE;
        GlanceState glanceState = (GlanceState) this.A06;
        return i != 0 ? GlanceState.A00(null, glanceState, null, null, this) : glanceState.A01(null, null, null, this);
    }
}
