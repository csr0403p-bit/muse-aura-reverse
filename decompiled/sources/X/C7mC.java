package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.7mC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7mC implements Serializable {
    public static final long serialVersionUID = 0;
    public String sha1Hash;
    public String sha256Hash;

    public final boolean equals(Object obj) {
        if (obj instanceof C7mC) {
            return this.sha256Hash.equals(((C7mC) obj).sha256Hash);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.sha256Hash});
    }

    public C7mC(String str) {
        if (str.length() != 43) {
            throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
        }
        this.sha256Hash = str;
    }
}
