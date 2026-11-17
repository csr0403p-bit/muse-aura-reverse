package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.List;

/* renamed from: X.Acv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1162Acv extends AbstractC1439Aj8 implements InterfaceC1332AhJ {
    public Acy<?> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1162Acv) && C7384Etj.areEqual(this.A00, ((C1162Acv) obj).A00));
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        List<C1073AWe> list = this.A00.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1073AWe c1073AWe = list.get(i);
            GraphicsLayer graphicsLayer = c1073AWe.A06;
            if (graphicsLayer != null) {
                long j = c1073AWe.A00;
                float f = (int) (j >> 32);
                float fA09 = AnonymousClass002.A09(j);
                long j2 = graphicsLayer.A06;
                float f2 = f - ((int) (j2 >> 32));
                float fA092 = fA09 - AnonymousClass002.A09(j2);
                AT2 at2 = ((AaI) c16z.AEq()).A01;
                at2.AhL(f2, fA092);
                try {
                    ATI.A00(c16z, graphicsLayer);
                    at2.AhL(-f2, -fA092);
                } catch (Throwable th) {
                    AT2.A01(at2, f2, fA092);
                    throw th;
                }
            }
        }
        c16z.A9O();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        this.A00.A02 = this;
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        Acy.A02(this.A00);
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("DisplayingDisappearingItemsNode(animator="));
    }
}
