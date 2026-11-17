package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.intf.DeviceCallStateTracker;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$startSession$audioReleased$1", f = "HatchRealTimeSessionController.kt", l = {484}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$startSession$audioReleased$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public int label;

    public HatchRealTimeSessionController$startSession$audioReleased$1(HtJ<? super HatchRealTimeSessionController$startSession$audioReleased$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchRealTimeSessionController$startSession$audioReleased$1(htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HatchRealTimeSessionController$startSession$audioReleased$1(htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            DeviceCallStateTracker deviceCallStateTracker = DeviceCallStateTracker.INSTANCE;
            this.label = 1;
            if (deviceCallStateTracker.awaitAudioModeReleased(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return true;
    }
}
