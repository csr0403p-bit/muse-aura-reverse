package com.facebook.aura.checkpoint.probe;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.checkpoint.probe.HatchCheckpointGate$runProbe$flight$1", f = "HatchCheckpointGate.kt", l = {R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchCheckpointGate$runProbe$flight$1 extends AbstractC07127nr implements G0U<HtJ<? super HatchCheckpointProbeStatus>, Object> {
    public int label;
    public final /* synthetic */ HatchCheckpointGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCheckpointGate$runProbe$flight$1(HatchCheckpointGate hatchCheckpointGate, HtJ<? super HatchCheckpointGate$runProbe$flight$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchCheckpointGate;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchCheckpointGate$runProbe$flight$1(this.this$0, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super HatchCheckpointProbeStatus> htJ) {
        return new HatchCheckpointGate$runProbe$flight$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchCheckpointProbe hatchCheckpointProbe = HatchCheckpointProbe.INSTANCE;
            this.label = 1;
            obj = hatchCheckpointProbe.probe(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        HatchCheckpointProbeResult hatchCheckpointProbeResult = (HatchCheckpointProbeResult) obj;
        this.this$0.apply(hatchCheckpointProbeResult);
        return hatchCheckpointProbeResult.status;
    }
}
