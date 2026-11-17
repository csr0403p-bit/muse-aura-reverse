package com.facebook.aura.network.acs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class FetchedOhaiAcsConfig extends C06G {
    public final OhaiAcsConfig config;
    public final String rawEnvelope;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FetchedOhaiAcsConfig) {
                FetchedOhaiAcsConfig fetchedOhaiAcsConfig = (FetchedOhaiAcsConfig) obj;
                if (!C7384Etj.areEqual(this.rawEnvelope, fetchedOhaiAcsConfig.rawEnvelope) || !C7384Etj.areEqual(this.config, fetchedOhaiAcsConfig.config)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FetchedOhaiAcsConfig copy$default(FetchedOhaiAcsConfig fetchedOhaiAcsConfig, String str, OhaiAcsConfig ohaiAcsConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fetchedOhaiAcsConfig.rawEnvelope;
        }
        if ((i & 2) != 0) {
            ohaiAcsConfig = fetchedOhaiAcsConfig.config;
        }
        AnonymousClass003.A0u(str, ohaiAcsConfig);
        return new FetchedOhaiAcsConfig(str, ohaiAcsConfig);
    }

    public final String component1() {
        return this.rawEnvelope;
    }

    public final OhaiAcsConfig component2() {
        return this.config;
    }

    public final OhaiAcsConfig getConfig() {
        return this.config;
    }

    public final String getRawEnvelope() {
        return this.rawEnvelope;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.config, AnonymousClass001.A0G(this.rawEnvelope));
    }

    public FetchedOhaiAcsConfig(String str, OhaiAcsConfig ohaiAcsConfig) {
        AnonymousClass003.A0u(str, ohaiAcsConfig);
        this.rawEnvelope = str;
        this.config = ohaiAcsConfig;
    }

    public final FetchedOhaiAcsConfig copy(String str, OhaiAcsConfig ohaiAcsConfig) {
        AnonymousClass003.A0u(str, ohaiAcsConfig);
        return new FetchedOhaiAcsConfig(str, ohaiAcsConfig);
    }

    public String toString() {
        return super.toString();
    }
}
