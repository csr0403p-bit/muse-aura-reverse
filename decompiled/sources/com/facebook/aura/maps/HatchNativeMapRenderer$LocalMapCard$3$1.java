package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchFullscreenMapScreenKey;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchNativeMapRenderer$LocalMapCard$3$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ String $instanceId;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$navigator.navigate((AuraNavKey) new HatchFullscreenMapScreenKey(this.$instanceId, str, true), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNativeMapRenderer$LocalMapCard$3$1(AuraNavigator auraNavigator, String str) {
        super(1);
        this.$navigator = auraNavigator;
        this.$instanceId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
