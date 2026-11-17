package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressContent$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isFailed;
    public final /* synthetic */ G0U<Boolean, Unit> $onShown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressContent$1$1(G0U<? super Boolean, Unit> g0u, boolean z) {
        super(1);
        this.$onShown = g0u;
        this.$isFailed = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AnonymousClass001.A1K(this.$isFailed, this.$onShown);
        return new C78g() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressContent$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
