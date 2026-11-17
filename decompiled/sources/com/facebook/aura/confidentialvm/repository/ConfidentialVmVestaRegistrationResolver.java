package com.facebook.aura.confidentialvm.repository;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C10550Hrx;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.G0U;
import X.GAo;
import X.HtJ;
import X.Hxb;
import X.HzP;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class ConfidentialVmVestaRegistrationResolver {
    public ConfidentialVmVestaRegistration cached;
    public boolean closed;
    public final G0U<HtJ<? super ConfidentialVmVestaRegistration>, Object> fetchRegistration;
    public C27k<? extends ConfidentialVmVestaRegistration> inFlight;
    public final Object lock;
    public final C3UX scope;

    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$newFetch$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ C27k<ConfidentialVmVestaRegistration> $started;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C27k<? extends ConfidentialVmVestaRegistration> c27k) {
            super(1);
            this.$started = c27k;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ConfidentialVmVestaRegistrationResolver confidentialVmVestaRegistrationResolver = ConfidentialVmVestaRegistrationResolver.this;
            Object obj = confidentialVmVestaRegistrationResolver.lock;
            C27k<ConfidentialVmVestaRegistration> c27k = this.$started;
            synchronized (obj) {
                if (confidentialVmVestaRegistrationResolver.inFlight == c27k) {
                    confidentialVmVestaRegistrationResolver.inFlight = null;
                }
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver", f = "ConfidentialVmRepository.kt", l = {1271}, m = "resolve", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolve$1, reason: invalid class name and case insensitive filesystem */
    public final class C112571 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112571(HtJ<? super C112571> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmVestaRegistrationResolver.this.resolve(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver", f = "ConfidentialVmRepository.kt", l = {1287}, m = "resolveFresh", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolveFresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C112581 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C112581(HtJ<? super C112581> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmVestaRegistrationResolver.this.resolveFresh(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver", f = "ConfidentialVmRepository.kt", l = {1311}, m = "resolveUncached", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolveUncached$1, reason: invalid class name and case insensitive filesystem */
    public final class C112591 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C112591(HtJ<? super C112591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmVestaRegistrationResolver.this.resolveUncached(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfidentialVmVestaRegistrationResolver(G0U<? super HtJ<? super ConfidentialVmVestaRegistration>, ? extends Object> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.fetchRegistration = g0u;
        this.scope = C78T.A01(C3cG.A0v(), null);
        this.lock = C3cG.A0T();
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmVestaRegistration.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmVestaRegistration.REGISTERED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmVestaRegistration.NOT_REGISTERED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmVestaRegistration.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final C27k<ConfidentialVmVestaRegistration> newFetch() {
        C3UX c3ux = this.scope;
        C10550Hrx c10550HrxA01 = GAo.A01(C79.A01, C6ys.A00, new ConfidentialVmVestaRegistrationResolver$newFetch$started$1(this, null), c3ux);
        this.inFlight = c10550HrxA01;
        c10550HrxA01.AO5(new AnonymousClass1(c10550HrxA01));
        return c10550HrxA01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFetched(ConfidentialVmVestaRegistration confidentialVmVestaRegistration) {
        synchronized (this.lock) {
            if (!this.closed && this.cached == null && confidentialVmVestaRegistration == ConfidentialVmVestaRegistration.REGISTERED) {
                this.cached = confidentialVmVestaRegistration;
            }
        }
    }

    public final void close() {
        synchronized (this.lock) {
            this.closed = true;
            this.cached = null;
            this.inFlight = null;
        }
        Hxb.A03(null, this.scope);
    }

    public final void markRegistered() {
        synchronized (this.lock) {
            if (!this.closed) {
                this.cached = ConfidentialVmVestaRegistration.REGISTERED;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolve(X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver.C112571
            if (r0 == 0) goto L4e
            r5 = r7
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolve$1 r5 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver.C112571) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L24
            if (r0 != r3) goto L60
            X.Hwg.A00(r1)
        L20:
            java.lang.Object r2 = r6.lock
            monitor-enter(r2)
            goto L54
        L24:
            X.Hwg.A00(r1)
            java.lang.Object r2 = r6.lock
            monitor-enter(r2)
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L31
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.UNAVAILABLE     // Catch: java.lang.Throwable -> L6a
            goto L66
        L31:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r0 = r6.cached     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L36
            goto L68
        L36:
            X.27k<? extends com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration> r1 = r6.inFlight     // Catch: java.lang.Throwable -> L6a
            if (r1 != 0) goto L3e
            X.27k r1 = r6.newFetch()     // Catch: java.lang.Throwable -> L6a
        L3e:
            monitor-exit(r2)
            r1.Afv()
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r1 = X.C3cG.A0W(r1, r5)
            if (r1 != r4) goto L20
            return r4
        L4e:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolve$1 r5 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolve$1
            r5.<init>(r7)
            goto L12
        L54:
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L5b
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.UNAVAILABLE     // Catch: java.lang.Throwable -> L6a
            goto L66
        L5b:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r0 = r6.cached     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L66
            goto L65
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L65:
            r1 = r0
        L66:
            monitor-exit(r2)
            return r1
        L68:
            monitor-exit(r2)
            return r0
        L6a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver.resolve(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveFresh(X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver.C112581
            if (r0 == 0) goto L45
            r4 = r6
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolveFresh$1 r4 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver.C112581) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 != r2) goto L5d
            X.Hwg.A00(r1)
        L20:
            r3 = r1
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r3 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration) r3
            java.lang.Object r1 = r5.lock
            monitor-enter(r1)
            goto L4b
        L27:
            X.Hwg.A00(r1)
            java.lang.Object r1 = r5.lock
            monitor-enter(r1)
            boolean r0 = r5.closed     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L34
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r3 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.UNAVAILABLE     // Catch: java.lang.Throwable -> L65
            goto L63
        L34:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r0 = r5.cached     // Catch: java.lang.Throwable -> L65
            monitor-exit(r1)
            if (r0 == 0) goto L3a
            return r0
        L3a:
            X.G0U<X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration>, java.lang.Object> r0 = r5.fetchRegistration
            r4.label = r2
            java.lang.Object r1 = r0.invoke(r4)
            if (r1 != r3) goto L20
            return r3
        L45:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolveFresh$1 r4 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolveFresh$1
            r4.<init>(r6)
            goto L12
        L4b:
            boolean r0 = r5.closed     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L52
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r3 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.UNAVAILABLE     // Catch: java.lang.Throwable -> L65
            goto L63
        L52:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r0 = r5.cached     // Catch: java.lang.Throwable -> L65
            if (r0 != 0) goto L62
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.REGISTERED     // Catch: java.lang.Throwable -> L65
            if (r3 != r0) goto L63
            r5.cached = r3     // Catch: java.lang.Throwable -> L65
            goto L63
        L5d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L62:
            r3 = r0
        L63:
            monitor-exit(r1)
            return r3
        L65:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver.resolveFresh(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveUncached(X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver.C112591
            if (r0 == 0) goto L41
            r6 = r8
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolveUncached$1 r6 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver.C112591) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L28
            if (r0 != r4) goto L69
            X.Hwg.A00(r1)
        L21:
            r5 = r1
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r5 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration) r5
            java.lang.Object r2 = r7.lock
            monitor-enter(r2)
            goto L47
        L28:
            X.Hwg.A00(r1)
            java.lang.Object r1 = r7.lock
            monitor-enter(r1)
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L35
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r5 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.UNAVAILABLE     // Catch: java.lang.Throwable -> L70
            goto L6e
        L35:
            monitor-exit(r1)
            X.G0U<X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration>, java.lang.Object> r0 = r7.fetchRegistration
            r6.label = r4
            java.lang.Object r1 = r0.invoke(r6)
            if (r1 != r5) goto L21
            return r5
        L41:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolveUncached$1 r6 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver$resolveUncached$1
            r6.<init>(r8)
            goto L12
        L47:
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L4e
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r5 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.UNAVAILABLE     // Catch: java.lang.Throwable -> L66
            goto L64
        L4e:
            int r1 = r5.ordinal()     // Catch: java.lang.Throwable -> L66
            if (r1 == r3) goto L62
            if (r1 == r4) goto L5e
            r0 = 2
            if (r1 == r0) goto L64
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L5e:
            r0 = 0
            r7.cached = r0     // Catch: java.lang.Throwable -> L66
            goto L64
        L62:
            r7.cached = r5     // Catch: java.lang.Throwable -> L66
        L64:
            monitor-exit(r2)
            return r5
        L66:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L6e:
            monitor-exit(r1)
            return r5
        L70:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver.resolveUncached(X.HtJ):java.lang.Object");
    }
}
