package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import X.G0V;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ActivationLoadingScreenKt$ActivationLoadingScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ G0V<String, String, Unit> $rageShakeHandler;
    public final /* synthetic */ AuraRageShakeManager $rageShakeManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivationLoadingScreenKt$ActivationLoadingScreen$1$1(AuraRageShakeManager auraRageShakeManager, G0V<? super String, ? super String, Unit> g0v) {
        super(1);
        this.$rageShakeManager = auraRageShakeManager;
        this.$rageShakeHandler = g0v;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$rageShakeManager.setFallbackHandler(this.$rageShakeHandler);
        final AuraRageShakeManager auraRageShakeManager = this.$rageShakeManager;
        final G0V<String, String, Unit> g0v = this.$rageShakeHandler;
        return new C78g() { // from class: com.facebook.aura.main.ActivationLoadingScreenKt$ActivationLoadingScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                auraRageShakeManager.clearFallbackHandler(g0v);
            }
        };
    }
}
