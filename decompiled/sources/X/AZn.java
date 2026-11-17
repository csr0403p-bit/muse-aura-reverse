package X;

import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public abstract class AZn {
    public static final float A00 = ViewConfiguration.getScrollFriction();

    public static final C1YC A00(BFM bfm) {
        BBI bbi = (BBI) bfm;
        AXN axnA04 = AKO.A04(Am0.A04, bbi);
        boolean zA62 = bfm.A62(axnA04.AEm());
        Object objAaT = bfm.AaT();
        if (zA62 || objAaT == C78N.A00) {
            objAaT = new C1054ATb(new C1155Acn(axnA04));
            BBI.A0O(bbi, objAaT);
        }
        return (C1YC) objAaT;
    }
}
