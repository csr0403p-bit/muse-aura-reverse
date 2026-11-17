package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.app.Activity;

/* loaded from: classes2.dex */
public final class HatchVmRestartEffectKt$HatchVmRestartEffect$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ HatchVmRestartRequest $request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRestartEffectKt$HatchVmRestartEffect$2$1(HatchVmRestartRequest hatchVmRestartRequest, Activity activity) {
        super(1);
        this.$request = hatchVmRestartRequest;
        this.$activity = activity;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$request.restart(this.$activity);
        return new C78g() { // from class: com.facebook.aura.globaleffects.HatchVmRestartEffectKt$HatchVmRestartEffect$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
