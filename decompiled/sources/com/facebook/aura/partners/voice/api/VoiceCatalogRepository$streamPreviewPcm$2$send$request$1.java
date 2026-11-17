package com.facebook.aura.partners.voice.api;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GBM;
import X.HtJ;
import X.Hwg;
import X.InterfaceC10560Hsz;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewPcm$2$send$request$1", f = "VoiceCatalogRepository.kt", l = {546}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCatalogRepository$streamPreviewPcm$2$send$request$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PreviewStreamOutcome>, Object> {
    public final /* synthetic */ PreviewStreamDiagnostics $diagnostics;
    public final /* synthetic */ int $index;
    public final /* synthetic */ AtomicReference<PreviewStreamOutcome> $lastEnded;
    public final /* synthetic */ G0U<byte[], Unit> $onPcmChunk;
    public final /* synthetic */ String $text;
    public final /* synthetic */ String $voiceId;
    public final /* synthetic */ InterfaceC10560Hsz<Integer> $winner;
    public int label;
    public final /* synthetic */ VoiceCatalogRepository this$0;

    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewPcm$2$send$request$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ PreviewStreamDiagnostics $diagnostics;
        public final /* synthetic */ int $index;
        public final /* synthetic */ InterfaceC10560Hsz<Integer> $winner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC10560Hsz<Integer> interfaceC10560Hsz, int i, PreviewStreamDiagnostics previewStreamDiagnostics) {
            super(0);
            this.$winner = interfaceC10560Hsz;
            this.$index = i;
            this.$diagnostics = previewStreamDiagnostics;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean zA0R = ((GBM) this.$winner).A0R(Integer.valueOf(this.$index));
            Boolean boolValueOf = Boolean.valueOf(zA0R);
            PreviewStreamDiagnostics previewStreamDiagnostics = this.$diagnostics;
            int i = this.$index;
            if (zA0R) {
                previewStreamDiagnostics.recordAnsweredBy$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(AnonymousClass002.A1N(i));
            }
            return boolValueOf;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCatalogRepository$streamPreviewPcm$2$send$request$1(VoiceCatalogRepository voiceCatalogRepository, String str, String str2, G0U<? super byte[], Unit> g0u, InterfaceC10560Hsz<Integer> interfaceC10560Hsz, int i, PreviewStreamDiagnostics previewStreamDiagnostics, AtomicReference<PreviewStreamOutcome> atomicReference, HtJ<? super VoiceCatalogRepository$streamPreviewPcm$2$send$request$1> htJ) {
        super(2, htJ);
        this.this$0 = voiceCatalogRepository;
        this.$voiceId = str;
        this.$text = str2;
        this.$onPcmChunk = g0u;
        this.$winner = interfaceC10560Hsz;
        this.$index = i;
        this.$diagnostics = previewStreamDiagnostics;
        this.$lastEnded = atomicReference;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCatalogRepository$streamPreviewPcm$2$send$request$1(this.this$0, this.$voiceId, this.$text, this.$onPcmChunk, this.$winner, this.$index, this.$diagnostics, this.$lastEnded, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceCatalogRepository voiceCatalogRepository = this.this$0;
            String str = this.$voiceId;
            String str2 = this.$text;
            G0U<byte[], Unit> g0u = this.$onPcmChunk;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$winner, this.$index, this.$diagnostics);
            this.label = 1;
            obj = voiceCatalogRepository.streamPreviewPcmAttempt(str, str2, g0u, anonymousClass1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.$lastEnded.set(obj);
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super PreviewStreamOutcome> htJ) {
        return ((VoiceCatalogRepository$streamPreviewPcm$2$send$request$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
