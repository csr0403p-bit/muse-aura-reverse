package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.api.PreviewStreamDiagnostics;
import com.facebook.aura.partners.voice.api.VoiceCatalogRepository;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreview$2$streaming$1", f = "VoicePreviewPlayer.kt", l = {413}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoicePreviewPlayer$streamPreview$2$streaming$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ PcmChunkHandoff $chunks;
    public final /* synthetic */ PcmLoudness $loudness;
    public final /* synthetic */ VoicePreviewPlayer.ActivePreview $preview;
    public final /* synthetic */ G0U<VoicePreviewSource, Unit> $resolveSource;
    public final /* synthetic */ PreviewStreamDiagnostics $stream;
    public final /* synthetic */ String $text;
    public int label;
    public final /* synthetic */ VoicePreviewPlayer this$0;

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreview$2$streaming$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<VoicePreviewSource, Unit> $resolveSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super VoicePreviewSource, Unit> g0u) {
            super(0);
            this.$resolveSource = g0u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$resolveSource.invoke(VoicePreviewSource.VM_CACHE);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreview$2$streaming$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<byte[], Unit> {
        public final /* synthetic */ PcmChunkHandoff $chunks;
        public final /* synthetic */ PcmLoudness $loudness;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            this.$loudness.addPcm16(bArr);
            if (!this.$chunks.offer(bArr)) {
                throw C3cG.A0Q("preview PCM buffer limit exceeded");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PcmLoudness pcmLoudness, PcmChunkHandoff pcmChunkHandoff) {
            super(1);
            this.$loudness = pcmLoudness;
            this.$chunks = pcmChunkHandoff;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            invoke2(bArr);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoicePreviewPlayer$streamPreview$2$streaming$1(VoicePreviewPlayer voicePreviewPlayer, VoicePreviewPlayer.ActivePreview activePreview, String str, PreviewStreamDiagnostics previewStreamDiagnostics, PcmChunkHandoff pcmChunkHandoff, G0U<? super VoicePreviewSource, Unit> g0u, PcmLoudness pcmLoudness, HtJ<? super VoicePreviewPlayer$streamPreview$2$streaming$1> htJ) {
        super(2, htJ);
        this.this$0 = voicePreviewPlayer;
        this.$preview = activePreview;
        this.$text = str;
        this.$stream = previewStreamDiagnostics;
        this.$chunks = pcmChunkHandoff;
        this.$resolveSource = g0u;
        this.$loudness = pcmLoudness;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoicePreviewPlayer$streamPreview$2$streaming$1(this.this$0, this.$preview, this.$text, this.$stream, this.$chunks, this.$resolveSource, this.$loudness, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                VoicePreviewPlayer voicePreviewPlayer = this.this$0;
                VoiceCatalogRepository voiceCatalogRepository = voicePreviewPlayer.repository;
                AbstractC3358CGz abstractC3358CGz = voicePreviewPlayer.userSession;
                String str = this.$preview.request.key.voiceId;
                String str2 = this.$text;
                PreviewStreamDiagnostics previewStreamDiagnostics = this.$stream;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resolveSource);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$loudness, this.$chunks);
                this.label = 1;
                obj = voiceCatalogRepository.streamPreviewAudio(abstractC3358CGz, str, str2, previewStreamDiagnostics, anonymousClass1, anonymousClass2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            PcmLoudness pcmLoudness = this.$loudness;
            Boolean bool = (Boolean) obj;
            if (bool.booleanValue()) {
                pcmLoudness.complete = true;
            }
            return bool;
        } finally {
            this.$chunks.close();
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((VoicePreviewPlayer$streamPreview$2$streaming$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
