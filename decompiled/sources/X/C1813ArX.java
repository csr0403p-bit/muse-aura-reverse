package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* renamed from: X.ArX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1813ArX {
    public final long A00;

    public static String A00(long j) {
        return j == 0 ? "Unspecified" : j == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES ? "Sp" : j == 8589934592L ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1813ArX) && this.A00 == ((C1813ArX) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ C1813ArX(long j) {
        this.A00 = j;
    }
}
