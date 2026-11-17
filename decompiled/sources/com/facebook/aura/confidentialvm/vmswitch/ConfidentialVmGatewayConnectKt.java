package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.BFI;
import X.C1BN;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.gateway.HatchCvmAuthenticationState;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class ConfidentialVmGatewayConnectKt {
    public static final Set<HatchCvmAuthenticationState> AUTO_RETRIED_CREDENTIAL_CHALLENGES = BFI.A0H(new HatchCvmAuthenticationState[]{HatchCvmAuthenticationState.RecoveryRequired.INSTANCE, HatchCvmAuthenticationState.EnrollmentRequired.INSTANCE});
    public static final Set<HatchCvmAuthenticationState> FAILED_AUTHENTICATION_STATES = BFI.A0H(new HatchCvmAuthenticationState[]{HatchCvmAuthenticationState.VerificationFailed.INSTANCE, HatchCvmAuthenticationState.Failed.INSTANCE});

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt", f = "ConfidentialVmGatewayConnect.kt", l = {27, 29}, m = "connectGatewayTo", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmGatewayConnectKt.connectGatewayTo(null, null, 0L, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$2", f = "ConfidentialVmGatewayConnect.kt", l = {30}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchGatewayStateSnapshot>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public final /* synthetic */ int $startedCycle;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$2$1", f = "ConfidentialVmGatewayConnect.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HatchGatewayStateSnapshot, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ int $startedCycle;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(int i, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$startedCycle = i;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$startedCycle, htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
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
                    if (r0 != 0) goto L1e
                    X.Hwg.A00(r4)
                    int r1 = r2.connectionCycle
                    int r0 = r3.$startedCycle
                    if (r1 < r0) goto L18
                    boolean r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt.isSettled(r2)
                    r0 = 1
                    if (r1 != 0) goto L19
                L18:
                    r0 = 0
                L19:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L1e:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(HatchGatewayStateSnapshot hatchGatewayStateSnapshot, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) create(hatchGatewayStateSnapshot, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchGatewayConnection hatchGatewayConnection, int i, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.$startedCycle = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$gateway, this.$startedCycle, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<HatchGatewayStateSnapshot> c1bn = this.$gateway.gatewayState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$startedCycle, null);
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
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchGatewayStateSnapshot> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object connectGatewayTo(X.AbstractC3358CGz r8, java.lang.String r9, long r10, X.HtJ<? super com.facebook.aura.gateway.HatchGatewayStateSnapshot> r12) {
        /*
            boolean r0 = r12 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt.AnonymousClass1
            if (r0 == 0) goto L25
            r4 = r12
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$1 r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L30
            if (r0 == r7) goto L59
            if (r0 != r5) goto L2b
            X.Hwg.A00(r1)
            return r1
        L25:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$1 r4 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$1
            r4.<init>(r12)
            goto L12
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = X.C3cG.A0D(r8)
            boolean r0 = r0.commitGatewayUrl(r9)
            if (r0 == 0) goto L84
            com.facebook.aura.confidentialvm.HatchVmAccessController$Companion r0 = com.facebook.aura.confidentialvm.HatchVmAccessController.Companion
            r0.getInstance(r8)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r0 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            com.facebook.aura.gateway.HatchGatewayConnection r6 = r0.getGateway(r8)
            r4.L$0 = r2
            r4.L$1 = r2
            r4.L$2 = r6
            r4.J$0 = r10
            r4.label = r7
            java.lang.Object r1 = r6.forceReconnectForCredential(r4)
            if (r1 != r3) goto L62
        L58:
            return r3
        L59:
            long r10 = r4.J$0
            java.lang.Object r6 = r4.L$2
            com.facebook.aura.gateway.HatchGatewayConnection r6 = (com.facebook.aura.gateway.HatchGatewayConnection) r6
            X.Hwg.A00(r1)
        L62:
            boolean r0 = r1 instanceof com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted
            if (r0 == 0) goto L84
            com.facebook.aura.gateway.connection.ConnectRequestResult$Accepted r1 = (com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted) r1
            if (r1 == 0) goto L84
            int r1 = r1.connectionCycle
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$2 r0 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt$connectGatewayTo$2
            r0.<init>(r6, r1, r2)
            r4.L$0 = r2
            r4.L$1 = r2
            r4.L$2 = r2
            r4.J$0 = r10
            r4.I$0 = r1
            r4.label = r5
            java.lang.Object r0 = X.GAX.A01(r4, r0, r10)
            if (r0 == r3) goto L58
            return r0
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmGatewayConnectKt.connectGatewayTo(X.CGz, java.lang.String, long, X.HtJ):java.lang.Object");
    }

    public static final boolean isSettled(HatchGatewayStateSnapshot hatchGatewayStateSnapshot) {
        if (AUTO_RETRIED_CREDENTIAL_CHALLENGES.contains(hatchGatewayStateSnapshot.authentication)) {
            return false;
        }
        HatchGatewayConnectionState hatchGatewayConnectionState = hatchGatewayStateSnapshot.connection;
        return (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected) || (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Error) || FAILED_AUTHENTICATION_STATES.contains(hatchGatewayStateSnapshot.authentication);
    }
}
