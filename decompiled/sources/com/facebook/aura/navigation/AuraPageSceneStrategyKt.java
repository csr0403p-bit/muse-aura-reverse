package com.facebook.aura.navigation;

import X.AMP;
import X.ANR;
import X.ANU;
import X.ANi;
import X.APt;
import X.APu;
import X.AQJ;
import X.ASj;
import X.AbstractC0878AGe;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.B1U;
import X.BFM;
import X.BRL;
import X.C05463bs;
import X.C28s;
import X.C2HU;
import X.C2ae;
import X.C60P;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class AuraPageSceneStrategyKt {
    public static final String NAV_KEY_METADATA = "aura_nav_key";
    public static final String PAGE_REVEAL_DELAY_MILLIS = "aura_page_reveal_delay_millis";
    public static final ASj<C2ae> fullscreenSlideSpec = AnonymousClass002.A0J(C2HU.A01, 250);

    /* renamed from: com.facebook.aura.navigation.AuraPageSceneStrategyKt$withAuraNavKey$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C127091 extends AbstractC7559F3s implements G0W<AuraNavKey, BFM, Integer, Unit> {
        public final /* synthetic */ BRL<AuraNavKey> $this_withAuraNavKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127091(BRL<AuraNavKey> brl) {
            super(3);
            this.$this_withAuraNavKey = brl;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AuraNavKey auraNavKey, BFM bfm, Integer num) {
            invoke(auraNavKey, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AuraNavKey auraNavKey, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                this.$this_withAuraNavKey.A00(bfm, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    public static final ANU deferredPageRevealTransition(ANi<AMP<?>> aNi) {
        Number number;
        Map<String, Object> map;
        C7384Etj.A0Y(aNi, 0);
        BRL brl = (BRL) AbstractC0878AGe.A0I(aNi.AGR().getEntries());
        Object obj = (brl == null || (map = brl.A02) == null) ? null : map.get(PAGE_REVEAL_DELAY_MILLIS);
        if (!(obj instanceof Integer) || (number = (Number) obj) == null) {
            return null;
        }
        int iIntValue = number.intValue();
        C28s c28s = C2HU.A01;
        return ANR.A00(AnonymousClass003.A0P(c28s, 300, iIntValue), ASj.A00(c28s, 300, iIntValue));
    }

    public static final AuraNavKey getAuraNavKey(BRL<?> brl) {
        C7384Etj.A0Y(brl, 0);
        Object obj = brl.A02.get(NAV_KEY_METADATA);
        if (obj instanceof AuraNavKey) {
            return (AuraNavKey) obj;
        }
        return null;
    }

    public static final ANU tabFullscreenTransition(ANi<AMP<?>> aNi, boolean z) {
        AuraPageScene auraPageScene;
        AuraPageScene auraPageScene2;
        APu aPuA08;
        APt aqj;
        C7384Etj.A0Y(aNi, 0);
        AMP<?> ampAGR = aNi.AGR();
        if (!(ampAGR instanceof AuraPageScene) || (auraPageScene = (AuraPageScene) ampAGR) == null) {
            return null;
        }
        AMP<?> ampALW = aNi.ALW();
        if (!(ampALW instanceof AuraPageScene) || (auraPageScene2 = (AuraPageScene) ampALW) == null) {
            return null;
        }
        AuraTabRootNavKey auraTabRootNavKey = auraPageScene.tabRoot;
        if (z) {
            if (auraTabRootNavKey != null || auraPageScene2.tabRoot == null) {
                return null;
            }
            aPuA08 = APu.A00;
            ASj<C2ae> aSj = fullscreenSlideSpec;
            C05463bs c05463bs = new C05463bs(AnonymousClass2.INSTANCE, 8);
            APt aPt = APt.A00;
            aqj = new AQJ(AbstractC1011APs.A0J(aSj, c05463bs));
        } else {
            if (auraTabRootNavKey == null || auraPageScene2.tabRoot != null) {
                return null;
            }
            aPuA08 = AbstractC1011APs.A08(fullscreenSlideSpec, AnonymousClass1.INSTANCE);
            aqj = APt.A00;
        }
        return ANR.A00(aPuA08, aqj);
    }

    /* renamed from: com.facebook.aura.navigation.AuraPageSceneStrategyKt$tabFullscreenTransition$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(AnonymousClass001.A0F(num));
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.facebook.aura.navigation.AuraPageSceneStrategyKt$tabFullscreenTransition$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Integer, Integer> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(AnonymousClass001.A0F(num));
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(i);
        }
    }

    public static final BRL<AuraNavKey> withAuraNavKey(BRL<AuraNavKey> brl, AuraNavKey auraNavKey) {
        return new BRL<>(auraNavKey, brl.A00, AnonymousClass006.A11(NAV_KEY_METADATA, auraNavKey, brl.A02), B1U.A03(new C127091(brl), 1808231736, C60P.A1Y(brl, auraNavKey)));
    }
}
