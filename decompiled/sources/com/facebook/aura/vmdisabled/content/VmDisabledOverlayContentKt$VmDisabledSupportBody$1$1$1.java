package com.facebook.aura.vmdisabled.content;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ContactSupportScreenKey;
import com.facebook.aura.perf.HatchActivationQplLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VmDisabledOverlayContentKt$VmDisabledSupportBody$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmDisabledOverlayContentKt$VmDisabledSupportBody$1$1$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchActivationQplLogger.INSTANCE.pointFlow("vm_disconnected_support_ticket_opened");
        this.$navigator.navigate((AuraNavKey) ContactSupportScreenKey.INSTANCE, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
