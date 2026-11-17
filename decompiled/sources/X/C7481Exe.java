package X;

import java.util.Arrays;

/* renamed from: X.Exe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7481Exe {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C7481Exe)) {
                return false;
            }
            C7481Exe c7481Exe = (C7481Exe) obj;
            if (this.A01 != c7481Exe.A01 || this.A00 != c7481Exe.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01 + 31) * 31) + this.A00;
    }

    public final String toString() {
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00)}, 2));
    }

    public C7481Exe(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i <= 0) {
            throw C3cG.A0Q("Check failed.");
        }
        if (i2 <= 0) {
            throw C3cG.A0Q("Check failed.");
        }
    }
}
