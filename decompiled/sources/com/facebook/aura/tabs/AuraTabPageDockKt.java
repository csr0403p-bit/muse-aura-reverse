package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1Cd;
import X.C1DG;
import X.C1b8;
import X.C1eL;
import X.C3U4;
import X.C78N;
import X.C78e;
import X.EnumC04711Bv;
import X.G0U;
import X.G0V;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraTabPageDockKt {

    /* renamed from: com.facebook.aura.tabs.AuraTabPageDockKt$RequestSidePanelDock$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $requestsPanel;
        public final /* synthetic */ boolean $requestsRail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, boolean z2, int i) {
            super(2);
            this.$requestsPanel = z;
            this.$requestsRail = z2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTabPageDockKt.RequestSidePanelDock(this.$requestsPanel, this.$requestsRail, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraTabPageDockKt$RequestSidePanelDock$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $requestsPanel;
        public final /* synthetic */ boolean $requestsRail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, boolean z2, int i) {
            super(2);
            this.$requestsPanel = z;
            this.$requestsRail = z2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTabPageDockKt.RequestSidePanelDock(this.$requestsPanel, this.$requestsRail, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb A[PHI: r9
  0x00bb: PHI (r9v3 boolean) = (r9v1 boolean), (r9v1 boolean), (r9v4 boolean) binds: [B:22:0x0030, B:23:0x0032, B:20:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.tabs.AuraTabPageDock auraTabPageDock(com.facebook.aura.navigation.AuraTabRootNavKey r9, com.facebook.aura.navigation.AuraNavKey r10, X.BFM r11, int r12) {
        /*
            X.AKH<com.facebook.aura.navigation.HatchSidePanelDock> r0 = com.facebook.aura.navigation.SidePanelLocalsKt.LocalHatchSidePanelDock
            java.lang.Object r1 = r11.A6v(r0)
            com.facebook.aura.navigation.HatchSidePanelDock r1 = (com.facebook.aura.navigation.HatchSidePanelDock) r1
            boolean r2 = r10 instanceof com.facebook.aura.navigation.AuraContentAreaNavKey
            r5 = 0
            if (r9 != 0) goto L10
            r4 = 0
            if (r2 == 0) goto L11
        L10:
            r4 = 1
        L11:
            boolean r0 = com.facebook.aura.tabs.HatchSidePanelEntryKt.isSidePanelDockedOn(r10)
            if (r0 != 0) goto L1a
            r3 = 0
            if (r2 == 0) goto L1b
        L1a:
            r3 = 1
        L1b:
            float r2 = r1.railWidth
            r0 = 0
            int r0 = X.C1DG.A01(r2, r0)
            if (r0 <= 0) goto L27
            r10 = 1
            if (r4 != 0) goto L28
        L27:
            r10 = 0
        L28:
            boolean r0 = r1.isDocked
            if (r0 == 0) goto L2f
            r9 = 1
            if (r3 != 0) goto Lbb
        L2f:
            r9 = 0
            if (r3 != 0) goto Lbb
            if (r4 != 0) goto Lbb
            r0 = -880747385(0xffffffffcb80dc87, float:-1.6890126E7)
            r11.AgE(r0)
        L3a:
            X.AnonymousClass001.A1D(r11)
            boolean r0 = r11.A66(r9)
            boolean r0 = X.AnonymousClass004.A1W(r11, r1, r10, r0)
            java.lang.Object r3 = r11.AaT()
            if (r0 != 0) goto L4f
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L57
        L4f:
            com.facebook.aura.tabs.AuraTabPageDockKt$auraTabPageDock$insetAt$1$1 r3 = new com.facebook.aura.tabs.AuraTabPageDockKt$auraTabPageDock$insetAt$1$1
            r3.<init>(r9, r10, r1)
            r11.Ai0(r3)
        L57:
            X.G0U r3 = (X.G0U) r3
            float r2 = r1.width
            X.1DG r0 = new X.1DG
            r0.<init>(r2)
            java.lang.Object r0 = r3.invoke(r0)
            X.1DG r0 = (X.C1DG) r0
            float r4 = r0.A00
            float r2 = r1.targetWidth
            X.1DG r0 = new X.1DG
            r0.<init>(r2)
            java.lang.Object r0 = r3.invoke(r0)
            X.1DG r0 = (X.C1DG) r0
            float r5 = r0.A00
            float r2 = r1.contentWidth
            X.1DG r0 = new X.1DG
            r0.<init>(r2)
            java.lang.Object r0 = r3.invoke(r0)
            X.1DG r0 = (X.C1DG) r0
            float r6 = r0.A00
            float r7 = r1.contentAlpha
            boolean r0 = X.C1DG.A08(r4, r5)
            if (r0 == 0) goto Laa
            boolean r0 = X.C1DG.A08(r6, r5)
            if (r0 == 0) goto Laa
            float r2 = r1.fromWidth
            X.1DG r0 = new X.1DG
            r0.<init>(r2)
            java.lang.Object r0 = r3.invoke(r0)
            X.1DG r0 = (X.C1DG) r0
            float r0 = r0.A00
            boolean r0 = X.C1DG.A08(r0, r5)
            r8 = 0
            if (r0 != 0) goto Lab
        Laa:
            r8 = 1
        Lab:
            boolean r0 = r1.isDocked
            if (r0 == 0) goto Lb4
            if (r9 != 0) goto Lb4
            r11 = 1
            if (r10 == 0) goto Lb5
        Lb4:
            r11 = 0
        Lb5:
            com.facebook.aura.tabs.AuraTabPageDock r3 = new com.facebook.aura.tabs.AuraTabPageDock
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
        Lbb:
            r0 = -880833875(0xffffffffcb7f8aad, float:-1.6747181E7)
            r11.AgE(r0)
            RequestSidePanelDock(r3, r4, r11, r5)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraTabPageDockKt.auraTabPageDock(com.facebook.aura.navigation.AuraTabRootNavKey, com.facebook.aura.navigation.AuraNavKey, X.BFM, int):com.facebook.aura.tabs.AuraTabPageDock");
    }

    public static final void RequestSidePanelDock(boolean z, boolean z2, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        bfm.AgG(1511625201);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            bfm.Afo();
        } else {
            if (((C1Cd) bfm.A6v(C1eL.A00)).AM0().A07.getValue() != EnumC04711Bv.A04) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(z, z2, i);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zA1T = AnonymousClass001.A1T(bfm, hatchSidePanelController, AnonymousClass003.A1B(iA0n)) | AnonymousClass001.A1O(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new AuraTabPageDockKt$RequestSidePanelDock$2$1(z, hatchSidePanelController, z2);
                bfm.Ai0(objAaT);
            }
            C78e.A01(bfm, hatchSidePanelController, boolValueOf, boolValueOf2, (G0U) objAaT);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(z, z2, i);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    /* renamed from: auraTabPageDockPlacement-mxwnekA, reason: not valid java name */
    public static final BRg m2299auraTabPageDockPlacementmxwnekA(BRg bRg, AuraTabPageDock auraTabPageDock, long j) {
        BRg bRgA01;
        BRg bRgA0C;
        AnonymousClass003.A0u(bRg, auraTabPageDock);
        if (auraTabPageDock.coversDock) {
            bRgA0C = BRg.A00;
            bRgA01 = C1b8.A01(bRgA0C, j);
        } else {
            bRgA01 = BRg.A00;
            bRgA0C = bRgA01;
        }
        BRg bRgThen = bRg.then(bRgA01);
        float f = auraTabPageDock.inset;
        if (C1DG.A01(f, 0.0f) > 0) {
            bRgA0C = C3U4.A0C(bRgA0C, f, 0.0f, 0.0f, 0.0f);
        }
        return bRgThen.then(bRgA0C);
    }
}
