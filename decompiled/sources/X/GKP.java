package X;

/* loaded from: classes6.dex */
public enum GKP implements HrV {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    public final int value;

    public static GKP A00(int value) {
        if (value == 0) {
            return UNKNOWN_PREFIX;
        }
        if (value == 1) {
            return TINK;
        }
        if (value == 2) {
            return LEGACY;
        }
        if (value == 3) {
            return RAW;
        }
        if (value == 4) {
            return CRUNCHY;
        }
        if (value != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    public final int A01() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw C60O.A0i("Can't get the number of an unknown enum value.");
    }

    GKP(int value) {
        this.value = value;
    }
}
