package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C1BN;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.user.provider.AuraUserData;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1", f = "HatchGatewayConnection.kt", l = {761}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ C1BN<AuraUserData> $userData;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1$1", f = "HatchGatewayConnection.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<AuraUserData, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r1 = r2.L$0
                com.facebook.aura.user.provider.AuraUserData r1 = (com.facebook.aura.user.provider.AuraUserData) r1
                int r0 = r2.label
                if (r0 != 0) goto L18
                X.Hwg.A00(r3)
                if (r1 == 0) goto L12
                java.lang.Boolean r1 = r1.hasProvisionedVm
                r0 = 1
                if (r1 != 0) goto L13
            L12:
                r0 = 0
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L18:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(AuraUserData auraUserData, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = auraUserData;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1(C1BN<AuraUserData> c1bn, HtJ<? super HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1> htJ) {
        super(2, htJ);
        this.$userData = c1bn;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1(this.$userData, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1BN<AuraUserData> c1bn = this.$userData;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
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
        AuraUserData auraUserData = (AuraUserData) obj;
        if (auraUserData != null) {
            return auraUserData.hasProvisionedVm;
        }
        return null;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1(this.$userData, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
