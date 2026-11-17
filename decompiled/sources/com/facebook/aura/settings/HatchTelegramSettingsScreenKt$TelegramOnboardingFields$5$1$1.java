package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.ApQ;
import X.Au3;
import X.C0fG;
import X.C1805ArO;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTelegramSettingsScreenKt$TelegramOnboardingFields$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0fG $clipboardManager;
    public final /* synthetic */ G0U<C1805ArO, Unit> $onTokenChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTelegramSettingsScreenKt$TelegramOnboardingFields$5$1$1(C0fG c0fG, G0U<? super C1805ArO, Unit> g0u) {
        super(0);
        this.$clipboardManager = c0fG;
        this.$onTokenChange = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        ApQ apQALZ = this.$clipboardManager.ALZ();
        if (apQALZ == null || (str = apQALZ.A00) == null) {
            return;
        }
        this.$onTokenChange.invoke(new C1805ArO(str, Au3.A01));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
