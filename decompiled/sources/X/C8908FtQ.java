package X;

import com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge;
import com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.meta.health.core.MetaHealthQueryObservationSession;
import com.meta.health.core.ObserverBuffer;
import com.meta.health.healthconnect.HealthConnectPlugin;

/* renamed from: X.FtQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8908FtQ extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8908FtQ(Object obj, IapBloksBridge iapBloksBridge, HtJ<? super C8908FtQ> htJ) {
        super(iapBloksBridge);
        this.$t = htJ;
        this.A06 = obj;
    }

    public static Object A00(Object obj, C8908FtQ c8908FtQ) {
        c8908FtQ.A05 = obj;
        c8908FtQ.A00 |= Integer.MIN_VALUE;
        return c8908FtQ.A06;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                return IapBloksBridge.A01(null, (IapBloksBridge) A00(obj, this), null, null, null, this);
            case 1:
                return IapQuoteController.A02(null, (IapQuoteController) A00(obj, this), null, null, this);
            case 2:
                return MetaAiRsysSdkRealTimeSession.A00(null, (MetaAiRsysSdkRealTimeSession) A00(obj, this), null, this);
            case 3:
                return ((MetaHealthQueryObservationSession) A00(obj, this)).A00(this);
            case 4:
                return ((ObserverBuffer) A00(obj, this)).A00(null, null, null, this);
            default:
                return ((HealthConnectPlugin) A00(obj, this)).A4w(null, this);
        }
    }
}
