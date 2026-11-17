package X;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* renamed from: X.BTp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2315BTp extends HzP {
    public final int $t;
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final Object A05;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A04 = obj;
        this.A01 |= Integer.MIN_VALUE;
        Object obj2 = this.A05;
        return i != 0 ? ((UpdatableAnimationState) obj2).A00(null, null, this) : MouseWheelScrollingLogic.A02(null, (MouseWheelScrollingLogic) obj2, null, this, 0.0f, 0.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2315BTp(Object obj, MouseWheelScrollingLogic mouseWheelScrollingLogic, HtJ<? super C2315BTp> htJ) {
        super(mouseWheelScrollingLogic);
        this.$t = htJ;
        this.A05 = obj;
    }
}
