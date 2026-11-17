package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.api.VoiceOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceSelectionListScreenKt$appVoiceSection$3$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceCatalogRowState $rowState;
    public final /* synthetic */ VoiceOption $voice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$appVoiceSection$3$1$2$1(VoiceCatalogRowState voiceCatalogRowState, VoiceOption voiceOption) {
        super(0);
        this.$rowState = voiceCatalogRowState;
        this.$voice = voiceOption;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$rowState.onSelect.invoke(this.$voice);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
