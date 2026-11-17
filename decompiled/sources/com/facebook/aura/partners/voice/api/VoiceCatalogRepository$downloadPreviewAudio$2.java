package com.facebook.aura.partners.voice.api;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.F0H;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.settings.MC;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$downloadPreviewAudio$2", f = "VoiceCatalogRepository.kt", l = {331}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCatalogRepository$downloadPreviewAudio$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
    public final /* synthetic */ boolean $prefetch;
    public final /* synthetic */ String $text;
    public final /* synthetic */ String $voiceId;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ VoiceCatalogRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$downloadPreviewAudio$2$1", f = "VoiceCatalogRepository.kt", l = {333, MC.mwa_help_and_support.__CONFIG__, 353, MC.mwa_help_and_support.__CONFIG__, MC.mwa_help_and_support.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$downloadPreviewAudio$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
        public final /* synthetic */ String $requestBody;
        public final /* synthetic */ PreviewResponseSink $sink;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ VoiceCatalogRepository this$0;

        /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$downloadPreviewAudio$2$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02781 extends AbstractC7559F3s implements Function0<byte[]> {
            public final /* synthetic */ HatchHttpResponseStream $response;
            public final /* synthetic */ PreviewResponseSink $sink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02781(HatchHttpResponseStream hatchHttpResponseStream, PreviewResponseSink previewResponseSink) {
                super(0);
                this.$response = hatchHttpResponseStream;
                this.$sink = previewResponseSink;
            }

            @Override // kotlin.jvm.functions.Function0
            public final byte[] invoke() throws IOException {
                InputStream inputStream = this.$response.body;
                if (inputStream == null) {
                    return null;
                }
                PreviewResponseSink previewResponseSink = this.$sink;
                F0H.A00(inputStream, previewResponseSink);
                return previewResponseSink.audio();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceCatalogRepository voiceCatalogRepository, String str, PreviewResponseSink previewResponseSink, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = voiceCatalogRepository;
            this.$requestBody = str;
            this.$sink = previewResponseSink;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$requestBody, this.$sink, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$downloadPreviewAudio$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCatalogRepository$downloadPreviewAudio$2(String str, String str2, boolean z, VoiceCatalogRepository voiceCatalogRepository, HtJ<? super VoiceCatalogRepository$downloadPreviewAudio$2> htJ) {
        super(2, htJ);
        this.$voiceId = str;
        this.$text = str2;
        this.$prefetch = z;
        this.this$0 = voiceCatalogRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCatalogRepository$downloadPreviewAudio$2(this.$voiceId, this.$text, this.$prefetch, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                String strA02 = HatchJsonKt.HatchJson.A02(new VoicePreviewStreamRequestJson(this.$voiceId, this.$text, "mp3"), VoicePreviewStreamRequestJson$$serializer.INSTANCE);
                boolean z = this.$prefetch;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, strA02, new PreviewResponseSink(z ? VoiceCatalogRepository.PREFETCH_RESPONSE_MAX_BYTES : 2097152L, z ? 131072 : 1048576), null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = Hxb.A00(anonymousClass1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return (byte[]) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A0A(VoiceCatalogRepositoryKt.TAG, "fetchPreviewAudio error", e2);
            return null;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
        return ((VoiceCatalogRepository$downloadPreviewAudio$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
