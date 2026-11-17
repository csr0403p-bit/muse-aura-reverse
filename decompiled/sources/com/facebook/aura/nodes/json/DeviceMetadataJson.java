package com.facebook.aura.nodes.json;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeviceMetadataJson extends C06G {
    public final String delivery_app;
    public final String device_family;
    public final Boolean is_wakeup_supported;
    public final Map<String, String> metadata;
    public final String model_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, DeviceMetadataJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<DeviceMetadataJson> serializer() {
            return DeviceMetadataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceMetadataJson) {
                DeviceMetadataJson deviceMetadataJson = (DeviceMetadataJson) obj;
                if (!C7384Etj.areEqual(this.device_family, deviceMetadataJson.device_family) || !C7384Etj.areEqual(this.model_id, deviceMetadataJson.model_id) || !C7384Etj.areEqual(this.is_wakeup_supported, deviceMetadataJson.is_wakeup_supported) || !C7384Etj.areEqual(this.delivery_app, deviceMetadataJson.delivery_app) || !C7384Etj.areEqual(this.metadata, deviceMetadataJson.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceMetadataJson copy$default(DeviceMetadataJson deviceMetadataJson, String str, String str2, Boolean bool, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceMetadataJson.device_family;
        }
        if ((i & 2) != 0) {
            str2 = deviceMetadataJson.model_id;
        }
        if ((i & 4) != 0) {
            bool = deviceMetadataJson.is_wakeup_supported;
        }
        if ((i & 8) != 0) {
            str3 = deviceMetadataJson.delivery_app;
        }
        if ((i & 16) != 0) {
            map = deviceMetadataJson.metadata;
        }
        return deviceMetadataJson.copy(str, str2, bool, str3, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(DeviceMetadataJson deviceMetadataJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(deviceMetadataJson.device_family, c9iZ, 0);
        c9j5.AAV(deviceMetadataJson.model_id, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || deviceMetadataJson.is_wakeup_supported != null) {
            c9j5.AAP(deviceMetadataJson.is_wakeup_supported, C07839ix.A00, c9iZ, 2);
        }
        if (zAfR || deviceMetadataJson.delivery_app != null) {
            c9j5.AAP(deviceMetadataJson.delivery_app, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || deviceMetadataJson.metadata != null) {
            c9j5.AAP(deviceMetadataJson.metadata, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.device_family;
    }

    public final String component2() {
        return this.model_id;
    }

    public final Boolean component3() {
        return this.is_wakeup_supported;
    }

    public final String component4() {
        return this.delivery_app;
    }

    public final Map<String, String> component5() {
        return this.metadata;
    }

    public final String getDelivery_app() {
        return this.delivery_app;
    }

    public final String getDevice_family() {
        return this.device_family;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getModel_id() {
        return this.model_id;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.model_id, AnonymousClass001.A0G(this.device_family)) + AnonymousClass006.A0D(this.is_wakeup_supported)) * 31) + AnonymousClass006.A0G(this.delivery_app)) * 31) + C3cH.A02(this.metadata);
    }

    public final Boolean is_wakeup_supported() {
        return this.is_wakeup_supported;
    }

    public DeviceMetadataJson(String str, String str2, Boolean bool, String str3, Map<String, String> map) {
        AnonymousClass003.A0u(str, str2);
        this.device_family = str;
        this.model_id = str2;
        this.is_wakeup_supported = bool;
        this.delivery_app = str3;
        this.metadata = map;
    }

    public final DeviceMetadataJson copy(String str, String str2, Boolean bool, String str3, Map<String, String> map) {
        AnonymousClass003.A0u(str, str2);
        return new DeviceMetadataJson(str, str2, bool, str3, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceMetadataJson(String str, String str2, Boolean bool, String str3, Map map, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : map);
    }

    public /* synthetic */ DeviceMetadataJson(int i, String str, String str2, Boolean bool, String str3, Map map, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DeviceMetadataJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.device_family = str;
        this.model_id = str2;
        if ((i & 4) == 0) {
            this.is_wakeup_supported = null;
        } else {
            this.is_wakeup_supported = bool;
        }
        if ((i & 8) == 0) {
            this.delivery_app = null;
        } else {
            this.delivery_app = str3;
        }
        if ((i & 16) == 0) {
            this.metadata = null;
        } else {
            this.metadata = map;
        }
    }
}
