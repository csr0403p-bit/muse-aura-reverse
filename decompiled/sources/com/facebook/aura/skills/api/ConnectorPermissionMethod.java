package com.facebook.aura.skills.api;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class ConnectorPermissionMethod {
    public static final int $stable = 8;
    public final String key;
    public final List<String> modeOptions;
    public final boolean restricted;

    public ConnectorPermissionMethod(String str, List<String> list, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.key = str;
        this.modeOptions = list;
        this.restricted = z;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<String> getModeOptions() {
        return this.modeOptions;
    }

    public final boolean getRestricted() {
        return this.restricted;
    }
}
