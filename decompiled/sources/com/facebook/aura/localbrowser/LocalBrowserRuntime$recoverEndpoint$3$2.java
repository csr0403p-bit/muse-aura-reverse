package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$recoverEndpoint$3$2", f = "LocalBrowserRuntime.kt", l = {845}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserRuntime$recoverEndpoint$3$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchGatewayConnection $gateway;
    public int label;
    public final /* synthetic */ LocalBrowserRuntime this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$recoverEndpoint$3$2$1", f = "LocalBrowserRuntime.kt", l = {846}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$recoverEndpoint$3$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchGatewayConnectionState>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$recoverEndpoint$3$2$1$1", f = "LocalBrowserRuntime.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$recoverEndpoint$3$2$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02111 extends AbstractC07127nr implements G0V<HatchGatewayConnectionState, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public C02111(HtJ<? super C02111> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C02111 c02111 = new C02111(htJ);
                c02111.L$0 = obj;
                return c02111;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return C3cG.A0P(obj2 instanceof HatchGatewayConnectionState.Connected);
            }

            @Override // X.G0V
            public final Object invoke(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
                C02111 c02111 = new C02111(htJ);
                c02111.L$0 = hatchGatewayConnectionState;
                return c02111.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchGatewayConnection hatchGatewayConnection, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$gateway, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<HatchGatewayConnectionState> c1bn = this.$gateway.connectionState;
                C02111 c02111 = new C02111(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, c02111, c1bn);
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
        public final Object invoke(C3UX c3ux, HtJ<? super HatchGatewayConnectionState> htJ) {
            return new AnonymousClass1(this.$gateway, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserRuntime$recoverEndpoint$3$2(LocalBrowserRuntime localBrowserRuntime, HatchGatewayConnection hatchGatewayConnection, HtJ<? super LocalBrowserRuntime$recoverEndpoint$3$2> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserRuntime;
        this.$gateway = hatchGatewayConnection;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserRuntime$recoverEndpoint$3$2(this.this$0, this.$gateway, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$gateway, null);
            this.label = 1;
            if (C3cI.A0S(anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        AnonymousClass004.A1D(false, this.this$0.mutableRecoveringEndpoint);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((LocalBrowserRuntime$recoverEndpoint$3$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
