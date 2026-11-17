package com.facebook.aura.toast;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchToastHostKt$HatchToastHostOverlay$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchToastHostKt$HatchToastHostOverlay$host$1$1 $host;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchToastHostKt$HatchToastHostOverlay$2$1(HatchToastHostKt$HatchToastHostOverlay$host$1$1 hatchToastHostKt$HatchToastHostOverlay$host$1$1) {
        super(1);
        this.$host = hatchToastHostKt$HatchToastHostOverlay$host$1$1;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchToastHostRegistry.INSTANCE.register(this.$host);
        final HatchToastHostKt$HatchToastHostOverlay$host$1$1 hatchToastHostKt$HatchToastHostOverlay$host$1$1 = this.$host;
        return new C78g() { // from class: com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                HatchToastHostRegistry.INSTANCE.unregister(hatchToastHostKt$HatchToastHostOverlay$host$1$1);
            }
        };
    }
}
