package com.facebook.aura.devices.link.ordering;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public interface DeviceOrderStefiPath extends StefiHatchPath.Extension {

    public final class DeviceOrderStatus extends C06G implements DeviceOrderStefiPath {
        public static final int $stable = 0;
        public final String orderId;

        public DeviceOrderStatus(String str) {
            C7384Etj.A0Y(str, 0);
            this.orderId = str;
        }

        public final DeviceOrderStatus copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new DeviceOrderStatus(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DeviceOrderStatus) && C7384Etj.areEqual(this.orderId, ((DeviceOrderStatus) obj).orderId));
        }

        public static /* synthetic */ DeviceOrderStatus copy$default(DeviceOrderStatus deviceOrderStatus, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceOrderStatus.orderId;
            }
            C7384Etj.A0Y(str, 0);
            return new DeviceOrderStatus(str);
        }

        public final String component1() {
            return this.orderId;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/device-orders/v1/orders/", Uri.encode(this.orderId));
        }

        public int hashCode() {
            return this.orderId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class DeviceOrders implements DeviceOrderStefiPath {
        public static final int $stable = 0;
        public static final DeviceOrders INSTANCE = new DeviceOrders();
        public static final String value = "/hatch/device-orders/v1/orders";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceOrders);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DeviceOrders";
        }

        public int hashCode() {
            return -744048818;
        }
    }

    public final class PlacesTypeahead implements DeviceOrderStefiPath {
        public static final int $stable = 0;
        public static final PlacesTypeahead INSTANCE = new PlacesTypeahead();
        public static final String value = "/hatch/places/typeahead";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PlacesTypeahead);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PlacesTypeahead";
        }

        public int hashCode() {
            return 1988177032;
        }
    }
}
