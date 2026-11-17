package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1497Ak4;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$DeviceActionOverlay$1$2$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ MutableState<Integer> $containerHeightPx$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 0);
        MutableState.A07(AnonymousClass002.A09(interfaceC1497Ak4.AKd()), this.$containerHeightPx$delegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$DeviceActionOverlay$1$2$1(MutableState<Integer> mutableState) {
        super(1);
        this.$containerHeightPx$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
