package com.facebook.aura.composer.dictation.engine;

import X.AnonymousClass003;

/* loaded from: classes5.dex */
public final class DictationRequest {
    public final String clientSessionId;
    public final DictationMode mode;

    public final String getClientSessionId() {
        return this.clientSessionId;
    }

    public final DictationMode getMode() {
        return this.mode;
    }

    public DictationRequest(DictationMode dictationMode, String str) {
        AnonymousClass003.A0u(dictationMode, str);
        this.mode = dictationMode;
        this.clientSessionId = str;
    }
}
