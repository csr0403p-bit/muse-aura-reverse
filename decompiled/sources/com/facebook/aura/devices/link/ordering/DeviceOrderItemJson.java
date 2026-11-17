package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DeviceOrderItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int quantity;
    public final String sku;

    public final class Companion {
        public final C9hr<DeviceOrderItemJson> serializer() {
            return DeviceOrderItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public DeviceOrderItemJson(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.sku = str;
        this.quantity = i;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_link_ordering_ordering(DeviceOrderItemJson deviceOrderItemJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deviceOrderItemJson.sku, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, deviceOrderItemJson.quantity);
    }

    public final DeviceOrderItemJson copy(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return new DeviceOrderItemJson(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceOrderItemJson) {
                DeviceOrderItemJson deviceOrderItemJson = (DeviceOrderItemJson) obj;
                if (!C7384Etj.areEqual(this.sku, deviceOrderItemJson.sku) || this.quantity != deviceOrderItemJson.quantity) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceOrderItemJson copy$default(DeviceOrderItemJson deviceOrderItemJson, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deviceOrderItemJson.sku;
        }
        if ((i2 & 2) != 0) {
            i = deviceOrderItemJson.quantity;
        }
        C7384Etj.A0Y(str, 0);
        return new DeviceOrderItemJson(str, i);
    }

    public final String component1() {
        return this.sku;
    }

    public final int component2() {
        return this.quantity;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.sku) + this.quantity;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceOrderItemJson(int i, String str, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DeviceOrderItemJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.sku = str;
        this.quantity = i2;
    }
}
