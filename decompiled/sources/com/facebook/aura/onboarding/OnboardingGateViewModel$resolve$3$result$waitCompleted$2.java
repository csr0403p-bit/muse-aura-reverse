package com.facebook.aura.onboarding;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingGateViewModel$resolve$3$result$waitCompleted$2", f = "OnboardingGateViewModel.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class OnboardingGateViewModel$resolve$3$result$waitCompleted$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public int label;
    public final /* synthetic */ OnboardingGateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingGateViewModel$resolve$3$result$waitCompleted$2(OnboardingGateViewModel onboardingGateViewModel, HtJ<? super OnboardingGateViewModel$resolve$3$result$waitCompleted$2> htJ) {
        super(2, htJ);
        this.this$0 = onboardingGateViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new OnboardingGateViewModel$resolve$3$result$waitCompleted$2(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new OnboardingGateViewModel$resolve$3$result$waitCompleted$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGatewayConnection hatchGatewayConnection = this.this$0.gateway;
            this.label = 1;
            if (hatchGatewayConnection.awaitConnected(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return true;
    }
}
