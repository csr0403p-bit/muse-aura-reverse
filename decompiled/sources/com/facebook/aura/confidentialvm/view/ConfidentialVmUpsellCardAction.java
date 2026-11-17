package com.facebook.aura.confidentialvm.view;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BRg;
import X.C9hr;
import X.F0C;
import X.FGI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDataSource;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDestination;
import com.facebook.aura.conversation.widget.api.ConversationPresentationAction;
import com.facebook.aura.conversation.widget.api.PresentationLinkSource;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchIntroScreenKey;
import com.facebook.aura.navigation.key.EncryptionScreenKey;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ConfidentialVmUpsellCardAction implements ConversationPresentationAction {
    public final AuraNavigator navigator;
    public final AbstractC3358CGz userSession;

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationAction
    public BRg cardModifier(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (ConfidentialVmUpsellCardActionKt.isLearnMoreUrl(AnonymousClass005.A0j(it))) {
                    return HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.CHAT_THREAD, HatchComponent.CVM_UPSELL_CARD, str, null, null, 500L, 0.0f, FGI.A0M(ConfidentialVmUpsellCardActionKt.UPSELL_CARD_DEDUPE_PREFIX, str), null, null);
                }
            }
        }
        return BRg.A00;
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationAction
    public boolean handle(String str, PresentationLinkSource presentationLinkSource) {
        AuraNavigator auraNavigator;
        AuraNavKey confidentialVmSwitchIntroScreenKey;
        boolean zA1a = AnonymousClass002.A1a(str, presentationLinkSource);
        if (!(presentationLinkSource instanceof PresentationLinkSource.TranscriptButton) || !ConfidentialVmUpsellCardActionKt.isLearnMoreUrl(str)) {
            return false;
        }
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.CHAT_THREAD, HatchComponent.CVM_UPSELL_CARD, ((PresentationLinkSource.TranscriptButton) presentationLinkSource).presentationId, null, null);
        switch (ConfidentialVmSwitchDataSource.Companion.getInstance(this.userSession).getCurrentDestination().ordinal()) {
            case 0:
                return zA1a;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                auraNavigator = this.navigator;
                F0C<C9hr<Object>>[] f0cArr = ConfidentialVmSwitchIntroScreenKey.$childSerializers;
                confidentialVmSwitchIntroScreenKey = new ConfidentialVmSwitchIntroScreenKey(ConfidentialVmSwitchEntryPoint.CHAT_CARD);
                break;
            case 7:
                auraNavigator = this.navigator;
                confidentialVmSwitchIntroScreenKey = EncryptionScreenKey.INSTANCE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        auraNavigator.navigate(confidentialVmSwitchIntroScreenKey, false);
        return zA1a;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmSwitchDestination.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmSwitchDestination.CVM_SUBSCRIBE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmSwitchDestination.CVM_SWITCH_INTRO, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmSwitchDestination.CVM_JOIN_WAITLIST, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConfidentialVmSwitchDestination.CVM_ON_WAITLIST, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConfidentialVmSwitchDestination.CVM_LOADING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConfidentialVmSwitchDestination.CVM_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ConfidentialVmSwitchDestination.CVM_ENCRYPTION_SETTINGS, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ConfidentialVmSwitchDestination.NONE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConfidentialVmUpsellCardAction(AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator) {
        AnonymousClass003.A0u(abstractC3358CGz, auraNavigator);
        this.userSession = abstractC3358CGz;
        this.navigator = auraNavigator;
    }
}
