package com.facebook.aura.file.repo;

import X.A3q;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C4oT;
import X.C7384Etj;
import X.C7BY;
import X.C8eO;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class HatchDeletedMediaStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final String KEY_DELETED_MEDIA = "lobster_deleted_media_keys";
    public static final String KEY_FAILED_LOAD_MEDIA = "lobster_failed_load_media_keys";
    public final BLG<Set<String>> _deletedKeys;
    public final BLG<Set<String>> _failedLoadKeys;
    public final BLG<Set<String>> _sessionHiddenKeys;
    public boolean cleared;
    public final C1BN<Set<String>> deletedKeys;
    public final C1BN<Set<String>> failedLoadKeys;
    public final C3UX failedLoadProbeScope;
    public final SingleFlight failedLoadProbeSingleFlight;
    public final Object persistenceLock;
    public final C1BN<Set<String>> sessionHiddenKeys;
    public final AbstractC3358CGz userSession;

    public final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[PHI: r1
  0x00a1: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v12 java.lang.String) binds: [B:5:0x0012, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String canonicalKey(java.lang.String r7) {
            /*
                r6 = this;
                r3 = 0
                X.C7384Etj.A0Y(r7, r3)
                boolean r0 = X.C7BY.A0j(r7)
                r5 = 0
                if (r0 != 0) goto Lb8
                java.lang.String r1 = "/fs/raw/"
                boolean r0 = X.C7BY.A0q(r7, r1, r3)
                r2 = 1
                if (r0 != 0) goto La1
                java.lang.String r1 = "/fs/thumbnail/"
                boolean r0 = X.C7BY.A0q(r7, r1, r3)
                if (r0 != 0) goto La1
                java.lang.String r0 = "http://"
                boolean r0 = r7.startsWith(r0)
                if (r0 != 0) goto Lb3
                java.lang.String r0 = "https://"
                boolean r0 = r7.startsWith(r0)
                if (r0 != 0) goto Lb3
                java.lang.String r0 = "content://"
                boolean r0 = r7.startsWith(r0)
                if (r0 != 0) goto Lb3
                java.lang.String r1 = "sandbox://"
                boolean r0 = r7.startsWith(r1)
                if (r0 != 0) goto L98
                java.lang.String r1 = "hatch-slides://"
                boolean r0 = r7.startsWith(r1)
                if (r0 != 0) goto L98
                java.lang.String r1 = "/home/hatch/"
                boolean r0 = r7.startsWith(r1)
                if (r0 != 0) goto L8f
                java.lang.String r1 = "~/"
                boolean r0 = r7.startsWith(r1)
                if (r0 != 0) goto L8f
                X.HxE r0 = X.AnonymousClass002.A0q(r7, r3)
            L58:
                A r1 = r0.first
                java.lang.String r1 = (java.lang.String) r1
                B r0 = r0.second
                boolean r0 = X.AnonymousClass001.A1X(r0)
                if (r0 == 0) goto L6a
                com.facebook.aura.gateway.WorkspaceUriResolver r0 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
                java.lang.String r1 = r0.decodeWorkspacePath(r1)
            L6a:
                char[] r0 = new char[r2]
                r4 = 47
                r0[r3] = r4
                java.lang.String r1 = X.C7BY.A0a(r1, r0)
                java.lang.String r0 = "workspace/"
                java.lang.String r1 = X.C7BY.A0K(r0, r1)
                char[] r0 = new char[r2]
                r0[r3] = r4
                java.lang.String r1 = X.C7BY.A0Z(r1, r0)
                java.lang.String r0 = "/index.html"
                java.lang.String r1 = X.C7BY.A0L(r0, r1)
                int r0 = r1.length()
                if (r0 == 0) goto Lb8
                return r1
            L8f:
                java.lang.String r4 = X.C7BY.A0K(r1, r7)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
                goto Lad
            L98:
                java.lang.String r0 = r6.stripUrlQueryAndFragment(r7)
                java.lang.String r4 = X.C7BY.A0K(r1, r0)
                goto La9
            La1:
                java.lang.String r0 = r6.stripUrlQueryAndFragment(r7)
                java.lang.String r4 = X.C7BY.A0U(r0, r1, r0)
            La9:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            Lad:
                X.HxE r0 = new X.HxE
                r0.<init>(r4, r1)
                goto L58
            Lb3:
                java.lang.String r5 = r6.stripUrlQueryAndFragment(r7)
                return r5
            Lb8:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.repo.HatchDeletedMediaStore.Companion.canonicalKey(java.lang.String):java.lang.String");
        }

        public final HatchDeletedMediaStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchDeletedMediaStore) abstractC3358CGz.A03(HatchDeletedMediaStore.class, new HatchDeletedMediaStore$Companion$getInstance$1(abstractC3358CGz));
        }

        private final String stripUrlQueryAndFragment(String str) {
            String strA0S = C7BY.A0S(str, str, '?');
            return C7BY.A0S(strA0S, strA0S, '#');
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.repo.HatchDeletedMediaStore$refreshFailedLoadState$1", f = "HatchDeletedMediaStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.repo.HatchDeletedMediaStore$refreshFailedLoadState$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<String, HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return AnonymousClass001.A0i();
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Boolean> htJ) {
            return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.repo.HatchDeletedMediaStore$refreshFailedLoadState$3", f = "HatchDeletedMediaStore.kt", l = {75}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.repo.HatchDeletedMediaStore$refreshFailedLoadState$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $key;
        public final /* synthetic */ G0V<String, HtJ<? super Boolean>, Object> $shouldMarkFailedToLoad;
        public final /* synthetic */ String $urlOrPath;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.file.repo.HatchDeletedMediaStore$refreshFailedLoadState$3$1", f = "HatchDeletedMediaStore.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT, 80}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.file.repo.HatchDeletedMediaStore$refreshFailedLoadState$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ G0V<String, HtJ<? super Boolean>, Object> $shouldMarkFailedToLoad;
            public final /* synthetic */ String $urlOrPath;
            public Object L$0;
            public int label;
            public final /* synthetic */ HatchDeletedMediaStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(String str, HatchDeletedMediaStore hatchDeletedMediaStore, G0V<? super String, ? super HtJ<? super Boolean>, ? extends Object> g0v, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.$urlOrPath = str;
                this.this$0 = hatchDeletedMediaStore;
                this.$shouldMarkFailedToLoad = g0v;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.$urlOrPath, this.this$0, this.$shouldMarkFailedToLoad, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[PHI: r0 r1
  0x0040: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v10 java.lang.String) binds: [B:18:0x003c, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r1v4 com.facebook.aura.file.repo.HatchDeletedMediaStore) = (r1v3 com.facebook.aura.file.repo.HatchDeletedMediaStore), (r1v5 com.facebook.aura.file.repo.HatchDeletedMediaStore) binds: [B:18:0x003c, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
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
                    r5 = 1
                    if (r0 == 0) goto L1f
                    if (r0 == r5) goto L33
                    if (r0 != r3) goto L66
                    X.Hwg.A00(r7)
                Lf:
                    boolean r2 = X.AnonymousClass001.A1X(r7)
                    com.facebook.aura.file.repo.HatchDeletedMediaStore r1 = r6.this$0
                    java.lang.String r0 = r6.$urlOrPath
                    if (r2 == 0) goto L40
                    r1.markFailedToLoad(r0)
                L1c:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L1f:
                    X.Hwg.A00(r7)
                    com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
                    java.lang.String r1 = r6.$urlOrPath
                    com.facebook.aura.file.repo.HatchDeletedMediaStore r0 = r6.this$0
                    X.CGz r0 = r0.userSession
                    r6.label = r5
                    java.lang.Object r7 = r2.statFile(r1, r0, r6)
                    if (r7 != r4) goto L36
                    return r4
                L33:
                    X.Hwg.A00(r7)
                L36:
                    com.facebook.aura.gateway.HatchFileOperations$StatResult r7 = (com.facebook.aura.gateway.HatchFileOperations.StatResult) r7
                    boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Success
                    if (r0 == 0) goto L44
                    com.facebook.aura.file.repo.HatchDeletedMediaStore r1 = r6.this$0
                    java.lang.String r0 = r6.$urlOrPath
                L40:
                    r1.clearFailedToLoad(r0)
                    goto L1c
                L44:
                    boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Failed
                    if (r0 == 0) goto L1c
                    com.facebook.aura.gateway.HatchFileOperations$StatResult$Failed r7 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Failed) r7
                    java.lang.Integer r0 = r7.statusCode
                    if (r0 == 0) goto L1c
                    int r1 = r0.intValue()
                    r0 = 404(0x194, float:5.66E-43)
                    if (r1 != r0) goto L1c
                    X.G0V<java.lang.String, X.HtJ<? super java.lang.Boolean>, java.lang.Object> r2 = r6.$shouldMarkFailedToLoad
                    java.lang.String r1 = r6.$urlOrPath
                    r0 = 0
                    r6.L$0 = r0
                    r6.label = r3
                    java.lang.Object r7 = r2.invoke(r1, r6)
                    if (r7 != r4) goto Lf
                    return r4
                L66:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.repo.HatchDeletedMediaStore.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, String str2, G0V<? super String, ? super HtJ<? super Boolean>, ? extends Object> g0v, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$key = str;
            this.$urlOrPath = str2;
            this.$shouldMarkFailedToLoad = g0v;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeletedMediaStore.this.new AnonymousClass3(this.$key, this.$urlOrPath, this.$shouldMarkFailedToLoad, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDeletedMediaStore hatchDeletedMediaStore = HatchDeletedMediaStore.this;
                SingleFlight singleFlight = hatchDeletedMediaStore.failedLoadProbeSingleFlight;
                String str = this.$key;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$urlOrPath, hatchDeletedMediaStore, this.$shouldMarkFailedToLoad, null);
                this.label = 1;
                if (singleFlight.invoke(str, anonymousClass1, this) == enumC10460Hji) {
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
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void clearFailedToLoad(String str) {
        C7384Etj.A0Y(str, 0);
        String strCanonicalKey = Companion.canonicalKey(str);
        if (strCanonicalKey != null) {
            synchronized (this.persistenceLock) {
                if (!this.cleared && AnonymousClass006.A1a(strCanonicalKey, this._failedLoadKeys)) {
                    while (!AnonymousClass007.A1N(strCanonicalKey, this._failedLoadKeys)) {
                    }
                    persistLocked();
                }
            }
        }
    }

    public final void hideForSession(String str) {
        C7384Etj.A0Y(str, 0);
        String strCanonicalKey = Companion.canonicalKey(str);
        if (strCanonicalKey != null) {
            synchronized (this.persistenceLock) {
                if (!this.cleared) {
                    do {
                    } while (!AnonymousClass007.A1O(strCanonicalKey, this._sessionHiddenKeys));
                }
            }
        }
    }

    public final boolean isHidden(String str) {
        String strCanonicalKey;
        if (str == null || (strCanonicalKey = Companion.canonicalKey(str)) == null) {
            return false;
        }
        return AnonymousClass006.A1a(strCanonicalKey, this._deletedKeys) || AnonymousClass006.A1a(strCanonicalKey, this._failedLoadKeys) || AnonymousClass006.A1a(strCanonicalKey, this._sessionHiddenKeys);
    }

    public final void markDeleted(String str) {
        C7384Etj.A0Y(str, 0);
        String strCanonicalKey = Companion.canonicalKey(str);
        if (strCanonicalKey != null) {
            synchronized (this.persistenceLock) {
                if (!this.cleared) {
                    while (!AnonymousClass007.A1O(strCanonicalKey, this._deletedKeys)) {
                    }
                    persistLocked();
                }
            }
        }
    }

    public final void markFailedToLoad(String str) {
        C7384Etj.A0Y(str, 0);
        String strCanonicalKey = Companion.canonicalKey(str);
        if (strCanonicalKey != null) {
            synchronized (this.persistenceLock) {
                if (!this.cleared) {
                    while (!AnonymousClass007.A1O(strCanonicalKey, this._failedLoadKeys)) {
                    }
                    persistLocked();
                }
            }
        }
    }

    public final void refreshFailedLoadState(String str, G0V<? super String, ? super HtJ<? super Boolean>, ? extends Object> g0v) {
        AnonymousClass003.A0u(str, g0v);
        String strCanonicalKey = Companion.canonicalKey(str);
        if (strCanonicalKey != null) {
            synchronized (this.persistenceLock) {
                if (!this.cleared && !AnonymousClass006.A1a(strCanonicalKey, this._deletedKeys)) {
                    if (!AnonymousClass006.A1a(strCanonicalKey, this._sessionHiddenKeys)) {
                        AnonymousClass001.A1J(new AnonymousClass3(strCanonicalKey, str, g0v, null), this.failedLoadProbeScope);
                    }
                }
            }
        }
    }

    public final void unmarkDeleted(String str) {
        C7384Etj.A0Y(str, 0);
        String strCanonicalKey = Companion.canonicalKey(str);
        if (strCanonicalKey != null) {
            synchronized (this.persistenceLock) {
                if (!this.cleared) {
                    while (!AnonymousClass007.A1N(strCanonicalKey, this._deletedKeys)) {
                    }
                    while (!AnonymousClass007.A1N(strCanonicalKey, this._failedLoadKeys)) {
                    }
                    persistLocked();
                }
            }
        }
    }

    private final C4oT getPrefs() {
        return HatchPrefsStore.INSTANCE.userPrefs(this.userSession);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshFailedLoadState$default(HatchDeletedMediaStore hatchDeletedMediaStore, String str, G0V g0v, int i, Object obj) {
        if ((i & 2) != 0) {
            g0v = new AnonymousClass1(null);
        }
        hatchDeletedMediaStore.refreshFailedLoadState(str, g0v);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.persistenceLock) {
            this.cleared = true;
            BLG<Set<String>> blg = this._deletedKeys;
            A3q a3q = A3q.A00;
            blg.Af8(a3q);
            this._failedLoadKeys.Af8(a3q);
            this._sessionHiddenKeys.Af8(a3q);
            BzK bzKA9q = getPrefs().A9q();
            bzKA9q.Aae(KEY_DELETED_MEDIA);
            bzKA9q.Aae(KEY_FAILED_LOAD_MEDIA);
            bzKA9q.apply();
        }
        Hxb.A03(null, this.failedLoadProbeScope);
        this.failedLoadProbeSingleFlight.clearAndCancelAll();
    }

    public final C1BN<Set<String>> getDeletedKeys() {
        return this.deletedKeys;
    }

    public final C1BN<Set<String>> getFailedLoadKeys() {
        return this.failedLoadKeys;
    }

    public final C1BN<Set<String>> getSessionHiddenKeys() {
        return this.sessionHiddenKeys;
    }

    public /* synthetic */ HatchDeletedMediaStore(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    private final void persistLocked() {
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.A09(KEY_DELETED_MEDIA, this._deletedKeys.getValue());
        bzKA9q.A09(KEY_FAILED_LOAD_MEDIA, this._failedLoadKeys.getValue());
        bzKA9q.apply();
    }

    public HatchDeletedMediaStore(AbstractC3358CGz abstractC3358CGz) {
        Set<String> setA0g;
        Set<String> setA0g2;
        this.userSession = abstractC3358CGz;
        C4oT prefs = getPrefs();
        A3q a3q = A3q.A00;
        Set<String> stringSet = prefs.getStringSet(KEY_DELETED_MEDIA, a3q);
        C9286GCn c9286GCnA01 = HnJ.A01((stringSet == null || (setA0g2 = AbstractC0878AGe.A0g(stringSet)) == null) ? a3q : setA0g2);
        this._deletedKeys = c9286GCnA01;
        Set<String> stringSet2 = getPrefs().getStringSet(KEY_FAILED_LOAD_MEDIA, a3q);
        C9286GCn c9286GCnA012 = HnJ.A01((stringSet2 == null || (setA0g = AbstractC0878AGe.A0g(stringSet2)) == null) ? a3q : setA0g);
        this._failedLoadKeys = c9286GCnA012;
        C9286GCn c9286GCnA013 = HnJ.A01(a3q);
        this._sessionHiddenKeys = c9286GCnA013;
        this.failedLoadProbeSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        this.failedLoadProbeScope = Hxb.A02(AnonymousClass001.A0y().plus(new C8eO(null)).plus(new HatchDeletedMediaStore$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
        this.persistenceLock = new Object();
        this.deletedKeys = new C3Pi(null, c9286GCnA01);
        this.failedLoadKeys = new C3Pi(null, c9286GCnA012);
        this.sessionHiddenKeys = new C3Pi(null, c9286GCnA013);
    }
}
