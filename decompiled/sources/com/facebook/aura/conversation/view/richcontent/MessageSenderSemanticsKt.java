package com.facebook.aura.conversation.view.richcontent;

import X.ARD;
import X.BRg;
import X.C7384Etj;

/* loaded from: classes.dex */
public abstract class MessageSenderSemanticsKt {
    public static final BRg messageSenderSemantics(BRg bRg, String str) {
        C7384Etj.A0Y(bRg, 0);
        return str != null ? bRg.then(ARD.A01(BRg.A00, new MessageSenderSemanticsKt$messageSenderSemantics$1$1(str), true)) : bRg;
    }
}
