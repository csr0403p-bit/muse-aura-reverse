package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Gsn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10250Gsn extends Gsm {
    public final String toString() {
        ArrayList<AbstractC10245Gsg> arrayList = this.A03;
        C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
        return Gt5.A00(", ", arrayList.iterator());
    }

    public C10250Gsn() {
    }

    public C10250Gsn(AbstractC10245Gsg... abstractC10245GsgArr) {
        List listAsList = Arrays.asList(abstractC10245GsgArr);
        int i = this.A01;
        ArrayList<AbstractC10245Gsg> arrayList = this.A03;
        if (i > 1) {
            C10251Gso c10251Gso = new C10251Gso();
            c10251Gso.A03.addAll(listAsList);
            c10251Gso.A06();
            arrayList.add(c10251Gso);
        } else {
            arrayList.addAll(listAsList);
        }
        A06();
    }
}
