package X;

/* renamed from: X.Blw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC2819Blw {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    /* JADX INFO: Fake field, exist only in values array */
    CONFIGURED(true);

    public final boolean mHoldsCameraSlot;

    EnumC2819Blw(boolean z) {
        this.mHoldsCameraSlot = z;
    }
}
