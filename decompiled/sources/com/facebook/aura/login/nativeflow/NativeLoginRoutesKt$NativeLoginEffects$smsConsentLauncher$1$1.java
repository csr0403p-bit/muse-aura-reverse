package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginEffects$smsConsentLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        C7384Etj.A0Y(activityResult, 0);
        if (activityResult.A00 == -1) {
            NativeLoginViewModel nativeLoginViewModel = this.$viewModel;
            Intent intent = activityResult.A01;
            nativeLoginViewModel.onSmsConsentResult(intent != null ? intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE") : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginEffects$smsConsentLauncher$1$1(NativeLoginViewModel nativeLoginViewModel) {
        super(1);
        this.$viewModel = nativeLoginViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
