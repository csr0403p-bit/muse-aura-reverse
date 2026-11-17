package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.identity.provider.HatchChatThemeOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$ChatThemePicker$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $selectTheme;
    public final /* synthetic */ HatchChatThemeOption $theme;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAppAppearanceSettingsScreenKt$ChatThemePicker$1$2$1$1(G0U<? super String, Unit> g0u, HatchChatThemeOption hatchChatThemeOption) {
        super(0);
        this.$selectTheme = g0u;
        this.$theme = hatchChatThemeOption;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$selectTheme.invoke(this.$theme.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
