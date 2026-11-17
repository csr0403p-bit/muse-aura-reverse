package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ewu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7464Ewu extends C06G {
    public Map<Integer, ? extends Set<String>> A00;
    public final String A01;
    public final String A02;
    public final List<String> A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7464Ewu) {
                C7464Ewu c7464Ewu = (C7464Ewu) obj;
                if (this.A05 != c7464Ewu.A05 || this.A04 != c7464Ewu.A04 || !C7384Etj.areEqual(this.A01, c7464Ewu.A01) || !C7384Etj.areEqual(this.A03, c7464Ewu.A03) || !C7384Etj.areEqual(this.A02, c7464Ewu.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A03, (C0KA.A01((this.A05 ? 1231 : 1237) * 31, this.A04) + AnonymousClass006.A0G(this.A01)) * 31) + AnonymousClass005.A0H(this.A02);
    }

    /* JADX WARN: Incorrect types in method signature: (ZZLjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;)V */
    public C7464Ewu(String str, String str2, List list, boolean z, boolean z2) {
        this.A05 = z;
        this.A04 = z2;
        this.A01 = str;
        this.A03 = list;
        this.A02 = str2;
    }
}
