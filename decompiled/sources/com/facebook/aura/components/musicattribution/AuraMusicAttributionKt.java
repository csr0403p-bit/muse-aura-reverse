package com.facebook.aura.components.musicattribution;

import X.AKQ;
import X.ASd;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06j;
import X.C06m;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1b8;
import X.C7384Etj;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraMusicAttributionKt {
    public static final void AuraMusicAttribution(final MusicAttribution musicAttribution, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, final int i, final int i2) {
        BRg bRgA0Q = bRg;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        C7384Etj.A0Y(musicAttribution, 0);
        bfm.AgG(-2146261884);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, musicAttribution) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i4 != 0) {
                g0v2 = null;
            }
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingMedium);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v3 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0K, g0v3);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            MusicCover(musicAttribution.coverUrl, null, bfm, 0, 2);
            BRg bRgA0L = BRg.A00;
            if (g0v2 != null) {
                bRgA0L = AnonymousClass006.A0L(c90m, bRgA0L);
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0L);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v3);
            BPg.A02(bfm, akqA042, g0v4);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = musicAttribution.title;
            C1822Arm c1822ArmA0V = C06G.A0V(bfm);
            long j2 = AnonymousClass002.A0c(bfm).onMedia;
            C06m c06m = C06j.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(str, new ASd(c06m), j2, c1822ArmA0V, null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306416, 0, 15856);
            String str2 = musicAttribution.artist;
            if (str2 == null) {
                bfm.AgE(-781469251);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, new ASd(c06m), AnonymousClass002.A0c(bfm).onMedia, AnonymousClass006.A0k(bfm, -781469250).footnoteRegular, null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306416, 0, 15856);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            if (g0v2 == null) {
                bfm.AgE(1010037145);
            } else {
                bfm.AgE(725318504);
                AnonymousClass003.A13(bfm, g0v2, iA0d >> 6);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg2 = bRgA0Q;
            final G0V<? super BFM, ? super Integer, Unit> g0v5 = g0v2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.components.musicattribution.AuraMusicAttributionKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    MusicAttribution musicAttribution2 = musicAttribution;
                    BRg bRg3 = bRg2;
                    G0V g0v6 = g0v5;
                    int i6 = i;
                    AuraMusicAttributionKt.AuraMusicAttribution(musicAttribution2, bRg3, g0v6, (BFM) obj, AnonymousClass011.A02(obj2, i6), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void MusicCover(final String str, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        bfm.AgG(-2101721565);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(C11U.A01(C10G.A07(bRg2, 32.0f), 6.0f), AnonymousClass002.A0c(bfm).surfaceOnMedia);
            if (str == null) {
                bfm.AgE(-353643595);
                C01N.A07(bfm, bRgA01);
            } else {
                bfm.AgE(-353592476);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, bRgA01, B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | 384, 48, 30712);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.components.musicattribution.AuraMusicAttributionKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    AuraMusicAttributionKt.MusicCover(str2, bRg3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit AuraMusicAttribution$lambda$1(MusicAttribution musicAttribution, BRg bRg, G0V g0v, int i, int i2, BFM bfm, int i3) {
        AuraMusicAttribution(musicAttribution, bRg, g0v, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit MusicCover$lambda$0(String str, BRg bRg, int i, int i2, BFM bfm, int i3) {
        MusicCover(str, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
