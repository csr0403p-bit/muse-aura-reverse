package com.facebook.aura.partners.voice.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.voice.entries.ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$-526642263$1$1$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$526642263$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$VoiceSelectionListEntryProviderKt$lambda$526642263$1$1$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.back();
    }
}
