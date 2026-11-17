package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.service.NoiseHttpDemandFence;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.service.HatchGatewayServiceManager$registerNoiseHttpDemandHandler$1$job$1", f = "HatchGatewayServiceManager.kt", l = {245}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayServiceManager$registerNoiseHttpDemandHandler$1$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $connectionKey;
    public final /* synthetic */ long $demandId;
    public final /* synthetic */ NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> $token;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayServiceManager$registerNoiseHttpDemandHandler$1$job$1(NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> sessionToken, long j, String str, HtJ<? super HatchGatewayServiceManager$registerNoiseHttpDemandHandler$1$job$1> htJ) {
        super(2, htJ);
        this.$token = sessionToken;
        this.$demandId = j;
        this.$connectionKey = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayServiceManager$registerNoiseHttpDemandHandler$1$job$1(this.$token, this.$demandId, this.$connectionKey, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
            NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> sessionToken = this.$token;
            long j = this.$demandId;
            String str = this.$connectionKey;
            this.label = 1;
            if (hatchGatewayServiceManager.handleNoiseHttpDemand(sessionToken, j, str, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGatewayServiceManager$registerNoiseHttpDemandHandler$1$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
