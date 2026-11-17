package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.List;

/* renamed from: X.AtQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1905AtQ {
    public C1917Ate A00;
    public C1805ArO A01;

    public final C1805ArO A00(List<? extends AzK> list) {
        AzK azK = null;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                AzK azK2 = list.get(i);
                try {
                    azK2.A4d(this.A00);
                    i++;
                    azK = azK2;
                } catch (Exception e) {
                    e = e;
                    azK = azK2;
                    StringBuilder sbA0w = C60O.A0w();
                    StringBuilder sbA0x = C60O.A0x("Error while applying EditCommand batch to buffer (length=");
                    C1917Ate c1917Ate = this.A00;
                    sbA0x.append(c1917Ate.A04.A00());
                    sbA0x.append(", composition=");
                    int i2 = c1917Ate.A01;
                    sbA0x.append(i2 != -1 ? C8j3.A0j(AbstractC1815ArZ.A00(i2, c1917Ate.A00)) : null);
                    sbA0x.append(BV3.A00(5));
                    C1917Ate c1917Ate2 = this.A00;
                    sbA0x.append((Object) Au3.A03(AbstractC1815ArZ.A00(c1917Ate2.A03, c1917Ate2.A02)));
                    sbA0w.append(AnonymousClass001.A0v("):", sbA0x));
                    sbA0w.append('\n');
                    AbstractC0878AGe.A0i(sbA0w, PairsDiscretionDocument.TERMINATOR, "", "", list, new BT9(22, this, azK));
                    throw new RuntimeException(sbA0w.toString(), e);
                }
            }
            ApQ apQA0X = AnonymousClass005.A0X(this.A00.toString());
            C1917Ate c1917Ate3 = this.A00;
            long jA00 = AbstractC1815ArZ.A00(c1917Ate3.A03, c1917Ate3.A02);
            long jA002 = !Au3.A05(this.A01.A00) ? C8j3.A0j(jA00).A00 : AbstractC1815ArZ.A00(Au3.A01(jA00), Au3.A02(jA00));
            int i3 = c1917Ate3.A01;
            C1805ArO c1805ArO = new C1805ArO(apQA0X, i3 != -1 ? C8j3.A0j(AbstractC1815ArZ.A00(i3, c1917Ate3.A00)) : null, jA002);
            this.A01 = c1805ArO;
            return c1805ArO;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public C1905AtQ() {
        C1805ArO c1805ArOA0e = C8j4.A0e(AbstractC1730ApR.A00, Au3.A01);
        this.A01 = c1805ArOA0e;
        this.A00 = new C1917Ate(c1805ArOA0e.A01, c1805ArOA0e.A00);
    }
}
