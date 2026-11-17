package com.facebook.aura.skills.connect;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConnectorAccountLinkRequesterKt$rememberConnectorAccountLinkRequester$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $requestAccountLink;

    @DebugMetadata(c = "com.facebook.aura.skills.connect.ConnectorAccountLinkRequesterKt$rememberConnectorAccountLinkRequester$1$1$1", f = "ConnectorAccountLinkRequester.kt", l = {31}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.ConnectorAccountLinkRequesterKt$rememberConnectorAccountLinkRequester$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $requestAccountLink;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$requestAccountLink = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$requestAccountLink, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super Unit>, Object> g0u = this.$requestAccountLink;
                this.label = 1;
                if (g0u.invoke(this) == enumC10460Hji) {
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$requestAccountLink, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorAccountLinkRequesterKt$rememberConnectorAccountLinkRequester$1$1(C3UX c3ux, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$requestAccountLink = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$requestAccountLink, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
