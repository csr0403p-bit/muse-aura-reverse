package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$5$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $autoStartConsumed$delegate;
    public final /* synthetic */ boolean $autoStartSetup;
    public final /* synthetic */ G0U<Boolean, Unit> $openPairingSheet;
    public final /* synthetic */ boolean $showHatchLinks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$5$1(boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$autoStartSetup = z;
        this.$showHatchLinks = z2;
        this.$openPairingSheet = g0u;
        this.$autoStartConsumed$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$autoStartSetup && !MutableState.A0A((MutableState) this.$autoStartConsumed$delegate) && this.$showHatchLinks) {
            MutableState.A09(true, this.$autoStartConsumed$delegate);
            AnonymousClass001.A1K(true, this.$openPairingSheet);
        }
        return new C78g() { // from class: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$5$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
