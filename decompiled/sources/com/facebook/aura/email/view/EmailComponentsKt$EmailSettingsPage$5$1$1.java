package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailComponentsKt$EmailSettingsPage$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $busy;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ G0U<EmailViewModel, Unit> $onBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailComponentsKt$EmailSettingsPage$5$1$1(boolean z, G0U<? super EmailViewModel, Unit> g0u, EmailViewModel emailViewModel) {
        super(0);
        this.$busy = z;
        this.$onBack = g0u;
        this.$model = emailViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<EmailViewModel, Unit> g0u;
        if (this.$busy || (g0u = this.$onBack) == null) {
            return;
        }
        g0u.invoke(this.$model);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
