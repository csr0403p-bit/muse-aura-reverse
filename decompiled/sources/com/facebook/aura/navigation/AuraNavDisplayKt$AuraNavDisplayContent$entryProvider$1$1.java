package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.BRL;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class AuraNavDisplayKt$AuraNavDisplayContent$entryProvider$1$1 extends AbstractC7559F3s implements G0U<AuraNavKey, BRL<AuraNavKey>> {
    public final /* synthetic */ G0U<AuraNavKey, BRL<AuraNavKey>> $provider;

    @Override // X.G0U
    public final BRL<AuraNavKey> invoke(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return AuraPageSceneStrategyKt.withAuraNavKey(this.$provider.invoke(auraNavKey), auraNavKey);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraNavDisplayKt$AuraNavDisplayContent$entryProvider$1$1(G0U<? super AuraNavKey, BRL<AuraNavKey>> g0u) {
        super(1);
        this.$provider = g0u;
    }
}
