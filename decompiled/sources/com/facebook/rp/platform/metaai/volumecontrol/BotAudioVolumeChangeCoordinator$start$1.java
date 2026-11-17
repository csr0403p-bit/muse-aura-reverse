package com.facebook.rp.platform.metaai.volumecontrol;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10563Htj;
import X.C3UX;
import X.C3cH;
import X.C57l;
import X.C57m;
import X.G0W;
import X.GQK;
import X.GQN;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC05673vm;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.volumecontrol.BotAudioVolumeChangeCoordinator$start$1", f = "BotAudioVolumeChangeCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class BotAudioVolumeChangeCoordinator$start$1 extends AbstractC07127nr implements G0W<InterfaceC05673vm, C10563Htj, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ GQN this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotAudioVolumeChangeCoordinator$start$1(GQN gqn, HtJ<? super BotAudioVolumeChangeCoordinator$start$1> htJ) {
        super(3, htJ);
        this.this$0 = gqn;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC05673vm interfaceC05673vm, C10563Htj c10563Htj, HtJ<? super Unit> htJ) {
        BotAudioVolumeChangeCoordinator$start$1 botAudioVolumeChangeCoordinator$start$1 = new BotAudioVolumeChangeCoordinator$start$1(this.this$0, htJ);
        botAudioVolumeChangeCoordinator$start$1.L$0 = interfaceC05673vm;
        botAudioVolumeChangeCoordinator$start$1.L$1 = c10563Htj;
        return botAudioVolumeChangeCoordinator$start$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C57m c57m;
        Object obj2 = this.L$0;
        C10563Htj c10563Htj = (C10563Htj) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        boolean z = true;
        if (obj2 instanceof C57l) {
            Hxb.A03(null, (C3UX) this.this$0.A03.getValue());
        } else if (c10563Htj != null) {
            boolean zA1R = C3cH.A1R(((GQK) ((MetaAiRsysSdkRealTimeSession) this.this$0.A02).A0S.getValue()).A07);
            if (c10563Htj.A00 && zA1R) {
                c57m = this.this$0.A02;
                z = false;
            } else if (c10563Htj.A01 && !zA1R) {
                c57m = this.this$0.A02;
            }
            c57m.Acv(z);
        }
        return Unit.INSTANCE;
    }
}
