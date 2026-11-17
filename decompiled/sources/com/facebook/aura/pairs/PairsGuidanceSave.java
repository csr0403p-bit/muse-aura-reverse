package com.facebook.aura.pairs;

import X.AnonymousClass005;
import X.C27k;
import X.C3cG;
import X.HtJ;

/* loaded from: classes3.dex */
public final class PairsGuidanceSave {
    public static final int $stable = 8;
    public final String chatSessionId;
    public final C27k<Boolean> result;
    public final String text;

    public final Object await(HtJ<? super Boolean> htJ) {
        return C3cG.A0W(this.result, htJ);
    }

    public final String getChatSessionId() {
        return this.chatSessionId;
    }

    public final String getText() {
        return this.text;
    }

    public PairsGuidanceSave(String str, String str2, C27k<Boolean> c27k) {
        AnonymousClass005.A0x(str, str2, c27k);
        this.text = str;
        this.chatSessionId = str2;
        this.result = c27k;
    }
}
