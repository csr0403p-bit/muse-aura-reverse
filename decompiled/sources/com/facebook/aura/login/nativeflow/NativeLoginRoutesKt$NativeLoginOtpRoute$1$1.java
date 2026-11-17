package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.caa.HatchCaaFlowSource;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger;
import com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationEventStep;
import com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationLogger;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginOtpRoute$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $pageShownLogged$delegate;
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginOtpRoute$1$1(NativeLoginViewModel nativeLoginViewModel, MutableState<Boolean> mutableState) {
        super(1);
        this.$viewModel = nativeLoginViewModel;
        this.$pageShownLogged$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!MutableState.A0A((MutableState) this.$pageShownLogged$delegate)) {
            MutableState.A09(true, this.$pageShownLogged$delegate);
            OtpFunnel otpFunnel = this.$viewModel.getOtpFunnel();
            if (otpFunnel.isRegistration) {
                HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
                HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep = HatchCaaRegistrationEventStep.CONTACTPOINT;
                String str = this.$viewModel.submittedContactPoint;
                HatchCaaFlowSource hatchCaaFlowSource = otpFunnel.source;
                HatchNtpSourceApp hatchNtpSourceApp = this.$viewModel.ntpSourceApp;
                hatchCaaRegistrationLogger.logRegistrationStart(hatchCaaRegistrationEventStep, str, hatchCaaFlowSource, null, null, hatchNtpSourceApp != null ? NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchNtpSourceApp) : null, null);
                String str2 = this.$viewModel.submittedContactPoint;
                HatchCaaFlowSource hatchCaaFlowSource2 = otpFunnel.source;
                HatchNtpSourceApp hatchNtpSourceApp2 = this.$viewModel.ntpSourceApp;
                hatchCaaRegistrationLogger.logConfirmationStart(str2, hatchCaaFlowSource2, hatchNtpSourceApp2 != null ? NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchNtpSourceApp2) : null);
            } else {
                HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
                hatchCaaLoginLogger.logLoginStart(this.$viewModel.submittedContactPoint, otpFunnel.source);
                hatchCaaLoginLogger.logOtpPageShown(this.$viewModel.submittedContactPoint, otpFunnel.source);
            }
            this.$viewModel.onRememberDeviceShown(HatchCaaLoginEventStep.OTP);
        }
        return new C78g() { // from class: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginOtpRoute$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
