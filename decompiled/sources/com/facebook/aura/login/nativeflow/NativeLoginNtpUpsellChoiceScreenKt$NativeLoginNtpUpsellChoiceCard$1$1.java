package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginNtpUpsellChoiceScreenKt$NativeLoginNtpUpsellChoiceCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onRowClick;
    public final /* synthetic */ NtpUpsellChoiceRowUiState $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginNtpUpsellChoiceScreenKt$NativeLoginNtpUpsellChoiceCard$1$1(G0U<? super String, Unit> g0u, NtpUpsellChoiceRowUiState ntpUpsellChoiceRowUiState) {
        super(0);
        this.$onRowClick = g0u;
        this.$row = ntpUpsellChoiceRowUiState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onRowClick.invoke(this.$row.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
