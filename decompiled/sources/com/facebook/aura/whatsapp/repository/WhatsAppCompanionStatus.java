package com.facebook.aura.whatsapp.repository;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class WhatsAppCompanionStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WhatsAppCompanionStatus[] $VALUES;
    public static final WhatsAppCompanionStatus CONNECTED;
    public static final WhatsAppCompanionStatus FAILED;
    public static final WhatsAppCompanionStatus PENDING;

    static {
        WhatsAppCompanionStatus whatsAppCompanionStatus = new WhatsAppCompanionStatus(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 0);
        PENDING = whatsAppCompanionStatus;
        WhatsAppCompanionStatus whatsAppCompanionStatus2 = new WhatsAppCompanionStatus("CONNECTED", 1);
        CONNECTED = whatsAppCompanionStatus2;
        WhatsAppCompanionStatus whatsAppCompanionStatus3 = new WhatsAppCompanionStatus(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = whatsAppCompanionStatus3;
        WhatsAppCompanionStatus[] whatsAppCompanionStatusArr = {whatsAppCompanionStatus, whatsAppCompanionStatus2, whatsAppCompanionStatus3};
        $VALUES = whatsAppCompanionStatusArr;
        $ENTRIES = C3cG.A0w(whatsAppCompanionStatusArr);
    }

    public static Ey9<WhatsAppCompanionStatus> getEntries() {
        return $ENTRIES;
    }

    public static WhatsAppCompanionStatus valueOf(String str) {
        return (WhatsAppCompanionStatus) Enum.valueOf(WhatsAppCompanionStatus.class, str);
    }

    public static WhatsAppCompanionStatus[] values() {
        return (WhatsAppCompanionStatus[]) $VALUES.clone();
    }

    public WhatsAppCompanionStatus(String str, int i) {
    }
}
