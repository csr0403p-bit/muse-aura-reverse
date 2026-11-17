package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Function0<Unit> $onRefresh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$1$1(Function0<Unit> function0) {
        super(1);
        this.$onRefresh = function0;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$onRefresh.invoke();
        return new C78g() { // from class: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
