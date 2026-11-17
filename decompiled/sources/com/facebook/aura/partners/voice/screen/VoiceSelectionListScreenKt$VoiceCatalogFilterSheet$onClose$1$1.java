package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.F1F;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$onClose$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ F1F $dismissed;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$onClose$1$1(F1F f1f, AuraNavigator auraNavigator) {
        super(0);
        this.$dismissed = f1f;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        F1F f1f = this.$dismissed;
        if (f1f.element) {
            return;
        }
        f1f.element = true;
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
