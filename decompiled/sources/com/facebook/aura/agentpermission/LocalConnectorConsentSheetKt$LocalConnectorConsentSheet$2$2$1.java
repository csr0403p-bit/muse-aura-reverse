package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$2$2$1(AuraNavigator auraNavigator, Context context) {
        super(0);
        this.$navigator = auraNavigator;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0 = LocalConnectorConsentHandshake.onAccept;
        LocalConnectorConsentHandshake.onAccept = null;
        this.$navigator.back();
        if (function0 != null) {
            function0.invoke();
        } else {
            HatchPermissionUtils.INSTANCE.openAppSettings(this.$context);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
