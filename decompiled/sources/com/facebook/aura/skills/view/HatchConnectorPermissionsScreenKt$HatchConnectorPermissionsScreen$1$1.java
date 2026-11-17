package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import androidx.compose.runtime.MutableState;

/* loaded from: classes3.dex */
public final class HatchConnectorPermissionsScreenKt$HatchConnectorPermissionsScreen$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ MutableState<Integer> $localConnectorRefreshNonce$delegate;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        MutableState.A07(MutableState.A02((MutableState) this.$localConnectorRefreshNonce$delegate) + 1, this.$localConnectorRefreshNonce$delegate);
        return new InterfaceC06807bD() { // from class: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$HatchConnectorPermissionsScreen$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorPermissionsScreenKt$HatchConnectorPermissionsScreen$1$1(MutableState<Integer> mutableState) {
        super(1);
        this.$localConnectorRefreshNonce$delegate = mutableState;
    }
}
