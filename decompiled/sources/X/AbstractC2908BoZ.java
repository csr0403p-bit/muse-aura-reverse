package X;

import android.util.Size;
import android.widget.FrameLayout;

/* renamed from: X.BoZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2908BoZ {
    public Size A00;
    public FrameLayout A01;
    public boolean A02 = false;
    public final C2907BoX A03;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C2910Bob
            if (r0 == 0) goto Lbe
            r0 = r8
            X.Bob r0 = (X.C2910Bob) r0
            android.view.TextureView r4 = r0.A02
        L9:
            if (r4 == 0) goto L94
            boolean r0 = r8.A02
            if (r0 == 0) goto L94
            X.BoX r5 = r8.A03
            android.widget.FrameLayout r0 = r8.A01
            android.util.Size r7 = X.BV8.A0b(r0)
            int r6 = r0.getLayoutDirection()
            int r0 = r7.getHeight()
            java.lang.String r8 = "PreviewTransform"
            if (r0 == 0) goto Lc5
            int r0 = r7.getWidth()
            if (r0 == 0) goto Lc5
            boolean r0 = X.C2907BoX.A01(r5)
            if (r0 == 0) goto L94
            boolean r0 = r4 instanceof android.view.TextureView
            if (r0 == 0) goto L95
            r1 = r4
            android.view.TextureView r1 = (android.view.TextureView) r1
            android.graphics.Matrix r0 = X.C2907BoX.A00(r5)
            r1.setTransform(r0)
        L3d:
            boolean r1 = X.C2907BoX.A01(r5)
            r0 = 0
            X.BeS.A07(r1, r0)
            android.graphics.Matrix r3 = r5.A02(r7, r6)
            android.util.Size r0 = r5.A04
            int r0 = r0.getWidth()
            float r1 = (float) r0
            android.util.Size r0 = r5.A04
            android.graphics.RectF r2 = X.BV8.A0R(r0, r1)
            r3.mapRect(r2)
            r0 = 0
            r4.setPivotX(r0)
            r4.setPivotY(r0)
            float r1 = r2.width()
            android.util.Size r0 = r5.A04
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            r4.setScaleX(r1)
            float r1 = r2.height()
            android.util.Size r0 = r5.A04
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            r4.setScaleY(r1)
            float r1 = r2.left
            int r0 = r4.getLeft()
            float r0 = (float) r0
            float r1 = r1 - r0
            r4.setTranslationX(r1)
            float r1 = r2.top
            int r0 = r4.getTop()
            float r0 = (float) r0
            float r1 = r1 - r0
            r4.setTranslationY(r1)
        L94:
            return
        L95:
            android.view.Display r1 = r4.getDisplay()
            boolean r0 = r5.A06
            r3 = 1
            if (r0 == 0) goto La9
            if (r1 == 0) goto La9
            int r2 = r1.getRotation()
            int r0 = r5.A01
            r1 = 1
            if (r2 != r0) goto Laa
        La9:
            r1 = 0
        Laa:
            boolean r0 = r5.A06
            if (r0 != 0) goto Lbc
            int r0 = r5.A00
            if (r0 == 0) goto Lbc
        Lb2:
            if (r1 != 0) goto Lb6
            if (r3 == 0) goto L3d
        Lb6:
            java.lang.String r0 = "Custom rotation not supported with SurfaceView/PERFORMANCE mode."
            X.AbstractC2875Bni.A02(r8, r0)
            goto L3d
        Lbc:
            r3 = 0
            goto Lb2
        Lbe:
            r0 = r8
            X.Boy r0 = (X.C2932Boy) r0
            android.view.SurfaceView r4 = r0.A00
            goto L9
        Lc5:
            java.lang.String r0 = "Transform not applied due to PreviewView size: "
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r7)
            X.AbstractC2875Bni.A03(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2908BoZ.A00():void");
    }

    public AbstractC2908BoZ(FrameLayout frameLayout, C2907BoX c2907BoX) {
        this.A01 = frameLayout;
        this.A03 = c2907BoX;
    }
}
