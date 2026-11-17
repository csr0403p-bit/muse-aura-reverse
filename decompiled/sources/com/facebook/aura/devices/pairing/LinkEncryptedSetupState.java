package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkEncryptedSetupState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkEncryptedSetupState[] $VALUES;
    public static final LinkEncryptedSetupState AWAITING_CLIENT_FINISHED;
    public static final LinkEncryptedSetupState AWAITING_CONFIRMATION;
    public static final LinkEncryptedSetupState AWAITING_CONFIRM_REQUIRED;
    public static final LinkEncryptedSetupState AWAITING_PAIRING_READY;
    public static final LinkEncryptedSetupState ESTABLISHED;
    public static final LinkEncryptedSetupState FAILED;
    public static final LinkEncryptedSetupState INACTIVE;

    static {
        LinkEncryptedSetupState linkEncryptedSetupState = new LinkEncryptedSetupState("INACTIVE", 0);
        INACTIVE = linkEncryptedSetupState;
        LinkEncryptedSetupState linkEncryptedSetupState2 = new LinkEncryptedSetupState("AWAITING_PAIRING_READY", 1);
        AWAITING_PAIRING_READY = linkEncryptedSetupState2;
        LinkEncryptedSetupState linkEncryptedSetupState3 = new LinkEncryptedSetupState("AWAITING_CLIENT_FINISHED", 2);
        AWAITING_CLIENT_FINISHED = linkEncryptedSetupState3;
        LinkEncryptedSetupState linkEncryptedSetupState4 = new LinkEncryptedSetupState("AWAITING_CONFIRM_REQUIRED", 3);
        AWAITING_CONFIRM_REQUIRED = linkEncryptedSetupState4;
        LinkEncryptedSetupState linkEncryptedSetupState5 = new LinkEncryptedSetupState("AWAITING_CONFIRMATION", 4);
        AWAITING_CONFIRMATION = linkEncryptedSetupState5;
        LinkEncryptedSetupState linkEncryptedSetupState6 = new LinkEncryptedSetupState("ESTABLISHED", 5);
        ESTABLISHED = linkEncryptedSetupState6;
        LinkEncryptedSetupState linkEncryptedSetupState7 = new LinkEncryptedSetupState(CvmMigrationStatusJson.STAGE_FAILED, 6);
        FAILED = linkEncryptedSetupState7;
        LinkEncryptedSetupState[] linkEncryptedSetupStateArr = {linkEncryptedSetupState, linkEncryptedSetupState2, linkEncryptedSetupState3, linkEncryptedSetupState4, linkEncryptedSetupState5, linkEncryptedSetupState6, linkEncryptedSetupState7};
        $VALUES = linkEncryptedSetupStateArr;
        $ENTRIES = C3cG.A0w(linkEncryptedSetupStateArr);
    }

    public static Ey9<LinkEncryptedSetupState> getEntries() {
        return $ENTRIES;
    }

    public static LinkEncryptedSetupState valueOf(String str) {
        return (LinkEncryptedSetupState) Enum.valueOf(LinkEncryptedSetupState.class, str);
    }

    public static LinkEncryptedSetupState[] values() {
        return (LinkEncryptedSetupState[]) $VALUES.clone();
    }

    public LinkEncryptedSetupState(String str, int i) {
    }
}
