package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.WalletSetupSheetKey;
import com.facebook.aura.skills.connect.SkillOAuthLinkHandlerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorLinkCardKt$ConnectorCardButton$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ InternalLinkActionCardPresentation $card;
    public final /* synthetic */ String $connectUrl;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isReconnect;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sourceSessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ HatchConnectorLinkCardViewModel $viewModel;

    /* renamed from: com.facebook.aura.conversation.view.HatchConnectorLinkCardKt$ConnectorCardButton$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ InternalLinkActionCardPresentation $card;
        public final /* synthetic */ Context $context;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            Context context = this.$context;
            String str2 = this.$card.connectorId;
            if (str2 == null) {
                str2 = "";
            }
            SkillOAuthLinkHandlerKt.openSkillOAuthLink(context, str, str2, HatchSkillOAuthOrigin.CHAT);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, InternalLinkActionCardPresentation internalLinkActionCardPresentation) {
            super(1);
            this.$context = context;
            this.$card = internalLinkActionCardPresentation;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorLinkCardKt$ConnectorCardButton$1$2$1(boolean z, HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel, InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str2, Context context) {
        super(0);
        this.$isReconnect = z;
        this.$viewModel = hatchConnectorLinkCardViewModel;
        this.$card = internalLinkActionCardPresentation;
        this.$sourceSessionId = str;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$connectUrl = str2;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isReconnect) {
            HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel = this.$viewModel;
            InternalLinkActionCardPresentation internalLinkActionCardPresentation = this.$card;
            hatchConnectorLinkCardViewModel.reconnect(internalLinkActionCardPresentation.accountId, this.$sourceSessionId, new AnonymousClass1(this.$context, internalLinkActionCardPresentation));
        } else if (this.$card.walletSetupOptions.isEmpty()) {
            HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, this.$connectUrl, this.$context, this.$navigator, null, this.$sourceSessionId);
        } else {
            this.$navigator.navigate((AuraNavKey) new WalletSetupSheetKey(this.$card.walletSetupOptions, this.$sourceSessionId), false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
