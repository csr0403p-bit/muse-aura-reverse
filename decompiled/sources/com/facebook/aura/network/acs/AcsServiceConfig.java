package com.facebook.aura.network.acs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AcsServiceConfig extends C06G {
    public final Map<String, AcsKeyConfig> keyConfigs;
    public final String latestKeyConfigId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AcsServiceConfig) {
                AcsServiceConfig acsServiceConfig = (AcsServiceConfig) obj;
                if (!C7384Etj.areEqual(this.latestKeyConfigId, acsServiceConfig.latestKeyConfigId) || !C7384Etj.areEqual(this.keyConfigs, acsServiceConfig.keyConfigs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AcsServiceConfig copy$default(AcsServiceConfig acsServiceConfig, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acsServiceConfig.latestKeyConfigId;
        }
        if ((i & 2) != 0) {
            map = acsServiceConfig.keyConfigs;
        }
        AnonymousClass003.A0u(str, map);
        return new AcsServiceConfig(str, map);
    }

    public final String component1() {
        return this.latestKeyConfigId;
    }

    public final Map<String, AcsKeyConfig> component2() {
        return this.keyConfigs;
    }

    public final Map<String, AcsKeyConfig> getKeyConfigs() {
        return this.keyConfigs;
    }

    public final String getLatestKeyConfigId() {
        return this.latestKeyConfigId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.keyConfigs, AnonymousClass001.A0G(this.latestKeyConfigId));
    }

    public final AcsKeyConfig latestKeyConfig() {
        return this.keyConfigs.get(this.latestKeyConfigId);
    }

    public AcsServiceConfig(String str, Map<String, AcsKeyConfig> map) {
        AnonymousClass003.A0u(str, map);
        this.latestKeyConfigId = str;
        this.keyConfigs = map;
    }

    public final AcsServiceConfig copy(String str, Map<String, AcsKeyConfig> map) {
        AnonymousClass003.A0u(str, map);
        return new AcsServiceConfig(str, map);
    }

    public String toString() {
        return super.toString();
    }
}
