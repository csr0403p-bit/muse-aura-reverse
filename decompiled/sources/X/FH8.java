package X;

import android.graphics.drawable.Animatable;
import android.view.View;

/* loaded from: classes6.dex */
public final class FH8 extends AbstractC7798FFe<FDW, FHQ, Void> {
    public final FBB A00;
    public final C7854FHq A01;
    public final boolean A02;

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        FHQ fhq = (FHQ) obj;
        C7854FHq c7854FHq = this.A01;
        FM6 fm6 = (FM6) fhq;
        FM9 fm9 = fm6.A01;
        fm9.A07 = false;
        fm9.A05 = null;
        View view = fm9.A0E;
        view.setLayerType(0, null);
        view.invalidate();
        C7854FHq.A0H(fm6, c7854FHq);
        Object background = fhq.getBackground();
        if (background instanceof Animatable) {
            ((Animatable) background).stop();
        }
        Object foreground = fhq.getForeground();
        if (foreground instanceof Animatable) {
            ((Animatable) foreground).stop();
        }
        fhq.setBackground(null);
        fhq.setForeground(null);
        fhq.setLayerType(0, null);
    }

    public FH8(FBB fbb, C7854FHq c7854FHq) {
        super(fbb);
        this.A02 = !FBA.A0A(fbb);
        this.A00 = fbb;
        this.A01 = c7854FHq;
    }
}
