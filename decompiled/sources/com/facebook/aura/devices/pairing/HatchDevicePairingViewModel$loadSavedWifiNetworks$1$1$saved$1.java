package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1", f = "HatchDevicePairingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Map<String, ? extends String>>, Object> {
    public final /* synthetic */ Function0<Map<String, String>> $read;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1(Function0<? extends Map<String, String>> function0, HtJ<? super HatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1> htJ) {
        super(2, htJ);
        this.$read = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1(this.$read, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super Map<String, String>> htJ) {
        return new HatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1(this.$read, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return this.$read.invoke();
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Map<String, ? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super Map<String, String>>) htJ);
    }
}
