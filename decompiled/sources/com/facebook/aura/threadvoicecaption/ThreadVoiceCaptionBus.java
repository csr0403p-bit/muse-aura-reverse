package com.facebook.aura.threadvoicecaption;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C20Q;
import X.C3cG;
import X.C7384Etj;
import X.GDB;
import X.HnJ;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ThreadVoiceCaptionBus {
    public static final Companion Companion = new Companion();
    public final BLG<Map<String, ThreadAssistantCaption>> _assistantCaptions;
    public final BLG<ThreadVoiceCaption> _caption;
    public long activeUserCaptionGeneration;

    public final synchronized void beginUserCaptionGeneration(long j) {
        if (j >= this.activeUserCaptionGeneration) {
            this.activeUserCaptionGeneration = j;
            this._caption.Af8(null);
        }
    }

    public final void publishAssistant(ThreadAssistantCaption threadAssistantCaption) {
        Map<String, ThreadAssistantCaption> value;
        Map<String, ThreadAssistantCaption> mapA11;
        C7384Etj.A0Y(threadAssistantCaption, 0);
        BLG<Map<String, ThreadAssistantCaption>> blg = this._assistantCaptions;
        do {
            value = blg.getValue();
            mapA11 = value;
            if (!C7384Etj.areEqual(mapA11.get(threadAssistantCaption.threadId), threadAssistantCaption)) {
                mapA11 = AnonymousClass006.A11(threadAssistantCaption.threadId, threadAssistantCaption, mapA11);
            }
        } while (!blg.A6e(value, mapA11));
    }

    public final synchronized boolean publishUserCaptionIfCurrent(long j, ThreadVoiceCaption threadVoiceCaption) {
        if (j != this.activeUserCaptionGeneration) {
            return false;
        }
        this._caption.Af8(threadVoiceCaption);
        return true;
    }

    public final C20Q<ThreadAssistantCaption> assistantCaption(String str) {
        return GDB.A01(new ThreadVoiceCaptionBus$assistantCaption$$inlined$map$1(this._assistantCaptions, str));
    }

    public final C20Q<ThreadVoiceCaption> caption(String str) {
        return new ThreadVoiceCaptionBus$caption$$inlined$filter$1(this._caption, str);
    }

    public final void clearAssistant(String str) {
        Map<String, ThreadAssistantCaption> value;
        BLG<Map<String, ThreadAssistantCaption>> blg = this._assistantCaptions;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AGH.A09(str, value)));
    }

    public final class Companion {
        public final ThreadVoiceCaptionBus getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ThreadVoiceCaptionBus) abstractC3358CGz.A03(ThreadVoiceCaptionBus.class, ThreadVoiceCaptionBus$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ ThreadVoiceCaptionBus(C06H c06h) {
        this();
    }

    public ThreadVoiceCaptionBus() {
        this._caption = C3cG.A13();
        this._assistantCaptions = HnJ.A01(AGH.A0E());
    }
}
