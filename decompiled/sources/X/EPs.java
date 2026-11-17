package X;

import android.net.Uri;
import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class EPs {
    public final Uri A00;
    public final C7mC A01;
    public final String A02;
    public final C5225Ddi A03;
    public final EPL A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof EPs)) {
            return false;
        }
        EPs ePs = (EPs) obj;
        return this.A00.equals(ePs.A00) && this.A03.equals(ePs.A03) && this.A01.equals(ePs.A01) && this.A02.equals(ePs.A02);
    }

    public final int hashCode() {
        return BV7.A0F(this.A02, this.A00, this.A03, this.A04, this.A01);
    }

    public EPs(C7mC c7mC, String str, String str2, C5225Ddi c5225Ddi, EPL epl) {
        Uri uriA01 = C7Je.A01(str);
        C7384Etj.A0U(uriA01);
        this.A00 = uriA01;
        this.A03 = c5225Ddi;
        this.A04 = epl;
        this.A02 = str2;
        this.A01 = c7mC;
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (obj == ((EPs) next).A04) {
            abstractCollection.add(next);
        }
    }
}
