package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.CoroutineConnectionManager;
import com.meta.health.healthconnect.HealthConnectPlugin;

/* renamed from: X.FtL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8903FtL extends HzP {
    public final int $t;
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final Object A08;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A08;
        return i != 0 ? HealthConnectPlugin.A0B((HealthConnectPlugin) obj2, null, null, null, null, this, null, 0L) : ((CoroutineConnectionManager) obj2).A00(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8903FtL(Object obj, CoroutineConnectionManager coroutineConnectionManager, HtJ<? super C8903FtL> htJ) {
        super(coroutineConnectionManager);
        this.$t = htJ;
        this.A08 = obj;
    }
}
