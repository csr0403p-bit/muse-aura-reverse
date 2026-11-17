package X;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public final class AlW extends AbstractC1439Aj8 implements InterfaceC1487Aju {
    public Rect A00;

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        A00(null);
    }

    private final void A00(Rect rect) {
        C0910AHm c0910AHmA01 = C0910AHm.A01(new Rect[16]);
        c0910AHmA01.A0E(AbstractC1329AhG.A00(this).getSystemGestureExclusionRects(), c0910AHmA01.A00);
        Rect rect2 = this.A00;
        if (rect2 != null) {
            c0910AHmA01.A0I(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            c0910AHmA01.A0G(rect);
        }
        AbstractC1329AhG.A00(this).setSystemGestureExclusionRects(c0910AHmA01.A08());
        this.A00 = rect;
    }

    @Override // X.InterfaceC1487Aju
    public final void ATW(InterfaceC1497Ak4 interfaceC1497Ak4) {
        A00(Ab3.A04(AbstractC1496Ak3.A01(interfaceC1497Ak4).APk(interfaceC1497Ak4, true)));
    }
}
