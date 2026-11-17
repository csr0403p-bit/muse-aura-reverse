package com.facebook.aura.skills.repo;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AIX;
import X.AIY;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BLG;
import X.BQI;
import X.C06H;
import X.C0881AGi;
import X.C0943AIw;
import X.C10571Hud;
import X.C10650I0u;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C27i;
import X.C3Ek;
import X.C3Em;
import X.C3UX;
import X.C3pd;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C8eM;
import X.C8eO;
import X.C9286GCn;
import X.C9290GCr;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GAo;
import X.GCQ;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC7549F2g;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig;
import com.facebook.aura.skills.connect.config.SkillConnectConfigKt;
import com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository;
import com.facebook.aura.skills.model.ConnectorCatalogHomepage;
import com.facebook.aura.skills.model.ConnectorCatalogKt;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import com.facebook.aura.skills.model.ConnectorCatalogSection;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository implements InterfaceC7549F2g {
    public static final String CUSTOM_CONNECT_COMPLETE_PATH = "/connect/complete";
    public static final Companion Companion = new Companion();
    public static final long HOMEPAGE_MAX_AGE_MS = 60000;
    public static final String OAUTH_CALLBACK_PATH = "/api/hatch/oauth/callback";
    public static final long PAGE_MAX_AGE_MS = 60000;
    public static final String STRIPE_LINK_CONNECT_COMPLETE_PATH = "/stripe_link/connect/complete";
    public final C3Em<ConnectorAuthResult> _authResults;
    public final C3Em<String> _connectionChanges;
    public final AuraSkillAuthRepository authRepository;
    public final C22I<ConnectorAuthResult> authResults;
    public final ConnectorCatalogCache cache;
    public final C8eM categoryPrefetchSemaphore;
    public final BLG<List<String>> connectingCallbacks;
    public final C1BN<BQI<String>> connectingIds;
    public final C22I<String> connectionChanges;
    public final SingleFlight requests;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository", f = "HatchConnectorCatalogRepository.kt", l = {207, 220, 231, 232}, m = "authenticateAndRefresh", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$authenticateAndRefresh$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConnectorCatalogRepository.this.authenticateAndRefresh(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$checkLinkedAccountAndPromote$1", f = "HatchConnectorCatalogRepository.kt", l = {272}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$checkLinkedAccountAndPromote$1, reason: invalid class name and case insensitive filesystem */
    public final class C138061 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ FirstPartyConnectorConfig $config;
        public final /* synthetic */ String $connectorId;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$checkLinkedAccountAndPromote$1$1", f = "HatchConnectorCatalogRepository.kt", l = {273}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$checkLinkedAccountAndPromote$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03711 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ FirstPartyConnectorConfig $config;
            public final /* synthetic */ String $connectorId;
            public int label;
            public final /* synthetic */ HatchConnectorCatalogRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03711(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, FirstPartyConnectorConfig firstPartyConnectorConfig, String str, HtJ<? super C03711> htJ) {
                super(1, htJ);
                this.this$0 = hatchConnectorCatalogRepository;
                this.$config = firstPartyConnectorConfig;
                this.$connectorId = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03711(this.this$0, this.$config, this.$connectorId, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    X.Hji r2 = X.EnumC10460Hji.A02
                    int r0 = r4.label
                    r3 = 1
                    if (r0 == 0) goto L4e
                    if (r0 != r3) goto L65
                    X.Hwg.A00(r5)
                Lc:
                    java.util.List r5 = (java.util.List) r5
                    if (r5 == 0) goto L26
                    boolean r0 = r5 instanceof java.util.Collection
                    if (r0 == 0) goto L30
                    boolean r0 = r5.isEmpty()
                    if (r0 == 0) goto L30
                L1a:
                    com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r0 = r4.this$0
                    com.facebook.aura.skills.repo.ConnectorCatalogCache r1 = r0.cache
                    java.lang.String r0 = r4.$connectorId
                    boolean r0 = r1.clearPromotion(r0)
                    if (r0 == 0) goto L2d
                L26:
                    com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r1 = r4.this$0
                    java.lang.String r0 = r4.$connectorId
                    r1.onResumeAfterAuth(r0)
                L2d:
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    return r2
                L30:
                    java.util.Iterator r1 = r5.iterator()
                L34:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L1a
                    java.lang.Object r0 = r1.next()
                    com.facebook.aura.skills.repo.OAuthLinkedAccount r0 = (com.facebook.aura.skills.repo.OAuthLinkedAccount) r0
                    boolean r0 = r0.connected
                    if (r0 == 0) goto L34
                    com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r2 = r4.this$0
                    java.lang.String r1 = r4.$connectorId
                    com.facebook.aura.skills.model.SkillState r0 = com.facebook.aura.skills.model.SkillState.CONNECTED
                    com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.access$refreshConnection(r2, r1, r0, r3)
                    goto L2d
                L4e:
                    X.Hwg.A00(r5)
                    com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r0 = r4.this$0
                    X.CGz r0 = r0.userSession
                    com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository r1 = new com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository
                    r1.<init>(r0)
                    com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig r0 = r4.$config
                    r4.label = r3
                    java.lang.Object r5 = r1.fetchLinkedAccounts(r0, r4)
                    if (r5 != r2) goto Lc
                    return r2
                L65:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.C138061.C03711.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C03711) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138061(String str, FirstPartyConnectorConfig firstPartyConnectorConfig, HtJ<? super C138061> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.$config = firstPartyConnectorConfig;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138061(this.$connectorId, this.$config, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectorCatalogRepository hatchConnectorCatalogRepository = HatchConnectorCatalogRepository.this;
                SingleFlight singleFlight = hatchConnectorCatalogRepository.requests;
                String str = this.$connectorId;
                HxE hxE = new HxE("linked-account", str);
                C03711 c03711 = new C03711(hatchConnectorCatalogRepository, this.$config, str, null);
                this.label = 1;
                if (singleFlight.invoke(hxE, c03711, this) == enumC10460Hji) {
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
            return ((C138061) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$disconnectSkill$2", f = "HatchConnectorCatalogRepository.kt", l = {593}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$disconnectSkill$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $sourceSessionId;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public final /* synthetic */ HatchConnectorCatalogRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.$sourceSessionId = str2;
            this.this$0 = hatchConnectorCatalogRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$connectorId, this.$sourceSessionId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                String strEncode = Uri.encode(this.$connectorId);
                C7384Etj.A0U(strEncode);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchConnectorCatalogRepository$disconnectSkill$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchConnectorCatalogRepository$disconnectSkill$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchConnectorCatalogRepository$disconnectSkill$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchConnectorCatalogRepository$disconnectSkill$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchConnectorCatalogRepository$disconnectSkill$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchConnectorCatalogRepository$disconnectSkill$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(hatchConnectorCatalogRepository$disconnectSkill$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchConnectorCatalogRepository$disconnectSkill$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, new JarvisPath.DisconnectConnector(strEncode), new DisconnectConnectorRequestJson(this.$sourceSessionId), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            HatchConnectorCatalogRepository hatchConnectorCatalogRepository = this.this$0;
            String str = this.$connectorId;
            boolean z = !(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud);
            if (z) {
                HatchConnectorCatalogRepository.refreshConnection$default(hatchConnectorCatalogRepository, str, SkillState.DISCONNECTED, false, 4, null);
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$handleCustomConnectorComplete$1", f = "HatchConnectorCatalogRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$handleCustomConnectorComplete$1, reason: invalid class name and case insensitive filesystem */
    public final class C138071 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Uri $uri;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138071(Uri uri, HtJ<? super C138071> htJ) {
            super(1, htJ);
            this.$uri = uri;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138071(this.$uri, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(HatchConnectorCatalogRepository.this.authRepository.completeCustomConnectorAuth(this.$uri));
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((C138071) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$handleOAuthCallback$1", f = "HatchConnectorCatalogRepository.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$handleOAuthCallback$1, reason: invalid class name and case insensitive filesystem */
    public final class C138081 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ Uri $uri;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138081(Uri uri, String str, HtJ<? super C138081> htJ) {
            super(1, htJ);
            this.$uri = uri;
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138081(this.$uri, this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSkillAuthRepository auraSkillAuthRepository = HatchConnectorCatalogRepository.this.authRepository;
                Uri uri = this.$uri;
                String str = this.$id;
                this.label = 1;
                obj = auraSkillAuthRepository.sendOAuthCallback(uri, str, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((C138081) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$handleStripeLinkConnectComplete$1", f = "HatchConnectorCatalogRepository.kt", l = {135}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$handleStripeLinkConnectComplete$1, reason: invalid class name and case insensitive filesystem */
    public final class C138091 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ Uri $uri;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138091(Uri uri, String str, HtJ<? super C138091> htJ) {
            super(1, htJ);
            this.$uri = uri;
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138091(this.$uri, this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSkillAuthRepository auraSkillAuthRepository = HatchConnectorCatalogRepository.this.authRepository;
                Uri uri = this.$uri;
                String str = this.$id;
                this.label = 1;
                obj = auraSkillAuthRepository.sendStripeLinkConnectComplete(uri, str, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((C138091) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$launchAuthAndRefresh$1", f = "HatchConnectorCatalogRepository.kt", l = {192}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$launchAuthAndRefresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C138101 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Boolean>, Object> $authenticate;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138101(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, G0U<? super HtJ<? super Boolean>, ? extends Object> g0u, HtJ<? super C138101> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.$origin = hatchSkillOAuthOrigin;
            this.$authenticate = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138101(this.$connectorId, this.$origin, this.$authenticate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectorCatalogRepository hatchConnectorCatalogRepository = HatchConnectorCatalogRepository.this;
                String str = this.$connectorId;
                HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
                G0U<HtJ<? super Boolean>, Object> g0u = this.$authenticate;
                this.label = 1;
                if (hatchConnectorCatalogRepository.authenticateAndRefresh(str, hatchSkillOAuthOrigin, g0u, this) == enumC10460Hji) {
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
            return ((C138101) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeCachedConnectors$1", f = "HatchConnectorCatalogRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeCachedConnectors$1, reason: invalid class name and case insensitive filesystem */
    public final class C138111 extends AbstractC07127nr implements G0V<C20Z<? super AHD<? extends Skill>>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $categoryId;
        public int label;
        public final /* synthetic */ HatchConnectorCatalogRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138111(String str, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, HtJ<? super C138111> htJ) {
            super(2, htJ);
            this.$categoryId = str;
            this.this$0 = hatchConnectorCatalogRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C138111(this.$categoryId, this.this$0, htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C20Z<? super AHD<? extends Skill>> c20z, HtJ<? super Unit> htJ) {
            return invoke2((C20Z<? super AHD<Skill>>) c20z, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            String str = this.$categoryId;
            if ("connected".equals(str)) {
                this.this$0.cache.retain(new ConnectorCatalogQuery.Category(str));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C20Z<? super AHD<Skill>> c20z, HtJ<? super Unit> htJ) {
            return ((C138111) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeCachedConnectors$2", f = "HatchConnectorCatalogRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeCachedConnectors$2, reason: invalid class name and case insensitive filesystem */
    public final class C138122 extends AbstractC07127nr implements G0W<C20Z<? super AHD<? extends Skill>>, Throwable, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $categoryId;
        public int label;
        public final /* synthetic */ HatchConnectorCatalogRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138122(String str, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, HtJ<? super C138122> htJ) {
            super(3, htJ);
            this.$categoryId = str;
            this.this$0 = hatchConnectorCatalogRepository;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(C20Z<? super AHD<? extends Skill>> c20z, Throwable th, HtJ<? super Unit> htJ) {
            return invoke2((C20Z<? super AHD<Skill>>) c20z, th, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            String str = this.$categoryId;
            if ("connected".equals(str)) {
                this.this$0.cache.release(new ConnectorCatalogQuery.Category(str));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C20Z<? super AHD<Skill>> c20z, Throwable th, HtJ<? super Unit> htJ) {
            return new C138122(this.$categoryId, this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeConnector$1", f = "HatchConnectorCatalogRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeConnector$1, reason: invalid class name and case insensitive filesystem */
    public final class C138131 extends AbstractC07127nr implements G0V<C20Z<? super Skill>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $connectorId;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeConnector$1$1", f = "HatchConnectorCatalogRepository.kt", l = {109}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeConnector$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $connectorId;
            public int label;
            public final /* synthetic */ HatchConnectorCatalogRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03721(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, HtJ<? super C03721> htJ) {
                super(2, htJ);
                this.this$0 = hatchConnectorCatalogRepository;
                this.$connectorId = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03721(this.this$0, this.$connectorId, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchConnectorCatalogRepository hatchConnectorCatalogRepository = this.this$0;
                    String str = this.$connectorId;
                    this.label = 1;
                    if (hatchConnectorCatalogRepository.m2119fetchConnectorgIAlus(str, this) == enumC10460Hji) {
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
                return ((C03721) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138131(String str, HtJ<? super C138131> htJ) {
            super(2, htJ);
            this.$connectorId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138131(this.$connectorId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchConnectorCatalogRepository.this.cache.retainConnector(this.$connectorId);
            if (HatchConnectorCatalogRepository.this.cache.isConnectorStale(this.$connectorId)) {
                HatchConnectorCatalogRepository hatchConnectorCatalogRepository = HatchConnectorCatalogRepository.this;
                AnonymousClass001.A1J(new C03721(hatchConnectorCatalogRepository, this.$connectorId, null), hatchConnectorCatalogRepository.scope);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super Skill> c20z, HtJ<? super Unit> htJ) {
            return ((C138131) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeConnector$2", f = "HatchConnectorCatalogRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeConnector$2, reason: invalid class name and case insensitive filesystem */
    public final class C138142 extends AbstractC07127nr implements G0W<C20Z<? super Skill>, Throwable, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $connectorId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138142(String str, HtJ<? super C138142> htJ) {
            super(3, htJ);
            this.$connectorId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchConnectorCatalogRepository.this.cache.releaseConnector(this.$connectorId);
            return Unit.INSTANCE;
        }

        @Override // X.G0W
        public final Object invoke(C20Z<? super Skill> c20z, Throwable th, HtJ<? super Unit> htJ) {
            return HatchConnectorCatalogRepository.this.new C138142(this.$connectorId, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeHomepage$1", f = "HatchConnectorCatalogRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeHomepage$1, reason: invalid class name and case insensitive filesystem */
    public final class C138151 extends AbstractC07127nr implements G0V<C20Z<? super ConnectorCatalogHomepage>, HtJ<? super Unit>, Object> {
        public int label;

        public C138151(HtJ<? super C138151> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138151(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchConnectorCatalogRepository.this.cache.retain(null);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super ConnectorCatalogHomepage> c20z, HtJ<? super Unit> htJ) {
            return HatchConnectorCatalogRepository.this.new C138151(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeHomepage$2", f = "HatchConnectorCatalogRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observeHomepage$2, reason: invalid class name and case insensitive filesystem */
    public final class C138162 extends AbstractC07127nr implements G0W<C20Z<? super ConnectorCatalogHomepage>, Throwable, HtJ<? super Unit>, Object> {
        public int label;

        public C138162(HtJ<? super C138162> htJ) {
            super(3, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchConnectorCatalogRepository.this.cache.release(null);
            return Unit.INSTANCE;
        }

        @Override // X.G0W
        public final Object invoke(C20Z<? super ConnectorCatalogHomepage> c20z, Throwable th, HtJ<? super Unit> htJ) {
            return HatchConnectorCatalogRepository.this.new C138162(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observePage$1", f = "HatchConnectorCatalogRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observePage$1, reason: invalid class name and case insensitive filesystem */
    public final class C138171 extends AbstractC07127nr implements G0V<C20Z<? super ConnectorCatalogPage>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConnectorCatalogQuery $query;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138171(ConnectorCatalogQuery connectorCatalogQuery, HtJ<? super C138171> htJ) {
            super(2, htJ);
            this.$query = connectorCatalogQuery;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138171(this.$query, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchConnectorCatalogRepository.this.cache.retain(this.$query);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super ConnectorCatalogPage> c20z, HtJ<? super Unit> htJ) {
            return ((C138171) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observePage$2", f = "HatchConnectorCatalogRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$observePage$2, reason: invalid class name and case insensitive filesystem */
    public final class C138182 extends AbstractC07127nr implements G0W<C20Z<? super ConnectorCatalogPage>, Throwable, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConnectorCatalogQuery $query;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138182(ConnectorCatalogQuery connectorCatalogQuery, HtJ<? super C138182> htJ) {
            super(3, htJ);
            this.$query = connectorCatalogQuery;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchConnectorCatalogRepository.this.cache.release(this.$query);
            return Unit.INSTANCE;
        }

        @Override // X.G0W
        public final Object invoke(C20Z<? super ConnectorCatalogPage> c20z, Throwable th, HtJ<? super Unit> htJ) {
            return HatchConnectorCatalogRepository.this.new C138182(this.$query, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$prefetchHomepage$1", f = "HatchConnectorCatalogRepository.kt", l = {302}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$prefetchHomepage$1, reason: invalid class name and case insensitive filesystem */
    public final class C138191 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C138191(HtJ<? super C138191> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138191(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectorCatalogRepository hatchConnectorCatalogRepository = HatchConnectorCatalogRepository.this;
                this.label = 1;
                if (hatchConnectorCatalogRepository.m2120fetchHomepagegIAlus(false, this) == enumC10460Hji) {
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
            return HatchConnectorCatalogRepository.this.new C138191(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$refreshConnection$1", f = "HatchConnectorCatalogRepository.kt", l = {252, 253}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$refreshConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C138201 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138201(String str, HtJ<? super C138201> htJ) {
            super(2, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138201(this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectorCatalogRepository hatchConnectorCatalogRepository = HatchConnectorCatalogRepository.this;
                String str = this.$id;
                this.label = 1;
                if (hatchConnectorCatalogRepository.refreshConnectionData(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            C3Em<String> c3Em = HatchConnectorCatalogRepository.this._connectionChanges;
            String str2 = this.$id;
            this.label = 2;
            if (c3Em.emit(str2, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C138201) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository", f = "HatchConnectorCatalogRepository.kt", l = {258, 259, 263}, m = "refreshConnectionData", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$refreshConnectionData$1, reason: invalid class name and case insensitive filesystem */
    public final class C138211 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C138211(HtJ<? super C138211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConnectorCatalogRepository.this.refreshConnectionData(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendApiKeyAuthCallback$1", f = "HatchConnectorCatalogRepository.kt", l = {150}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendApiKeyAuthCallback$1, reason: invalid class name and case insensitive filesystem */
    public final class C138221 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $apiKey;
        public final /* synthetic */ String $connectUrl;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138221(String str, String str2, String str3, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HtJ<? super C138221> htJ) {
            super(1, htJ);
            this.$connectorId = str;
            this.$apiKey = str2;
            this.$connectUrl = str3;
            this.$origin = hatchSkillOAuthOrigin;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138221(this.$connectorId, this.$apiKey, this.$connectUrl, this.$origin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSkillAuthRepository auraSkillAuthRepository = HatchConnectorCatalogRepository.this.authRepository;
                String str = this.$connectorId;
                String str2 = this.$apiKey;
                String str3 = this.$connectUrl;
                HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
                this.label = 1;
                obj = auraSkillAuthRepository.sendApiKeyAuthCallback(str, str2, str3, hatchSkillOAuthOrigin, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((C138221) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository", f = "HatchConnectorCatalogRepository.kt", l = {183}, m = "sendConsentAuthCallback", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$1, reason: invalid class name and case insensitive filesystem */
    public final class C138231 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C138231(HtJ<? super C138231> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConnectorCatalogRepository.this.sendConsentAuthCallback(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$2", f = "HatchConnectorCatalogRepository.kt", l = {FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$2, reason: invalid class name and case insensitive filesystem */
    public final class C138242 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConnectorAuthResult>, Object> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ String $sourceSessionId;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$2$1", f = "HatchConnectorCatalogRepository.kt", l = {180}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
            public final /* synthetic */ String $connectorId;
            public final /* synthetic */ HatchSkillOAuthOrigin $origin;
            public final /* synthetic */ String $sourceSessionId;
            public int label;
            public final /* synthetic */ HatchConnectorCatalogRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = hatchConnectorCatalogRepository;
                this.$connectorId = str;
                this.$origin = hatchSkillOAuthOrigin;
                this.$sourceSessionId = str2;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$connectorId, this.$origin, this.$sourceSessionId, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraSkillAuthRepository auraSkillAuthRepository = this.this$0.authRepository;
                    String str = this.$connectorId;
                    HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
                    String str2 = this.$sourceSessionId;
                    this.label = 1;
                    obj = auraSkillAuthRepository.sendConsentAuthCallback(str, hatchSkillOAuthOrigin, str2, this);
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

            @Override // X.G0U
            public final Object invoke(HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138242(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, HtJ<? super C138242> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.$origin = hatchSkillOAuthOrigin;
            this.$sourceSessionId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138242(this.$connectorId, this.$origin, this.$sourceSessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectorCatalogRepository hatchConnectorCatalogRepository = HatchConnectorCatalogRepository.this;
                String str = this.$connectorId;
                HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchConnectorCatalogRepository, str, hatchSkillOAuthOrigin, this.$sourceSessionId, null);
                this.label = 1;
                obj = hatchConnectorCatalogRepository.authenticateAndRefresh(str, hatchSkillOAuthOrigin, anonymousClass1, this);
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConnectorAuthResult> htJ) {
            return ((C138242) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendUsernamePasswordAuthCallback$1", f = "HatchConnectorCatalogRepository.kt", l = {162}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendUsernamePasswordAuthCallback$1, reason: invalid class name and case insensitive filesystem */
    public final class C138251 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $connectUrl;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ String $password;
        public final /* synthetic */ String $username;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138251(String str, String str2, String str3, String str4, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HtJ<? super C138251> htJ) {
            super(1, htJ);
            this.$connectorId = str;
            this.$username = str2;
            this.$password = str3;
            this.$connectUrl = str4;
            this.$origin = hatchSkillOAuthOrigin;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchConnectorCatalogRepository.this.new C138251(this.$connectorId, this.$username, this.$password, this.$connectUrl, this.$origin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSkillAuthRepository auraSkillAuthRepository = HatchConnectorCatalogRepository.this.authRepository;
                String str = this.$connectorId;
                String str2 = this.$username;
                String str3 = this.$password;
                String str4 = this.$connectUrl;
                HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
                this.label = 1;
                obj = auraSkillAuthRepository.sendUsernamePasswordAuthCallback(str, str2, str3, str4, hatchSkillOAuthOrigin, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((C138251) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void launchAuthAndRefresh(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, G0U<? super HtJ<? super Boolean>, ? extends Object> g0u) {
        C3UX c3ux = this.scope;
        GAo.A02(C79.A0K, C6ys.A00, new C138101(str, hatchSkillOAuthOrigin, g0u, null), c3ux);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshConnection(String str, SkillState skillState, boolean z) {
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        if ((skillState == null && str != null && isAuthCallbackInFlight(str)) || this.cache.invalidate(str, skillState, z) == null) {
            return;
        }
        AnonymousClass001.A1J(new C138201(str, null), this.scope);
    }

    public final void checkLinkedAccountAndPromote(String str) {
        C7384Etj.A0Y(str, 0);
        FirstPartyConnectorConfig firstPartyConnectorConfigFirstPartyConnectorConfigForSkill = SkillConnectConfigKt.firstPartyConnectorConfigForSkill(str);
        if (firstPartyConnectorConfigFirstPartyConnectorConfigForSkill != null) {
            AnonymousClass001.A1J(new C138061(str, firstPartyConnectorConfigFirstPartyConnectorConfigForSkill, null), this.scope);
        }
    }

    public final Skill getCachedConnector(String str) {
        C7384Etj.A0Y(str, 0);
        return this.cache.connector(str);
    }

    public final ConnectorCatalogPage getCachedPage(ConnectorCatalogQuery connectorCatalogQuery) {
        C7384Etj.A0Y(connectorCatalogQuery, 0);
        return this.cache.page(connectorCatalogQuery);
    }

    public final void handleCustomConnectorComplete(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        if ("/connect/complete".equals(uri.getPath())) {
            launchAuthAndRefresh(null, null, new C138071(uri, null));
        }
    }

    public final void handleOAuthCallback(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        if ("/api/hatch/oauth/callback".equals(uri.getPath())) {
            String strConsumeOAuthConnector = this.authRepository.consumeOAuthConnector(uri.getQueryParameter("state"));
            launchAuthAndRefresh(strConsumeOAuthConnector, null, new C138081(uri, strConsumeOAuthConnector, null));
        }
    }

    public final void handleStripeLinkConnectComplete(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        if ("/stripe_link/connect/complete".equals(uri.getPath())) {
            String strConsumeOAuthConnector = this.authRepository.consumeOAuthConnector(uri.getQueryParameter("state"));
            launchAuthAndRefresh(strConsumeOAuthConnector, null, new C138091(uri, strConsumeOAuthConnector, null));
        }
    }

    public final boolean hasFreshPage(ConnectorCatalogQuery connectorCatalogQuery, boolean z) {
        C7384Etj.A0Y(connectorCatalogQuery, 0);
        return this.cache.hasFreshPage(connectorCatalogQuery, z, null);
    }

    public final boolean hasRecentPage(ConnectorCatalogQuery connectorCatalogQuery) {
        C7384Etj.A0Y(connectorCatalogQuery, 0);
        return this.cache.hasFreshPage(connectorCatalogQuery, false, 60000L);
    }

    public final C20Q<Skill> observeConnector(String str) {
        C7384Etj.A0Y(str, 0);
        return new C10650I0u(0, new C138142(str, null), new C10650I0u(new C138131(str, null), this.cache.observeConnector(str), 1));
    }

    public final C20Q<ConnectorCatalogPage> observePage(ConnectorCatalogQuery connectorCatalogQuery) {
        C7384Etj.A0Y(connectorCatalogQuery, 0);
        return new C10650I0u(0, new C138182(connectorCatalogQuery, null), new C10650I0u(new C138171(connectorCatalogQuery, null), this.cache.observePage(connectorCatalogQuery), 1));
    }

    public final void onResumeAfterAuth(String str) {
        refreshConnection(str, null, false);
    }

    public final void prefetchCategoryPages(ConnectorCatalogHomepage connectorCatalogHomepage) {
        C7384Etj.A0Y(connectorCatalogHomepage, 0);
        AIY aiy = new AIY();
        Iterator it = connectorCatalogHomepage.categories.iterator();
        while (it.hasNext()) {
            aiy.add(((ConnectorCatalogSection) it.next()).category.id);
        }
        if (connectorCatalogHomepage.customCount > 0) {
            aiy.add(ConnectorCatalogKt.CUSTOM_CATEGORY_ID);
        }
        Iterator<E> it2 = AIX.A00(aiy).iterator();
        while (it2.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it2);
            AnonymousClass001.A1J(new HatchConnectorCatalogRepository$prefetchCategoryPages$1$1(this, strA0j, null), this.scope);
        }
    }

    public final void sendApiKeyAuthCallback(String str, String str2, String str3, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        AnonymousClass005.A0y(str, str2, hatchSkillOAuthOrigin);
        launchAuthAndRefresh(str, hatchSkillOAuthOrigin, new C138221(str, str2, str3, hatchSkillOAuthOrigin, null));
    }

    public final void sendUsernamePasswordAuthCallback(String str, String str2, String str3, String str4, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(hatchSkillOAuthOrigin, 4);
        launchAuthAndRefresh(str, hatchSkillOAuthOrigin, new C138251(str, str2, str3, str4, hatchSkillOAuthOrigin, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Hji, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.facebook.aura.skills.repo.ConnectorAuthResult] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object authenticateAndRefresh(java.lang.String r12, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin r13, X.G0U<? super X.HtJ<? super java.lang.Boolean>, ? extends java.lang.Object> r14, X.HtJ<? super com.facebook.aura.skills.repo.ConnectorAuthResult> r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.authenticateAndRefresh(java.lang.String, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:19:0x0067, B:20:0x006b, B:38:0x00c3, B:15:0x0047, B:16:0x004d, B:42:0x00cd, B:23:0x0072, B:24:0x0082, B:26:0x0088, B:28:0x0095, B:29:0x0099, B:30:0x009d, B:32:0x00a3, B:33:0x00af, B:35:0x00b3), top: B:48:0x0067 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0064 -> B:20:0x006b). Please report as a decompilation issue!!! */
    /* renamed from: fetchAllConnectedPages-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2109fetchAllConnectedPagesgIAlus(long r13, X.HtJ<? super X.HsJ<? extends X.AHD<com.facebook.aura.skills.model.Skill>>> r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.m2109fetchAllConnectedPagesgIAlus(long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:69)|29|63|30|(2:32|62)|65|33|51|(1:53)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:10|(2:67|12)|65|33|51|(3:(1:58)(2:22|(2:24|(10:69|29|63|30|(2:32|62)|65|33|51|(1:53)|(0)(0))(1:28))(1:48))|59|60)(1:71)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
    
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
    
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f1, code lost:
    
        r15 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[PHI: r2 r3 r4 r5 r8 r11 r12 r14
  0x008c: PHI (r2v7 com.facebook.aura.network.api.JarvisPath) = (r2v2 com.facebook.aura.network.api.JarvisPath), (r2v10 com.facebook.aura.network.api.JarvisPath) binds: [B:21:0x0079, B:57:0x0126] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r3v5 X.HxE[]) = (r3v2 X.HxE[]), (r3v6 X.HxE[]) binds: [B:21:0x0079, B:57:0x0126] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r4v3 com.facebook.aura.skills.model.ConnectorCatalogQuery$Category) = 
  (r4v0 com.facebook.aura.skills.model.ConnectorCatalogQuery$Category)
  (r4v4 com.facebook.aura.skills.model.ConnectorCatalogQuery$Category)
 binds: [B:21:0x0079, B:57:0x0126] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r5v3 com.facebook.aura.skills.repo.HatchConnectorCatalogRepository) = 
  (r5v0 com.facebook.aura.skills.repo.HatchConnectorCatalogRepository)
  (r5v4 com.facebook.aura.skills.repo.HatchConnectorCatalogRepository)
 binds: [B:21:0x0079, B:57:0x0126] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r8v5 int) = (r8v1 int), (r8v6 int) binds: [B:21:0x0079, B:57:0x0126] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r11v3 java.lang.Number) = (r11v0 java.lang.Number), (r11v4 java.lang.Number) binds: [B:21:0x0079, B:57:0x0126] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r12v3 java.lang.String) = (r12v0 java.lang.String), (r12v4 java.lang.String) binds: [B:21:0x0079, B:57:0x0126] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r14v3 com.facebook.aura.skills.model.ConnectorCatalogQuery) = 
  (r14v0 com.facebook.aura.skills.model.ConnectorCatalogQuery)
  (r14v4 com.facebook.aura.skills.model.ConnectorCatalogQuery)
 binds: [B:21:0x0079, B:57:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e3 -> B:65:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0109 -> B:51:0x010e). Please report as a decompilation issue!!! */
    /* renamed from: fetchCategoryPage-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2110fetchCategoryPageBWLJW6A(java.lang.String r23, java.lang.String r24, java.lang.Long r25, X.HtJ<? super X.HsJ<com.facebook.aura.skills.model.ConnectorCatalogPage>> r26) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.m2110fetchCategoryPageBWLJW6A(java.lang.String, java.lang.String, java.lang.Long, X.HtJ):java.lang.Object");
    }

    /* renamed from: fetchCategoryPage-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m2111fetchCategoryPageBWLJW6A$default(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, String str2, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return hatchConnectorCatalogRepository.m2110fetchCategoryPageBWLJW6A(str, str2, l, htJ);
    }

    public static /* synthetic */ void launchAuthAndRefresh$default(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchSkillOAuthOrigin = null;
        }
        hatchConnectorCatalogRepository.launchAuthAndRefresh(str, hatchSkillOAuthOrigin, g0u);
    }

    public static /* synthetic */ void refreshConnection$default(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, SkillState skillState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            skillState = null;
        }
        hatchConnectorCatalogRepository.refreshConnection(str, skillState, AnonymousClass005.A1O(i, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:34:0x008c, B:39:0x00a2], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:39:0x00a2, B:34:0x008c], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:39:0x00a2, B:36:0x0094], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshConnectionData(java.lang.String r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.C138211
            if (r0 == 0) goto Laa
            r4 = r11
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$refreshConnectionData$1 r4 = (com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.C138211) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r8 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 3
            r6 = 2
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L53
            if (r0 == r1) goto L66
            if (r0 == r6) goto L80
            if (r0 != r3) goto Lb1
            int r1 = r4.I$0
            java.lang.Object r6 = r4.L$3
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r0 = X.AnonymousClass001.A0q(r8)
        L2e:
            boolean r0 = r0 instanceof X.C10571Hud
            if (r0 == 0) goto L33
            r1 = 0
        L33:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.String r2 = X.AnonymousClass005.A0j(r6)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r6
            r4.L$4 = r0
            r4.I$0 = r1
            r4.label = r3
            java.lang.Object r0 = r9.m2119fetchConnectorgIAlus(r2, r4)
            if (r0 != r5) goto L2e
            return r5
        L53:
            X.Hwg.A00(r8)
            if (r10 == 0) goto L72
            r4.L$0 = r10
            r0 = 0
            r4.L$1 = r0
            r4.label = r1
            java.lang.Object r0 = r9.m2119fetchConnectorgIAlus(r10, r4)
            if (r0 != r5) goto L6c
            return r5
        L66:
            java.lang.Object r10 = r4.L$0
            java.lang.Object r0 = X.AnonymousClass001.A0q(r8)
        L6c:
            X.HsJ r2 = new X.HsJ
            r2.<init>(r0)
            goto L73
        L72:
            r2 = 0
        L73:
            r4.L$0 = r10
            r4.L$1 = r2
            r4.label = r6
            java.lang.Object r1 = r9.m2120fetchHomepagegIAlus(r1, r4)
            if (r1 != r5) goto L8a
            return r5
        L80:
            java.lang.Object r2 = r4.L$1
            X.HsJ r2 = (X.HsJ) r2
            java.lang.Object r10 = r4.L$0
            java.lang.Object r1 = X.AnonymousClass001.A0q(r8)
        L8a:
            if (r2 == 0) goto La2
            java.lang.Object r0 = r2.value
            boolean r0 = r0 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 != 0) goto La2
        L94:
            r1 = 0
        L95:
            if (r10 != 0) goto Lb6
            com.facebook.aura.skills.repo.ConnectorCatalogCache r0 = r9.cache
            java.util.List r0 = r0.staleObservedConnectorIds()
            java.util.Iterator r6 = r0.iterator()
            goto L33
        La2:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            r1 = 1
            if (r0 != 0) goto L95
            goto L94
        Laa:
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$refreshConnectionData$1 r4 = new com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$refreshConnectionData$1
            r4.<init>(r11)
            goto L12
        Lb1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lb6:
            if (r1 == 0) goto Lb9
            r7 = 1
        Lb9:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.refreshConnectionData(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* renamed from: request-hUnOzRk, reason: not valid java name */
    private final /* synthetic */ <T, R> Object m2114requesthUnOzRk(JarvisPath jarvisPath, ConnectorCatalogQuery connectorCatalogQuery, HxE<String, ? extends Object>[] hxEArr, Long l, G0V<? super T, ? super Long, ? extends R> g0v, HtJ<? super HsJ<? extends R>> htJ) {
        throw new NullPointerException("getContext");
    }

    /* renamed from: request-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ Object m2115requesthUnOzRk$default(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, JarvisPath jarvisPath, ConnectorCatalogQuery connectorCatalogQuery, HxE[] hxEArr, Long l, G0V g0v, HtJ htJ, int i, Object obj) {
        throw new NullPointerException("getContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bc -> B:28:0x00c2). Please report as a decompilation issue!!! */
    /* renamed from: searchConnectors-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2116searchConnectorsBWLJW6A(java.lang.String r16, java.lang.String r17, java.lang.String r18, X.HtJ<? super X.HsJ<com.facebook.aura.skills.model.ConnectorCatalogPage>> r19) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.m2116searchConnectorsBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* renamed from: searchConnectors-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m2117searchConnectorsBWLJW6A$default(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, String str2, String str3, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return hatchConnectorCatalogRepository.m2116searchConnectorsBWLJW6A(str, str2, str3, htJ);
    }

    public static /* synthetic */ Object sendConsentAuthCallback$default(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchSkillOAuthOrigin = HatchSkillOAuthOrigin.CHAT;
        }
        return hatchConnectorCatalogRepository.sendConsentAuthCallback(str, hatchSkillOAuthOrigin, AnonymousClass006.A0t(i, str2), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectorCatalogPage toPage(ConnectorCatalogPageJson connectorCatalogPageJson) {
        ConnectorCatalogCategoryJson connectorCatalogCategoryJson = connectorCatalogPageJson.category;
        return new ConnectorCatalogPage(connectorCatalogCategoryJson != null ? connectorCatalogCategoryJson.toDomain() : null, toSkills(connectorCatalogPageJson.featured), toSkills(connectorCatalogPageJson.connectors), connectorCatalogPageJson.next_cursor, connectorCatalogPageJson.total_count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AHD<Skill> toSkills(List<ConnectorJson> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConnectorJson> it = list.iterator();
        while (it.hasNext()) {
            Skill domain = it.next().toDomain();
            if (domain != null) {
                arrayList.add(domain);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AnonymousClass006.A1F(((Skill) obj).id, obj, arrayList2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            AnonymousClass006.A1P(((Skill) obj2).id, obj2, hashSet, arrayList3);
        }
        return AGI.A0C(arrayList3);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cache.clear();
        Hxb.A03(null, this.scope);
        this.connectingCallbacks.Af8(C0881AGi.A00);
        this.requests.clearAndCancelAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /* renamed from: fetchConnectedConnectors-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2118fetchConnectedConnectorsIoAF18A(X.HtJ<? super X.HsJ<? extends X.AHD<com.facebook.aura.skills.model.Skill>>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnectedConnectors$1
            if (r0 == 0) goto L5b
            r6 = r10
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnectedConnectors$1 r6 = (com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnectedConnectors$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L37
            if (r0 != r5) goto L61
            long r3 = r6.J$0
            X.Hwg.A00(r1)
        L22:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r8 = r1.value
            com.facebook.aura.skills.repo.ConnectorCatalogCache r0 = r9.cache
            java.lang.Long r0 = r0.getGeneration()
            if (r0 == 0) goto L3a
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3a
            return r8
        L37:
            X.Hwg.A00(r1)
        L3a:
            java.lang.Long r0 = X.AnonymousClass007.A0R(r9, r6)
            if (r0 == 0) goto L66
            long r3 = r0.longValue()
            X.3UX r2 = r9.scope
            r1 = 0
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1 r0 = new com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1
            r0.<init>(r9, r3, r1)
            X.Hrx r0 = X.AnonymousClass001.A10(r0, r2)
            r6.J$0 = r3
            r6.label = r5
            java.lang.Object r1 = r0.A0E(r6)
            if (r1 != r7) goto L22
            return r7
        L5b:
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnectedConnectors$1 r6 = new com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnectedConnectors$1
            r6.<init>(r9, r10)
            goto L12
        L61:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L66:
            java.lang.String r1 = "Connector session ended"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            X.Hud r8 = new X.Hud
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.m2118fetchConnectedConnectorsIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0073 -> B:22:0x0079). Please report as a decompilation issue!!! */
    /* renamed from: fetchConnector-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2119fetchConnectorgIAlus(java.lang.String r15, X.HtJ<? super X.HsJ<com.facebook.aura.skills.model.Skill>> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnector$1
            if (r0 == 0) goto L2f
            r4 = r3
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnector$1 r4 = (com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnector$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r10 = 0
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L35
            long r11 = r4.J$0
            java.lang.Object r9 = r4.L$3
            X.HxE[] r9 = (X.HxE[]) r9
            java.lang.Object r8 = r4.L$2
            com.facebook.aura.network.api.JarvisPath r8 = (com.facebook.aura.network.api.JarvisPath) r8
            java.lang.Object r7 = r4.L$1
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r7 = (com.facebook.aura.skills.repo.HatchConnectorCatalogRepository) r7
            goto L76
        L2f:
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnector$1 r4 = new com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnector$1
            r4.<init>(r14, r3)
            goto L14
        L35:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3a:
            X.Hwg.A00(r0)
            java.lang.String r0 = android.net.Uri.encode(r15)
            X.C7384Etj.A0U(r0)
            com.facebook.aura.network.api.JarvisPath$Connector r8 = new com.facebook.aura.network.api.JarvisPath$Connector
            r8.<init>(r0)
            r0 = 0
            X.HxE[] r9 = new X.HxE[r0]
            r7 = r14
        L4d:
            java.lang.Long r0 = X.AnonymousClass007.A0R(r7, r4)
            if (r0 == 0) goto Lb0
            long r11 = r0.longValue()
            X.3UX r0 = r7.scope     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnector-gIAlu-s$$inlined$request-hUnOzRk$default$1 r6 = new com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnector-gIAlu-s$$inlined$request-hUnOzRk$default$1     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            r13 = r10
            r6.<init>(r7, r8, r9, r10, r11, r13, r14)     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            X.Hrx r0 = X.AnonymousClass001.A10(r6, r0)     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            r4.L$0 = r10     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            r4.L$1 = r7     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            r4.L$2 = r8     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            r4.L$3 = r9     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            r4.J$0 = r11     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            r4.label = r2     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            java.lang.Object r0 = r0.A0E(r4)     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L87
            if (r0 != r3) goto L79
            goto Laf
        L76:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L89
        L79:
            X.HsJ r0 = (X.HsJ) r0     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L89
            java.lang.Object r1 = r0.value     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L89
            goto L96
        L7e:
            r0 = move-exception
            goto L81
        L80:
            r0 = move-exception
        L81:
            X.Hud r1 = new X.Hud
            r1.<init>(r0)
            goto L96
        L87:
            r5 = move-exception
            goto L8a
        L89:
            r5 = move-exception
        L8a:
            X.78T r0 = r4.getContext()
            X.HzS.A05(r0)
            X.Hud r1 = new X.Hud
            r1.<init>(r5)
        L96:
            com.facebook.aura.skills.repo.ConnectorCatalogCache r0 = r7.cache
            java.lang.Long r0 = r0.getGeneration()
            if (r0 == 0) goto L4d
            long r5 = r0.longValue()
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L4d
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            boolean r0 = r0 instanceof com.facebook.aura.skills.repo.ConnectorCatalogInvalidatedException
            if (r0 == 0) goto Lbc
            goto L4d
        Laf:
            return r3
        Lb0:
            java.lang.String r1 = "Connector session ended"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            X.Hud r1 = new X.Hud
            r1.<init>(r0)
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.m2119fetchConnectorgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        if ((X.HsJ.A00(r1) instanceof com.facebook.aura.skills.repo.ConnectorCatalogInvalidatedException) == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008f -> B:29:0x0095). Please report as a decompilation issue!!! */
    /* renamed from: fetchHomepage-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2120fetchHomepagegIAlus(boolean r15, X.HtJ<? super X.HsJ<com.facebook.aura.skills.model.ConnectorCatalogHomepage>> r16) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.m2120fetchHomepagegIAlus(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* renamed from: fetchQueryPage-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2121fetchQueryPage0E7RQCE(com.facebook.aura.skills.model.ConnectorCatalogQuery r7, java.lang.String r8, X.HtJ<? super X.HsJ<com.facebook.aura.skills.model.ConnectorCatalogPage>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchQueryPage$1
            if (r0 == 0) goto L25
            r5 = r9
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchQueryPage$1 r5 = (com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchQueryPage$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L5a
            if (r0 == r3) goto L5a
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L25:
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchQueryPage$1 r5 = new com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchQueryPage$1
            r5.<init>(r6, r9)
            goto L12
        L2b:
            X.Hwg.A00(r1)
            boolean r0 = r7 instanceof com.facebook.aura.skills.model.ConnectorCatalogQuery.Category
            if (r0 == 0) goto L44
            com.facebook.aura.skills.model.ConnectorCatalogQuery$Category r7 = (com.facebook.aura.skills.model.ConnectorCatalogQuery.Category) r7
            java.lang.String r1 = r7.id
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r2
            java.lang.Object r0 = r6.m2110fetchCategoryPageBWLJW6A(r1, r8, r0, r5)
        L41:
            if (r0 != r4) goto L5e
            return r4
        L44:
            boolean r0 = r7 instanceof com.facebook.aura.skills.model.ConnectorCatalogQuery.Search
            if (r0 == 0) goto L5f
            com.facebook.aura.skills.model.ConnectorCatalogQuery$Search r7 = (com.facebook.aura.skills.model.ConnectorCatalogQuery.Search) r7
            java.lang.String r2 = r7.query
            java.lang.String r1 = r7.categoryId
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r3
            java.lang.Object r0 = r6.m2116searchConnectorsBWLJW6A(r2, r1, r8, r5)
            goto L41
        L5a:
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L5e:
            return r0
        L5f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.m2121fetchQueryPage0E7RQCE(com.facebook.aura.skills.model.ConnectorCatalogQuery, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final C22I<ConnectorAuthResult> getAuthResults() {
        return this.authResults;
    }

    public final AHD<Skill> getCachedConnectors(String str) {
        return this.cache.connectors(str);
    }

    public final ConnectorCatalogHomepage getCachedHomepage() {
        return this.cache.getHomepage();
    }

    public final C1BN<BQI<String>> getConnectingIds() {
        return this.connectingIds;
    }

    public final C22I<String> getConnectionChanges() {
        return this.connectionChanges;
    }

    public final boolean isAuthCallbackInFlight(String str) {
        List<String> value = this.connectingCallbacks.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            for (Object obj : value) {
                if (str == null || str.equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C20Q<AHD<Skill>> observeCachedConnectors(String str) {
        return new C10650I0u(0, new C138122(str, this, null), new C10650I0u(new C138111(str, this, null), this.cache.observeConnectors(str), 1));
    }

    public final C20Q<ConnectorCatalogHomepage> observeHomepage() {
        return new C10650I0u(0, new C138162(null), new C10650I0u(new C138151(null), this.cache.observeHomepage(), 1));
    }

    public final void prefetchHomepage() {
        AnonymousClass001.A1J(new C138191(null), this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendConsentAuthCallback(java.lang.String r8, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin r9, java.lang.String r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.C138231
            if (r0 == 0) goto L4b
            r5 = r11
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$1 r5 = (com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.C138231) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L51
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.skills.repo.ConnectorAuthResult r1 = (com.facebook.aura.skills.repo.ConnectorAuthResult) r1
            boolean r0 = r1.authenticationSucceeded
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L29:
            X.Hwg.A00(r1)
            X.3UX r2 = r7.scope
            java.lang.Integer r1 = X.C79.A0K
            r11 = 0
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$2 r6 = new com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$2
            r6.<init>(r8, r9, r10, r11)
            X.6ys r0 = X.C6ys.A00
            X.Hrx r0 = X.GAo.A01(r1, r0, r6, r2)
            r5.L$0 = r11
            r5.L$1 = r11
            r5.L$2 = r11
            r5.label = r3
            java.lang.Object r1 = r0.A0E(r5)
            if (r1 != r4) goto L20
            return r4
        L4b:
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$1 r5 = new com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$sendConsentAuthCallback$1
            r5.<init>(r11)
            goto L12
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.sendConsentAuthCallback(java.lang.String, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchConnectorCatalogRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchConnectorCatalogRepository) abstractC3358CGz.A03(HatchConnectorCatalogRepository.class, new HatchConnectorCatalogRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchConnectorCatalogRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public static /* synthetic */ void sendApiKeyAuthCallback$default(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, String str2, String str3, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, int i, Object obj) {
        String strA0t = AnonymousClass006.A0t(i, str3);
        if ((i & 8) != 0) {
            hatchSkillOAuthOrigin = HatchSkillOAuthOrigin.CHAT;
        }
        hatchConnectorCatalogRepository.sendApiKeyAuthCallback(str, str2, strA0t, hatchSkillOAuthOrigin);
    }

    public static /* synthetic */ void sendUsernamePasswordAuthCallback$default(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, String str2, String str3, String str4, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, int i, Object obj) {
        String strA0u = AnonymousClass006.A0u(i, str4);
        if ((i & 16) != 0) {
            hatchSkillOAuthOrigin = HatchSkillOAuthOrigin.CHAT;
        }
        hatchConnectorCatalogRepository.sendUsernamePasswordAuthCallback(str, str2, str3, strA0u, hatchSkillOAuthOrigin);
    }

    public final Object disconnectSkill(String str, String str2, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, str2, this, null));
    }

    public HatchConnectorCatalogRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HzC hzCA02 = Hxb.A02(new C8eO(null).plus(AuraDispatchers.INSTANCE.m764default()).plus(new HatchConnectorCatalogRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
        this.scope = hzCA02;
        this.requests = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        int i = GCQ.A00;
        this.categoryPrefetchSemaphore = new C27i(3);
        this.cache = new ConnectorCatalogCache();
        this.authRepository = AuraSkillAuthRepository.Companion.getInstance(abstractC3358CGz);
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, 16);
        this._connectionChanges = c9290GCr;
        this.connectionChanges = new C3pd(c9290GCr);
        C9286GCn c9286GCnA01 = HnJ.A01(C0881AGi.A00);
        this.connectingCallbacks = c9286GCnA01;
        C9290GCr c9290GCr2 = new C9290GCr(num, 0, 16);
        this._authResults = c9290GCr2;
        this.authResults = new C3pd(c9290GCr2);
        this.connectingIds = AnonymousClass441.A00(C0943AIw.A03, hzCA02, new HatchConnectorCatalogRepository$special$$inlined$map$1(c9286GCnA01), C3Ek.A00);
    }
}
