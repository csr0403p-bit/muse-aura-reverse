package X;

import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* renamed from: X.4lm, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C4lm implements InterfaceC2571Be0<String> {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATING("CREATING"),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING("RUNNING"),
    /* JADX INFO: Fake field, exist only in values array */
    STOPPED("STOPPED"),
    /* JADX INFO: Fake field, exist only in values array */
    DELETING("DELETING"),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR("ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    SUSPENDED("SUSPENDED"),
    /* JADX INFO: Fake field, exist only in values array */
    UPDATING("UPDATING"),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED("DISABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    CVM_AWAITING_DST_VM_CHIP_SELECTION("CVM_AWAITING_DST_VM_CHIP_SELECTION"),
    /* JADX INFO: Fake field, exist only in values array */
    CVM_DST_VM_STARTING("CVM_DST_VM_STARTING"),
    /* JADX INFO: Fake field, exist only in values array */
    CVM_DST_VM_FAILED_TO_START("CVM_DST_VM_FAILED_TO_START"),
    /* JADX INFO: Fake field, exist only in values array */
    CVM_LOCKED(CvmMigrationStatusJson.VAULT_CVM_LOCKED);

    public final String mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    C4lm(String str) {
        this.mValue = str;
    }
}
