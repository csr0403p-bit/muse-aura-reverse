package X;

import android.os.Build;

/* loaded from: classes5.dex */
public final class Bk2 {
    public final InterfaceC2809Blm A00;

    public static Bk2 A00(Object obj) {
        return new Bk2(Build.VERSION.SDK_INT >= 31 ? new Bl9(obj) : new Bk9(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Bk2) {
            return this.A00.equals(((Bk2) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public Bk2(InterfaceC2809Blm interfaceC2809Blm) {
        this.A00 = interfaceC2809Blm;
    }
}
