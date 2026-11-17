package com.facebook.aura.ui.adaptive;

import X.AGO;
import X.AKH;
import X.ATD;
import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BNH;
import X.BRg;
import X.C10G;
import X.C16n;
import X.C1743Apg;
import X.C1DG;
import X.C1Ny;
import X.C1OP;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.EnumC1820Arj;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraPageCardKt {
    public static final AKH<Boolean> LocalAuraPageCardSuppressed = new AGO(AuraPageCardKt$LocalAuraPageCardSuppressed$1.INSTANCE);
    public static final AKH<AuraPageHost> LocalAuraPageHost = new AGO(AuraPageCardKt$LocalAuraPageHost$1.INSTANCE);
    public static final float PageCardGutter = 24.0f;

    /* renamed from: com.facebook.aura.ui.adaptive.AuraPageCardKt$ProvideAuraPageCardLayoutSize$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ AuraContentRole $role;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, AuraContentRole auraContentRole, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$enabled = z;
            this.$role = auraContentRole;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraPageCardKt.ProvideAuraPageCardLayoutSize(this.$enabled, this.$role, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final boolean auraPageCardEnabled(AuraContentRole auraContentRole, BFM bfm, int i) {
        BBI bbiA0M;
        C7384Etj.A0Y(auraContentRole, 0);
        boolean z = false;
        if (isCardable(auraContentRole)) {
            bfm.AgE(-1795437160);
            boolean zIsTwoPane = ((AuraAdaptiveInfo) bfm.A6v(AuraAdaptiveInfoKt.LocalAuraAdaptiveInfo)).isTwoPane();
            bbiA0M = (BBI) bfm;
            BBI.A0R(bbiA0M, false);
            if (zIsTwoPane) {
                bfm.AgE(-1795436461);
                z = !AnonymousClass003.A1G(bfm, LocalAuraPageCardSuppressed);
            }
            BBI.A0R(bbiA0M, false);
            return z;
        }
        bbiA0M = AnonymousClass002.A0M(bfm, 176024125);
        bfm.AgE(176045794);
        BBI.A0R(bbiA0M, false);
        return z;
    }

    public static final long pageCardLayoutSize(AuraContentRole auraContentRole, BFM bfm, int i) {
        C1Ny c1NyPageCardSafeInsets = pageCardSafeInsets(bfm, 0);
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
        float fAuraLayoutWidth = (AuraLayoutSizeKt.auraLayoutWidth(bfm, 0) - axnA0Y.Agy(c1NyPageCardSafeInsets.AH1(axnA0Y, enumC1820ArjA0d))) - axnA0Y.Agy(c1NyPageCardSafeInsets.AJo(axnA0Y, enumC1820ArjA0d));
        float f = PageCardGutter;
        float fAuraLayoutHeight = ((AuraLayoutSizeKt.auraLayoutHeight(bfm, 0) - axnA0Y.Agy(c1NyPageCardSafeInsets.ALn(axnA0Y))) - axnA0Y.Agy(c1NyPageCardSafeInsets.ACy(axnA0Y))) - (f * 2.0f);
        float f2 = ((C1DG) ATD.A09(new C1DG(fAuraLayoutWidth - (f * 2.0f)), C1DG.A03(), new C1DG(auraContentRole.m2361getMaxWidthD9Ej5fM()))).A00;
        C1DG c1dg = new C1DG(fAuraLayoutHeight);
        C1DG c1dgA03 = C1DG.A03();
        if (c1dg.compareTo(c1dgA03) >= 0) {
            c1dgA03 = c1dg;
        }
        return C16n.A00(f2, c1dgA03.A00);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraContentRole.values().length];
            try {
                AnonymousClass002.A13(AuraContentRole.Focused, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraContentRole.Standard, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraContentRole.Collection, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraContentRole.Conversation, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AuraContentRole.Immersive, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AKH<Boolean> getLocalAuraPageCardSuppressed() {
        return LocalAuraPageCardSuppressed;
    }

    public static final AKH<AuraPageHost> getLocalAuraPageHost() {
        return LocalAuraPageHost;
    }

    public static final void ProvideAuraPageCardLayoutSize(boolean z, AuraContentRole auraContentRole, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        long jA00;
        AnonymousClass003.A0x(auraContentRole, g0v);
        bfm.AgG(1757131765);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass005.A09(bfm, auraContentRole);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (z) {
                bfm.AgE(681483885);
                jA00 = pageCardLayoutSize(auraContentRole, bfm, (iA0n >> 3) & 14);
            } else {
                bfm.AgE(681484866);
                jA00 = C16n.A00(AuraLayoutSizeKt.auraLayoutWidth(bfm, 0), AuraLayoutSizeKt.auraLayoutHeight(bfm, 0));
            }
            AnonymousClass001.A1D(bfm);
            AuraLayoutSizeKt.m2363ProvideAuraLayoutSizeUBP6k7g(jA00, g0v, bfm, (iA0n >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(z, auraContentRole, g0v, i);
        }
    }

    public static final BRg auraPageCardFrame(BRg bRg, AuraContentRole auraContentRole, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(bRg, auraContentRole);
        return C10G.A0D(C10G.A00(C2VU.A00, C3U4.A09(BNH.A00(pageCardSafeInsets(bfm, zA1b ? 1 : 0), bRg), PageCardGutter), zA1b), Float.NaN, auraContentRole.m2361getMaxWidthD9Ej5fM());
    }

    public static final boolean isCardable(AuraContentRole auraContentRole) {
        int iOrdinal = auraContentRole.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final C1Ny pageCardSafeInsets(BFM bfm, int i) {
        return new C1OP(C1743Apg.A01(bfm).A0D, C1743Apg.A01(bfm).A01);
    }
}
