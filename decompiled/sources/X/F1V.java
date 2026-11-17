package X;

/* loaded from: classes5.dex */
public enum F1V implements InterfaceC2571Be0<Long> {
    /* JADX INFO: Fake field, exist only in values array */
    ACCOUNT_ITEM(1),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_ITEM(2),
    /* JADX INFO: Fake field, exist only in values array */
    ELIGIBILITY_ITEM(3);

    public final long mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ Long getValue() {
        return Long.valueOf(this.mValue);
    }

    F1V(long j) {
        this.mValue = j;
    }
}
