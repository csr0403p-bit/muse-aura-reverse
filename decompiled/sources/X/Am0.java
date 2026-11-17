package X;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.Clipboard;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes4.dex */
public abstract class Am0 {
    public static final AKH<AR9> A00 = AGO.A00(23);
    public static final AKH<InterfaceC1650AnT> A0K = AGO.A00(24);
    public static final AKH<C1597AmP> A0M = AGO.A00(26);
    public static final AKH<AlT> A0L = AGO.A00(25);
    public static final AKH<C0fG> A02 = AGO.A00(28);
    public static final AKH<Clipboard> A01 = AGO.A00(27);
    public static final AKH<ASQ> A07 = AGO.A00(34);
    public static final AKH<AXN> A04 = AGO.A00(30);
    public static final AKH<C0Hi> A05 = AGO.A00(31);
    public static final AKH<InterfaceC1651AnU> A0N = AGO.A00(33);
    public static final AKH<C2K7> A06 = AGO.A00(32);
    public static final AKH<C0dx> A08 = AGO.A00(35);
    public static final AKH<InterfaceC1514AkL> A09 = AGO.A00(36);
    public static final AKH<EnumC1820Arj> A0A = AGO.A00(37);
    public static final AKH<C0874AGa> A0C = AGO.A00(39);
    public static final AKN<BN1> A0J = new AKK(BUT.A00(49));
    public static final AKH<AmD> A0O = AGO.A00(42);
    public static final AKH<C1C3> A0E = AGO.A00(41);
    public static final AKH<C1JY> A0F = AGO.A00(43);
    public static final AKH<C0jP> A0G = AGO.A00(44);
    public static final AKH<InterfaceC1079AXi> A0H = AGO.A00(45);
    public static final AKH<C60K> A0I = AGO.A00(46);
    public static final AKH<InterfaceC1659Ani> A0B = AGO.A00(38);
    public static final AKH<Boolean> A0D = new AGN(AGE.A00, new BUS(40));
    public static final AKH<Boolean> A03 = AGO.A00(29);

    /* JADX WARN: Incorrect types in method signature: (LX/AjX;LX/0jP;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(BFM bfm, InterfaceC1464AjX interfaceC1464AjX, C0jP c0jP, G0V g0v, int i) {
        bfm.AgG(1925803616);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(interfaceC1464AjX, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(c0jP, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            AndroidComposeView androidComposeView = (AndroidComposeView) interfaceC1464AjX;
            AKJ<AR9> akjA04 = A00.A04(androidComposeView.A0r);
            AKJ<InterfaceC1650AnT> akjA042 = A0K.A04(androidComposeView.A0d);
            AKJ<AlT> akjA043 = A0L.A04(androidComposeView.A0e);
            AKJ<C1597AmP> akjA044 = A0M.A04(androidComposeView.A0f);
            AKJ<C0fG> akjA045 = A02.A04(androidComposeView.A0t);
            AKJ<Clipboard> akjA046 = A01.A04(androidComposeView.A0s);
            AKJ<AXN> akjA047 = A04.A04(interfaceC1464AjX.getDensity());
            AKJ<C0Hi> akjA048 = A05.A04(androidComposeView.A0h);
            AKJ<InterfaceC1651AnU> akjA049 = A0N.A04(androidComposeView.A13);
            akjA049.A00 = false;
            AKJ<C2K7> akjA0410 = A06.A04(interfaceC1464AjX.getFontFamilyResolver());
            akjA0410.A00 = false;
            AKT.A02(bfm, g0v, new AKJ[]{akjA04, akjA042, akjA043, akjA044, akjA045, akjA046, akjA047, akjA048, akjA049, akjA0410, A08.A04(androidComposeView.A0j), A09.A04(androidComposeView.A0k), A0A.A04(interfaceC1464AjX.getLayoutDirection()), A0O.A04(interfaceC1464AjX.getTextInputService()), A0E.A04(interfaceC1464AjX.getSoftwareKeyboardController()), A0F.A04(androidComposeView.A0y), A0G.A04(c0jP), A0H.A04(androidComposeView.A0z), A0I.A04(interfaceC1464AjX.getWindowInfo()), A0B.A04(androidComposeView.A0l), A07.A04(androidComposeView.A0i), AbstractC1608Ama.A00.A04(androidComposeView.A05), A0C.A04(interfaceC1464AjX.getLocaleList())}, ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2340BUo(interfaceC1464AjX, c0jP, g0v, i, 1);
        }
    }
}
