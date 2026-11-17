package com.facebook.aura.ui.adaptive;

import X.AGO;
import X.AKH;
import X.AKT;
import X.AXN;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C16n;
import X.C1BO;
import X.C60K;
import X.C7384Etj;
import X.C78N;
import X.C8Z9;
import X.G0V;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class AuraAdaptiveInfoKt {
    public static final AKH<AuraAdaptiveInfo> LocalAuraAdaptiveInfo = new AGO(AuraAdaptiveInfoKt$LocalAuraAdaptiveInfo$1.INSTANCE);

    /* renamed from: com.facebook.aura.ui.adaptive.AuraAdaptiveInfoKt$ProvideAuraAdaptiveInfo$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraAdaptiveInfoKt.ProvideAuraAdaptiveInfo(this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ProvideAuraAdaptiveInfo(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 0);
        bfm.AgG(458893678);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            C60K c60k = (C60K) bfm.A6v(Am0.A0I);
            Configuration configuration = (Configuration) bfm.A6v(AndroidCompositionLocals_androidKt.A00);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            boolean zA1R = AnonymousClass005.A1R(bfm, c60k, configuration, axnA0Y);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = AnonymousClass002.A0K(bfm, null, new AuraAdaptiveInfoKt$ProvideAuraAdaptiveInfo$adaptiveInfo$2$1(c60k, configuration, axnA0Y));
            }
            AKT.A01(bfm, LocalAuraAdaptiveInfo.A04(((C1BO) objAaT).getValue()), g0v, ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(g0v, i);
        }
    }

    /* renamed from: adaptiveInfoFor-EaSLcWc, reason: not valid java name */
    public static final AuraAdaptiveInfo m2355adaptiveInfoForEaSLcWc(long j) {
        int i;
        Set<C8Z9> set = C8Z9.A03;
        float fA03 = AnonymousClass003.A03(j);
        float fIntBitsToFloat = Float.intBitsToFloat(AnonymousClass002.A09(j));
        C7384Etj.A0Y(set, 0);
        int i2 = (int) fA03;
        int i3 = (int) fIntBitsToFloat;
        Iterator<C8Z9> it = set.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = it.next().A01;
            if (i5 <= i2 && i5 > i4) {
                i4 = i5;
            }
        }
        C8Z9 c8z9 = new C8Z9(0, 0);
        for (C8Z9 c8z92 : set) {
            if (c8z92.A01 == i4 && (i = c8z92.A00) <= i3 && c8z9.A00 <= i) {
                c8z9 = c8z92;
            }
        }
        return new AuraAdaptiveInfo(toAuraWidthClass(c8z9), toAuraHeightClass(c8z9));
    }

    public static final boolean auraIsTwoPane(BFM bfm, int i) {
        return ((AuraAdaptiveInfo) bfm.A6v(LocalAuraAdaptiveInfo)).isTwoPane();
    }

    public static final AKH<AuraAdaptiveInfo> getLocalAuraAdaptiveInfo() {
        return LocalAuraAdaptiveInfo;
    }

    public static final AuraHeightClass toAuraHeightClass(C8Z9 c8z9) {
        int i = c8z9.A00;
        return i >= 900 ? AuraHeightClass.Expanded : i >= 480 ? AuraHeightClass.Medium : AuraHeightClass.Compact;
    }

    public static final AuraWidthClass toAuraWidthClass(C8Z9 c8z9) {
        int i = c8z9.A01;
        return i >= 1600 ? AuraWidthClass.ExtraLarge : i >= 1200 ? AuraWidthClass.Large : i >= 840 ? AuraWidthClass.Expanded : i >= 600 ? AuraWidthClass.Medium : AuraWidthClass.Compact;
    }

    public static final long windowDpSize(C60K c60k, Configuration configuration, AXN axn) {
        float fAgy;
        float fAgy2;
        int iA09;
        AnonymousClass005.A0x(c60k, configuration, axn);
        long jAE1 = c60k.AE1();
        int i = (int) (jAE1 >> 32);
        if (i <= 0 || (iA09 = AnonymousClass002.A09(jAE1)) <= 0) {
            fAgy = configuration.screenWidthDp;
            fAgy2 = configuration.screenHeightDp;
        } else {
            fAgy = axn.Agy(i);
            fAgy2 = axn.Agy(iA09);
        }
        return C16n.A00(fAgy, fAgy2);
    }
}
