package X;

import android.net.Uri;

/* renamed from: X.Bas, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2418Bas extends Bat {
    public final Uri A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Bat) {
            return this.A00.equals(((C2418Bas) ((Bat) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return BV8.A0v(this.A00, C60O.A0x("OutputResults{outputUri="));
    }

    public C2418Bas(Uri uri) {
        if (uri == null) {
            throw BV4.A0a("Null outputUri");
        }
        this.A00 = uri;
    }
}
