package com.facebook.aura.partners.voice.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0881AGi;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.VoiceEntryPoint;
import com.facebook.aura.navigation.key.VoiceSelectionListScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.voice.entries.ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$-1428326282$1$1$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$1428326282$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$1428326282$1$1$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) VoiceSelectionListScreenKey.Companion.invoke(false, C0881AGi.A00, null, HatchOrigin.SETTINGS, VoiceEntryPoint.SETTINGS, AnonymousClass002.A0k()), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
