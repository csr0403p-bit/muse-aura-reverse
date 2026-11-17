package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelDisconnectActionButtonKt$ChannelDisconnectActionButton$1$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onDisconnectClick;
    public final /* synthetic */ Function0<Unit> $onDismissContextMenu;
    public final /* synthetic */ HatchScreen $screen;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismissContextMenu.invoke();
        if (auraContextMenuItem.id == 0) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CHANNELS, this.$screen, HatchComponent.DISCONNECT_BUTTON, null, null, null);
            this.$onDisconnectClick.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelDisconnectActionButtonKt$ChannelDisconnectActionButton$1$1$1(Function0<Unit> function0, HatchScreen hatchScreen, Function0<Unit> function02) {
        super(1);
        this.$onDismissContextMenu = function0;
        this.$screen = hatchScreen;
        this.$onDisconnectClick = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
