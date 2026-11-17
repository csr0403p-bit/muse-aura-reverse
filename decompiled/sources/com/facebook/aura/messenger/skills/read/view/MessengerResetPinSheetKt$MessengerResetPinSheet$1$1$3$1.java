package com.facebook.aura.messenger.skills.read.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinAnalytics;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.MessengerPinLockoutReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MessengerResetPinSheetKt$MessengerResetPinSheet$1$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ MessengerPinLockoutReason $reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerResetPinSheetKt$MessengerResetPinSheet$1$1$3$1(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, MessengerPinLockoutReason messengerPinLockoutReason, AuraNavigator auraNavigator) {
        super(0);
        this.$origin = hatchSkillOAuthOrigin;
        this.$reason = messengerPinLockoutReason;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MessengerPinAnalytics.INSTANCE.cancelTapped(this.$origin, this.$reason);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
