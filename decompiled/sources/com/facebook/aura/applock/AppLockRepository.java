package com.facebook.aura.applock;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass602;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.composer.util.ImageCompressor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AppLockRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final Clock systemClock = new Clock() { // from class: com.facebook.aura.applock.AppLockRepository$Companion$systemClock$1
        @Override // com.facebook.aura.applock.AppLockRepository.Clock
        public final long elapsedRealtimeMs() {
            return SystemClock.elapsedRealtime();
        }
    };
    public final BLG<Boolean> _isEnabled;
    public final BLG<Boolean> _shouldLock;
    public final BLG<AppLockTimeout> _timeout;
    public final Clock clock;
    public final AppLockDataStore dataStore;
    public final HoC initialization;
    public Long lastActiveAtElapsedRealtimeMs;
    public HoC lifecycleUpdateJob;
    public final Object lifecycleUpdateLock;
    public final C3UX scope;
    public final C1BN<Boolean> shouldLock;

    @DebugMetadata(c = "com.facebook.aura.applock.AppLockRepository$1", f = "AppLockRepository.kt", l = {58, 59}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.applock.AppLockRepository$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public boolean Z$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.applock.AppLockRepository$1$1", f = "AppLockRepository.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.applock.AppLockRepository$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00341 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ AppLockRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00341(AppLockRepository appLockRepository, HtJ<? super C00341> htJ) {
                super(2, htJ);
                this.this$0 = appLockRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00341(this.this$0, htJ);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new C00341(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    final AppLockRepository appLockRepository = this.this$0;
                    AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(appLockRepository.dataStore.isEnabledFlow);
                    C20Z c20z = new C20Z() { // from class: com.facebook.aura.applock.AppLockRepository.1.1.1
                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            C3cJ.A0C(appLockRepository._isEnabled, z);
                            if (!z) {
                                AnonymousClass003.A14(appLockRepository._shouldLock, false);
                                appLockRepository.clearLastActiveAt();
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                        }
                    };
                    this.label = 1;
                    if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
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

        @DebugMetadata(c = "com.facebook.aura.applock.AppLockRepository$1$2", f = "AppLockRepository.kt", l = {75}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.applock.AppLockRepository$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ AppLockRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AppLockRepository appLockRepository, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = appLockRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.this$0, htJ);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    final AppLockRepository appLockRepository = this.this$0;
                    AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(appLockRepository.dataStore.timeoutFlow);
                    C20Z c20z = new C20Z() { // from class: com.facebook.aura.applock.AppLockRepository.1.2.1
                        public final Object emit(AppLockTimeout appLockTimeout, HtJ<? super Unit> htJ) {
                            appLockRepository._timeout.Af8(appLockTimeout);
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((AppLockTimeout) obj2, (HtJ<? super Unit>) htJ);
                        }
                    };
                    this.label = 1;
                    if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AppLockRepository.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AppLockRepository.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L4c
                if (r0 == r2) goto L5e
                if (r0 != r3) goto L76
                boolean r1 = r6.Z$0
                X.Hwg.A00(r7)
            L11:
                com.facebook.aura.applock.AppLockRepository r0 = com.facebook.aura.applock.AppLockRepository.this
                X.BLG<java.lang.Boolean> r3 = r0._isEnabled
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                X.HtJ r5 = X.C3cI.A14(r3, r0)
                com.facebook.aura.applock.AppLockRepository r0 = com.facebook.aura.applock.AppLockRepository.this
                X.BLG<com.facebook.aura.applock.AppLockTimeout> r0 = r0._timeout
                r0.Af8(r7)
                if (r1 == 0) goto L2d
                com.facebook.aura.applock.AppLockRepository r0 = com.facebook.aura.applock.AppLockRepository.this
                X.BLG<java.lang.Boolean> r0 = r0._shouldLock
                X.AnonymousClass003.A14(r0, r2)
            L2d:
                com.facebook.aura.applock.AppLockRepository r2 = com.facebook.aura.applock.AppLockRepository.this
                X.3UX r1 = r2.scope
                com.facebook.aura.applock.AppLockRepository$1$1 r0 = new com.facebook.aura.applock.AppLockRepository$1$1
                r0.<init>(r2, r5)
                X.6ys r4 = X.C6ys.A00
                java.lang.Integer r3 = X.C79.A00
                X.GAo.A02(r3, r4, r0, r1)
                com.facebook.aura.applock.AppLockRepository r2 = com.facebook.aura.applock.AppLockRepository.this
                X.3UX r1 = r2.scope
                com.facebook.aura.applock.AppLockRepository$1$2 r0 = new com.facebook.aura.applock.AppLockRepository$1$2
                r0.<init>(r2, r5)
                X.GAo.A02(r3, r4, r0, r1)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L4c:
                X.Hwg.A00(r7)
                com.facebook.aura.applock.AppLockRepository r0 = com.facebook.aura.applock.AppLockRepository.this
                com.facebook.aura.applock.AppLockDataStore r0 = r0.dataStore
                X.20Q<java.lang.Boolean> r0 = r0.isEnabledFlow
                r6.label = r2
                java.lang.Object r7 = X.AbstractC9777Gfy.A02(r0, r6)
                if (r7 != r4) goto L61
                return r4
            L5e:
                X.Hwg.A00(r7)
            L61:
                boolean r1 = X.AnonymousClass001.A1X(r7)
                com.facebook.aura.applock.AppLockRepository r0 = com.facebook.aura.applock.AppLockRepository.this
                com.facebook.aura.applock.AppLockDataStore r0 = r0.dataStore
                X.20Q<com.facebook.aura.applock.AppLockTimeout> r0 = r0.timeoutFlow
                r6.Z$0 = r1
                r6.label = r3
                java.lang.Object r7 = X.AbstractC9777Gfy.A02(r0, r6)
                if (r7 != r4) goto L11
                return r4
            L76:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.applock.AppLockRepository.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public interface Clock {
        long elapsedRealtimeMs();
    }

    /* renamed from: com.facebook.aura.applock.AppLockRepository$markUnlocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C109381 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ long $unlockedAt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109381(long j) {
            super(0);
            this.$unlockedAt = j;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnonymousClass004.A1D(false, AppLockRepository.this._shouldLock);
            AppLockRepository appLockRepository = AppLockRepository.this;
            Long lValueOf = Long.valueOf(this.$unlockedAt);
            appLockRepository.lastActiveAtElapsedRealtimeMs = lValueOf;
            CFK.A03(lValueOf, AppLockRepositoryKt.TAG, "markUnlocked at %d ms");
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.applock.AppLockRepository$onBackground$1, reason: invalid class name and case insensitive filesystem */
    public final class C109391 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ long $backgroundedAt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109391(long j) {
            super(0);
            this.$backgroundedAt = j;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (!AnonymousClass003.A1Z(AppLockRepository.this._isEnabled)) {
                CFK.A05(AppLockRepositoryKt.TAG, "onBackground: app lock disabled, not arming");
                return;
            }
            AppLockRepository appLockRepository = AppLockRepository.this;
            Long lValueOf = Long.valueOf(this.$backgroundedAt);
            appLockRepository.lastActiveAtElapsedRealtimeMs = lValueOf;
            CFK.A03(lValueOf, AppLockRepositoryKt.TAG, "onBackground: armed at %d ms");
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.applock.AppLockRepository$onForeground$1, reason: invalid class name and case insensitive filesystem */
    public final class C109401 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ long $foregroundedAt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109401(long j) {
            super(0);
            this.$foregroundedAt = j;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AppLockRepository.this.lockIfTimeoutExpired(this.$foregroundedAt);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.applock.AppLockRepository", f = "AppLockRepository.kt", l = {84, ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "setEnabled", v = 2)
    /* renamed from: com.facebook.aura.applock.AppLockRepository$setEnabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C109411 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C109411(HtJ<? super C109411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppLockRepository.this.setEnabled(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.applock.AppLockRepository", f = "AppLockRepository.kt", l = {94, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "setTimeout", v = 2)
    /* renamed from: com.facebook.aura.applock.AppLockRepository$setTimeout$1, reason: invalid class name and case insensitive filesystem */
    public final class C109421 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C109421(HtJ<? super C109421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppLockRepository.this.setTimeout(null, this);
        }
    }

    public final class Companion {
        public final AppLockRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AppLockRepository) abstractC3358CGz.A03(AppLockRepository.class, new AppLockRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public final AppLockRepository createForTest(AppLockDataStore appLockDataStore, Clock clock, C3UX c3ux) {
            AnonymousClass005.A0x(appLockDataStore, clock, c3ux);
            return new AppLockRepository(appLockDataStore, clock, c3ux);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearLastActiveAt() {
        synchronized (this.lifecycleUpdateLock) {
            this.lastActiveAtElapsedRealtimeMs = null;
        }
    }

    private final void enqueueLifecycleUpdate(Function0<Unit> function0) {
        synchronized (this.lifecycleUpdateLock) {
            HoC hoC = this.lifecycleUpdateJob;
            if (hoC == null) {
                hoC = this.initialization;
            }
            this.lifecycleUpdateJob = AnonymousClass001.A11(new AppLockRepository$enqueueLifecycleUpdate$1$1(hoC, this, function0, null), this.scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lockIfTimeoutExpired(long j) {
        if (!AnonymousClass003.A1Z(this._isEnabled)) {
            CFK.A05(AppLockRepositoryKt.TAG, "onForeground: app lock disabled, nothing to do");
            return;
        }
        if (AnonymousClass003.A1Z(this._shouldLock)) {
            CFK.A06(AppLockRepositoryKt.TAG, "onForeground: already locked; overlay should be on screen");
            return;
        }
        long seconds = this._timeout.getValue().getSeconds() * 1000;
        Long l = this.lastActiveAtElapsedRealtimeMs;
        if (l == null) {
            CFK.A06(AppLockRepositoryKt.TAG, "onForeground: no last-active timestamp, locking (fail-closed)");
        } else {
            long jLongValue = j - l.longValue();
            Long lValueOf = Long.valueOf(jLongValue);
            Long lValueOf2 = Long.valueOf(seconds);
            if (jLongValue < seconds) {
                CFK.A02(lValueOf, lValueOf2, AppLockRepositoryKt.TAG, "onForeground: not locking, away %d ms < timeout %d ms");
                this.lastActiveAtElapsedRealtimeMs = Long.valueOf(j);
                return;
            }
            CFK.A02(lValueOf, lValueOf2, AppLockRepositoryKt.TAG, "onForeground: locking, away %d ms >= timeout %d ms");
        }
        AnonymousClass004.A1D(true, this._shouldLock);
    }

    public final Object awaitLoaded(HtJ<? super Unit> htJ) {
        return C3cG.A0U(this.initialization.APQ(htJ));
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        C9286GCn.A00(null, AnonymousClass001.A0h(), (C9286GCn) this._shouldLock);
        clearLastActiveAt();
        Hxb.A03(null, this.scope);
    }

    public final C1BN<Boolean> getShouldLock() {
        return this.shouldLock;
    }

    public final C1BN<AppLockTimeout> getTimeout() {
        return C3Pi.A00(this._timeout);
    }

    public final C1BN<Boolean> isEnabled() {
        return C3Pi.A00(this._isEnabled);
    }

    public final void markUnlocked() {
        enqueueLifecycleUpdate(new C109381(this.clock.elapsedRealtimeMs()));
    }

    public final void onBackground() {
        enqueueLifecycleUpdate(new C109391(this.clock.elapsedRealtimeMs()));
    }

    public final void onForeground() {
        long jElapsedRealtimeMs = this.clock.elapsedRealtimeMs();
        CFK.A03(Long.valueOf(jElapsedRealtimeMs), AppLockRepositoryKt.TAG, "onForeground: enqueued at %d ms");
        enqueueLifecycleUpdate(new C109401(jElapsedRealtimeMs));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setEnabled(boolean r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.applock.AppLockRepository.C109411
            if (r0 == 0) goto L58
            r5 = r8
            com.facebook.aura.applock.AppLockRepository$setEnabled$1 r5 = (com.facebook.aura.applock.AppLockRepository.C109411) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L38
            if (r2 == r0) goto L46
            if (r2 != r1) goto L5e
            boolean r7 = r5.Z$0
            X.Hwg.A00(r4)
        L25:
            X.BLG<java.lang.Boolean> r0 = r6._isEnabled
            X.C3cJ.A0C(r0, r7)
            if (r7 != 0) goto L35
            X.BLG<java.lang.Boolean> r1 = r6._shouldLock
            r0 = 0
            X.AnonymousClass003.A14(r1, r0)
            r6.clearLastActiveAt()
        L35:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L38:
            X.Hwg.A00(r4)
            r5.Z$0 = r7
            r5.label = r0
            java.lang.Object r0 = r6.awaitLoaded(r5)
            if (r0 != r3) goto L4b
            return r3
        L46:
            boolean r7 = r5.Z$0
            X.Hwg.A00(r4)
        L4b:
            com.facebook.aura.applock.AppLockDataStore r0 = r6.dataStore
            r5.Z$0 = r7
            r5.label = r1
            java.lang.Object r0 = r0.setEnabled(r7, r5)
            if (r0 != r3) goto L25
            return r3
        L58:
            com.facebook.aura.applock.AppLockRepository$setEnabled$1 r5 = new com.facebook.aura.applock.AppLockRepository$setEnabled$1
            r5.<init>(r8)
            goto L12
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.applock.AppLockRepository.setEnabled(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setTimeout(com.facebook.aura.applock.AppLockTimeout r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.applock.AppLockRepository.C109421
            if (r0 == 0) goto L4f
            r5 = r8
            com.facebook.aura.applock.AppLockRepository$setTimeout$1 r5 = (com.facebook.aura.applock.AppLockRepository.C109421) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L2d
            if (r2 == r0) goto L3b
            if (r2 != r1) goto L55
            java.lang.Object r7 = r5.L$0
            X.Hwg.A00(r4)
        L25:
            X.BLG<com.facebook.aura.applock.AppLockTimeout> r0 = r6._timeout
            r0.Af8(r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2d:
            X.Hwg.A00(r4)
            r5.L$0 = r7
            r5.label = r0
            java.lang.Object r0 = r6.awaitLoaded(r5)
            if (r0 != r3) goto L42
            return r3
        L3b:
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.applock.AppLockTimeout r7 = (com.facebook.aura.applock.AppLockTimeout) r7
            X.Hwg.A00(r4)
        L42:
            com.facebook.aura.applock.AppLockDataStore r0 = r6.dataStore
            r5.L$0 = r7
            r5.label = r1
            java.lang.Object r0 = r0.setTimeout(r7, r5)
            if (r0 != r3) goto L25
            return r3
        L4f:
            com.facebook.aura.applock.AppLockRepository$setTimeout$1 r5 = new com.facebook.aura.applock.AppLockRepository$setTimeout$1
            r5.<init>(r8)
            goto L12
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.applock.AppLockRepository.setTimeout(com.facebook.aura.applock.AppLockTimeout, X.HtJ):java.lang.Object");
    }

    public AppLockRepository(AppLockDataStore appLockDataStore, Clock clock, C3UX c3ux) {
        this.dataStore = appLockDataStore;
        this.clock = clock;
        this.scope = c3ux;
        Boolean boolA0h = AnonymousClass001.A0h();
        this._isEnabled = C3cG.A14(boolA0h);
        this._timeout = HnJ.A01(AppLockTimeout.DEFAULT);
        C9286GCn c9286GCnA14 = C3cG.A14(boolA0h);
        this._shouldLock = c9286GCnA14;
        this.shouldLock = C3cG.A11(c9286GCnA14);
        this.lifecycleUpdateLock = C3cG.A0T();
        this.initialization = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass1(null), c3ux);
    }

    public /* synthetic */ AppLockRepository(AppLockDataStore appLockDataStore, Clock clock, C3UX c3ux, C06H c06h) {
        this(appLockDataStore, clock, c3ux);
    }
}
