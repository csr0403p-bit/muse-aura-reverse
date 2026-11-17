package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$ChatThemeSection$2$1$1$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchIdentityProvider $identityProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAppAppearanceSettingsScreenKt$ChatThemeSection$2$1$1$1$1$1(HatchIdentityProvider hatchIdentityProvider) {
        super(1);
        this.$identityProvider = hatchIdentityProvider;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        AnonymousClass006.A0b(str).logClick(HatchSurface.SETTINGS, HatchSubsurface.APPEARANCE, HatchScreen.APPEARANCE, HatchComponent.CHAT_THEME_SWATCH, null, AnonymousClass007.A0c(HatchMetadataKey.THEME_ID, str), null);
        this.$identityProvider.setChatTheme(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
