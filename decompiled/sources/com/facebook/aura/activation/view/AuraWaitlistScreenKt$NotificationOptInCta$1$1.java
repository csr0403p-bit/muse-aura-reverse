package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraWaitlistScreenKt$NotificationOptInCta$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $isEnabled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistScreenKt$NotificationOptInCta$1$1(Context context, MutableState<Boolean> mutableState) {
        super(0);
        this.$context = context;
        this.$isEnabled$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(AuraWaitlistScreenKt.areNotificationsEnabled(this.$context), this.$isEnabled$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
