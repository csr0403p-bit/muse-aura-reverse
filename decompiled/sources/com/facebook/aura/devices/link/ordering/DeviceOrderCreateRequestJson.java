package com.facebook.aura.devices.link.ordering;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DeviceOrderCreateRequestJson extends C06G {
    public static final int $stable = 8;
    public final DeviceOrderContactJson contact;
    public final String environment;
    public final List<DeviceOrderItemJson> order_items;
    public final DeviceOrderRecipientJson recipient;
    public final DeviceOrderAddressJson shipping_address;
    public final String subscription_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, DeviceOrderCreateRequestJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<DeviceOrderCreateRequestJson> serializer() {
            return DeviceOrderCreateRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceOrderCreateRequestJson) {
                DeviceOrderCreateRequestJson deviceOrderCreateRequestJson = (DeviceOrderCreateRequestJson) obj;
                if (!C7384Etj.areEqual(this.subscription_id, deviceOrderCreateRequestJson.subscription_id) || !C7384Etj.areEqual(this.recipient, deviceOrderCreateRequestJson.recipient) || !C7384Etj.areEqual(this.contact, deviceOrderCreateRequestJson.contact) || !C7384Etj.areEqual(this.shipping_address, deviceOrderCreateRequestJson.shipping_address) || !C7384Etj.areEqual(this.order_items, deviceOrderCreateRequestJson.order_items) || !C7384Etj.areEqual(this.environment, deviceOrderCreateRequestJson.environment)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ DeviceOrderCreateRequestJson(int i, String str, DeviceOrderRecipientJson deviceOrderRecipientJson, DeviceOrderContactJson deviceOrderContactJson, DeviceOrderAddressJson deviceOrderAddressJson, List list, String str2, C2hx c2hx) {
        if (63 != (i & 63)) {
            C9iI.A00(DeviceOrderCreateRequestJson$$serializer.descriptor, i, 63);
            throw F60.createAndThrow();
        }
        this.subscription_id = str;
        this.recipient = deviceOrderRecipientJson;
        this.contact = deviceOrderContactJson;
        this.shipping_address = deviceOrderAddressJson;
        this.order_items = list;
        this.environment = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceOrderCreateRequestJson copy$default(DeviceOrderCreateRequestJson deviceOrderCreateRequestJson, String str, DeviceOrderRecipientJson deviceOrderRecipientJson, DeviceOrderContactJson deviceOrderContactJson, DeviceOrderAddressJson deviceOrderAddressJson, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceOrderCreateRequestJson.subscription_id;
        }
        if ((i & 2) != 0) {
            deviceOrderRecipientJson = deviceOrderCreateRequestJson.recipient;
        }
        if ((i & 4) != 0) {
            deviceOrderContactJson = deviceOrderCreateRequestJson.contact;
        }
        if ((i & 8) != 0) {
            deviceOrderAddressJson = deviceOrderCreateRequestJson.shipping_address;
        }
        if ((i & 16) != 0) {
            list = deviceOrderCreateRequestJson.order_items;
        }
        if ((i & 32) != 0) {
            str2 = deviceOrderCreateRequestJson.environment;
        }
        return deviceOrderCreateRequestJson.copy(str, deviceOrderRecipientJson, deviceOrderContactJson, deviceOrderAddressJson, list, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_link_ordering_ordering(DeviceOrderCreateRequestJson deviceOrderCreateRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(deviceOrderCreateRequestJson.subscription_id, c9iZ, 0);
        c9j5.AAQ(deviceOrderCreateRequestJson.recipient, DeviceOrderRecipientJson$$serializer.INSTANCE, c9iZ, 1);
        c9j5.AAQ(deviceOrderCreateRequestJson.contact, DeviceOrderContactJson$$serializer.INSTANCE, c9iZ, 2);
        c9j5.AAQ(deviceOrderCreateRequestJson.shipping_address, DeviceOrderAddressJson$$serializer.INSTANCE, c9iZ, 3);
        c9j5.AAQ(deviceOrderCreateRequestJson.order_items, C3cH.A15(f0cArr, 4), c9iZ, 4);
        c9j5.AAV(deviceOrderCreateRequestJson.environment, c9iZ, 5);
    }

    public final String component1() {
        return this.subscription_id;
    }

    public final DeviceOrderRecipientJson component2() {
        return this.recipient;
    }

    public final DeviceOrderContactJson component3() {
        return this.contact;
    }

    public final DeviceOrderAddressJson component4() {
        return this.shipping_address;
    }

    public final List<DeviceOrderItemJson> component5() {
        return this.order_items;
    }

    public final String component6() {
        return this.environment;
    }

    public final DeviceOrderContactJson getContact() {
        return this.contact;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final List<DeviceOrderItemJson> getOrder_items() {
        return this.order_items;
    }

    public final DeviceOrderRecipientJson getRecipient() {
        return this.recipient;
    }

    public final DeviceOrderAddressJson getShipping_address() {
        return this.shipping_address;
    }

    public final String getSubscription_id() {
        return this.subscription_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.environment, AnonymousClass005.A0F(this.order_items, AnonymousClass005.A0F(this.shipping_address, AnonymousClass005.A0F(this.contact, AnonymousClass005.A0F(this.recipient, AnonymousClass001.A0G(this.subscription_id))))));
    }

    public final DeviceOrderCreateRequestJson copy(String str, DeviceOrderRecipientJson deviceOrderRecipientJson, DeviceOrderContactJson deviceOrderContactJson, DeviceOrderAddressJson deviceOrderAddressJson, List<DeviceOrderItemJson> list, String str2) {
        AnonymousClass005.A17(str, deviceOrderRecipientJson, deviceOrderContactJson, deviceOrderAddressJson, list);
        C7384Etj.A0Y(str2, 5);
        return new DeviceOrderCreateRequestJson(str, deviceOrderRecipientJson, deviceOrderContactJson, deviceOrderAddressJson, list, str2);
    }

    public String toString() {
        return super.toString();
    }

    public DeviceOrderCreateRequestJson(String str, DeviceOrderRecipientJson deviceOrderRecipientJson, DeviceOrderContactJson deviceOrderContactJson, DeviceOrderAddressJson deviceOrderAddressJson, List<DeviceOrderItemJson> list, String str2) {
        AnonymousClass005.A17(str, deviceOrderRecipientJson, deviceOrderContactJson, deviceOrderAddressJson, list);
        C7384Etj.A0Y(str2, 5);
        this.subscription_id = str;
        this.recipient = deviceOrderRecipientJson;
        this.contact = deviceOrderContactJson;
        this.shipping_address = deviceOrderAddressJson;
        this.order_items = list;
        this.environment = str2;
    }
}
