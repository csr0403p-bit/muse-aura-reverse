package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AYW {
    public static final AKH<Boolean> A00;
    public static final AKH<String> A01;

    static {
        BUV buv = new BUV(2);
        AGE age = AGE.A00;
        A01 = new AGN(age, buv);
        A00 = new AGN(age, new BUV(1));
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/11N;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, Alignment alignment, C11N c11n, Function0 function0, G0V g0v, int i, int i2, long j) {
        Function0 function02 = function0;
        Alignment alignment2 = alignment;
        long j2 = j;
        C11N c11n2 = c11n;
        bfm.AgG(71005054);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, alignment2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c11n2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                alignment2 = C2VU.A0E;
            }
            if (i4 != 0) {
                j2 = 0 << 32;
            }
            if (i5 != 0) {
                function02 = null;
            }
            if (i6 != 0) {
                c11n2 = new C11N(false);
            }
            boolean zA1W = AnonymousClass002.A1W(bfm, null, AnonymousClass001.A1O(iA0d) | AnonymousClass004.A1F(iA0d), bfm.A63(1002));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new AWF(alignment2, j2);
                bfm.Ai0(objAaT);
            }
            A01(bfm, (AWF) objAaT, c11n2, function02, g0v, (iA0d >> 3) & 8176, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2WM(alignment2, c11n2, function02, g0v, i, i2, j2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AeE;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/11N;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A01(BFM bfm, AeE aeE, C11N c11n, Function0 function0, G0V g0v, int i, int i2) {
        C11N c11n2 = c11n;
        Function0 function02 = function0;
        bfm.AgG(-1772091631);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, aeE) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function02);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c11n2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                function02 = null;
            }
            if (i4 != 0) {
                c11n2 = new C11N(false);
            }
            BBI bbi = (BBI) bfm;
            View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
            AXN axnA04 = AKO.A04(Am0.A04, bbi);
            String str = (String) AKO.A07(A01, bbi);
            EnumC1820Arj enumC1820Arj = (EnumC1820Arj) AKO.A07(Am0.A0A, bbi);
            BBM bbmA5U = bfm.A5U();
            MutableState mutableStateA00 = C1er.A00(bfm, g0v);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new BUV(3);
                bfm.Ai0(objAaT);
            }
            UUID uuid = (UUID) AFz.A03(bfm, (Function0) objAaT, objArr);
            boolean zA09 = AKO.A09(A00, bbi);
            Object objAaT2 = bfm.AaT();
            Object obj2 = objAaT2;
            if (objAaT2 == obj) {
                C1711Aou c1711Aou = new C1711Aou(view, axnA04, aeE, c11n2, str, uuid, function02, zA09);
                c1711Aou.setContent(bbmA5U, B1U.A02(new C2336BUk(4, c1711Aou, mutableStateA00), -297523940));
                bfm.Ai0(c1711Aou);
                obj2 = c1711Aou;
            }
            C1711Aou c1711Aou2 = (C1711Aou) obj2;
            boolean zA67 = bfm.A67(c1711Aou2);
            int i5 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i6 = iA0d & 896;
            boolean zA1W = AnonymousClass002.A1W(bfm, str, zA67 | AnonymousClass002.A1Q(i5, 32), AnonymousClass002.A1Q(i6, 256));
            int iOrdinal = enumC1820Arj.ordinal();
            boolean zA1a = AnonymousClass001.A1a(zA1W, bfm, iOrdinal);
            Object objAaT3 = bfm.AaT();
            if (zA1a || objAaT3 == obj) {
                objAaT3 = new AYY(enumC1820Arj, c1711Aou2, c11n2, str, function02);
                BBI.A0O(bbi, objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, c1711Aou2);
            boolean zA1a2 = AnonymousClass001.A1a(AnonymousClass002.A1W(bfm, str, bfm.A67(c1711Aou2) | AnonymousClass002.A1Q(i5, 32), AnonymousClass002.A1Q(i6, 256)), bfm, iOrdinal);
            Object objAaT4 = bfm.AaT();
            if (zA1a2 || objAaT4 == obj) {
                objAaT4 = new AYX(enumC1820Arj, c1711Aou2, c11n2, str, function02);
                BBI.A0O(bbi, objAaT4);
            }
            AnonymousClass001.A15(bfm, objAaT4);
            boolean zA672 = bfm.A67(c1711Aou2) | AnonymousClass004.A1F(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA672 || objAaT5 == obj) {
                objAaT5 = new C2334BUi(24, c1711Aou2, aeE);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A17(bfm, objAaT5, aeE);
            boolean zA673 = bfm.A67(c1711Aou2);
            Object objAaT6 = bfm.AaT();
            if (zA673 || objAaT6 == obj) {
                objAaT6 = new BU6(c1711Aou2, (HtJ) null, 43, 42);
                bfm.Ai0(objAaT6);
            }
            AnonymousClass001.A18(bfm, objAaT6, c1711Aou2);
            BS0 bs0 = BRg.A00;
            boolean zA674 = bfm.A67(c1711Aou2);
            Object objAaT7 = bfm.AaT();
            if (zA674 || objAaT7 == obj) {
                objAaT7 = new C2326BUa(c1711Aou2, 10);
                bfm.Ai0(objAaT7);
            }
            BRg bRgA00 = ASZ.A00(bs0, (G0U) objAaT7);
            boolean zA1a3 = AnonymousClass001.A1a(bfm.A67(c1711Aou2), bfm, iOrdinal);
            Object objAaT8 = bfm.AaT();
            if (zA1a3 || objAaT8 == obj) {
                objAaT8 = new BSW(1, enumC1820Arj, c1711Aou2);
                bfm.Ai0(objAaT8);
            }
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, objAaT8, akqA04, bRgA01, iA0D);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2343BUr(function02, g0v, c11n2, aeE, i, i2, 0);
        }
    }

    public static final boolean A02(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
