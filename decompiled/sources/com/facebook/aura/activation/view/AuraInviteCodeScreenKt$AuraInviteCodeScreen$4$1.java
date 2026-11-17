package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HeaderButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteCodeScreenKt$AuraInviteCodeScreen$4$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ Function0<Unit> $onSettingsClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        C7384Etj.A0Y(headerButton, 0);
        if (headerButton == HeaderButton.Settings) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_INVITE_CODE, HatchComponent.TAB_SETTINGS, null, null, null);
            this.$onSettingsClick.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteCodeScreenKt$AuraInviteCodeScreen$4$1(Function0<Unit> function0) {
        super(1);
        this.$onSettingsClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
