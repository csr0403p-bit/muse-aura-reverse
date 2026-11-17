package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class E2V extends AbstractC6411E4n {
    public final ImmutableList<String> A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E2V e2v = (E2V) obj;
                if (!C6xC.A00(super.A00, ((AbstractC6411E4n) e2v).A00) || !C6xC.A00(this.A01, e2v.A01) || !this.A00.equals(e2v.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, (BV8.A0B(super.A00) + BV7.A0I(this.A01)) * 31);
    }

    public E2V(String str, String str2, List<String> list) {
        super(str);
        C1G.A07(BV6.A1b(list));
        this.A01 = str2;
        ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) list);
        this.A00 = immutableListCopyOf;
        immutableListCopyOf.get(0);
    }

    public static List<Integer> A00(String str) {
        ArrayList arrayListA0h = C3cG.A0h();
        try {
            int length = str.length();
            if (length >= 10) {
                C60Q.A1P(arrayListA0h, BV7.A0J(str, 0, 4));
                C60Q.A1P(arrayListA0h, BV7.A0J(str, 5, 7));
                C60Q.A1P(arrayListA0h, BV7.A0J(str, 8, 10));
                return arrayListA0h;
            }
            if (length >= 7) {
                C60Q.A1P(arrayListA0h, BV7.A0J(str, 0, 4));
                C60Q.A1P(arrayListA0h, BV7.A0J(str, 5, 7));
                return arrayListA0h;
            }
            if (length >= 4) {
                C60Q.A1P(arrayListA0h, BV7.A0J(str, 0, 4));
            }
            return arrayListA0h;
        } catch (NumberFormatException unused) {
            return C3cG.A0h();
        }
    }

    @Override // X.AbstractC6411E4n
    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.A00);
        sbA0w.append(": description=");
        sbA0w.append(this.A01);
        sbA0w.append(": values=");
        return C8j3.A14(this.A00, sbA0w);
    }
}
