package X;

import android.content.pm.Signature;
import java.util.List;

/* renamed from: X.7mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C06897mc {
    public final List<Signature> A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C06897mc) {
                C06897mc c06897mc = (C06897mc) obj;
                if (!this.A00.equals(c06897mc.A00) || this.A01 != c06897mc.A01 || this.A02 != c06897mc.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A00) + (this.A01 ? 1231 : 1237)) * 31) + (this.A02 ? 1231 : 1237);
    }

    public final String toString() {
        List<Signature> list = this.A00;
        boolean z = this.A01;
        boolean z2 = this.A02;
        StringBuilder sbA0f = C3cG.A0f(list, "SigningInfoCompat(signatures=");
        sbA0f.append(", hasMultipleSigners=");
        sbA0f.append(z);
        sbA0f.append(", hasPastSigningCertificates=");
        sbA0f.append(z2);
        return AnonymousClass001.A0v(")", sbA0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C06897mc(List<? extends Signature> list, boolean z, boolean z2) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = z2;
    }
}
