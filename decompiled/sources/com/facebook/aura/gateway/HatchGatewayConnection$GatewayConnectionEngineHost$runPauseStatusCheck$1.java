package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C60N;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchPauseOperations;
import com.facebook.aura.perf.HatchPauseQplLogger;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$runPauseStatusCheck$1", f = "HatchGatewayConnection.kt", l = {2350}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$runPauseStatusCheck$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $onPaused;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HatchGatewayConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$runPauseStatusCheck$1(HatchGatewayConnection hatchGatewayConnection, Function0<Unit> function0, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$runPauseStatusCheck$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGatewayConnection;
        this.$onPaused = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$runPauseStatusCheck$1(this.this$0, this.$onPaused, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        String strA00 = C60N.A00(13);
        try {
        } catch (CancellationException e) {
            HatchPauseQplLogger.INSTANCE.endStatusCheckException(e, 0);
            throw e;
        } catch (Exception e2) {
            HatchPauseQplLogger.INSTANCE.endStatusCheckException(e2, 0);
            CFK.A0J(strA00, e2, FGI.A0M("Failed to check pause status: ", e2.getMessage()));
        }
        if (i == 0) {
            Hwg.A00(obj);
            HatchGatewayConnection hatchGatewayConnection = this.this$0;
            String str = hatchGatewayConnection.currentWsUrl;
            String strVmBoundAuthToken = VmAuthTokenKt.vmBoundAuthToken(hatchGatewayConnection.userSession);
            if (str != null && str.length() != 0 && strVmBoundAuthToken.length() != 0) {
                HatchPauseQplLogger.INSTANCE.startStatusCheck(0);
                HatchPauseOperations.Companion companion = HatchPauseOperations.Companion;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = companion.status(str, strVmBoundAuthToken, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchPauseOperations.PauseStatusResult pauseStatusResult = (HatchPauseOperations.PauseStatusResult) obj;
        if (pauseStatusResult instanceof HatchPauseOperations.PauseStatusResult.Success) {
            HatchPauseOperations.PauseStatusResult.Success success = (HatchPauseOperations.PauseStatusResult.Success) pauseStatusResult;
            HatchPauseQplLogger.INSTANCE.endStatusCheckSuccess(success.locked, 0);
            if (success.locked) {
                this.$onPaused.invoke();
            }
        } else {
            if (!(pauseStatusResult instanceof HatchPauseOperations.PauseStatusResult.Failed)) {
                throw C3cG.A0q();
            }
            HatchPauseQplLogger.INSTANCE.endStatusCheckFailure(((HatchPauseOperations.PauseStatusResult.Failed) pauseStatusResult).message, 0);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$runPauseStatusCheck$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
