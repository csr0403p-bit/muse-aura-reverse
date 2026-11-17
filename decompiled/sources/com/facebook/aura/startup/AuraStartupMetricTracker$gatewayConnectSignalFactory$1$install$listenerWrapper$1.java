package com.facebook.aura.startup;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import X.G0V;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.qpl.startup.signal.PointSignalResult;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraStartupMetricTracker$gatewayConnectSignalFactory$1$install$listenerWrapper$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onRequirementFailed;
    public final /* synthetic */ G0U<String, Unit> $onRequirementMet;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        G0U<String, Unit> g0u;
        String strA0U;
        C7384Etj.A0Y(str, 0);
        if (str.equals(HatchStartupPoints.GATEWAY_REQUIREMENT_END)) {
            PointSignalResult pointSignalResult = PointSignalResult.Companion.parse(str2);
            if (pointSignalResult == null || !pointSignalResult.isFailure()) {
                g0u = this.$onRequirementMet;
                strA0U = "GatewayRequirementMet";
            } else {
                g0u = this.$onRequirementFailed;
                strA0U = FGI.A0U(str, " failed. Reason: ", pointSignalResult.reason);
            }
            g0u.invoke(strA0U);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraStartupMetricTracker$gatewayConnectSignalFactory$1$install$listenerWrapper$1(G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2) {
        super(2);
        this.$onRequirementFailed = g0u;
        this.$onRequirementMet = g0u2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }
}
