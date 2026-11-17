package X;

import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import kotlin.jvm.functions.Function0;

/* renamed from: X.01N, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C01N {
    public static void A05(BFM bfm, BRg bRg) {
        A07(bfm, C10G.A04(bRg, AuraDimensKt.SpacingSmall));
    }

    public static void A06(BFM bfm, BRg bRg) {
        A07(bfm, C10G.A04(bRg, AuraDimensKt.SpacingMedium));
    }

    public static final void A07(BFM bfm, BRg bRg) {
        C3UJ c3uj = C3UJ.A00;
        BBI bbi = (BBI) bfm;
        int iA0J = AnonymousClass003.A0J(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRg);
        AKQ akqA04 = BBI.A04(bbi);
        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function0);
        AnonymousClass003.A0o(bfm, c3uj, akqA04);
        AnonymousClass003.A0n(bfm, bRgA01);
        AnonymousClass002.A0w(bfm, iA0J);
        BBI.A0R(bbi, true);
    }

    public static int A00(BFM bfm, BRg bRg, float f) {
        A07(bfm, C10G.A04(bRg, f));
        return 6;
    }

    public static AuraTypography A01(BFM bfm, BRg bRg, float f) {
        A07(bfm, C10G.A04(bRg, f));
        return (AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography);
    }

    public static void A02(BFM bfm, AKN akn, BRg bRg) {
        A07(bfm, C10G.A04(bRg, ((AuraDimensions) bfm.A6v(akn)).gutterWidth));
    }

    public static void A03(BFM bfm, BBI bbi, BRg bRg, float f) {
        A07(bfm, C10G.A04(bRg, f));
        BBI.A0R(bbi, true);
    }

    public static void A04(BFM bfm, BBI bbi, BRg bRg, float f, boolean z) {
        A07(bfm, C10G.A04(bRg, f));
        BBI.A0R(bbi, z);
    }

    public static void A08(BFM bfm, BRg bRg, float f) {
        A07(bfm, C10G.A04(bRg, f));
    }

    public static void A09(BFM bfm, BRg bRg, float f) {
        A07(bfm, C10G.A08(bRg, f));
    }

    public static void A0A(BFM bfm, BRg bRg, float f) {
        A07(bfm, C10G.A07(bRg, f));
    }

    public static void A0B(BFM bfm, BRg bRg, Object obj, G0V g0v, float f) {
        BPg.A02(bfm, obj, g0v);
        A07(bfm, C10G.A04(bRg, f));
    }
}
