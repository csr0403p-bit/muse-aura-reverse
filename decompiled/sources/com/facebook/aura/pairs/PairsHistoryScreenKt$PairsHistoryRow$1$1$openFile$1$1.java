package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0W;
import android.content.Context;
import com.facebook.aura.conversation.view.HatchUrlClickHandlerKt;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PairsHistoryScreenKt$PairsHistoryRow$1$1$openFile$1$1 extends AbstractC7559F3s implements G0W<String, String, String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        if (ConnectionsActivityItemsKt.openConnectionsFile(str, str2, str3, this.$userSession, this.$navigator)) {
            return;
        }
        HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, str, this.$context, this.$navigator, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsHistoryScreenKt$PairsHistoryRow$1$1$openFile$1$1(AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, Context context) {
        super(3);
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
        this.$context = context;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.INSTANCE;
    }
}
