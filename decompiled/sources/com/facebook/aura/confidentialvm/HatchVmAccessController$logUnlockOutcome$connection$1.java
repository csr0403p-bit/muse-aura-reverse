package com.facebook.aura.confidentialvm;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C1BN;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$connection$1", f = "HatchVmAccessController.kt", l = {295}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchVmAccessController$logUnlockOutcome$connection$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchGatewayConnectionState>, Object> {
    public final /* synthetic */ int $firstCycle;
    public int label;
    public final /* synthetic */ HatchVmAccessController this$0;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$connection$1$1", f = "HatchVmAccessController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$connection$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HatchGatewayStateSnapshot, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ int $firstCycle;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ HatchVmAccessController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, HatchVmAccessController hatchVmAccessController, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$firstCycle = i;
            this.this$0 = hatchVmAccessController;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$firstCycle, this.this$0, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r2 = r3.L$0
                com.facebook.aura.gateway.HatchGatewayStateSnapshot r2 = (com.facebook.aura.gateway.HatchGatewayStateSnapshot) r2
                int r0 = r3.label
                if (r0 != 0) goto L22
                X.Hwg.A00(r4)
                int r1 = r2.connectionCycle
                int r0 = r3.$firstCycle
                if (r1 < r0) goto L1c
                com.facebook.aura.confidentialvm.HatchVmAccessController r1 = r3.this$0
                com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r2.connection
                boolean r1 = com.facebook.aura.confidentialvm.HatchVmAccessController.access$isFinished(r1, r0)
                r0 = 1
                if (r1 != 0) goto L1d
            L1c:
                r0 = 0
            L1d:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L22:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$connection$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(HatchGatewayStateSnapshot hatchGatewayStateSnapshot, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(hatchGatewayStateSnapshot, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmAccessController$logUnlockOutcome$connection$1(HatchVmAccessController hatchVmAccessController, int i, HtJ<? super HatchVmAccessController$logUnlockOutcome$connection$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchVmAccessController;
        this.$firstCycle = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVmAccessController$logUnlockOutcome$connection$1(this.this$0, this.$firstCycle, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchVmAccessController hatchVmAccessController = this.this$0;
            C1BN<HatchGatewayStateSnapshot> c1bn = hatchVmAccessController.gateway.gatewayState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$firstCycle, hatchVmAccessController, null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass1, c1bn);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return ((HatchGatewayStateSnapshot) obj).connection;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchGatewayConnectionState> htJ) {
        return ((HatchVmAccessController$logUnlockOutcome$connection$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
