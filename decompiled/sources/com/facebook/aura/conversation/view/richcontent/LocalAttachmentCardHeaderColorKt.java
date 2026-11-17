package com.facebook.aura.conversation.view.richcontent;

import X.AKH;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B6A;
import X.BFM;

/* loaded from: classes.dex */
public abstract class LocalAttachmentCardHeaderColorKt {
    public static final AKH<B6A> LocalAttachmentCardHeaderColor = AnonymousClass002.A0L(LocalAttachmentCardHeaderColorKt$LocalAttachmentCardHeaderColor$1.INSTANCE);

    public static final long attachmentCardHeaderColor(BFM bfm, int i) {
        B6A b6a = (B6A) bfm.A6v(LocalAttachmentCardHeaderColor);
        if (b6a != null) {
            AnonymousClass004.A1A(bfm, -1452803099);
            return b6a.A00;
        }
        long j = AnonymousClass003.A0c(bfm, -1452801270).secondaryButtonBackground;
        AnonymousClass002.A19(bfm);
        return j;
    }

    public static final AKH<B6A> getLocalAttachmentCardHeaderColor() {
        return LocalAttachmentCardHeaderColor;
    }
}
