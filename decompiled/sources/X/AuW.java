package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuW {
    public final int A00;
    public final C2073Axo A01;
    public final InterfaceC2125Ayr A02;
    public final C1897AtH A03;
    public final C1939Auc A04;
    public final TextFieldSelectionManager A05;
    public final C2144AzN A06;
    public final InterfaceC2128Ayu A07;
    public final C1805ArO A08;
    public final G0U<C1805ArO, Unit> A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Incorrect types in method signature: (LX/AtH;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;LX/ArO;ZZLX/AzN;LX/Ayu;LX/Auc;LX/Axo;LX/Ayr;LX/G0U<-LX/ArO;Lkotlin/Unit;>;I)V */
    public AuW(C2073Axo c2073Axo, InterfaceC2125Ayr interfaceC2125Ayr, C1897AtH c1897AtH, C1939Auc c1939Auc, TextFieldSelectionManager textFieldSelectionManager, C2144AzN c2144AzN, InterfaceC2128Ayu interfaceC2128Ayu, C1805ArO c1805ArO, G0U g0u, int i, boolean z, boolean z2) {
        this.A03 = c1897AtH;
        this.A05 = textFieldSelectionManager;
        this.A08 = c1805ArO;
        this.A0A = z;
        this.A0B = z2;
        this.A06 = c2144AzN;
        this.A07 = interfaceC2128Ayu;
        this.A04 = c1939Auc;
        this.A01 = c2073Axo;
        this.A02 = interfaceC2125Ayr;
        this.A09 = g0u;
        this.A00 = i;
    }

    public static final void A00(AuW auW, AzK azK) {
        List listSingletonList = Collections.singletonList(azK);
        C1905AtQ c1905AtQ = auW.A03.A0O;
        ArrayList arrayList = new ArrayList(listSingletonList);
        arrayList.add(0, new C2027Awg());
        auW.A09.invoke(c1905AtQ.A00(arrayList));
    }
}
