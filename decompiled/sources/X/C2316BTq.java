package X;

import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.room.coroutines.Pool;

/* renamed from: X.BTq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2316BTq extends HzP {
    public final int $t = 0;
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;

    public C2316BTq(HtJ<? super C2316BTq> htJ) {
        super(htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t != 0) {
            this.A04 = obj;
            this.A00 |= Integer.MIN_VALUE;
            return ((Pool) this.A05).A01(this, null, 0L);
        }
        this.A05 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return SelectionGesturesKt.A02(null, null, null, this, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2316BTq(Pool pool, HtJ<? super C2316BTq> htJ) {
        super(htJ);
        this.A05 = pool;
    }
}
