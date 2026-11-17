package X;

import java.io.File;

/* renamed from: X.Efz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7093Efz {
    public final File A00;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7093Efz)) {
            return false;
        }
        return this.A00.equals(((C7093Efz) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C7093Efz(File file) {
        this.A00 = file;
    }
}
