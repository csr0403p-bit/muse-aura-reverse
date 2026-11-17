package com.facebook.aura.gateway.service;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import X.HoC;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NoiseHttpDemandFence<Session> {
    public Demand<Session> activeDemand;
    public SessionToken<Session> currentToken;
    public long generation;
    public final Object handlerRegistrationLock = C3cG.A0T();
    public final Object lock = C3cG.A0T();

    public final class Demand<Session> {
        public final long id;
        public final HoC job;
        public final SessionToken<Session> token;

        public final long getId() {
            return this.id;
        }

        public final HoC getJob() {
            return this.job;
        }

        public final SessionToken<Session> getToken() {
            return this.token;
        }

        public Demand(SessionToken<Session> sessionToken, long j, HoC hoC) {
            AnonymousClass003.A0v(sessionToken, hoC);
            this.token = sessionToken;
            this.id = j;
            this.job = hoC;
        }
    }

    public final class Installation<Session> {
        public final boolean accepted;
        public final Demand<Session> replacedDemand;

        public final boolean getAccepted() {
            return this.accepted;
        }

        public final Demand<Session> getReplacedDemand() {
            return this.replacedDemand;
        }

        public Installation(boolean z, Demand<Session> demand) {
            this.accepted = z;
            this.replacedDemand = demand;
        }
    }

    public final class Invalidation<Session> {
        public final Demand<Session> activeDemand;
        public final Session session;

        public final Demand<Session> getActiveDemand() {
            return this.activeDemand;
        }

        public final Session getSession() {
            return this.session;
        }

        public Invalidation(Session session, Demand<Session> demand) {
            this.session = session;
            this.activeDemand = demand;
        }
    }

    public final class SessionToken<Session> {
        public final long generation;
        public final Session session;

        public SessionToken(Session session, long j) {
            C7384Etj.A0Y(session, 0);
            this.session = session;
            this.generation = j;
        }

        public final long getGeneration$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service() {
            return this.generation;
        }

        public final Session getSession() {
            return this.session;
        }
    }

    public final class SessionUpdate<Session> {
        public final boolean changed;
        public final Demand<Session> replacedDemand;
        public final SessionToken<Session> token;
        public final boolean wasInitialized;

        public SessionUpdate(SessionToken<Session> sessionToken, boolean z, boolean z2, Demand<Session> demand) {
            C7384Etj.A0Y(sessionToken, 0);
            this.token = sessionToken;
            this.changed = z;
            this.wasInitialized = z2;
            this.replacedDemand = demand;
        }

        public final boolean getChanged() {
            return this.changed;
        }

        public final Demand<Session> getReplacedDemand() {
            return this.replacedDemand;
        }

        public final SessionToken<Session> getToken() {
            return this.token;
        }

        public final boolean getWasInitialized() {
            return this.wasInitialized;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean acquire(com.facebook.aura.gateway.service.NoiseHttpDemandFence.SessionToken<Session> r7, long r8) {
        /*
            r6 = this;
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            java.lang.Object r5 = r6.lock
            monitor-enter(r5)
            boolean r0 = r6.isCurrent(r7)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L24
            com.facebook.aura.gateway.service.NoiseHttpDemandFence$Demand<Session> r6 = r6.activeDemand     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L24
            com.facebook.aura.gateway.service.NoiseHttpDemandFence$SessionToken<Session> r0 = r6.token     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L24
            long r3 = r0.generation     // Catch: java.lang.Throwable -> L27
            long r1 = r7.generation     // Catch: java.lang.Throwable -> L27
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            long r2 = r6.id     // Catch: java.lang.Throwable -> L27
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L25
        L24:
            r0 = 0
        L25:
            monitor-exit(r5)
            return r0
        L27:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.NoiseHttpDemandFence.acquire(com.facebook.aura.gateway.service.NoiseHttpDemandFence$SessionToken, long):boolean");
    }

    public final SessionUpdate<Session> setSession(Session session, G0U<? super SessionToken<Session>, Unit> g0u) {
        SessionToken<Session> sessionToken;
        Demand<Session> demand;
        SessionUpdate<Session> sessionUpdate;
        boolean zA1a = AnonymousClass002.A1a(session, g0u);
        synchronized (this.handlerRegistrationLock) {
            synchronized (this.lock) {
                try {
                    sessionToken = this.currentToken;
                    demand = this.activeDemand;
                    boolean zA1X = AnonymousClass002.A1X(sessionToken);
                    if ((sessionToken != null ? sessionToken.session : null) == session) {
                        sessionUpdate = new SessionUpdate<>(sessionToken, false, zA1a, null);
                    } else {
                        long j = this.generation + 1;
                        this.generation = j;
                        SessionToken<Session> sessionToken2 = new SessionToken<>(session, j);
                        this.currentToken = sessionToken2;
                        this.activeDemand = null;
                        sessionUpdate = new SessionUpdate<>(sessionToken2, zA1a, zA1X, demand);
                    }
                } finally {
                }
            }
            if (sessionUpdate.changed) {
                try {
                    g0u.invoke(sessionUpdate.token);
                } catch (Throwable th) {
                    synchronized (this.lock) {
                        try {
                            if (!isCurrent(sessionUpdate.token)) {
                                throw th;
                            }
                            this.generation++;
                            this.currentToken = sessionToken;
                            this.activeDemand = demand;
                            throw th;
                        } finally {
                        }
                    }
                }
            }
        }
        return sessionUpdate;
    }

    public final Demand<Session> take(SessionToken<Session> sessionToken, long j) {
        Demand<Session> demand;
        C7384Etj.A0Y(sessionToken, 0);
        synchronized (this.lock) {
            demand = this.activeDemand;
            if (isCurrent(sessionToken) && demand != null && demand.token.generation == sessionToken.generation && demand.id == j) {
                this.activeDemand = null;
            } else {
                demand = null;
            }
        }
        return demand;
    }

    public final Installation<Session> tryInstall(SessionToken<Session> sessionToken, long j, HoC hoC) {
        Installation<Session> installation;
        AnonymousClass002.A1A(sessionToken, 0, hoC);
        synchronized (this.lock) {
            if (isCurrent(sessionToken)) {
                Demand<Session> demand = this.activeDemand;
                this.activeDemand = new Demand<>(sessionToken, j, hoC);
                installation = new Installation<>(true, demand);
            } else {
                installation = new Installation<>(false, null);
            }
        }
        return installation;
    }

    private final boolean isCurrent(SessionToken<Session> sessionToken) {
        SessionToken<Session> sessionToken2 = this.currentToken;
        return sessionToken2 != null && sessionToken2.generation == sessionToken.generation && sessionToken2.session == sessionToken.session;
    }

    public final Session currentSession() {
        Session session;
        synchronized (this.lock) {
            SessionToken<Session> sessionToken = this.currentToken;
            session = sessionToken != null ? sessionToken.session : null;
        }
        return session;
    }

    public final Invalidation<Session> invalidate(G0U<? super Demand<Session>, Unit> g0u, Function0<Unit> function0) {
        Invalidation<Session> invalidation;
        AnonymousClass003.A0u(g0u, function0);
        synchronized (this.handlerRegistrationLock) {
            synchronized (this.lock) {
                try {
                    SessionToken<Session> sessionToken = this.currentToken;
                    invalidation = new Invalidation<>(sessionToken != null ? sessionToken.session : null, this.activeDemand);
                    this.generation++;
                    this.currentToken = null;
                    this.activeDemand = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                Demand<Session> demand = invalidation.activeDemand;
                if (demand != null) {
                    g0u.invoke(demand);
                }
                function0.invoke();
            } catch (Throwable th2) {
                function0.invoke();
                throw th2;
            }
        }
        return invalidation;
    }
}
