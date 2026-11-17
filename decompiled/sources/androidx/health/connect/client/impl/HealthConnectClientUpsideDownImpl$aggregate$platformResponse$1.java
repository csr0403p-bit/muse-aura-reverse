package androidx.health.connect.client.impl;

import X.AbstractC07127nr;
import X.AbstractC4472Cwo;
import X.AbstractC9053Fxb;
import X.AnonymousClass001;
import X.C7Bm;
import X.C9031FxC;
import X.EnumC10460Hji;
import X.G0U;
import X.GBL;
import X.HtJ;
import X.Hwg;
import android.health.connect.AggregateRecordsResponse;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1", f = "HealthConnectClientUpsideDownImpl.kt", l = {634}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1 extends AbstractC07127nr implements G0U<HtJ<? super AggregateRecordsResponse<Object>>, Object> {
    public final /* synthetic */ C9031FxC $request;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, C9031FxC c9031FxC, HtJ<? super HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1> htJ) {
        super(1, htJ);
        this.this$0 = healthConnectClientUpsideDownImpl;
        this.$request = c9031FxC;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1(this.this$0, this.$request, htJ);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super AggregateRecordsResponse<Object>> htJ) {
        return ((HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
            C9031FxC c9031FxC = this.$request;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = c9031FxC;
            this.label = 1;
            GBL gblA04 = C7Bm.A04(this);
            healthConnectClientUpsideDownImpl.A01.aggregate(AbstractC9053Fxb.A01(c9031FxC), healthConnectClientUpsideDownImpl.A03, AbstractC4472Cwo.A00(gblA04));
            obj = gblA04.A0F();
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }
}
