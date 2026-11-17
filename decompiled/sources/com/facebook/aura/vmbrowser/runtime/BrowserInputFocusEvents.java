package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.Bs8;
import X.C06H;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9sU;
import X.C9sZ;
import X.CFK;
import X.G0U;
import X.HsJ;
import X.InterfaceC7549F2g;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class BrowserInputFocusEvents implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchGatewayConnection gateway;
    public final AtomicReference<Listener> listener;
    public final HatchGatewayPrefsStore prefs;
    public final AbstractC3358CGz userSession;

    public final class Companion {
        public final BrowserInputFocusEvents getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (BrowserInputFocusEvents) abstractC3358CGz.A03(BrowserInputFocusEvents.class, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserInputFocusEvents$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new BrowserInputFocusEvents(abstractC3358CGz);
                }
            });
        }

        public static final BrowserInputFocusEvents getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new BrowserInputFocusEvents(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Listener {
        public final G0U<BrowserInputFocusEvent, Unit> onFocus;
        public final Function0<Unit> onInvalidated;

        public final G0U<BrowserInputFocusEvent, Unit> getOnFocus() {
            return this.onFocus;
        }

        public final Function0<Unit> getOnInvalidated() {
            return this.onInvalidated;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Listener(G0U<? super BrowserInputFocusEvent, Unit> g0u, Function0<Unit> function0) {
            AnonymousClass003.A0u(g0u, function0);
            this.onFocus = g0u;
            this.onInvalidated = function0;
        }
    }

    public final void dispatch(JsonObject jsonObject) {
        final String strA0a;
        JsonObject jsonObjectOptJsonObject;
        Object objA0s;
        C7384Etj.A0Y(jsonObject, 0);
        final Listener listener = this.listener.get();
        if (listener != null) {
            final HatchGatewayStateSnapshot value = this.gateway.gatewayState.getValue();
            if (!(value.connection instanceof HatchGatewayConnectionState.Connected) || (strA0a = C3cG.A0a(this.prefs)) == null || (jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "payload")) == null) {
                return;
            }
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                BrowserInputFocusJson$$serializer browserInputFocusJson$$serializer = BrowserInputFocusJson$$serializer.INSTANCE;
                C7384Etj.A0Y(browserInputFocusJson$$serializer, 0);
                objA0s = (BrowserInputFocusJson) C9sZ.A00(browserInputFocusJson$$serializer, c9sU, jsonObjectOptJsonObject);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (HsJ.A00(objA0s) != null) {
                CFK.A06(BrowserInputFocusEventsKt.TAG, "Invalid browser.input_focus payload");
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            BrowserInputFocusJson browserInputFocusJson = (BrowserInputFocusJson) objA0s;
            if (browserInputFocusJson == null || C7BY.A0j(browserInputFocusJson.takeover_id)) {
                return;
            }
            listener.onFocus.invoke(new BrowserInputFocusEvent(browserInputFocusJson.takeover_id, browserInputFocusJson.focused, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserInputFocusEvents$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(BrowserInputFocusEvents.dispatch$lambda$2(this.f$0, listener, value, strA0a));
                }
            }));
        }
    }

    public static final boolean dispatch$lambda$2(BrowserInputFocusEvents browserInputFocusEvents, Listener listener, HatchGatewayStateSnapshot hatchGatewayStateSnapshot, String str) {
        HatchGatewayStateSnapshot value = browserInputFocusEvents.gateway.gatewayState.getValue();
        return browserInputFocusEvents.listener.get() == listener && AuraSessionManager.INSTANCE.isCurrentSession(browserInputFocusEvents.userSession) && (value.connection instanceof HatchGatewayConnectionState.Connected) && value.connectionCycle == hatchGatewayStateSnapshot.connectionCycle && C7384Etj.areEqual(C3cG.A0a(browserInputFocusEvents.prefs), str);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Function0<Unit> function0;
        Listener andSet = this.listener.getAndSet(null);
        if (andSet == null || (function0 = andSet.onInvalidated) == null) {
            return;
        }
        function0.invoke();
    }

    public BrowserInputFocusEvents(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.gateway = HatchGatewayServiceManager.INSTANCE.getGateway(abstractC3358CGz);
        this.prefs = C3cG.A0D(abstractC3358CGz);
        this.listener = new AtomicReference<>(null);
    }

    public final AutoCloseable register(G0U<? super BrowserInputFocusEvent, Unit> g0u, Function0<Unit> function0) {
        Function0<Unit> function02;
        AnonymousClass003.A0u(g0u, function0);
        final Listener listener = new Listener(g0u, function0);
        Listener andSet = this.listener.getAndSet(listener);
        if (andSet != null && (function02 = andSet.onInvalidated) != null) {
            function02.invoke();
        }
        return new AutoCloseable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserInputFocusEvents$$ExternalSyntheticLambda0
            @Override // java.lang.AutoCloseable
            public final void close() {
                Bs8.A00(listener, null, this.f$0.listener);
            }
        };
    }

    public /* synthetic */ BrowserInputFocusEvents(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
