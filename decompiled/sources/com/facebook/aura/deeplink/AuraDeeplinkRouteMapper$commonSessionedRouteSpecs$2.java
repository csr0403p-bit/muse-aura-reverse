package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0W;
import android.net.Uri;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.RedeemInviteCodeScreenKey;
import com.facebook.aura.utils.HatchUtil;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$2 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$2 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$2();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$2() {
        super(3);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        String strInviteCode;
        AuraNavKey redeemInviteCodeScreenKey;
        LaunchFlag launchFlag;
        AnonymousClass003.A0v(uri, abstractC3358CGz);
        if (!AuraDeeplinkActivation.INSTANCE.isFullyActivated(abstractC3358CGz) || (strInviteCode = AuraDeeplinkRouteMapper.INSTANCE.inviteCode(uri)) == null) {
            return null;
        }
        if (HatchUtil.INSTANCE.isRedeemInviteEnabled()) {
            redeemInviteCodeScreenKey = new RedeemInviteCodeScreenKey(strInviteCode);
            launchFlag = LaunchFlag.NAVIGATE;
        } else {
            redeemInviteCodeScreenKey = ConversationTabScreenKey.INSTANCE;
            launchFlag = LaunchFlag.REPLACE_BACKSTACK;
        }
        return new AuraDeeplinkRoute(redeemInviteCodeScreenKey, launchFlag, null);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        return invoke2(uri, (List<String>) list, abstractC3358CGz);
    }
}
