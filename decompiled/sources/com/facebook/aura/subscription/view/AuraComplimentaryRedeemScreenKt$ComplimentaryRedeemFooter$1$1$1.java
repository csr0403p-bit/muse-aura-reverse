package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.subscription.repo.ComplimentaryRedeemPage;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemFooter$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isRedeeming;
    public final /* synthetic */ Function0<Unit> $onRedeem;
    public final /* synthetic */ ComplimentaryRedeemPage $page;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        String str = this.$page.redeemLabel;
        boolean z = this.$isRedeeming;
        auraButtonGroupScope.primaryButton(str, (Drawable) null, !z, z, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, this.$onRedeem, (String) null, Integer.MAX_VALUE, BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemFooter$1$1$1(ComplimentaryRedeemPage complimentaryRedeemPage, boolean z, Function0<Unit> function0) {
        super(1);
        this.$page = complimentaryRedeemPage;
        this.$isRedeeming = z;
        this.$onRedeem = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
