package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.room.coroutines.PooledConnectionImpl;

/* renamed from: X.BTn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2313BTn extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2313BTn(Object obj, AsyncTypefaceCache asyncTypefaceCache, HtJ<? super C2313BTn> htJ) {
        super(asyncTypefaceCache);
        this.$t = htJ;
        this.A03 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return TapGestureDetectorKt.A04(null, null, this, false);
            case 1:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return TapGestureDetectorKt.A01(null, null, this);
            case 2:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AsyncTypefaceCache) this.A03).A01(null, this, null, false);
            default:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return PooledConnectionImpl.A02((PooledConnectionImpl) this.A03, this, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2313BTn(int i, HtJ<? super C2313BTn> htJ) {
        super(htJ);
        this.$t = i;
    }
}
