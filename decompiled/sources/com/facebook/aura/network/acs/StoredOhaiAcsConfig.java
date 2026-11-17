package com.facebook.aura.network.acs;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class StoredOhaiAcsConfig extends C06G {
    public final OhaiAcsConfig config;
    public final long fetchTimeMillis;

    public StoredOhaiAcsConfig(OhaiAcsConfig ohaiAcsConfig, long j) {
        C7384Etj.A0Y(ohaiAcsConfig, 0);
        this.config = ohaiAcsConfig;
        this.fetchTimeMillis = j;
    }

    public final StoredOhaiAcsConfig copy(OhaiAcsConfig ohaiAcsConfig, long j) {
        C7384Etj.A0Y(ohaiAcsConfig, 0);
        return new StoredOhaiAcsConfig(ohaiAcsConfig, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoredOhaiAcsConfig) {
                StoredOhaiAcsConfig storedOhaiAcsConfig = (StoredOhaiAcsConfig) obj;
                if (!C7384Etj.areEqual(this.config, storedOhaiAcsConfig.config) || this.fetchTimeMillis != storedOhaiAcsConfig.fetchTimeMillis) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StoredOhaiAcsConfig copy$default(StoredOhaiAcsConfig storedOhaiAcsConfig, OhaiAcsConfig ohaiAcsConfig, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            ohaiAcsConfig = storedOhaiAcsConfig.config;
        }
        if ((i & 2) != 0) {
            j = storedOhaiAcsConfig.fetchTimeMillis;
        }
        C7384Etj.A0Y(ohaiAcsConfig, 0);
        return new StoredOhaiAcsConfig(ohaiAcsConfig, j);
    }

    public final OhaiAcsConfig component1() {
        return this.config;
    }

    public final long component2() {
        return this.fetchTimeMillis;
    }

    public final OhaiAcsConfig getConfig() {
        return this.config;
    }

    public final long getFetchTimeMillis() {
        return this.fetchTimeMillis;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.fetchTimeMillis, AnonymousClass005.A0E(this.config));
    }

    public String toString() {
        return super.toString();
    }
}
