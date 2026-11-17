package com.facebook.aura.hotels;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.conversation.view.HatchUrlClickHandlerKt;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HotelSelectionContactInfoKt$HotelSelectionContactInfo$2$2$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sourceSessionId;
    public final /* synthetic */ String $url;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionContactInfoKt$HotelSelectionContactInfo$2$2$3$1$1(AbstractC3358CGz abstractC3358CGz, String str, Context context, AuraNavigator auraNavigator, String str2) {
        super(0);
        this.$userSession = abstractC3358CGz;
        this.$url = str;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$sourceSessionId = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, this.$url, this.$context, this.$navigator, null, this.$sourceSessionId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
