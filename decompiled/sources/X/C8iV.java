package X;

import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor;

/* renamed from: X.8iV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iV extends HzP {
    public final int $t;
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final Object A06;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A05 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A06;
        return i != 0 ? RetriableApiExecutor.A01((RetriableApiExecutor) obj2, null, null, this) : PlatformSelectionBehaviorsImpl.A01(null, (PlatformSelectionBehaviorsImpl) obj2, null, this, 0L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iV(Object obj, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, HtJ<? super C8iV> htJ) {
        super(platformSelectionBehaviorsImpl);
        this.$t = htJ;
        this.A06 = obj;
    }
}
