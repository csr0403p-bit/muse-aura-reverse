package com.facebook.aura.nodes.json;

import X.AnonymousClass001;
import X.AnonymousClass002;

/* loaded from: classes.dex */
public abstract class NodeListEntryKt {
    public static final String normalizeNodeId(String str) {
        String strA0l;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            String strA0u = AnonymousClass001.A0u(strA0l);
            if (strA0u.length() != 0) {
                return strA0u;
            }
        }
        return null;
    }
}
