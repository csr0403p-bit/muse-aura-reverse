package com.facebook.aura.partners.voice.api;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoicePreviewCache$createFlight$result$1", f = "VoicePreviewCache.kt", l = {271}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class VoicePreviewCache$createFlight$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
    public final /* synthetic */ HxE<String, String> $key;
    public final /* synthetic */ long $requestGeneration;
    public final /* synthetic */ AtomicBoolean $userRequested;
    public int label;
    public final /* synthetic */ VoicePreviewCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewCache$createFlight$result$1(VoicePreviewCache voicePreviewCache, HxE<String, String> hxE, long j, AtomicBoolean atomicBoolean, HtJ<? super VoicePreviewCache$createFlight$result$1> htJ) {
        super(2, htJ);
        this.this$0 = voicePreviewCache;
        this.$key = hxE;
        this.$requestGeneration = j;
        this.$userRequested = atomicBoolean;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoicePreviewCache$createFlight$result$1(this.this$0, this.$key, this.$requestGeneration, this.$userRequested, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        SingleFlightResult.Result result;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoicePreviewCache voicePreviewCache = this.this$0;
            SingleFlight singleFlight = voicePreviewCache.singleFlight;
            HxE<String, String> hxE = this.$key;
            long j = this.$requestGeneration;
            HxE hxEA0r = C3cG.A0r(hxE, C3cG.A0S(j));
            VoicePreviewCache$createFlight$result$1$result$1 voicePreviewCache$createFlight$result$1$result$1 = new VoicePreviewCache$createFlight$result$1$result$1(voicePreviewCache, this.$userRequested, hxE, j, null);
            this.label = 1;
            obj = singleFlight.invoke(hxEA0r, voicePreviewCache$createFlight$result$1$result$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
        if (!(singleFlightResult instanceof SingleFlightResult.Result) || (result = (SingleFlightResult.Result) singleFlightResult) == null) {
            return null;
        }
        return result.value;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
        return ((VoicePreviewCache$createFlight$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
