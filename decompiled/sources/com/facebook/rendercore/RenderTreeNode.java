package com.facebook.rendercore;

import X.AbstractC5321DgF;
import X.AbstractC7607F5u;
import X.Av4;
import X.Av8;
import X.C7384Etj;
import X.C79;
import X.C8472Feb;
import X.F0C;
import X.FGT;
import X.FGW;
import X.Hra;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class RenderTreeNode {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Rect A03;
    public final Rect A04;
    public final Hra A05;
    public final RenderTreeNode A06;
    public final FGT<?> A07;
    public final Object A08;
    public final F0C A09;

    public final String A00(FGW fgw) {
        Av8 av8;
        int iA00;
        FGT<?> fgt = this.A07;
        long jA0J = fgt.A0J();
        String strA0L = fgt.A0L();
        int i = (fgw == null || (iA00 = Av4.A00((av8 = fgw.A01), jA0J)) < 0) ? -1 : av8.A02[iA00];
        String shortString = this.A03.toShortString();
        C7384Etj.A0U(shortString);
        int iA0G = AbstractC7607F5u.A0G(this.A09.getValue());
        RenderTreeNode renderTreeNode = this.A06;
        return String.format(Locale.US, "Id=%d; renderUnit='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", Arrays.copyOf(new Object[]{Long.valueOf(jA0J), strA0L, Integer.valueOf(i), Integer.valueOf(this.A02), shortString, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(iA0G), Long.valueOf(renderTreeNode != null ? AbstractC7607F5u.A0M(renderTreeNode) : -1L)}, 9));
    }

    public RenderTreeNode(Rect rect, Rect rect2, Hra hra, RenderTreeNode renderTreeNode, FGT fgt, Object obj, int i) {
        this.A06 = renderTreeNode;
        this.A07 = fgt;
        this.A08 = obj;
        this.A03 = rect;
        this.A04 = rect2;
        this.A02 = i;
        this.A05 = hra;
        this.A00 = (renderTreeNode != null ? renderTreeNode.A00 : 0) + rect.left;
        this.A01 = (renderTreeNode != null ? renderTreeNode.A01 : 0) + rect.top;
        this.A09 = AbstractC5321DgF.A02(C79.A01, C8472Feb.A00(35));
    }
}
