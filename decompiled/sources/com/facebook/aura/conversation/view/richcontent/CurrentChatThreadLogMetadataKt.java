package com.facebook.aura.conversation.view.richcontent;

import X.AGH;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C78N;
import X.C7BY;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class CurrentChatThreadLogMetadataKt {
    public static final Map<String, String> currentChatThreadLogMetadata(BFM bfm, int i) {
        String str = (String) bfm.A6v(LocalConversationSessionIdKt.LocalConversationSessionId);
        boolean zA1G = AnonymousClass003.A1G(bfm, LocalIsPrimaryThreadKt.LocalIsPrimaryThread);
        boolean zA1T = AnonymousClass003.A1T(bfm, str, zA1G);
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            if (C7BY.A0j(str)) {
                objAaT = AGH.A0E();
            } else {
                if (zA1G) {
                    str = null;
                }
                objAaT = AnonymousClass002.A0o(null, str, zA1G);
            }
            bfm.Ai0(objAaT);
        }
        return (Map) objAaT;
    }
}
