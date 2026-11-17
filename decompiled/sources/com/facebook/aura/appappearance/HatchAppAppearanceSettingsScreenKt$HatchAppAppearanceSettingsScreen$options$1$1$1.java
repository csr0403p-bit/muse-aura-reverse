package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$HatchAppAppearanceSettingsScreen$options$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AppAppearanceOption $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAppAppearanceSettingsScreenKt$HatchAppAppearanceSettingsScreen$options$1$1$1(AppAppearanceOption appAppearanceOption, Context context) {
        super(0);
        this.$option = appAppearanceOption;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.APPEARANCE, HatchScreen.APPEARANCE, HatchComponent.APPEARANCE_MODE_OPTION, null, AnonymousClass006.A10(HatchMetadataKey.APPEARANCE_MODE.getValue(), AnonymousClass006.A0x(this.$option)), null);
        HatchAppAppearanceManager.INSTANCE.setAppearance(this.$context, this.$option.getValue());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
