package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.Hla, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10482Hla extends C06G {
    public final AbstractC10579HwA A00;
    public final C10574Huh A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10482Hla) {
                C10482Hla c10482Hla = (C10482Hla) obj;
                if (!C7384Etj.areEqual(this.A00, c10482Hla.A00) || !C7384Etj.areEqual(this.A01, c10482Hla.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", price=", C3cG.A0f(this.A00, "IapPurchase(dcpPurchase="));
    }

    public C10482Hla(AbstractC10579HwA abstractC10579HwA, C10574Huh c10574Huh) {
        this.A00 = abstractC10579HwA;
        this.A01 = c10574Huh;
    }

    public static void A0y(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C10482Hla) it.next()).A00);
    }
}
