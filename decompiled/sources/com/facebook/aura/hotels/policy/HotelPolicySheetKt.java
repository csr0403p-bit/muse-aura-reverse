package com.facebook.aura.hotels.policy;

import X.ADq;
import X.AKQ;
import X.ATD;
import X.AbstractC1699Aoe;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGe;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C0v5;
import X.C10571Hud;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1YD;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC1702Aoh;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HotelPolicySheetKt {
    public static final List<String> TERMS_PHRASES = Arrays.asList("Terms of Service", "Terms of Use");

    public static /* synthetic */ boolean $r8$lambda$Go3KrnGF1BElT9f_hgoJErru5Pc(Context context, String str) {
        C7384Etj.A0Y(str, 1);
        return AuraBrowserLauncherKt.openBrowser(str, context);
    }

    public static final Unit HotelPolicySheetContent$lambda$0(String str, String str2, C07C c07c, BFM bfm, int i) {
        String str3 = str2;
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            if (str2 == null || !isHttpsTermsUrl(str2)) {
                str3 = null;
            }
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingLarge;
            HotelPolicyText(str, str3, C3U4.A0C(c1062ATq, f, 0.0f, f, f), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final boolean HotelPolicyText$lambda$1$0(Context context, String str) {
        C7384Etj.A0Y(str, 1);
        return AuraBrowserLauncherKt.openBrowser(str, context);
    }

    public static final void HotelPolicySheetContent(final String str, final String str2, BRg bRg, String str3, BFM bfm, final int i, final int i2) {
        final String str4 = str3;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        bfm.AgG(2006735774);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str4);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str4 = null;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, new AuraBottomSheetHeaderConfig(str, null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, null, zA1b, zA1b, zA1b, null, B1V.A00(bfm, new G0W() { // from class: com.facebook.aura.hotels.policy.HotelPolicySheetKt$$ExternalSyntheticLambda0
                @Override // X.G0W
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HotelPolicySheetKt.HotelPolicySheetContent$lambda$0(str2, str4, (C07C) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
                }
            }, -1573206501), bfm, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48, 2037);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            final String str5 = str4;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.hotels.policy.HotelPolicySheetKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str6 = str;
                    String str7 = str2;
                    BRg bRg4 = bRg3;
                    String str8 = str5;
                    int i5 = i;
                    HotelPolicySheetKt.HotelPolicySheetContent(str6, str7, bRg4, str8, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void HotelPolicyText(final String str, final String str2, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-800999096);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ADq aDqHotelTermsRange = str2 != null ? hotelTermsRange(str) : null;
            final Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.hotels.policy.HotelPolicySheetKt$$ExternalSyntheticLambda2
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        Context context = contextA0H;
                        String str3 = (String) obj;
                        C7384Etj.A0Y(str3, 1);
                        return Boolean.valueOf(AuraBrowserLauncherKt.openBrowser(str3, context));
                    }
                };
                bfm.Ai0(objAaT);
            }
            final G0U g0u = (G0U) objAaT;
            long jA0D = C06G.A0D(bfm);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            int i4 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1W = AnonymousClass002.A1W(bfm, aDqHotelTermsRange, zA1B, AnonymousClass002.A1Q(i4, 32)) | bfm.A64(jA0D);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                if (str2 == null || aDqHotelTermsRange == null) {
                    c1731ApSA0W.A0E(str);
                } else {
                    int i5 = aDqHotelTermsRange.A00;
                    AnonymousClass005.A0s(c1731ApSA0W, str, 0, i5);
                    long j = C1809ArT.A01;
                    int iA01 = c1731ApSA0W.A01(new BGe(new InterfaceC1702Aoh() { // from class: com.facebook.aura.hotels.policy.HotelPolicySheetKt$$ExternalSyntheticLambda3
                        @Override // X.InterfaceC1702Aoh
                        public final void onClick(AbstractC1699Aoe abstractC1699Aoe) {
                            g0u.invoke(str2);
                        }
                    }, new C1697Aoc(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA0D, j, j, B6A.A07), null, null, null), NativeLoginTosDisclosureKt.TOKEN_TERMS));
                    try {
                        int i6 = aDqHotelTermsRange.A01 + 1;
                        AnonymousClass005.A0s(c1731ApSA0W, str, i5, i6);
                        c1731ApSA0W.A06(iA01);
                        c1731ApSA0W.A0E(str.substring(i6));
                    } catch (Throwable th) {
                        c1731ApSA0W.A06(iA01);
                        throw th;
                    }
                }
                objAaT2 = c1731ApSA0W.A04();
                bfm.Ai0(objAaT2);
            }
            ApQ apQ = (ApQ) objAaT2;
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMedium, 0);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i7 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, i7);
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32754);
            if (str2 == null || aDqHotelTermsRange != null) {
                bfm.AgE(1970059664);
            } else {
                bfm.AgE(1969807696);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120341);
                C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                BS0 bs0 = BRg.A00;
                C1YD c1yd = new C1YD(0);
                boolean zA652 = bfm.A65(g0u) | AnonymousClass002.A1Q(i4, 32);
                Object objAaT3 = bfm.AaT();
                if (zA652 || objAaT3 == C78N.A00) {
                    objAaT3 = new Function0() { // from class: com.facebook.aura.hotels.policy.HotelPolicySheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            g0u.invoke(str2);
                            return Unit.INSTANCE;
                        }
                    };
                    bfm.Ai0(objAaT3);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, C0v5.A02(bs0, c1yd, objAaT3, null), jA0D, c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.hotels.policy.HotelPolicySheetKt$$ExternalSyntheticLambda5
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str3 = str;
                    String str4 = str2;
                    BRg bRg4 = bRg3;
                    int i8 = i;
                    HotelPolicySheetKt.HotelPolicyText(str3, str4, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i8), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final ADq hotelTermsRange(String str) {
        for (String str2 : TERMS_PHRASES) {
            C7384Etj.A0Y(str, 0);
            int iA0C = C7BY.A0C(str, str2, str.length() - 1, true);
            if (iA0C >= 0) {
                return ATD.A0C(iA0C, str2.length() + iA0C);
            }
        }
        return null;
    }

    public static final boolean isHttpsTermsUrl(String str) {
        Object c10571Hud;
        String scheme;
        String host;
        try {
            c10571Hud = new URI(str);
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        if (c10571Hud instanceof C10571Hud) {
            c10571Hud = null;
        }
        URI uri = (URI) c10571Hud;
        return (uri == null || (scheme = uri.getScheme()) == null || !scheme.equalsIgnoreCase("https") || (host = uri.getHost()) == null || host.length() == 0 || uri.getRawUserInfo() != null) ? false : true;
    }

    /* renamed from: $r8$lambda$p9L5JiuCtH1-DlcOFas-ujBFO24, reason: not valid java name */
    public static /* synthetic */ Unit m1098$r8$lambda$p9L5JiuCtH1DlcOFasujBFO24(G0U g0u, String str) {
        g0u.invoke(str);
        return Unit.INSTANCE;
    }

    public static final Unit HotelPolicySheetContent$lambda$1(String str, String str2, BRg bRg, String str3, int i, int i2, BFM bfm, int i3) {
        HotelPolicySheetContent(str, str2, bRg, str3, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit HotelPolicyText$lambda$3$0$0(G0U g0u, String str) {
        g0u.invoke(str);
        return Unit.INSTANCE;
    }

    public static final Unit HotelPolicyText$lambda$4(String str, String str2, BRg bRg, int i, int i2, BFM bfm, int i3) {
        HotelPolicyText(str, str2, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
