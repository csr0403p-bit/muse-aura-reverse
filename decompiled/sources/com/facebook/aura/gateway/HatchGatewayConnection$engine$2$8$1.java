package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.connection.ConnectionEngine;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$engine$2$8$1", f = "HatchGatewayConnection.kt", l = {450}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGatewayConnection$engine$2$8$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ConnectionEngine $eng;
    public int label;
    public final /* synthetic */ HatchGatewayConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$engine$2$8$1(HatchGatewayConnection hatchGatewayConnection, ConnectionEngine connectionEngine, HtJ<? super HatchGatewayConnection$engine$2$8$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGatewayConnection;
        this.$eng = connectionEngine;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$engine$2$8$1(this.this$0, this.$eng, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final HatchGatewayConnection hatchGatewayConnection = this.this$0;
            C1BN<Boolean> c1bn = hatchGatewayConnection.vmDisabledStore.isVmDisabled;
            final ConnectionEngine connectionEngine = this.$eng;
            C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchGatewayConnection$engine$2$8$1.1
                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    if (z && hatchGatewayConnection.isVmDisabled()) {
                        connectionEngine.disconnect();
                        HatchGatewayPreconnect.INSTANCE.cancelParkedGatewayTransport(hatchGatewayConnection.userSession);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c1bn.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGatewayConnection$engine$2$8$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
