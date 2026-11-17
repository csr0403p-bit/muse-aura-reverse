package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSettingsScreenKt$EmailDeleteMailboxSection$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $deleted;
    public final /* synthetic */ String $failed;
    public final /* synthetic */ G0V<String, String, Unit> $onDelete;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailSettingsScreenKt$EmailDeleteMailboxSection$2$1(G0V<? super String, ? super String, Unit> g0v, String str, String str2) {
        super(0);
        this.$onDelete = g0v;
        this.$deleted = str;
        this.$failed = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDelete.invoke(this.$deleted, this.$failed);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
