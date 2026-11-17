package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageContent$textContent$1$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0V<String, String, Unit> $onSlidesClick;
    public final /* synthetic */ G0U<String, Unit> $onUrlClick;
    public final /* synthetic */ MutableState<String> $phoneNumberForAction$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        G0U<String, Unit> g0u = this.$onUrlClick;
        if (g0u != null) {
            g0u.invoke(str);
            return;
        }
        if (str.startsWith("tel:")) {
            this.$phoneNumberForAction$delegate.Af8(str);
            return;
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        Map<String, String> mapLinkMetadata = null;
        HatchSubsurface hatchSubsurface = HatchSubsurface.MESSAGE_LIST;
        HatchScreen hatchScreen = HatchScreen.MAIN_CHAT;
        HatchComponent hatchComponent = HatchComponent.EXTERNAL_LINK;
        HatchCitationAnalytics hatchCitationAnalytics = this.$message.citationAnalytics;
        if (hatchCitationAnalytics != null) {
            mapLinkMetadata = hatchCitationAnalytics.linkMetadata(str);
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, mapLinkMetadata, null);
        HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, str, this.$context, this.$navigator, this.$onSlidesClick, this.$message.sessionId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageBubbleContentKt$HatchMessageContent$textContent$1$1$1$1(G0U<? super String, Unit> g0u, HatchMessageUiModel hatchMessageUiModel, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, G0V<? super String, ? super String, Unit> g0v, MutableState<String> mutableState) {
        super(1);
        this.$onUrlClick = g0u;
        this.$message = hatchMessageUiModel;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$onSlidesClick = g0v;
        this.$phoneNumberForAction$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
