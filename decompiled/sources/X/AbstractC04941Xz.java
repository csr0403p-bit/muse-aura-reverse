package X;

import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04941Xz {
    public static final C3TQ A00 = new C1DP(24.0f, 10.0f, 24.0f, 0.0f);

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Long;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1Xc;LX/ADq;LX/1X9;LX/1Xj;LX/1Wz;LX/BFM;I)V */
    public static final void A01(C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, BFM bfm, Long l, G0U g0u, ADq aDq, int i) {
        bfm.AgG(643325609);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, l) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, abstractC04741Xc);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, aDq);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, c1x9, i, 32768) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, interfaceC04801Xj);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, c1Wz);
        }
        if ((599187 & iA0d) == 599186 && bfm.AKh()) {
            bfm.Afo();
        } else {
            Locale localeA00 = C1X3.A00(bfm);
            boolean zA65 = bfm.A65(localeA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                String strA0L = C7BY.A0L(".", AbstractC2159Azp.A0z(new C06827l3("y{1,4}").A03(new C06827l3("M{1,2}").A03(new C06827l3("d{1,2}").A03(new C06827l3("[^dMy/\\-.]").A03(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(localeA00), localeA00), ""), "dd"), "MM"), "yyyy"), "My", "M/y"));
                C06847l8 c06847l8A01 = C06827l3.A01(strA0L, new C06827l3("[/\\-.]"));
                C7384Etj.A0X(c06847l8A01);
                C1YK c1ykA0E = c06847l8A01.A02.A0E(0);
                C7384Etj.A0X(c1ykA0E);
                int i2 = c1ykA0E.A01.A00;
                objAaT = new C1Y4(strA0L, strA0L.substring(i2, i2 + 1).charAt(0));
                bfm.Ai0(objAaT);
            }
            C1Y4 c1y4 = (C1Y4) objAaT;
            String strA00 = C1EO.A00(bfm, R.string._name_removed__res_0x7f120cb8);
            String strA002 = C1EO.A00(bfm, R.string._name_removed__res_0x7f120cba);
            String strA003 = C1EO.A00(bfm, R.string._name_removed__res_0x7f120cb9);
            boolean zA652 = bfm.A65(c1y4) | ((57344 & iA0d) == 16384 || ((iA0d & 32768) != 0 && bfm.A65(c1x9)));
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new C1Y5(c1x9, interfaceC04801Xj, c1y4, strA00, strA002, strA003, aDq);
                bfm.Ai0(objAaT2);
            }
            C1Y5 c1y5 = (C1Y5) objAaT2;
            String upperCase = c1y4.A01.toUpperCase(Locale.ROOT);
            String strA004 = C1EO.A00(bfm, R.string._name_removed__res_0x7f120cbb);
            BRg bRgA0D = C3U4.A0D(C10G.A02, A00);
            c1y5.A00 = l;
            int i3 = iA0d << 3;
            A00(c1y5, c1Wz, abstractC04741Xc, c1y4, bfm, bRgA0D, l, localeA00, g0u, B1V.A00(bfm, new C0w0(strA004, upperCase), -1819015125), B1V.A00(bfm, new C3UU(upperCase, 0), -564233108), 0, AnonymousClass002.A08(i3, (i3 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 1794054), (iA0d >> 18) & 14);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1XQ(c1Wz, c1x9, interfaceC04801Xj, abstractC04741Xc, l, g0u, aDq, i);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;Ljava/lang/Long;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1Xc;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ILX/1Y5;LX/1Y4;Ljava/util/Locale;LX/1Wz;LX/BFM;II)V */
    public static final void A00(C1Y5 c1y5, C1Wz c1Wz, AbstractC04741Xc abstractC04741Xc, C1Y4 c1y4, BFM bfm, BRg bRg, Long l, Locale locale, G0U g0u, G0V g0v, G0V g0v2, int i, int i2, int i3) {
        int iA0d;
        bfm.AgG(-857008589);
        int iA0d2 = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d2 |= AnonymousClass004.A0e(bfm, l);
        }
        if ((i2 & 384) == 0) {
            iA0d2 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i2 & 3072) == 0) {
            iA0d2 |= AnonymousClass004.A0W(bfm, abstractC04741Xc);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d2 |= AnonymousClass004.A0X(bfm, g0v);
        }
        if ((196608 & i2) == 0) {
            iA0d2 |= AnonymousClass004.A0Y(bfm, g0v2);
        }
        if ((i2 & 1572864) == 0) {
            iA0d2 |= AnonymousClass004.A0I(bfm, i);
        }
        if ((i2 & 12582912) == 0) {
            iA0d2 |= AnonymousClass004.A0k(bfm, c1y5);
        }
        if ((i2 & 100663296) == 0) {
            iA0d2 |= AnonymousClass004.A0l(bfm, c1y4);
        }
        if ((i2 & 805306368) == 0) {
            iA0d2 |= AnonymousClass004.A0c(bfm, locale);
        }
        if ((i3 & 6) == 0) {
            iA0d = i3 | AnonymousClass004.A0d(bfm, c1Wz);
        } else {
            iA0d = i3;
        }
        if ((iA0d2 & 306783379) != 306783378 || (iA0d & 3) != 2 || !bfm.AKh()) {
            MutableState mutableState = (MutableState) AFz.A02(bfm, null, new C05443bq(3), new Object[0], 6);
            Object[] objArr = new Object[0];
            AFs<C1805ArO, Object> aFs = C1805ArO.A03;
            int i4 = 234881024 & iA0d2;
            boolean zA1V = AnonymousClass002.A1V(bfm, locale, AnonymousClass001.A1T(bfm, abstractC04741Xc, AnonymousClass003.A18(iA0d2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), AnonymousClass002.A1Q(i4, 67108864));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new C3c9(c1y4, locale, abstractC04741Xc, l, 0);
                bfm.Ai0(objAaT);
            }
            MutableState mutableState2 = (MutableState) AFz.A02(bfm, new C0872AFu(new C2296BSw(aFs, 17), new C2297BSx(aFs, 30)), (Function0) objAaT, Arrays.copyOf(objArr, 0), 0);
            C1805ArO c1805ArO = (C1805ArO) mutableState2.getValue();
            boolean zA1V2 = AnonymousClass002.A1V(bfm, locale, AnonymousClass002.A1V(bfm, abstractC04741Xc, AnonymousClass004.A1K(iA0d2), AnonymousClass003.A1P(bfm, mutableState2, mutableState, AnonymousClass002.A1Q(i4, 67108864))) | AnonymousClass005.A1J(iA0d2), AnonymousClass005.A1B(iA0d2));
            Object objAaT2 = bfm.AaT();
            if (zA1V2 || objAaT2 == C78N.A00) {
                objAaT2 = new C1Y0(c1y5, abstractC04741Xc, c1y4, mutableState, mutableState2, locale, g0u, i);
                bfm.Ai0(objAaT2);
            }
            G0U g0u2 = (G0U) objAaT2;
            BRg bRgA03 = C3U4.A03(bRg, C7BY.A0j((CharSequence) mutableState.getValue()) ? 16.0f : 0.0f);
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new C05463bs(mutableState, 10);
                bfm.Ai0(objAaT3);
            }
            C1A3.A01(null, null, new AuJ(false, -1, 3, 7), c1Wz.A0O, bfm, ARD.A01(bRgA03, (G0U) objAaT3, false), null, null, c1805ArO, new C1YN(c1y4), g0u2, g0v, g0v2, null, null, null, null, B1V.A00(bfm, new C05473bt(mutableState, 1), -591991974), 0, 0, (iA0d2 << 6) & 33030144, 12779904, 0, 4001592, false, false, !C7BY.A0j((CharSequence) mutableState.getValue()), true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1Y2(c1y5, c1Wz, abstractC04741Xc, c1y4, bRg, l, locale, g0u, g0v, g0v2, i, i2, i3);
        }
    }
}
