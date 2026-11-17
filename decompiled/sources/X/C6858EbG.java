package X;

import androidx.room.TriggerBasedInvalidationTracker;
import androidx.work.impl.WorkerWrapper;

/* renamed from: X.EbG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6858EbG extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6858EbG(Object obj, TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, HtJ<? super C6858EbG> htJ) {
        super(triggerBasedInvalidationTracker);
        this.$t = htJ;
        this.A03 = obj;
    }

    public static Object A00(Object obj, C6858EbG c6858EbG) {
        c6858EbG.A02 = obj;
        c6858EbG.A00 |= Integer.MIN_VALUE;
        return c6858EbG.A03;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                return TriggerBasedInvalidationTracker.A00(null, (TriggerBasedInvalidationTracker) A00(obj, this), this);
            case 1:
                return TriggerBasedInvalidationTracker.A03((TriggerBasedInvalidationTracker) A00(obj, this), this);
            case 2:
                return ((TriggerBasedInvalidationTracker) A00(obj, this)).A04(this);
            case 3:
                return ((F5B) A00(obj, this)).emit(null, this);
            default:
                return WorkerWrapper.A00((WorkerWrapper) A00(obj, this), this);
        }
    }
}
