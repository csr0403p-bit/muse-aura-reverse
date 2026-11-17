package X;

import com.facebook.rendercore.DuplicateRenderUnitException;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class FGW {
    public final long A00;
    public final Av8 A01;
    public final RenderTreeNode A02;
    public final Object A03;
    public final RenderTreeNode[] A04;

    public FGW(RenderTreeNode renderTreeNode, Object obj, RenderTreeNode[] renderTreeNodeArr, long j) {
        int i;
        C7384Etj.A0Y(renderTreeNodeArr, 1);
        this.A02 = renderTreeNode;
        this.A04 = renderTreeNodeArr;
        this.A00 = j;
        this.A03 = obj;
        int length = renderTreeNodeArr.length;
        Av8 av8 = new Av8();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        Av8.A02(av8, length == 7 ? 8 : ((length - 1) / 7) + length);
        this.A01 = av8;
        for (int i2 = 0; i2 < length; i2++) {
            Av8 av82 = this.A01;
            RenderTreeNode[] renderTreeNodeArr2 = this.A04;
            RenderTreeNode renderTreeNode2 = renderTreeNodeArr2[i2];
            int iA00 = Av4.A00(av82, AbstractC7607F5u.A0M(renderTreeNode2));
            if (iA00 < 0 || (i = av82.A02[iA00]) == -1) {
                av82.A04(AbstractC7607F5u.A0M(renderTreeNodeArr2[i2]), i2);
            } else {
                RenderTreeNode renderTreeNode3 = renderTreeNodeArr2[i];
                Locale locale = Locale.US;
                Integer numValueOf = Integer.valueOf(i2);
                String strA00 = renderTreeNode2.A00(null);
                Integer numValueOf2 = Integer.valueOf(i);
                String strA002 = renderTreeNode3.A00(null);
                StringBuilder sbA0x = C60O.A0x("RenderTree details:\n");
                sbA0x.append(String.format(locale, "Full child list (size = %d):\n", Arrays.copyOf(BV5.A1Y(renderTreeNodeArr2.length), 1)));
                for (RenderTreeNode renderTreeNode4 : renderTreeNodeArr2) {
                    int i3 = 0;
                    for (RenderTreeNode renderTreeNode5 = renderTreeNode4.A06; renderTreeNode5 != null; renderTreeNode5 = renderTreeNode5.A06) {
                        i3++;
                    }
                    sbA0x.append(AbstractC2159Azp.A0y("  ", i3));
                    sbA0x.append(String.format(locale, "%s\n", Arrays.copyOf(new Object[]{renderTreeNode4.A00(this)}, 1)));
                }
                String str = String.format(locale, "RenderTrees must not have RenderUnits with the same ID:\nAttempted to add item with existing ID at index %d: %s\nExisting item at index %d: %s\nFull RenderTree: %s", Arrays.copyOf(new Object[]{numValueOf, strA00, numValueOf2, strA002, sbA0x.toString()}, 5));
                long jA0M = AbstractC7607F5u.A0M(renderTreeNode2);
                new DuplicateRenderUnitException(jA0M, str);
                AGH.A0D(HxE.A01("existing_index", numValueOf2, C3cG.A0r("duplicate_id", Long.valueOf(jA0M)), C3cG.A0r("new_index", numValueOf)));
                Hx0.A00();
            }
        }
    }

    public static int A00(FGW fgw) {
        return fgw.A02.A03.width();
    }
}
