package X;

import java.util.Arrays;

/* renamed from: X.7nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07067nc {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C07067nc c07067nc = (C07067nc) obj;
                if (!this.A00.equals(c07067nc.A00) || !this.A01.equals(c07067nc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public C07067nc(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
