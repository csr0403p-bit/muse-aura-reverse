package X;

import android.net.Uri;

/* renamed from: X.Evl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7428Evl implements CCV {
    public final String A00;

    @Override // X.CCV
    public final boolean A75(Uri uri) {
        return this.A00.contains(uri.toString());
    }

    @Override // X.CCV
    public final String AMJ() {
        return this.A00;
    }

    @Override // X.CCV
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7428Evl) {
            return this.A00.equals(((C7428Evl) obj).A00);
        }
        return false;
    }

    @Override // X.CCV
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00;
    }

    public C7428Evl(String str) {
        str.getClass();
        this.A00 = str;
    }
}
