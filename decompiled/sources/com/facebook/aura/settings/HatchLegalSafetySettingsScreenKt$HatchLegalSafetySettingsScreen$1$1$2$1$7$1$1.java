package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$7$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;
    public final /* synthetic */ String $supplementalPrivacyTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$7$1$1(String str, G0V<? super String, ? super String, Unit> g0v) {
        super(0);
        this.$supplementalPrivacyTitle = str;
        this.$onOpenLegalPage = g0v;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchLegalSafetySettingsScreenKt.AnonymousClass1.invoke_i1RSzL4$openLegalPage(this.$onOpenLegalPage, AuraExternalUriRegistry.INSTANCE.getSupplementalPrivacyPolicyUri(), this.$supplementalPrivacyTitle);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
