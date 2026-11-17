package X;

import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.Aos, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1709Aos {
    public static final Rect A00(BLU blu) {
        return new Rect(blu.A01, blu.A03, blu.A02, blu.A00);
    }

    public static final RectF A01(AaC aaC) {
        return new RectF(aaC.A01, aaC.A03, aaC.A02, aaC.A00);
    }

    public static final AaC A02(RectF rectF) {
        return C8j3.A0f(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
