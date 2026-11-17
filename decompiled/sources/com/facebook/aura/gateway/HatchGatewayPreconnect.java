package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C10571Hud;
import X.C3cG;
import X.C60N;
import X.C60P;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import X.HsJ;
import X.HtJ;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.network.sandbox.AuraSandbox;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchTransport;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchGatewayPreconnect {
    public static final int $stable = 0;
    public static String parkedGatewayUrl;
    public static String parkedHost;
    public static AbstractC3358CGz parkedSession;
    public static volatile GatewayParkedTransportHook parkedTransportHook;
    public static final HatchGatewayPreconnect INSTANCE = new HatchGatewayPreconnect();
    public static final Object parkedTransportLock = C3cG.A0T();

    /* renamed from: com.facebook.aura.gateway.HatchGatewayPreconnect$shouldRunNow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AuraAppLifecycleManager.INSTANCE.isAppInForeground());
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayPreconnect$shouldRunNow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AuraNetworkMonitor._state.getValue() instanceof AuraNetworkState.Online);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayPreconnect$shouldRunNow$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchGatewayPreconnectFlags.INSTANCE.isEnabled());
        }
    }

    private final void clearParkedTransport() {
        parkedSession = null;
        parkedGatewayUrl = null;
        parkedHost = null;
        cancelParkedGatewayTransport();
    }

    public final void cancelParkedGatewayTransport(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        synchronized (parkedTransportLock) {
            if (parkedSession == abstractC3358CGz) {
                INSTANCE.clearParkedTransport();
            }
        }
    }

    public final void cancelParkedTransportForChangedRoute(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        synchronized (parkedTransportLock) {
            if (parkedSession == abstractC3358CGz) {
                String strA1K = C60P.A1K(abstractC3358CGz);
                if (strA1K.length() <= 0) {
                    strA1K = null;
                }
                HatchGatewayPreconnect hatchGatewayPreconnect = INSTANCE;
                GatewayParkedTransportHook gatewayParkedTransportHook = parkedTransportHook;
                String strHostForGateway = gatewayParkedTransportHook != null ? gatewayParkedTransportHook.hostForGateway(strA1K) : null;
                String str = parkedGatewayUrl;
                if ((str != null && !str.equals(strA1K)) || !C7384Etj.areEqual(parkedHost, strHostForGateway)) {
                    hatchGatewayPreconnect.clearParkedTransport();
                }
            }
        }
    }

    public final void cancelParkedTransportFromOtherSession(AbstractC3358CGz abstractC3358CGz) {
        AbstractC3358CGz abstractC3358CGz2;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        synchronized (parkedTransportLock) {
            if (AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz) && (abstractC3358CGz2 = parkedSession) != null && abstractC3358CGz2 != abstractC3358CGz) {
                INSTANCE.clearParkedTransport();
            }
        }
    }

    public final boolean shouldRunNow$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(Function0<Boolean> function0, Function0<Boolean> function02, Function0<Boolean> function03) {
        C7384Etj.A0Y(function0, 0);
        AnonymousClass003.A0x(function02, function03);
        if (AnonymousClass003.A1Y(function0) && AnonymousClass003.A1Y(function02)) {
            return AnonymousClass003.A1Y(function03);
        }
        return false;
    }

    private final boolean parkGatewayTransport(String str) {
        Object objA0s;
        GatewayParkedTransportHook gatewayParkedTransportHook = parkedTransportHook;
        if (gatewayParkedTransportHook == null) {
            CFK.A0H(HatchGatewayPreconnectKt.TAG, "park transport hook missing host=%s", str);
            return false;
        }
        try {
            objA0s = Boolean.valueOf(gatewayParkedTransportHook.park(str));
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0D(HatchGatewayPreconnectKt.TAG, "park transport hook failed host=%s", thA00, str);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = false;
        }
        boolean zA1X = AnonymousClass001.A1X(objA0s);
        if (!zA1X) {
            CFK.A0H(HatchGatewayPreconnectKt.TAG, "park transport hook rejected host=%s", str);
        }
        return zA1X;
    }

    public final GatewayParkedTransportHook getParkedTransportHook() {
        return parkedTransportHook;
    }

    public final void preconnectStefi() {
        String strStefiPreconnectHost = HatchGatewayPreconnectKt.stefiPreconnectHost(C60N.A00(24), AuraSandbox.INSTANCE.getHttpHost());
        if (strStefiPreconnectHost != null) {
            HatchTransport.INSTANCE.preconnect(HatchAuthScheme.META_BEARER, strStefiPreconnectHost);
            CFK.A03(strStefiPreconnectHost, HatchGatewayPreconnectKt.TAG, "Stefi preconnect requested host=%s");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runPrefetchAndWake$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(X.G0U<? super X.HtJ<? super kotlin.Unit>, ? extends java.lang.Object> r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchGatewayPreconnect$runPrefetchAndWake$1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.gateway.HatchGatewayPreconnect$runPrefetchAndWake$1 r4 = (com.facebook.aura.gateway.HatchGatewayPreconnect$runPrefetchAndWake$1) r4
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
            com.facebook.aura.gateway.HatchGatewayPreconnect$runPrefetchAndWake$1 r4 = new com.facebook.aura.gateway.HatchGatewayPreconnect$runPrefetchAndWake$1
            r4.<init>(r5, r7)
            goto L12
        L24:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L47
            goto L44
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L47
            r4.label = r1     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L47
            java.lang.Object r0 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L47
            if (r0 != r2) goto L44
            return r2
        L3c:
            r2 = move-exception
            java.lang.String r1 = "HatchGatewayPreconnect"
            java.lang.String r0 = "Gateway preconnect prefetch/wake failed"
            X.CFK.A08(r1, r0, r2)
        L44:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L47:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayPreconnect.runPrefetchAndWake$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(X.G0U, X.HtJ):java.lang.Object");
    }

    public final boolean shouldRunNow() {
        return shouldRunNow$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE);
    }

    private final Object runPrefetchAndWake$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway$$forInline(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super Unit> htJ) {
        try {
            g0u.invoke(htJ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            CFK.A08(HatchGatewayPreconnectKt.TAG, "Gateway preconnect prefetch/wake failed", th);
        }
        return Unit.INSTANCE;
    }

    public final void setParkedTransportHook(GatewayParkedTransportHook gatewayParkedTransportHook) {
        parkedTransportHook = gatewayParkedTransportHook;
    }

    private final void cancelParkedGatewayTransport() {
        try {
            GatewayParkedTransportHook gatewayParkedTransportHook = parkedTransportHook;
            if (gatewayParkedTransportHook != null) {
                gatewayParkedTransportHook.cancel();
            }
        } catch (Throwable th) {
            C3cG.A0s(th);
        }
    }

    public final boolean parkGatewayTransport(AbstractC3358CGz abstractC3358CGz, String str) {
        boolean zParkGatewayTransport;
        String strHostForGateway;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        synchronized (parkedTransportLock) {
            zParkGatewayTransport = false;
            if (AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz) && (str == null || (str.length() != 0 && str.equals(C60P.A1K(abstractC3358CGz))))) {
                HatchGatewayPreconnect hatchGatewayPreconnect = INSTANCE;
                GatewayParkedTransportHook gatewayParkedTransportHook = parkedTransportHook;
                if (gatewayParkedTransportHook != null && (strHostForGateway = gatewayParkedTransportHook.hostForGateway(str)) != null && hatchGatewayPreconnect.shouldRunNow()) {
                    AbstractC3358CGz abstractC3358CGz2 = parkedSession;
                    if (abstractC3358CGz2 != null && (abstractC3358CGz2 != abstractC3358CGz || !C7384Etj.areEqual(parkedGatewayUrl, str) || !strHostForGateway.equals(parkedHost))) {
                        hatchGatewayPreconnect.clearParkedTransport();
                    }
                    zParkGatewayTransport = hatchGatewayPreconnect.parkGatewayTransport(strHostForGateway);
                    if (zParkGatewayTransport) {
                        parkedSession = abstractC3358CGz;
                        parkedGatewayUrl = str;
                        parkedHost = strHostForGateway;
                    }
                }
            }
        }
        return zParkGatewayTransport;
    }
}
