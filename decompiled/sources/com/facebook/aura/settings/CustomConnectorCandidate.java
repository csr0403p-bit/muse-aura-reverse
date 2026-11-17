package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class CustomConnectorCandidate extends C06G {
    public static final int $stable = 0;
    public final String host;
    public final String name;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorCandidate) {
                CustomConnectorCandidate customConnectorCandidate = (CustomConnectorCandidate) obj;
                if (!C7384Etj.areEqual(this.name, customConnectorCandidate.name) || !C7384Etj.areEqual(this.host, customConnectorCandidate.host)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorCandidate copy$default(CustomConnectorCandidate customConnectorCandidate, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorCandidate.name;
        }
        if ((i & 2) != 0) {
            str2 = customConnectorCandidate.host;
        }
        AnonymousClass003.A0u(str, str2);
        return new CustomConnectorCandidate(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.host;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.host, AnonymousClass001.A0G(this.name));
    }

    public CustomConnectorCandidate(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.host = str2;
    }

    public final CustomConnectorCandidate copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new CustomConnectorCandidate(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
