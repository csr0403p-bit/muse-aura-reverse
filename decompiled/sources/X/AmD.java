package X;

import androidx.compose.ui.text.input.ImeAction;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Unit;

@Deprecated(message = "Use PlatformTextInputModifierNode instead.")
/* loaded from: classes4.dex */
public final class AmD {
    public final InterfaceC1925Atm A00;
    public final AtomicReference<AuB> A01 = new AtomicReference<>(null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.AuB, java.lang.Object] */
    public static void A00(C1897AtH c1897AtH, AuI auI, C1805ArO c1805ArO, AmD amD) {
        C1905AtQ c1905AtQ = c1897AtH.A0O;
        G0U<C1805ArO, Unit> g0u = c1897AtH.A0R;
        G0U<ImeAction, Unit> g0u2 = c1897AtH.A0P;
        C10543Hqv c10543Hqv = new C10543Hqv();
        BTL btl = new BTL(c10543Hqv, c1905AtQ, g0u, 3);
        InterfaceC1925Atm interfaceC1925Atm = amD.A00;
        interfaceC1925Atm.Ag5(auI, c1805ArO, btl, g0u2);
        ?? auB = new AuB(interfaceC1925Atm, amD);
        amD.A01.set(auB);
        c10543Hqv.element = auB;
        c1897AtH.A04 = auB;
    }

    public AmD(InterfaceC1925Atm interfaceC1925Atm) {
        this.A00 = interfaceC1925Atm;
    }
}
