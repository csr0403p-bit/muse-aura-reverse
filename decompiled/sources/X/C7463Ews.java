package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.Ews, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7463Ews extends C06G {
    public Exception A00;
    public final int A01;
    public final EnumC3305CDe A02;
    public final Set<String> A03;

    public C7463Ews(EnumC3305CDe enumC3305CDe, String... strArr) {
        Object[] objArrCopyOf = Arrays.copyOf(strArr, 1);
        C7384Etj.A0Y(objArrCopyOf, 0);
        Set<String> setA0H = BFI.A0H(objArrCopyOf);
        C7384Etj.A0Y(setA0H, 1);
        this.A02 = enumC3305CDe;
        this.A03 = setA0H;
        this.A01 = -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7463Ews) {
                C7463Ews c7463Ews = (C7463Ews) obj;
                if (this.A02 != c7463Ews.A02 || !C7384Etj.areEqual(this.A03, c7463Ews.A03) || this.A01 != c7463Ews.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A02)) * 31 * 31) + this.A01;
    }
}
