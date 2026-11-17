package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.conversation.view.HatchUrlClickHandlerKt;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PairsHistoryScreenKt$PairsHistoryRow$1$1$7$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0V<HatchComponent, Map<String, String>, Unit> $logMessageClick;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<String, ConnectionsSharedLinkTarget> $sharedLinkTarget;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        boolean zStartsWith = str.startsWith(PairsHistoryViewModelKt.SHARED_LINK_SCHEME);
        this.$logMessageClick.invoke(HatchComponent.EXTERNAL_LINK, PairsAnalytics.INSTANCE.historyLinkType$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(zStartsWith, str));
        if (!zStartsWith) {
            HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, str, this.$context, this.$navigator, null, null);
            return;
        }
        ConnectionsSharedLinkTarget connectionsSharedLinkTargetInvoke = this.$sharedLinkTarget.invoke(str);
        if (connectionsSharedLinkTargetInvoke != null) {
            PairsHistoryScreenKt.open(connectionsSharedLinkTargetInvoke, this.$userSession, this.$navigator);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PairsHistoryScreenKt$PairsHistoryRow$1$1$7$1(G0V<? super HatchComponent, ? super Map<String, String>, Unit> g0v, G0U<? super String, ConnectionsSharedLinkTarget> g0u, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, Context context) {
        super(1);
        this.$logMessageClick = g0v;
        this.$sharedLinkTarget = g0u;
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
