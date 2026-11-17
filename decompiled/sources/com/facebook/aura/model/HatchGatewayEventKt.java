package com.facebook.aura.model;

import X.AnonymousClass002;
import X.C7BY;

/* loaded from: classes3.dex */
public abstract class HatchGatewayEventKt {
    public static final String getTrimmedName(AiIdentity aiIdentity) {
        String str;
        String strA0l;
        if (aiIdentity == null || (str = aiIdentity.name) == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) {
            return null;
        }
        return strA0l;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isInConversation(com.facebook.aura.model.HatchChatEvent r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = 0
            X.C7384Etj.A0Y(r5, r4)
            com.facebook.aura.model.CanonicalEventEnvelope r3 = r5.getEnvelope()
            if (r3 == 0) goto L26
            java.lang.String r2 = r3.sessionId
        Lc:
            boolean r0 = r5 instanceof com.facebook.aura.model.HatchChatEvent.MessagesRemoved
            r1 = 1
            if (r0 != 0) goto L15
            if (r2 != 0) goto L16
            if (r6 != 0) goto L25
        L15:
            return r1
        L16:
            if (r6 != 0) goto L28
            if (r7 == 0) goto L1f
            boolean r1 = r2.equals(r7)
            return r1
        L1f:
            if (r3 == 0) goto L15
            boolean r0 = r3.isThread
            if (r0 != r1) goto L15
        L25:
            return r4
        L26:
            r2 = 0
            goto Lc
        L28:
            boolean r1 = r2.equals(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchGatewayEventKt.isInConversation(com.facebook.aura.model.HatchChatEvent, java.lang.String, java.lang.String):boolean");
    }
}
