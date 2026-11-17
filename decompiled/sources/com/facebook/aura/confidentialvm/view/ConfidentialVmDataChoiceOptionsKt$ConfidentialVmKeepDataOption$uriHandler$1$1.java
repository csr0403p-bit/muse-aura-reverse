package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmDataChoiceOptionsKt$ConfidentialVmKeepDataOption$uriHandler$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Function0<Unit> $onLearnMoreClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDataChoiceOptionsKt$ConfidentialVmKeepDataOption$uriHandler$1$1(Function0<Unit> function0) {
        super(1);
        this.$onLearnMoreClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        this.$onLearnMoreClick.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        this.$onLearnMoreClick.invoke();
    }
}
