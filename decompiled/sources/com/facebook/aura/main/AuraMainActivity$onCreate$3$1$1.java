package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.auth.AuraSessionManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraMainActivity$onCreate$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<AuraSessionManager.SessionState> $sessionState$delegate;
    public final /* synthetic */ AuraMainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraMainActivity$onCreate$3$1$1(AuraMainActivity auraMainActivity, C1BO<? extends AuraSessionManager.SessionState> c1bo) {
        super(0);
        this.this$0 = auraMainActivity;
        this.$sessionState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if ((this.$sessionState$delegate.getValue() instanceof AuraSessionManager.SessionState.Activating) || (this.$sessionState$delegate.getValue() instanceof AuraSessionManager.SessionState.Active)) {
            AuraMainActivity auraMainActivity = this.this$0;
            int i = AuraMainActivity.$stable;
            auraMainActivity.isColdStart = false;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
