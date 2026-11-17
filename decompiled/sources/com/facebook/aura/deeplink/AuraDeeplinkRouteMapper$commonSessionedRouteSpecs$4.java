package com.facebook.aura.deeplink;

import X.AbstractC7559F3s;
import X.G0U;
import android.net.Uri;
import com.facebook.aura.utils.HatchUtil;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$4 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$4 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$4();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$4() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Uri uri) {
        return Boolean.valueOf(HatchUtil.INSTANCE.isInviteFriendsEnabled());
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
        return Boolean.valueOf(HatchUtil.INSTANCE.isInviteFriendsEnabled());
    }
}
