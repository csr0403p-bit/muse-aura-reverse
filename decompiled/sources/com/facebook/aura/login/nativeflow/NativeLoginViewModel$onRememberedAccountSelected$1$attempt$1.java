package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NativeLoginViewModel$onRememberedAccountSelected$1$attempt$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ HatchAuthFlowContext.SsoSourceCounts $rowSourceCounts;
    public final /* synthetic */ NativeLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$onRememberedAccountSelected$1$attempt$1(NativeLoginViewModel nativeLoginViewModel, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts) {
        super(1);
        this.this$0 = nativeLoginViewModel;
        this.$rowSourceCounts = ssoSourceCounts;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(boolean r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L26
            com.facebook.aura.analytics.hatch.caa.HatchCaaLoginCredentialType r5 = com.facebook.aura.analytics.hatch.caa.HatchCaaLoginCredentialType.NONCE
        L4:
            com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger r3 = com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger.INSTANCE
            com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = r6.this$0
            java.lang.String r2 = r0.submittedContactPoint
            r1 = 0
            com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep r0 = com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep.LANDING
            r3.logCredentialLoginStart(r2, r0, r1, r5)
        L10:
            com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger r4 = com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger.INSTANCE
            r3 = 0
            com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext$SsoSourceCounts r0 = r6.$rowSourceCounts
            r4.logAymhLoginClicked(r3, r5, r0)
            if (r7 == 0) goto L25
            com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = r6.this$0
            java.lang.String r2 = r0.submittedContactPoint
            com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep r1 = com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep.LANDING
            com.facebook.aura.analytics.hatch.caa.HatchCaaLoginCredentialType r0 = com.facebook.aura.analytics.hatch.caa.HatchCaaLoginCredentialType.NONCE
            r4.logLoginAttempt(r2, r1, r0, r3)
        L25:
            return
        L26:
            com.facebook.aura.analytics.hatch.caa.HatchCaaLoginCredentialType r5 = com.facebook.aura.analytics.hatch.caa.HatchCaaLoginCredentialType.OTP
            com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = r6.this$0
            java.lang.String r0 = r0.submittedContactPoint
            if (r0 != 0) goto L10
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onRememberedAccountSelected$1$attempt$1.invoke(boolean):void");
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
