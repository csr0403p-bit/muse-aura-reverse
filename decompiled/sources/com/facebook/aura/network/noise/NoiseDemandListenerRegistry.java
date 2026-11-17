package com.facebook.aura.network.noise;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class NoiseDemandListenerRegistry<Listener, Registration> {
    public Listener listener;
    public final G0U<Throwable, Unit> onUnregisterFailure;
    public final G0U<Listener, Registration> register;
    public Registration registration;
    public final G0U<Boolean, Unit> setRoutingGate;
    public final G0U<Registration, Unit> unregister;

    public final void replace(Listener listener) {
        C7384Etj.A0Y(listener, 0);
        try {
            Registration registrationInvoke = this.register.invoke(listener);
            Registration registration = this.registration;
            this.listener = listener;
            this.registration = registrationInvoke;
            if (registration != null) {
                unregisterSafely(registration);
            }
            AnonymousClass001.A1K(true, this.setRoutingGate);
        } catch (Throwable th) {
            AnonymousClass001.A1K(this.registration != null, this.setRoutingGate);
            throw th;
        }
    }

    /* renamed from: com.facebook.aura.network.noise.NoiseDemandListenerRegistry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }
    }

    private final void unregisterSafely(Registration registration) {
        try {
            this.unregister.invoke(registration);
        } catch (Throwable th) {
            this.onUnregisterFailure.invoke(th);
        }
    }

    public final void clear() {
        Registration registration = this.registration;
        this.registration = null;
        this.listener = null;
        Boolean boolA0h = AnonymousClass001.A0h();
        if (registration != null) {
            try {
                unregisterSafely(registration);
            } finally {
                this.setRoutingGate.invoke(boolA0h);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoiseDemandListenerRegistry(G0U<? super Listener, ? extends Registration> g0u, G0U<? super Registration, Unit> g0u2, G0U<? super Boolean, Unit> g0u3, G0U<? super Throwable, Unit> g0u4) {
        AnonymousClass005.A14(g0u, g0u2, g0u3, g0u4);
        this.register = g0u;
        this.unregister = g0u2;
        this.setRoutingGate = g0u3;
        this.onUnregisterFailure = g0u4;
    }

    public /* synthetic */ NoiseDemandListenerRegistry(G0U g0u, G0U g0u2, G0U g0u3, G0U g0u4, int i, C06H c06h) {
        this(g0u, g0u2, g0u3, (i & 8) != 0 ? AnonymousClass1.INSTANCE : g0u4);
    }
}
