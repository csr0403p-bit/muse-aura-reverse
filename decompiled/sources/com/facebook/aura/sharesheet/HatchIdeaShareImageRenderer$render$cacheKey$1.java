package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C60O;
import X.C60P;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchIdeaShareImageRenderer$render$cacheKey$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final HatchIdeaShareImageRenderer$render$cacheKey$1 INSTANCE = new HatchIdeaShareImageRenderer$render$cacheKey$1();

    public HatchIdeaShareImageRenderer$render$cacheKey$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        int length;
        if (str != null) {
            length = str.length();
        } else {
            length = -1;
            str = "";
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(length);
        return C60P.A1M(":", str, sbA0w);
    }
}
