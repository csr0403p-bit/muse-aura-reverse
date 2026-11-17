package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.CFK;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchVmAccessHostKt$HatchVmAccessHost$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $gateForLog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmAccessHostKt$HatchVmAccessHost$1$1(String str) {
        super(1);
        this.$gateForLog = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        CFK.A03(this.$gateForLog, HatchVmAccessHostKt.TAG, "VM access gate: %s");
        return new C78g() { // from class: com.facebook.aura.main.HatchVmAccessHostKt$HatchVmAccessHost$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
