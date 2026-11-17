package X;

import com.meta.health.healthconnect.HealthConnectPlugin;

/* renamed from: X.FtN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8905FtN extends HzP {
    public final int $t;
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8905FtN(Object obj, HealthConnectPlugin healthConnectPlugin, HtJ<? super C8905FtN> htJ) {
        super(healthConnectPlugin);
        this.$t = htJ;
        this.A05 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A04 = obj;
        this.A01 |= Integer.MIN_VALUE;
        Object obj2 = this.A05;
        return i != 0 ? ((C10649I0t) obj2).collect(null, this) : ((HealthConnectPlugin) obj2).AB4(null, this);
    }
}
