package com.facebook.aura.appupdate;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AuraPlayInstallState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraPlayInstallState[] $VALUES;
    public static final AuraPlayInstallState CANCELED;
    public static final AuraPlayInstallState DOWNLOADED;
    public static final AuraPlayInstallState DOWNLOADING;
    public static final AuraPlayInstallState FAILED;
    public static final AuraPlayInstallState INSTALLED;
    public static final AuraPlayInstallState INSTALLING;
    public static final AuraPlayInstallState NONE;
    public static final AuraPlayInstallState PENDING;

    static {
        AuraPlayInstallState auraPlayInstallState = new AuraPlayInstallState(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = auraPlayInstallState;
        AuraPlayInstallState auraPlayInstallState2 = new AuraPlayInstallState(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 1);
        PENDING = auraPlayInstallState2;
        AuraPlayInstallState auraPlayInstallState3 = new AuraPlayInstallState("DOWNLOADING", 2);
        DOWNLOADING = auraPlayInstallState3;
        AuraPlayInstallState auraPlayInstallState4 = new AuraPlayInstallState("DOWNLOADED", 3);
        DOWNLOADED = auraPlayInstallState4;
        AuraPlayInstallState auraPlayInstallState5 = new AuraPlayInstallState("INSTALLING", 4);
        INSTALLING = auraPlayInstallState5;
        AuraPlayInstallState auraPlayInstallState6 = new AuraPlayInstallState("INSTALLED", 5);
        INSTALLED = auraPlayInstallState6;
        AuraPlayInstallState auraPlayInstallState7 = new AuraPlayInstallState(CvmMigrationStatusJson.STAGE_FAILED, 6);
        FAILED = auraPlayInstallState7;
        AuraPlayInstallState auraPlayInstallState8 = new AuraPlayInstallState("CANCELED", 7);
        CANCELED = auraPlayInstallState8;
        AuraPlayInstallState[] auraPlayInstallStateArr = {auraPlayInstallState, auraPlayInstallState2, auraPlayInstallState3, auraPlayInstallState4, auraPlayInstallState5, auraPlayInstallState6, auraPlayInstallState7, auraPlayInstallState8};
        $VALUES = auraPlayInstallStateArr;
        $ENTRIES = C3cG.A0w(auraPlayInstallStateArr);
    }

    public static Ey9<AuraPlayInstallState> getEntries() {
        return $ENTRIES;
    }

    public static AuraPlayInstallState valueOf(String str) {
        return (AuraPlayInstallState) Enum.valueOf(AuraPlayInstallState.class, str);
    }

    public static AuraPlayInstallState[] values() {
        return (AuraPlayInstallState[]) $VALUES.clone();
    }

    public AuraPlayInstallState(String str, int i) {
    }
}
