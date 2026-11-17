package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel;

/* loaded from: classes.dex */
public final class HatchConnectorPermissionsListScreenKt$rememberConnectorPermissionEntries$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ HatchConnectedConnectorsViewModel $connectorsViewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        this.$connectorsViewModel.onResume();
        final HatchConnectedConnectorsViewModel hatchConnectedConnectorsViewModel = this.$connectorsViewModel;
        return new InterfaceC06807bD() { // from class: com.facebook.aura.skills.view.HatchConnectorPermissionsListScreenKt$rememberConnectorPermissionEntries$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                hatchConnectedConnectorsViewModel.onPause();
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorPermissionsListScreenKt$rememberConnectorPermissionEntries$1$1(HatchConnectedConnectorsViewModel hatchConnectedConnectorsViewModel) {
        super(1);
        this.$connectorsViewModel = hatchConnectedConnectorsViewModel;
    }
}
