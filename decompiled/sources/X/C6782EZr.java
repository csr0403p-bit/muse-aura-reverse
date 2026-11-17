package X;

import org.conscrypt.Conscrypt;

/* renamed from: X.EZr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6782EZr {
    public static final boolean A00() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() > 2) {
                return true;
            }
        } else if (version.minor() != 1) {
            if (version.minor() > 1) {
                return true;
            }
        } else if (version.patch() >= 0) {
            return true;
        }
        return false;
    }
}
