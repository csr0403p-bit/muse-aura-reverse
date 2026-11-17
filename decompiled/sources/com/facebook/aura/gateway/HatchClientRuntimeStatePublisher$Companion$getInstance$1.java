package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BN;
import X.C8eO;
import X.G0V;
import X.HtJ;
import X.Hxb;
import X.HzC;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.nodes.HatchNodeClient;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class HatchClientRuntimeStatePublisher$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<HatchClientRuntimeStatePublisher> {
    public final /* synthetic */ HatchNodeClient $client;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$Companion$getInstance$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz) {
            super(0);
            this.$userSession = abstractC3358CGz;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AuraSessionManager.INSTANCE.isCurrentSession(this.$userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$Companion$getInstance$1$3", f = "HatchClientRuntimeStatePublisher.kt", l = {170}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$Companion$getInstance$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<HatchClientRuntimeStateRequestJson, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$userSession, htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                r26 = this;
                r2 = r26
                java.lang.Object r10 = r2.L$0
                X.Hji r1 = X.EnumC10460Hji.A02
                int r3 = r2.label
                r0 = 1
                r8 = 0
                if (r3 == 0) goto L26
                if (r3 != r0) goto L86
                java.lang.Object r2 = X.AnonymousClass002.A0j(r27)
            L12:
                boolean r1 = r2 instanceof X.C10571Hud
                if (r1 == 0) goto L17
                r2 = 0
            L17:
                com.facebook.aura.gateway.HatchClientRuntimeStateResponseJson r2 = (com.facebook.aura.gateway.HatchClientRuntimeStateResponseJson) r2
                if (r2 == 0) goto L20
                boolean r2 = r2.accepted
                r1 = 1
                if (r2 == r0) goto L21
            L20:
                r1 = 0
            L21:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
            L26:
                X.Hwg.A00(r27)
                com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
                com.facebook.aura.network.api.JarvisPath$ClientRuntimeState r9 = com.facebook.aura.network.api.JarvisPath.ClientRuntimeState.INSTANCE
                com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
                X.CGz r12 = r2.$userSession
                r3 = 5
                java.lang.Long r13 = new java.lang.Long
                r13.<init>(r3)
                X.HxE[] r15 = new X.HxE[r8]
                java.util.Set r16 = X.AnonymousClass004.A18()
                X.9jH r19 = X.AGH.A0E()
                com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$Companion$getInstance$1$3$invokeSuspend$$inlined$executeJarvisRequest-Z6QaZII$default$1 r6 = com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$Companion$getInstance$1$3$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
                com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$Companion$getInstance$1$3$invokeSuspend$$inlined$executeJarvisRequest-Z6QaZII$default$2 r7 = com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$Companion$getInstance$1$3$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
                r14 = 0
                r2.L$0 = r14
                r2.L$1 = r14
                r2.L$2 = r14
                r2.L$3 = r14
                r2.L$4 = r14
                r2.L$5 = r14
                r2.L$6 = r14
                r2.L$7 = r14
                r2.L$8 = r14
                r2.L$9 = r14
                r2.I$0 = r0
                r2.I$1 = r8
                r2.I$2 = r8
                r2.I$3 = r0
                r2.I$4 = r8
                r2.I$5 = r8
                r2.I$6 = r8
                r2.label = r0
                r18 = r8
                r20 = r14
                r21 = r8
                r22 = r0
                r23 = r8
                r24 = r8
                r25 = r14
                r26 = r8
                r27 = r2
                r17 = r0
                java.lang.Object r2 = r5.m1599executeJarvisRequestWithFof5HsY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                if (r2 != r1) goto L12
                return r1
            L86:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchClientRuntimeStatePublisher$Companion$getInstance$1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(HatchClientRuntimeStateRequestJson hatchClientRuntimeStateRequestJson, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass3) create(hatchClientRuntimeStateRequestJson, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchClientRuntimeStatePublisher$Companion$getInstance$1(HatchNodeClient hatchNodeClient, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$client = hatchNodeClient;
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchClientRuntimeStatePublisher invoke() {
        C1BN<Long> c1bn = this.$client.registrationEpoch;
        HzC hzCA02 = Hxb.A02(new C8eO(null).plus(AnonymousClass001.A0y()).plus(new HatchClientRuntimeStatePublisher$Companion$getInstance$1$invoke$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        return new HatchClientRuntimeStatePublisher(c1bn, hzCA02, new AnonymousClass2(abstractC3358CGz), new AnonymousClass3(abstractC3358CGz, null));
    }
}
