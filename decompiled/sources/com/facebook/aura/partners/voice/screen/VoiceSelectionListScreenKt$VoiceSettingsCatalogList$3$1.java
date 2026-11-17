package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSettingsCatalogList$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $activePreviewVoiceId;
    public final /* synthetic */ boolean $isActivePreviewVisible;
    public final /* synthetic */ VoiceControlsViewModel $previewViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceSettingsCatalogList$3$1(String str, boolean z, VoiceControlsViewModel voiceControlsViewModel) {
        super(1);
        this.$activePreviewVoiceId = str;
        this.$isActivePreviewVisible = z;
        this.$previewViewModel = voiceControlsViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$activePreviewVoiceId != null && !this.$isActivePreviewVisible) {
            this.$previewViewModel.stopPreview();
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceSettingsCatalogList$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
