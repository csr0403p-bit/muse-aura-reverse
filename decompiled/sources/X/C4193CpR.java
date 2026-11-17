package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.CpR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4193CpR {
    public final Feature A00;
    public final C4247CrJ A01;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4193CpR)) {
            return false;
        }
        C4193CpR c4193CpR = (C4193CpR) obj;
        if (CS7.A01(this.A01, c4193CpR.A01)) {
            return CS7.A00(this.A00, c4193CpR.A00);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0D(this.A01, this.A00);
    }

    public final String toString() {
        C7392EuT c7392EuT = new C7392EuT(this);
        c7392EuT.A00(this.A01, "key");
        c7392EuT.A00(this.A00, "feature");
        return c7392EuT.toString();
    }

    public /* synthetic */ C4193CpR(Feature feature, C4247CrJ c4247CrJ) {
        this.A01 = c4247CrJ;
        this.A00 = feature;
    }
}
