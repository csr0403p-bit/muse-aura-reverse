package X;

import android.graphics.Rect;
import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class Al0 extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1476Ajj, InterfaceC1237AfR, InterfaceC1527Akg, InterfaceC1224Af2, InterfaceC1452AjL {
    public int A00 = -1;
    public final G0U<InterfaceC1620Amr, Unit> A01 = BUX.A00(this, 38);
    public final /* synthetic */ AndroidComposeView A02;

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
    }

    @Override // X.InterfaceC1527Akg
    public final boolean AUr(KeyEvent keyEvent) {
        return false;
    }

    public Al0(AndroidComposeView androidComposeView) {
        this.A02 = androidComposeView;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1237AfR
    public final Object AM2() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW = c3tg.AQW(j);
        int i = azeAQW.A01;
        int i2 = azeAQW.A00;
        return axy.APW(C9jH.A00, this.A01, BUX.A00(azeAQW, 36), i, i2);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    @Override // X.InterfaceC1527Akg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ATl(android.view.KeyEvent r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Al0.ATl(android.view.KeyEvent):boolean");
    }

    @Override // X.InterfaceC1224Af2
    public final Object bringIntoView(InterfaceC1497Ak4 interfaceC1497Ak4, Function0<AaC> function0, HtJ<? super Unit> htJ) {
        long jA00 = InterfaceC1497Ak4.A00(interfaceC1497Ak4);
        AaC aaCInvoke = function0.invoke();
        if (aaCInvoke != null) {
            AaC aaCA03 = aaCInvoke.A03(jA00);
            this.A02.requestRectangleOnScreen(new Rect((int) aaCA03.A01, (int) aaCA03.A03, (int) aaCA03.A02, (int) aaCA03.A00), false);
        }
        return Unit.INSTANCE;
    }
}
