package com.facebook.aura.network.transport.tigon;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BV4;
import X.BV8;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.GAt;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC10560Hsz;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.aura.localbrowser.LocalBrowserNodeHandler;
import com.facebook.aura.network.tigon.ScopedNoiseIdentityProbeResources;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.network.transport.HatchDuplexResponseHandler;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchScopedVmChannel;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import com.facebook.aura.network.transport.HatchWsEvent;
import com.facebook.aura.network.transport.tigon.TigonHatchHttpClient;
import com.facebook.aura.network.transport.tigon.TigonScopedVmChannel;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class TigonScopedVmChannel implements HatchScopedVmChannel {
    public final String bearer;
    public final TigonHatchHttpClient client;
    public final AtomicBoolean closed;
    public final InterfaceC10560Hsz<HatchWsEvent> ended;
    public final C3UX eventScope;
    public final HatchHttpClient httpClient;
    public final AtomicInteger inFlight;
    public final Function0<Unit> onClosed;
    public volatile boolean open;
    public final InterfaceC10560Hsz<HatchWsEvent> ready;
    public final AtomicBoolean released;
    public final ScopedNoiseIdentityProbeResources resources;
    public volatile HatchWebSocketSession session;
    public final String vmHost;

    public final class InFlightStream {
        public final AtomicBoolean ended = C60O.A1E();

        public final HatchDuplexResponseHandler handler(final HatchDuplexResponseHandler hatchDuplexResponseHandler) {
            C7384Etj.A0Y(hatchDuplexResponseHandler, 0);
            return new HatchDuplexResponseHandler() { // from class: com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$InFlightStream$handler$1
                @Override // com.facebook.aura.network.transport.HatchDuplexResponseHandler
                public void onBody(byte[] bArr) {
                    C7384Etj.A0Y(bArr, 0);
                    hatchDuplexResponseHandler.onBody(bArr);
                }

                @Override // com.facebook.aura.network.transport.HatchDuplexResponseHandler
                public void onComplete(HatchHttpResponse hatchHttpResponse) {
                    C7384Etj.A0Y(hatchHttpResponse, 0);
                    try {
                        hatchDuplexResponseHandler.onComplete(hatchHttpResponse);
                    } finally {
                        this.end();
                    }
                }

                @Override // com.facebook.aura.network.transport.HatchDuplexResponseHandler
                public void onResponse(int i, Map<String, String> map) {
                    C7384Etj.A0Y(map, 1);
                    hatchDuplexResponseHandler.onResponse(i, map);
                }
            };
        }

        public final HatchDuplexHttpStream wrap(final HatchDuplexHttpStream hatchDuplexHttpStream) {
            C7384Etj.A0Y(hatchDuplexHttpStream, 0);
            return new HatchDuplexHttpStream(this) { // from class: com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$InFlightStream$wrap$1
                public final /* synthetic */ HatchDuplexHttpStream $$delegate_0;
                public final /* synthetic */ TigonScopedVmChannel.InFlightStream this$0;

                {
                    this.this$0 = this;
                    this.$$delegate_0 = this.$opened;
                }

                @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
                public Object awaitResponse(HtJ<? super HatchHttpResponse> htJ) {
                    return this.$$delegate_0.awaitResponse(htJ);
                }

                @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
                public void cancel() {
                    try {
                        this.$opened.cancel();
                    } finally {
                        this.this$0.end();
                    }
                }

                @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
                public boolean finishRequest() {
                    return this.$$delegate_0.finishRequest();
                }

                @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
                public Object writeRequestChunk(byte[] bArr, HtJ<? super Boolean> htJ) {
                    return this.$$delegate_0.writeRequestChunk(bArr, htJ);
                }
            };
        }

        public InFlightStream() {
        }

        public final void end() {
            if (C3cI.A1W(this.ended)) {
                TigonScopedVmChannel.this.leaveInFlight();
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$awaitReady$2", f = "TigonScopedVmChannel.kt", l = {237}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$awaitReady$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchWsEvent>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TigonScopedVmChannel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchWsEvent> htJ) {
            return TigonScopedVmChannel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                InterfaceC10560Hsz<HatchWsEvent> interfaceC10560Hsz = TigonScopedVmChannel.this.ready;
                this.label = 1;
                obj = C3cG.A0W(interfaceC10560Hsz, this);
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
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$connect$1", f = "TigonScopedVmChannel.kt", l = {213}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$connect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchWebSocketSession $connected;
        public int label;
        public final /* synthetic */ TigonScopedVmChannel this$0;

        @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$connect$1$1", f = "TigonScopedVmChannel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$connect$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02471 extends AbstractC07127nr implements G0V<HatchWsEvent, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ TigonScopedVmChannel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02471(TigonScopedVmChannel tigonScopedVmChannel, HtJ<? super C02471> htJ) {
                super(2, htJ);
                this.this$0 = tigonScopedVmChannel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C02471 c02471 = new C02471(this.this$0, htJ);
                c02471.L$0 = obj;
                return c02471;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                boolean z = true;
                if (!this.this$0.closed.get()) {
                    if (obj2 instanceof HatchWsEvent.Open) {
                        this.this$0.open = true;
                        C3cG.A1F(this.this$0.ready, obj2);
                    } else if ((obj2 instanceof HatchWsEvent.Failed) || (obj2 instanceof HatchWsEvent.Closed)) {
                        this.this$0.open = false;
                        C3cG.A1F(this.this$0.ready, obj2);
                        C3cG.A1F(this.this$0.ended, obj2);
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.G0V
            public final Object invoke(HatchWsEvent hatchWsEvent, HtJ<? super Boolean> htJ) {
                return ((C02471) create(hatchWsEvent, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchWebSocketSession hatchWebSocketSession, TigonScopedVmChannel tigonScopedVmChannel, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$connected = hatchWebSocketSession;
            this.this$0 = tigonScopedVmChannel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$connected, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<HatchWsEvent> connectionEvents = this.$connected.getConnectionEvents();
                C02471 c02471 = new C02471(this.this$0, null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, c02471, connectionEvents) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TigonScopedVmChannel(ScopedNoiseIdentityProbeResources scopedNoiseIdentityProbeResources, String str, String str2, Function0<Unit> function0) {
        C7384Etj.A0Y(scopedNoiseIdentityProbeResources, 0);
        AnonymousClass005.A11(str, str2, function0, 1);
        this.resources = scopedNoiseIdentityProbeResources;
        this.vmHost = str;
        this.bearer = str2;
        this.onClosed = function0;
        this.closed = BV4.A12(false);
        this.inFlight = BV4.A13(0);
        this.released = BV4.A12(false);
        this.eventScope = Hxb.A02(C78W.A02(new C8eO(null), AnonymousClass001.A0y()).plus(new TigonScopedVmChannel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
        this.ready = new GAt(null);
        this.ended = new GAt(null);
        this.client = new TigonHatchHttpClient(HatchAuthScheme.VM_JWT, new TigonScopedVmChannel$client$1(this), TigonScopedVmChannel$client$2.INSTANCE, TigonHatchHttpClient.AnonymousClass3.INSTANCE, TigonScopedVmChannel$client$3.INSTANCE, true);
        this.httpClient = new TigonScopedVmChannel$httpClient$1(this);
    }

    @Override // com.facebook.aura.network.transport.HatchScopedVmChannel
    public Object awaitReady(long j, HtJ<? super HatchWsEvent> htJ) {
        return GAX.A01(htJ, new AnonymousClass2(null), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void leaveInFlight() {
        if (this.inFlight.decrementAndGet() == 0 && this.closed.get()) {
            releaseSlot();
        }
    }

    private final void releaseSlot() {
        if (C3cI.A1W(this.released)) {
            this.onClosed.invoke();
        }
    }

    private final <T> T whileInFlight(Function0<? extends T> function0) {
        this.inFlight.incrementAndGet();
        try {
            return function0.invoke();
        } finally {
            leaveInFlight();
        }
    }

    @Override // com.facebook.aura.network.transport.HatchScopedVmChannel
    public Object awaitClosed(HtJ<? super HatchWsEvent> htJ) {
        return C3cG.A0W(this.ended, htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchScopedVmChannel
    public void close() {
        if (BV4.A1V(this.closed)) {
            this.open = false;
            HatchWsEvent.Closed closed = new HatchWsEvent.Closed(1000, LocalBrowserNodeHandler.CLOSED);
            C3cG.A1F(this.ready, closed);
            C3cG.A1F(this.ended, closed);
            Hxb.A03(null, this.eventScope);
            try {
                HatchWebSocketSession hatchWebSocketSession = this.session;
                if (hatchWebSocketSession != null) {
                    hatchWebSocketSession.close(1000, "Scoped VM channel closed");
                }
            } finally {
                if (this.inFlight.get() == 0) {
                    releaseSlot();
                }
            }
        }
    }

    @Override // com.facebook.aura.network.transport.HatchScopedVmChannel
    public HatchHttpClient getHttpClient() {
        return this.httpClient;
    }

    @Override // com.facebook.aura.network.transport.HatchScopedVmChannel
    public boolean isOpen() {
        return !this.closed.get() && this.open;
    }

    public final void connect(String str, String str2) {
        HatchWebSocketSession hatchWebSocketSessionConnect = NoiseGatewayHatchWebSocketFactory.INSTANCE.createScoped$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon(new VmNoiseCarrierFactory(new TigonScopedVmChannel$connect$webSocket$1(this), new TigonScopedVmChannel$connect$webSocket$2(this)), str2).connect(BV8.A0d(null, JarvisProtocolKt.jarvisConnectionUrl(str, this.bearer, AnonymousClass004.A1b(str, str2)), ScopedNoiseIdentityProbeKt.noiseConnectHeaders("scoped-vm-channel")));
        this.session = hatchWebSocketSessionConnect;
        AnonymousClass001.A1J(new AnonymousClass1(hatchWebSocketSessionConnect, this, null), this.eventScope);
    }
}
