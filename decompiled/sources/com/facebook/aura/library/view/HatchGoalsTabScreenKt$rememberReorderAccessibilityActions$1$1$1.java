package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$rememberReorderAccessibilityActions$1$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnPromote$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$rememberReorderAccessibilityActions$1$1$1(C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$currentOnPromote$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1BO<Function0<Unit>> c1bo = this.$currentOnPromote$delegate;
        float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
        Function0 function0A0A = C1BO.A0A(c1bo);
        if (function0A0A != null) {
            function0A0A.invoke();
        }
        return AnonymousClass001.A0i();
    }
}
