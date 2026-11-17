package com.facebook.aura.gateway;

import X.AnonymousClass002;

/* loaded from: classes.dex */
public final class ApprovalConversationIdentity {
    public static final int $stable = 0;
    public static final ApprovalConversationIdentity INSTANCE = new ApprovalConversationIdentity();
    public static final String PRIMARY_CONVERSATION_SESSION_ID = "primary_session_id";
    public static final String PRIMARY_SESSION_KEY = "__primary_approval_session__";

    public final String resolveThreadId(String str, String str2) {
        String strA0l;
        String strA0l2;
        if (str != null && (strA0l2 = AnonymousClass002.A0l(str)) != null && strA0l2.length() > 0 && !strA0l2.equals("primary_session_id")) {
            return strA0l2;
        }
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public final String normalize(String str) {
        String strA0l;
        return (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0 || strA0l.equals("primary_session_id")) ? PRIMARY_SESSION_KEY : strA0l;
    }
}
