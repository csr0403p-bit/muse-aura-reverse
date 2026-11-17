package com.facebook.aura.deeplink;

import X.AbstractC7559F3s;
import X.G0U;
import android.net.Uri;
import com.facebook.aura.utils.HatchUtil;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$6 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$6 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$6();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$6() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Uri uri) {
        return Boolean.valueOf(HatchUtil.INSTANCE.isRedeemInviteEnabled());
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
        return Boolean.valueOf(HatchUtil.INSTANCE.isRedeemInviteEnabled());
    }
}
