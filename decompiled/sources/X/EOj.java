package X;

/* loaded from: classes5.dex */
public enum EOj implements InterfaceC2571Be0<Long> {
    FETCH_EMPTY(42),
    FETCH_FAILURE(2),
    FETCH_ITEM_FAILURE(45),
    FETCH_ITEM_SUCCESS(44),
    FETCH_START(3),
    FETCH_SUCCESS(4),
    REMOVE_FAILURE(5),
    REMOVE_START(6),
    REMOVE_SUCCESS(7),
    TARGET_APP_FETCH_FAILURE(28),
    TARGET_APP_FETCH_SUCCESS(30),
    WRITE_FAILURE(8),
    WRITE_START(9),
    WRITE_SUCCESS(10);

    public final long mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ Long getValue() {
        return Long.valueOf(this.mValue);
    }

    EOj(long j) {
        this.mValue = j;
    }
}
