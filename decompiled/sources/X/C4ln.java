package X;

/* renamed from: X.4ln, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C4ln implements InterfaceC2571Be0<Long> {
    FACEBOOK(0),
    INSTAGRAM(1),
    WHATSAPP(3),
    FRL(4),
    /* JADX INFO: Fake field, exist only in values array */
    THREADS(5),
    /* JADX INFO: Fake field, exist only in values array */
    ABRA(6),
    /* JADX INFO: Fake field, exist only in values array */
    FCA(7),
    /* JADX INFO: Fake field, exist only in values array */
    META_PHOTOS(8),
    /* JADX INFO: Fake field, exist only in values array */
    META_ACCOUNT(100),
    /* JADX INFO: Fake field, exist only in values array */
    DO_NOT_USE(10000),
    /* JADX INFO: Fake field, exist only in values array */
    EXAMPLE(10001),
    /* JADX INFO: Fake field, exist only in values array */
    SOLO(10002);

    public final long mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ Long getValue() {
        return Long.valueOf(this.mValue);
    }

    C4ln(long j) {
        this.mValue = j;
    }
}
