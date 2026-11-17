package X;

import androidx.glance.session.WorkManagerProxy$Companion$Default$1;
import androidx.room.coroutines.Pool;

/* renamed from: X.Ef4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7057Ef4 extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7057Ef4(Object obj, WorkManagerProxy$Companion$Default$1 workManagerProxy$Companion$Default$1, HtJ<? super C7057Ef4> htJ) {
        super(workManagerProxy$Companion$Default$1);
        this.$t = htJ;
        this.A02 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return i != 0 ? ((Pool) this.A02).A00(this) : ((WorkManagerProxy$Companion$Default$1) this.A02).AiY(null, null, this);
    }
}
