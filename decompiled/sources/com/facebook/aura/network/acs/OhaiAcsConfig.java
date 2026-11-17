package com.facebook.aura.network.acs;

import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class OhaiAcsConfig extends C06G {
    public static final long CONFIG_EXPIRY_BUFFER_MILLIS = 3600000;
    public static final Companion Companion = new Companion();
    public final Map<String, AcsServiceConfig> services;

    public OhaiAcsConfig(Map<String, AcsServiceConfig> map) {
        C7384Etj.A0Y(map, 0);
        this.services = map;
    }

    public final OhaiAcsConfig copy(Map<String, AcsServiceConfig> map) {
        C7384Etj.A0Y(map, 0);
        return new OhaiAcsConfig(map);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OhaiAcsConfig) && C7384Etj.areEqual(this.services, ((OhaiAcsConfig) obj).services));
    }

    public final boolean isExpired(String str, long j, long j2) {
        AcsKeyConfig acsKeyConfigLatestKeyConfig;
        C7384Etj.A0Y(str, 0);
        AcsServiceConfig acsServiceConfigServiceConfig = serviceConfig(str);
        return acsServiceConfigServiceConfig == null || (acsKeyConfigLatestKeyConfig = acsServiceConfigServiceConfig.latestKeyConfig()) == null || j >= (acsKeyConfigLatestKeyConfig.expireTimeSeconds * 1000) - j2;
    }

    public final AcsServiceConfig serviceConfig(String str) {
        C7384Etj.A0Y(str, 0);
        return this.services.get(str);
    }

    public static /* synthetic */ OhaiAcsConfig copy$default(OhaiAcsConfig ohaiAcsConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = ohaiAcsConfig.services;
        }
        C7384Etj.A0Y(map, 0);
        return new OhaiAcsConfig(map);
    }

    public static /* synthetic */ boolean isExpired$default(OhaiAcsConfig ohaiAcsConfig, String str, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 3600000;
        }
        return ohaiAcsConfig.isExpired(str, j, j2);
    }

    public final Map<String, AcsServiceConfig> component1() {
        return this.services;
    }

    public final Map<String, AcsServiceConfig> getServices() {
        return this.services;
    }

    public int hashCode() {
        return this.services.hashCode();
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public String toString() {
        return super.toString();
    }
}
