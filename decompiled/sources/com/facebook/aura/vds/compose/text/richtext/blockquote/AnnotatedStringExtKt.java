package com.facebook.aura.vds.compose.text.richtext.blockquote;

import X.C1731ApS;
import X.C7384Etj;

/* loaded from: classes4.dex */
public abstract class AnnotatedStringExtKt {
    public static final void addBlockQuoteAnnotation(C1731ApS c1731ApS, int i, int i2, int i3) {
        C7384Etj.A0Y(c1731ApS, 0);
        c1731ApS.A0G("BLOCK_QUOTE", String.valueOf(i3), i, i2);
    }

    public static /* synthetic */ void addBlockQuoteAnnotation$default(C1731ApS c1731ApS, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        addBlockQuoteAnnotation(c1731ApS, i, i2, i3);
    }
}
