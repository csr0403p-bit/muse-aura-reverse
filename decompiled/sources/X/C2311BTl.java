package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* renamed from: X.BTl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2311BTl extends HzP {
    public final int $t;
    public int A00;
    public long A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2311BTl(Object obj, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, HtJ<? super C2311BTl> htJ) {
        super(androidEdgeEffectOverscrollEffect);
        this.$t = htJ;
        this.A03 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return ((AndroidEdgeEffectOverscrollEffect) this.A03).A4e(this, null, 0L);
            case 1:
                return ((ScrollableNestedScrollConnection) this.A03).mo3onPostFlingRZ2iAVY(0L, 0L, this);
            default:
                return ((NestedScrollNode) this.A03).mo5onPreFlingQWom1Mo(0L, this);
        }
    }
}
