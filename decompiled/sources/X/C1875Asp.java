package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.Asp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1875Asp extends AbstractC1437Aj6 implements InterfaceC1476Ajj {
    public C1897AtH A00;
    public TextFieldSelectionManager A01;
    public C1518AkS A02;
    public AuI A03;
    public InterfaceC2128Ayu A04;
    public C1805ArO A05;
    public C1YX A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public static final void A00(C1897AtH c1897AtH, String str, boolean z, boolean z2) {
        G0U<C1805ArO, Unit> g0u;
        C1805ArO c1805ArO;
        if (z || !z2) {
            return;
        }
        AuB auB = c1897AtH.A04;
        if (auB != null) {
            List<? extends AzK> listAsList = Arrays.asList(new C1993Avy(), new C1916Atd(AnonymousClass005.A0X(str), 1));
            C1905AtQ c1905AtQ = c1897AtH.A0O;
            g0u = c1897AtH.A0R;
            c1805ArO = c1905AtQ.A00(listAsList);
            auB.A00(null, c1805ArO);
        } else {
            g0u = c1897AtH.A0R;
            int length = str.length();
            c1805ArO = new C1805ArO(str, AbstractC1815ArZ.A00(length, length));
        }
        g0u.invoke(c1805ArO);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    @Override // X.InterfaceC1476Ajj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A4Y(X.InterfaceC0857A6e r8) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1875Asp.A4Y(X.A6e):void");
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final boolean AKa() {
        return true;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }
}
