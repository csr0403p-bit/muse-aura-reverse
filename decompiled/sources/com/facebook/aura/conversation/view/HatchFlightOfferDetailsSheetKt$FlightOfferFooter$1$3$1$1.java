package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchFlightOfferDetailsSheetKt$FlightOfferFooter$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $link;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFlightOfferDetailsSheetKt$FlightOfferFooter$1$3$1$1(String str, AbstractC3358CGz abstractC3358CGz, String str2, Context context, AuraNavigator auraNavigator) {
        super(0);
        this.$sessionId = str;
        this.$userSession = abstractC3358CGz;
        this.$link = str2;
        this.$context = context;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchFlightOfferDetailsSheetKt.logFlightOfferClick(this.$sessionId, HatchComponent.EXTERNAL_LINK);
        HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, this.$link, this.$context, this.$navigator, null, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
