package com.facebook.aura.ui;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7Bq;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$5$1", f = "HatchSetupAnimationHost.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSetupAnimationHostKt$HatchSetupAnimationHost$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isAvailable;
    public final /* synthetic */ C1BO<Boolean> $isFinishing$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSetupAnimationHostKt$HatchSetupAnimationHost$5$1(boolean z, C1BO<Boolean> c1bo, HtJ<? super HatchSetupAnimationHostKt$HatchSetupAnimationHost$5$1> htJ) {
        super(2, htJ);
        this.$isAvailable = z;
        this.$isFinishing$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSetupAnimationHostKt$HatchSetupAnimationHost$5$1(this.$isAvailable, this.$isFinishing$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (C1BO.A0F(this.$isFinishing$delegate) && this.$isAvailable) {
                this.label = 1;
                if (C7Bq.A01(1500L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        CFK.A06(HatchSetupAnimationHostKt.TAG, "Setup surface still mounted after finish(); restoring the animation");
        HatchSetupAnimationState.INSTANCE.cancelFinish$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSetupAnimationHostKt$HatchSetupAnimationHost$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
