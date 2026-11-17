package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.CheckoutLodgingPolicySheetKt$CheckoutLodgingPolicySheet$1$1", f = "CheckoutLodgingPolicySheet.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class CheckoutLodgingPolicySheetKt$CheckoutLodgingPolicySheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $available;
    public final /* synthetic */ AuraNavigator $navigator;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutLodgingPolicySheetKt$CheckoutLodgingPolicySheet$1$1(boolean z, AuraNavigator auraNavigator, HtJ<? super CheckoutLodgingPolicySheetKt$CheckoutLodgingPolicySheet$1$1> htJ) {
        super(2, htJ);
        this.$available = z;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new CheckoutLodgingPolicySheetKt$CheckoutLodgingPolicySheet$1$1(this.$available, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!this.$available) {
            this.$navigator.back();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((CheckoutLodgingPolicySheetKt$CheckoutLodgingPolicySheet$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
