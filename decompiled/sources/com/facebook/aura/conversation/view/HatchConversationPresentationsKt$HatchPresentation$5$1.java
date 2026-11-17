package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C7384Etj;
import X.C98f;
import X.G0V;
import X.HxE;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.waterfall.HatchNMEEntrypointLogger;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.TextWithButtonCta;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$HatchPresentation$5$1 extends AbstractC7559F3s implements G0V<Integer, TextWithButtonCta, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0V<String, String, Unit> $handleAction;
    public final /* synthetic */ HatchWidgetPresentation $presentation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationPresentationsKt$HatchPresentation$5$1(HatchWidgetPresentation hatchWidgetPresentation, Context context, G0V<? super String, ? super String, Unit> g0v) {
        super(2);
        this.$presentation = hatchWidgetPresentation;
        this.$context = context;
        this.$handleAction = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, TextWithButtonCta textWithButtonCta) {
        invoke(AnonymousClass001.A0F(num), textWithButtonCta);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, TextWithButtonCta textWithButtonCta) {
        C7384Etj.A0Y(textWithButtonCta, 1);
        String str = textWithButtonCta.url;
        if (str != null) {
            if (str.startsWith(HatchConversationPresentationsKt.SUBSCRIPTIONS_INVOKE_URL_PREFIX)) {
                HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.CHAT_THREAD, HatchComponent.UPGRADE_BUTTON, null, AnonymousClass007.A0d(HatchMetadataKey.CTA_ACTION.getValue(), HatchConversationKt.subscriptionCtaAction(str), new HxE(HatchMetadataKey.TAP_ORIGIN.getValue(), HatchConversationPresentationsKt.IN_THREAD_TAP_ORIGIN)), null);
                new HatchNMEEntrypointLogger(null, 1, null).logClick(C98f.A01, HatchConversationPresentationsKt.entrypointViewerData(str));
            } else if (HatchConversationPresentationsKt.isInviteEntryPointUrl(str)) {
                HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.CHAT_THREAD, HatchComponent.INVITE_UPSELL_CARD, this.$presentation.presentationId, null, null);
            }
            if (!HatchUrlClickHandlerKt.handleMetaAiCtaUrlClick(str, this.$context)) {
                this.$handleAction.invoke(str, null);
            }
        }
    }
}
