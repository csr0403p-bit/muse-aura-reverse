package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AuraWaitlistScreenKt$NotificationOptInCta$notificationPermissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $isEnabled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistScreenKt$NotificationOptInCta$notificationPermissionLauncher$1$1(Context context, MutableState<Boolean> mutableState) {
        super(1);
        this.$context = context;
        this.$isEnabled$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        MutableState.A09(AuraWaitlistScreenKt.areNotificationsEnabled(this.$context), this.$isEnabled$delegate);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
