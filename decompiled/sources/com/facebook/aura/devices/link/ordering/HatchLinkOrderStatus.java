package com.facebook.aura.devices.link.ordering;

import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchLinkOrderStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkOrderStatus[] $VALUES;
    public static final HatchLinkOrderStatus CANCELLED;
    public static final HatchLinkOrderStatus CLOSED;
    public static final Companion Companion;
    public static final HatchLinkOrderStatus DELAYED;
    public static final HatchLinkOrderStatus DELIVERED;
    public static final HatchLinkOrderStatus EXTRACTED_FOR_SHIPPING;
    public static final HatchLinkOrderStatus ON_HOLD;
    public static final HatchLinkOrderStatus OPENED;
    public static final HatchLinkOrderStatus PARTIALLY_DELIVERED;
    public static final HatchLinkOrderStatus PARTIALLY_RESERVED;
    public static final HatchLinkOrderStatus PARTIALLY_SHIPPED;
    public static final HatchLinkOrderStatus RESERVED;
    public static final HatchLinkOrderStatus SHIPPED;
    public static final HatchLinkOrderStatus UNDELIVERED;
    public static final HatchLinkOrderStatus UNKNOWN;
    public final String serverValue;

    public final class Companion {
        public final HatchLinkOrderStatus fromServerValue(String str) {
            HatchLinkOrderStatus next;
            if (str != null) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                Iterator<HatchLinkOrderStatus> it = HatchLinkOrderStatus.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (upperCase.equals(next.getServerValue())) {
                        break;
                    }
                }
                HatchLinkOrderStatus hatchLinkOrderStatus = next;
                if (hatchLinkOrderStatus != null) {
                    return hatchLinkOrderStatus;
                }
            }
            return HatchLinkOrderStatus.UNKNOWN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchLinkOrderStatus hatchLinkOrderStatus = new HatchLinkOrderStatus("OPENED", 0, "OPENED");
        OPENED = hatchLinkOrderStatus;
        HatchLinkOrderStatus hatchLinkOrderStatus2 = new HatchLinkOrderStatus("ON_HOLD", 1, "ON_HOLD");
        ON_HOLD = hatchLinkOrderStatus2;
        HatchLinkOrderStatus hatchLinkOrderStatus3 = new HatchLinkOrderStatus("DELAYED", 2, "DELAYED");
        DELAYED = hatchLinkOrderStatus3;
        HatchLinkOrderStatus hatchLinkOrderStatus4 = new HatchLinkOrderStatus("RESERVED", 3, "RESERVED");
        RESERVED = hatchLinkOrderStatus4;
        HatchLinkOrderStatus hatchLinkOrderStatus5 = new HatchLinkOrderStatus("PARTIALLY_RESERVED", 4, "PARTIALLY_RESERVED");
        PARTIALLY_RESERVED = hatchLinkOrderStatus5;
        HatchLinkOrderStatus hatchLinkOrderStatus6 = new HatchLinkOrderStatus("EXTRACTED_FOR_SHIPPING", 5, "EXTRACTED_FOR_SHIPPING");
        EXTRACTED_FOR_SHIPPING = hatchLinkOrderStatus6;
        HatchLinkOrderStatus hatchLinkOrderStatus7 = new HatchLinkOrderStatus("SHIPPED", 6, "SHIPPED");
        SHIPPED = hatchLinkOrderStatus7;
        HatchLinkOrderStatus hatchLinkOrderStatus8 = new HatchLinkOrderStatus("PARTIALLY_SHIPPED", 7, "PARTIALLY_SHIPPED");
        PARTIALLY_SHIPPED = hatchLinkOrderStatus8;
        HatchLinkOrderStatus hatchLinkOrderStatus9 = new HatchLinkOrderStatus("DELIVERED", 8, "DELIVERED");
        DELIVERED = hatchLinkOrderStatus9;
        HatchLinkOrderStatus hatchLinkOrderStatus10 = new HatchLinkOrderStatus("PARTIALLY_DELIVERED", 9, "PARTIALLY_DELIVERED");
        PARTIALLY_DELIVERED = hatchLinkOrderStatus10;
        HatchLinkOrderStatus hatchLinkOrderStatus11 = new HatchLinkOrderStatus("UNDELIVERED", 10, "UNDELIVERED");
        UNDELIVERED = hatchLinkOrderStatus11;
        HatchLinkOrderStatus hatchLinkOrderStatus12 = new HatchLinkOrderStatus("CANCELLED", 11, "CANCELLED");
        CANCELLED = hatchLinkOrderStatus12;
        HatchLinkOrderStatus hatchLinkOrderStatus13 = new HatchLinkOrderStatus("CLOSED", 12, "CLOSED");
        CLOSED = hatchLinkOrderStatus13;
        HatchLinkOrderStatus hatchLinkOrderStatus14 = new HatchLinkOrderStatus("UNKNOWN", 13, "");
        UNKNOWN = hatchLinkOrderStatus14;
        HatchLinkOrderStatus[] hatchLinkOrderStatusArr = {hatchLinkOrderStatus, hatchLinkOrderStatus2, hatchLinkOrderStatus3, hatchLinkOrderStatus4, hatchLinkOrderStatus5, hatchLinkOrderStatus6, hatchLinkOrderStatus7, hatchLinkOrderStatus8, hatchLinkOrderStatus9, hatchLinkOrderStatus10, hatchLinkOrderStatus11, hatchLinkOrderStatus12, hatchLinkOrderStatus13, hatchLinkOrderStatus14};
        $VALUES = hatchLinkOrderStatusArr;
        $ENTRIES = C3cG.A0w(hatchLinkOrderStatusArr);
        Companion = new Companion();
    }

    public static Ey9<HatchLinkOrderStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkOrderStatus valueOf(String str) {
        return (HatchLinkOrderStatus) Enum.valueOf(HatchLinkOrderStatus.class, str);
    }

    public static HatchLinkOrderStatus[] values() {
        return (HatchLinkOrderStatus[]) $VALUES.clone();
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    public HatchLinkOrderStatus(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
