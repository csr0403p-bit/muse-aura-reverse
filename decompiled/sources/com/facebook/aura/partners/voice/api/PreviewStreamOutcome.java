package com.facebook.aura.partners.voice.api;

import X.AnonymousClass003;

/* loaded from: classes2.dex */
public final class PreviewStreamOutcome {
    public final Integer httpStatus;
    public final PreviewStreamResult result;
    public final TtsStreamStats stats;

    public final Integer getHttpStatus() {
        return this.httpStatus;
    }

    public final PreviewStreamResult getResult() {
        return this.result;
    }

    public final TtsStreamStats getStats() {
        return this.stats;
    }

    public PreviewStreamOutcome(PreviewStreamResult previewStreamResult, Integer num, TtsStreamStats ttsStreamStats) {
        AnonymousClass003.A0v(previewStreamResult, ttsStreamStats);
        this.result = previewStreamResult;
        this.httpStatus = num;
        this.stats = ttsStreamStats;
    }
}
