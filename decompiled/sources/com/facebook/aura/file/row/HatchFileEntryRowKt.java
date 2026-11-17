package com.facebook.aura.file.row;

import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0A8;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C2VU;
import X.C3U4;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC04981Yd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchFileEntryRowKt {
    public static final float DEPTH_INDENT = 24.0f;
    public static final float ENTRY_ICON_SIZE = 40.0f;
    public static final float ICON_TO_TEXT_SPACING = 12.0f;
    public static final float NAME_TO_DETAIL_SPACING = 2.0f;

    /* renamed from: com.facebook.aura.file.row.HatchFileEntryRowKt$HatchFileEntryRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $depth;
        public final /* synthetic */ String $detail;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $nameTrailing;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(int i, String str, String str2, BRg bRg, int i2, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, int i3, int i4) {
            super(2);
            this.$iconRes = i;
            this.$name = str;
            this.$detail = str2;
            this.$modifier = bRg;
            this.$depth = i2;
            this.$nameTrailing = g0v;
            this.$trailing = g0v2;
            this.$$changed = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFileEntryRowKt.HatchFileEntryRow(this.$iconRes, this.$name, this.$detail, this.$modifier, this.$depth, this.$nameTrailing, this.$trailing, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchFileEntryRow(int i, String str, String str2, BRg bRg, int i2, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, BFM bfm, int i3, int i4) {
        G0V<? super BFM, ? super Integer, Unit> g0v3;
        BRg bRgA0Q = bRg;
        int i5 = i2;
        G0V<? super BFM, ? super Integer, Unit> g0v4 = g0v;
        int iA0C = AnonymousClass002.A0C(str, str2, 1);
        bfm.AgG(2095453495);
        int iA0D = (i3 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i3 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str2);
        }
        int i6 = i4 & 8;
        if (i6 != 0) {
            iA0D |= 3072;
        } else if ((i3 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        int i7 = i4 & 16;
        if (i7 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i3 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0G(bfm, i5);
        }
        int i8 = i4 & 32;
        int iA0Y = 196608;
        if (i8 != 0) {
            iA0D |= iA0Y;
        } else if ((196608 & i3) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0v4);
            iA0D |= iA0Y;
        }
        int i9 = i4 & 64;
        int iA0Z = 1572864;
        if (i9 != 0) {
            iA0D |= iA0Z;
        } else if ((1572864 & i3) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0v2);
            iA0D |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 599187, 599186), bfm, iA0D)) {
            if (i6 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i7 != 0) {
                i5 = 0;
            }
            if (i8 != 0) {
                g0v4 = null;
            }
            g0v3 = i9 == 0 ? g0v2 : null;
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = (DEPTH_INDENT * i5) + f;
            float f3 = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bRgA0R, f2, f3, f, f3);
            C1AC c1ac = C2VU.A04;
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i10 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v5 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v5);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v6 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v6, i10);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, i, iA0D & 14);
            long j2 = B6A.A07;
            AuraIconSize auraIconSize = AuraIconSize.LARGE;
            BS0 bs0 = BRg.A00;
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(bs0, ENTRY_ICON_SIZE), aVyA00, auraIconSize, null, j2, null, bfm, (AVy.$stable << 3) | 28038, 32);
            C01N.A07(bfm, C10G.A08(bs0, ICON_TO_TEXT_SPACING));
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v5);
            BPg.A02(bfm, akqA042, g0v6);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v5);
            BPg.A02(bfm, akqA043, g0v6);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, true), C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 1, iA0C, null, null, null, bfm, ((iA0D >> 3) & 14) | 805306368, 6, 14832);
            if (g0v4 != null) {
                bfm.AgE(-89238614);
                C01N.A09(bfm, bs0, AuraDimensKt.SpacingXsmall);
                AnonymousClass004.A1C(bbi, bfm, g0v4, iA0D >> 15, false);
            } else {
                bfm.AgE(-89147319);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), C01N.A01(bfm, bs0, NAME_TO_DETAIL_SPACING).subheadlineRegular, null, null, null, false, 0, 1, iA0C, null, null, null, bfm, ((iA0D >> 6) & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            if (g0v3 == null) {
                bfm.AgE(-574499130);
            } else {
                bfm.AgE(1089846427);
                AnonymousClass003.A13(bfm, g0v3, iA0D >> 18);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
            g0v3 = g0v2;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, str, str2, bRgA0Q, i5, g0v4, g0v3, i3, i4);
        }
    }
}
