package com.facebook.aura.main;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$HatchActiveSessionHost$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavKey $initialKey;
    public final /* synthetic */ HatchIntentViewModel $intentViewModel;
    public final /* synthetic */ boolean $isActivationEnabled;
    public final /* synthetic */ AbstractC3358CGz $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActiveSessionHostKt$HatchActiveSessionHost$2$1(HatchIntentViewModel hatchIntentViewModel, boolean z, AbstractC3358CGz abstractC3358CGz, AuraNavKey auraNavKey) {
        super(1);
        this.$intentViewModel = hatchIntentViewModel;
        this.$isActivationEnabled = z;
        this.$session = abstractC3358CGz;
        this.$initialKey = auraNavKey;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchIntentViewModel.PendingDeeplink value = this.$intentViewModel.pendingDeeplink.getValue();
        if (!this.$isActivationEnabled && !(value instanceof HatchIntentViewModel.PendingDeeplink.Navigation)) {
            HatchActiveSessionHostKt.maybeStartRootNavigationTrace(this.$session, this.$initialKey, false);
        }
        return new C78g() { // from class: com.facebook.aura.main.HatchActiveSessionHostKt$HatchActiveSessionHost$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
