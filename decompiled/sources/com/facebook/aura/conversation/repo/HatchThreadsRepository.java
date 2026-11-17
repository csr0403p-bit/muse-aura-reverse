package com.facebook.aura.conversation.repo;

import X.AGH;
import X.AHD;
import X.AHI;
import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C10571Hud;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C78T;
import X.C78W;
import X.C79;
import X.C7BY;
import X.C9258GBl;
import X.C9290GCr;
import X.C9jH;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.HzS;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.components.reactions.AuraMicroLaunchKt;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.conversation.repo.SessionRefreshResult;
import com.facebook.aura.conversation.unread.HatchUnreadThreadsRepository;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.gateway.HatchSessionUpdate;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchThreadsRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _activeHasMore;
    public final BLG<LoadingState> _activeLoadingState;
    public final BLG<AHD<HatchSessionItem>> _activeSessions;
    public final BLG<Boolean> _archivedHasMore;
    public final BLG<LoadingState> _archivedLoadingState;
    public final BLG<AHD<HatchSessionItem>> _archivedSessions;
    public final C3Em<String> _sessionDeletedEvents;
    public String activeCursor;
    public final InterfaceC2261BLa activePagingMutex;
    public String archivedCursor;
    public final InterfaceC2261BLa archivedPagingMutex;
    public final C3UX scope;
    public final C22I<String> sessionDeletedEvents;
    public final HatchUnreadThreadsRepository unreadThreadsRepository;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository$archiveSession$2", f = "HatchThreadsRepository.kt", l = {AuraMicroLaunchKt.MICRO_LAUNCH_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$archiveSession$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ArchiveSessionResult>, Object> {
        public final /* synthetic */ String $sessionId;
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
        public final /* synthetic */ HatchThreadsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HatchThreadsRepository hatchThreadsRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$sessionId = str;
            this.this$0 = hatchThreadsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$sessionId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                JarvisPath.SessionArchive sessionArchive = JarvisPath.SessionArchive.INSTANCE;
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchThreadsRepository$archiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchThreadsRepository$archiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchThreadsRepository$archiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchThreadsRepository$archiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchThreadsRepository$archiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchThreadsRepository$archiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
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
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApiA06.m1599executeJarvisRequestWithFof5HsY(hatchThreadsRepository$archiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchThreadsRepository$archiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, sessionArchive, new ArchiveSessionRequestJson(FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sessionArchive.getValue()), this.$sessionId), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            Object obj2 = null;
            if (thA00 != null) {
                if ((thA00 instanceof NetworkException) && (networkException = (NetworkException) thA00) != null) {
                    obj2 = networkException.errorCode;
                }
                return HatchThreadsRepositoryKt.VOICE_CALL_ACTIVE_ERROR_CODE.equals(obj2) ? ArchiveSessionResult.VOICE_CALL_ACTIVE : ArchiveSessionResult.FAILED;
            }
            Iterable iterableA0j = C60O.A0j(this.this$0._activeSessions);
            String str = this.$sessionId;
            Iterator it = iterableA0j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C7384Etj.areEqual(((HatchSessionItem) next).sessionId, str)) {
                    obj2 = next;
                    break;
                }
            }
            HatchSessionItem hatchSessionItem = (HatchSessionItem) obj2;
            BLG<AHD<HatchSessionItem>> blg = this.this$0._activeSessions;
            Iterable iterableA0j2 = C60O.A0j(blg);
            String str2 = this.$sessionId;
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj3 : iterableA0j2) {
                AnonymousClass006.A1O(((HatchSessionItem) obj3).sessionId, str2, obj3, arrayListA0h);
            }
            C60O.A1L(arrayListA0h, blg);
            if (hatchSessionItem != null) {
                HatchThreadsRepository hatchThreadsRepository = this.this$0;
                C60O.A1L(hatchThreadsRepository.sortedForView(AbstractC0878AGe.A0P(C60O.A0j(this.this$0._archivedSessions), Collections.singletonList(C60R.A0M(hatchSessionItem, 7935))), ThreadsView.ARCHIVED), hatchThreadsRepository._archivedSessions);
            }
            return ArchiveSessionResult.SUCCESS;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ArchiveSessionResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository$deleteSession$2", f = "HatchThreadsRepository.kt", l = {393, 395, 397, 398}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$deleteSession$2, reason: invalid class name and case insensitive filesystem */
    public final class C113862 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $sessionId;
        public int I$0;
        public int I$1;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113862(String str, HtJ<? super C113862> htJ) {
            super(2, htJ);
            this.$sessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchThreadsRepository.this.new C113862(this.$sessionId, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:9:0x001e). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchThreadsRepository.C113862.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C113862) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository", f = "HatchThreadsRepository.kt", l = {337}, m = "fetchReadSessionIds", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchReadSessionIds$1, reason: invalid class name */
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
            return HatchThreadsRepository.this.fetchReadSessionIds(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchSessions$2", f = "HatchThreadsRepository.kt", l = {688}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchSessions$2, reason: invalid class name and case insensitive filesystem */
    public final class C113872 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SessionsPage>, Object> {
        public final /* synthetic */ String $cursor;
        public final /* synthetic */ ThreadsView $view;
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
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113872(ThreadsView threadsView, String str, HtJ<? super C113872> htJ) {
            super(2, htJ);
            this.$view = threadsView;
            this.$cursor = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchThreadsRepository.this.new C113872(this.$view, this.$cursor, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ThreadsView threadsView = this.$view;
                String str = this.$cursor;
                AII aiiA17 = AIM.A17();
                AnonymousClass002.A1J(PhotosSearchHandlerKt.PARAM_LIMIT, C3cG.A0R(20), aiiA17);
                AnonymousClass002.A1J("view", threadsView == ThreadsView.ARCHIVED ? "archived" : HatchOfflineConversationRepository.THREAD_STATUS_ACTIVE, aiiA17);
                if (str != null && !C7BY.A0j(str)) {
                    AnonymousClass002.A1J("cursor", str, aiiA17);
                }
                HxE[] hxEArr = (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                JarvisPath.SessionList sessionList = JarvisPath.SessionList.INSTANCE;
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = HatchThreadsRepository.this.userSession;
                HxE<String, ? extends Object>[] hxEArrA1a = C60O.A1a(hxEArr);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchThreadsRepository$fetchSessions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchThreadsRepository$fetchSessions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchThreadsRepository$fetchSessions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchThreadsRepository$fetchSessions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, sessionList, requestType, abstractC3358CGz, null, hxEArrA1a, null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = null;
            }
            SessionsPayloadJson sessionsPayloadJson = (SessionsPayloadJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (sessionsPayloadJson != null) {
                return sessionsPayloadJson.toPage();
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SessionsPage> htJ) {
            return ((C113872) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository", f = "HatchThreadsRepository.kt", l = {676, 246}, m = "loadMore", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$loadMore$1, reason: invalid class name and case insensitive filesystem */
    public final class C113881 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C113881(HtJ<? super C113881> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchThreadsRepository.this.loadMore(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository", f = "HatchThreadsRepository.kt", l = {564}, m = "markThreadAsSeen", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$markThreadAsSeen$1, reason: invalid class name and case insensitive filesystem */
    public final class C113891 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113891(HtJ<? super C113891> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchThreadsRepository.this.markThreadAsSeen(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository$markThreadAsSeen$3", f = "HatchThreadsRepository.kt", l = {686}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$markThreadAsSeen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $sessionId;
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
        public int label;
        public final /* synthetic */ HatchThreadsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, HatchThreadsRepository hatchThreadsRepository, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$sessionId = str;
            this.this$0 = hatchThreadsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$sessionId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            Boolean bool;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchThreadsRepository$markThreadAsSeen$3$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchThreadsRepository$markThreadAsSeen$3$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchThreadsRepository$markThreadAsSeen$3$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = C60O.A06(obj).m1595executeBodylessJarvisRequestWithp3iPjrY(hatchThreadsRepository$markThreadAsSeen$3$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, new JarvisPath.ChatSeen(this.$sessionId), RequestType.POST, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = null;
            }
            MarkThreadAsSeenPayloadJson markThreadAsSeenPayloadJson = (MarkThreadAsSeenPayloadJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (markThreadAsSeenPayloadJson == null || (bool = markThreadAsSeenPayloadJson.has_unread_threads) == null) {
                return null;
            }
            this.this$0.unreadThreadsRepository.updateHasUnreadThreads(bool.booleanValue());
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository$pinSession$2", f = "HatchThreadsRepository.kt", l = {AuraMicroLaunchKt.MICRO_LAUNCH_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$pinSession$2, reason: invalid class name and case insensitive filesystem */
    public final class C113902 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $sessionId;
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
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113902(String str, HtJ<? super C113902> htJ) {
            super(2, htJ);
            this.$sessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchThreadsRepository.this.new C113902(this.$sessionId, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                value = HatchThreadsRepository.this._activeSessions.getValue();
                HatchThreadsRepository.this.moveActiveSessionToTop(this.$sessionId);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                JarvisPath.SessionPin sessionPin = JarvisPath.SessionPin.INSTANCE;
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchThreadsRepository$pinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchThreadsRepository$pinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchThreadsRepository$pinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchThreadsRepository$pinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchThreadsRepository$pinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchThreadsRepository$pinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = value;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(hatchThreadsRepository$pinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchThreadsRepository$pinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, sessionPin, new PinSessionRequestJson(FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sessionPin.getValue()), this.$sessionId), RequestType.POST, HatchThreadsRepository.this.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                value = this.L$0;
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            if (!(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud)) {
                return true;
            }
            HatchThreadsRepository.this._activeSessions.Af8(value);
            return false;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C113902) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository", f = "HatchThreadsRepository.kt", l = {676, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C113911 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C113911(HtJ<? super C113911> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchThreadsRepository.this.refresh(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository$refreshSession$2", f = "HatchThreadsRepository.kt", l = {281}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$refreshSession$2, reason: invalid class name and case insensitive filesystem */
    public final class C113922 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SessionRefreshResult>, Object> {
        public final /* synthetic */ String $sessionId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113922(String str, HtJ<? super C113922> htJ) {
            super(2, htJ);
            this.$sessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchThreadsRepository.this.new C113922(this.$sessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM498fetchSessionDetailsgIAlus;
            HatchThreadsRepository hatchThreadsRepository;
            BLG<AHD<HatchSessionItem>> blg;
            List listA17;
            ThreadsView threadsView;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsRepository hatchThreadsRepository2 = HatchThreadsRepository.this;
                String str = this.$sessionId;
                this.label = 1;
                objM498fetchSessionDetailsgIAlus = hatchThreadsRepository2.m498fetchSessionDetailsgIAlus(str, this);
                if (objM498fetchSessionDetailsgIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM498fetchSessionDetailsgIAlus = AnonymousClass001.A0q(obj);
            }
            Throwable thA00 = HsJ.A00(objM498fetchSessionDetailsgIAlus);
            if ((thA00 instanceof NetworkException) && (networkException = (NetworkException) thA00) != null && networkException.httpResponseCode == 404) {
                HatchThreadsRepository.this.removeSessionFromLists(this.$sessionId);
                return SessionRefreshResult.NotFound.INSTANCE;
            }
            if (objM498fetchSessionDetailsgIAlus instanceof C10571Hud) {
                objM498fetchSessionDetailsgIAlus = null;
            }
            SessionDetails sessionDetails = (SessionDetails) objM498fetchSessionDetailsgIAlus;
            if (sessionDetails == null) {
                return SessionRefreshResult.Failed.INSTANCE;
            }
            HatchSessionItem hatchSessionItem = sessionDetails.session;
            if (!hatchSessionItem.getAppearsInThreadList()) {
                HatchThreadsRepository.this.removeSessionFromLists(hatchSessionItem.sessionId);
                return new SessionRefreshResult.Found(hatchSessionItem);
            }
            boolean z = sessionDetails.archived;
            HatchThreadsRepository hatchThreadsRepository3 = HatchThreadsRepository.this;
            if (z) {
                BLG<AHD<HatchSessionItem>> blg2 = hatchThreadsRepository3._activeSessions;
                C60O.A1L(hatchThreadsRepository3.filterNotSession(C60O.A17(blg2), hatchSessionItem.sessionId), blg2);
                hatchThreadsRepository = HatchThreadsRepository.this;
                blg = hatchThreadsRepository._archivedSessions;
                listA17 = C60O.A17(blg);
                threadsView = ThreadsView.ARCHIVED;
            } else {
                BLG<AHD<HatchSessionItem>> blg3 = hatchThreadsRepository3._archivedSessions;
                C60O.A1L(hatchThreadsRepository3.filterNotSession(C60O.A17(blg3), hatchSessionItem.sessionId), blg3);
                hatchThreadsRepository = HatchThreadsRepository.this;
                blg = hatchThreadsRepository._activeSessions;
                listA17 = C60O.A17(blg);
                threadsView = ThreadsView.ACTIVE;
            }
            C60O.A1L(hatchThreadsRepository.upsertForView(listA17, hatchSessionItem, threadsView), blg);
            return new SessionRefreshResult.Found(hatchSessionItem);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SessionRefreshResult> htJ) {
            return ((C113922) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository$renameSession$2", f = "HatchThreadsRepository.kt", l = {AuraMicroLaunchKt.MICRO_LAUNCH_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$renameSession$2, reason: invalid class name and case insensitive filesystem */
    public final class C113932 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super RenameSessionResult>, Object> {
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ String $title;
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
        public final /* synthetic */ HatchThreadsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113932(String str, String str2, HatchThreadsRepository hatchThreadsRepository, HtJ<? super C113932> htJ) {
            super(2, htJ);
            this.$sessionId = str;
            this.$title = str2;
            this.this$0 = hatchThreadsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C113932(this.$sessionId, this.$title, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                JarvisPath.SessionRename sessionRename = JarvisPath.SessionRename.INSTANCE;
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchThreadsRepository$renameSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchThreadsRepository$renameSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchThreadsRepository$renameSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchThreadsRepository$renameSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchThreadsRepository$renameSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchThreadsRepository$renameSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
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
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApiA06.m1599executeJarvisRequestWithFof5HsY(hatchThreadsRepository$renameSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchThreadsRepository$renameSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, sessionRename, new RenameSessionRequestJson(FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sessionRename.getValue()), this.$sessionId, this.$title), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                String message = thA00.getMessage();
                return (message == null || !C7BY.A0q(message, HatchThreadsRepositoryKt.TITLE_TOO_LONG_MESSAGE, true)) ? RenameSessionResult.FAILED : RenameSessionResult.TITLE_TOO_LONG;
            }
            BLG<AHD<HatchSessionItem>> blg = this.this$0._activeSessions;
            Iterable<HatchSessionItem> iterableA0j = C60O.A0j(blg);
            String str = this.$sessionId;
            String str2 = this.$title;
            ArrayList arrayListA0i = AnonymousClass003.A0i(iterableA0j);
            for (HatchSessionItem hatchSessionItemCopy$default : iterableA0j) {
                if (C7384Etj.areEqual(hatchSessionItemCopy$default.sessionId, str)) {
                    hatchSessionItemCopy$default = HatchSessionItem.copy$default(hatchSessionItemCopy$default, null, 0L, 0L, null, null, false, str2, 0, false, false, null, null, false, 8127, null);
                }
                arrayListA0i.add(hatchSessionItemCopy$default);
            }
            C60O.A1L(arrayListA0i, blg);
            return RenameSessionResult.SUCCESS;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super RenameSessionResult> htJ) {
            return ((C113932) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository$unarchiveSession$2", f = "HatchThreadsRepository.kt", l = {AuraMicroLaunchKt.MICRO_LAUNCH_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$unarchiveSession$2, reason: invalid class name and case insensitive filesystem */
    public final class C113942 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $sessionId;
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
        public final /* synthetic */ HatchThreadsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113942(String str, HatchThreadsRepository hatchThreadsRepository, HtJ<? super C113942> htJ) {
            super(2, htJ);
            this.$sessionId = str;
            this.this$0 = hatchThreadsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C113942(this.$sessionId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            Object next;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                JarvisPath.SessionUnarchive sessionUnarchive = JarvisPath.SessionUnarchive.INSTANCE;
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchThreadsRepository$unarchiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchThreadsRepository$unarchiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchThreadsRepository$unarchiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchThreadsRepository$unarchiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchThreadsRepository$unarchiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchThreadsRepository$unarchiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
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
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApiA06.m1599executeJarvisRequestWithFof5HsY(hatchThreadsRepository$unarchiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchThreadsRepository$unarchiveSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, sessionUnarchive, new UnarchiveSessionRequestJson(FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sessionUnarchive.getValue()), this.$sessionId), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            if (objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud) {
                return false;
            }
            Iterable iterableA0j = C60O.A0j(this.this$0._archivedSessions);
            String str = this.$sessionId;
            Iterator it = iterableA0j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(((HatchSessionItem) next).sessionId, str)) {
                    break;
                }
            }
            HatchSessionItem hatchSessionItem = (HatchSessionItem) next;
            BLG<AHD<HatchSessionItem>> blg = this.this$0._archivedSessions;
            Iterable iterableA0j2 = C60O.A0j(blg);
            String str2 = this.$sessionId;
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj2 : iterableA0j2) {
                AnonymousClass006.A1O(((HatchSessionItem) obj2).sessionId, str2, obj2, arrayListA0h);
            }
            C60O.A1L(arrayListA0h, blg);
            if (hatchSessionItem != null) {
                HatchThreadsRepository hatchThreadsRepository = this.this$0;
                BLG<AHD<HatchSessionItem>> blg2 = hatchThreadsRepository._activeSessions;
                C60O.A1L(hatchThreadsRepository.upsertForView(C60O.A17(blg2), hatchSessionItem, ThreadsView.ACTIVE), blg2);
            }
            return true;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C113942) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository$unpinSession$2", f = "HatchThreadsRepository.kt", l = {AuraMicroLaunchKt.MICRO_LAUNCH_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$unpinSession$2, reason: invalid class name and case insensitive filesystem */
    public final class C113952 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $sessionId;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113952(String str, HtJ<? super C113952> htJ) {
            super(2, htJ);
            this.$sessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchThreadsRepository.this.new C113952(this.$sessionId, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                value = HatchThreadsRepository.this._activeSessions.getValue();
                value2 = HatchThreadsRepository.this._archivedSessions.getValue();
                HatchThreadsRepository.this.moveSessionBelowPinned(this.$sessionId);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                JarvisPath.SessionUnpin sessionUnpin = JarvisPath.SessionUnpin.INSTANCE;
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchThreadsRepository$unpinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchThreadsRepository$unpinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchThreadsRepository$unpinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchThreadsRepository$unpinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchThreadsRepository$unpinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchThreadsRepository$unpinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = value;
                this.L$1 = value2;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(hatchThreadsRepository$unpinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchThreadsRepository$unpinSession$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, sessionUnpin, new UnpinSessionRequestJson(FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, sessionUnpin.getValue()), this.$sessionId), RequestType.POST, HatchThreadsRepository.this.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                value2 = this.L$1;
                value = this.L$0;
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            if (!(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud)) {
                return true;
            }
            HatchThreadsRepository.this._activeSessions.Af8(value);
            HatchThreadsRepository.this._archivedSessions.Af8(value2);
            return false;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C113952) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchThreadsRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        AHI ahi = AHI.A01;
        this._activeSessions = HnJ.A01(ahi);
        this._activeLoadingState = C3cG.A14(LoadingState.IDLE);
        Boolean boolA0i = AnonymousClass001.A0i();
        this._activeHasMore = C3cG.A14(boolA0i);
        this.activePagingMutex = new C9258GBl();
        this._archivedSessions = HnJ.A01(ahi);
        this._archivedLoadingState = C3cG.A14(LoadingState.IDLE);
        this._archivedHasMore = C3cG.A14(boolA0i);
        this.archivedPagingMutex = new C9258GBl();
        this.unreadThreadsRepository = HatchUnreadThreadsRepository.Companion.getInstance(abstractC3358CGz);
        this.scope = C78W.A03();
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 8);
        this._sessionDeletedEvents = c9290GCrA12;
        this.sessionDeletedEvents = C3pd.A00(c9290GCrA12);
    }

    public final void applySessionUpdate(HatchSessionUpdate hatchSessionUpdate) {
        BLG<AHD<HatchSessionItem>> blg;
        List<HatchSessionItem> listA17;
        ThreadsView threadsView;
        C7384Etj.A0Y(hatchSessionUpdate, 0);
        HatchSessionItem hatchSessionItem = hatchSessionUpdate.session;
        if (!hatchSessionItem.getAppearsInThreadList()) {
            removeSessionFromLists(hatchSessionItem.sessionId);
            return;
        }
        if (hatchSessionUpdate.archived) {
            BLG<AHD<HatchSessionItem>> blg2 = this._activeSessions;
            C60O.A1L(filterNotSession(C60O.A17(blg2), hatchSessionItem.sessionId), blg2);
            blg = this._archivedSessions;
            listA17 = C60O.A17(blg);
            threadsView = ThreadsView.ARCHIVED;
        } else {
            BLG<AHD<HatchSessionItem>> blg3 = this._archivedSessions;
            C60O.A1L(filterNotSession(C60O.A17(blg3), hatchSessionItem.sessionId), blg3);
            blg = this._activeSessions;
            listA17 = C60O.A17(blg);
            threadsView = ThreadsView.ACTIVE;
        }
        C60O.A1L(upsertForView(listA17, hatchSessionItem, threadsView), blg);
    }

    public final C1BN<Boolean> hasMore(ThreadsView threadsView) {
        BLG<Boolean> blg;
        int iA0E = AnonymousClass001.A0E(threadsView, 0);
        if (iA0E == 0) {
            blg = this._activeHasMore;
        } else {
            if (iA0E != 1) {
                throw C3cG.A0q();
            }
            blg = this._archivedHasMore;
        }
        return C3Pi.A00(blg);
    }

    public final C1BN<LoadingState> loadingState(ThreadsView threadsView) {
        BLG<LoadingState> blg;
        int iA0E = AnonymousClass001.A0E(threadsView, 0);
        if (iA0E == 0) {
            blg = this._activeLoadingState;
        } else {
            if (iA0E != 1) {
                throw C3cG.A0q();
            }
            blg = this._archivedLoadingState;
        }
        return C3Pi.A00(blg);
    }

    public final C1BN<AHD<HatchSessionItem>> sessions(ThreadsView threadsView) {
        BLG<AHD<HatchSessionItem>> blg;
        int iA0E = AnonymousClass001.A0E(threadsView, 0);
        if (iA0E == 0) {
            blg = this._activeSessions;
        } else {
            if (iA0E != 1) {
                throw C3cG.A0q();
            }
            blg = this._archivedSessions;
        }
        return C3Pi.A00(blg);
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThreadsView.values().length];
            try {
                AnonymousClass002.A13(ThreadsView.ACTIVE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ThreadsView.ARCHIVED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* renamed from: fetchSessionDetails-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m498fetchSessionDetailsgIAlus(java.lang.String r19, X.HtJ<? super X.HsJ<com.facebook.aura.conversation.repo.SessionDetails>> r20) {
        /*
            r18 = this;
            r2 = r19
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchSessionDetails$1
            r6 = r18
            if (r0 == 0) goto L7c
            r4 = r5
            com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchSessionDetails$1 r4 = (com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchSessionDetails$1) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L7c
            int r3 = r3 - r1
            r4.label = r3
        L18:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r15 = 1
            if (r0 == 0) goto L38
            if (r0 != r15) goto L82
            java.lang.Object r2 = r4.L$0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L2b:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L37
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            com.facebook.aura.conversation.repo.SessionDetails r1 = com.facebook.aura.conversation.repo.HatchThreadsRepositoryJsonKt.parseSessionDetailsPayload(r1, r2)
        L37:
            return r1
        L38:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$SessionDetails r8 = new com.facebook.aura.network.api.JarvisPath$SessionDetails
            r8.<init>(r2)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r10 = r6.userSession
            r7 = 0
            X.HxE[] r12 = new X.HxE[r7]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchSessionDetails-gIAlu-s$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchSessionDetailsgIAlus$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r4.L$0 = r2
            r11 = 0
            r4.L$1 = r11
            r4.L$2 = r11
            r4.L$3 = r11
            r4.L$4 = r11
            r4.L$5 = r11
            r4.L$6 = r11
            r4.L$7 = r11
            r4.I$0 = r15
            r4.I$1 = r15
            r4.I$2 = r7
            r4.label = r15
            r13 = r11
            r17 = r15
            r18 = r11
            r19 = r7
            r20 = r4
            java.lang.Object r1 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r1 != r3) goto L2b
            return r3
        L7c:
            com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchSessionDetails$1 r4 = new com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchSessionDetails$1
            r4.<init>(r6, r5)
            goto L18
        L82:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchThreadsRepository.m498fetchSessionDetailsgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final boolean isRecencyOrdered(HatchSessionItem hatchSessionItem) {
        return !hatchSessionItem.isPinned && hatchSessionItem.rawChannel == null;
    }

    private final List<HatchSessionItem> keptBelowPageOne(List<HatchSessionItem> list, List<HatchSessionItem> list2, SessionsPage sessionsPage, Set<String> set, Long l) {
        Object next;
        if (sessionsPage.nextCursor != null && l != null) {
            List<HatchSessionItem> list3 = sessionsPage.sessions;
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchSessionItem hatchSessionItem : list3) {
                HatchSessionItem hatchSessionItem2 = hatchSessionItem;
                if (isRecencyOrdered(hatchSessionItem2) && hatchSessionItem2.getAppearsInThreadList()) {
                    arrayListA0h.add(hatchSessionItem);
                }
            }
            Iterator it = arrayListA0h.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long j = ((HatchSessionItem) next).updatedAt;
                    do {
                        Object next2 = it.next();
                        long j2 = ((HatchSessionItem) next2).updatedAt;
                        if (j > j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            HatchSessionItem hatchSessionItem3 = (HatchSessionItem) next;
            if (hatchSessionItem3 != null && (!(list instanceof Collection) || !list.isEmpty())) {
                Iterator<HatchSessionItem> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    HatchSessionItem next3 = it2.next();
                    if (C7384Etj.areEqual(next3.sessionId, hatchSessionItem3.sessionId) && next3.updatedAt == hatchSessionItem3.updatedAt) {
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (HatchSessionItem hatchSessionItem4 : list2) {
                                if (isRecencyOrdered(hatchSessionItem4) || set.contains(hatchSessionItem4.sessionId)) {
                                }
                            }
                        }
                        ArrayList arrayListA0h2 = C3cG.A0h();
                        for (HatchSessionItem hatchSessionItem5 : list) {
                            HatchSessionItem hatchSessionItem6 = hatchSessionItem5;
                            if (!set.contains(hatchSessionItem6.sessionId) && hatchSessionItem6.updatedAt <= l.longValue()) {
                                arrayListA0h2.add(hatchSessionItem5);
                            }
                        }
                        return arrayListA0h2;
                    }
                }
            }
        }
        return C0881AGi.A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveActiveSessionToTop(String str) {
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(this._activeSessions.getValue());
        Iterator it = arrayListA0R.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C7384Etj.areEqual(((HatchSessionItem) it.next()).sessionId, str)) {
                if (i != -1) {
                    arrayListA0R.add(0, HatchSessionItem.copy$default((HatchSessionItem) arrayListA0R.remove(i), null, 0L, 0L, null, null, false, null, 0, true, false, null, null, false, 7935, null));
                    C60O.A1L(arrayListA0R, this._activeSessions);
                    return;
                }
                return;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSessionBelowPinned(String str) {
        BLG<AHD<HatchSessionItem>> blg = this._activeSessions;
        C60O.A1L(moveBelowPinned(C60O.A17(blg), str), blg);
        BLG<AHD<HatchSessionItem>> blg2 = this._archivedSessions;
        C60O.A1L(moveBelowPinned(C60O.A17(blg2), str), blg2);
    }

    private final void reconcileHasUnreadThreads(boolean z) {
        Iterable iterableA0j = C60O.A0j(this._activeSessions);
        boolean z2 = false;
        if (!(iterableA0j instanceof Collection) || !C3cG.A1N(iterableA0j)) {
            Iterator it = iterableA0j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((HatchSessionItem) it.next()).unreadCount > 0) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z || z2) {
            this.unreadThreadsRepository.updateHasUnreadThreads(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSessionFromLists(String str) {
        BLG<AHD<HatchSessionItem>> blg = this._activeSessions;
        C60O.A1L(filterNotSession(C60O.A17(blg), str), blg);
        BLG<AHD<HatchSessionItem>> blg2 = this._archivedSessions;
        C60O.A1L(filterNotSession(C60O.A17(blg2), str), blg2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* renamed from: requestSessionDelete-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m499requestSessionDeletegIAlus(java.lang.String r26, X.HtJ<? super X.HsJ<kotlin.Unit>> r27) {
        /*
            r25 = this;
            r5 = r27
            boolean r0 = r5 instanceof com.facebook.aura.conversation.repo.HatchThreadsRepository$requestSessionDelete$1
            r4 = r25
            if (r0 == 0) goto L8f
            r2 = r5
            com.facebook.aura.conversation.repo.HatchThreadsRepository$requestSessionDelete$1 r2 = (com.facebook.aura.conversation.repo.HatchThreadsRepository$requestSessionDelete$1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L8f
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r3 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r8 = 1
            if (r0 == 0) goto L26
            if (r0 != r8) goto L95
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L25:
            return r1
        L26:
            com.facebook.aura.network.http.HatchHttpApi r5 = X.C60O.A06(r3)
            com.facebook.aura.network.api.JarvisPath$SessionDelete r9 = com.facebook.aura.network.api.JarvisPath.SessionDelete.INSTANCE
            java.lang.String r3 = r9.getValue()
            java.lang.String r0 = "/"
            java.lang.String r0 = X.FGI.A0M(r0, r3)
            com.facebook.aura.conversation.repo.DeleteSessionRequestJson r10 = new com.facebook.aura.conversation.repo.DeleteSessionRequestJson
            r3 = r26
            r10.<init>(r0, r3)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r12 = r4.userSession
            r0 = 0
            X.HxE[] r15 = new X.HxE[r0]
            java.util.Set r16 = X.AnonymousClass004.A18()
            X.9jH r19 = X.AGH.A0E()
            com.facebook.aura.conversation.repo.HatchThreadsRepository$requestSessionDelete-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$1 r6 = com.facebook.aura.conversation.repo.HatchThreadsRepository$requestSessionDeletegIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.conversation.repo.HatchThreadsRepository$requestSessionDelete-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$2 r7 = com.facebook.aura.conversation.repo.HatchThreadsRepository$requestSessionDeletegIAlus$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r13 = 0
            r2.L$0 = r13
            r2.L$1 = r13
            r2.L$2 = r13
            r2.L$3 = r13
            r2.L$4 = r13
            r2.L$5 = r13
            r2.L$6 = r13
            r2.L$7 = r13
            r2.L$8 = r13
            r2.I$0 = r8
            r2.I$1 = r8
            r2.I$2 = r0
            r2.I$3 = r8
            r2.I$4 = r0
            r2.I$5 = r0
            r2.I$6 = r0
            r2.label = r8
            r14 = r13
            r17 = r8
            r18 = r8
            r20 = r13
            r21 = r0
            r22 = r8
            r23 = r0
            r24 = r0
            r25 = r13
            r26 = r0
            r27 = r2
            java.lang.Object r0 = r5.m1599executeJarvisRequestWithFof5HsY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r0 == r1) goto L25
            return r0
        L8f:
            com.facebook.aura.conversation.repo.HatchThreadsRepository$requestSessionDelete$1 r2 = new com.facebook.aura.conversation.repo.HatchThreadsRepository$requestSessionDelete$1
            r2.<init>(r4, r5)
            goto L16
        L95:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchThreadsRepository.m499requestSessionDeletegIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final List<HatchSessionItem> sortedForList(List<HatchSessionItem> list) {
        return AbstractC0878AGe.A0c(list, HatchThreadsRepositoryKt.HatchSessionListComparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HatchSessionItem> upsertForView(List<HatchSessionItem> list, HatchSessionItem hatchSessionItem, ThreadsView threadsView) {
        if (threadsView == ThreadsView.ARCHIVED) {
            hatchSessionItem = C60R.A0M(hatchSessionItem, 7935);
        }
        return sortedForView(AbstractC0878AGe.A0P(filterNotSession(list, hatchSessionItem.sessionId), Collections.singletonList(hatchSessionItem)), threadsView);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        C78T c78tAEA = this.scope.AEA();
        Boolean boolA0i = AnonymousClass001.A0i();
        HzS.A04(c78tAEA);
        BLG<AHD<HatchSessionItem>> blg = this._activeSessions;
        AHI ahi = AHI.A01;
        blg.Af8(ahi);
        this._archivedSessions.Af8(ahi);
        this.activeCursor = null;
        this.archivedCursor = null;
        AnonymousClass001.A1E(this._activeHasMore, null, boolA0i);
        AnonymousClass001.A1E(this._archivedHasMore, null, boolA0i);
        this.unreadThreadsRepository.clearUserData();
    }

    public final Object deleteSession(String str, HtJ<? super Boolean> htJ) {
        return AnonymousClass001.A10(new C113862(str, null), this.scope).A0E(htJ);
    }

    public final Object fetchHasUnreadThreads(HtJ<? super Boolean> htJ) {
        return this.unreadThreadsRepository.fetchHasUnreadThreads(htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Hji] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchReadSessionIds(X.HtJ<? super java.util.Set<java.lang.String>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.conversation.repo.HatchThreadsRepository.AnonymousClass1
            if (r0 == 0) goto L74
            r5 = r7
            com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchReadSessionIds$1 r5 = (com.facebook.aura.conversation.repo.HatchThreadsRepository.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L66
            if (r0 != r1) goto L7d
            X.Hwg.A00(r4)
        L21:
            com.facebook.aura.conversation.repo.SessionsPage r4 = (com.facebook.aura.conversation.repo.SessionsPage) r4
            if (r4 == 0) goto L7a
            java.util.List<com.facebook.aura.gateway.HatchSessionItem> r0 = r4.sessions
            if (r0 == 0) goto L7a
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r3 = r0.iterator()
        L31:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.facebook.aura.gateway.HatchSessionItem r1 = (com.facebook.aura.gateway.HatchSessionItem) r1
            boolean r0 = r1.getAppearsInThreadList()
            if (r0 == 0) goto L31
            int r0 = r1.unreadCount
            if (r0 != 0) goto L31
            r4.add(r2)
            goto L31
        L4c:
            java.util.LinkedHashSet r3 = X.C3cG.A0k()
            java.util.Iterator r1 = r4.iterator()
        L54:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r1.next()
            com.facebook.aura.gateway.HatchSessionItem r0 = (com.facebook.aura.gateway.HatchSessionItem) r0
            java.lang.String r0 = r0.sessionId
            r3.add(r0)
            goto L54
        L66:
            X.Hwg.A00(r4)
            com.facebook.aura.conversation.repo.ThreadsView r0 = com.facebook.aura.conversation.repo.ThreadsView.ACTIVE
            r5.label = r1
            java.lang.Object r4 = r6.fetchSessions(r0, r2, r5)
            if (r4 != r3) goto L21
        L73:
            return r3
        L74:
            com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchReadSessionIds$1 r5 = new com.facebook.aura.conversation.repo.HatchThreadsRepository$fetchReadSessionIds$1
            r5.<init>(r7)
            goto L12
        L7a:
            X.A3q r3 = X.A3q.A00
            return r3
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchThreadsRepository.fetchReadSessionIds(X.HtJ):java.lang.Object");
    }

    public final C22I<String> getSessionDeletedEvents() {
        return this.sessionDeletedEvents;
    }

    public final C1BN<Boolean> hasUnreadThreads() {
        return C3Pi.A00(this.unreadThreadsRepository._hasUnreadThreads);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #1 {all -> 0x019d, blocks: (B:38:0x00d2, B:39:0x00d5, B:41:0x00d9, B:44:0x00e4, B:46:0x00e8, B:49:0x00f5, B:50:0x0102, B:52:0x0108, B:54:0x0115, B:55:0x0119, B:57:0x011d, B:58:0x0125, B:60:0x012b, B:62:0x0156, B:63:0x016c, B:65:0x0172, B:66:0x017f, B:68:0x018f, B:71:0x0194, B:72:0x0197, B:47:0x00ed), top: B:86:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4 A[Catch: all -> 0x019d, TRY_ENTER, TryCatch #1 {all -> 0x019d, blocks: (B:38:0x00d2, B:39:0x00d5, B:41:0x00d9, B:44:0x00e4, B:46:0x00e8, B:49:0x00f5, B:50:0x0102, B:52:0x0108, B:54:0x0115, B:55:0x0119, B:57:0x011d, B:58:0x0125, B:60:0x012b, B:62:0x0156, B:63:0x016c, B:65:0x0172, B:66:0x017f, B:68:0x018f, B:71:0x0194, B:72:0x0197, B:47:0x00ed), top: B:86:0x00d2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMore(com.facebook.aura.conversation.repo.ThreadsView r28, X.HtJ<? super kotlin.Unit> r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchThreadsRepository.loadMore(com.facebook.aura.conversation.repo.ThreadsView, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object markThreadAsSeen(java.lang.String r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.conversation.repo.HatchThreadsRepository.C113891
            if (r0 == 0) goto L6a
            r5 = r10
            com.facebook.aura.conversation.repo.HatchThreadsRepository$markThreadAsSeen$1 r5 = (com.facebook.aura.conversation.repo.HatchThreadsRepository.C113891) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r6 = 1
            if (r0 == 0) goto L23
            if (r0 != r6) goto L70
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.BLG<X.AHD<com.facebook.aura.gateway.HatchSessionItem>> r7 = r8._activeSessions
            java.lang.Iterable r0 = X.C60O.A0j(r7)
            java.util.ArrayList r3 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r2 = r0.iterator()
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r1 = r2.next()
            com.facebook.aura.gateway.HatchSessionItem r1 = (com.facebook.aura.gateway.HatchSessionItem) r1
            java.lang.String r0 = r1.sessionId
            boolean r0 = X.C7384Etj.areEqual(r0, r9)
            if (r0 == 0) goto L4e
            r0 = 8063(0x1f7f, float:1.1299E-41)
            com.facebook.aura.gateway.HatchSessionItem r1 = X.C60R.A0M(r1, r0)
        L4e:
            r3.add(r1)
            goto L34
        L52:
            X.C60O.A1L(r3, r7)
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.conversation.repo.HatchThreadsRepository$markThreadAsSeen$3 r0 = new com.facebook.aura.conversation.repo.HatchThreadsRepository$markThreadAsSeen$3
            r0.<init>(r9, r8, r1)
            r5.L$0 = r1
            r5.label = r6
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L6a:
            com.facebook.aura.conversation.repo.HatchThreadsRepository$markThreadAsSeen$1 r5 = new com.facebook.aura.conversation.repo.HatchThreadsRepository$markThreadAsSeen$1
            r5.<init>(r10)
            goto L12
        L70:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchThreadsRepository.markThreadAsSeen(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8 A[Catch: all -> 0x0216, TRY_ENTER, TryCatch #0 {all -> 0x0216, blocks: (B:37:0x00d7, B:40:0x00dd, B:41:0x00e2, B:44:0x00e8, B:45:0x00f2, B:47:0x00f8, B:49:0x0105, B:50:0x0109, B:52:0x010d, B:53:0x0115, B:55:0x011b, B:57:0x0146, B:58:0x0150, B:60:0x0156, B:62:0x0163, B:63:0x0167, B:72:0x0199, B:73:0x01a1, B:75:0x01a7, B:76:0x01b3, B:78:0x01ca, B:80:0x01ce, B:84:0x01da, B:81:0x01d3, B:85:0x01dd, B:87:0x01f1, B:90:0x0200, B:93:0x020d, B:94:0x0210, B:66:0x0173, B:67:0x017f, B:69:0x0185), top: B:102:0x00d7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(com.facebook.aura.conversation.repo.ThreadsView r29, X.HtJ<? super kotlin.Unit> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchThreadsRepository.refresh(com.facebook.aura.conversation.repo.ThreadsView, X.HtJ):java.lang.Object");
    }

    public final void updateHasUnreadThreads(boolean z) {
        this.unreadThreadsRepository.updateHasUnreadThreads(z);
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final HatchThreadsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchThreadsRepository) abstractC3358CGz.A03(HatchThreadsRepository.class, new HatchThreadsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchSessions(ThreadsView threadsView, String str, HtJ<? super SessionsPage> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113872(threadsView, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HatchSessionItem> filterNotSession(List<HatchSessionItem> list, String str) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchSessionItem hatchSessionItem : list) {
            AnonymousClass006.A1O(hatchSessionItem.sessionId, str, hatchSessionItem, arrayListA0h);
        }
        return arrayListA0h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isActiveMessageConflict(Object obj) {
        Throwable thA00 = HsJ.A00(obj);
        NetworkException networkException = thA00 instanceof NetworkException ? (NetworkException) thA00 : null;
        return networkException != null && networkException.httpResponseCode == 409 && "conflict".equals(networkException.errorCode);
    }

    private final List<HatchSessionItem> moveBelowPinned(List<HatchSessionItem> list, String str) {
        HatchSessionItem next;
        Iterator<HatchSessionItem> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.sessionId, str)) {
                break;
            }
        }
        HatchSessionItem hatchSessionItem = next;
        if (hatchSessionItem == null) {
            return list;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchSessionItem hatchSessionItem2 : list) {
            AnonymousClass006.A1O(hatchSessionItem2.sessionId, str, hatchSessionItem2, arrayListA0h);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            if (((HatchSessionItem) obj).isPinned) {
                arrayListA0h2.add(obj);
            }
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (Object obj2 : arrayListA0h) {
            if (!((HatchSessionItem) obj2).isPinned) {
                arrayListA0h3.add(obj2);
            }
        }
        return AbstractC0878AGe.A0P(arrayListA0h3, AbstractC0878AGe.A0Q(C60R.A0M(hatchSessionItem, 7935), arrayListA0h2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HatchSessionItem> sortedForView(List<HatchSessionItem> list, ThreadsView threadsView) {
        Comparator<HatchSessionItem> comparator;
        int iOrdinal = threadsView.ordinal();
        if (iOrdinal == 0) {
            comparator = HatchThreadsRepositoryKt.HatchSessionListComparator;
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            comparator = HatchThreadsRepositoryKt.HatchArchivedSessionListComparator;
        }
        return AbstractC0878AGe.A0c(list, comparator);
    }

    private final List<HatchSessionItem> upsertSession(List<HatchSessionItem> list, HatchSessionItem hatchSessionItem) {
        return AbstractC0878AGe.A0c(AbstractC0878AGe.A0P(filterNotSession(list, hatchSessionItem.sessionId), Collections.singletonList(hatchSessionItem)), HatchThreadsRepositoryKt.HatchSessionListComparator);
    }

    public final Object archiveSession(String str, HtJ<? super ArchiveSessionResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, this, null));
    }

    public final Object pinSession(String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113902(str, null));
    }

    public final Object refreshSession(String str, HtJ<? super SessionRefreshResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113922(str, null));
    }

    public final Object renameSession(String str, String str2, HtJ<? super RenameSessionResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113932(str, str2, this, null));
    }

    public final Object unarchiveSession(String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113942(str, this, null));
    }

    public final Object unpinSession(String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113952(str, null));
    }
}
