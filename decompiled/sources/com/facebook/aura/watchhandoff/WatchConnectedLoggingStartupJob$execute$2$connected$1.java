package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AbstractC3001Brc;
import X.AbstractC4267Crq;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C4179Cop;
import X.C4276Cs4;
import X.C4278Cs8;
import X.C7384Etj;
import X.CSA;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC3641Caw;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchConnectedLoggingStartupJob$execute$2$connected$1", f = "WatchConnectedLoggingStartupJob.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class WatchConnectedLoggingStartupJob$execute$2$connected$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public int label;

    public WatchConnectedLoggingStartupJob$execute$2$connected$1(HtJ<? super WatchConnectedLoggingStartupJob$execute$2$connected$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WatchConnectedLoggingStartupJob$execute$2$connected$1(htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new WatchConnectedLoggingStartupJob$execute$2$connected$1(htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            CSA<List<InterfaceC3641Caw>> csaA05 = new C4179Cop(C3cG.A06(), C4278Cs8.A00, AbstractC4267Crq.A00, C4276Cs4.A02).A05();
            this.label = 1;
            obj = AbstractC3001Brc.A00(csaA05, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        C7384Etj.A0W(obj);
        return Boolean.valueOf(!((Collection) obj).isEmpty());
    }
}
