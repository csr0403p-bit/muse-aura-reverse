package com.facebook.aura.network.acs;

import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
public final class OhaiAcsConfigJson extends C06G {
    public final Map<String, AcsServiceConfigJson> acs;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, OhaiAcsConfigJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<OhaiAcsConfigJson> serializer() {
            return OhaiAcsConfigJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public OhaiAcsConfigJson(int i, Map<String, AcsServiceConfigJson> map) {
        C7384Etj.A0Y(map, 1);
        this.version = i;
        this.acs = map;
    }

    public final OhaiAcsConfigJson copy(int i, Map<String, AcsServiceConfigJson> map) {
        C7384Etj.A0Y(map, 1);
        return new OhaiAcsConfigJson(i, map);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OhaiAcsConfigJson) {
                OhaiAcsConfigJson ohaiAcsConfigJson = (OhaiAcsConfigJson) obj;
                if (this.version != ohaiAcsConfigJson.version || !C7384Etj.areEqual(this.acs, ohaiAcsConfigJson.acs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OhaiAcsConfigJson copy$default(OhaiAcsConfigJson ohaiAcsConfigJson, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ohaiAcsConfigJson.version;
        }
        if ((i2 & 2) != 0) {
            map = ohaiAcsConfigJson.acs;
        }
        C7384Etj.A0Y(map, 1);
        return new OhaiAcsConfigJson(i, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_network_acs_acs(OhaiAcsConfigJson ohaiAcsConfigJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || ohaiAcsConfigJson.version != 0) {
            c9j5.AAK(c9iZ, 0, ohaiAcsConfigJson.version);
        }
        if (zAfR || !C7384Etj.areEqual(ohaiAcsConfigJson.acs, C9jH.A00)) {
            c9j5.AAQ(ohaiAcsConfigJson.acs, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final Map<String, AcsServiceConfigJson> component2() {
        return this.acs;
    }

    public final Map<String, AcsServiceConfigJson> getAcs() {
        return this.acs;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.acs, this.version * 31);
    }

    public final OhaiAcsConfig toDomain() {
        Map<String, AcsServiceConfigJson> map = this.acs;
        LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            linkedHashMapA0I.put(entryA0l.getKey(), ((AcsServiceConfigJson) entryA0l.getValue()).toDomain());
        }
        return new OhaiAcsConfig(linkedHashMapA0I);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OhaiAcsConfigJson(int i, int i2, Map map, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.acs = C9jH.A00;
        } else {
            this.acs = map;
        }
    }

    public /* synthetic */ OhaiAcsConfigJson(int i, Map map, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), (i2 & 2) != 0 ? C9jH.A00 : map);
    }

    public OhaiAcsConfigJson() {
        this(0, C9jH.A00);
    }
}
