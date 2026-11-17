package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraActivationScreenKt$WaitlistOverflowHeader$1$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onRefreshClick;
    public final /* synthetic */ Function0<Unit> $onSettingsClick;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$showContextMenu$delegate);
        int i = auraContextMenuItem.id;
        if (i == 0) {
            HatchInteractionLogger.INSTANCE.logStatusCheck(HatchSurface.ONBOARDING, HatchSubsurface.DOT_MENU, HatchScreen.ONBOARDING_WAITLIST, HatchComponent.ACTIVATION_STATUS_CHECK, AnonymousClass006.A10("trigger", "overflow_menu"));
            function0 = this.$onRefreshClick;
        } else if (i != 1) {
            CFK.A06(AuraActivationScreenKt.TAG, FGI.A0H("Unhandled overflow menu item: ", i));
            return;
        } else {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, HatchSubsurface.DOT_MENU, HatchScreen.ONBOARDING_WAITLIST, HatchComponent.TAB_SETTINGS, null, null, null);
            function0 = this.$onSettingsClick;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationScreenKt$WaitlistOverflowHeader$1$1$2$1(Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState) {
        super(1);
        this.$onRefreshClick = function0;
        this.$onSettingsClick = function02;
        this.$showContextMenu$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
