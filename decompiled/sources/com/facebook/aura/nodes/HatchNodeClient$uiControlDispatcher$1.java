package com.facebook.aura.nodes;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.json.ClientInvokeResultParamsJson;
import com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$uiControlDispatcher$1", f = "HatchNodeClient.kt", l = {376}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchNodeClient$uiControlDispatcher$1 extends AbstractC07127nr implements G0V<ClientInvokeResultParamsJson, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HatchNodeClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$uiControlDispatcher$1(HatchNodeClient hatchNodeClient, HtJ<? super HatchNodeClient$uiControlDispatcher$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchNodeClient;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchNodeClient$uiControlDispatcher$1 hatchNodeClient$uiControlDispatcher$1 = new HatchNodeClient$uiControlDispatcher$1(this.this$0, htJ);
        hatchNodeClient$uiControlDispatcher$1.L$0 = obj;
        return hatchNodeClient$uiControlDispatcher$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean zA1X;
        ClientInvokeResultParamsJson clientInvokeResultParamsJson = (ClientInvokeResultParamsJson) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchClientCapabilitiesProtocol hatchClientCapabilitiesProtocol = this.this$0.protocol;
            if (hatchClientCapabilitiesProtocol == null) {
                CFK.A06(HatchNodeClientKt.TAG, "ui.* reply: gateway not attached, dropping reply");
                zA1X = false;
                return Boolean.valueOf(zA1X);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = hatchClientCapabilitiesProtocol.sendInvokeResult(clientInvokeResultParamsJson, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        zA1X = AnonymousClass001.A1X(obj);
        return Boolean.valueOf(zA1X);
    }

    @Override // X.G0V
    public final Object invoke(ClientInvokeResultParamsJson clientInvokeResultParamsJson, HtJ<? super Boolean> htJ) {
        return ((HatchNodeClient$uiControlDispatcher$1) create(clientInvokeResultParamsJson, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
