package com.facebook.aura.nodes.json;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0881AGi;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9jH;
import X.F0C;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeviceCommandCapabilityJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String description;
    public final Map<String, ArgSpecJson> optional;
    public final List<String> permission_required;
    public final Map<String, ArgSpecJson> required;
    public final Boolean supports_background_execution;
    public final long timeout_ms;

    public final class Companion {
        public final C9hr<DeviceCommandCapabilityJson> serializer() {
            return DeviceCommandCapabilityJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, AbstractC5321DgF.A02(num, DeviceCommandCapabilityJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, DeviceCommandCapabilityJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, DeviceCommandCapabilityJson$Companion$$childSerializers$3.INSTANCE), null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceCommandCapabilityJson() {
        C9jH c9jHA0E = AGH.A0E();
        this(null, c9jHA0E, c9jHA0E, C0881AGi.A00, 0L, null);
    }

    public final DeviceCommandCapabilityJson copy(String str, Map<String, ArgSpecJson> map, Map<String, ArgSpecJson> map2, List<String> list, long j, Boolean bool) {
        AnonymousClass005.A11(map, map2, list, 1);
        return new DeviceCommandCapabilityJson(str, map, map2, list, j, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceCommandCapabilityJson) {
                DeviceCommandCapabilityJson deviceCommandCapabilityJson = (DeviceCommandCapabilityJson) obj;
                if (!C7384Etj.areEqual(this.description, deviceCommandCapabilityJson.description) || !C7384Etj.areEqual(this.required, deviceCommandCapabilityJson.required) || !C7384Etj.areEqual(this.optional, deviceCommandCapabilityJson.optional) || !C7384Etj.areEqual(this.permission_required, deviceCommandCapabilityJson.permission_required) || this.timeout_ms != deviceCommandCapabilityJson.timeout_ms || !C7384Etj.areEqual(this.supports_background_execution, deviceCommandCapabilityJson.supports_background_execution)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceCommandCapabilityJson copy$default(DeviceCommandCapabilityJson deviceCommandCapabilityJson, String str, Map map, Map map2, List list, long j, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceCommandCapabilityJson.description;
        }
        if ((i & 2) != 0) {
            map = deviceCommandCapabilityJson.required;
        }
        if ((i & 4) != 0) {
            map2 = deviceCommandCapabilityJson.optional;
        }
        if ((i & 8) != 0) {
            list = deviceCommandCapabilityJson.permission_required;
        }
        if ((i & 16) != 0) {
            j = deviceCommandCapabilityJson.timeout_ms;
        }
        if ((i & 32) != 0) {
            bool = deviceCommandCapabilityJson.supports_background_execution;
        }
        return deviceCommandCapabilityJson.copy(str, map, map2, list, j, bool);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(DeviceCommandCapabilityJson deviceCommandCapabilityJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || deviceCommandCapabilityJson.description != null) {
            c9j5.AAP(deviceCommandCapabilityJson.description, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(deviceCommandCapabilityJson.required, AGH.A0E())) {
            c9j5.AAQ(deviceCommandCapabilityJson.required, f0cArr[1].getValue(), c9iZ, 1);
        }
        if (zAfR || !C7384Etj.areEqual(deviceCommandCapabilityJson.optional, AGH.A0E())) {
            c9j5.AAQ(deviceCommandCapabilityJson.optional, f0cArr[2].getValue(), c9iZ, 2);
        }
        if (zAfR || !C7384Etj.areEqual(deviceCommandCapabilityJson.permission_required, C0881AGi.A00)) {
            c9j5.AAQ(deviceCommandCapabilityJson.permission_required, f0cArr[3].getValue(), c9iZ, 3);
        }
        if (zAfR || deviceCommandCapabilityJson.timeout_ms != 0) {
            c9j5.AAN(c9iZ, 4, deviceCommandCapabilityJson.timeout_ms);
        }
        if (zAfR || deviceCommandCapabilityJson.supports_background_execution != null) {
            c9j5.AAP(deviceCommandCapabilityJson.supports_background_execution, C07839ix.A00, c9iZ, 5);
        }
    }

    public final String component1() {
        return this.description;
    }

    public final Map<String, ArgSpecJson> component2() {
        return this.required;
    }

    public final Map<String, ArgSpecJson> component3() {
        return this.optional;
    }

    public final List<String> component4() {
        return this.permission_required;
    }

    public final long component5() {
        return this.timeout_ms;
    }

    public final Boolean component6() {
        return this.supports_background_execution;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Map<String, ArgSpecJson> getOptional() {
        return this.optional;
    }

    public final List<String> getPermission_required() {
        return this.permission_required;
    }

    public final Map<String, ArgSpecJson> getRequired() {
        return this.required;
    }

    public final Boolean getSupports_background_execution() {
        return this.supports_background_execution;
    }

    public final long getTimeout_ms() {
        return this.timeout_ms;
    }

    public int hashCode() {
        return (AnonymousClass006.A05(this.timeout_ms, AnonymousClass005.A0F(this.permission_required, AnonymousClass005.A0F(this.optional, AnonymousClass005.A0F(this.required, AnonymousClass006.A0G(this.description) * 31)))) * 31) + C3cH.A02(this.supports_background_execution);
    }

    public String toString() {
        return super.toString();
    }

    public DeviceCommandCapabilityJson(String str, Map<String, ArgSpecJson> map, Map<String, ArgSpecJson> map2, List<String> list, long j, Boolean bool) {
        C7384Etj.A0Y(map, 1);
        C7384Etj.A0Y(map2, 2);
        C7384Etj.A0Y(list, 3);
        this.description = str;
        this.required = map;
        this.optional = map2;
        this.permission_required = list;
        this.timeout_ms = j;
        this.supports_background_execution = bool;
    }

    public /* synthetic */ DeviceCommandCapabilityJson(String str, Map map, Map map2, List list, long j, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, C3cH.A0o(map, i & 2), C3cH.A0o(map2, i & 4), (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : bool);
    }

    public /* synthetic */ DeviceCommandCapabilityJson(int i, String str, Map map, Map map2, List list, long j, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.required = AGH.A0E();
        } else {
            this.required = map;
        }
        if ((i & 4) == 0) {
            this.optional = AGH.A0E();
        } else {
            this.optional = map2;
        }
        if ((i & 8) == 0) {
            this.permission_required = C0881AGi.A00;
        } else {
            this.permission_required = list;
        }
        if ((i & 16) == 0) {
            this.timeout_ms = 0L;
        } else {
            this.timeout_ms = j;
        }
        if ((i & 32) == 0) {
            this.supports_background_execution = null;
        } else {
            this.supports_background_execution = bool;
        }
    }
}
