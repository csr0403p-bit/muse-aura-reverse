package com.facebook.aura.identity.datr;

import X.AnonymousClass003;
import java.util.List;

/* loaded from: classes3.dex */
public final class BridgedCookie {
    public final List<String> domains;
    public final String name;

    public final List<String> getDomains() {
        return this.domains;
    }

    public final String getName() {
        return this.name;
    }

    public BridgedCookie(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        this.name = str;
        this.domains = list;
    }
}
