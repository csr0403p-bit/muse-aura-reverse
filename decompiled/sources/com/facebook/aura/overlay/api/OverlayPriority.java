package com.facebook.aura.overlay.api;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.AppLockOverlayScreenKey;
import com.facebook.aura.navigation.key.AppUpdateHardBlockOverlayScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmChipBudgetOverlayScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSubscriptionEndedScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchResumeOverlayScreenKey;
import com.facebook.aura.navigation.key.HatchCheckpointOverlayScreenKey;
import com.facebook.aura.navigation.key.HatchPausedOverlayScreenKey;
import com.facebook.aura.navigation.key.StorageRecoveryOverlayScreenKey;
import com.facebook.aura.navigation.key.VmDisabledOverlayScreenKey;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OverlayPriority {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ OverlayPriority[] $VALUES;
    public static final OverlayPriority APP_LOCK;
    public static final OverlayPriority APP_UPDATE;
    public static final OverlayPriority CHECKPOINT;
    public static final OverlayPriority CVM_CHIP_BUDGET;
    public static final OverlayPriority CVM_SUBSCRIPTION_ENDED;
    public static final OverlayPriority HATCH_PAUSED;
    public static final OverlayPriority STORAGE_RECOVERY;
    public static final OverlayPriority VM_DISABLED;
    public static final OverlayPriority VM_TYPE_SWITCH;
    public final AuraNavKey key;

    static {
        OverlayPriority overlayPriority = new OverlayPriority("APP_LOCK", 0, AppLockOverlayScreenKey.INSTANCE);
        APP_LOCK = overlayPriority;
        OverlayPriority overlayPriority2 = new OverlayPriority("CHECKPOINT", 1, HatchCheckpointOverlayScreenKey.INSTANCE);
        CHECKPOINT = overlayPriority2;
        OverlayPriority overlayPriority3 = new OverlayPriority("APP_UPDATE", 2, AppUpdateHardBlockOverlayScreenKey.INSTANCE);
        APP_UPDATE = overlayPriority3;
        OverlayPriority overlayPriority4 = new OverlayPriority("CVM_CHIP_BUDGET", 3, ConfidentialVmChipBudgetOverlayScreenKey.INSTANCE);
        CVM_CHIP_BUDGET = overlayPriority4;
        OverlayPriority overlayPriority5 = new OverlayPriority("VM_TYPE_SWITCH", 4, ConfidentialVmSwitchResumeOverlayScreenKey.INSTANCE);
        VM_TYPE_SWITCH = overlayPriority5;
        OverlayPriority overlayPriority6 = new OverlayPriority("CVM_SUBSCRIPTION_ENDED", 5, ConfidentialVmSubscriptionEndedScreenKey.INSTANCE);
        CVM_SUBSCRIPTION_ENDED = overlayPriority6;
        OverlayPriority overlayPriority7 = new OverlayPriority("VM_DISABLED", 6, VmDisabledOverlayScreenKey.INSTANCE);
        VM_DISABLED = overlayPriority7;
        OverlayPriority overlayPriority8 = new OverlayPriority("STORAGE_RECOVERY", 7, StorageRecoveryOverlayScreenKey.INSTANCE);
        STORAGE_RECOVERY = overlayPriority8;
        OverlayPriority overlayPriority9 = new OverlayPriority("HATCH_PAUSED", 8, HatchPausedOverlayScreenKey.INSTANCE);
        HATCH_PAUSED = overlayPriority9;
        OverlayPriority[] overlayPriorityArr = {overlayPriority, overlayPriority2, overlayPriority3, overlayPriority4, overlayPriority5, overlayPriority6, overlayPriority7, overlayPriority8, overlayPriority9};
        $VALUES = overlayPriorityArr;
        $ENTRIES = C3cG.A0w(overlayPriorityArr);
    }

    public static Ey9<OverlayPriority> getEntries() {
        return $ENTRIES;
    }

    public static OverlayPriority valueOf(String str) {
        return (OverlayPriority) Enum.valueOf(OverlayPriority.class, str);
    }

    public static OverlayPriority[] values() {
        return (OverlayPriority[]) $VALUES.clone();
    }

    public final AuraNavKey getKey() {
        return this.key;
    }

    public OverlayPriority(String str, int i, AuraNavKey auraNavKey) {
        this.key = auraNavKey;
    }
}
