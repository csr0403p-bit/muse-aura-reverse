package X;

import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BRL<T> {
    public final Object A00;
    public final T A01;
    public final Map<String, Object> A02;
    public final G0W<T, BFM, Integer, Unit> A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                BRL brl = (BRL) obj;
                if (!C7384Etj.areEqual(this.A01, brl.A01) || !C7384Etj.areEqual(this.A00, brl.A00) || !C7384Etj.areEqual(this.A02, brl.A02) || this.A03 != brl.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + AnonymousClass005.A0E(this.A00) + AnonymousClass005.A0E(this.A02) + AnonymousClass005.A0E(this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("NavEntry(key=");
        sbA0x.append(this.A01);
        sbA0x.append(", contentKey=");
        sbA0x.append(this.A00);
        sbA0x.append(AbstractC7606F5t.A00(7));
        sbA0x.append(this.A02);
        sbA0x.append(", content=");
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BRL(T t, Object obj, Map<String, ? extends Object> map, G0W<? super T, ? super BFM, ? super Integer, Unit> g0w) {
        this.A01 = t;
        this.A00 = obj;
        this.A02 = map;
        this.A03 = g0w;
    }

    public final void A00(BFM bfm, int i) {
        bfm.AgG(295512821);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, this) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            AnonymousClass001.A1G(this.A01, bfm, this.A03, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BT2(this, i, 9);
        }
    }
}
