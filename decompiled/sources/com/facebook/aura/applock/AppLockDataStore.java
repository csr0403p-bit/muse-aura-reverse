package com.facebook.aura.applock;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C6JO;
import X.C6JZ;
import X.C6O2;
import X.C7384Etj;
import X.C78T;
import X.CH0;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7549F2g;
import androidx.datastore.preferences.core.Preferences;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AppLockDataStore implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final C6JZ<Boolean> KEY_ENABLED = new C6JZ<>("enabled");
    public static final C6JZ<Integer> KEY_TIMEOUT_SECONDS = new C6JZ<>("timeout_seconds");
    public static final C3UX cleanupScope = C78T.A01(AnonymousClass001.A0y(), null);
    public static final Map<String, C6JO<Preferences>> dataStoreInstances = C3cG.A0j();
    public final C6JO<Preferences> dataStore;
    public final C20Q<Boolean> isEnabledFlow;
    public final C20Q<AppLockTimeout> timeoutFlow;

    public final class Companion {
        public final AppLockDataStore createForTest(C6JO<Preferences> c6jo) {
            C7384Etj.A0Y(c6jo, 0);
            return new AppLockDataStore(c6jo);
        }

        public final AppLockDataStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AppLockDataStore) abstractC3358CGz.A03(AppLockDataStore.class, new AppLockDataStore$Companion$getInstance$1(abstractC3358CGz));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String dataStoreNameForUser(AbstractC3358CGz abstractC3358CGz) {
            return FGI.A0M("app_lock_", ((CH0) abstractC3358CGz).A01);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.applock.AppLockDataStore$clearUserData$1", f = "AppLockDataStore.kt", l = {50}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.applock.AppLockDataStore$clearUserData$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.applock.AppLockDataStore$clearUserData$1$1", f = "AppLockDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.applock.AppLockDataStore$clearUserData$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00331 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public C00331(HtJ<? super C00331> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C00331 c00331 = new C00331(htJ);
                c00331.L$0 = obj;
                return c00331;
            }

            @Override // X.G0V
            public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
                C00331 c00331 = new C00331(htJ);
                c00331.L$0 = c6o2;
                return c00331.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                C6O2 c6o2 = (C6O2) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                C6O2.A01(c6o2);
                c6o2.A00.clear();
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AppLockDataStore.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AppLockDataStore.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AppLockDataStore appLockDataStore = AppLockDataStore.this;
                    int i2 = AppLockDataStore.$stable;
                    C6JO<Preferences> c6jo = appLockDataStore.dataStore;
                    C00331 c00331 = new C00331(null);
                    this.label = 1;
                    if (C6JO.A00(c6jo, c00331, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.applock.AppLockDataStore", f = "AppLockDataStore.kt", l = {40}, m = "setEnabled", v = 2)
    /* renamed from: com.facebook.aura.applock.AppLockDataStore$setEnabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C109351 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C109351(HtJ<? super C109351> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppLockDataStore.this.setEnabled(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.applock.AppLockDataStore$setEnabled$2", f = "AppLockDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.applock.AppLockDataStore$setEnabled$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $enabled;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$enabled = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$enabled, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C6O2 c6o2 = (C6O2) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            C6O2.A02(c6o2, AppLockDataStore.KEY_ENABLED, this.$enabled);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c6o2, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.applock.AppLockDataStore", f = "AppLockDataStore.kt", l = {44}, m = "setTimeout", v = 2)
    /* renamed from: com.facebook.aura.applock.AppLockDataStore$setTimeout$1, reason: invalid class name and case insensitive filesystem */
    public final class C109361 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C109361(HtJ<? super C109361> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppLockDataStore.this.setTimeout(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.applock.AppLockDataStore$setTimeout$2", f = "AppLockDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.applock.AppLockDataStore$setTimeout$2, reason: invalid class name and case insensitive filesystem */
    public final class C109372 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AppLockTimeout $timeout;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109372(AppLockTimeout appLockTimeout, HtJ<? super C109372> htJ) {
            super(2, htJ);
            this.$timeout = appLockTimeout;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C109372 c109372 = new C109372(this.$timeout, htJ);
            c109372.L$0 = obj;
            return c109372;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C6O2 c6o2 = (C6O2) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            c6o2.A08(AppLockDataStore.KEY_TIMEOUT_SECONDS, C3cG.A0R(this.$timeout.getSeconds()));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
            return ((C109372) create(c6o2, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass001.A1J(new AnonymousClass1(null), cleanupScope);
    }

    public final C20Q<AppLockTimeout> getTimeoutFlow() {
        return this.timeoutFlow;
    }

    public final C20Q<Boolean> isEnabledFlow() {
        return this.isEnabledFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setEnabled(boolean r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.applock.AppLockDataStore.C109351
            if (r0 == 0) goto L39
            r5 = r8
            com.facebook.aura.applock.AppLockDataStore$setEnabled$1 r5 = (com.facebook.aura.applock.AppLockDataStore.C109351) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3f
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.6JO<androidx.datastore.preferences.core.Preferences> r2 = r6.dataStore
            r1 = 0
            com.facebook.aura.applock.AppLockDataStore$setEnabled$2 r0 = new com.facebook.aura.applock.AppLockDataStore$setEnabled$2
            r0.<init>(r7, r1)
            r5.Z$0 = r7
            r5.label = r3
            java.lang.Object r0 = X.C6JO.A00(r2, r0, r5)
            if (r0 != r4) goto L20
            return r4
        L39:
            com.facebook.aura.applock.AppLockDataStore$setEnabled$1 r5 = new com.facebook.aura.applock.AppLockDataStore$setEnabled$1
            r5.<init>(r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.applock.AppLockDataStore.setEnabled(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setTimeout(com.facebook.aura.applock.AppLockTimeout r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.applock.AppLockDataStore.C109361
            if (r0 == 0) goto L39
            r5 = r8
            com.facebook.aura.applock.AppLockDataStore$setTimeout$1 r5 = (com.facebook.aura.applock.AppLockDataStore.C109361) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3f
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.6JO<androidx.datastore.preferences.core.Preferences> r2 = r6.dataStore
            r1 = 0
            com.facebook.aura.applock.AppLockDataStore$setTimeout$2 r0 = new com.facebook.aura.applock.AppLockDataStore$setTimeout$2
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.C6JO.A00(r2, r0, r5)
            if (r0 != r4) goto L20
            return r4
        L39:
            com.facebook.aura.applock.AppLockDataStore$setTimeout$1 r5 = new com.facebook.aura.applock.AppLockDataStore$setTimeout$1
            r5.<init>(r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.applock.AppLockDataStore.setTimeout(com.facebook.aura.applock.AppLockTimeout, X.HtJ):java.lang.Object");
    }

    public AppLockDataStore(C6JO<Preferences> c6jo) {
        this.dataStore = c6jo;
        C20Q<Preferences> c20qAEa = c6jo.AEa();
        this.isEnabledFlow = new AppLockDataStore$special$$inlined$map$1(c20qAEa);
        this.timeoutFlow = new AppLockDataStore$special$$inlined$map$2(c20qAEa);
    }

    public /* synthetic */ AppLockDataStore(C6JO c6jo, C06H c06h) {
        this(c6jo);
    }
}
