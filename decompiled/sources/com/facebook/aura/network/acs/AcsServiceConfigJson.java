package com.facebook.aura.network.acs;

import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9jH;
import X.F0C;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AcsServiceConfigJson extends C06G {
    public final Map<String, KeyConfigDetailsJson> keyConfigMap;
    public final String latestKeyConfigId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, AcsServiceConfigJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AcsServiceConfigJson> serializer() {
            return AcsServiceConfigJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AcsServiceConfigJson) {
                AcsServiceConfigJson acsServiceConfigJson = (AcsServiceConfigJson) obj;
                if (!C7384Etj.areEqual(this.keyConfigMap, acsServiceConfigJson.keyConfigMap) || !C7384Etj.areEqual(this.latestKeyConfigId, acsServiceConfigJson.latestKeyConfigId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AcsServiceConfigJson copy$default(AcsServiceConfigJson acsServiceConfigJson, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = acsServiceConfigJson.keyConfigMap;
        }
        if ((i & 2) != 0) {
            str = acsServiceConfigJson.latestKeyConfigId;
        }
        AnonymousClass003.A0u(map, str);
        return new AcsServiceConfigJson(map, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_network_acs_acs(AcsServiceConfigJson acsServiceConfigJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C7384Etj.areEqual(acsServiceConfigJson.keyConfigMap, C9jH.A00)) {
            c9j5.AAQ(acsServiceConfigJson.keyConfigMap, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cH.A1Q(acsServiceConfigJson.latestKeyConfigId)) {
            c9j5.AAV(acsServiceConfigJson.latestKeyConfigId, c9iZ, 1);
        }
    }

    public final Map<String, KeyConfigDetailsJson> component1() {
        return this.keyConfigMap;
    }

    public final String component2() {
        return this.latestKeyConfigId;
    }

    public final Map<String, KeyConfigDetailsJson> getKeyConfigMap() {
        return this.keyConfigMap;
    }

    public final String getLatestKeyConfigId() {
        return this.latestKeyConfigId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.latestKeyConfigId, AnonymousClass005.A0E(this.keyConfigMap));
    }

    public final AcsServiceConfig toDomain() {
        String str = this.latestKeyConfigId;
        Map<String, KeyConfigDetailsJson> map = this.keyConfigMap;
        LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            linkedHashMapA0I.put(entryA0l.getKey(), ((KeyConfigDetailsJson) entryA0l.getValue()).toDomain(C60O.A0t(entryA0l)));
        }
        return new AcsServiceConfig(str, linkedHashMapA0I);
    }

    public AcsServiceConfigJson(Map<String, KeyConfigDetailsJson> map, String str) {
        AnonymousClass003.A0u(map, str);
        this.keyConfigMap = map;
        this.latestKeyConfigId = str;
    }

    public final AcsServiceConfigJson copy(Map<String, KeyConfigDetailsJson> map, String str) {
        AnonymousClass003.A0u(map, str);
        return new AcsServiceConfigJson(map, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AcsServiceConfigJson(int i, Map map, String str, C2hx c2hx) {
        this.keyConfigMap = (i & 1) == 0 ? C9jH.A00 : map;
        if ((i & 2) == 0) {
            this.latestKeyConfigId = "";
        } else {
            this.latestKeyConfigId = str;
        }
    }

    public /* synthetic */ AcsServiceConfigJson(Map map, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? C9jH.A00 : map, (i & 2) != 0 ? "" : str);
    }

    public AcsServiceConfigJson() {
        this(C9jH.A00, "");
    }
}
