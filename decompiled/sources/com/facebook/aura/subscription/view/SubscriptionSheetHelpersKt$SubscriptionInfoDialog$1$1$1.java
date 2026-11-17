package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SubscriptionSheetHelpersKt$SubscriptionInfoDialog$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $buttonLabel;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onDismissLogged;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        String str = this.$buttonLabel;
        Function0<Unit> function0 = this.$onDismissLogged;
        if (function0 == null) {
            function0 = this.$onDismiss;
        }
        AnonymousClass007.A18(auraButtonGroupScope, str, function0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionSheetHelpersKt$SubscriptionInfoDialog$1$1$1(String str, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$buttonLabel = str;
        this.$onDismissLogged = function0;
        this.$onDismiss = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
