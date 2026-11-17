package com.facebook.aura.nodes.snapshot;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C9sU;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.core.NodeWireJsonKt;
import com.facebook.aura.nodes.json.ClientInvokeResultParamsJson;
import com.facebook.aura.nodes.json.ClientInvokeResultParamsJson$$serializer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;

@DebugMetadata(c = "com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendInvokeResult$response$1", f = "HatchClientCapabilitiesProtocol.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchClientCapabilitiesProtocol$sendInvokeResult$response$1 extends AbstractC07127nr implements G0U<HtJ<? super JsonElement>, Object> {
    public final /* synthetic */ G0U<HtJ<? super ClientInvokeResultParamsJson>, Object> $params;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchClientCapabilitiesProtocol$sendInvokeResult$response$1(G0U<? super HtJ<? super ClientInvokeResultParamsJson>, ? extends Object> g0u, HtJ<? super HatchClientCapabilitiesProtocol$sendInvokeResult$response$1> htJ) {
        super(1, htJ);
        this.$params = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchClientCapabilitiesProtocol$sendInvokeResult$response$1(this.$params, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super JsonElement> htJ) {
        return new HatchClientCapabilitiesProtocol$sendInvokeResult$response$1(this.$params, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C9sU c9sU;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            c9sU = NodeWireJsonKt.NodeJson;
            G0U<HtJ<? super ClientInvokeResultParamsJson>, Object> g0u = this.$params;
            this.L$0 = c9sU;
            this.label = 1;
            obj = g0u.invoke(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            c9sU = (C9sU) this.L$0;
            Hwg.A00(obj);
        }
        return c9sU.A03(obj, ClientInvokeResultParamsJson$$serializer.INSTANCE);
    }
}
