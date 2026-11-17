package X;

import androidx.compose.material3.internal.AnchoredDraggableState;

/* renamed from: X.3be, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3be extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3be(Object obj, AnchoredDraggableState<T> anchoredDraggableState, HtJ<? super C3be> htJ) {
        super(anchoredDraggableState);
        this.$t = htJ;
        this.A03 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A03;
        switch (i) {
            case 0:
                return ((AnchoredDraggableState) obj2).A05(null, this, null);
            case 1:
                return ((AnchoredDraggableState) obj2).A04(null, null, this, null);
            default:
                return ((C3bL) obj2).emit(null, this);
        }
    }
}
