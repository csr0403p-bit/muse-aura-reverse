package X;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* renamed from: X.FfC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8505FfC extends C8502Ff9 {
    @Override // X.C8495Ff2, X.C8496Ff3
    public final List<Rect> A0E(int i) {
        return this.A0A.getBoundingRects(AbstractC10401HbI.A00(i));
    }

    @Override // X.C8495Ff2, X.C8496Ff3
    public final List<Rect> A0F(int i) {
        return this.A0A.getBoundingRectsIgnoringVisibility(AbstractC10401HbI.A00(i));
    }

    @Override // X.C8495Ff2, X.C8496Ff3
    public final void A0G() {
    }

    public C8505FfC(C8497Ff4 c8497Ff4, C8505FfC c8505FfC) {
        super(c8497Ff4, (C8501Ff8) c8505FfC);
    }

    public C8505FfC(C8497Ff4 c8497Ff4, WindowInsets windowInsets) {
        super(c8497Ff4, windowInsets);
    }
}
