package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.email.model.EmailRestrictionAction;
import com.facebook.aura.email.model.EmailRestrictionActionKind;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailRestrictionCardKt$EmailRestrictionCard$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmailRestrictionAction $action;
    public final /* synthetic */ G0U<EmailRestrictionActionKind, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailRestrictionCardKt$EmailRestrictionCard$1$2$1(G0U<? super EmailRestrictionActionKind, Unit> g0u, EmailRestrictionAction emailRestrictionAction) {
        super(0);
        this.$onAction = g0u;
        this.$action = emailRestrictionAction;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAction.invoke(this.$action.kind);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
