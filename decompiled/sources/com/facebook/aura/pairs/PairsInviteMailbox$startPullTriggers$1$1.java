package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1", f = "PairsInviteMailbox.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsInviteMailbox$startPullTriggers$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ PairsInviteMailbox this$0;

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1$1", f = "PairsInviteMailbox.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<Boolean, HatchGatewayConnectionState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
        }

        public final Object invoke(boolean z, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.Z$0 = z;
            anonymousClass1.L$0 = hatchGatewayConnectionState;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r2 = r3.Z$0
                java.lang.Object r1 = r3.L$0
                int r0 = r3.label
                if (r0 != 0) goto L18
                X.Hwg.A00(r4)
                if (r2 == 0) goto L12
                boolean r1 = r1 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), hatchGatewayConnectionState, htJ);
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ PairsInviteMailbox this$0;

        public AnonymousClass2(PairsInviteMailbox pairsInviteMailbox) {
            this.this$0 = pairsInviteMailbox;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(boolean r6, X.HtJ<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1$2$emit$1
                if (r0 == 0) goto L1e
                r4 = r7
                com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1$2$emit$1 r4 = (com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1$2$emit$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L1e
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r3 = r4.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L2d
                if (r0 != r1) goto L28
                goto L24
            L1e:
                com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1$2$emit$1 r4 = new com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1$2$emit$1
                r4.<init>(r5, r7)
                goto L12
            L24:
                X.Hwg.A00(r3)     // Catch: com.facebook.aura.pairs.PairsException -> L3f
                goto L4b
            L28:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L2d:
                X.Hwg.A00(r3)
                if (r6 == 0) goto L4b
                com.facebook.aura.pairs.PairsInviteMailbox r0 = r5.this$0     // Catch: com.facebook.aura.pairs.PairsException -> L3f
                r4.Z$0 = r6     // Catch: com.facebook.aura.pairs.PairsException -> L3f
                r4.label = r1     // Catch: com.facebook.aura.pairs.PairsException -> L3f
                java.lang.Object r0 = r0.pull(r4)     // Catch: com.facebook.aura.pairs.PairsException -> L3f
                if (r0 != r2) goto L4b
                return r2
            L3f:
                r0 = move-exception
                java.lang.Object[] r2 = X.C60Q.A1Z(r0)
                java.lang.String r1 = "PairsInviteMailbox"
                java.lang.String r0 = "pull failed: %s"
                X.CFK.A0H(r1, r0, r2)
            L4b:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInviteMailbox$startPullTriggers$1$1.AnonymousClass2.emit(boolean, X.HtJ):java.lang.Object");
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            return emit(AnonymousClass001.A1X(obj), (HtJ<? super Unit>) htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsInviteMailbox$startPullTriggers$1$1(PairsInviteMailbox pairsInviteMailbox, HtJ<? super PairsInviteMailbox$startPullTriggers$1$1> htJ) {
        super(2, htJ);
        this.this$0 = pairsInviteMailbox;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsInviteMailbox$startPullTriggers$1$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new PairsInviteMailbox$startPullTriggers$1$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.this$0.userSession);
            C20Q c20qA01 = GDB.A01(C3rb.A03(new AnonymousClass1(null), AuraAppLifecycleManager.isAppInForegroundFlow, gateway.connectionState));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.L$0 = null;
            this.label = 1;
            if (c20qA01.collect(anonymousClass2, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
