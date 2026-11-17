package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0U;
import X.G0V;
import com.facebook.aura.identity.provider.HatchChatThemeOption;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$ChatThemePicker$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $avatarRingColor;
    public final /* synthetic */ AuraDrawableSource $avatarSource;
    public final /* synthetic */ G0U<String, Unit> $onSelect;
    public final /* synthetic */ String $selectedThemeId;
    public final /* synthetic */ List<HatchChatThemeOption> $themeOptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAppAppearanceSettingsScreenKt$ChatThemePicker$2(String str, List<HatchChatThemeOption> list, AuraDrawableSource auraDrawableSource, long j, G0U<? super String, Unit> g0u, int i) {
        super(2);
        this.$selectedThemeId = str;
        this.$themeOptions = list;
        this.$avatarSource = auraDrawableSource;
        this.$avatarRingColor = j;
        this.$onSelect = g0u;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchAppAppearanceSettingsScreenKt.m235ChatThemePickerww6aTOc(this.$selectedThemeId, this.$themeOptions, this.$avatarSource, this.$avatarRingColor, this.$onSelect, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
