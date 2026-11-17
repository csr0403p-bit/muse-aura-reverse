package X;

import android.graphics.Rect;
import android.graphics.RenderNode;

/* loaded from: classes6.dex */
public final class FM8 {
    public int A00;
    public int A01;
    public final RenderNode A02;
    public final Rect A03;
    public final FM7 A04;

    public FM8(FM7 fm7) {
        this.A04 = fm7;
        RenderNode renderNode = new RenderNode("BoxShadowOutset");
        renderNode.setClipToBounds(false);
        renderNode.setHasOverlappingRendering(false);
        this.A02 = renderNode;
        this.A03 = AbstractC7607F5u.A0X();
        this.A01 = -1;
        this.A00 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.view.View r12, float r13) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FM8.A00(android.view.View, float):void");
    }
}
