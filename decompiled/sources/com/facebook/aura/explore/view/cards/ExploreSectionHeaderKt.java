package com.facebook.aura.explore.view.cards;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1515AkP;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ExploreSectionHeaderKt {

    /* renamed from: com.facebook.aura.explore.view.cards.ExploreSectionHeaderKt$ExploreSectionHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isFirstSection;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$isFirstSection = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ExploreSectionHeaderKt.ExploreSectionHeader(this.$title, this.$subtitle, this.$modifier, this.$isFirstSection, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ExploreSectionHeader(String str, String str2, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-409605024);
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
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (str.length() > 0) {
                C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, -2057284030).title3Emphasized;
                long jA0C = C06G.A0C(bfm);
                BRg bRgA0C = C3U4.A0C(BRg.A00, 4.0f, z2 ? 0.0f : 16.0f, 0.0f, 0.0f);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = ExploreSectionHeaderKt$ExploreSectionHeader$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA0C, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            } else {
                bfm.AgE(-2056980168);
            }
            BBI.A0R(bbi, false);
            if (str2 == null || str2.length() == 0) {
                bfm.AgE(-2056721256);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, C3U4.A0C(BRg.A00, 4.0f, 2.0f, 0.0f, 0.0f), C06G.A08(bfm), AnonymousClass006.A0k(bfm, -2056929979).bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16368);
            }
            BBI.A0R(bbi, false);
            C01N.A0A(bfm, BRg.A00, 16.0f);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRg2, z2, i, i2);
        }
    }
}
