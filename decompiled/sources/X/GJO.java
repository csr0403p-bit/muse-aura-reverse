package X;

/* loaded from: classes6.dex */
public enum GJO implements HrV {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public final int value;

    GJO(int value) {
        this.value = value;
    }
}
