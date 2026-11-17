package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.model.WalletSetupOption;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WalletSetupSheetKt$WalletSetupOptionRow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ WalletSetupOption $option;
    public final /* synthetic */ String $sourceSessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSetupSheetKt$WalletSetupOptionRow$1$1(WalletSetupOption walletSetupOption, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$option = walletSetupOption;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$sourceSessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.INTERNAL_LINK_ACTION_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.$option.connectorId), null);
        HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, this.$option.url, this.$context, this.$navigator, null, this.$sourceSessionId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
