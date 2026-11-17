package X;

import androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1;

/* renamed from: X.60A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C60A extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C60A(Object obj, AnchoredDraggableKt$restartable$2$1<? super T> anchoredDraggableKt$restartable$2$1, HtJ<? super C60A> htJ) {
        super(anchoredDraggableKt$restartable$2$1);
        this.$t = htJ;
        this.A04 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A04;
        return i != 0 ? ((C3yZ) obj2).collect(null, this) : ((AnchoredDraggableKt$restartable$2$1) obj2).emit(null, this);
    }
}
