package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.hatch.caa.HatchCaaAccountRecoveryLogger;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.utils.navigation.SecureUri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginOtpScreenKt$NativeLoginTryAnotherWayLink$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $contactPoint;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ SecureUri $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginOtpScreenKt$NativeLoginTryAnotherWayLink$1$1(String str, SecureUri secureUri, Context context) {
        super(0);
        this.$contactPoint = str;
        this.$uri = secureUri;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.LOGIN_OTP, HatchComponent.TRY_ANOTHER_WAY_LINK, null, AnonymousClass006.A10(HatchMetadataKey.LOGIN_STEP.getValue(), "try_another_way"), null);
        HatchCaaLoginLogger.INSTANCE.logForgotPasswordButtonClicked(this.$contactPoint);
        HatchCaaAccountRecoveryLogger.INSTANCE.logAccountRecoveryStart(this.$contactPoint, HatchCaaLoginEventStep.OTP);
        String string = this.$uri.uri.toString();
        C7384Etj.A0U(string);
        AuraBrowserLauncherKt.openBrowser(string, this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
