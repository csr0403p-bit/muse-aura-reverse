package com.facebook.aura.navigation.entries;

import X.AGH;
import X.AMP;
import X.ANE;
import X.ANR;
import X.ANU;
import X.ANi;
import X.APt;
import X.APu;
import X.ASj;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.C28s;
import X.C2HU;
import X.C60O;
import X.C7BY;
import com.facebook.aura.navigation.AuraPageSceneStrategyKt;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import com.facebook.aura.navigation.key.OnboardingGateScreenKey;
import com.facebook.aura.navigation.key.OnboardingUiFlowScreenKey;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class ConversationEntryProviderKt {
    public static final int SETUP_HANDOFF_FADE_MS = 250;
    public static final String TAG = "ConversationEntry";
    public static final Set<String> ONBOARDING_HANDOFF_KEY_STRINGS = C60O.A19(OnboardingGateScreenKey.INSTANCE.toString(), OnboardingUiFlowScreenKey.INSTANCE.toString());
    public static final String ACTIVATION_HANDOFF_KEY_PREFIX = C7BY.A0I(new ActivationScreenKey(false, false, null, false, null).toString(), new ActivationScreenKey(true, false, null, false, null).toString());
    public static final Map<String, Object> conversationTabTransitionMetadata = AGH.A04(AGH.A03(AnonymousClass006.A10(ANE.A00.toString(), ConversationEntryProviderKt$conversationTabTransitionMetadata$1.INSTANCE), ConversationEntryProviderKt$conversationTabTransitionMetadata$2.INSTANCE), ConversationEntryProviderKt$conversationTabTransitionMetadata$3.INSTANCE);

    public static final ANU handoffFadeTransition(ANi<AMP<?>> aNi) {
        APu aPuA0P;
        APt aPtA00;
        ANU anuDeferredPageRevealTransition = AuraPageSceneStrategyKt.deferredPageRevealTransition(aNi);
        if (anuDeferredPageRevealTransition != null) {
            return anuDeferredPageRevealTransition;
        }
        if (isSetupHandoff(aNi.AGR())) {
            C28s c28s = C2HU.A02;
            aPuA0P = AnonymousClass003.A0P(c28s, 250, 0);
            aPtA00 = ASj.A00(c28s, 250, 0);
        } else {
            aPuA0P = APu.A00;
            aPtA00 = APt.A00;
        }
        return ANR.A00(aPuA0P, aPtA00);
    }

    public static final boolean isSetupHandoff(AMP<?> amp) {
        String string = amp.getKey().toString();
        if (!ONBOARDING_HANDOFF_KEY_STRINGS.contains(string)) {
            String str = ACTIVATION_HANDOFF_KEY_PREFIX;
            boolean zA1b = AnonymousClass004.A1b(string, str);
            if (!string.startsWith(str)) {
                return zA1b;
            }
        }
        return true;
    }
}
