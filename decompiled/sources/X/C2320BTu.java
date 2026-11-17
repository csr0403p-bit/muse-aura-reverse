package X;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;

/* renamed from: X.BTu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2320BTu extends HzP {
    public final int $t;
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A07 = obj;
        this.A01 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return DragGestureDetectorKt.A08(null, this, null, 0, 0L);
            case 1:
                return DragGestureDetectorKt.A0A(null, this, null, 0L);
            case 2:
                return DragGestureDetectorKt.A0B(null, this, null, 0L);
            default:
                return DragGestureDetectorKt.A09(null, this, null, 0, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2320BTu(int i, HtJ<? super C2320BTu> htJ) {
        super(htJ);
        this.$t = i;
    }
}
