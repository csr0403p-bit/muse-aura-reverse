package com.facebook.aura.navigation.entries;

import X.AGH;
import X.AMP;
import X.AND;
import X.ANE;
import X.ANR;
import X.ANU;
import X.ANi;
import X.APt;
import X.AQI;
import X.AQJ;
import X.ASj;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C05463bs;
import X.C1003AOr;
import X.C15k;
import X.C28s;
import X.C2HU;
import X.C2ae;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.G0U;
import X.G0V;
import com.facebook.aura.navigation.AuraPageSceneStrategyKt;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import com.facebook.aura.ui.HatchSetupTransitionKt;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AuraTransitionsKt {
    public static final ASj<C2ae> bottomSlideSpec;
    public static final Map<String, Object> bottomUpTransitionMetadata;
    public static final G0U<ANi<AMP<?>>, ANU> cardMorphFade;
    public static final ASj<Float> cardMorphFadeSpec;
    public static final Map<String, Object> cardMorphTransitionMetadata;
    public static final ASj<Float> fadeSpec;
    public static final Map<String, Object> fadeTransitionMetadata;
    public static final long pillTransformOrigin;
    public static final ASj<Float> pushFadeInSpec;
    public static final ASj<Float> pushFadeOutSpec;
    public static final G0U<Integer, Integer> pushSlideOffset;
    public static final G0U<Integer, Integer> pushSlideOffsetNegative;
    public static final Map<String, Object> pushTransitionMetadata;
    public static final Map<String, Object> setupLoadingTransitionMetadata;
    public static final ASj<Float> statusEnterFadeSpec;
    public static final ASj<Float> statusEnterScaleSpec;
    public static final ASj<Float> statusExitFadeSpec;
    public static final ASj<Float> statusExitScaleSpec;
    public static final Map<String, Object> statusScreenTransitionMetadata;
    public static final Map<String, Object> tabTransitionMetadata;

    /* renamed from: com.facebook.aura.navigation.entries.AuraTransitionsKt$pushOrFadeFromTransitionMetadata$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<ANi<AMP<?>>, ANU> {
        public final /* synthetic */ String $fadeFromKey;

        @Override // X.G0U
        public final ANU invoke(ANi<AMP<?>> aNi) {
            C7384Etj.A0Y(aNi, 0);
            return AuraTransitionsKt.pushOrFadeFromTransitionMetadata$enter(aNi, this.$fadeFromKey, false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$fadeFromKey = str;
        }
    }

    /* renamed from: com.facebook.aura.navigation.entries.AuraTransitionsKt$pushOrFadeFromTransitionMetadata$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<ANi<AMP<?>>, ANU> {
        public final /* synthetic */ String $fadeFromKey;

        @Override // X.G0U
        public final ANU invoke(ANi<AMP<?>> aNi) {
            C7384Etj.A0Y(aNi, 0);
            return AuraTransitionsKt.pushOrFadeFromTransitionMetadata$enter(aNi, this.$fadeFromKey, true);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(1);
            this.$fadeFromKey = str;
        }
    }

    /* renamed from: com.facebook.aura.navigation.entries.AuraTransitionsKt$pushOrFadeFromTransitionMetadata$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<ANi<AMP<?>>, Integer, ANU> {
        public final /* synthetic */ String $fadeFromKey;

        public final ANU invoke(ANi<AMP<?>> aNi, int i) {
            C7384Etj.A0Y(aNi, 0);
            return AuraTransitionsKt.pushOrFadeFromTransitionMetadata$enter(aNi, this.$fadeFromKey, true);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(2);
            this.$fadeFromKey = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ ANU invoke(ANi<AMP<?>> aNi, Integer num) {
            return invoke(aNi, AnonymousClass001.A0F(num));
        }
    }

    public static final Map<String, Object> pushOrFadeFromTransitionMetadata(String str) {
        C7384Etj.A0Y(str, 0);
        return AGH.A04(AGH.A03(AnonymousClass006.A10(ANE.A00.toString(), new AnonymousClass1(str)), new AnonymousClass2(str)), new AnonymousClass3(str));
    }

    static {
        C28s c28s = C2HU.A02;
        pushFadeInSpec = new ASj<>(c28s, 150, 0);
        pushFadeOutSpec = new ASj<>(c28s, 150, 0);
        pushSlideOffset = AuraTransitionsKt$pushSlideOffset$1.INSTANCE;
        pushSlideOffsetNegative = AuraTransitionsKt$pushSlideOffsetNegative$1.INSTANCE;
        cardMorphFadeSpec = new ASj<>(c28s, 350, 0);
        AuraTransitionsKt$cardMorphFade$1 auraTransitionsKt$cardMorphFade$1 = AuraTransitionsKt$cardMorphFade$1.INSTANCE;
        cardMorphFade = auraTransitionsKt$cardMorphFade$1;
        AND and = ANE.A00;
        cardMorphTransitionMetadata = AGH.A04(AGH.A03(AnonymousClass006.A10(and.toString(), auraTransitionsKt$cardMorphFade$1), auraTransitionsKt$cardMorphFade$1), AuraTransitionsKt$cardMorphTransitionMetadata$1.INSTANCE);
        pushTransitionMetadata = AGH.A04(AGH.A03(AnonymousClass006.A10(and.toString(), AuraTransitionsKt$pushTransitionMetadata$1.INSTANCE), AuraTransitionsKt$pushTransitionMetadata$2.INSTANCE), AuraTransitionsKt$pushTransitionMetadata$3.INSTANCE);
        C28s c28s2 = C2HU.A01;
        bottomSlideSpec = new ASj<>(c28s2, 250, 0);
        bottomUpTransitionMetadata = AGH.A04(AGH.A03(AnonymousClass006.A10(and.toString(), AuraTransitionsKt$bottomUpTransitionMetadata$1.INSTANCE), AuraTransitionsKt$bottomUpTransitionMetadata$2.INSTANCE), AuraTransitionsKt$bottomUpTransitionMetadata$3.INSTANCE);
        fadeSpec = new ASj<>(c28s, 200, 0);
        fadeTransitionMetadata = AGH.A04(AGH.A03(AnonymousClass006.A10(and.toString(), AuraTransitionsKt$fadeTransitionMetadata$1.INSTANCE), AuraTransitionsKt$fadeTransitionMetadata$2.INSTANCE), AuraTransitionsKt$fadeTransitionMetadata$3.INSTANCE);
        setupLoadingTransitionMetadata = AGH.A04(AGH.A03(AnonymousClass006.A10(and.toString(), AuraTransitionsKt$setupLoadingTransitionMetadata$1.INSTANCE), AuraTransitionsKt$setupLoadingTransitionMetadata$2.INSTANCE), AuraTransitionsKt$setupLoadingTransitionMetadata$3.INSTANCE);
        tabTransitionMetadata = AGH.A04(AGH.A03(AnonymousClass006.A10(and.toString(), AuraTransitionsKt$tabTransitionMetadata$1.INSTANCE), AuraTransitionsKt$tabTransitionMetadata$2.INSTANCE), AuraTransitionsKt$tabTransitionMetadata$3.INSTANCE);
        statusEnterScaleSpec = new ASj<>(c28s2, 350, 0);
        statusEnterFadeSpec = new ASj<>(c28s2, 200, 0);
        statusExitScaleSpec = new ASj<>(c28s2, 300, 0);
        statusExitFadeSpec = new ASj<>(c28s2, 150, 0);
        long jA0J = AnonymousClass005.A0J(0.5f, 0.05f);
        long j = C15k.A01;
        pillTransformOrigin = jA0J;
        statusScreenTransitionMetadata = AGH.A04(AGH.A03(AnonymousClass006.A10(and.toString(), AuraTransitionsKt$statusScreenTransitionMetadata$1.INSTANCE), AuraTransitionsKt$statusScreenTransitionMetadata$2.INSTANCE), AuraTransitionsKt$statusScreenTransitionMetadata$3.INSTANCE);
    }

    public static final Map<String, Object> getBottomUpTransitionMetadata() {
        return bottomUpTransitionMetadata;
    }

    public static final Map<String, Object> getCardMorphTransitionMetadata() {
        return cardMorphTransitionMetadata;
    }

    public static final Map<String, Object> getFadeTransitionMetadata() {
        return fadeTransitionMetadata;
    }

    public static final Map<String, Object> getPushTransitionMetadata() {
        return pushTransitionMetadata;
    }

    public static final Map<String, Object> getSetupLoadingTransitionMetadata() {
        return setupLoadingTransitionMetadata;
    }

    public static final Map<String, Object> getStatusScreenTransitionMetadata() {
        return statusScreenTransitionMetadata;
    }

    public static final Map<String, Object> getTabTransitionMetadata() {
        return tabTransitionMetadata;
    }

    public static final ANU pushOrFadeFromTransitionMetadata$enter(ANi<AMP<?>> aNi, String str, boolean z) {
        return C7384Etj.areEqual(aNi.AGR().getKey().toString(), str) ? C8j3.A0c(fadeSpec) : pushTransition(aNi, z);
    }

    public static final ANU pushTransition(ANi<AMP<?>> aNi, boolean z) {
        G0U<Integer, Integer> g0u;
        G0U<Integer, Integer> g0u2;
        ANU anuTabFullscreenTransition = AuraPageSceneStrategyKt.tabFullscreenTransition(aNi, z);
        if (anuTabFullscreenTransition != null) {
            return anuTabFullscreenTransition;
        }
        if (z) {
            g0u = pushSlideOffsetNegative;
            g0u2 = pushSlideOffset;
        } else {
            g0u = pushSlideOffset;
            g0u2 = pushSlideOffsetNegative;
        }
        AQI aqiA04 = AbstractC1011APs.A04(pushFadeInSpec, 0.0f);
        long jA0N = C8j3.A0N();
        AQI aqiA00 = aqiA04.A00(AbstractC1011APs.A08(new C1003AOr(C8j3.A0l(jA0N), 1.0f, 400.0f), g0u));
        AQJ aqjA0E = AbstractC1011APs.A0E(pushFadeOutSpec);
        C1003AOr c1003AOr = new C1003AOr(C8j3.A0l(jA0N), 1.0f, 400.0f);
        C05463bs c05463bs = new C05463bs(g0u2, 8);
        APt aPt = APt.A00;
        return ANR.A00(aqiA00, aqjA0E.A00(new AQJ(AbstractC1011APs.A0J(c1003AOr, c05463bs))));
    }

    public static final ANU setupLoadingTransition(ANi<AMP<?>> aNi) {
        return ((aNi.AGR().getKey() instanceof ActivationScreenKey) || (aNi.ALW().getKey() instanceof ActivationScreenKey)) ? C8j4.A0S() : HatchSetupTransitionKt.hatchSetupFadeThrough();
    }
}
