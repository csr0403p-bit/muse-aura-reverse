package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.pairing.HatchDeviceBleManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectAndPrepare$outcome$3", f = "HatchDeviceBleManager.kt", l = {740}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchDeviceBleManager$connectAndPrepare$outcome$3 extends AbstractC07127nr implements G0V<Integer, HtJ<? super GattConnectOutcome>, Object> {
    public final /* synthetic */ HatchDeviceBleManager.ScannedDevice $device;
    public final /* synthetic */ C3UX $this_connectAndPrepare;
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ HatchDeviceBleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceBleManager$connectAndPrepare$outcome$3(HatchDeviceBleManager hatchDeviceBleManager, C3UX c3ux, HatchDeviceBleManager.ScannedDevice scannedDevice, HtJ<? super HatchDeviceBleManager$connectAndPrepare$outcome$3> htJ) {
        super(2, htJ);
        this.this$0 = hatchDeviceBleManager;
        this.$this_connectAndPrepare = c3ux;
        this.$device = scannedDevice;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchDeviceBleManager$connectAndPrepare$outcome$3 hatchDeviceBleManager$connectAndPrepare$outcome$3 = new HatchDeviceBleManager$connectAndPrepare$outcome$3(this.this$0, this.$this_connectAndPrepare, this.$device, htJ);
        hatchDeviceBleManager$connectAndPrepare$outcome$3.I$0 = AnonymousClass001.A0F(obj);
        return hatchDeviceBleManager$connectAndPrepare$outcome$3;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.I$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i2 = this.label;
        if (i2 == 0) {
            Hwg.A00(obj);
            if (i > 1) {
                HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
                int i3 = HatchDeviceBleManager.$stable;
                hatchDeviceBleManager.listener.onDebugLog(FGI.A0H("Connect attempt ", i));
            }
            HatchDeviceBleManager hatchDeviceBleManager2 = this.this$0;
            C3UX c3ux = this.$this_connectAndPrepare;
            HatchDeviceBleManager.ScannedDevice scannedDevice = this.$device;
            this.I$0 = i;
            this.label = 1;
            obj = hatchDeviceBleManager2.connectOnce(c3ux, scannedDevice, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i2 != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    public final Object invoke(int i, HtJ<? super GattConnectOutcome> htJ) {
        return ((HatchDeviceBleManager$connectAndPrepare$outcome$3) create(Integer.valueOf(i), htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(Integer num, HtJ<? super GattConnectOutcome> htJ) {
        return invoke(AnonymousClass001.A0F(num), htJ);
    }
}
