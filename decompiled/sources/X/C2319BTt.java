package X;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;

/* renamed from: X.BTt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2319BTt extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/9sT;LX/HtJ<-LX/BTt;>;)V */
    public C2319BTt(HtJ htJ, C9sT c9sT) {
        super(htJ);
        this.$t = 3;
        this.A06 = c9sT;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A06 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return DragGestureDetectorKt.A06(null, this, null, 0L);
            case 1:
                this.A06 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return DragGestureDetectorKt.A07(null, this, null, 0L);
            case 2:
                this.A06 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return MouseWheelScrollingLogic.A03(null, null, this, null, null, null, 0L);
            default:
                this.A05 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return C9sT.A00(null, this, (C9sT) this.A06);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2319BTt(int i, HtJ<? super C2319BTt> htJ) {
        super(htJ);
        this.$t = i;
    }
}
