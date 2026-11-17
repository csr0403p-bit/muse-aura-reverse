package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.api.PreviewStreamDiagnostics;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoicePreviewPlayer$streamPreview$2$resolveSource$1 extends AbstractC7559F3s implements G0U<VoicePreviewSource, Unit> {
    public final /* synthetic */ PcmLoudness $loudness;
    public final /* synthetic */ VoicePreviewPlayer.ActivePreview $preview;
    public final /* synthetic */ PreviewStreamDiagnostics $stream;

    @Override // X.G0U
    public final Unit invoke(VoicePreviewSource voicePreviewSource) {
        C7384Etj.A0Y(voicePreviewSource, 0);
        VoicePreviewDiagnostics.Attempt attempt = this.$preview.diagnostics;
        if (attempt == null) {
            return null;
        }
        attempt.sourceResolved(voicePreviewSource, VoicePreviewPlaybackPath.PCM_STREAM, this.$loudness, this.$stream);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewPlayer$streamPreview$2$resolveSource$1(VoicePreviewPlayer.ActivePreview activePreview, PcmLoudness pcmLoudness, PreviewStreamDiagnostics previewStreamDiagnostics) {
        super(1);
        this.$preview = activePreview;
        this.$loudness = pcmLoudness;
        this.$stream = previewStreamDiagnostics;
    }
}
