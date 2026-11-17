package com.facebook.aura.devices.intf;

/* loaded from: classes4.dex */
public interface DiscoveryScan {

    /* renamed from: com.facebook.aura.devices.intf.DiscoveryScan$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static DeviceRowBadge $default$bluetoothGadgetBadge(DiscoveryScan discoveryScan) {
            return null;
        }

        public static /* synthetic */ DeviceRowBadge access$bluetoothGadgetBadge$jd(DiscoveryScan discoveryScan) {
            return null;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static DeviceRowBadge bluetoothGadgetBadge(DiscoveryScan discoveryScan) {
            return null;
        }
    }

    DeviceRowBadge bluetoothGadgetBadge();

    DiscoveryDecision classify(DiscoveredAdvertisement discoveredAdvertisement);
}
