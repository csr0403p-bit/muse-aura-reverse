package com.facebook.aura.main;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.deeplink.HatchIntentViewModel;

/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$HatchActiveSessionHost$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchIntentViewModel $intentViewModel;
    public final /* synthetic */ AbstractC3358CGz $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActiveSessionHostKt$HatchActiveSessionHost$3$1(HatchIntentViewModel hatchIntentViewModel, AbstractC3358CGz abstractC3358CGz) {
        super(1);
        this.$intentViewModel = hatchIntentViewModel;
        this.$session = abstractC3358CGz;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$intentViewModel.onSessionActivated(this.$session);
        return new C78g() { // from class: com.facebook.aura.main.HatchActiveSessionHostKt$HatchActiveSessionHost$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
