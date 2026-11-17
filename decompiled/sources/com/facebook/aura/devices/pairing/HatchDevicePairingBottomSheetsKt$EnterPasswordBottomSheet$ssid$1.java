package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$ssid$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ boolean $dismissible;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onBack;
    public final /* synthetic */ HatchDevicePairingUiState $state;
    public final /* synthetic */ HatchDevicePairingStrings $strings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$ssid$1(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
        super(2);
        this.$state = hatchDevicePairingUiState;
        this.$actions = hatchDevicePairingActions;
        this.$strings = hatchDevicePairingStrings;
        this.$onBack = function0;
        this.$dismissible = z;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchDevicePairingBottomSheetsKt.EnterPasswordBottomSheet(this.$state, this.$actions, this.$strings, this.$onBack, this.$dismissible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
