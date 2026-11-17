package com.facebook.aura.markdown.render;

import X.C7384Etj;

/* loaded from: classes4.dex */
public abstract class BlockTextDirectionKt {
    public static final int blockTextDirection(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        int iCharCount = 0;
        boolean z = false;
        while (iCharCount < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            byte directionality = Character.getDirectionality(iCodePointAt);
            if (directionality == 1 || directionality == 2) {
                return 2;
            }
            if (directionality == 0) {
                z = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return z ? 1 : 0;
    }
}
