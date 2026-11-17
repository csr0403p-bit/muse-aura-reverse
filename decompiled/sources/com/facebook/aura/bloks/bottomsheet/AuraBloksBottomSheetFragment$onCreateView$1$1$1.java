package com.facebook.aura.bloks.bottomsheet;

import X.AbstractC7559F3s;
import X.AbstractC8571FgQ;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraBloksBottomSheetFragment$onCreateView$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraBloksBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBloksBottomSheetFragment$onCreateView$1$1$1(AuraBloksBottomSheetFragment auraBloksBottomSheetFragment) {
        super(0);
        this.this$0 = auraBloksBottomSheetFragment;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AbstractC8571FgQ supportFragmentManager;
        FragmentActivity activity = this.this$0.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.A0d();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
