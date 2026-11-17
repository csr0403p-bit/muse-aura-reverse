package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.header.view.SettingsHeaderButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraActivationScreenKt$SettingsHeader$1$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ Function0<Unit> $onSettingsClick;
    public final /* synthetic */ HatchScreen $screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationScreenKt$SettingsHeader$1$1(HatchScreen hatchScreen, Function0<Unit> function0) {
        super(1);
        this.$screen = hatchScreen;
        this.$onSettingsClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        SettingsHeaderButtonKt.logSettingsHeaderClick(this.$screen);
        this.$onSettingsClick.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
