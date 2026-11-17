package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$voiceCatalogStateImpression$1$1 extends AbstractC7559F3s implements Function0<Map<HatchMetadataKey, ? extends String>> {
    public final /* synthetic */ VoiceTelemetry.CatalogState $state;
    public final /* synthetic */ VoiceSettingsListViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$voiceCatalogStateImpression$1$1(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceTelemetry.CatalogState catalogState) {
        super(0);
        this.$viewModel = voiceSettingsListViewModel;
        this.$state = catalogState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<HatchMetadataKey, ? extends String> invoke() {
        return AnonymousClass006.A11(HatchMetadataKey.STATE, this.$state.getValue(), this.$viewModel.telemetryMetadata());
    }
}
