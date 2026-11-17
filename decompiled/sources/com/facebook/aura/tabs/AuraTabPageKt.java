package com.facebook.aura.tabs;

import X.AKH;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0z7;
import X.C1515AkP;
import X.C16n;
import X.C1BO;
import X.C1DG;
import X.C1HY;
import X.C1OM;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3Pi;
import X.C5303Dfm;
import X.EnumC10573Huf;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraTabPageKt {
    public static final String TAB_BAR_SHARED_ELEMENT_KEY = "aura-tab-bar";

    /* renamed from: com.facebook.aura.tabs.AuraTabPageKt$AuraTabPage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraTabPageDock $dock;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showsTabBar;
        public final /* synthetic */ AuraTabRootNavKey $tabRoot;

        /* renamed from: com.facebook.aura.tabs.AuraTabPageKt$AuraTabPage$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04061 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
            public final /* synthetic */ AuraTabPageDock $dock;
            public final /* synthetic */ BRg $modifier;
            public final /* synthetic */ boolean $showsTabBar;
            public final /* synthetic */ AuraTabRootNavKey $tabRoot;
            public final /* synthetic */ float $windowAreaWidth;

            /* renamed from: com.facebook.aura.tabs.AuraTabPageKt$AuraTabPage$1$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
                public final /* synthetic */ AuraTabPageDock $dock;
                public final /* synthetic */ BRg $modifier;
                public final /* synthetic */ boolean $showsTabBar;
                public final /* synthetic */ AuraTabRootNavKey $tabRoot;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(AuraTabRootNavKey auraTabRootNavKey, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z, AuraTabPageDock auraTabPageDock, BRg bRg) {
                    super(2);
                    this.$tabRoot = auraTabRootNavKey;
                    this.$content = g0v;
                    this.$showsTabBar = z;
                    this.$dock = auraTabPageDock;
                    this.$modifier = bRg;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                    invoke(bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }

                public final void invoke(BFM bfm, int i) {
                    if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                        AuraTabPageKt.AuraTabPageContent(this.$tabRoot, this.$content, this.$showsTabBar, this.$dock, this.$modifier, bfm, 0, 0);
                    } else {
                        bfm.Afo();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04061(float f, AuraTabPageDock auraTabPageDock, AuraTabRootNavKey auraTabRootNavKey, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z, BRg bRg) {
                super(2);
                this.$windowAreaWidth = f;
                this.$dock = auraTabPageDock;
                this.$tabRoot = auraTabRootNavKey;
                this.$content = g0v;
                this.$showsTabBar = z;
                this.$modifier = bRg;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    float f = this.$windowAreaWidth;
                    AuraTabPageDock auraTabPageDock = this.$dock;
                    C1DG c1dg = new C1DG(f - auraTabPageDock.contentInset);
                    if (!auraTabPageDock.isResizing) {
                        c1dg = null;
                    }
                    AuraContentFrameKt.m2358ProvideAuraPageResizeBJOXQ(c1dg, auraTabPageDock.contentAlpha, B1V.A00(bfm, new AnonymousClass2(this.$tabRoot, this.$content, this.$showsTabBar, auraTabPageDock, this.$modifier), 1415337510), bfm, 384);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraTabPageDock auraTabPageDock, AuraTabRootNavKey auraTabRootNavKey, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z, BRg bRg) {
            super(2);
            this.$dock = auraTabPageDock;
            this.$tabRoot = auraTabRootNavKey;
            this.$content = g0v;
            this.$showsTabBar = z;
            this.$modifier = bRg;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                float fAuraLayoutWidth = AuraLayoutSizeKt.auraLayoutWidth(bfm, 0);
                AuraLayoutSizeKt.m2363ProvideAuraLayoutSizeUBP6k7g(C16n.A00(fAuraLayoutWidth - this.$dock.targetInset, AuraLayoutSizeKt.auraLayoutHeight(bfm, 0)), B1V.A00(bfm, new C04061(fAuraLayoutWidth, this.$dock, this.$tabRoot, this.$content, this.$showsTabBar, this.$modifier), 788805856), bfm, 48);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraTabPageKt$AuraTabPage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavKey $navKey;
        public final /* synthetic */ AuraTabRootNavKey $tabRoot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraTabRootNavKey auraTabRootNavKey, AuraNavKey auraNavKey, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$tabRoot = auraTabRootNavKey;
            this.$navKey = auraNavKey;
            this.$content = g0v;
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
            AuraTabPageKt.AuraTabPage(this.$tabRoot, this.$navKey, this.$content, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraTabPageKt$AuraTabPageContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C142432 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraTabPageDock $dock;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showsTabBar;
        public final /* synthetic */ AuraTabRootNavKey $tabRoot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142432(AuraTabRootNavKey auraTabRootNavKey, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z, AuraTabPageDock auraTabPageDock, BRg bRg, int i, int i2) {
            super(2);
            this.$tabRoot = auraTabRootNavKey;
            this.$content = g0v;
            this.$showsTabBar = z;
            this.$dock = auraTabPageDock;
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
            AuraTabPageKt.AuraTabPageContent(this.$tabRoot, this.$content, this.$showsTabBar, this.$dock, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraTabPage(com.facebook.aura.navigation.AuraTabRootNavKey r16, com.facebook.aura.navigation.AuraNavKey r17, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r18, X.BRg r19, X.BFM r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraTabPageKt.AuraTabPage(com.facebook.aura.navigation.AuraTabRootNavKey, com.facebook.aura.navigation.AuraNavKey, X.G0V, X.BRg, X.BFM, int, int):void");
    }

    public static final void AuraTabPageContent(AuraTabRootNavKey auraTabRootNavKey, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z, AuraTabPageDock auraTabPageDock, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        BRg bRgA01;
        BRg bRg2;
        BRg bRg3 = bRg;
        bfm.AgG(369779067);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraTabRootNavKey, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, auraTabPageDock);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg3);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgM2299auraTabPageDockPlacementmxwnekA = AuraTabPageDockKt.m2299auraTabPageDockPlacementmxwnekA(bRgA0T, auraTabPageDock, C06G.A0K(bfm, akh));
            if (auraTabRootNavKey != null) {
                bfm.AgE(-1124589278);
                bRg2 = BRg.A00;
                bRgA01 = C1b8.A01(bRg2, C06G.A0K(bfm, akh));
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -1124587293);
                bRgA01 = BRg.A00;
                bRg2 = bRgA01;
            }
            BRg bRgThen = bRgM2299auraTabPageDockPlacementmxwnekA.then(bRgA01);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            C0z7 c0z7 = C0z7.A00;
            AnonymousClass003.A13(bfm, g0v, iA05 >> 3);
            if (!z || auraTabRootNavKey == null) {
                bfm.AgE(2069155745);
            } else {
                bfm.AgE(2068654103);
                HatchSharedElementKt.HatchSharedElement(TAB_BAR_SHARED_ELEMENT_KEY, C1OM.A00, c0z7.A4C(C2VU.A06, bRg2), null, null, null, B1V.A00(bfm, new AuraTabPageKt$AuraTabPageContent$1$1(auraTabRootNavKey, C2CK.A02(bfm, new C3Pi(null, ((C5303Dfm) C1HY.A00(bfm)).A06))), -96396378), bfm, 1572918, 56);
            }
            AnonymousClass003.A0q(bbiA0M);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142432(auraTabRootNavKey, g0v, z, auraTabPageDock, bRg3, i, i2);
        }
    }

    public static final /* synthetic */ EnumC10573Huf access$AuraTabPageContent$lambda$0$0(C1BO c1bo) {
        return (EnumC10573Huf) c1bo.getValue();
    }
}
