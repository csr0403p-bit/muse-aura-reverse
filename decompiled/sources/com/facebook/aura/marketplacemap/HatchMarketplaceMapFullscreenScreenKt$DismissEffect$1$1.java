package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapFullscreenScreenKt$DismissEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMarketplaceMapFullscreenScreenKt$DismissEffect$1$1(C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$currentOnDismiss$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO.A0D(this.$currentOnDismiss$delegate);
        return new C78g() { // from class: com.facebook.aura.marketplacemap.HatchMarketplaceMapFullscreenScreenKt$DismissEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
