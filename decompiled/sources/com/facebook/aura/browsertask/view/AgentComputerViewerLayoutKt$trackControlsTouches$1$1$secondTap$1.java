package com.facebook.aura.browsertask.view;

import X.AbstractC07117nq;
import X.AnonymousClass001;
import X.C1299Agk;
import X.EnumC10460Hji;
import X.EnumC1080AXj;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1074AXb;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1", f = "AgentComputerViewerLayout.kt", l = {276}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super C1299Agk>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1(HtJ<? super AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1 agentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1 = new AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1(htJ);
        agentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1.L$0 = obj;
        return agentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            EnumC1080AXj enumC1080AXj = EnumC1080AXj.A03;
            this.L$0 = null;
            this.label = 1;
            obj = TapGestureDetectorKt.A04(interfaceC1074AXb, enumC1080AXj, this, false);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super C1299Agk> htJ) {
        AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1 agentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1 = new AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1(htJ);
        agentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1.L$0 = interfaceC1074AXb;
        return agentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1.invokeSuspend(Unit.INSTANCE);
    }
}
