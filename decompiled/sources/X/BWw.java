package X;

/* loaded from: classes5.dex */
public enum BWw implements InterfaceC2571Be0<Long> {
    ACTIVE_ACCOUNT(1),
    /* JADX INFO: Fake field, exist only in values array */
    ADMINED_ACCOUNT(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALL_ACCOUNTS(5),
    INACTIVE_LOGGED_IN_ACCOUNT(3),
    SAVED_ACCOUNT(4);

    public final long mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ Long getValue() {
        return Long.valueOf(this.mValue);
    }

    BWw(long j) {
        this.mValue = j;
    }
}
