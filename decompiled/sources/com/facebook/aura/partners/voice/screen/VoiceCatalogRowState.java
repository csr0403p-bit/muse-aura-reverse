package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass003;
import X.G0U;
import com.facebook.aura.partners.voice.api.VoiceOption;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VoiceCatalogRowState {
    public final boolean hasSelectedSavedVoice;
    public final G0U<VoiceOption, Unit> onPreview;
    public final G0U<VoiceOption, Unit> onSelect;
    public final String previewLoadingVoiceId;
    public final String previewPlayingVoiceId;
    public final String savingSelectionRowId;
    public final String selectedVoiceId;

    public final boolean getHasSelectedSavedVoice() {
        return this.hasSelectedSavedVoice;
    }

    public final G0U<VoiceOption, Unit> getOnPreview() {
        return this.onPreview;
    }

    public final G0U<VoiceOption, Unit> getOnSelect() {
        return this.onSelect;
    }

    public final String getPreviewLoadingVoiceId() {
        return this.previewLoadingVoiceId;
    }

    public final String getPreviewPlayingVoiceId() {
        return this.previewPlayingVoiceId;
    }

    public final String getSavingSelectionRowId() {
        return this.savingSelectionRowId;
    }

    public final String getSelectedVoiceId() {
        return this.selectedVoiceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCatalogRowState(String str, boolean z, String str2, String str3, String str4, G0U<? super VoiceOption, Unit> g0u, G0U<? super VoiceOption, Unit> g0u2) {
        AnonymousClass003.A0z(g0u, g0u2);
        this.selectedVoiceId = str;
        this.hasSelectedSavedVoice = z;
        this.savingSelectionRowId = str2;
        this.previewLoadingVoiceId = str3;
        this.previewPlayingVoiceId = str4;
        this.onPreview = g0u;
        this.onSelect = g0u2;
    }
}
