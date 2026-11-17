package X;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import java.util.function.Consumer;

/* renamed from: X.Alr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1576Alr implements InterfaceC1708Aor {
    public final MutableState A00 = AbstractC1798ArH.A08(false);

    @Override // X.InterfaceC1708Aor
    public final void AVn() {
        MutableState.A09(false, this.A00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Alc;ILX/G0U<-LX/Am3;Lkotlin/Unit;>;)V */
    public static final void A00(C1562Alc c1562Alc, G0U g0u, int i) {
        C0910AHm c0910AHmA02 = C0910AHm.A02(new C1562Alc[16], 0);
        while (true) {
            c0910AHmA02.A0E(c1562Alc.A0C(false, false), c0910AHmA02.A00);
            while (true) {
                int i2 = c0910AHmA02.A00;
                if (i2 == 0) {
                    return;
                }
                c1562Alc = (C1562Alc) c0910AHmA02.A07(i2 - 1);
                if (!AbstractC1571All.A04(c1562Alc)) {
                    C0919AHv c0919AHv = c1562Alc.A04;
                    if (AbstractC0915AHr.A00(c0919AHv, AbstractC1671Anw.A05)) {
                        continue;
                    } else {
                        AbstractC1387AiH abstractC1387AiHA09 = c1562Alc.A09();
                        if (abstractC1387AiHA09 == null) {
                            throw C3cG.A0Q("Expected semantics node to have a coordinator.");
                        }
                        BLU bluA02 = C2Un.A02(AbstractC1496Ak3.A00(abstractC1387AiHA09, true));
                        if (bluA02.A01 < bluA02.A02 && bluA02.A03 < bluA02.A00) {
                            Object objA01 = AlP.A01(c0919AHv, AbstractC1578Alt.A0M);
                            Ao7 ao7 = (Ao7) AlP.A01(c0919AHv, AbstractC1671Anw.A0i);
                            if (objA01 == null || ao7 == null || AnonymousClass003.A04(ao7.A00) <= 0.0f) {
                                break;
                            }
                            int i3 = i + 1;
                            g0u.invoke(new Am3(abstractC1387AiHA09, c1562Alc, bluA02, i3));
                            A00(c1562Alc, g0u, i3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/view/View;LX/AlM;LX/78T;Ljava/util/function/Consumer<Landroid/view/ScrollCaptureTarget;>;)V */
    public final void A01(View view, C1557AlM c1557AlM, Consumer consumer, C78T c78t) {
        C0910AHm c0910AHmA02 = C0910AHm.A02(new Am3[16], 0);
        Object obj = null;
        A00(c1557AlM.A00(), new BUN(c0910AHmA02, 1), 0);
        c0910AHmA02.A0D(new C2FI(new G0U[]{new BUU(3), new BUU(4)}));
        int i = c0910AHmA02.A00;
        if (i != 0) {
            obj = c0910AHmA02.A01[i - 1];
        }
        Am3 am3 = (Am3) obj;
        if (am3 != null) {
            HzC hzCA02 = Hxb.A02(c78t);
            C1562Alc c1562Alc = am3.A02;
            BLU blu = am3.A03;
            ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(view, this, c1562Alc, blu, hzCA02);
            InterfaceC1497Ak4 interfaceC1497Ak4 = am3.A01;
            AaC aaCAPk = AbstractC1496Ak3.A01(interfaceC1497Ak4).APk(interfaceC1497Ak4, true);
            long jA0T = C8j3.A0T(blu.A01, blu.A03);
            ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(view, AbstractC1709Aos.A00(C2Un.A02(aaCAPk)), new Point(C8j3.A0G(jA0T), AnonymousClass002.A09(jA0T)), composeScrollCaptureCallback);
            scrollCaptureTarget.setScrollBounds(AbstractC1709Aos.A00(blu));
            consumer.accept(scrollCaptureTarget);
        }
    }

    public final boolean A02() {
        return MutableState.A0A(this.A00);
    }
}
