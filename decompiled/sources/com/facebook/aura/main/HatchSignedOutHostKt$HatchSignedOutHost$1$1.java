package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes4.dex */
public final class HatchSignedOutHostKt$HatchSignedOutHost$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isInteractive;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AuraRageShakeManager $rageShakeManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSignedOutHostKt$HatchSignedOutHost$1$1(boolean z, AuraRageShakeManager auraRageShakeManager, AuraNavigator auraNavigator) {
        super(1);
        this.$isInteractive = z;
        this.$rageShakeManager = auraRageShakeManager;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isInteractive) {
            this.$rageShakeManager.setNavigator(this.$navigator);
        }
        final AuraRageShakeManager auraRageShakeManager = this.$rageShakeManager;
        final AuraNavigator auraNavigator = this.$navigator;
        return new C78g() { // from class: com.facebook.aura.main.HatchSignedOutHostKt$HatchSignedOutHost$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                auraRageShakeManager.clearNavigator(auraNavigator);
            }
        };
    }
}
