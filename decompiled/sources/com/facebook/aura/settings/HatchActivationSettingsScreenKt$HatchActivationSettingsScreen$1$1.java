package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentOnSettingsVisibilityChanged$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$1$1(C1BO<? extends G0U<? super Boolean, Unit>> c1bo) {
        super(1);
        this.$currentOnSettingsVisibilityChanged$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        G0U g0uA0B = C1BO.A0B(this.$currentOnSettingsVisibilityChanged$delegate);
        if (g0uA0B != null) {
            AnonymousClass001.A1K(true, g0uA0B);
        }
        final C1BO<G0U<Boolean, Unit>> c1bo = this.$currentOnSettingsVisibilityChanged$delegate;
        return new C78g() { // from class: com.facebook.aura.settings.HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                G0U g0uA0B2 = C1BO.A0B(c1bo);
                if (g0uA0B2 != null) {
                    AnonymousClass001.A1K(false, g0uA0B2);
                }
            }
        };
    }
}
