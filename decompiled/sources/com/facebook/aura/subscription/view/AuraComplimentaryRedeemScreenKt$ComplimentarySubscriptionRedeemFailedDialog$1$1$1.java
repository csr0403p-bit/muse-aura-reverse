package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraComplimentaryRedeemScreenKt$ComplimentarySubscriptionRedeemFailedDialog$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        auraButtonGroupScope.primaryButton(R.string._name_removed__res_0x7f120233, (Object[]) null, (Drawable) null, true, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, this.$onDismiss, (String) null, (BRg) BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraComplimentaryRedeemScreenKt$ComplimentarySubscriptionRedeemFailedDialog$1$1$1(Function0<Unit> function0) {
        super(1);
        this.$onDismiss = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
