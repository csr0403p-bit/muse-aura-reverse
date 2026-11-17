package com.facebook.aura.nodes.cards;

import X.AKH;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
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
import X.C06G;
import X.C06I;
import X.C0dm;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NodeCardComponentsKt {
    public static final float CONTACT_AVATAR_SIZE = 40.0f;
    public static final float CONTACT_MONOGRAM_LETTER_SIZE = 24.0f;
    public static final float CONTACT_ROW_MIN_HEIGHT = 44.0f;
    public static final AKH<C1DM> LocalNodeCardShape = AnonymousClass002.A0L(NodeCardComponentsKt$LocalNodeCardShape$1.INSTANCE);

    /* renamed from: com.facebook.aura.nodes.cards.NodeCardComponentsKt$NodeCardAppRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Drawable $icon;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Drawable drawable, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$icon = drawable;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NodeCardComponentsKt.NodeCardAppRow(this.$label, this.$icon, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nodes.cards.NodeCardComponentsKt$NodeCardContactMonogram$2, reason: invalid class name and case insensitive filesystem */
    public final class C127652 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127652(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NodeCardComponentsKt.NodeCardContactMonogram(this.$name, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nodes.cards.NodeCardComponentsKt$NodeCardContactRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C127662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ String $number;
        public final /* synthetic */ String $photoUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127662(String str, String str2, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$number = str2;
            this.$photoUri = str3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NodeCardComponentsKt.NodeCardContactRow(this.$name, this.$number, this.$photoUri, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NodeCardAppRow(String str, Drawable drawable, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1919658189);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, drawable);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 8.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            if (drawable != null) {
                bfm.AgE(436777338);
                AuraImageKt.AuraImage(drawable, C11U.A01(AnonymousClass001.A0S(BRg.A00), 6.0f), B18.A00, null, false, bfm, ((iA0d >> 3) & 14) | 384, 24);
            } else {
                bfm.AgE(436947435);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(BRg.A00, 1.0f, true), C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, drawable, bRg2, i, i2);
        }
    }

    public static final void NodeCardContactMonogram(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-471463010);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
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
            boolean zA1L = AnonymousClass001.A1L(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1L || objAaT == C78N.A00) {
                int i4 = 0;
                while (true) {
                    if (i4 >= str.length()) {
                        objAaT = "";
                        break;
                    }
                    char cCharAt = str.charAt(i4);
                    if (Character.isLetterOrDigit(cCharAt)) {
                        objAaT = AnonymousClass006.A0q(cCharAt);
                        break;
                    }
                    i4++;
                }
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            bfm.AgE(-2104373606);
            C0dm c0dm = (C0dm) bfm.A6v(Am0.A04);
            C1822Arm c1822ArmA0U = C06G.A0U(bfm);
            float f = CONTACT_MONOGRAM_LETTER_SIZE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, c1822ArmA0U, null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, c0dm.Ah7(f), 0L, c0dm.Ah7(f));
            AnonymousClass001.A1D(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0I = C06G.A0I(bfm, akh);
            BRg bRgA02 = C10G.A02(C2VU.A09, C1b8.A01(C11U.A02(bRg2, CONTACT_AVATAR_SIZE), AnonymousClass001.A0f(bfm, akh).elevated), false);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = NodeCardComponentsKt$NodeCardContactMonogram$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0X(bRgA02, objAaT2), jA0I, c1822ArmA00, null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15856);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C127652(str, bRg2, i, i2);
        }
    }

    public static final void NodeCardContactRow(String str, String str2, String str3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str2, 1);
        bfm.AgG(-1141709794);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0V = AnonymousClass001.A0V(AnonymousClass001.A0R(bRg2), CONTACT_ROW_MIN_HEIGHT);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 12.0f);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0V);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0L, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            if (str3 != null) {
                bfm.AgE(1426605709);
                AuraImageKt.m2573AuraImageXRP3Ue8(str3, C11U.A02(BRg.A00, CONTACT_AVATAR_SIZE), B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, ((iA0d >> 6) & 14) | 384, 0, 32760);
            } else if (str != null) {
                bfm.AgE(1426612030);
                NodeCardContactMonogram(str, null, bfm, iA0d & 14, 2);
            } else {
                bfm.AgE(1275340520);
            }
            BBI.A0R(bbi, false);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(4.0f), bfm, C2VU.A02, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str4 = str;
            if (str == null) {
                str4 = str2;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str4, null, C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (str != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, -1239551814).footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
            } else {
                bfm.AgE(-1239324770);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C127662(str, str2, str3, bRg2, i, i2);
        }
    }

    public static final AKH<C1DM> getLocalNodeCardShape() {
        return LocalNodeCardShape;
    }

    public static final BRg hatchCardChrome(boolean z, BFM bfm, int i) {
        C1DM c1dmA0R = (C1DM) bfm.A6v(LocalNodeCardShape);
        if (c1dmA0R == null) {
            bfm.AgE(363480487);
            c1dmA0R = C06G.A0R(bfm);
        } else {
            bfm.AgE(363479030);
        }
        BBI bbi = (BBI) bfm;
        BBI.A0R(bbi, false);
        long j = z ? AnonymousClass003.A0c(bfm, 363482076).secondaryButtonBackground : AnonymousClass003.A0c(bfm, 363483593).bubble;
        BBI.A0R(bbi, false);
        return C3U4.A09(C11U.A04(BRg.A00, c1dmA0R, j), 16.0f);
    }
}
