package com.facebook.aura.auth;

import X.A3q;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass801;
import X.BLG;
import X.BzK;
import X.C06G;
import X.C06H;
import X.C0861A6i;
import X.C1BN;
import X.C3357CGy;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60N;
import X.C7384Etj;
import X.C7BY;
import X.C9258GBl;
import X.C9286GCn;
import X.CFK;
import X.CGw;
import X.CH0;
import X.CHA;
import X.F60;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC2261BLa;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.commands.health.MC;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.startup.login.HatchRefreshTokenGate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraSessionManager {
    public static final AuraSessionManager INSTANCE = new AuraSessionManager();
    public static final BLG<SessionState> _state;
    public static SignOutClaim activeSignOutClaim;
    public static long latestSessionGeneration;
    public static final Object lock;
    public static final InterfaceC2261BLa refreshMutex;
    public static final List<Runnable> signOutCallbacks;
    public static final C1BN<SessionState> state;

    /* loaded from: classes3.dex */
    public interface AbraTokenRefreshResult {

        public final class Failed implements AbraTokenRefreshResult {
            public final String accessToken;

            public final String getAccessToken() {
                return this.accessToken;
            }

            public Failed(String str) {
                this.accessToken = str;
            }
        }

        public final class Retry implements AbraTokenRefreshResult {
            public final String accessToken;

            public Retry(String str) {
                C7384Etj.A0Y(str, 0);
                this.accessToken = str;
            }

            public final String getAccessToken() {
                return this.accessToken;
            }
        }

        /* loaded from: classes5.dex */
        public final class SessionChanged implements AbraTokenRefreshResult {
            public static final SessionChanged INSTANCE = new SessionChanged();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SessionChanged);
            }

            public String toString() {
                return "SessionChanged";
            }

            public int hashCode() {
                return -1100769633;
            }
        }

        public final class Unavailable implements AbraTokenRefreshResult {
            public static final Unavailable INSTANCE = new Unavailable();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unavailable);
            }

            public String toString() {
                return "Unavailable";
            }

            public int hashCode() {
                return -474847089;
            }
        }
    }

    public final class PostConsolidationCredentialRefreshWindow {
        public int activeCount;

        public final int getActiveCount() {
            return this.activeCount;
        }

        public PostConsolidationCredentialRefreshWindow(int i) {
            this.activeCount = i;
        }

        public final void setActiveCount(int i) {
            this.activeCount = i;
        }

        public /* synthetic */ PostConsolidationCredentialRefreshWindow(int i, int i2, C06H c06h) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public PostConsolidationCredentialRefreshWindow() {
            this(0);
        }
    }

    public interface PostConsolidationCredentialReplacementResult {

        public final class Applied implements PostConsolidationCredentialReplacementResult {
            public static final Applied INSTANCE = new Applied();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Applied);
            }

            public String toString() {
                return "Applied";
            }

            public int hashCode() {
                return -126047911;
            }
        }

        public final class IdentityMismatch implements PostConsolidationCredentialReplacementResult {
            public static final IdentityMismatch INSTANCE = new IdentityMismatch();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof IdentityMismatch);
            }

            public String toString() {
                return "IdentityMismatch";
            }

            public int hashCode() {
                return -139032752;
            }
        }

        public final class InvalidCredentials implements PostConsolidationCredentialReplacementResult {
            public static final InvalidCredentials INSTANCE = new InvalidCredentials();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCredentials);
            }

            public String toString() {
                return "InvalidCredentials";
            }

            public int hashCode() {
                return -646746583;
            }
        }

        public final class PersistenceFailure implements PostConsolidationCredentialReplacementResult {
            public static final PersistenceFailure INSTANCE = new PersistenceFailure();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof PersistenceFailure);
            }

            public String toString() {
                return "PersistenceFailure";
            }

            public int hashCode() {
                return 187026319;
            }
        }

        public final class SessionChanged implements PostConsolidationCredentialReplacementResult {
            public static final SessionChanged INSTANCE = new SessionChanged();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SessionChanged);
            }

            public String toString() {
                return "SessionChanged";
            }

            public int hashCode() {
                return -1141597470;
            }
        }
    }

    public final class RefreshTokenUpdate {
        public final String sealedToken;

        public final String getSealedToken() {
            return this.sealedToken;
        }

        public RefreshTokenUpdate(String str) {
            this.sealedToken = str;
        }
    }

    public final class SessionSnapshot {
        public final String accessToken;
        public final String frlFingerprint;
        public final AbstractC3358CGz session;

        public SessionSnapshot(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.session = abstractC3358CGz;
            this.accessToken = str;
            this.frlFingerprint = str2;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final String getFrlFingerprint() {
            return this.frlFingerprint;
        }

        public final AbstractC3358CGz getSession() {
            return this.session;
        }
    }

    /* loaded from: classes3.dex */
    public interface SessionState {

        /* loaded from: classes5.dex */
        public final class Activating extends C06G implements SessionState {
            public final AbstractC3358CGz session;
            public final long sessionGeneration;

            public Activating(AbstractC3358CGz abstractC3358CGz, long j) {
                C7384Etj.A0Y(abstractC3358CGz, 0);
                this.session = abstractC3358CGz;
                this.sessionGeneration = j;
            }

            public final Activating copy(AbstractC3358CGz abstractC3358CGz, long j) {
                C7384Etj.A0Y(abstractC3358CGz, 0);
                return new Activating(abstractC3358CGz, j);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Activating) {
                        Activating activating = (Activating) obj;
                        if (!C7384Etj.areEqual(this.session, activating.session) || this.sessionGeneration != activating.sessionGeneration) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Activating copy$default(Activating activating, AbstractC3358CGz abstractC3358CGz, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    abstractC3358CGz = activating.session;
                }
                if ((i & 2) != 0) {
                    j = activating.sessionGeneration;
                }
                C7384Etj.A0Y(abstractC3358CGz, 0);
                return new Activating(abstractC3358CGz, j);
            }

            public final AbstractC3358CGz component1() {
                return this.session;
            }

            public final long component2() {
                return this.sessionGeneration;
            }

            public final AbstractC3358CGz getSession() {
                return this.session;
            }

            public final long getSessionGeneration() {
                return this.sessionGeneration;
            }

            public int hashCode() {
                return AnonymousClass006.A05(this.sessionGeneration, AnonymousClass005.A0E(this.session));
            }

            public String toString() {
                return super.toString();
            }
        }

        /* loaded from: classes5.dex */
        public final class Active extends C06G implements SessionState {
            public final AbstractC3358CGz session;
            public final long sessionGeneration;

            public Active(AbstractC3358CGz abstractC3358CGz, long j) {
                C7384Etj.A0Y(abstractC3358CGz, 0);
                this.session = abstractC3358CGz;
                this.sessionGeneration = j;
            }

            public final Active copy(AbstractC3358CGz abstractC3358CGz, long j) {
                C7384Etj.A0Y(abstractC3358CGz, 0);
                return new Active(abstractC3358CGz, j);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Active) {
                        Active active = (Active) obj;
                        if (!C7384Etj.areEqual(this.session, active.session) || this.sessionGeneration != active.sessionGeneration) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Active copy$default(Active active, AbstractC3358CGz abstractC3358CGz, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    abstractC3358CGz = active.session;
                }
                if ((i & 2) != 0) {
                    j = active.sessionGeneration;
                }
                C7384Etj.A0Y(abstractC3358CGz, 0);
                return new Active(abstractC3358CGz, j);
            }

            public final AbstractC3358CGz component1() {
                return this.session;
            }

            public final long component2() {
                return this.sessionGeneration;
            }

            public final AbstractC3358CGz getSession() {
                return this.session;
            }

            public final long getSessionGeneration() {
                return this.sessionGeneration;
            }

            public int hashCode() {
                return AnonymousClass006.A05(this.sessionGeneration, AnonymousClass005.A0E(this.session));
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Initializing implements SessionState {
            public static final Initializing INSTANCE = new Initializing();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Initializing);
            }

            public String toString() {
                return "Initializing";
            }

            public int hashCode() {
                return -905485854;
            }
        }

        public final class SignedOut implements SessionState {
            public static final SignedOut INSTANCE = new SignedOut();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SignedOut);
            }

            public String toString() {
                return "SignedOut";
            }

            public int hashCode() {
                return -438045411;
            }
        }
    }

    public final class SignOutClaim {
        public boolean cleanupStarted;
        public final AbstractC3358CGz session;
        public final boolean wasActivating;

        public SignOutClaim(AbstractC3358CGz abstractC3358CGz, boolean z) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.session = abstractC3358CGz;
            this.wasActivating = z;
        }

        public final boolean getCleanupStarted$fbandroid_express_aura_java_com_facebook_aura_auth_auth() {
            return this.cleanupStarted;
        }

        public final AbstractC3358CGz getSession$fbandroid_express_aura_java_com_facebook_aura_auth_auth() {
            return this.session;
        }

        public final boolean getWasActivating$fbandroid_express_aura_java_com_facebook_aura_auth_auth() {
            return this.wasActivating;
        }

        public final void setCleanupStarted$fbandroid_express_aura_java_com_facebook_aura_auth_auth(boolean z) {
            this.cleanupStarted = z;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraSessionManager", f = "AuraSessionManager.kt", l = {140}, m = "awaitSettledSession", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraSessionManager$awaitSettledSession$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSessionManager.this.awaitSettledSession(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraSessionManager$awaitSettledSession$2", f = "AuraSessionManager.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraSessionManager$awaitSettledSession$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<SessionState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public final Object invoke(SessionState sessionState, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = sessionState;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(!(obj2 instanceof SessionState.Initializing));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraSessionManager", f = "AuraSessionManager.kt", l = {998, 495, 515}, m = "migrateToRefreshToken", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraSessionManager$migrateToRefreshToken$1, reason: invalid class name and case insensitive filesystem */
    public final class C109771 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C109771(HtJ<? super C109771> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSessionManager.this.migrateToRefreshToken(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraSessionManager", f = "AuraSessionManager.kt", l = {998}, m = "onAuthenticatedResponse", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraSessionManager$onAuthenticatedResponse$1, reason: invalid class name and case insensitive filesystem */
    public final class C109781 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C109781(HtJ<? super C109781> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSessionManager.this.onAuthenticatedResponse(null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraSessionManager", f = "AuraSessionManager.kt", l = {525, MC.wearables_hatch_health_connectors.__CONFIG__}, m = "redeemRefreshToken", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraSessionManager$redeemRefreshToken$1, reason: invalid class name and case insensitive filesystem */
    public final class C109801 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C109801(HtJ<? super C109801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSessionManager.this.redeemRefreshToken(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraSessionManager", f = "AuraSessionManager.kt", l = {998, 422, 429, 446, VideoConfigJsonKt.SOURCE_WIDTH, 464}, m = "refreshAbraToken", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraSessionManager$refreshAbraToken$1, reason: invalid class name and case insensitive filesystem */
    public final class C109811 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C109811(HtJ<? super C109811> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSessionManager.this.refreshAbraToken(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraSessionManager", f = "AuraSessionManager.kt", l = {998}, m = "replaceCredentialsAfterConsolidation", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraSessionManager$replaceCredentialsAfterConsolidation$1, reason: invalid class name and case insensitive filesystem */
    public final class C109821 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C109821(HtJ<? super C109821> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSessionManager.this.replaceCredentialsAfterConsolidation(null, null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraSessionManager$sealRefreshTokenOffMain$2", f = "AuraSessionManager.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraSessionManager$sealRefreshTokenOffMain$2, reason: invalid class name and case insensitive filesystem */
    public final class C109832 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $refreshToken;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109832(String str, HtJ<? super C109832> htJ) {
            super(2, htJ);
            this.$refreshToken = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C109832(this.$refreshToken, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return new C109832(this.$refreshToken, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return AuraSessionManager.INSTANCE.sealRefreshToken(this.$refreshToken);
        }
    }

    private final boolean activateSessionLocked(String str, String str2) {
        CH0 ch0A00 = AbstractC3358CGz.A00(true, str, str2, null, "", null, null, null, A3q.A00);
        AuraUserSessionStore.INSTANCE.saveCurrentUserSession(ch0A00);
        HatchStartupQpl.Companion.markerAnnotate(HatchStartupPoints.ANNOTATION_FROM_LOGIN, true);
        runActivationHandlers(str);
        BLG<SessionState> blg = _state;
        long j = latestSessionGeneration + 1;
        latestSessionGeneration = j;
        blg.Af8(new SessionState.Activating(ch0A00, j));
        return true;
    }

    private final boolean isRefreshTokenEnabled() {
        int i = new int[]{0}[0];
        if (i == 0) {
            return HatchRefreshTokenGate.INSTANCE.isEnabled();
        }
        throw AnonymousClass005.A0c(i);
    }

    private final void runActivationHandlers(String str) {
        int[] iArr = {0, 1, 2};
        int i = 0;
        do {
            try {
                AnonymousClass801.A0e(iArr[i], str);
            } catch (Exception e) {
                CFK.A08(AuraSessionManagerKt.TAG, "Session activation handler failed", e);
            }
            i++;
        } while (i < 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String sealRefreshToken(String str) {
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        return AuraMetaFRLSecureTokenStore.INSTANCE.sealForReplacement(str);
    }

    public final void addSignOutCallback(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        List<Runnable> list = signOutCallbacks;
        synchronized (list) {
            list.add(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean beginPostConsolidationCredentialRefresh(X.AbstractC3358CGz r4) {
        /*
            r3 = this;
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            java.lang.Object r3 = com.facebook.aura.auth.AuraSessionManager.lock
            monitor-enter(r3)
            com.facebook.aura.auth.AuraSessionManager$SignOutClaim r0 = com.facebook.aura.auth.AuraSessionManager.activeSignOutClaim     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L1f
            com.facebook.aura.auth.AuraSessionManager r1 = com.facebook.aura.auth.AuraSessionManager.INSTANCE     // Catch: java.lang.Throwable -> L22
            X.CGz r0 = r1.currentSessionLocked()     // Catch: java.lang.Throwable -> L22
            if (r0 != r4) goto L1f
            com.facebook.aura.auth.AuraSessionManager$PostConsolidationCredentialRefreshWindow r2 = r1.postConsolidationCredentialRefreshWindow(r4)     // Catch: java.lang.Throwable -> L22
            int r0 = r2.activeCount     // Catch: java.lang.Throwable -> L22
            r1 = 1
            int r0 = r0 + 1
            r2.activeCount = r0     // Catch: java.lang.Throwable -> L22
            goto L20
        L1f:
            r1 = 0
        L20:
            monitor-exit(r3)
            return r1
        L22:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraSessionManager.beginPostConsolidationCredentialRefresh(X.CGz):boolean");
    }

    public final SignOutClaim claimSignOutForGraphQLAuthFailureIfCurrent(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        SignOutClaim signOutClaimClaimSignOutLocked$default;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        synchronized (lock) {
            boolean zAreEqual = C7384Etj.areEqual(str2, AuraMetaFRLSecureTokenStore.INSTANCE.frlFingerprint());
            signOutClaimClaimSignOutLocked$default = null;
            if (activeSignOutClaim == null) {
                AuraSessionManager auraSessionManager = INSTANCE;
                if (auraSessionManager.currentSessionLocked() == abstractC3358CGz && C7384Etj.areEqual(C3357CGy.A0z(abstractC3358CGz), str) && zAreEqual && !auraSessionManager.isPostConsolidationCredentialRefreshActiveLocked(abstractC3358CGz)) {
                    signOutClaimClaimSignOutLocked$default = claimSignOutLocked$default(auraSessionManager, abstractC3358CGz, false, 2, null);
                }
            }
        }
        return signOutClaimClaimSignOutLocked$default;
    }

    public final SignOutClaim claimSignOutIfCurrent(AbstractC3358CGz abstractC3358CGz) {
        SignOutClaim signOutClaimClaimSignOutLocked$default;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        synchronized (lock) {
            signOutClaimClaimSignOutLocked$default = null;
            if (activeSignOutClaim == null) {
                AuraSessionManager auraSessionManager = INSTANCE;
                if (auraSessionManager.currentSessionLocked() == abstractC3358CGz) {
                    signOutClaimClaimSignOutLocked$default = claimSignOutLocked$default(auraSessionManager, abstractC3358CGz, false, 2, null);
                }
            }
        }
        return signOutClaimClaimSignOutLocked$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: all -> 0x0139, TryCatch #11 {all -> 0x0139, blocks: (B:13:0x002a, B:15:0x002e, B:19:0x0040, B:22:0x005f, B:23:0x0061, B:25:0x0066, B:26:0x0067, B:27:0x006b, B:29:0x0071, B:30:0x0079, B:32:0x007e, B:34:0x0088, B:35:0x008f, B:36:0x0093, B:39:0x009f, B:45:0x00ae, B:46:0x00b4, B:48:0x00ba, B:50:0x00c6, B:51:0x00d0, B:53:0x00d7, B:57:0x00e6, B:61:0x00f6, B:65:0x0107, B:70:0x0117, B:72:0x011e, B:67:0x010c, B:63:0x00fe, B:59:0x00ed, B:55:0x00dc, B:38:0x0098, B:43:0x00a5, B:81:0x0137, B:82:0x0138, B:21:0x0058, B:17:0x0037, B:24:0x0062), top: B:117:0x002a, outer: #5, inners: #0, #1, #3, #4, #6, #7, #8, #9, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128 A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #5 {, blocks: (B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x001a, B:75:0x0128, B:77:0x012c, B:86:0x013d, B:88:0x0141, B:13:0x002a, B:15:0x002e, B:19:0x0040, B:22:0x005f, B:23:0x0061, B:25:0x0066, B:26:0x0067, B:27:0x006b, B:29:0x0071, B:30:0x0079, B:32:0x007e, B:34:0x0088, B:35:0x008f, B:36:0x0093, B:39:0x009f, B:45:0x00ae, B:46:0x00b4, B:48:0x00ba, B:50:0x00c6, B:51:0x00d0, B:53:0x00d7, B:57:0x00e6, B:61:0x00f6, B:65:0x0107, B:70:0x0117, B:72:0x011e, B:67:0x010c, B:63:0x00fe, B:59:0x00ed, B:55:0x00dc, B:38:0x0098, B:43:0x00a5, B:81:0x0137, B:82:0x0138, B:21:0x0058, B:17:0x0037), top: B:106:0x0007, inners: #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean completeClaimedSignOut(com.facebook.aura.auth.AuraSessionManager.SignOutClaim r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraSessionManager.completeClaimedSignOut(com.facebook.aura.auth.AuraSessionManager$SignOutClaim, boolean, boolean):boolean");
    }

    public final void endPostConsolidationCredentialRefresh(AbstractC3358CGz abstractC3358CGz) {
        int i;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        synchronized (lock) {
            PostConsolidationCredentialRefreshWindow postConsolidationCredentialRefreshWindow = (PostConsolidationCredentialRefreshWindow) abstractC3358CGz.A02(PostConsolidationCredentialRefreshWindow.class);
            if (postConsolidationCredentialRefreshWindow != null && (i = postConsolidationCredentialRefreshWindow.activeCount) > 0) {
                postConsolidationCredentialRefreshWindow.activeCount = i - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isCurrentSession(X.AbstractC3358CGz r3) {
        /*
            r2 = this;
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            java.lang.Object r2 = com.facebook.aura.auth.AuraSessionManager.lock
            monitor-enter(r2)
            com.facebook.aura.auth.AuraSessionManager$SignOutClaim r0 = com.facebook.aura.auth.AuraSessionManager.activeSignOutClaim     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L14
            com.facebook.aura.auth.AuraSessionManager r0 = com.facebook.aura.auth.AuraSessionManager.INSTANCE     // Catch: java.lang.Throwable -> L17
            X.CGz r1 = r0.currentSessionLocked()     // Catch: java.lang.Throwable -> L17
            r0 = 1
            if (r1 == r3) goto L15
        L14:
            r0 = 0
        L15:
            monitor-exit(r2)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraSessionManager.isCurrentSession(X.CGz):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[Catch: all -> 0x0111, TryCatch #1 {all -> 0x0111, blocks: (B:40:0x00b4, B:41:0x00b6, B:43:0x00ba, B:44:0x00c0, B:46:0x00c6, B:47:0x00cc, B:54:0x0101, B:27:0x0081, B:29:0x0089, B:31:0x0091, B:33:0x0097, B:35:0x009d, B:37:0x00a3), top: B:67:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[Catch: all -> 0x0111, TryCatch #1 {all -> 0x0111, blocks: (B:40:0x00b4, B:41:0x00b6, B:43:0x00ba, B:44:0x00c0, B:46:0x00c6, B:47:0x00cc, B:54:0x0101, B:27:0x0081, B:29:0x0089, B:31:0x0091, B:33:0x0097, B:35:0x009d, B:37:0x00a3), top: B:67:0x0020 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object migrateToRefreshToken(X.AbstractC3358CGz r13, X.HtJ<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraSessionManager.migrateToRefreshToken(X.CGz, X.HtJ):java.lang.Object");
    }

    public final boolean onLoginComplete(String str, String str2, String str3, String str4, String str5) {
        boolean zApplyLoginLocked;
        AnonymousClass005.A11(str, str3, str4, 0);
        String strSealRefreshToken = sealRefreshToken(str5);
        synchronized (lock) {
            zApplyLoginLocked = activeSignOutClaim != null ? false : INSTANCE.applyLoginLocked(str, str2, str3, str4, strSealRefreshToken);
        }
        return zApplyLoginLocked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[Catch: all -> 0x0232, TryCatch #2 {all -> 0x0232, blocks: (B:76:0x01e3, B:77:0x01e6, B:78:0x01ed, B:22:0x00b5, B:24:0x00bd, B:25:0x00c1, B:27:0x00c7, B:30:0x00cf, B:32:0x00d5, B:33:0x00dc, B:34:0x00e2, B:38:0x00fa, B:40:0x0100, B:44:0x013a, B:46:0x0142, B:47:0x014a, B:50:0x0154, B:51:0x0158, B:53:0x015b, B:55:0x0163, B:57:0x0169, B:61:0x0184, B:68:0x01af, B:70:0x01b3, B:72:0x01bd, B:79:0x01f2, B:81:0x01f6, B:83:0x01fe, B:84:0x0205, B:85:0x020c, B:87:0x0214, B:88:0x021b, B:89:0x021f, B:91:0x0221, B:95:0x0231, B:62:0x0187, B:63:0x0194, B:67:0x01ad, B:66:0x01aa, B:60:0x0181, B:19:0x0092, B:37:0x00f7), top: B:101:0x001d, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[Catch: all -> 0x0232, TryCatch #2 {all -> 0x0232, blocks: (B:76:0x01e3, B:77:0x01e6, B:78:0x01ed, B:22:0x00b5, B:24:0x00bd, B:25:0x00c1, B:27:0x00c7, B:30:0x00cf, B:32:0x00d5, B:33:0x00dc, B:34:0x00e2, B:38:0x00fa, B:40:0x0100, B:44:0x013a, B:46:0x0142, B:47:0x014a, B:50:0x0154, B:51:0x0158, B:53:0x015b, B:55:0x0163, B:57:0x0169, B:61:0x0184, B:68:0x01af, B:70:0x01b3, B:72:0x01bd, B:79:0x01f2, B:81:0x01f6, B:83:0x01fe, B:84:0x0205, B:85:0x020c, B:87:0x0214, B:88:0x021b, B:89:0x021f, B:91:0x0221, B:95:0x0231, B:62:0x0187, B:63:0x0194, B:67:0x01ad, B:66:0x01aa, B:60:0x0181, B:19:0x0092, B:37:0x00f7), top: B:101:0x001d, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100 A[Catch: all -> 0x0232, TryCatch #2 {all -> 0x0232, blocks: (B:76:0x01e3, B:77:0x01e6, B:78:0x01ed, B:22:0x00b5, B:24:0x00bd, B:25:0x00c1, B:27:0x00c7, B:30:0x00cf, B:32:0x00d5, B:33:0x00dc, B:34:0x00e2, B:38:0x00fa, B:40:0x0100, B:44:0x013a, B:46:0x0142, B:47:0x014a, B:50:0x0154, B:51:0x0158, B:53:0x015b, B:55:0x0163, B:57:0x0169, B:61:0x0184, B:68:0x01af, B:70:0x01b3, B:72:0x01bd, B:79:0x01f2, B:81:0x01f6, B:83:0x01fe, B:84:0x0205, B:85:0x020c, B:87:0x0214, B:88:0x021b, B:89:0x021f, B:91:0x0221, B:95:0x0231, B:62:0x0187, B:63:0x0194, B:67:0x01ad, B:66:0x01aa, B:60:0x0181, B:19:0x0092, B:37:0x00f7), top: B:101:0x001d, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a A[Catch: all -> 0x0232, TRY_ENTER, TryCatch #2 {all -> 0x0232, blocks: (B:76:0x01e3, B:77:0x01e6, B:78:0x01ed, B:22:0x00b5, B:24:0x00bd, B:25:0x00c1, B:27:0x00c7, B:30:0x00cf, B:32:0x00d5, B:33:0x00dc, B:34:0x00e2, B:38:0x00fa, B:40:0x0100, B:44:0x013a, B:46:0x0142, B:47:0x014a, B:50:0x0154, B:51:0x0158, B:53:0x015b, B:55:0x0163, B:57:0x0169, B:61:0x0184, B:68:0x01af, B:70:0x01b3, B:72:0x01bd, B:79:0x01f2, B:81:0x01f6, B:83:0x01fe, B:84:0x0205, B:85:0x020c, B:87:0x0214, B:88:0x021b, B:89:0x021f, B:91:0x0221, B:95:0x0231, B:62:0x0187, B:63:0x0194, B:67:0x01ad, B:66:0x01aa, B:60:0x0181, B:19:0x0092, B:37:0x00f7), top: B:101:0x001d, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3 A[Catch: all -> 0x0232, TryCatch #2 {all -> 0x0232, blocks: (B:76:0x01e3, B:77:0x01e6, B:78:0x01ed, B:22:0x00b5, B:24:0x00bd, B:25:0x00c1, B:27:0x00c7, B:30:0x00cf, B:32:0x00d5, B:33:0x00dc, B:34:0x00e2, B:38:0x00fa, B:40:0x0100, B:44:0x013a, B:46:0x0142, B:47:0x014a, B:50:0x0154, B:51:0x0158, B:53:0x015b, B:55:0x0163, B:57:0x0169, B:61:0x0184, B:68:0x01af, B:70:0x01b3, B:72:0x01bd, B:79:0x01f2, B:81:0x01f6, B:83:0x01fe, B:84:0x0205, B:85:0x020c, B:87:0x0214, B:88:0x021b, B:89:0x021f, B:91:0x0221, B:95:0x0231, B:62:0x0187, B:63:0x0194, B:67:0x01ad, B:66:0x01aa, B:60:0x0181, B:19:0x0092, B:37:0x00f7), top: B:101:0x001d, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f2 A[Catch: all -> 0x0232, TryCatch #2 {all -> 0x0232, blocks: (B:76:0x01e3, B:77:0x01e6, B:78:0x01ed, B:22:0x00b5, B:24:0x00bd, B:25:0x00c1, B:27:0x00c7, B:30:0x00cf, B:32:0x00d5, B:33:0x00dc, B:34:0x00e2, B:38:0x00fa, B:40:0x0100, B:44:0x013a, B:46:0x0142, B:47:0x014a, B:50:0x0154, B:51:0x0158, B:53:0x015b, B:55:0x0163, B:57:0x0169, B:61:0x0184, B:68:0x01af, B:70:0x01b3, B:72:0x01bd, B:79:0x01f2, B:81:0x01f6, B:83:0x01fe, B:84:0x0205, B:85:0x020c, B:87:0x0214, B:88:0x021b, B:89:0x021f, B:91:0x0221, B:95:0x0231, B:62:0x0187, B:63:0x0194, B:67:0x01ad, B:66:0x01aa, B:60:0x0181, B:19:0x0092, B:37:0x00f7), top: B:101:0x001d, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshAbraToken(X.AbstractC3358CGz r11, java.lang.String r12, X.HtJ<? super com.facebook.aura.auth.AuraSessionManager.AbraTokenRefreshResult> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraSessionManager.refreshAbraToken(X.CGz, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void releaseSignOutClaim(SignOutClaim signOutClaim) {
        C7384Etj.A0Y(signOutClaim, 0);
        synchronized (lock) {
            if (activeSignOutClaim == signOutClaim) {
                activeSignOutClaim = null;
            }
        }
    }

    public final void signOutForGraphQLAuthFailureIfCurrent(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        SignOutClaim signOutClaimClaimSignOutForGraphQLAuthFailureIfCurrent = claimSignOutForGraphQLAuthFailureIfCurrent(abstractC3358CGz, str, str2);
        if (signOutClaimClaimSignOutForGraphQLAuthFailureIfCurrent != null) {
            try {
                completeClaimedSignOut(signOutClaimClaimSignOutForGraphQLAuthFailureIfCurrent, false, true);
            } finally {
                releaseSignOutClaim(signOutClaimClaimSignOutForGraphQLAuthFailureIfCurrent);
            }
        }
    }

    public final void signOutIfCurrent(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        SignOutClaim signOutClaimClaimSignOutIfCurrent = claimSignOutIfCurrent(abstractC3358CGz, str);
        if (signOutClaimClaimSignOutIfCurrent != null) {
            try {
                completeClaimedSignOut(signOutClaimClaimSignOutIfCurrent, false, true);
            } finally {
                releaseSignOutClaim(signOutClaimClaimSignOutIfCurrent);
            }
        }
    }

    static {
        C9286GCn c9286GCnA01 = HnJ.A01(SessionState.Initializing.INSTANCE);
        _state = c9286GCnA01;
        state = C3Pi.A00(c9286GCnA01);
        lock = C3cG.A0T();
        refreshMutex = new C9258GBl();
        signOutCallbacks = C3cG.A0h();
    }

    private final boolean applyLoginLocked(String str, String str2, String str3, String str4, String str5) {
        SessionState value = _state.getValue();
        if (!(value instanceof SessionState.SignedOut)) {
            CFK.A0H(AuraSessionManagerKt.TAG, "%s: expected %s but was %s, ignoring", "onLoginComplete", C0861A6i.A01(SessionState.SignedOut.class), getName(value));
            return false;
        }
        AuraMetaFRLSecureTokenStore auraMetaFRLSecureTokenStore = AuraMetaFRLSecureTokenStore.INSTANCE;
        auraMetaFRLSecureTokenStore.setMetaAccessToken(str);
        if (str2 != null) {
            auraMetaFRLSecureTokenStore.setMetaAccountId(str2);
        }
        auraMetaFRLSecureTokenStore.replaceSealedRefreshToken(str5);
        return activateSessionLocked(str3, str4);
    }

    private final AbraTokenRefreshResult applyRefreshedToken(AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3, RefreshTokenUpdate refreshTokenUpdate) {
        AbraTokenRefreshResult retry;
        synchronized (lock) {
            AuraSessionManager auraSessionManager = INSTANCE;
            AbstractC3358CGz currentSession = auraSessionManager.getCurrentSession();
            if (activeSignOutClaim != null || currentSession != abstractC3358CGz) {
                CFK.A0H(AuraSessionManagerKt.TAG, "applyRefreshedToken: session changed (%s), token not applied", auraSessionManager.getName(_state.getValue()));
                retry = AbraTokenRefreshResult.SessionChanged.INSTANCE;
            } else if (!((CH0) currentSession).A01.equals(str2)) {
                CFK.A06(AuraSessionManagerKt.TAG, "applyRefreshedToken: exchanged user does not match active session");
                retry = new AbraTokenRefreshResult.Failed(str);
            } else if (C7BY.A0j(str3)) {
                CFK.A06(AuraSessionManagerKt.TAG, "applyRefreshedToken: exchanged access token is blank");
                retry = new AbraTokenRefreshResult.Failed(str);
            } else {
                if (refreshTokenUpdate != null && !AuraMetaFRLSecureTokenStore.INSTANCE.replaceSealedRefreshToken(refreshTokenUpdate.sealedToken)) {
                    CFK.A06(AuraSessionManagerKt.TAG, "applyRefreshedToken: refresh token persistence failed");
                }
                auraSessionManager.cacheAbraAccessToken(currentSession, str3);
                CHA.A01 = currentSession;
                if (!AuraUserSessionStore.INSTANCE.saveCurrentUserSession(currentSession)) {
                    CFK.A06(AuraSessionManagerKt.TAG, "applyRefreshedToken: ABRA persistence failed; kept new token live");
                }
                retry = new AbraTokenRefreshResult.Retry(str3);
            }
        }
        return retry;
    }

    private final void cacheAbraAccessToken(AbstractC3358CGz abstractC3358CGz, String str) {
        CH0 ch0 = (CH0) abstractC3358CGz;
        String str2 = ch0.A01;
        String str3 = CH0.A01(ch0).A06;
        String str4 = CH0.A01(ch0).A07;
        String str5 = CH0.A01(ch0).A05;
        AbstractC3358CGz.A00(CH0.A01(ch0).A03, str2, str, str3, str4, str5, CH0.A01(ch0).A00, CH0.A01(ch0).A01, CH0.A01(ch0).A02);
    }

    private final SignOutClaim claimCurrentSessionForSignOutLocked() {
        if (activeSignOutClaim == null) {
            SessionState value = _state.getValue();
            if (!(value instanceof SessionState.SignedOut)) {
                if (value instanceof SessionState.Initializing) {
                    CFK.A06(AuraSessionManagerKt.TAG, "signOut: called during Initializing, ignoring");
                } else {
                    getName(value);
                    AbstractC3358CGz abstractC3358CGzCurrentSessionLocked = currentSessionLocked();
                    if (abstractC3358CGzCurrentSessionLocked != null) {
                        SignOutClaim signOutClaim = new SignOutClaim(abstractC3358CGzCurrentSessionLocked, value instanceof SessionState.Activating);
                        activeSignOutClaim = signOutClaim;
                        return signOutClaim;
                    }
                }
            }
        }
        return null;
    }

    private final SignOutClaim claimSignOutLocked(AbstractC3358CGz abstractC3358CGz, boolean z) {
        SignOutClaim signOutClaim = new SignOutClaim(abstractC3358CGz, z);
        activeSignOutClaim = signOutClaim;
        return signOutClaim;
    }

    public static /* synthetic */ SignOutClaim claimSignOutLocked$default(AuraSessionManager auraSessionManager, AbstractC3358CGz abstractC3358CGz, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = _state.getValue() instanceof SessionState.Activating;
        }
        SignOutClaim signOutClaim = new SignOutClaim(abstractC3358CGz, z);
        activeSignOutClaim = signOutClaim;
        return signOutClaim;
    }

    private final AbstractC3358CGz currentSessionLocked() {
        SessionState value = _state.getValue();
        if (value instanceof SessionState.Activating) {
            return ((SessionState.Activating) value).session;
        }
        if (value instanceof SessionState.Active) {
            return ((SessionState.Active) value).session;
        }
        return null;
    }

    private final String getName(SessionState sessionState) {
        if (sessionState instanceof SessionState.Initializing) {
            return C60N.A00(14);
        }
        if (sessionState instanceof SessionState.SignedOut) {
            return "SignedOut";
        }
        if (sessionState instanceof SessionState.Activating) {
            return "Activating";
        }
        if (sessionState instanceof SessionState.Active) {
            return "Active";
        }
        throw C3cG.A0q();
    }

    private final boolean isPostConsolidationCredentialRefreshActiveLocked(AbstractC3358CGz abstractC3358CGz) {
        PostConsolidationCredentialRefreshWindow postConsolidationCredentialRefreshWindow = (PostConsolidationCredentialRefreshWindow) abstractC3358CGz.A02(PostConsolidationCredentialRefreshWindow.class);
        return postConsolidationCredentialRefreshWindow != null && postConsolidationCredentialRefreshWindow.activeCount > 0;
    }

    private final long nextSessionGeneration() {
        long j = latestSessionGeneration + 1;
        latestSessionGeneration = j;
        return j;
    }

    public static /* synthetic */ boolean onLoginComplete$default(AuraSessionManager auraSessionManager, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        return auraSessionManager.onLoginComplete(str, str2, str3, str4, str5);
    }

    private final PostConsolidationCredentialRefreshWindow postConsolidationCredentialRefreshWindow(AbstractC3358CGz abstractC3358CGz) {
        return (PostConsolidationCredentialRefreshWindow) abstractC3358CGz.A03(PostConsolidationCredentialRefreshWindow.class, C109791.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object redeemRefreshToken(X.AbstractC3358CGz r9, X.HtJ<? super com.facebook.aura.auth.RefreshAccessTokenResult> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.auth.AuraSessionManager.C109801
            if (r0 == 0) goto L24
            r6 = r10
            com.facebook.aura.auth.AuraSessionManager$redeemRefreshToken$1 r6 = (com.facebook.aura.auth.AuraSessionManager.C109801) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L54
            if (r0 != r5) goto L2a
            java.lang.Object r9 = r6.L$0
            goto L72
        L24:
            com.facebook.aura.auth.AuraSessionManager$redeemRefreshToken$1 r6 = new com.facebook.aura.auth.AuraSessionManager$redeemRefreshToken$1
            r6.<init>(r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r2)
            com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore r0 = com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore.INSTANCE
            boolean r0 = r0.hasRefreshToken()
            if (r0 == 0) goto La9
            boolean r0 = r8.isRefreshTokenEnabled()
            if (r0 == 0) goto La9
            X.78T r1 = X.AnonymousClass001.A0y()
            com.facebook.aura.auth.AuraSessionManager$redeemRefreshToken$refreshToken$1 r0 = new com.facebook.aura.auth.AuraSessionManager$redeemRefreshToken$refreshToken$1
            r0.<init>(r3)
            r6.L$0 = r9
            r6.label = r4
            java.lang.Object r2 = X.GAo.A00(r6, r1, r0)
            if (r2 != r7) goto L59
            return r7
        L54:
            java.lang.Object r9 = r6.L$0
            X.Hwg.A00(r2)
        L59:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L85
            int r0 = r2.length()
            if (r0 == 0) goto L85
            com.facebook.aura.auth.AuraTokenExchanger r0 = com.facebook.aura.auth.AuraTokenExchanger.INSTANCE     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L83
            r6.L$0 = r9     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L83
            r6.L$1 = r3     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L83
            r6.label = r5     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L83
            java.lang.Object r2 = r0.refreshAccessToken(r2, r6)     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L83
            if (r2 != r7) goto L75
            return r7
        L72:
            X.Hwg.A00(r2)     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L83
        L75:
            com.facebook.aura.auth.RefreshAccessTokenResult r2 = (com.facebook.aura.auth.RefreshAccessTokenResult) r2     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L83
            goto L87
        L78:
            r2 = move-exception
            java.lang.String r1 = "AuraSessionManager"
            java.lang.String r0 = "refreshAbraToken: refresh token redemption failed"
            X.CFK.A08(r1, r0, r2)
            com.facebook.aura.auth.RefreshAccessTokenResult$Unavailable r2 = com.facebook.aura.auth.RefreshAccessTokenResult.Unavailable.INSTANCE
            goto L87
        L83:
            r0 = move-exception
            throw r0
        L85:
            com.facebook.aura.auth.RefreshAccessTokenResult$Rejected r2 = com.facebook.aura.auth.RefreshAccessTokenResult.Rejected.INSTANCE
        L87:
            com.facebook.aura.auth.RefreshAccessTokenResult$Rejected r0 = com.facebook.aura.auth.RefreshAccessTokenResult.Rejected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 == 0) goto La8
            java.lang.Object r1 = com.facebook.aura.auth.AuraSessionManager.lock
            monitor-enter(r1)
            com.facebook.aura.auth.AuraSessionManager$SignOutClaim r0 = com.facebook.aura.auth.AuraSessionManager.activeSignOutClaim     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto La7
            com.facebook.aura.auth.AuraSessionManager r0 = com.facebook.aura.auth.AuraSessionManager.INSTANCE     // Catch: java.lang.Throwable -> La4
            X.CGz r0 = r0.currentSessionLocked()     // Catch: java.lang.Throwable -> La4
            if (r0 != r9) goto La7
            com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore r0 = com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore.INSTANCE     // Catch: java.lang.Throwable -> La4
            r0.replaceSealedRefreshToken(r3)     // Catch: java.lang.Throwable -> La4
            goto La7
        La4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        La7:
            monitor-exit(r1)
        La8:
            return r2
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraSessionManager.redeemRefreshToken(X.CGz, X.HtJ):java.lang.Object");
    }

    private final AbraTokenRefreshResult refreshFailureFor(AbstractC3358CGz abstractC3358CGz, String str) {
        AbraTokenRefreshResult failed;
        synchronized (lock) {
            failed = (activeSignOutClaim == null && INSTANCE.currentSessionLocked() == abstractC3358CGz) ? new AbraTokenRefreshResult.Failed(str) : AbraTokenRefreshResult.SessionChanged.INSTANCE;
        }
        return failed;
    }

    private final AbraTokenRefreshResult refreshUnavailableFor(AbstractC3358CGz abstractC3358CGz) {
        AbraTokenRefreshResult abraTokenRefreshResult;
        synchronized (lock) {
            abraTokenRefreshResult = (activeSignOutClaim == null && INSTANCE.currentSessionLocked() == abstractC3358CGz) ? AbraTokenRefreshResult.Unavailable.INSTANCE : AbraTokenRefreshResult.SessionChanged.INSTANCE;
        }
        return abraTokenRefreshResult;
    }

    private final /* synthetic */ <T extends SessionState> boolean requireState(String str) {
        _state.getValue();
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public static /* synthetic */ boolean restoreSessionFromFRLToken$default(AuraSessionManager auraSessionManager, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return auraSessionManager.restoreSessionFromFRLToken(str, str2, str3, str4);
    }

    private final AbraTokenRecovery tokenRecovery() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitSettledSession(X.HtJ<? super X.AbstractC3358CGz> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.auth.AuraSessionManager.AnonymousClass1
            if (r0 == 0) goto L39
            r5 = r7
            com.facebook.aura.auth.AuraSessionManager$awaitSettledSession$1 r5 = (com.facebook.aura.auth.AuraSessionManager.AnonymousClass1) r5
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
            if (r0 == 0) goto L25
            if (r0 != r3) goto L3f
            X.Hwg.A00(r1)
        L20:
            X.CGz r0 = r6.getCurrentSession()
            return r0
        L25:
            X.Hwg.A00(r1)
            X.BLG<com.facebook.aura.auth.AuraSessionManager$SessionState> r2 = com.facebook.aura.auth.AuraSessionManager._state
            r1 = 0
            com.facebook.aura.auth.AuraSessionManager$awaitSettledSession$2 r0 = new com.facebook.aura.auth.AuraSessionManager$awaitSettledSession$2
            r0.<init>(r1)
            r5.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r5, r0, r2)
            if (r0 != r4) goto L20
            return r4
        L39:
            com.facebook.aura.auth.AuraSessionManager$awaitSettledSession$1 r5 = new com.facebook.aura.auth.AuraSessionManager$awaitSettledSession$1
            r5.<init>(r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraSessionManager.awaitSettledSession(X.HtJ):java.lang.Object");
    }

    public final void clearAllCredentials() {
        synchronized (lock) {
            AuraUserSessionStore.INSTANCE.saveCurrentUserSession(null);
            AuraMetaFRLSecureTokenStore.INSTANCE.clear();
        }
    }

    public final void e2eLogout() {
        SignOutClaim signOutClaimClaimCurrentSessionForSignOutLocked;
        synchronized (lock) {
            C3cI.A1H(BzK.A02(((CGw) AuraUserSessionStore.instance$delegate.getValue()).A01), "E2E_INJECTED");
            AuraMetaFRLSecureTokenStore.INSTANCE.clear();
            signOutClaimClaimCurrentSessionForSignOutLocked = INSTANCE.claimCurrentSessionForSignOutLocked();
        }
        if (signOutClaimClaimCurrentSessionForSignOutLocked != null) {
            try {
                completeClaimedSignOut(signOutClaimClaimCurrentSessionForSignOutLocked, false, false);
            } finally {
                releaseSignOutClaim(signOutClaimClaimCurrentSessionForSignOutLocked);
            }
        }
    }

    public final AbstractC3358CGz getCurrentSession() {
        SessionState value = _state.getValue();
        if (value instanceof SessionState.Activating) {
            return ((SessionState.Activating) value).session;
        }
        if (value instanceof SessionState.Active) {
            return ((SessionState.Active) value).session;
        }
        return null;
    }

    public final SessionSnapshot getCurrentSessionSnapshot() {
        SessionSnapshot sessionSnapshot;
        AbstractC3358CGz abstractC3358CGzCurrentSessionLocked;
        synchronized (lock) {
            sessionSnapshot = null;
            if (activeSignOutClaim == null && (abstractC3358CGzCurrentSessionLocked = INSTANCE.currentSessionLocked()) != null) {
                sessionSnapshot = new SessionSnapshot(abstractC3358CGzCurrentSessionLocked, C3357CGy.A0z(abstractC3358CGzCurrentSessionLocked), AuraMetaFRLSecureTokenStore.INSTANCE.frlFingerprint());
            }
        }
        return sessionSnapshot;
    }

    public final C1BN<SessionState> getState() {
        return state;
    }

    public final boolean hasPersistedSession() {
        return AuraUserSessionStore.INSTANCE.isCurrentUserAuthenticated();
    }

    public final void initialize() {
        SessionState activating;
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        synchronized (lock) {
            AuraSessionManager auraSessionManager = INSTANCE;
            BLG<SessionState> blg = _state;
            SessionState value = blg.getValue();
            if (value instanceof SessionState.Initializing) {
                HatchStartupQpl.Companion.markerAnnotate(HatchStartupPoints.ANNOTATION_WAS_LOGGED_IN, currentUserSession != null);
                if (currentUserSession != null) {
                    long j = latestSessionGeneration + 1;
                    latestSessionGeneration = j;
                    activating = new SessionState.Activating(currentUserSession, j);
                } else {
                    activating = SessionState.SignedOut.INSTANCE;
                }
                blg.Af8(activating);
            } else {
                CFK.A0H(AuraSessionManagerKt.TAG, "%s: expected %s but was %s, ignoring", "initialize", C0861A6i.A01(SessionState.Initializing.class), auraSessionManager.getName(value));
            }
        }
    }

    public final boolean isWatchTokenRecoveryEnabled() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onAuthenticatedResponse(X.AbstractC3358CGz r4, java.lang.String r5, int r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r3 = this;
            boolean r0 = r7 instanceof com.facebook.aura.auth.AuraSessionManager.C109781
            if (r0 == 0) goto L2c
            r5 = r7
            com.facebook.aura.auth.AuraSessionManager$onAuthenticatedResponse$1 r5 = (com.facebook.aura.auth.AuraSessionManager.C109781) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            int r1 = r5.label
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L4f
            if (r1 != r0) goto L4a
            java.lang.Object r2 = r5.L$2
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r0 = r5.L$1
            java.lang.Object r1 = r5.L$0
            X.CGz r1 = (X.AbstractC3358CGz) r1
            X.Hwg.A00(r4)
            if (r0 == 0) goto L3f
            goto L32
        L2c:
            com.facebook.aura.auth.AuraSessionManager$onAuthenticatedResponse$1 r5 = new com.facebook.aura.auth.AuraSessionManager$onAuthenticatedResponse$1
            r5.<init>(r7)
            goto L12
        L32:
            com.facebook.aura.auth.AuraSessionManager r0 = com.facebook.aura.auth.AuraSessionManager.INSTANCE     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.isCurrentSession(r1)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L3f
            X.CH0 r1 = (X.CH0) r1     // Catch: java.lang.Throwable -> L45
            X.CH0.A01(r1)     // Catch: java.lang.Throwable -> L45
        L3f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
            r2.Ahe(r3)
            return r0
        L45:
            r0 = move-exception
            r2.Ahe(r3)
            throw r0
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L4f:
            X.Hwg.A00(r4)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraSessionManager.onAuthenticatedResponse(X.CGz, java.lang.String, int, X.HtJ):java.lang.Object");
    }

    public final void onSessionReady() {
        synchronized (lock) {
            if (activeSignOutClaim == null) {
                BLG<SessionState> blg = _state;
                SessionState value = blg.getValue();
                if (value instanceof SessionState.Activating) {
                    SessionState.Activating activating = (SessionState.Activating) value;
                    blg.Af8(new SessionState.Active(activating.session, activating.sessionGeneration));
                } else {
                    CFK.A0H(AuraSessionManagerKt.TAG, "onSessionReady: expected Activating but was %s, ignoring", INSTANCE.getName(value));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9 A[Catch: all -> 0x00e0, Merged into TryCatch #1 {all -> 0x00e3, blocks: (B:17:0x0063, B:18:0x006b, B:50:0x00db, B:54:0x00e1, B:55:0x00e2, B:19:0x006c, B:21:0x0074, B:23:0x007a, B:26:0x0080, B:28:0x008f, B:30:0x0095, B:32:0x009b, B:34:0x00a1, B:36:0x00a7, B:38:0x00af, B:40:0x00b4, B:41:0x00b7, B:43:0x00bd, B:44:0x00c0, B:46:0x00c9, B:47:0x00cc, B:48:0x00d6, B:49:0x00d9), top: B:60:0x0063 }, TRY_LEAVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object replaceCredentialsAfterConsolidation(X.AbstractC3358CGz r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, X.HtJ<? super com.facebook.aura.auth.AuraSessionManager.PostConsolidationCredentialReplacementResult> r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraSessionManager.replaceCredentialsAfterConsolidation(X.CGz, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void signOut() {
        SignOutClaim signOutClaimClaimCurrentSessionForSignOutLocked;
        synchronized (lock) {
            signOutClaimClaimCurrentSessionForSignOutLocked = INSTANCE.claimCurrentSessionForSignOutLocked();
        }
        if (signOutClaimClaimCurrentSessionForSignOutLocked != null) {
            try {
                completeClaimedSignOut(signOutClaimClaimCurrentSessionForSignOutLocked, false, true);
            } finally {
                releaseSignOutClaim(signOutClaimClaimCurrentSessionForSignOutLocked);
            }
        }
    }

    private final boolean replaceAbraAccessTokenLocked(AbstractC3358CGz abstractC3358CGz, String str) {
        String strA0z = C3357CGy.A0z(abstractC3358CGz);
        cacheAbraAccessToken(abstractC3358CGz, str);
        CHA.A01 = abstractC3358CGz;
        if (AuraUserSessionStore.INSTANCE.saveCurrentUserSession(abstractC3358CGz)) {
            return true;
        }
        cacheAbraAccessToken(abstractC3358CGz, strA0z);
        CHA.A01 = abstractC3358CGz;
        return false;
    }

    private final void runSignOutStep(String str, Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Exception e) {
            CFK.A08(AuraSessionManagerKt.TAG, FGI.A0M("Sign-out step failed: ", str), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sealRefreshTokenOffMain(String str, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C109832(str, null));
    }

    public final boolean isAuthenticated() {
        return AnonymousClass002.A1X(getCurrentSession());
    }

    public final boolean onLinkedDeviceLoginComplete(String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        synchronized (lock) {
        }
        return zA1b;
    }

    public final boolean restoreSessionFromFRLToken(String str, String str2, String str3, String str4) {
        boolean zActivateSessionLocked;
        AnonymousClass005.A0x(str, str2, str3);
        String strSealRefreshToken = sealRefreshToken(str4);
        synchronized (lock) {
            zActivateSessionLocked = false;
            if (activeSignOutClaim == null) {
                AuraSessionManager auraSessionManager = INSTANCE;
                SessionState value = _state.getValue();
                if (value instanceof SessionState.SignedOut) {
                    AuraMetaFRLSecureTokenStore auraMetaFRLSecureTokenStore = AuraMetaFRLSecureTokenStore.INSTANCE;
                    if (str.equals(auraMetaFRLSecureTokenStore.getMetaAccessToken())) {
                        auraMetaFRLSecureTokenStore.replaceSealedRefreshToken(strSealRefreshToken);
                        zActivateSessionLocked = auraSessionManager.activateSessionLocked(str2, str3);
                    }
                } else {
                    CFK.A0H(AuraSessionManagerKt.TAG, "%s: expected %s but was %s, ignoring", "restoreSessionFromFRLToken", C0861A6i.A01(SessionState.SignedOut.class), auraSessionManager.getName(value));
                }
            }
        }
        return zActivateSessionLocked;
    }

    /* renamed from: com.facebook.aura.auth.AuraSessionManager$postConsolidationCredentialRefreshWindow$1, reason: invalid class name and case insensitive filesystem */
    public final class C109791 extends AbstractC7559F3s implements Function0<PostConsolidationCredentialRefreshWindow> {
        public static final C109791 INSTANCE = new C109791();

        public C109791() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PostConsolidationCredentialRefreshWindow invoke() {
            return new PostConsolidationCredentialRefreshWindow(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ PostConsolidationCredentialRefreshWindow invoke() {
            return new PostConsolidationCredentialRefreshWindow(0);
        }
    }

    public final SignOutClaim claimSignOutIfCurrent(AbstractC3358CGz abstractC3358CGz, String str) {
        SignOutClaim signOutClaimClaimSignOutLocked$default;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        synchronized (lock) {
            signOutClaimClaimSignOutLocked$default = null;
            if (activeSignOutClaim == null) {
                AuraSessionManager auraSessionManager = INSTANCE;
                if (auraSessionManager.currentSessionLocked() == abstractC3358CGz && C7384Etj.areEqual(C3357CGy.A0z(abstractC3358CGz), str)) {
                    signOutClaimClaimSignOutLocked$default = claimSignOutLocked$default(auraSessionManager, abstractC3358CGz, false, 2, null);
                }
            }
        }
        return signOutClaimClaimSignOutLocked$default;
    }
}
