package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.EIt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6594EIt {
    public final String A00;
    public final Map<String, EIs> A01;
    public final Set<C6596EIx> A02;
    public final Set<C6595EIw> A03;

    public static final String A00(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        return !collection.isEmpty() ? FGI.A0M(C6tn.A07(AbstractC0878AGe.A0L(",\n", PairsDiscretionDocument.TERMINATOR, PairsDiscretionDocument.TERMINATOR, collection, null), "    "), "},") : " }";
    }

    public final boolean equals(Object obj) {
        Set<C6595EIw> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6594EIt)) {
            return false;
        }
        C6594EIt c6594EIt = (C6594EIt) obj;
        if (!this.A00.equals(c6594EIt.A00) || !this.A01.equals(c6594EIt.A01) || !this.A02.equals(c6594EIt.A02)) {
            return false;
        }
        Set<C6595EIw> set2 = this.A03;
        if (set2 == null || (set = c6594EIt.A03) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass001.A0G(this.A00)));
    }

    public final String toString() {
        Collection collectionA0c;
        String str = this.A00;
        String strA00 = A00(AbstractC0878AGe.A0c(this.A01.values(), new C7572F4l(17)));
        String strA002 = A00(this.A02);
        Set<C6595EIw> set = this.A03;
        if (set == null || (collectionA0c = AbstractC0878AGe.A0c(set, new C7572F4l(18))) == null) {
            collectionA0c = C0881AGi.A00;
        }
        return C6tn.A04(FGI.A0m("\n            |TableInfo {\n            |    name = '", str, "',\n            |    columns = {", strA00, "\n            |    foreignKeys = {", strA002, "\n            |    indices = {", A00(collectionA0c), "\n            |}\n        "));
    }

    public C6594EIt(String str, Map<String, EIs> map, Set<C6596EIx> set, Set<C6595EIw> set2) {
        this.A00 = str;
        this.A01 = map;
        this.A02 = set;
        this.A03 = set2;
    }
}
