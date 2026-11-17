package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailComponentsKt$EmailSettingsPage$5$3$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<EmailViewModel, Unit> $it;
    public final /* synthetic */ EmailViewModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailComponentsKt$EmailSettingsPage$5$3$2$1$1$1(G0U<? super EmailViewModel, Unit> g0u, EmailViewModel emailViewModel) {
        super(0);
        this.$it = g0u;
        this.$model = emailViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$it.invoke(this.$model);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
