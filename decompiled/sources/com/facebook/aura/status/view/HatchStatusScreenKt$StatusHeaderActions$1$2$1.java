package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$StatusHeaderActions$1$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$onDismissRequest.invoke();
        HatchStatusScreenKt.prefillPromptInComposer(str, this.$navigator);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$StatusHeaderActions$1$2$1(Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(1);
        this.$onDismissRequest = function0;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
