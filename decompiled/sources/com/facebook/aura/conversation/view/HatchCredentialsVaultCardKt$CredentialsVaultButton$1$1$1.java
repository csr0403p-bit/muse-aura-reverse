package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SecureStorageCaptureSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCredentialsVaultCardKt$CredentialsVaultButton$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ InternalLinkActionCardPresentation $card;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sourceSessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsVaultCardKt$CredentialsVaultButton$1$1$1(InternalLinkActionCardPresentation internalLinkActionCardPresentation, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, Context context, String str) {
        super(0);
        this.$card = internalLinkActionCardPresentation;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$sourceSessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str = this.$card.url;
        if (str == null) {
            this.$navigator.navigate((AuraNavKey) new SecureStorageCaptureSheetKey("", null, null, null, null, true), false);
        } else {
            HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, str, this.$context, this.$navigator, null, this.$sourceSessionId);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
