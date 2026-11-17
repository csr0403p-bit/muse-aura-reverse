package X;

import android.net.Uri;

/* renamed from: X.Dkl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5567Dkl {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C5567Dkl(Uri uri, String str, String str2, String str3, String str4, int i, int i2) {
        this.A02 = uri;
        this.A06 = str4;
        this.A05 = str3;
        this.A01 = i2;
        this.A00 = i;
        this.A04 = str2;
        this.A03 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5567Dkl) {
                C5567Dkl c5567Dkl = (C5567Dkl) obj;
                if (!this.A02.equals(c5567Dkl.A02) || !C6xC.A00(this.A06, c5567Dkl.A06) || !C6xC.A00(this.A05, c5567Dkl.A05) || this.A01 != c5567Dkl.A01 || this.A00 != c5567Dkl.A00 || !C6xC.A00(this.A04, c5567Dkl.A04) || !C6xC.A00(this.A03, c5567Dkl.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AnonymousClass005.A0E(this.A02) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + this.A01) * 31) + this.A00) * 31) + AnonymousClass006.A0G(this.A04)) * 31) + AnonymousClass005.A0H(this.A03);
    }
}
