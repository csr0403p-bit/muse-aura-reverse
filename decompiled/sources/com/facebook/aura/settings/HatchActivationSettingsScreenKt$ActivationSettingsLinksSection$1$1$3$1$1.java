package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1$3$1$1(Function0<Unit> function0) {
        super(0);
        this.$onLegalSafetySettingsClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchActivationSettingsScreenKt.logSettingsClick(HatchScreen.SETTINGS_MAIN, HatchComponent.LEGAL_INFO_BUTTON);
        this.$onLegalSafetySettingsClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
