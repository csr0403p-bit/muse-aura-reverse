package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.C0h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3159C0h {
    public C1U A00;
    public final BY2 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final AtomicBoolean A05;
    public final boolean A06;
    public final String A07;
    public final AtomicBoolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C3159C0h c3159C0h = (C3159C0h) obj;
                if (!C6xC.A00(this.A04, c3159C0h.A04) || !C6xC.A00(this.A02, c3159C0h.A02) || !C6xC.A00(this.A03, c3159C0h.A03) || !C6xC.A00(this.A08, c3159C0h.A08) || this.A01 != c3159C0h.A01 || this.A00 != c3159C0h.A00 || this.A06 != c3159C0h.A06 || !C6xC.A00(this.A07, c3159C0h.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A02, this.A03, this.A08, this.A00, this.A01, Boolean.valueOf(this.A06), AnonymousClass001.A0h()});
    }

    public C3159C0h(C1U c1u, BY2 by2, String str, String str2, String str3, String str4, boolean z) {
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A08 = null;
        this.A05 = null;
        this.A00 = c1u;
        this.A01 = by2;
        this.A06 = z;
        this.A07 = str4;
    }

    public C3159C0h(C1U c1u, BY2 by2, String str, String str2, String str3, String str4, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z) {
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A08 = atomicBoolean;
        this.A05 = atomicBoolean2;
        this.A00 = c1u;
        this.A01 = by2;
        this.A06 = z;
        this.A07 = str4;
    }
}
