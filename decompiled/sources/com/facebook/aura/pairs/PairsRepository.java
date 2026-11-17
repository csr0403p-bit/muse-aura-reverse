package com.facebook.aura.pairs;

import X.AGH;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass602;
import X.BLG;
import X.C06H;
import X.C10550Hrx;
import X.C1BN;
import X.C20Q;
import X.C27k;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GDB;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.HzS;
import X.InterfaceC2178B0w;
import X.InterfaceC7549F2g;
import android.net.Uri;
import android.util.LruCache;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MC;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class PairsRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<Integer> _invalidations;
    public final HashSet<String> acceptedRequests;
    public final C3UX backgroundScope;
    public final C20Q<Unit> changes;
    public final HashMap<String, String> connectionIds;
    public final ConcurrentHashMap<String, String> connectionNameCache;
    public final SingleFlight detailFlight;
    public final HashMap<String, PairsGuidanceSave> guidanceSaves;
    public final ArrayList<PairsHeldInvite> heldInvites;
    public final LruCache<String, InterfaceC2178B0w> imageCache;
    public final ConcurrentHashMap<String, C27k<InterfaceC2178B0w>> imageLoads;
    public final C1BN<Integer> invalidations;
    public volatile boolean invitesOfferCollaborator;
    public final HashMap<String, String> linkFragments;
    public String linkGatewayUrl;
    public final Object linkLock;
    public final PairsMintedInviteStore mintedInvites;
    public final PairsPendingLevelStore pendingLevels;
    public final PairsPendingShareStore pendingShares;
    public volatile boolean presetsOfferCollaborator;
    public final HashMap<String, PairsPairingCode> receiverCodes;
    public final HashSet<String> receiverConfirmations;
    public final LinkedHashMap<String, String> stagedAcceptLinks;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "acceptLink", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$acceptLink$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.acceptLink(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1904}, m = "access", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$access$1, reason: invalid class name and case insensitive filesystem */
    public final class C129251 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
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

        public C129251(HtJ<? super C129251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.access(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {732}, m = "activityFeed", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$activityFeed$1, reason: invalid class name and case insensitive filesystem */
    public final class C129261 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C129261(HtJ<? super C129261> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.activityFeed(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1907}, m = "activityPage", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$activityPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C129271 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
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

        public C129271(HtJ<? super C129271> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.activityPage(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1026}, m = "applyPendingLevels", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$applyPendingLevels$1, reason: invalid class name and case insensitive filesystem */
    public final class C129281 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C129281(HtJ<? super C129281> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.applyPendingLevels(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1326, 1902}, m = "cancelInvite", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$cancelInvite$1, reason: invalid class name and case insensitive filesystem */
    public final class C129291 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
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

        public C129291(HtJ<? super C129291> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.cancelInvite(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {319}, m = "canonicalRules", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$canonicalRules$1, reason: invalid class name and case insensitive filesystem */
    public final class C129301 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129301(HtJ<? super C129301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.canonicalRules(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {322}, m = "canonicalRulesFor", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$canonicalRulesFor$1, reason: invalid class name and case insensitive filesystem */
    public final class C129311 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129311(HtJ<? super C129311> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.canonicalRulesFor(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "changeLevel", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$changeLevel$1, reason: invalid class name and case insensitive filesystem */
    public final class C129321 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129321(HtJ<? super C129321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.changeLevel(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {356, 357}, m = "collaboratingResources", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$collaboratingResources$1, reason: invalid class name and case insensitive filesystem */
    public final class C129331 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C129331(HtJ<? super C129331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.collaboratingResources(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository$confirmPairings$1", f = "PairsRepository.kt", l = {989, 990}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$confirmPairings$1, reason: invalid class name and case insensitive filesystem */
    public final class C129341 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $generationId;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129341(String str, HtJ<? super C129341> htJ) {
            super(2, htJ);
            this.$generationId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsRepository.this.new C129341(this.$generationId, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0098 A[Catch: all -> 0x00c7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:41:0x0098, B:50:0x00ac, B:61:0x00c0, B:25:0x0058, B:26:0x005b, B:28:0x0065, B:30:0x006d, B:32:0x0075, B:33:0x007b, B:38:0x0090, B:35:0x0082, B:36:0x0088, B:56:0x00b6, B:57:0x00b7, B:17:0x0039, B:18:0x003c, B:20:0x0040, B:22:0x0044, B:47:0x00a3, B:10:0x0019, B:11:0x001f, B:13:0x0028, B:14:0x0029, B:54:0x00b4), top: B:71:0x0006, inners: #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.C129341.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C129341) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "confirmSafetyCode", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$confirmSafetyCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C129351 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129351(HtJ<? super C129351> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.confirmSafetyCode(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {658}, m = "connectionContact", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$connectionContact$1, reason: invalid class name and case insensitive filesystem */
    public final class C129361 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129361(HtJ<? super C129361> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.connectionContact(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {543, 545}, m = "connectionDetail", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$connectionDetail$1, reason: invalid class name and case insensitive filesystem */
    public final class C129371 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C129371(HtJ<? super C129371> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.connectionDetail(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {705}, m = "connectionIdFor", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$connectionIdFor$1, reason: invalid class name and case insensitive filesystem */
    public final class C129381 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129381(HtJ<? super C129381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.connectionIdFor(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {626}, m = "connectionInfo", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$connectionInfo$1, reason: invalid class name and case insensitive filesystem */
    public final class C129391 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129391(HtJ<? super C129391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.connectionInfo(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {383}, m = "connectionNames", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$connectionNames$1, reason: invalid class name and case insensitive filesystem */
    public final class C129401 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C129401(HtJ<? super C129401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.connectionNames(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {347, 348}, m = "connectionResources", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$connectionResources$1, reason: invalid class name and case insensitive filesystem */
    public final class C129411 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C129411(HtJ<? super C129411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.connectionResources(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1907}, m = "connectionResourcesFor", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$connectionResourcesFor$1, reason: invalid class name and case insensitive filesystem */
    public final class C129421 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
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

        public C129421(HtJ<? super C129421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.connectionResourcesFor(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {808}, m = HatchNodeCardJsonKt.TYPE_CONTACTS, v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$contacts$1, reason: invalid class name and case insensitive filesystem */
    public final class C129431 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129431(HtJ<? super C129431> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.contacts(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "copyLink", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$copyLink$1, reason: invalid class name and case insensitive filesystem */
    public final class C129441 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
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

        public C129441(HtJ<? super C129441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.copyLink(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "createInvite", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$createInvite$1, reason: invalid class name and case insensitive filesystem */
    public final class C129451 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129451(HtJ<? super C129451> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.createInvite(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "createInviteLink", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$createInviteLink$1, reason: invalid class name and case insensitive filesystem */
    public final class C129461 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
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

        public C129461(HtJ<? super C129461> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.createInviteLink(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "createSpaceInvite", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$createSpaceInvite$1, reason: invalid class name and case insensitive filesystem */
    public final class C129471 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129471(HtJ<? super C129471> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.createSpaceInvite(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "declineInbox", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$declineInbox$1, reason: invalid class name and case insensitive filesystem */
    public final class C129481 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
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

        public C129481(HtJ<? super C129481> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.declineInbox(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1914}, m = "deliverToInbox", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$deliverToInbox$1, reason: invalid class name and case insensitive filesystem */
    public final class C129491 extends HzP {
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
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C129491(HtJ<? super C129491> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.deliverToInbox(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1907}, m = "directory", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$directory$1, reason: invalid class name and case insensitive filesystem */
    public final class C129501 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$18;
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

        public C129501(HtJ<? super C129501> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.directory(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {638}, m = "disconnect", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$disconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C129511 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C129511(HtJ<? super C129511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.disconnect(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {644}, m = "disconnectGroup", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$disconnectGroup$1, reason: invalid class name and case insensitive filesystem */
    public final class C129521 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129521(HtJ<? super C129521> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.disconnectGroup(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1902}, m = "dismissActivity", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$dismissActivity$1, reason: invalid class name and case insensitive filesystem */
    public final class C129531 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
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

        public C129531(HtJ<? super C129531> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.dismissActivity(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {238}, m = "earlierRequest", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$earlierRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C129541 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C129541(HtJ<? super C129541> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.earlierRequest(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1913, 490}, m = "editSharedGoal", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$editSharedGoal$1, reason: invalid class name and case insensitive filesystem */
    public final class C129551 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
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

        public C129551(HtJ<? super C129551> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.editSharedGoal(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1907}, m = "findConnectionId", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$findConnectionId$1, reason: invalid class name and case insensitive filesystem */
    public final class C129561 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
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

        public C129561(HtJ<? super C129561> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.findConnectionId(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1907}, m = "history", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$history$1, reason: invalid class name and case insensitive filesystem */
    public final class C129571 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
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

        public C129571(HtJ<? super C129571> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.history(null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsRepository$image$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ C27k<InterfaceC2178B0w> $started;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, C27k<? extends InterfaceC2178B0w> c27k) {
            super(1);
            this.$cacheKey = str;
            this.$started = c27k;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            PairsRepository.this.imageLoads.remove(this.$cacheKey, this.$started);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1109, 1111}, m = "imageBytes", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$imageBytes$1, reason: invalid class name and case insensitive filesystem */
    public final class C129581 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129581(HtJ<? super C129581> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.imageBytes(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {277}, m = "inboxFragment", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$inboxFragment$1, reason: invalid class name and case insensitive filesystem */
    public final class C129591 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129591(HtJ<? super C129591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.inboxFragment(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1904}, m = "inboxItems", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$inboxItems$1, reason: invalid class name and case insensitive filesystem */
    public final class C129601 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129601(HtJ<? super C129601> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.inboxItems(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {295}, m = "inboxRequests", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$inboxRequests$1, reason: invalid class name and case insensitive filesystem */
    public final class C129611 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129611(HtJ<? super C129611> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.inboxRequests(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {763}, m = "inviteInboxEnabled", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$inviteInboxEnabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C129621 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C129621(HtJ<? super C129621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.inviteInboxEnabled(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1138}, m = "invitePhotoBytes", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$invitePhotoBytes$1, reason: invalid class name and case insensitive filesystem */
    public final class C129631 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129631(HtJ<? super C129631> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.invitePhotoBytes(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1161}, m = "invites", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$invites$1, reason: invalid class name and case insensitive filesystem */
    public final class C129641 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129641(HtJ<? super C129641> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.invites(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "loadGuidance", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$loadGuidance$1, reason: invalid class name and case insensitive filesystem */
    public final class C129651 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
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

        public C129651(HtJ<? super C129651> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.loadGuidance(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {859, 863, 864, 869, 895}, m = "loadHub", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$loadHub$1, reason: invalid class name and case insensitive filesystem */
    public final class C129661 extends HzP {
        public long J$0;
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

        public C129661(HtJ<? super C129661> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.loadHub(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository$loadHub$3", f = "PairsRepository.kt", l = {898}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$loadHub$3, reason: invalid class name and case insensitive filesystem */
    public final class C129673 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsAccess $access;
        public final /* synthetic */ List<PairsContact> $contacts;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129673(List<PairsContact> list, PairsAccess pairsAccess, HtJ<? super C129673> htJ) {
            super(2, htJ);
            this.$contacts = list;
            this.$access = pairsAccess;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsRepository.this.new C129673(this.$contacts, this.$access, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PairsRepository pairsRepository = PairsRepository.this;
                List<PairsContact> list = this.$contacts;
                PairsAccess pairsAccess = this.$access;
                this.label = 1;
                if (pairsRepository.applyPendingLevels(list, pairsAccess, this) == enumC10460Hji) {
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
            return ((C129673) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "openInChat", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$openInChat$1, reason: invalid class name and case insensitive filesystem */
    public final class C129681 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
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

        public C129681(HtJ<? super C129681> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.openInChat(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1902}, m = "postDisconnect", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$postDisconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C129691 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
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

        public C129691(HtJ<? super C129691> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.postDisconnect(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1907}, m = "readAllPages", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$readAllPages$1, reason: invalid class name and case insensitive filesystem */
    public final class C129701 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$18;
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

        public C129701(HtJ<? super C129701> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.readAllPages(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {555}, m = "readConnectionDetail", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$readConnectionDetail$1, reason: invalid class name and case insensitive filesystem */
    public final class C129711 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129711(HtJ<? super C129711> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.readConnectionDetail(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1904}, m = "readSafetyCode", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$readSafetyCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C129721 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
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

        public C129721(HtJ<? super C129721> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.readSafetyCode(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {907, 910, 911}, m = "readSafetyCodeWhenReady", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$readSafetyCodeWhenReady$1, reason: invalid class name and case insensitive filesystem */
    public final class C129731 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C129731(HtJ<? super C129731> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.readSafetyCodeWhenReady(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1904}, m = "receivedItem", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$receivedItem$1, reason: invalid class name and case insensitive filesystem */
    public final class C129741 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129741(HtJ<? super C129741> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.receivedItem(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1913}, m = "recordDelivery", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$recordDelivery$1, reason: invalid class name and case insensitive filesystem */
    public final class C129751 extends HzP {
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
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C129751(HtJ<? super C129751> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.recordDelivery(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1895}, m = "removeContact", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$removeContact$1, reason: invalid class name and case insensitive filesystem */
    public final class C129761 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
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

        public C129761(HtJ<? super C129761> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.removeContact(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1902}, m = "removeSharingRule", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$removeSharingRule$1, reason: invalid class name and case insensitive filesystem */
    public final class C129771 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
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

        public C129771(HtJ<? super C129771> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.removeSharingRule(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1929}, m = "saveCanonicalRule", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$saveCanonicalRule$1, reason: invalid class name and case insensitive filesystem */
    public final class C129781 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C129781(HtJ<? super C129781> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.saveCanonicalRule(null, null, 0L, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1904}, m = "savedMessageStatus", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$savedMessageStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C129791 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129791(HtJ<? super C129791> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.savedMessageStatus(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1885}, m = "searchSuggestions", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$searchSuggestions$1, reason: invalid class name and case insensitive filesystem */
    public final class C129801 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C129801(HtJ<? super C129801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.searchSuggestions(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "share", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$share$1, reason: invalid class name and case insensitive filesystem */
    public final class C129811 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
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

        public C129811(HtJ<? super C129811> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.share(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1907}, m = "shareTargetsPage", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$shareTargetsPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C129821 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
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

        public C129821(HtJ<? super C129821> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.shareTargetsPage(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1889}, m = "sharedGoal", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$sharedGoal$1, reason: invalid class name and case insensitive filesystem */
    public final class C129831 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
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

        public C129831(HtJ<? super C129831> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.sharedGoal(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {575, MC.xe_growth_hatch_abra_config.__CONFIG__, 601}, m = "sharedLinkTargets", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$sharedLinkTargets$1, reason: invalid class name and case insensitive filesystem */
    public final class C129841 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C129841(HtJ<? super C129841> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.sharedLinkTargets(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {526}, m = "sharedSpaceBySlug", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$sharedSpaceBySlug$1, reason: invalid class name and case insensitive filesystem */
    public final class C129851 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C129851(HtJ<? super C129851> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.sharedSpaceBySlug(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1904}, m = "sharedTarget", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$sharedTarget$1, reason: invalid class name and case insensitive filesystem */
    public final class C129861 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129861(HtJ<? super C129861> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.sharedTarget(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1904}, m = "spaceCollaborators", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$spaceCollaborators$1, reason: invalid class name and case insensitive filesystem */
    public final class C129871 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129871(HtJ<? super C129871> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.spaceCollaborators(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1882}, m = "suggestions", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$suggestions$1, reason: invalid class name and case insensitive filesystem */
    public final class C129881 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C129881(HtJ<? super C129881> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.suggestions(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1928}, m = "updateSpaceCollaborators", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$updateSpaceCollaborators$1, reason: invalid class name and case insensitive filesystem */
    public final class C129891 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C129891(HtJ<? super C129891> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.updateSpaceCollaborators(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository", f = "PairsRepository.kt", l = {1882}, m = "viewerProfile", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsRepository$viewerProfile$1, reason: invalid class name and case insensitive filesystem */
    public final class C129901 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C129901(HtJ<? super C129901> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsRepository.this.viewerProfile(this);
        }
    }

    public final void clearDroppedPendingLevel(String str) {
        C7384Etj.A0Y(str, 0);
        this.pendingLevels.clearDropped(str);
    }

    public final void clearPendingLevel(String str) {
        C7384Etj.A0Y(str, 0);
        this.pendingLevels.clear(str);
    }

    public final void finishGuidanceSave(PairsGuidanceSave pairsGuidanceSave) {
        C7384Etj.A0Y(pairsGuidanceSave, 0);
        synchronized (this.guidanceSaves) {
            if (this.guidanceSaves.get(pairsGuidanceSave.chatSessionId) == pairsGuidanceSave) {
                this.guidanceSaves.remove(pairsGuidanceSave.chatSessionId);
            }
        }
    }

    public final PairsHeldInvite heldInvite(String str) {
        PairsInvitePreview pairsInvitePreview;
        String str2;
        Long l;
        C7384Etj.A0Y(str, 0);
        String strStagedAcceptLink = stagedAcceptLink(str);
        if (strStagedAcceptLink == null || (pairsInvitePreview = PairsInvitePreview.Companion.parse(strStagedAcceptLink)) == null || !pairsInvitePreview.isSupportedVersion || (str2 = pairsInvitePreview.relationshipGenerationId) == null || (l = pairsInvitePreview.requestExpiresAtMs) == null) {
            return null;
        }
        return new PairsHeldInvite(str, pairsInvitePreview, str2, l.longValue());
    }

    public final List<PairsHeldInvite> heldInvites(List<PairsContact> list) {
        List<PairsHeldInvite> listA0X;
        C7384Etj.A0Y(list, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayListA0h = C3cG.A0h();
        for (PairsContact pairsContact : list) {
            PairsContactStatus pairsContactStatus = pairsContact.status;
            if (pairsContactStatus == PairsContactStatus.VERIFIED || pairsContactStatus == PairsContactStatus.IDENTITY_CHANGED) {
                arrayListA0h.add(pairsContact);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            PairsRelationship pairsRelationship = ((PairsContact) it.next()).relationship;
            String str = pairsRelationship != null ? pairsRelationship.generationId : null;
            if (str != null) {
                arrayListA0h2.add(str);
            }
        }
        Set setA0g = AbstractC0878AGe.A0g(arrayListA0h2);
        synchronized (this.linkLock) {
            scopeLinksToCurrentVm();
            AbstractC0882AGj.A0v(this.heldInvites, new PairsRepository$heldInvites$1$1(jCurrentTimeMillis, setA0g));
            listA0X = AbstractC0878AGe.A0X(this.heldInvites);
        }
        return listA0X;
    }

    public final void hold(PairsHeldInvite pairsHeldInvite) {
        C7384Etj.A0Y(pairsHeldInvite, 0);
        synchronized (this.linkLock) {
            scopeLinksToCurrentVm();
            PairsHeldInvite pairsHeldInvite2 = (PairsHeldInvite) AbstractC0878AGe.A0G(this.heldInvites);
            if (C7384Etj.areEqual(pairsHeldInvite2 != null ? pairsHeldInvite2.token : null, pairsHeldInvite.token)) {
                return;
            }
            AbstractC0882AGj.A0v(this.heldInvites, new PairsRepository$hold$1$1(pairsHeldInvite));
            this.heldInvites.add(0, pairsHeldInvite);
            invalidate();
        }
    }

    public final Object image(PairsImageRef pairsImageRef, int i, HtJ<? super InterfaceC2178B0w> htJ) {
        String pathSegment = pairsImageRef.kind.getPathSegment();
        String str = pairsImageRef.sha256;
        StringBuilder sbA0g = C3cG.A0g(pathSegment);
        sbA0g.append(":");
        sbA0g.append(str);
        String strA1O = C60P.A1O(":", sbA0g, i);
        InterfaceC2178B0w interfaceC2178B0w = this.imageCache.get(strA1O);
        if (interfaceC2178B0w != null) {
            return interfaceC2178B0w;
        }
        if (!pairsImageRef.isReadable) {
            return null;
        }
        C3UX c3ux = this.backgroundScope;
        C10550Hrx c10550HrxA01 = GAo.A01(C79.A01, C6ys.A00, new PairsRepository$image$started$1(this, pairsImageRef, i, strA1O, null), c3ux);
        C27k<InterfaceC2178B0w> c27kPutIfAbsent = this.imageLoads.putIfAbsent(strA1O, c10550HrxA01);
        if (c27kPutIfAbsent != null) {
            c10550HrxA01.A5w(null);
            return C3cG.A0W(c27kPutIfAbsent, htJ);
        }
        c10550HrxA01.AO5(new AnonymousClass3(strA1O, c10550HrxA01));
        return c10550HrxA01.A0E(htJ);
    }

    public final boolean isOwnLink(String str) {
        boolean zContains;
        C7384Etj.A0Y(str, 0);
        synchronized (this.linkLock) {
            zContains = this.linkFragments.values().contains(str);
        }
        return zContains;
    }

    public final boolean isStagedLink(String str) {
        boolean zContainsKey;
        C7384Etj.A0Y(str, 0);
        synchronized (this.linkLock) {
            scopeLinksToCurrentVm();
            zContainsKey = this.stagedAcceptLinks.containsKey(str);
        }
        return zContainsKey;
    }

    public final void markAcceptedRequest(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.acceptedRequests) {
            this.acceptedRequests.add(str);
        }
    }

    public final PairsGuidanceSave pendingGuidanceSave(String str) {
        PairsGuidanceSave pairsGuidanceSave;
        C7384Etj.A0Y(str, 0);
        synchronized (this.guidanceSaves) {
            pairsGuidanceSave = this.guidanceSaves.get(str);
        }
        return pairsGuidanceSave;
    }

    public final void removeHeldInvite(PairsHeldInvite pairsHeldInvite) {
        boolean zA0v;
        C7384Etj.A0Y(pairsHeldInvite, 0);
        synchronized (this.linkLock) {
            zA0v = AbstractC0882AGj.A0v(this.heldInvites, new PairsRepository$removeHeldInvite$removed$1$1(pairsHeldInvite));
        }
        if (zA0v) {
            invalidate();
        }
    }

    public final PairsGuidanceSave saveGuidance(String str, PairsDiscretionDocument pairsDiscretionDocument, String str2) {
        AnonymousClass005.A0x(str, pairsDiscretionDocument, str2);
        PairsGuidanceSave pairsGuidanceSave = new PairsGuidanceSave(str2, str, AnonymousClass001.A10(new PairsRepository$saveGuidance$result$1(str, pairsDiscretionDocument, str2, this, null), this.backgroundScope));
        synchronized (this.guidanceSaves) {
            this.guidanceSaves.put(str, pairsGuidanceSave);
        }
        return pairsGuidanceSave;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String stagedAcceptLink(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            java.lang.Object r3 = r4.linkLock
            monitor-enter(r3)
            r4.scopeLinksToCurrentVm()     // Catch: java.lang.Throwable -> L21
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r4.stagedAcceptLinks     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r0.get(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r2 == 0) goto L1e
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            r2 = r1
        L1f:
            monitor-exit(r3)
            return r2
        L21:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.stagedAcceptLink(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object suggestions(com.facebook.aura.pairs.PairsRecipientPurpose r12, X.HtJ<? super java.util.List<com.facebook.aura.pairs.PairsSuggestion>> r13) {
        /*
            r11 = this;
            r3 = r13
            boolean r0 = r13 instanceof com.facebook.aura.pairs.PairsRepository.C129881
            if (r0 == 0) goto L7e
            r13 = r3
            com.facebook.aura.pairs.PairsRepository$suggestions$1 r13 = (com.facebook.aura.pairs.PairsRepository.C129881) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r13.label = r2
        L13:
            java.lang.Object r2 = r13.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r13.label
            r0 = 1
            if (r1 == 0) goto L54
            if (r1 != r0) goto Lb4
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L22:
            java.lang.Throwable r1 = X.HsJ.A00(r2)
            if (r1 != 0) goto Lab
            com.facebook.aura.pairs.TrustedCircleResponseJson r2 = (com.facebook.aura.pairs.TrustedCircleResponseJson) r2
            java.util.List<com.facebook.aura.pairs.TrustedCircleSourceJson> r0 = r2.recipients
            int r1 = r0.size()
            r0 = 60
            if (r1 > r0) goto La6
            java.util.List<com.facebook.aura.pairs.TrustedCircleSourceJson> r0 = r2.recipients
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r1 = r0.iterator()
        L3e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r1.next()
            com.facebook.aura.pairs.TrustedCircleSourceJson r0 = (com.facebook.aura.pairs.TrustedCircleSourceJson) r0
            com.facebook.aura.pairs.TrustedCircleSource r0 = com.facebook.aura.pairs.PairsRepositoryKt.toSource(r0)
            if (r0 == 0) goto L3e
            r2.add(r0)
            goto L3e
        L54:
            com.facebook.aura.network.http.HatchHttpApi r4 = X.C60O.A06(r2)
            com.facebook.aura.pairs.TrustedCirclePath r7 = new com.facebook.aura.pairs.TrustedCirclePath
            r7.<init>(r12)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r11 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$suggestions$$inlined$executeStefiRequest-bMdYcbs$default$1 r5 = com.facebook.aura.pairs.PairsRepository$suggestions$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r6 = 0
            r9 = 0
            r13.L$0 = r9
            r13.L$1 = r9
            r13.L$2 = r9
            r13.L$3 = r9
            r13.L$4 = r9
            r13.L$5 = r9
            r13.label = r0
            r10 = r9
            r12 = r11
            java.lang.Object r2 = r4.m1596executeBodylessStefiRequestWithtZkwj4A(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r2 != r3) goto L22
            return r3
        L7e:
            com.facebook.aura.pairs.PairsRepository$suggestions$1 r13 = new com.facebook.aura.pairs.PairsRepository$suggestions$1
            r13.<init>(r3)
            goto L13
        L84:
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r2.iterator()
        L8c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.pairs.TrustedCircleSource r0 = (com.facebook.aura.pairs.TrustedCircleSource) r0
            boolean r0 = r0.isPerson
            if (r0 == 0) goto L8c
            r3.add(r1)
            goto L8c
        La1:
            java.util.List r3 = com.facebook.aura.pairs.PairsRepositoryKt.groupedPeople(r3)
            return r3
        La6:
            com.facebook.aura.pairs.PairsException r1 = X.C60R.A0T()
            throw r1
        Lab:
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lb3
            com.facebook.aura.pairs.PairsException r1 = X.C60R.A0T()
        Lb3:
            throw r1
        Lb4:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.suggestions(com.facebook.aura.pairs.PairsRecipientPurpose, X.HtJ):java.lang.Object");
    }

    private final void confirmPairings(PairsHubSnapshot pairsHubSnapshot) {
        boolean zAdd;
        Iterator<String> it = PairsPairingRules.INSTANCE.generationsToConfirm(pairsHubSnapshot).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            synchronized (this.receiverConfirmations) {
                zAdd = this.receiverConfirmations.add(strA0j);
            }
            if (zAdd) {
                AnonymousClass001.A1J(new C129341(strA0j, null), this.backgroundScope);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectionDetail(java.lang.String r7, X.HtJ<? super com.facebook.aura.pairs.ConnectionDetailJson> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsRepository.C129371
            if (r0 == 0) goto L23
            r5 = r8
            com.facebook.aura.pairs.PairsRepository$connectionDetail$1 r5 = (com.facebook.aura.pairs.PairsRepository.C129371) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
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
            if (r2 != r1) goto L68
            java.lang.Object r7 = r5.L$0
            goto L29
        L23:
            com.facebook.aura.pairs.PairsRepository$connectionDetail$1 r5 = new com.facebook.aura.pairs.PairsRepository$connectionDetail$1
            r5.<init>(r8)
            goto L12
        L29:
            X.Hwg.A00(r4)     // Catch: com.facebook.aura.pairs.PairsException -> L54
            return r4
        L2d:
            X.Hwg.A00(r4)
            r5.L$0 = r7
            r5.label = r0
            java.lang.Object r4 = r6.connectionIdFor(r7, r5)
            if (r4 != r3) goto L40
            return r3
        L3b:
            java.lang.Object r7 = r5.L$0
            X.Hwg.A00(r4)
        L40:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L46
            r4 = 0
        L45:
            return r4
        L46:
            r5.L$0 = r7     // Catch: com.facebook.aura.pairs.PairsException -> L54
            r0 = 0
            r5.L$1 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L54
            r5.label = r1     // Catch: com.facebook.aura.pairs.PairsException -> L54
            java.lang.Object r4 = r6.readConnectionDetail(r4, r5)     // Catch: com.facebook.aura.pairs.PairsException -> L54
            if (r4 != r3) goto L45
            return r3
        L54:
            r2 = move-exception
            com.facebook.aura.pairs.PairsError r1 = r2.error
            com.facebook.aura.pairs.PairsError r0 = com.facebook.aura.pairs.PairsError.NOT_FOUND
            if (r1 != r0) goto L6c
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r6.connectionIds
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r6.connectionIds     // Catch: java.lang.Throwable -> L65
            r0.remove(r7)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r1)
            throw r2
        L65:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L68:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
        L6c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.connectionDetail(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectionIdFor(java.lang.String r7, X.HtJ<? super java.lang.String> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsRepository.C129381
            if (r0 == 0) goto L45
            r5 = r8
            com.facebook.aura.pairs.PairsRepository$connectionIdFor$1 r5 = (com.facebook.aura.pairs.PairsRepository.C129381) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L54
            java.lang.Object r7 = r5.L$0
            X.Hwg.A00(r4)
        L22:
            if (r4 == 0) goto L52
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r6.connectionIds
            monitor-enter(r1)
            goto L4b
        L28:
            X.Hwg.A00(r4)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r6.connectionIds
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r6.connectionIds     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L59
            monitor-exit(r1)
            if (r0 == 0) goto L3a
            return r0
        L3a:
            r5.L$0 = r7
            r5.label = r2
            java.lang.Object r4 = r6.findConnectionId(r7, r5)
            if (r4 != r3) goto L22
            return r3
        L45:
            com.facebook.aura.pairs.PairsRepository$connectionIdFor$1 r5 = new com.facebook.aura.pairs.PairsRepository$connectionIdFor$1
            r5.<init>(r8)
            goto L12
        L4b:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r6.connectionIds     // Catch: java.lang.Throwable -> L59
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r1)
            return r4
        L52:
            r4 = 0
            return r4
        L54:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L59:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.connectionIdFor(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectionResourcesFor(java.lang.String r19, java.lang.String r20, X.HtJ<? super com.facebook.aura.pairs.ConnectionsResourcePage> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.connectionResourcesFor(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0143 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findConnectionId(java.lang.String r26, X.HtJ<? super java.lang.String> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.findConnectionId(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object imageBytes(com.facebook.aura.pairs.PairsImageRef r14, X.HtJ<? super byte[]> r15) throws java.io.IOException {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.facebook.aura.pairs.PairsRepository.C129581
            if (r0 == 0) goto L86
            r12 = r15
            com.facebook.aura.pairs.PairsRepository$imageBytes$1 r12 = (com.facebook.aura.pairs.PairsRepository.C129581) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r0 = X.EnumC10460Hji.A02
            int r2 = r12.label
            r1 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto Lc1
            if (r2 != r1) goto Lbc
            java.lang.Object r14 = r12.L$0
            com.facebook.aura.pairs.PairsImageRef r14 = (com.facebook.aura.pairs.PairsImageRef) r14
            X.Hwg.A00(r3)
        L27:
            com.facebook.aura.network.http.HatchHttpStreamRequestResult r3 = (com.facebook.aura.network.http.HatchHttpStreamRequestResult) r3
            boolean r0 = r3 instanceof com.facebook.aura.network.http.HatchHttpStreamRequestSuccess
            r6 = 0
            if (r0 == 0) goto L37
            com.facebook.aura.network.http.HatchHttpStreamRequestSuccess r3 = (com.facebook.aura.network.http.HatchHttpStreamRequestSuccess) r3
        L30:
            if (r3 == 0) goto Lbb
            com.facebook.aura.network.transport.HatchHttpResponseStream r5 = r3.response
            if (r5 == 0) goto Lbb
            goto L8c
        L37:
            r3 = r6
            goto L30
        L39:
            X.Hwg.A00(r3)
            com.facebook.aura.pairs.PairsImageKind r3 = r14.kind
            com.facebook.aura.pairs.PairsImageKind r2 = com.facebook.aura.pairs.PairsImageKind.INVITE_PHOTO
            if (r3 != r2) goto L4e
            r1 = 0
            r12.L$0 = r1
            r12.label = r4
            java.lang.Object r1 = r13.invitePhotoBytes(r14, r12)
            if (r1 == r0) goto Lc9
            return r1
        L4e:
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r2 = r14.museId
            java.lang.String r6 = android.net.Uri.encode(r2)
            com.facebook.aura.pairs.PairsImageKind r2 = r14.kind
            java.lang.String r8 = r2.getPathSegment()
            java.lang.String r10 = r14.sha256
            java.lang.String r5 = "api/peers/"
            java.lang.String r7 = "/"
            r9 = r7
            java.lang.String r2 = X.FGI.A0j(r5, r6, r7, r8, r9, r10)
            com.facebook.aura.pairs.PeersPath r5 = new com.facebook.aura.pairs.PeersPath
            r5.<init>(r2)
            com.facebook.aura.network.http.RequestType r6 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r7 = r13.userSession
            r2 = 20
            java.lang.Long r8 = X.C3cG.A0S(r2)
            r2 = 0
            X.HxE[] r11 = new X.HxE[r2]
            r12.L$0 = r14
            r12.label = r1
            r9 = 0
            r10 = r9
            java.lang.Object r3 = r4.openJarvisHttpResponseStreamDetailedInternal(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r0) goto L27
            return r0
        L86:
            com.facebook.aura.pairs.PairsRepository$imageBytes$1 r12 = new com.facebook.aura.pairs.PairsRepository$imageBytes$1
            r12.<init>(r15)
            goto L12
        L8c:
            int r1 = r5.statusCode     // Catch: java.lang.Throwable -> Lb4
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto Lc5
            java.io.InputStream r4 = r5.body     // Catch: java.lang.Throwable -> Lb4
            if (r4 == 0) goto Lc5
            com.facebook.aura.pairs.PairsImageKind r0 = r14.kind     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lc5
            int r0 = r0.getMaxBytes()     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lc5
            long r2 = (long) r0     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lc5
            r0 = -1
            java.io.InputStream r0 = com.facebook.aura.network.api.HttpResponseBytesKt.withByteLimit(r4, r2, r0)     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lc5
            byte[] r0 = X.F0H.A01(r0)     // Catch: java.lang.Throwable -> Lb4 java.io.IOException -> Lc5
            java.lang.String r2 = com.facebook.aura.pairs.PairsRepositoryKt.sha256Hex(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r14.sha256     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = X.C7384Etj.areEqual(r2, r1)     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto Lc5
            goto Lc6
        Lb4:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r5, r1)
            throw r0
        Lbb:
            return r6
        Lbc:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lc1:
            X.Hwg.A00(r3)
            return r3
        Lc5:
            r0 = r6
        Lc6:
            r5.close()
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.imageBytes(com.facebook.aura.pairs.PairsImageRef, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.AbstractCollection, java.util.ArrayList, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object inboxItems(X.HtJ<? super java.util.List<com.facebook.aura.pairs.PeerInboxItemJson>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.inboxItems(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object inboxRequests(com.facebook.aura.pairs.PairsAccess r6, long r7, X.HtJ<? super java.util.List<com.facebook.aura.pairs.PairsInboxRequest>> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.pairs.PairsRepository.C129611
            if (r0 == 0) goto L20
            r4 = r9
            com.facebook.aura.pairs.PairsRepository$inboxRequests$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129611) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L26
            long r7 = r4.J$0
            goto L44
        L20:
            com.facebook.aura.pairs.PairsRepository$inboxRequests$1 r4 = new com.facebook.aura.pairs.PairsRepository$inboxRequests$1
            r4.<init>(r9)
            goto L12
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.Hwg.A00(r3)
            boolean r0 = r6.canAcceptInvites
            if (r0 == 0) goto L76
            boolean r0 = r6.hasInviteInbox
            if (r0 == 0) goto L76
            r0 = 0
            r4.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L67
            r4.J$0 = r7     // Catch: com.facebook.aura.pairs.PairsException -> L67
            r4.label = r1     // Catch: com.facebook.aura.pairs.PairsException -> L67
            java.lang.Object r3 = r5.inboxItems(r4)     // Catch: com.facebook.aura.pairs.PairsException -> L67
            if (r3 != r2) goto L47
            return r2
        L44:
            X.Hwg.A00(r3)     // Catch: com.facebook.aura.pairs.PairsException -> L67
        L47:
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: com.facebook.aura.pairs.PairsException -> L67
            java.util.ArrayList r2 = X.C3cG.A0h()     // Catch: com.facebook.aura.pairs.PairsException -> L67
            java.util.Iterator r1 = r3.iterator()     // Catch: com.facebook.aura.pairs.PairsException -> L67
        L51:
            boolean r0 = r1.hasNext()     // Catch: com.facebook.aura.pairs.PairsException -> L67
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.next()     // Catch: com.facebook.aura.pairs.PairsException -> L67
            com.facebook.aura.pairs.PeerInboxItemJson r0 = (com.facebook.aura.pairs.PeerInboxItemJson) r0     // Catch: com.facebook.aura.pairs.PairsException -> L67
            com.facebook.aura.pairs.PairsInboxRequest r0 = com.facebook.aura.pairs.PairsRepositoryKt.toInboxRequest(r0, r7)     // Catch: com.facebook.aura.pairs.PairsException -> L67
            if (r0 == 0) goto L51
            r2.add(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L67
            goto L51
        L67:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "PairsRepository"
            java.lang.String r0 = "inbox read failed: %s"
            X.CFK.A0H(r1, r0, r2)
            X.AGi r0 = X.C0881AGi.A00
            return r0
        L76:
            X.AGi r2 = X.C0881AGi.A00
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.inboxRequests(com.facebook.aura.pairs.PairsAccess, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invitePhotoBytes(com.facebook.aura.pairs.PairsImageRef r23, X.HtJ<? super byte[]> r24) throws java.io.IOException {
        /*
            r22 = this;
            r5 = r24
            r2 = r23
            boolean r0 = r5 instanceof com.facebook.aura.pairs.PairsRepository.C129631
            if (r0 == 0) goto L80
            r4 = r5
            com.facebook.aura.pairs.PairsRepository$invitePhotoBytes$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129631) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L80
            int r3 = r3 - r1
            r4.label = r3
        L16:
            java.lang.Object r6 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L32
            if (r0 != r5) goto Lbb
            java.lang.Object r2 = r4.L$0
            com.facebook.aura.pairs.PairsImageRef r2 = (com.facebook.aura.pairs.PairsImageRef) r2
            X.Hwg.A00(r6)
        L28:
            com.facebook.aura.network.transport.HatchHttpResponse r6 = (com.facebook.aura.network.transport.HatchHttpResponse) r6
            int r1 = r6.statusCode
            r0 = 200(0xc8, float:2.8E-43)
            r3 = 0
            if (r1 != r0) goto Lba
            goto L88
        L32:
            X.Hwg.A00(r6)
            com.facebook.aura.network.transport.HatchHttpClient r6 = X.C60O.A07()
            java.lang.String r1 = r2.sha256
            java.lang.String r0 = "https://muse.ai/api/hatch/peer-invite-photos/"
            java.lang.String r8 = X.FGI.A0M(r0, r1)
            com.facebook.aura.network.transport.HatchHttpMethod r9 = com.facebook.aura.network.transport.HatchHttpMethod.GET
            r0 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Long r12 = X.C3cG.A0S(r0)
            com.facebook.aura.network.transport.HatchResponseBodyPolicy$Companion r7 = com.facebook.aura.network.transport.HatchResponseBodyPolicy.Companion
            com.facebook.aura.pairs.PairsImageKind r0 = r2.kind
            int r0 = r0.getMaxBytes()
            long r0 = (long) r0
            com.facebook.aura.network.transport.HatchResponseBodyPolicy r21 = r7.inMemoryUpTo(r0)
            r17 = 0
            X.9jH r10 = X.AGH.A0E()
            com.facebook.aura.network.transport.HatchRequestBody$Empty r11 = com.facebook.aura.network.transport.HatchRequestBody.Empty.INSTANCE
            com.facebook.aura.network.transport.HatchRequestCategory r15 = com.facebook.aura.network.transport.HatchRequestCategory.API
            com.facebook.aura.network.transport.HatchRequestPurpose r16 = com.facebook.aura.network.transport.HatchRequestPurpose.FETCH
            r18 = 0
            com.facebook.aura.network.transport.HatchHttpRequest r7 = new com.facebook.aura.network.transport.HatchHttpRequest
            r13 = r12
            r14 = r12
            r19 = r18
            r20 = r5
            r22 = r17
            r23 = r18
            r24 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.L$0 = r2
            r4.label = r5
            java.lang.Object r6 = r6.execute(r7, r4)
            if (r6 != r3) goto L28
            return r3
        L80:
            com.facebook.aura.pairs.PairsRepository$invitePhotoBytes$1 r4 = new com.facebook.aura.pairs.PairsRepository$invitePhotoBytes$1
            r0 = r22
            r4.<init>(r5)
            goto L16
        L88:
            java.io.InputStream r6 = r6.boundedBodyStream()     // Catch: java.io.IOException -> Laa
            if (r6 == 0) goto Laa
            com.facebook.aura.pairs.PairsImageKind r0 = r2.kind     // Catch: java.lang.Throwable -> La3
            int r0 = r0.getMaxBytes()     // Catch: java.lang.Throwable -> La3
            long r4 = (long) r0     // Catch: java.lang.Throwable -> La3
            r0 = -1
            java.io.InputStream r0 = com.facebook.aura.network.api.HttpResponseBytesKt.withByteLimit(r6, r4, r0)     // Catch: java.lang.Throwable -> La3
            byte[] r4 = X.F0H.A01(r0)     // Catch: java.lang.Throwable -> La3
            r6.close()     // Catch: java.io.IOException -> Laa
            goto Lab
        La3:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r6, r1)     // Catch: java.io.IOException -> Laa
            throw r0     // Catch: java.io.IOException -> Laa
        Laa:
            r4 = r3
        Lab:
            if (r4 == 0) goto Lba
            java.lang.String r1 = com.facebook.aura.pairs.PairsRepositoryKt.sha256Hex(r4)
            java.lang.String r0 = r2.sha256
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto Lba
            return r4
        Lba:
            return r3
        Lbb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.invitePhotoBytes(com.facebook.aura.pairs.PairsImageRef, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invites(X.HtJ<? super java.util.List<com.facebook.aura.pairs.PeerInviteJson>> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsRepository.C129641
            if (r0 == 0) goto L63
            r4 = r7
            com.facebook.aura.pairs.PairsRepository$invites$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129641) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r5 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L4d
            if (r0 != r2) goto L7d
            X.Hwg.A00(r5)
        L20:
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r4 = r5.iterator()
        L2a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L69
            kotlinx.serialization.json.JsonElement r2 = X.C60Q.A11(r4)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L3d
            com.facebook.aura.pairs.PeerInviteJson$$serializer r0 = com.facebook.aura.pairs.PeerInviteJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.A01(r0, r2)     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L42:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L47
            r1 = 0
        L47:
            if (r1 == 0) goto L2a
            r3.add(r1)
            goto L2a
        L4d:
            X.Hwg.A00(r5)
            java.lang.String r0 = "api/peers/invites"
            com.facebook.aura.pairs.PeersPath r1 = new com.facebook.aura.pairs.PeersPath
            r1.<init>(r0)
            r0 = 0
            r4.L$0 = r0
            r4.label = r2
            java.lang.Object r5 = r6.readAllPages(r1, r4)
            if (r5 != r3) goto L20
            return r3
        L63:
            com.facebook.aura.pairs.PairsRepository$invites$1 r4 = new com.facebook.aura.pairs.PairsRepository$invites$1
            r4.<init>(r7)
            goto L12
        L69:
            int r1 = r3.size()
            int r0 = r5.size()
            if (r1 >= r0) goto L7c
            java.lang.Integer r1 = X.C60R.A0W(r5, r3)
            java.lang.String r0 = "invite"
            X.C60R.A1H(r1, r0)
        L7c:
            return r3
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.invites(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postDisconnect(java.lang.String r19, X.HtJ<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            r18 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.pairs.PairsRepository.C129691
            r4 = r18
            if (r0 == 0) goto L96
            r3 = r5
            com.facebook.aura.pairs.PairsRepository$postDisconnect$1 r3 = (com.facebook.aura.pairs.PairsRepository.C129691) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto Lbd
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L25:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lb8
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            boolean r0 = X.C60P.A1Z(r1)
            if (r0 == 0) goto L39
            kotlinx.serialization.json.JsonElement r2 = X.C60Q.A12(r1)
            if (r2 != 0) goto L9d
        L39:
            r2 = r1
            goto L9d
        L3b:
            X.Hwg.A00(r5)
            java.lang.String r6 = android.net.Uri.encode(r19)
            java.lang.String r5 = "api/peers/connections/"
            java.lang.String r0 = "/disconnect"
            com.facebook.aura.pairs.PeersPath r8 = X.C60Q.A0M(r5, r6, r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            r7 = 0
            X.HxE[] r0 = new X.HxE[r7]
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            X.CGz r10 = r4.userSession
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r0, r7)
            X.HxE[] r12 = (X.HxE[]) r12
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r3.L$0 = r11
            r3.L$1 = r4
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r11
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.L$8 = r11
            r3.L$9 = r11
            r3.L$10 = r11
            r3.L$11 = r11
            r3.I$0 = r7
            r3.I$1 = r1
            r3.I$2 = r7
            r3.label = r1
            r0 = r2
            r13 = r11
            r15 = r7
            r18 = r11
            r19 = r7
            r20 = r3
            r17 = r1
            java.lang.Object r1 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r1 != r2) goto L25
            return r0
        L96:
            com.facebook.aura.pairs.PairsRepository$postDisconnect$1 r3 = new com.facebook.aura.pairs.PairsRepository$postDisconnect$1
            r3.<init>(r5)
            goto L16
        L9d:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.IllegalArgumentException -> Lb3
            com.facebook.aura.pairs.ConnectionDisconnectedJson$$serializer r0 = com.facebook.aura.pairs.ConnectionDisconnectedJson$$serializer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> Lb3
            java.lang.Object r0 = r1.A01(r0, r2)     // Catch: java.lang.IllegalArgumentException -> Lb3
            com.facebook.aura.pairs.ConnectionDisconnectedJson r0 = (com.facebook.aura.pairs.ConnectionDisconnectedJson) r0
            boolean r0 = r0.disconnected
            if (r0 == 0) goto Lae
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lae:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lb3:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lb8:
            java.lang.Throwable r0 = X.C60Q.A0p(r0)
            throw r0
        Lbd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.postDisconnect(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final /* synthetic */ <T> Object read(JarvisPath jarvisPath, HxE<String, ? extends Object>[] hxEArr, HtJ<? super T> htJ) throws Throwable {
        RequestType requestType = RequestType.GET;
        Object obj = ((HsJ) HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE, false, jarvisPath, requestType, this.userSession, null, C60O.A1a(hxEArr), null, Collections.singleton(200), false, AGH.A0E(), true, null, false, htJ)).value;
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 != null) {
            throw PairsRepositoryKt.toPairsException(thA00, null);
        }
        C60R.A1G(obj);
        try {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            throw new PairsException(PairsError.FAILED, false, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00f3 -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAllPages(com.facebook.aura.network.api.JarvisPath r23, X.HtJ<? super java.util.List<? extends kotlinx.serialization.json.JsonElement>> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.readAllPages(com.facebook.aura.network.api.JarvisPath, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readConnectionDetail(java.lang.String r7, X.HtJ<? super com.facebook.aura.pairs.ConnectionDetailJson> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsRepository.C129711
            if (r0 == 0) goto L42
            r5 = r8
            com.facebook.aura.pairs.PairsRepository$readConnectionDetail$1 r5 = (com.facebook.aura.pairs.PairsRepository.C129711) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L48
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.aura.common.coroutines.SingleFlightResult.Result<com.facebook.aura.pairs.ConnectionDetailJson>"
            X.C7384Etj.A0Z(r1, r0)
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
            return r0
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.detailFlight
            r1 = 0
            com.facebook.aura.pairs.PairsRepository$readConnectionDetail$result$1 r0 = new com.facebook.aura.pairs.PairsRepository$readConnectionDetail$result$1
            r0.<init>(r6, r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = r2.invoke(r7, r0, r5)
            if (r1 != r4) goto L20
            return r4
        L42:
            com.facebook.aura.pairs.PairsRepository$readConnectionDetail$1 r5 = new com.facebook.aura.pairs.PairsRepository$readConnectionDetail$1
            r5.<init>(r8)
            goto L12
        L48:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.readConnectionDetail(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSafetyCode(java.lang.String r20, com.facebook.aura.pairs.PairsPairingCode r21, X.HtJ<? super com.facebook.aura.pairs.PairsCodeOutcome> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.readSafetyCode(java.lang.String, com.facebook.aura.pairs.PairsPairingCode, X.HtJ):java.lang.Object");
    }

    private final String recordLink(PeerInviteCreateResponseJson peerInviteCreateResponseJson) {
        this.mintedInvites.record(peerInviteCreateResponseJson.invite_id_b64, System.currentTimeMillis());
        if (!PairsRepositoryKt.isValidFragment(peerInviteCreateResponseJson.fragment)) {
            return null;
        }
        String str = peerInviteCreateResponseJson.owner_photo_jpeg_b64;
        Long l = peerInviteCreateResponseJson.expires_at_ms;
        if (str != null && l != null) {
            PairsInviteMailbox companion = PairsInviteMailbox.Companion.getInstance(this.userSession);
            long jLongValue = l.longValue();
            PairsInvitePreview pairsInvitePreview = PairsInvitePreview.Companion.parse(peerInviteCreateResponseJson.fragment);
            companion.uploadInvitePhoto(str, jLongValue, pairsInvitePreview != null ? pairsInvitePreview.photoSha256 : null);
        }
        synchronized (this.linkLock) {
            scopeLinksToCurrentVm();
            this.linkFragments.put(peerInviteCreateResponseJson.invite_id_b64, peerInviteCreateResponseJson.fragment);
        }
        return FGI.A0M("https://muse.ai/peer/accept#", peerInviteCreateResponseJson.fragment);
    }

    private final /* synthetic */ <T> Object request(JarvisPath jarvisPath, RequestType requestType, String str, HxE<String, ? extends Object>[] hxEArr, HtJ<? super T> htJ) throws Throwable {
        Object obj = ((HsJ) HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE, false, jarvisPath, requestType, this.userSession, null, C60O.A1a(hxEArr), null, Collections.singleton(200), false, AGH.A0E(), true, null, false, htJ)).value;
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 != null) {
            throw PairsRepositoryKt.toPairsException(thA00, str);
        }
        C60R.A1G(obj);
        try {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            throw new PairsException(PairsError.FAILED, false, null, null);
        }
    }

    public static /* synthetic */ Object request$default(PairsRepository pairsRepository, JarvisPath jarvisPath, RequestType requestType, String str, HxE[] hxEArr, HtJ htJ, int i, Object obj) throws Throwable {
        HxE[] hxEArr2 = hxEArr;
        if ((i & 8) != 0) {
            hxEArr2 = new HxE[0];
        }
        Object obj2 = ((HsJ) HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE, false, jarvisPath, requestType, pairsRepository.userSession, null, C60O.A1a(hxEArr2), null, Collections.singleton(200), false, AGH.A0E(), true, null, false, htJ)).value;
        Throwable thA00 = HsJ.A00(obj2);
        if (thA00 != null) {
            throw PairsRepositoryKt.toPairsException(thA00, str);
        }
        C60R.A1G(obj2);
        try {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            throw new PairsException(PairsError.FAILED, false, null, null);
        }
    }

    private final void scopeLinksToCurrentVm() {
        String strA0m = C60O.A0m(HatchGatewayPrefsStore.Companion, this.userSession);
        if (C7384Etj.areEqual(strA0m, this.linkGatewayUrl)) {
            return;
        }
        this.linkGatewayUrl = strA0m;
        this.linkFragments.clear();
        this.stagedAcceptLinks.clear();
        this.heldInvites.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sharedTarget(java.lang.String r20, X.HtJ<? super com.facebook.aura.pairs.ConnectionsSharedLinkTarget> r21) throws java.lang.Throwable {
        /*
            r19 = this;
            r6 = r21
            r2 = r20
            boolean r0 = r6 instanceof com.facebook.aura.pairs.PairsRepository.C129861
            r5 = r19
            if (r0 == 0) goto La3
            r4 = r6
            com.facebook.aura.pairs.PairsRepository$sharedTarget$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129861) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La3
            int r3 = r3 - r1
            r4.label = r3
        L18:
            java.lang.Object r6 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L41
            if (r0 != r1) goto Lc3
            java.lang.Object r2 = r4.L$0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = X.AnonymousClass001.A0q(r6)
        L2b:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lbe
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            boolean r0 = X.C60P.A1Z(r1)
            if (r0 == 0) goto L3f
            kotlinx.serialization.json.JsonElement r3 = X.C60Q.A12(r1)
            if (r3 != 0) goto Laa
        L3f:
            r3 = r1
            goto Laa
        L41:
            X.Hwg.A00(r6)
            java.lang.String r7 = android.net.Uri.encode(r2)
            java.lang.String r6 = "api/peers/shared/"
            java.lang.String r0 = "/target"
            com.facebook.aura.pairs.PeersPath r9 = X.C60Q.A0M(r6, r7, r0)
            r8 = 0
            X.HxE[] r0 = new X.HxE[r8]
            com.facebook.aura.network.http.RequestType r10 = com.facebook.aura.network.http.RequestType.GET
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            X.CGz r11 = r5.userSession
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r0, r8)
            X.HxE[] r13 = (X.HxE[]) r13
            java.util.Set r15 = X.AnonymousClass004.A18()
            X.9jH r17 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest-1iavgos$default$1 r7 = com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r4.L$0 = r2
            r12 = 0
            r4.L$1 = r12
            r4.L$2 = r12
            r4.L$3 = r12
            r4.L$4 = r5
            r4.L$5 = r12
            r4.L$6 = r12
            r4.L$7 = r12
            r4.L$8 = r12
            r4.L$9 = r12
            r4.L$10 = r12
            r4.L$11 = r12
            r4.L$12 = r12
            r4.L$13 = r12
            r4.L$14 = r12
            r4.I$0 = r8
            r4.I$1 = r1
            r4.I$2 = r8
            r4.label = r1
            r0 = r3
            r14 = r12
            r16 = r8
            r19 = r12
            r20 = r8
            r21 = r4
            r18 = r1
            java.lang.Object r1 = r6.m1595executeBodylessJarvisRequestWithp3iPjrY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r1 != r3) goto L2b
            return r0
        La3:
            com.facebook.aura.pairs.PairsRepository$sharedTarget$1 r4 = new com.facebook.aura.pairs.PairsRepository$sharedTarget$1
            r4.<init>(r6)
            goto L18
        Laa:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.IllegalArgumentException -> Lb9
            com.facebook.aura.pairs.SharedTargetJson$$serializer r0 = com.facebook.aura.pairs.SharedTargetJson$$serializer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> Lb9
            java.lang.Object r0 = r1.A01(r0, r3)     // Catch: java.lang.IllegalArgumentException -> Lb9
            com.facebook.aura.pairs.SharedTargetJson r0 = (com.facebook.aura.pairs.SharedTargetJson) r0
            com.facebook.aura.pairs.ConnectionsSharedLinkTarget r0 = com.facebook.aura.pairs.ConnectionsReceivedItemKt.toLinkTarget(r0, r2)
            return r0
        Lb9:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lbe:
            java.lang.Throwable r0 = X.C60Q.A0p(r0)
            throw r0
        Lc3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.sharedTarget(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final String storedLink(String str) {
        String str2;
        synchronized (this.linkLock) {
            scopeLinksToCurrentVm();
            str2 = this.linkFragments.get(str);
        }
        if (str2 != null) {
            return FGI.A0M("https://muse.ai/peer/accept#", str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acceptLink(com.facebook.aura.pairs.PairsHeldInvite r29, X.HtJ<? super java.lang.String> r30) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.acceptLink(com.facebook.aura.pairs.PairsHeldInvite, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104 A[PHI: r10
  0x0104: PHI (r10v8 boolean) = (r10v1 boolean), (r10v9 boolean) binds: [B:52:0x0102, B:50:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115 A[PHI: r10
  0x0115: PHI (r10v2 boolean) = (r10v1 boolean), (r10v8 boolean), (r10v8 boolean) binds: [B:52:0x0102, B:54:0x0108, B:56:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118 A[PHI: r10 r11
  0x0118: PHI (r10v7 boolean) = (r10v2 boolean), (r10v8 boolean) binds: [B:58:0x0116, B:56:0x0113] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r11v6 boolean) = (r11v1 boolean), (r11v7 boolean) binds: [B:58:0x0116, B:56:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133 A[PHI: r10 r11
  0x0133: PHI (r10v3 boolean) = (r10v2 boolean), (r10v7 boolean), (r10v7 boolean), (r10v7 boolean) binds: [B:58:0x0116, B:60:0x011c, B:62:0x0126, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r11v2 boolean) = (r11v1 boolean), (r11v6 boolean), (r11v6 boolean), (r11v6 boolean) binds: [B:58:0x0116, B:60:0x011c, B:62:0x0126, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136 A[PHI: r10 r11 r12
  0x0136: PHI (r10v6 boolean) = (r10v3 boolean), (r10v7 boolean) binds: [B:66:0x0134, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r11v5 boolean) = (r11v2 boolean), (r11v6 boolean) binds: [B:66:0x0134, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r12v5 boolean) = (r12v2 boolean), (r12v6 boolean) binds: [B:66:0x0134, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147 A[PHI: r10 r11 r12
  0x0147: PHI (r10v4 boolean) = (r10v3 boolean), (r10v6 boolean), (r10v6 boolean) binds: [B:66:0x0134, B:68:0x013a, B:70:0x0145] A[DONT_GENERATE, DONT_INLINE]
  0x0147: PHI (r11v3 boolean) = (r11v2 boolean), (r11v5 boolean), (r11v5 boolean) binds: [B:66:0x0134, B:68:0x013a, B:70:0x0145] A[DONT_GENERATE, DONT_INLINE]
  0x0147: PHI (r12v3 boolean) = (r12v2 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:66:0x0134, B:68:0x013a, B:70:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object access(X.HtJ<? super com.facebook.aura.pairs.PairsAccess> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.access(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object activityFeed(X.HtJ<? super java.util.List<com.facebook.aura.pairs.PeerActivityJson>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsRepository.C129261
            if (r0 == 0) goto L34
            r5 = r7
            com.facebook.aura.pairs.PairsRepository$activityFeed$1 r5 = (com.facebook.aura.pairs.PairsRepository.C129261) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r1 = 0
            r0 = 1
            if (r2 == 0) goto L28
            if (r2 != r0) goto L3a
            X.Hwg.A00(r4)
        L21:
            com.facebook.aura.pairs.ConnectionsActivityPage r4 = (com.facebook.aura.pairs.ConnectionsActivityPage) r4
            if (r4 == 0) goto L27
            java.util.List<com.facebook.aura.pairs.PeerActivityJson> r1 = r4.items
        L27:
            return r1
        L28:
            X.Hwg.A00(r4)
            r5.label = r0
            java.lang.Object r4 = r6.activityPage(r1, r5)
            if (r4 != r3) goto L21
            return r3
        L34:
            com.facebook.aura.pairs.PairsRepository$activityFeed$1 r5 = new com.facebook.aura.pairs.PairsRepository$activityFeed$1
            r5.<init>(r7)
            goto L12
        L3a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.activityFeed(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object activityPage(java.lang.String r21, X.HtJ<? super com.facebook.aura.pairs.ConnectionsActivityPage> r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.activityPage(java.lang.String, X.HtJ):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0076
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0071 -> B:22:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyPendingLevels(java.util.List<com.facebook.aura.pairs.PairsContact> r11, com.facebook.aura.pairs.PairsAccess r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.facebook.aura.pairs.PairsRepository.C129281
            if (r0 == 0) goto L28
            r4 = r13
            com.facebook.aura.pairs.PairsRepository$applyPendingLevels$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129281) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L32
            int r7 = r4.I$0
            java.lang.Object r6 = r4.L$4
            com.facebook.aura.pairs.PairsPendingLevelStore$Due r6 = (com.facebook.aura.pairs.PairsPendingLevelStore.Due) r6
            java.lang.Object r8 = r4.L$3
            java.util.Iterator r8 = (java.util.Iterator) r8
            goto L2e
        L28:
            com.facebook.aura.pairs.PairsRepository$applyPendingLevels$1 r4 = new com.facebook.aura.pairs.PairsRepository$applyPendingLevels$1
            r4.<init>(r13)
            goto L12
        L2e:
            X.Hwg.A00(r1)     // Catch: com.facebook.aura.pairs.PairsException -> L76
            goto L74
        L32:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L37:
            X.Hwg.A00(r1)
            com.facebook.aura.pairs.PairsPendingLevelStore r2 = r10.pendingLevels
            long r0 = java.lang.System.currentTimeMillis()
            com.facebook.aura.pairs.PairsPendingLevelStore$TakeResult r0 = r2.takeDue(r11, r12, r0)
            boolean r7 = r0.didDrop
            java.util.List<com.facebook.aura.pairs.PairsPendingLevelStore$Due> r0 = r0.due
            java.util.Iterator r8 = r0.iterator()
        L4c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r6 = r8.next()
            com.facebook.aura.pairs.PairsPendingLevelStore$Due r6 = (com.facebook.aura.pairs.PairsPendingLevelStore.Due) r6
            com.facebook.aura.pairs.PairsContact r0 = r6.contact     // Catch: com.facebook.aura.pairs.PairsException -> L76
            java.lang.String r2 = r0.museId     // Catch: com.facebook.aura.pairs.PairsException -> L76
            com.facebook.aura.pairs.PairsLevel r1 = r6.level     // Catch: com.facebook.aura.pairs.PairsException -> L76
            r0 = 0
            r4.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L76
            r4.L$1 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L76
            r4.L$2 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L76
            r4.L$3 = r8     // Catch: com.facebook.aura.pairs.PairsException -> L76
            r4.L$4 = r6     // Catch: com.facebook.aura.pairs.PairsException -> L76
            r4.I$0 = r7     // Catch: com.facebook.aura.pairs.PairsException -> L76
            r4.label = r3     // Catch: com.facebook.aura.pairs.PairsException -> L76
            java.lang.Object r0 = r10.changeLevel(r2, r1, r4)     // Catch: com.facebook.aura.pairs.PairsException -> L76
            if (r0 != r5) goto L74
            goto L85
        L74:
            r0 = 0
            goto L77
        L76:
            r0 = move-exception
        L77:
            com.facebook.aura.pairs.PairsPendingLevelStore r9 = r10.pendingLevels
            long r1 = java.lang.System.currentTimeMillis()
            boolean r0 = r9.record(r6, r0, r1)
            if (r0 == 0) goto L4c
            r7 = 1
            goto L4c
        L85:
            return r5
        L86:
            if (r7 == 0) goto L8b
            r10.invalidate()
        L8b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.applyPendingLevels(java.util.List, com.facebook.aura.pairs.PairsAccess, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cancelInvite(java.lang.String r20, X.HtJ<? super kotlin.Unit> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.cancelInvite(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object canonicalRules(java.lang.String r6, X.HtJ<? super com.facebook.aura.pairs.ConnectionsCanonicalRules> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsRepository.C129301
            if (r0 == 0) goto L38
            r4 = r7
            com.facebook.aura.pairs.PairsRepository$canonicalRules$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129301) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L40
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.pairs.ConnectionDetailJson r3 = (com.facebook.aura.pairs.ConnectionDetailJson) r3
            if (r3 == 0) goto L3e
            com.facebook.aura.pairs.ConnectionsCanonicalRules r2 = com.facebook.aura.pairs.ConnectionsSharingRuleKt.toCanonicalRules(r3)
            return r2
        L29:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r3 = r5.connectionDetail(r6, r4)
            if (r3 != r2) goto L20
            return r2
        L38:
            com.facebook.aura.pairs.PairsRepository$canonicalRules$1 r4 = new com.facebook.aura.pairs.PairsRepository$canonicalRules$1
            r4.<init>(r7)
            goto L12
        L3e:
            r2 = 0
            return r2
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.canonicalRules(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object canonicalRulesFor(java.lang.String r6, X.HtJ<? super com.facebook.aura.pairs.ConnectionsCanonicalRules> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsRepository.C129311
            if (r0 == 0) goto L36
            r4 = r7
            com.facebook.aura.pairs.PairsRepository$canonicalRulesFor$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129311) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L3c
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.pairs.ConnectionDetailJson r3 = (com.facebook.aura.pairs.ConnectionDetailJson) r3
            com.facebook.aura.pairs.ConnectionsCanonicalRules r0 = com.facebook.aura.pairs.ConnectionsSharingRuleKt.toCanonicalRules(r3)
            return r0
        L27:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r3 = r5.readConnectionDetail(r6, r4)
            if (r3 != r2) goto L20
            return r2
        L36:
            com.facebook.aura.pairs.PairsRepository$canonicalRulesFor$1 r4 = new com.facebook.aura.pairs.PairsRepository$canonicalRulesFor$1
            r4.<init>(r7)
            goto L12
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.canonicalRulesFor(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object changeLevel(java.lang.String r25, com.facebook.aura.pairs.PairsLevel r26, X.HtJ<? super kotlin.Unit> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.changeLevel(java.lang.String, com.facebook.aura.pairs.PairsLevel, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.linkLock) {
            this.linkFragments.clear();
            this.stagedAcceptLinks.clear();
            this.heldInvites.clear();
        }
        synchronized (this.connectionIds) {
            this.connectionIds.clear();
        }
        this.connectionNameCache.clear();
        this.imageCache.evictAll();
        synchronized (this.receiverCodes) {
            this.receiverCodes.clear();
        }
        synchronized (this.acceptedRequests) {
            this.acceptedRequests.clear();
        }
        synchronized (this.guidanceSaves) {
            this.guidanceSaves.clear();
        }
        HzS.A04(this.backgroundScope.AEA());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r5 == r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collaboratingResources(java.lang.String r8, java.lang.String r9, java.lang.String r10, X.HtJ<? super com.facebook.aura.pairs.ConnectionsResourcePage> r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.pairs.PairsRepository.C129331
            if (r0 == 0) goto L25
            r6 = r11
            com.facebook.aura.pairs.PairsRepository$collaboratingResources$1 r6 = (com.facebook.aura.pairs.PairsRepository.C129331) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r3 = r6.label
            r2 = 0
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L30
            if (r3 == r0) goto L48
            if (r3 != r1) goto L2b
            X.Hwg.A00(r5)
            return r5
        L25:
            com.facebook.aura.pairs.PairsRepository$collaboratingResources$1 r6 = new com.facebook.aura.pairs.PairsRepository$collaboratingResources$1
            r6.<init>(r11)
            goto L12
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.Hwg.A00(r5)
            if (r9 != 0) goto L54
            if (r8 == 0) goto L53
            r6.L$0 = r2
            r6.L$1 = r2
            r6.L$2 = r10
            r6.L$3 = r2
            r6.label = r0
            java.lang.Object r5 = r7.connectionIdFor(r8, r6)
            if (r5 != r4) goto L4e
        L47:
            return r4
        L48:
            java.lang.Object r0 = r6.L$2
            java.lang.String r10 = X.C3cG.A0d(r0, r5)
        L4e:
            java.lang.String r5 = (java.lang.String) r5
            r9 = r5
            if (r5 != 0) goto L54
        L53:
            return r2
        L54:
            r6.L$0 = r2
            r6.L$1 = r2
            r6.L$2 = r2
            r6.L$3 = r2
            r6.label = r1
            java.lang.Object r0 = r7.connectionResourcesFor(r9, r10, r6)
            if (r0 == r4) goto L47
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.collaboratingResources(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object confirmSafetyCode(com.facebook.aura.pairs.PairsPairingCode r26, X.HtJ<? super com.facebook.aura.pairs.PairsCodeOutcome> r27) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.confirmSafetyCode(com.facebook.aura.pairs.PairsPairingCode, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectionContact(java.lang.String r14, X.HtJ<? super com.facebook.aura.pairs.PairsContact> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.facebook.aura.pairs.PairsRepository.C129361
            if (r0 == 0) goto L51
            r4 = r15
            com.facebook.aura.pairs.PairsRepository$connectionContact$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129361) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 != r1) goto L57
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.pairs.ConnectionDetailJson r3 = (com.facebook.aura.pairs.ConnectionDetailJson) r3
            com.facebook.aura.pairs.ConnectionDirectoryEntryJson r0 = r3.connection
            java.lang.String r9 = r0.chat_session_id
            if (r9 != 0) goto L2a
            java.lang.String r9 = r3.chat_session_id
        L2a:
            r14 = 7935(0x1eff, float:1.112E-41)
            r1 = 0
            r8 = 0
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r10 = r1
            r11 = r1
            r12 = r8
            r13 = r1
            r15 = r1
            com.facebook.aura.pairs.ConnectionDirectoryEntryJson r0 = com.facebook.aura.pairs.ConnectionDirectoryEntryJson.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.facebook.aura.pairs.PairsContact r2 = com.facebook.aura.pairs.PairsRepositoryKt.toDirectoryContact(r0)
            return r2
        L42:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r3 = r13.readConnectionDetail(r14, r4)
            if (r3 != r2) goto L20
            return r2
        L51:
            com.facebook.aura.pairs.PairsRepository$connectionContact$1 r4 = new com.facebook.aura.pairs.PairsRepository$connectionContact$1
            r4.<init>(r15)
            goto L12
        L57:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.connectionContact(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectionInfo(java.lang.String r7, X.HtJ<? super com.facebook.aura.pairs.ConnectionsInfo> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsRepository.C129391
            if (r0 == 0) goto L57
            r3 = r8
            com.facebook.aura.pairs.PairsRepository$connectionInfo$1 r3 = (com.facebook.aura.pairs.PairsRepository.C129391) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r5 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 != r1) goto L5e
            X.Hwg.A00(r5)
        L20:
            com.facebook.aura.pairs.ConnectionDetailJson r5 = (com.facebook.aura.pairs.ConnectionDetailJson) r5
            r4 = 0
            if (r5 == 0) goto L5d
            com.facebook.aura.pairs.ConnectionDirectoryEntryJson r3 = r5.connection
            java.lang.String r2 = r3.connection_id
            java.lang.String r1 = r5.chat_session_id
            if (r1 != 0) goto L31
            java.lang.String r1 = r3.chat_session_id
            if (r1 == 0) goto L38
        L31:
            int r0 = r1.length()
            if (r0 <= 0) goto L38
            r4 = r1
        L38:
            com.facebook.aura.pairs.ConnectionsDisconnectEffect$Companion r1 = com.facebook.aura.pairs.ConnectionsDisconnectEffect.Companion
            com.facebook.aura.pairs.ConnectionCapabilitiesJson r0 = r3.capabilities
            java.lang.String r0 = r0.disconnect_effect
            com.facebook.aura.pairs.ConnectionsDisconnectEffect r1 = r1.fromWire(r0)
            com.facebook.aura.pairs.ConnectionsInfo r0 = new com.facebook.aura.pairs.ConnectionsInfo
            r0.<init>(r2, r4, r1)
            return r0
        L48:
            X.Hwg.A00(r5)
            r0 = 0
            r3.L$0 = r0
            r3.label = r1
            java.lang.Object r5 = r6.connectionDetail(r7, r3)
            if (r5 != r4) goto L20
            return r4
        L57:
            com.facebook.aura.pairs.PairsRepository$connectionInfo$1 r3 = new com.facebook.aura.pairs.PairsRepository$connectionInfo$1
            r3.<init>(r8)
            goto L12
        L5d:
            return r4
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.connectionInfo(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Hji] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectionNames(java.util.List<java.lang.String> r9, X.HtJ<? super java.util.List<java.lang.String>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.pairs.PairsRepository.C129401
            if (r0 == 0) goto L9c
            r6 = r10
            com.facebook.aura.pairs.PairsRepository$connectionNames$1 r6 = (com.facebook.aura.pairs.PairsRepository.C129401) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L6d
            if (r0 != r7) goto La3
            java.lang.Object r3 = r6.L$3
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r5 = r6.L$1
            java.util.List r5 = (java.util.List) r5
            X.Hwg.A00(r1)
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r2 = r3.next()
            java.util.List r2 = (java.util.List) r2
            r1 = 0
            com.facebook.aura.pairs.PairsRepository$connectionNames$3$1 r0 = new com.facebook.aura.pairs.PairsRepository$connectionNames$3$1
            r0.<init>(r2, r8, r1)
            r6.L$0 = r1
            r6.L$1 = r5
            r6.L$2 = r1
            r6.L$3 = r3
            r6.L$4 = r1
            r6.L$5 = r1
            r6.label = r7
            java.lang.Object r0 = X.Hxb.A00(r0, r6)
            if (r0 != r4) goto L28
        L4e:
            return r4
        L4f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r8.connectionNameCache
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r1 = r5.iterator()
        L59:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L59
            r4.add(r0)
            goto L59
        L6d:
            X.Hwg.A00(r1)
            java.util.List r5 = X.AbstractC0878AGe.A0T(r9)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r5.iterator()
        L7c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r1 = r2.next()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r8.connectionNameCache
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L7c
            r3.add(r1)
            goto L7c
        L92:
            r0 = 4
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0N(r3, r0)
            java.util.Iterator r3 = r0.iterator()
            goto L28
        L9c:
            com.facebook.aura.pairs.PairsRepository$connectionNames$1 r6 = new com.facebook.aura.pairs.PairsRepository$connectionNames$1
            r6.<init>(r10)
            goto L12
        La3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.connectionNames(java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectionResources(java.lang.String r7, java.lang.String r8, X.HtJ<? super com.facebook.aura.pairs.ConnectionsResourcePage> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.pairs.PairsRepository.C129411
            if (r0 == 0) goto L24
            r5 = r9
            com.facebook.aura.pairs.PairsRepository$connectionResources$1 r5 = (com.facebook.aura.pairs.PairsRepository.C129411) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L40
            if (r0 != r2) goto L2a
            X.Hwg.A00(r4)
            return r4
        L24:
            com.facebook.aura.pairs.PairsRepository$connectionResources$1 r5 = new com.facebook.aura.pairs.PairsRepository$connectionResources$1
            r5.<init>(r9)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r4)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r8
            r5.label = r1
            java.lang.Object r4 = r6.connectionIdFor(r7, r5)
            if (r4 != r3) goto L46
            return r3
        L40:
            java.lang.Object r0 = r5.L$1
            java.lang.String r8 = X.C3cG.A0d(r0, r4)
        L46:
            java.lang.String r4 = (java.lang.String) r4
            r0 = 0
            if (r4 == 0) goto L5a
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r2
            java.lang.Object r0 = r6.connectionResourcesFor(r4, r8, r5)
            if (r0 != r3) goto L5a
            return r3
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.connectionResources(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Hji] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object contacts(X.HtJ<? super java.util.List<com.facebook.aura.pairs.PairsContact>> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.pairs.PairsRepository.C129431
            if (r0 == 0) goto Lbf
            r7 = r9
            com.facebook.aura.pairs.PairsRepository$contacts$1 r7 = (com.facebook.aura.pairs.PairsRepository.C129431) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbf
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 1
            if (r0 == 0) goto La3
            if (r0 != r4) goto Lc6
            long r2 = r7.J$0
            X.Hwg.A00(r6)
        L22:
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r7 = X.C3cG.A0h()
            java.util.Iterator r5 = r6.iterator()
        L2c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4f
            kotlinx.serialization.json.JsonElement r4 = X.C60Q.A11(r5)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L3f
            com.facebook.aura.pairs.PeerContactJson$$serializer r0 = com.facebook.aura.pairs.PeerContactJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r1.A01(r0, r4)     // Catch: java.lang.Throwable -> L3f
            goto L44
        L3f:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L44:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L49
            r1 = 0
        L49:
            if (r1 == 0) goto L2c
            r7.add(r1)
            goto L2c
        L4f:
            int r1 = r7.size()
            int r0 = r6.size()
            if (r1 >= r0) goto L62
            java.lang.Integer r1 = X.C60R.A0W(r6, r7)
            java.lang.String r0 = "contact"
            X.C60R.A1H(r1, r0)
        L62:
            java.util.ArrayList r6 = X.C3cG.A0h()
            java.util.Iterator r5 = r7.iterator()
        L6a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r4 = r5.next()
            r0 = r4
            com.facebook.aura.pairs.PeerContactJson r0 = (com.facebook.aura.pairs.PeerContactJson) r0
            java.lang.String r1 = r0.status
            java.lang.String r0 = "unpaired"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6a
            r6.add(r4)
            goto L6a
        L85:
            java.util.ArrayList r5 = X.C3cG.A0h()
            java.util.Iterator r1 = r6.iterator()
        L8d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r1.next()
            com.facebook.aura.pairs.PeerContactJson r0 = (com.facebook.aura.pairs.PeerContactJson) r0
            com.facebook.aura.pairs.PairsContact r0 = com.facebook.aura.pairs.PairsRepositoryKt.toContact(r0, r2)
            if (r0 == 0) goto L8d
            r5.add(r0)
            goto L8d
        La3:
            X.Hwg.A00(r6)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "api/peers"
            com.facebook.aura.pairs.PeersPath r1 = new com.facebook.aura.pairs.PeersPath
            r1.<init>(r0)
            r0 = 0
            r7.L$0 = r0
            r7.J$0 = r2
            r7.label = r4
            java.lang.Object r6 = r8.readAllPages(r1, r7)
            if (r6 != r5) goto L22
        Lbe:
            return r5
        Lbf:
            com.facebook.aura.pairs.PairsRepository$contacts$1 r7 = new com.facebook.aura.pairs.PairsRepository$contacts$1
            r7.<init>(r9)
            goto L12
        Lc6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.contacts(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copyLink(com.facebook.aura.pairs.PairsInvite r26, X.HtJ<? super java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.copyLink(com.facebook.aura.pairs.PairsInvite, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createInvite(com.facebook.aura.pairs.PairsLevel r23, java.lang.String r24, java.lang.String r25, X.HtJ<? super com.facebook.aura.pairs.PairsMintedInvite> r26) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.createInvite(com.facebook.aura.pairs.PairsLevel, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createInviteLink(java.lang.String r25, X.HtJ<? super java.lang.String> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.createInviteLink(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createSpaceInvite(java.lang.String r23, java.lang.String r24, java.lang.String r25, X.HtJ<? super com.facebook.aura.pairs.PairsMintedInvite> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.createSpaceInvite(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object declineInbox(java.lang.String r25, X.HtJ<? super kotlin.Unit> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.declineInbox(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deliverToInbox(com.facebook.aura.pairs.PeerInvitePendingItemJson r27, X.HtJ<? super com.facebook.aura.pairs.PairsInboxDelivery> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.deliverToInbox(com.facebook.aura.pairs.PeerInvitePendingItemJson, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9 A[Catch: PairsException -> 0x0193, TryCatch #1 {PairsException -> 0x0193, blocks: (B:20:0x00bf, B:21:0x00c3, B:23:0x00c9, B:25:0x00d1, B:28:0x00d8, B:29:0x00e2, B:17:0x0059, B:65:0x018a, B:66:0x0192, B:64:0x0185), top: B:78:0x00bf, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185 A[Catch: PairsException -> 0x0193, TRY_ENTER, TryCatch #1 {PairsException -> 0x0193, blocks: (B:20:0x00bf, B:21:0x00c3, B:23:0x00c9, B:25:0x00d1, B:28:0x00d8, B:29:0x00e2, B:17:0x0059, B:65:0x018a, B:66:0x0192, B:64:0x0185), top: B:78:0x00bf, inners: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00bb -> B:21:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object directory(X.HtJ<? super com.facebook.aura.pairs.ConnectionsDirectory> r27) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.directory(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object disconnect(java.lang.String r6, java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsRepository.C129511
            if (r0 == 0) goto L37
            r4 = r8
            com.facebook.aura.pairs.PairsRepository$disconnect$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129511) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L4c
            java.lang.Object r6 = r4.L$0
            X.Hwg.A00(r3)
        L22:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r5.connectionIds
            monitor-enter(r1)
            goto L3d
        L26:
            X.Hwg.A00(r3)
            r4.L$0 = r6
            r0 = 0
            r4.L$1 = r0
            r4.label = r1
            java.lang.Object r0 = r5.postDisconnect(r7, r4)
            if (r0 != r2) goto L22
            return r2
        L37:
            com.facebook.aura.pairs.PairsRepository$disconnect$1 r4 = new com.facebook.aura.pairs.PairsRepository$disconnect$1
            r4.<init>(r8)
            goto L12
        L3d:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r5.connectionIds     // Catch: java.lang.Throwable -> L49
            r0.remove(r6)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r1)
            r5.invalidate()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L49:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L4c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.disconnect(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object disconnectGroup(java.lang.String r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsRepository.C129521
            if (r0 == 0) goto L35
            r4 = r7
            com.facebook.aura.pairs.PairsRepository$disconnectGroup$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129521) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L3b
            X.Hwg.A00(r3)
        L20:
            r5.invalidate()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L26:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r0 = r5.postDisconnect(r6, r4)
            if (r0 != r2) goto L20
            return r2
        L35:
            com.facebook.aura.pairs.PairsRepository$disconnectGroup$1 r4 = new com.facebook.aura.pairs.PairsRepository$disconnectGroup$1
            r4.<init>(r7)
            goto L12
        L3b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.disconnectGroup(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dismissActivity(java.lang.String r19, X.HtJ<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            r18 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.pairs.PairsRepository.C129531
            r4 = r18
            if (r0 == 0) goto L96
            r3 = r5
            com.facebook.aura.pairs.PairsRepository$dismissActivity$1 r3 = (com.facebook.aura.pairs.PairsRepository.C129531) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto Lbd
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L25:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lb8
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            boolean r0 = X.C60P.A1Z(r1)
            if (r0 == 0) goto L39
            kotlinx.serialization.json.JsonElement r2 = X.C60Q.A12(r1)
            if (r2 != 0) goto L9d
        L39:
            r2 = r1
            goto L9d
        L3b:
            X.Hwg.A00(r5)
            java.lang.String r6 = android.net.Uri.encode(r19)
            java.lang.String r5 = "api/peers/activity/"
            java.lang.String r0 = "/dismiss"
            com.facebook.aura.pairs.PeersPath r8 = X.C60Q.A0M(r5, r6, r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            r7 = 0
            X.HxE[] r0 = new X.HxE[r7]
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            X.CGz r10 = r4.userSession
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r0, r7)
            X.HxE[] r12 = (X.HxE[]) r12
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r3.L$0 = r11
            r3.L$1 = r4
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r11
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.L$8 = r11
            r3.L$9 = r11
            r3.L$10 = r11
            r3.L$11 = r11
            r3.I$0 = r7
            r3.I$1 = r1
            r3.I$2 = r7
            r3.label = r1
            r0 = r2
            r13 = r11
            r15 = r7
            r18 = r11
            r19 = r7
            r20 = r3
            r17 = r1
            java.lang.Object r1 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r1 != r2) goto L25
            return r0
        L96:
            com.facebook.aura.pairs.PairsRepository$dismissActivity$1 r3 = new com.facebook.aura.pairs.PairsRepository$dismissActivity$1
            r3.<init>(r5)
            goto L16
        L9d:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.IllegalArgumentException -> Lb3
            com.facebook.aura.pairs.PeerAcceptedJson$$serializer r0 = com.facebook.aura.pairs.PeerAcceptedJson$$serializer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> Lb3
            java.lang.Object r0 = r1.A01(r0, r2)     // Catch: java.lang.IllegalArgumentException -> Lb3
            com.facebook.aura.pairs.PeerAcceptedJson r0 = (com.facebook.aura.pairs.PeerAcceptedJson) r0
            boolean r0 = r0.accepted
            if (r0 == 0) goto Lae
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lae:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lb3:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lb8:
            java.lang.Throwable r0 = X.C60Q.A0p(r0)
            throw r0
        Lbd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.dismissActivity(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final PairsLevel droppedPendingLevel(String str) {
        if (str != null) {
            return this.pendingLevels.droppedLevels().get(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object earlierRequest(com.facebook.aura.pairs.PairsHeldInvite r7, X.HtJ<? super com.facebook.aura.pairs.PairsContact> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsRepository.C129541
            if (r0 == 0) goto L55
            r5 = r8
            com.facebook.aura.pairs.PairsRepository$earlierRequest$1 r5 = (com.facebook.aura.pairs.PairsRepository.C129541) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r3 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L3f
            if (r0 != r1) goto L5b
            java.lang.Object r0 = r5.L$1
            X.Hwg.A00(r3)
        L23:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.facebook.aura.pairs.PairsContact r1 = (com.facebook.aura.pairs.PairsContact) r1
            java.lang.String r1 = r1.museId
            boolean r1 = X.C7384Etj.areEqual(r1, r0)
            if (r1 == 0) goto L29
            return r2
        L3f:
            X.Hwg.A00(r3)
            com.facebook.aura.pairs.PairsInvitePreview r0 = r7.preview
            java.lang.String r0 = r0.inviterMuseId
            if (r0 == 0) goto L60
            r5.L$0 = r4
            r5.L$1 = r0
            r5.label = r1
            java.lang.Object r3 = r6.contacts(r5)
            if (r3 != r2) goto L23
            return r2
        L55:
            com.facebook.aura.pairs.PairsRepository$earlierRequest$1 r5 = new com.facebook.aura.pairs.PairsRepository$earlierRequest$1
            r5.<init>(r8)
            goto L12
        L5b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L60:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.earlierRequest(com.facebook.aura.pairs.PairsHeldInvite, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object editSharedGoal(java.lang.String r29, java.lang.String r30, com.facebook.aura.pairs.SharedGoalEditJson r31, X.HtJ<? super com.facebook.aura.pairs.SharedGoalEditOutcome> r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.editSharedGoal(java.lang.String, java.lang.String, com.facebook.aura.pairs.SharedGoalEditJson, X.HtJ):java.lang.Object");
    }

    public final C20Q<Unit> getChanges() {
        return this.changes;
    }

    public final C1BN<Integer> getInvalidations() {
        return this.invalidations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object history(java.lang.String r21, java.lang.Long r22, X.HtJ<? super com.facebook.aura.pairs.PairsHistoryPage> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.history(java.lang.String, java.lang.Long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object inboxFragment(java.lang.String r6, X.HtJ<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsRepository.C129591
            if (r0 == 0) goto L67
            r4 = r7
            com.facebook.aura.pairs.PairsRepository$inboxFragment$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129591) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L59
            if (r1 != r0) goto L6d
            java.lang.Object r6 = r4.L$0
            X.Hwg.A00(r2)
        L22:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.pairs.PeerInboxItemJson r0 = (com.facebook.aura.pairs.PeerInboxItemJson) r0
            java.lang.String r0 = r0.delivery_id
            boolean r0 = X.C7384Etj.areEqual(r0, r6)
            if (r0 == 0) goto L28
        L3e:
            com.facebook.aura.pairs.PeerInboxItemJson r1 = (com.facebook.aura.pairs.PeerInboxItemJson) r1
            if (r1 == 0) goto L66
            java.lang.String r2 = r1.invitation_url
            if (r2 == 0) goto L66
            r1 = 35
            java.lang.String r0 = ""
            java.lang.String r1 = X.C7BY.A0Q(r2, r0, r1)
            if (r1 == 0) goto L66
            boolean r0 = com.facebook.aura.pairs.PairsRepositoryKt.isValidFragment(r1)
            if (r0 == 0) goto L66
            return r1
        L57:
            r1 = r3
            goto L3e
        L59:
            X.Hwg.A00(r2)
            r4.L$0 = r6
            r4.label = r0
            java.lang.Object r2 = r5.inboxItems(r4)
            if (r2 != r3) goto L22
        L66:
            return r3
        L67:
            com.facebook.aura.pairs.PairsRepository$inboxFragment$1 r4 = new com.facebook.aura.pairs.PairsRepository$inboxFragment$1
            r4.<init>(r7)
            goto L12
        L6d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.inboxFragment(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void invalidate() {
        Integer value;
        this.connectionNameCache.clear();
        BLG<Integer> blg = this._invalidations;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, Integer.valueOf(AnonymousClass001.A0F(value) + 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object inviteInboxEnabled(X.HtJ<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.pairs.PairsRepository.C129621
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.pairs.PairsRepository$inviteInboxEnabled$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129621) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L24
            goto L35
        L1e:
            com.facebook.aura.pairs.PairsRepository$inviteInboxEnabled$1 r4 = new com.facebook.aura.pairs.PairsRepository$inviteInboxEnabled$1
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r3)
            r4.label = r0     // Catch: com.facebook.aura.pairs.PairsException -> L3d
            java.lang.Object r3 = r5.access(r4)     // Catch: com.facebook.aura.pairs.PairsException -> L3d
            if (r3 != r2) goto L38
            return r2
        L35:
            X.Hwg.A00(r3)     // Catch: com.facebook.aura.pairs.PairsException -> L3d
        L38:
            com.facebook.aura.pairs.PairsAccess r3 = (com.facebook.aura.pairs.PairsAccess) r3     // Catch: com.facebook.aura.pairs.PairsException -> L3d
            boolean r0 = r3.hasInviteInbox     // Catch: com.facebook.aura.pairs.PairsException -> L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.inviteInboxEnabled(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadGuidance(java.lang.String r25, X.HtJ<? super com.facebook.aura.pairs.PairsDiscretionDocument> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.loadGuidance(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r11 == r10) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119 A[LOOP:0: B:45:0x0113->B:47:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182 A[LOOP:2: B:59:0x017c->B:61:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4 A[LOOP:3: B:66:0x01ae->B:68:0x01b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.facebook.aura.pairs.PairsRepository] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadHub(X.HtJ<? super com.facebook.aura.pairs.PairsHubSnapshot> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.loadHub(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openInChat(java.lang.String r25, X.HtJ<? super com.facebook.aura.pairs.PairsInviteOpenOutcome> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.openInChat(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[PHI: r1 r8 r10 r11
  0x0034: PHI (r1v5 java.lang.Object) = (r1v2 java.lang.Object), (r1v6 java.lang.Object) binds: [B:28:0x008f, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r8v2 int) = (r8v0 int), (r8v4 int) binds: [B:28:0x008f, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r10v3 java.lang.String) = (r10v1 java.lang.String), (r10v4 java.lang.String) binds: [B:28:0x008f, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r11v3 com.facebook.aura.pairs.PairsPairingCode) = (r11v1 com.facebook.aura.pairs.PairsPairingCode), (r11v4 com.facebook.aura.pairs.PairsPairingCode) binds: [B:28:0x008f, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSafetyCodeWhenReady(java.lang.String r10, com.facebook.aura.pairs.PairsPairingCode r11, X.HtJ<? super com.facebook.aura.pairs.PairsCodeOutcome> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.pairs.PairsRepository.C129731
            if (r0 == 0) goto L91
            r6 = r12
            com.facebook.aura.pairs.PairsRepository$readSafetyCodeWhenReady$1 r6 = (com.facebook.aura.pairs.PairsRepository.C129731) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r2 = r6.label
            r5 = 3
            r4 = 2
            r0 = 1
            if (r2 == 0) goto L75
            if (r2 == r0) goto L85
            if (r2 == r4) goto L57
            if (r2 != r5) goto L99
            int r8 = r6.I$0
            java.lang.Object r11 = r6.L$1
            com.facebook.aura.pairs.PairsPairingCode r11 = (com.facebook.aura.pairs.PairsPairingCode) r11
            java.lang.Object r0 = r6.L$0
            java.lang.String r10 = X.C3cG.A0d(r0, r1)
        L2f:
            int r8 = r8 + 1
            r0 = 6
            if (r8 >= r0) goto L98
        L34:
            com.facebook.aura.pairs.PairsCodeOutcome$NotReady r0 = com.facebook.aura.pairs.PairsCodeOutcome.NotReady.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L98
            r2 = 500(0x1f4, double:2.47E-321)
            long r2 = r2 << r8
            r0 = 4000(0xfa0, double:1.9763E-320)
            long r0 = java.lang.Math.min(r2, r0)
            r6.L$0 = r10
            r6.L$1 = r11
            r2 = 0
            r6.L$2 = r2
            r6.I$0 = r8
            r6.label = r4
            java.lang.Object r0 = X.C7Bq.A01(r0, r6)
            if (r0 != r7) goto L63
            return r7
        L57:
            int r8 = r6.I$0
            java.lang.Object r11 = r6.L$1
            com.facebook.aura.pairs.PairsPairingCode r11 = (com.facebook.aura.pairs.PairsPairingCode) r11
            java.lang.Object r0 = r6.L$0
            java.lang.String r10 = X.C3cG.A0d(r0, r1)
        L63:
            r6.L$0 = r10
            r6.L$1 = r11
            r0 = 0
            r6.L$2 = r0
            r6.I$0 = r8
            r6.label = r5
            java.lang.Object r1 = r9.readSafetyCode(r10, r11, r6)
            if (r1 != r7) goto L2f
            return r7
        L75:
            X.Hwg.A00(r1)
            r6.L$0 = r10
            r6.L$1 = r11
            r6.label = r0
            java.lang.Object r1 = r9.readSafetyCode(r10, r11, r6)
            if (r1 != r7) goto L8f
            return r7
        L85:
            java.lang.Object r11 = r6.L$1
            com.facebook.aura.pairs.PairsPairingCode r11 = (com.facebook.aura.pairs.PairsPairingCode) r11
            java.lang.Object r0 = r6.L$0
            java.lang.String r10 = X.C3cG.A0d(r0, r1)
        L8f:
            r8 = 0
            goto L34
        L91:
            com.facebook.aura.pairs.PairsRepository$readSafetyCodeWhenReady$1 r6 = new com.facebook.aura.pairs.PairsRepository$readSafetyCodeWhenReady$1
            r6.<init>(r12)
            goto L12
        L98:
            return r1
        L99:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.readSafetyCodeWhenReady(java.lang.String, com.facebook.aura.pairs.PairsPairingCode, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object receivedItem(java.lang.String r19, X.HtJ<? super com.facebook.aura.pairs.ConnectionsReceivedItem> r20) {
        /*
            r18 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.pairs.PairsRepository.C129741
            r4 = r18
            if (r0 == 0) goto L9f
            r3 = r5
            com.facebook.aura.pairs.PairsRepository$receivedItem$1 r3 = (com.facebook.aura.pairs.PairsRepository.C129741) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto Lbf
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L25:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lba
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            boolean r0 = X.C60P.A1Z(r1)
            if (r0 == 0) goto L39
            kotlinx.serialization.json.JsonElement r2 = X.C60Q.A12(r1)
            if (r2 != 0) goto La6
        L39:
            r2 = r1
            goto La6
        L3b:
            X.Hwg.A00(r5)
            java.lang.String r5 = android.net.Uri.encode(r19)
            java.lang.String r0 = "api/peers/shared/"
            java.lang.String r0 = X.FGI.A0M(r0, r5)
            com.facebook.aura.pairs.PeersPath r8 = new com.facebook.aura.pairs.PeersPath
            r8.<init>(r0)
            r7 = 0
            X.HxE[] r0 = new X.HxE[r7]
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            X.CGz r10 = r4.userSession
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r0, r7)
            X.HxE[] r12 = (X.HxE[]) r12
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r3.L$0 = r11
            r3.L$1 = r11
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r4
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.L$8 = r11
            r3.L$9 = r11
            r3.L$10 = r11
            r3.L$11 = r11
            r3.L$12 = r11
            r3.L$13 = r11
            r3.L$14 = r11
            r3.I$0 = r7
            r3.I$1 = r1
            r3.I$2 = r7
            r3.label = r1
            r0 = r2
            r13 = r11
            r15 = r7
            r18 = r11
            r19 = r7
            r20 = r3
            r17 = r1
            java.lang.Object r1 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r1 != r2) goto L25
            return r0
        L9f:
            com.facebook.aura.pairs.PairsRepository$receivedItem$1 r3 = new com.facebook.aura.pairs.PairsRepository$receivedItem$1
            r3.<init>(r5)
            goto L16
        La6:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.IllegalArgumentException -> Lb5
            com.facebook.aura.pairs.ReceivedSharedItemJson$$serializer r0 = com.facebook.aura.pairs.ReceivedSharedItemJson$$serializer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> Lb5
            java.lang.Object r0 = r1.A01(r0, r2)     // Catch: java.lang.IllegalArgumentException -> Lb5
            com.facebook.aura.pairs.ReceivedSharedItemJson r0 = (com.facebook.aura.pairs.ReceivedSharedItemJson) r0
            com.facebook.aura.pairs.ConnectionsReceivedItem r0 = com.facebook.aura.pairs.ConnectionsReceivedItemKt.toReceivedItem(r0)
            return r0
        Lb5:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lba:
            java.lang.Throwable r0 = X.C60Q.A0p(r0)
            throw r0
        Lbf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.receivedItem(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recordDelivery(java.lang.String r27, java.lang.String r28, X.HtJ<? super kotlin.Unit> r29) throws java.lang.Throwable {
        /*
            r26 = this;
            r4 = r29
            boolean r0 = r4 instanceof com.facebook.aura.pairs.PairsRepository.C129751
            r6 = r26
            if (r0 == 0) goto Lb8
            r3 = r4
            com.facebook.aura.pairs.PairsRepository$recordDelivery$1 r3 = (com.facebook.aura.pairs.PairsRepository.C129751) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r4 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r10 = 0
            r1 = 1
            if (r0 == 0) goto L4a
            if (r0 != r1) goto Lbf
            java.lang.Object r0 = X.AnonymousClass001.A0q(r4)
        L26:
            java.lang.Throwable r1 = X.HsJ.A00(r0)
            if (r1 == 0) goto L45
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lc3
            boolean r0 = r1 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto L48
            com.facebook.aura.json.NetworkException r1 = (com.facebook.aura.json.NetworkException) r1
            if (r1 == 0) goto L48
            int r0 = r1.httpResponseCode
        L3a:
            java.lang.Object[] r2 = X.C60Q.A1Y(r0)
            java.lang.String r1 = "PairsRepository"
            java.lang.String r0 = "record delivery failed (code=%d)"
            X.CFK.A0H(r1, r0, r2)
        L45:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L48:
            r0 = -1
            goto L3a
        L4a:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r5 = android.net.Uri.encode(r27)
            java.lang.String r4 = "api/peers/invites/"
            java.lang.String r0 = "/delivery"
            com.facebook.aura.pairs.PeersPath r11 = X.C60Q.A0M(r4, r5, r0)
            com.facebook.aura.pairs.PeerInviteDeliveryIdJson r12 = new com.facebook.aura.pairs.PeerInviteDeliveryIdJson
            r0 = r28
            r12.<init>(r0)
            com.facebook.aura.network.http.RequestType r13 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r14 = r6.userSession
            X.HxE[] r0 = new X.HxE[r10]
            java.util.Set r18 = X.AnonymousClass004.A18()
            X.9jH r21 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$recordDelivery$$inlined$executeJarvisRequest-Z6QaZII$default$1 r8 = com.facebook.aura.pairs.PairsRepository$recordDelivery$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.pairs.PairsRepository$recordDelivery$$inlined$executeJarvisRequest-Z6QaZII$default$2 r9 = com.facebook.aura.pairs.PairsRepository$recordDelivery$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r15 = 0
            r3.L$0 = r15
            r3.L$1 = r15
            r3.L$2 = r15
            r3.L$3 = r15
            r3.L$4 = r15
            r3.L$5 = r15
            r3.L$6 = r15
            r3.L$7 = r15
            r3.L$8 = r15
            r3.L$9 = r15
            r3.I$0 = r10
            r3.I$1 = r1
            r3.I$2 = r1
            r3.I$3 = r1
            r3.I$4 = r1
            r3.I$5 = r10
            r3.I$6 = r10
            r3.label = r1
            r16 = r15
            r19 = r10
            r20 = r1
            r22 = r15
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r10
            r27 = r15
            r28 = r10
            r29 = r3
            r17 = r0
            java.lang.Object r0 = r7.m1599executeJarvisRequestWithFof5HsY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r0 != r2) goto L26
            return r2
        Lb8:
            com.facebook.aura.pairs.PairsRepository$recordDelivery$1 r3 = new com.facebook.aura.pairs.PairsRepository$recordDelivery$1
            r3.<init>(r4)
            goto L16
        Lbf:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        Lc3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.recordDelivery(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object removeContact(com.facebook.aura.pairs.PairsContact r24, X.HtJ<? super kotlin.Unit> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.removeContact(com.facebook.aura.pairs.PairsContact, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object removeSharingRule(java.lang.String r18, java.lang.String r19, X.HtJ<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.pairs.PairsRepository.C129771
            r2 = r17
            if (r0 == 0) goto La1
            r3 = r5
            com.facebook.aura.pairs.PairsRepository$removeSharingRule$1 r3 = (com.facebook.aura.pairs.PairsRepository.C129771) r3
            int r4 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto La1
            int r4 = r4 - r1
            r3.label = r4
        L16:
            java.lang.Object r5 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto Lcb
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L25:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lc6
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            boolean r0 = X.C60P.A1Z(r1)
            if (r0 == 0) goto L39
            kotlinx.serialization.json.JsonElement r3 = X.C60Q.A12(r1)
            if (r3 != 0) goto La8
        L39:
            r3 = r1
            goto La8
        L3b:
            X.Hwg.A00(r5)
            java.lang.String r7 = android.net.Uri.encode(r18)
            java.lang.String r6 = android.net.Uri.encode(r19)
            java.lang.String r5 = "api/peers/"
            java.lang.String r0 = "/rules/"
            java.lang.String r0 = X.FGI.A0d(r5, r7, r0, r6)
            com.facebook.aura.pairs.PeersPath r8 = new com.facebook.aura.pairs.PeersPath
            r8.<init>(r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.DELETE
            r7 = 0
            X.HxE[] r0 = new X.HxE[r7]
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            X.CGz r10 = r2.userSession
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r0, r7)
            X.HxE[] r12 = (X.HxE[]) r12
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r3.L$0 = r11
            r3.L$1 = r11
            r3.L$2 = r2
            r3.L$3 = r11
            r3.L$4 = r11
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.L$8 = r11
            r3.L$9 = r11
            r3.L$10 = r11
            r3.L$11 = r11
            r3.L$12 = r11
            r3.I$0 = r7
            r3.I$1 = r1
            r3.I$2 = r7
            r3.label = r1
            r0 = r4
            r13 = r11
            r15 = r7
            r18 = r11
            r19 = r7
            r20 = r3
            r17 = r1
            java.lang.Object r1 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r1 != r4) goto L25
            return r0
        La1:
            com.facebook.aura.pairs.PairsRepository$removeSharingRule$1 r3 = new com.facebook.aura.pairs.PairsRepository$removeSharingRule$1
            r3.<init>(r5)
            goto L16
        La8:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.IllegalArgumentException -> Lc1
            com.facebook.aura.pairs.PeerAcceptedJson$$serializer r0 = com.facebook.aura.pairs.PeerAcceptedJson$$serializer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> Lc1
            java.lang.Object r0 = r1.A01(r0, r3)     // Catch: java.lang.IllegalArgumentException -> Lc1
            com.facebook.aura.pairs.PeerAcceptedJson r0 = (com.facebook.aura.pairs.PeerAcceptedJson) r0
            boolean r0 = r0.accepted
            if (r0 == 0) goto Lbc
            r2.invalidate()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lbc:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lc1:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lc6:
            java.lang.Throwable r0 = X.C60Q.A0p(r0)
            throw r0
        Lcb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.removeSharingRule(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveCanonicalRule(java.lang.String r28, com.facebook.aura.pairs.ConnectionsSharingRule r29, long r30, boolean r32, X.HtJ<? super java.lang.Long> r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.saveCanonicalRule(java.lang.String, com.facebook.aura.pairs.ConnectionsSharingRule, long, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object savedMessageStatus(java.lang.String r19, X.HtJ<? super com.facebook.aura.pairs.ConnectionsShareStatus> r20) throws java.lang.Throwable {
        /*
            r18 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.pairs.PairsRepository.C129791
            r4 = r18
            if (r0 == 0) goto L9f
            r3 = r5
            com.facebook.aura.pairs.PairsRepository$savedMessageStatus$1 r3 = (com.facebook.aura.pairs.PairsRepository.C129791) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto Lc3
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L25:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lbe
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            boolean r0 = X.C60P.A1Z(r1)
            if (r0 == 0) goto L39
            kotlinx.serialization.json.JsonElement r2 = X.C60Q.A12(r1)
            if (r2 != 0) goto La6
        L39:
            r2 = r1
            goto La6
        L3b:
            X.Hwg.A00(r5)
            java.lang.String r5 = android.net.Uri.encode(r19)
            java.lang.String r0 = "api/peers/messages/"
            java.lang.String r0 = X.FGI.A0M(r0, r5)
            com.facebook.aura.pairs.PeersPath r8 = new com.facebook.aura.pairs.PeersPath
            r8.<init>(r0)
            r7 = 0
            X.HxE[] r0 = new X.HxE[r7]
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            X.CGz r10 = r4.userSession
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r0, r7)
            X.HxE[] r12 = (X.HxE[]) r12
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r3.L$0 = r11
            r3.L$1 = r11
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r4
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.L$8 = r11
            r3.L$9 = r11
            r3.L$10 = r11
            r3.L$11 = r11
            r3.L$12 = r11
            r3.L$13 = r11
            r3.L$14 = r11
            r3.I$0 = r7
            r3.I$1 = r1
            r3.I$2 = r7
            r3.label = r1
            r0 = r2
            r13 = r11
            r15 = r7
            r18 = r11
            r19 = r7
            r20 = r3
            r17 = r1
            java.lang.Object r1 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r1 != r2) goto L25
            return r0
        L9f:
            com.facebook.aura.pairs.PairsRepository$savedMessageStatus$1 r3 = new com.facebook.aura.pairs.PairsRepository$savedMessageStatus$1
            r3.<init>(r5)
            goto L16
        La6:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.IllegalArgumentException -> Lb9
            com.facebook.aura.pairs.SavedMessageJson$$serializer r0 = com.facebook.aura.pairs.SavedMessageJson$$serializer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> Lb9
            java.lang.Object r0 = r1.A01(r0, r2)     // Catch: java.lang.IllegalArgumentException -> Lb9
            com.facebook.aura.pairs.SavedMessageJson r0 = (com.facebook.aura.pairs.SavedMessageJson) r0
            com.facebook.aura.pairs.ConnectionsShareStatus$Companion r1 = com.facebook.aura.pairs.ConnectionsShareStatus.Companion
            java.lang.String r0 = r0.status
            com.facebook.aura.pairs.ConnectionsShareStatus r0 = r1.fromWire(r0)
            return r0
        Lb9:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lbe:
            java.lang.Throwable r0 = X.C60Q.A0p(r0)
            throw r0
        Lc3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.savedMessageStatus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.Hji] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object searchSuggestions(java.lang.String r15, com.facebook.aura.pairs.PairsRecipientPurpose r16, X.HtJ<? super java.util.List<com.facebook.aura.pairs.PairsSuggestion>> r17) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.searchSuggestions(java.lang.String, com.facebook.aura.pairs.PairsRecipientPurpose, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object share(java.lang.String r31, java.lang.String r32, java.lang.String r33, X.HtJ<? super com.facebook.aura.pairs.ConnectionsShareOutcome> r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.share(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shareTargetsPage(java.lang.String r21, java.util.Map<java.lang.String, com.facebook.aura.pairs.PairsImageRef> r22, X.HtJ<? super com.facebook.aura.pairs.ConnectionsShareTargetPage> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.shareTargetsPage(java.lang.String, java.util.Map, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sharedGoal(java.lang.String r19, java.lang.String r20, X.HtJ<? super com.facebook.aura.pairs.SharedGoal> r21) throws java.lang.Throwable {
        /*
            r18 = this;
            r3 = r21
            boolean r0 = r3 instanceof com.facebook.aura.pairs.PairsRepository.C129831
            r5 = r18
            if (r0 == 0) goto L87
            r4 = r3
            com.facebook.aura.pairs.PairsRepository$sharedGoal$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129831) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L3c
            if (r1 != r0) goto Lc0
            java.lang.Object r4 = X.AnonymousClass001.A0q(r3)
        L25:
            java.lang.Throwable r2 = X.HsJ.A00(r4)
            r1 = 0
            if (r2 != 0) goto La7
            kotlinx.serialization.json.JsonObject r4 = (kotlinx.serialization.json.JsonObject) r4
            boolean r0 = X.C60P.A1Z(r4)
            if (r0 == 0) goto L3a
            kotlinx.serialization.json.JsonElement r3 = X.C60Q.A12(r4)
            if (r3 != 0) goto L8d
        L3a:
            r3 = r4
            goto L8d
        L3c:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            r1 = r20
            r3 = r19
            com.facebook.aura.pairs.PeersPath r9 = r5.sharedGoalPath(r3, r1)
            com.facebook.aura.network.http.RequestType r10 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r11 = r5.userSession
            r8 = 0
            X.HxE[] r13 = new X.HxE[r8]
            java.util.Set r15 = X.AnonymousClass004.A18()
            X.9jH r17 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$sharedGoal$$inlined$executeJarvisRequest-1iavgos$default$1 r7 = com.facebook.aura.pairs.PairsRepository$sharedGoal$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r12 = 0
            r4.L$0 = r12
            r4.L$1 = r12
            r4.L$2 = r12
            r4.L$3 = r12
            r4.L$4 = r12
            r4.L$5 = r12
            r4.L$6 = r12
            r4.L$7 = r12
            r4.L$8 = r12
            r4.I$0 = r8
            r4.I$1 = r0
            r4.I$2 = r8
            r4.label = r0
            r14 = r12
            r16 = r8
            r19 = r12
            r20 = r8
            r21 = r4
            r18 = r0
            java.lang.Object r4 = r6.m1595executeBodylessJarvisRequestWithp3iPjrY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r4 != r2) goto L25
            return r2
        L87:
            com.facebook.aura.pairs.PairsRepository$sharedGoal$1 r4 = new com.facebook.aura.pairs.PairsRepository$sharedGoal$1
            r4.<init>(r3)
            goto L16
        L8d:
            X.9sU r2 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.IllegalArgumentException -> La1
            com.facebook.aura.pairs.PeerGoalJson$$serializer r0 = com.facebook.aura.pairs.PeerGoalJson$$serializer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> La1
            java.lang.Object r0 = r2.A01(r0, r3)     // Catch: java.lang.IllegalArgumentException -> La1
            com.facebook.aura.pairs.PeerGoalJson r0 = (com.facebook.aura.pairs.PeerGoalJson) r0
            com.facebook.aura.pairs.SharedGoalJson r0 = r0.goal
            if (r0 == 0) goto La0
            com.facebook.aura.pairs.SharedGoal r2 = com.facebook.aura.pairs.SharedGoalKt.toSharedGoal(r0)
            return r2
        La0:
            return r1
        La1:
            com.facebook.aura.pairs.SharedGoalException r0 = new com.facebook.aura.pairs.SharedGoalException
            r0.<init>(r1)
            throw r0
        La7:
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lbf
            boolean r0 = r2 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto Lb9
            com.facebook.aura.json.NetworkException r2 = (com.facebook.aura.json.NetworkException) r2
            if (r2 == 0) goto Lb9
            int r0 = r2.httpResponseCode
            java.lang.Integer r1 = X.C3cG.A0R(r0)
        Lb9:
            com.facebook.aura.pairs.SharedGoalException r0 = new com.facebook.aura.pairs.SharedGoalException
            r0.<init>(r1)
            throw r0
        Lbf:
            throw r2
        Lc0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.sharedGoal(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0086, code lost:
    
        r2.put(r3, new com.facebook.aura.pairs.ConnectionsSharedLinkTarget(r14, r1.workspacePath, r1.mimeType, r1.destination));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00af A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00de -> B:32:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0117 -> B:32:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x011c -> B:32:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0125 -> B:17:0x003f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x013c -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sharedLinkTargets(java.util.Collection<java.lang.String> r16, X.HtJ<? super java.util.Map<java.lang.String, com.facebook.aura.pairs.ConnectionsSharedLinkTarget>> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.sharedLinkTargets(java.util.Collection, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0093 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sharedSpaceBySlug(java.lang.String r12, java.lang.String r13, X.HtJ<? super com.facebook.aura.navigation.key.PeerSpaceScreenKey> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.pairs.PairsRepository.C129851
            if (r0 == 0) goto L96
            r5 = r14
            com.facebook.aura.pairs.PairsRepository$sharedSpaceBySlug$1 r5 = (com.facebook.aura.pairs.PairsRepository.C129851) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r8 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L7c
            if (r0 != r4) goto L9d
            java.lang.Object r2 = r5.L$3
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            java.lang.Object r13 = r5.L$1
            java.lang.Object r0 = r5.L$0
            java.lang.String r12 = X.C3cG.A0d(r0, r8)
        L2a:
            com.facebook.aura.pairs.ConnectionsResourcePage r8 = (com.facebook.aura.pairs.ConnectionsResourcePage) r8
            if (r8 == 0) goto L6c
            java.util.List<com.facebook.aura.pairs.ConnectionsResource> r0 = r8.resources
            java.util.Iterator r10 = r0.iterator()
        L34:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r7 = r10.next()
            r9 = r7
            com.facebook.aura.pairs.ConnectionsResource r9 = (com.facebook.aura.pairs.ConnectionsResource) r9
            com.facebook.aura.pairs.ConnectionsSharedItemKind r1 = r9.kind
            com.facebook.aura.pairs.ConnectionsSharedItemKind r0 = com.facebook.aura.pairs.ConnectionsSharedItemKind.SPACE
            if (r1 != r0) goto L34
            java.lang.String r0 = r9.reference
            boolean r0 = X.C7384Etj.areEqual(r0, r13)
            if (r0 == 0) goto L34
            com.facebook.aura.navigation.AuraNavKey r1 = r9.destination
            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.PeerSpaceScreenKey
            if (r0 == 0) goto L78
            com.facebook.aura.navigation.key.PeerSpaceScreenKey r1 = (com.facebook.aura.navigation.key.PeerSpaceScreenKey) r1
            if (r1 == 0) goto L78
            java.lang.String r0 = r1.hostMuse
        L5b:
            boolean r0 = X.C7384Etj.areEqual(r0, r12)
            if (r0 == 0) goto L34
        L61:
            com.facebook.aura.pairs.ConnectionsResource r7 = (com.facebook.aura.pairs.ConnectionsResource) r7
            if (r7 == 0) goto L6d
            com.facebook.aura.navigation.AuraNavKey r3 = r7.destination
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.aura.navigation.key.PeerSpaceScreenKey"
            X.C7384Etj.A0Z(r3, r0)
        L6c:
            return r3
        L6d:
            java.lang.String r1 = r8.next
            if (r1 == 0) goto L6c
            boolean r0 = r2.add(r1)
            if (r0 != 0) goto L84
            return r3
        L78:
            r0 = r3
            goto L5b
        L7a:
            r7 = r3
            goto L61
        L7c:
            X.Hwg.A00(r8)
            java.util.HashSet r2 = X.C60O.A13()
            r1 = r3
        L84:
            r5.L$0 = r12
            r5.L$1 = r13
            r0 = 0
            r5.L$2 = r0
            r5.L$3 = r2
            r5.label = r4
            java.lang.Object r8 = r11.connectionResources(r12, r1, r5)
            if (r8 != r6) goto L2a
            return r6
        L96:
            com.facebook.aura.pairs.PairsRepository$sharedSpaceBySlug$1 r5 = new com.facebook.aura.pairs.PairsRepository$sharedSpaceBySlug$1
            r5.<init>(r14)
            goto L12
        L9d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.sharedSpaceBySlug(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object spaceCollaborators(java.lang.String r19, X.HtJ<? super com.facebook.aura.pairs.SpaceCollaborators> r20) throws java.lang.Throwable {
        /*
            r18 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.pairs.PairsRepository.C129871
            r4 = r18
            if (r0 == 0) goto L96
            r3 = r5
            com.facebook.aura.pairs.PairsRepository$spaceCollaborators$1 r3 = (com.facebook.aura.pairs.PairsRepository.C129871) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto Lb8
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L25:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lb3
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            boolean r0 = X.C60P.A1Z(r1)
            if (r0 == 0) goto L39
            kotlinx.serialization.json.JsonElement r2 = X.C60Q.A12(r1)
            if (r2 != 0) goto L9d
        L39:
            r2 = r1
            goto L9d
        L3b:
            X.Hwg.A00(r5)
            com.facebook.aura.pairs.SpaceCollaboratorsPath r8 = new com.facebook.aura.pairs.SpaceCollaboratorsPath
            r0 = r19
            r8.<init>(r0)
            r7 = 0
            X.HxE[] r0 = new X.HxE[r7]
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            X.CGz r10 = r4.userSession
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r0, r7)
            X.HxE[] r12 = (X.HxE[]) r12
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.pairs.PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r3.L$0 = r11
            r3.L$1 = r11
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r4
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.L$8 = r11
            r3.L$9 = r11
            r3.L$10 = r11
            r3.L$11 = r11
            r3.L$12 = r11
            r3.L$13 = r11
            r3.L$14 = r11
            r3.I$0 = r7
            r3.I$1 = r1
            r3.I$2 = r7
            r3.label = r1
            r13 = r11
            r15 = r7
            r18 = r11
            r19 = r7
            r20 = r3
            r17 = r1
            java.lang.Object r1 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r1 != r2) goto L25
            return r2
        L96:
            com.facebook.aura.pairs.PairsRepository$spaceCollaborators$1 r3 = new com.facebook.aura.pairs.PairsRepository$spaceCollaborators$1
            r3.<init>(r5)
            goto L16
        L9d:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.IllegalArgumentException -> Lae
            int r0 = com.facebook.aura.pairs.SpaceCollaboratorsJson.$stable     // Catch: java.lang.IllegalArgumentException -> Lae
            com.facebook.aura.pairs.SpaceCollaboratorsJson$$serializer r0 = com.facebook.aura.pairs.SpaceCollaboratorsJson$$serializer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> Lae
            java.lang.Object r0 = r1.A01(r0, r2)     // Catch: java.lang.IllegalArgumentException -> Lae
            com.facebook.aura.pairs.SpaceCollaboratorsJson r0 = (com.facebook.aura.pairs.SpaceCollaboratorsJson) r0
            com.facebook.aura.pairs.SpaceCollaborators r2 = com.facebook.aura.pairs.SpaceCollaboratorsKt.toDomain(r0)
            return r2
        Lae:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lb3:
            java.lang.Throwable r0 = X.C60Q.A0p(r0)
            throw r0
        Lb8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.spaceCollaborators(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSpaceCollaborators(java.lang.String r25, com.facebook.aura.pairs.SpaceCollaboratorsUpdateJson r26, X.HtJ<? super com.facebook.aura.pairs.SpaceCollaborators> r27) throws java.lang.Throwable {
        /*
            r24 = this;
            r5 = r27
            boolean r0 = r5 instanceof com.facebook.aura.pairs.PairsRepository.C129891
            r2 = r24
            if (r0 == 0) goto Lad
            r4 = r5
            com.facebook.aura.pairs.PairsRepository$updateSpaceCollaborators$1 r4 = (com.facebook.aura.pairs.PairsRepository.C129891) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lad
            int r3 = r3 - r1
            r4.label = r3
        L16:
            java.lang.Object r5 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L3f
            if (r1 != r0) goto Lcf
            java.lang.Object r2 = r4.L$6
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L29:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lca
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            boolean r0 = X.C60P.A1Z(r1)
            if (r0 == 0) goto L3d
            kotlinx.serialization.json.JsonElement r2 = X.C60Q.A12(r1)
            if (r2 != 0) goto Lb4
        L3d:
            r2 = r1
            goto Lb4
        L3f:
            X.Hwg.A00(r5)
            com.facebook.aura.pairs.SpaceCollaboratorsPath r9 = new com.facebook.aura.pairs.SpaceCollaboratorsPath
            r1 = r25
            r9.<init>(r1)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.PUT
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            X.CGz r12 = r2.userSession
            r8 = 0
            X.HxE[] r15 = new X.HxE[r8]
            java.util.Set r16 = X.AnonymousClass004.A18()
            X.9jH r19 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$updateSpaceCollaborators$$inlined$write$default$1 r6 = com.facebook.aura.pairs.PairsRepository$updateSpaceCollaborators$$inlined$write$default$1.INSTANCE
            com.facebook.aura.pairs.PairsRepository$write$$inlined$executeJarvisRequest-Z6QaZII$default$2 r7 = com.facebook.aura.pairs.PairsRepository$write$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r13 = 0
            r4.L$0 = r13
            r4.L$1 = r13
            r4.L$2 = r2
            r4.L$3 = r13
            r4.L$4 = r13
            r4.L$5 = r13
            java.lang.String r2 = "audience_changed"
            r4.L$6 = r2
            r4.L$7 = r13
            r4.L$8 = r13
            r4.L$9 = r13
            r4.L$10 = r13
            r4.L$11 = r13
            r4.L$12 = r13
            r4.L$13 = r13
            r4.L$14 = r13
            r4.I$0 = r8
            r4.I$1 = r0
            r4.I$2 = r8
            r4.I$3 = r0
            r4.I$4 = r8
            r4.I$5 = r8
            r4.I$6 = r8
            r4.label = r0
            r10 = r26
            r14 = r13
            r17 = r8
            r20 = r13
            r21 = r8
            r22 = r0
            r23 = r8
            r24 = r8
            r25 = r13
            r26 = r8
            r27 = r4
            r18 = r0
            java.lang.Object r1 = r5.m1599executeJarvisRequestWithFof5HsY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r1 != r3) goto L29
            return r3
        Lad:
            com.facebook.aura.pairs.PairsRepository$updateSpaceCollaborators$1 r4 = new com.facebook.aura.pairs.PairsRepository$updateSpaceCollaborators$1
            r4.<init>(r5)
            goto L16
        Lb4:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.IllegalArgumentException -> Lc5
            int r0 = com.facebook.aura.pairs.SpaceCollaboratorsJson.$stable     // Catch: java.lang.IllegalArgumentException -> Lc5
            com.facebook.aura.pairs.SpaceCollaboratorsJson$$serializer r0 = com.facebook.aura.pairs.SpaceCollaboratorsJson$$serializer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> Lc5
            java.lang.Object r0 = r1.A01(r0, r2)     // Catch: java.lang.IllegalArgumentException -> Lc5
            com.facebook.aura.pairs.SpaceCollaboratorsJson r0 = (com.facebook.aura.pairs.SpaceCollaboratorsJson) r0
            com.facebook.aura.pairs.SpaceCollaborators r3 = com.facebook.aura.pairs.SpaceCollaboratorsKt.toDomain(r0)
            return r3
        Lc5:
            com.facebook.aura.pairs.PairsException r0 = X.C60R.A0T()
            throw r0
        Lca:
            java.lang.Throwable r0 = com.facebook.aura.pairs.PairsRepositoryKt.toPairsException(r0, r2)
            throw r0
        Lcf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.updateSpaceCollaborators(java.lang.String, com.facebook.aura.pairs.SpaceCollaboratorsUpdateJson, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object viewerProfile(X.HtJ<? super com.facebook.aura.pairs.SpaceViewerProfileJson> r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.pairs.PairsRepository.C129901
            if (r0 == 0) goto L52
            r12 = r14
            com.facebook.aura.pairs.PairsRepository$viewerProfile$1 r12 = (com.facebook.aura.pairs.PairsRepository.C129901) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L58
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L21:
            java.lang.Throwable r1 = X.HsJ.A00(r0)
            if (r1 == 0) goto L2c
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L5c
            r0 = 0
        L2c:
            return r0
        L2d:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            com.facebook.aura.network.api.StefiHatchPath$ViewerProfile r6 = com.facebook.aura.network.api.StefiHatchPath.ViewerProfile.INSTANCE
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsRepository$viewerProfile$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.pairs.PairsRepository$viewerProfile$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.label = r0
            r9 = r8
            r11 = r10
            java.lang.Object r0 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L21
            return r2
        L52:
            com.facebook.aura.pairs.PairsRepository$viewerProfile$1 r12 = new com.facebook.aura.pairs.PairsRepository$viewerProfile$1
            r12.<init>(r14)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L5c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.viewerProfile(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final PairsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (PairsRepository) abstractC3358CGz.A03(PairsRepository.class, new PairsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PairsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.linkLock = C3cG.A0T();
        this.linkFragments = new HashMap<>();
        this.stagedAcceptLinks = C3cG.A0j();
        this.heldInvites = C3cG.A0h();
        this.connectionIds = new HashMap<>();
        this.connectionNameCache = C60O.A1C();
        C9286GCn c9286GCnA14 = C3cG.A14(0);
        this._invalidations = c9286GCnA14;
        C3Pi c3PiA11 = C3cG.A11(c9286GCnA14);
        this.invalidations = c3PiA11;
        this.changes = AbstractC05633ui.A01(new PairsRepository$special$$inlined$map$1(c3PiA11), new PairsRepository$special$$inlined$map$3(new PairsRepository$special$$inlined$filter$1(new AnonymousClass602(GDB.A01(new PairsRepository$special$$inlined$map$2(C60O.A05(abstractC3358CGz).connectionState)), 0))));
        this.imageCache = new LruCache<>(64);
        this.pendingLevels = new PairsPendingLevelStore(abstractC3358CGz);
        this.mintedInvites = new PairsMintedInviteStore(abstractC3358CGz);
        this.pendingShares = new PairsPendingShareStore(abstractC3358CGz);
        this.detailFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        this.imageLoads = C60O.A1C();
        this.backgroundScope = C78W.A03();
        this.receiverConfirmations = C60O.A13();
        this.acceptedRequests = C60O.A13();
        this.receiverCodes = new HashMap<>();
        this.guidanceSaves = new HashMap<>();
    }

    private final /* synthetic */ <T> T decode(Object obj, String str) throws Throwable {
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 != null) {
            throw PairsRepositoryKt.toPairsException(thA00, str);
        }
        C60R.A1G(obj);
        try {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            throw C60R.A0T();
        }
    }

    private final /* synthetic */ <T> List<T> decodeEach(List<? extends JsonElement> list, String str) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<? extends JsonElement> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            try {
                C7384Etj.A0Q();
                throw F60.createAndThrow();
            } catch (Throwable unused) {
            }
        }
        if (arrayListA0h.size() < list.size()) {
            C60R.A1H(Integer.valueOf(list.size() - arrayListA0h.size()), str);
        }
        return arrayListA0h;
    }

    private final /* synthetic */ <T> T decodeSharedGoal(Object obj) throws Throwable {
        NetworkException networkException;
        Throwable thA00 = HsJ.A00(obj);
        Integer numValueOf = null;
        if (thA00 == null) {
            C60R.A1G(obj);
            try {
                C7384Etj.A0Q();
                throw F60.createAndThrow();
            } catch (IllegalArgumentException unused) {
                throw new SharedGoalException(null);
            }
        }
        if (thA00 instanceof CancellationException) {
            throw thA00;
        }
        if ((thA00 instanceof NetworkException) && (networkException = (NetworkException) thA00) != null) {
            numValueOf = Integer.valueOf(networkException.httpResponseCode);
        }
        throw new SharedGoalException(numValueOf);
    }

    private final PeersPath sharedGoalPath(String str, String str2) {
        return new PeersPath(FGI.A0d("api/peer-goals/", Uri.encode(str), CustomConnectorRegisterRepositoryKt.ROOT_PATH, Uri.encode(str2)));
    }

    private final /* synthetic */ <Q, T> Object write(JarvisPath jarvisPath, Q q, RequestType requestType, Long l, String str, HtJ<? super T> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    public static /* synthetic */ Object write$default(PairsRepository pairsRepository, JarvisPath jarvisPath, Object obj, RequestType requestType, Long l, String str, HtJ htJ, int i, Object obj2) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    public final void setPendingLevel(String str, PairsLevel pairsLevel, long j) {
        AnonymousClass003.A0u(str, pairsLevel);
        this.pendingLevels.set(pairsLevel, str, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000f, B:11:0x001a, B:12:0x001d, B:14:0x0027, B:15:0x0032, B:17:0x0038, B:19:0x0045, B:21:0x004b, B:23:0x004f, B:24:0x0055, B:25:0x0059, B:27:0x005f), top: B:36:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070 A[EDGE_INSN: B:38:0x0070->B:31:0x0070 BREAK  A[LOOP:0: B:12:0x001d->B:23:0x004f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String stageAcceptLink(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r5 = X.AnonymousClass002.A0k()
            java.lang.Object r4 = r8.linkLock
            monitor-enter(r4)
            r8.scopeLinksToCurrentVm()     // Catch: java.lang.Throwable -> L72
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r8.stagedAcceptLinks     // Catch: java.lang.Throwable -> L72
            r7 = 0
            if (r9 == 0) goto L18
            boolean r0 = com.facebook.aura.pairs.PairsRepositoryKt.isValidFragment(r9)     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L16
            r9 = r7
        L16:
            if (r9 != 0) goto L1a
        L18:
            java.lang.String r9 = ""
        L1a:
            r1.put(r5, r9)     // Catch: java.lang.Throwable -> L72
        L1d:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r2 = r8.stagedAcceptLinks     // Catch: java.lang.Throwable -> L72
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L72
            r0 = 16
            if (r1 <= r0) goto L70
            java.util.Set r0 = r2.keySet()     // Catch: java.lang.Throwable -> L72
            X.C7384Etj.A0U(r0)     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L72
        L32:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L6e
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L72
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList<com.facebook.aura.pairs.PairsHeldInvite> r1 = r8.heldInvites     // Catch: java.lang.Throwable -> L72
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L55
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L55
        L4b:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L70
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r8.stagedAcceptLinks     // Catch: java.lang.Throwable -> L72
            r0.remove(r3)     // Catch: java.lang.Throwable -> L72
            goto L1d
        L55:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L72
        L59:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L72
            com.facebook.aura.pairs.PairsHeldInvite r0 = (com.facebook.aura.pairs.PairsHeldInvite) r0     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r0.token     // Catch: java.lang.Throwable -> L72
            boolean r0 = X.C7384Etj.areEqual(r0, r2)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L59
            goto L32
        L6e:
            r3 = r7
            goto L4b
        L70:
            monitor-exit(r4)
            return r5
        L72:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository.stageAcceptLink(java.lang.String):java.lang.String");
    }

    public /* synthetic */ PairsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
