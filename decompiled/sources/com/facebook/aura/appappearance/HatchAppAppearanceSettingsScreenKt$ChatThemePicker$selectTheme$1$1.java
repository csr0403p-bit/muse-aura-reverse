package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.C0dx;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$ChatThemePicker$selectTheme$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ G0U<String, Unit> $onSelect;
    public final /* synthetic */ String $selectedThemeId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        if (!str.equals(this.$selectedThemeId)) {
            this.$haptics.AXr(AuraHaptics.SEGMENT_SWITCH);
        }
        this.$onSelect.invoke(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAppAppearanceSettingsScreenKt$ChatThemePicker$selectTheme$1$1(String str, C0dx c0dx, G0U<? super String, Unit> g0u) {
        super(1);
        this.$selectedThemeId = str;
        this.$haptics = c0dx;
        this.$onSelect = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
