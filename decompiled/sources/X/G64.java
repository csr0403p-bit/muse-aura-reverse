package X;

import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class G64 implements G6J {
    public static final C06827l3 A00;
    public static final EnumC8947FuL A01;

    /* JADX WARN: Incorrect types in method signature: (LX/G6G;LX/G65;Ljava/lang/String;Ljava/util/List<+LX/FuL;>;I)V */
    public static final void A00(String str, List list, G65 g65, G6G g6g, int i) {
        int i2 = 0;
        g6g.A03("tr", g65, new CharSequence[]{(i <= 0 || i % 2 != 0) ? null : "class=\"intellij-row-even\""}, false);
        List<G65> listADb = g65.ADb();
        ArrayList arrayListA0h = C3cG.A0h();
        for (G65 g652 : listADb) {
            if (((G69) g652).A03.equals(AbstractC9213G6t.A01)) {
                arrayListA0h.add(g652);
            }
        }
        Iterator it = AbstractC0878AGe.A0h(arrayListA0h).iterator();
        while (it.hasNext()) {
            C2273BRq c2273BRq = (C2273BRq) it.next();
            int i3 = c2273BRq.A00;
            if (i3 >= list.size()) {
                throw C3cG.A0Q("Too many cells in a row! Should check parser.");
            }
            EnumC8947FuL enumC8947FuL = (EnumC8947FuL) list.get(i3);
            String strA0N = enumC8947FuL.isDefault ? null : FGI.A0N("align=\"", enumC8947FuL.htmlName, '\"');
            G65 g653 = (G65) c2273BRq.A01;
            g6g.A03(str, g653, new CharSequence[]{strA0N}, false);
            g6g.A00(g653);
            g6g.A02(str);
        }
        List<G65> listADb2 = g65.ADb();
        if (!(listADb2 instanceof Collection) || !listADb2.isEmpty()) {
            Iterator<G65> it2 = listADb2.iterator();
            while (it2.hasNext()) {
                if (((G69) AbstractC7607F5u.A1D(it2)).A03.equals(AbstractC9213G6t.A01) && (i2 = i2 + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        int size = list.size();
        while (i2 < size) {
            g6g.A01("<td></td>");
            i2++;
        }
        g6g.A02("tr");
    }

    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) {
        AnonymousClass005.A10(g6g, str, g65);
        if (!((G69) g65).A03.equals(AbstractC9212G6s.A06)) {
            throw AbstractC7608F5v.A19();
        }
        G65 g65A02 = G66.A02(AbstractC9213G6t.A05, g65);
        if (g65A02 == null) {
            throw C3cG.A0Q("Could not find table separator");
        }
        ArrayList arrayListA0h = C3cG.A0h();
        List listA05 = A00.A05(G66.A00(str, g65A02));
        int size = listA05.size();
        for (int i = 0; i < size; i++) {
            String strA0n = C60Q.A0n(listA05, i);
            if (!C7BY.A0j(strA0n) || (1 <= i && i <= C60O.A00(listA05) - 1)) {
                String strA0l = AnonymousClass002.A0l(strA0n);
                boolean zA0m = C7BY.A0m(strA0l, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                boolean zA0l = C7BY.A0l(strA0l, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                arrayListA0h.add(zA0m ? zA0l ? EnumC8947FuL.CENTER : EnumC8947FuL.LEFT : zA0l ? EnumC8947FuL.RIGHT : A01);
            }
        }
        int i2 = 0;
        g6g.A03("table", g65, new CharSequence[0], false);
        Iterator itA00 = G65.A00(g65);
        while (itA00.hasNext()) {
            G65 g652 = (G65) itA00.next();
            G72 g72 = ((G69) g652).A03;
            if (g72.equals(AbstractC9212G6s.A02)) {
                g6g.A01("<thead>");
                A00("th", arrayListA0h, g652, g6g, -1);
                g6g.A01("</thead>");
            } else if (g72.equals(AbstractC9212G6s.A04)) {
                if (i2 == 0) {
                    g6g.A01("<tbody>");
                }
                i2++;
                A00("td", arrayListA0h, g652, g6g, i2);
            }
        }
        if (i2 > 0) {
            g6g.A01("</tbody>");
        }
        g6g.A02("table");
    }

    static {
        for (EnumC8947FuL enumC8947FuL : EnumC8947FuL.values()) {
            if (enumC8947FuL.isDefault) {
                A01 = enumC8947FuL;
                A00 = C06827l3.A02("\\|");
                return;
            }
        }
        throw C3cG.A0Q("Must be default alignment");
    }
}
