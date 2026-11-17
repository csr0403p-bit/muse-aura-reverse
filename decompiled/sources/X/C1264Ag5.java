package X;

import android.graphics.RenderNode;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.Ag5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1264Ag5 extends AbstractC1437Aj6 implements InterfaceC1332AhJ {
    public RenderNode A00;
    public final C1267AgC A01;
    public final AndroidEdgeEffectOverscrollEffect A02;

    public static RenderNode A00(C1264Ag5 c1264Ag5) {
        RenderNode renderNode = c1264Ag5.A00;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        c1264Ag5.A00 = renderNode2;
        return renderNode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    @Override // X.InterfaceC1332AhJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(X.C16Z r20) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1264Ag5.draw(X.16Z):void");
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public C1264Ag5(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C1267AgC c1267AgC, C1Z3 c1z3) {
        this.A02 = androidEdgeEffectOverscrollEffect;
        this.A01 = c1267AgC;
        A0G(c1z3);
    }
}
