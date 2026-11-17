package com.facebook.aura.partners.voice.api;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.partners.voice.api.VoiceJarvisPath;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamVmPreviewPcm$2$request$1", f = "VoiceCatalogRepository.kt", l = {840}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCatalogRepository$streamVmPreviewPcm$2$request$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpResponse>, Object> {
    public final /* synthetic */ Pcm16FrameSink $sink;
    public final /* synthetic */ String $text;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ String $voiceId;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCatalogRepository$streamVmPreviewPcm$2$request$1(String str, String str2, Pcm16FrameSink pcm16FrameSink, AbstractC3358CGz abstractC3358CGz, HtJ<? super VoiceCatalogRepository$streamVmPreviewPcm$2$request$1> htJ) {
        super(2, htJ);
        this.$voiceId = str;
        this.$text = str2;
        this.$sink = pcm16FrameSink;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCatalogRepository$streamVmPreviewPcm$2$request$1(this.$voiceId, this.$text, this.$sink, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return obj;
        }
        Hwg.A00(obj);
        HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
        VoiceJarvisPath.VoiceSpeak voiceSpeak = VoiceJarvisPath.VoiceSpeak.INSTANCE;
        PreviewSpeakRequestJson previewSpeakRequestJson = new PreviewSpeakRequestJson(this.$voiceId, this.$text, "pcm16", true);
        Pcm16FrameSink pcm16FrameSink = this.$sink;
        RequestType requestType = RequestType.POST;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        Long lA0S = C3cG.A0S(30L);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.label = 1;
        Object objMakeJarvisHttpRequestStreamingInternal = hatchHttpApi.makeJarvisHttpRequestStreamingInternal(voiceSpeak, HatchJsonKt.HatchJson.A02(previewSpeakRequestJson, PreviewSpeakRequestJson$$serializer.INSTANCE), pcm16FrameSink, requestType, abstractC3358CGz, lA0S, AGH.A0E(), new HxE[0], null, false, true, null, this);
        return objMakeJarvisHttpRequestStreamingInternal == enumC10460Hji ? enumC10460Hji : objMakeJarvisHttpRequestStreamingInternal;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpResponse> htJ) {
        return ((VoiceCatalogRepository$streamVmPreviewPcm$2$request$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
