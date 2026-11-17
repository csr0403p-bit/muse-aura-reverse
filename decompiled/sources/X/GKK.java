package X;

/* loaded from: classes6.dex */
public enum GKK implements HrV {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public final int value;

    GKK(int value) {
        this.value = value;
    }
}
