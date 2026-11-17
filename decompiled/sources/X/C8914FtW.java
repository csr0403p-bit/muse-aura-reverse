package X;

import androidx.health.connect.client.impl.HealthConnectClientImpl;
import androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl;
import androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.meta.health.healthconnect.HealthConnectObserverImpl;

/* renamed from: X.FtW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8914FtW extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8914FtW(HtJ<? super C8914FtW> htJ) {
        super(htJ);
        this.$t = 9;
    }

    public static void A00(Object obj, C8914FtW c8914FtW) {
        c8914FtW.A01 = obj;
        c8914FtW.A00 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                A00(obj, this);
                return ((HealthConnectClientImpl) this.A02).A48(null, this);
            case 1:
                A00(obj, this);
                return ((HealthConnectClientImpl) this.A02).A49(null, this);
            case 2:
                A00(obj, this);
                return ((HealthConnectClientImpl) this.A02).ADV(null, this);
            case 3:
                A00(obj, this);
                return ((HealthConnectClientImpl) this.A02).ADW(null, this);
            case 4:
                A00(obj, this);
                return ((HealthConnectClientImpl) this.A02).AG0(this);
            case 5:
                A00(obj, this);
                return ((HealthConnectClientImpl) this.A02).AZS(null, this);
            case 6:
                A00(obj, this);
                return ((HealthConnectClientUpsideDownImpl) this.A02).ADW(null, this);
            case 7:
                A00(obj, this);
                return ((HealthConnectClientUpsideDownImpl) this.A02).AZS(null, this);
            case 8:
                A00(obj, this);
                return ((HealthConnectClientUpsideDownImpl) this.A02).A08(null, this);
            case 9:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return HealthConnectClientAggregationExtensionsKt.A01(null, null, null, this);
            case 10:
                A00(obj, this);
                return MetaAiRsysSdkRealTimeSession.A03((MetaAiRsysSdkRealTimeSession) this.A02, this);
            case 11:
                A00(obj, this);
                return ((HealthConnectObserverImpl) this.A02).AgQ(this);
            default:
                A00(obj, this);
                return C9273GCa.A02(this, (C9273GCa) this.A02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8914FtW(Object obj, HealthConnectClientImpl healthConnectClientImpl, HtJ<? super C8914FtW> htJ) {
        super(healthConnectClientImpl);
        this.$t = htJ;
        this.A02 = obj;
    }
}
