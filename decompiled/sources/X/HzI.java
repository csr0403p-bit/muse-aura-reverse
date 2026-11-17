package X;

/* loaded from: classes6.dex */
public final class HzI {
    public final int value;

    public final boolean equals(Object obj) {
        return (obj instanceof HzI) && this.value == ((HzI) obj).value;
    }

    public final int hashCode() {
        return this.value;
    }

    public final String toString() {
        int i = this.value;
        return i == 0 ? "None" : i == 1 ? "Software" : i == 2 ? "Hardware" : i == -1 ? "Auto" : "Unknown";
    }
}
