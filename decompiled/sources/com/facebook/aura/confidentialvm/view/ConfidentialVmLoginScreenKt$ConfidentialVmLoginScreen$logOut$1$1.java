package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.logout.AuraLogoutHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$logOut$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public static final ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$logOut$1$1 INSTANCE = new ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$logOut$1$1();

    public ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$logOut$1$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        AuraLogoutHelper.INSTANCE.performLogout();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraLogoutHelper.INSTANCE.performLogout();
    }
}
