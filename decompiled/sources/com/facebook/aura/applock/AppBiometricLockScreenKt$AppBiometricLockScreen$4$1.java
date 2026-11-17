package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AppBiometricLockScreenKt$AppBiometricLockScreen$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBiometricLockScreenKt$AppBiometricLockScreen$4$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AppLockBiometricSettingsKt.launchBiometricEnrollment(this.$context);
    }
}
