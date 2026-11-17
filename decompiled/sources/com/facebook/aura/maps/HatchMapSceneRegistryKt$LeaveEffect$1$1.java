package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMapSceneRegistryKt$LeaveEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentLeave$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapSceneRegistryKt$LeaveEffect$1$1(C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$currentLeave$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO.A0D(this.$currentLeave$delegate);
        return new C78g() { // from class: com.facebook.aura.maps.HatchMapSceneRegistryKt$LeaveEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
