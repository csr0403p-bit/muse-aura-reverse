package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DeviceOrderResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String order_id;
    public final String status;

    public final class Companion {
        public final C9hr<DeviceOrderResponseJson> serializer() {
            return DeviceOrderResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public DeviceOrderResponseJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.order_id = str;
        this.status = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_link_ordering_ordering(DeviceOrderResponseJson deviceOrderResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deviceOrderResponseJson.order_id, c9iZ, 0);
        if (c9j5.AfR() || deviceOrderResponseJson.status != null) {
            c9j5.AAP(deviceOrderResponseJson.status, C07779iq.A01, c9iZ, 1);
        }
    }

    public final DeviceOrderResponseJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new DeviceOrderResponseJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceOrderResponseJson) {
                DeviceOrderResponseJson deviceOrderResponseJson = (DeviceOrderResponseJson) obj;
                if (!C7384Etj.areEqual(this.order_id, deviceOrderResponseJson.order_id) || !C7384Etj.areEqual(this.status, deviceOrderResponseJson.status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceOrderResponseJson copy$default(DeviceOrderResponseJson deviceOrderResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceOrderResponseJson.order_id;
        }
        if ((i & 2) != 0) {
            str2 = deviceOrderResponseJson.status;
        }
        C7384Etj.A0Y(str, 0);
        return new DeviceOrderResponseJson(str, str2);
    }

    public final String component1() {
        return this.order_id;
    }

    public final String component2() {
        return this.status;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.order_id) + AnonymousClass006.A0G(this.status);
    }

    public final HatchLinkOrder toDomain() {
        return new HatchLinkOrder(this.order_id, HatchLinkOrderStatus.Companion.fromServerValue(this.status));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceOrderResponseJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(DeviceOrderResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.order_id = str;
        this.status = C8j4.A0t(i, str2);
    }

    public /* synthetic */ DeviceOrderResponseJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
