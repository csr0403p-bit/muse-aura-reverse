package com.facebook.aura.explore.repo;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C27k;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9258GBl;
import X.C9286GCn;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.explore.repo.ExploreJarvisPath;
import com.facebook.aura.feedback.FeedbackEntityType;
import com.facebook.aura.feedback.FeedbackResult;
import com.facebook.aura.feedback.FeedbackTarget;
import com.facebook.aura.feedback.FeedbackVerdict;
import com.facebook.aura.feedback.repo.HatchFeedbackRepository;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.model.HatchEngagementEventType;
import com.facebook.aura.model.IdeaSharing;
import com.facebook.aura.model.IdeaSharingKind;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.perf.HatchNavQueryTrace;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.settings.HatchCredentialsViewModelKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes.dex */
public final class IdeaCardsDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<IdeasFeedState> _feedState;
    public final BLG<Map<String, IdeaSharing>> _sharingOverrides;
    public final C1BN<IdeasFeedState> feedState;
    public C27k<Boolean> inFlight;
    public final InterfaceC2261BLa inFlightMutex;
    public final HatchNavTTRCCoordinator navTtrcCoordinator;
    public C27k<Boolean> nextPageInFlight;
    public final InterfaceC2261BLa nextPageMutex;
    public final C3UX scope;
    public final C1BN<Map<String, IdeaSharing>> sharingOverrides;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource$executeCard$2", f = "IdeaCardsDataSource.kt", l = {569}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$executeCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super IdeaCardExecuteResult>, Object> {
        public final /* synthetic */ String $ideaCardId;
        public final /* synthetic */ List<String> $selectedItemIds;
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
        public final /* synthetic */ IdeaCardsDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, List<String> list, IdeaCardsDataSource ideaCardsDataSource, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$ideaCardId = str;
            this.$selectedItemIds = list;
            this.this$0 = ideaCardsDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$ideaCardId, this.$selectedItemIds, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ExploreJarvisPath.IdeaCardExecute ideaCardExecute = new ExploreJarvisPath.IdeaCardExecute(this.$ideaCardId);
                List<String> list = this.$selectedItemIds;
                IdeaCardExecuteRequestJson ideaCardExecuteRequestJson = (list == null || list.isEmpty()) ? new IdeaCardExecuteRequestJson("full", null) : IdeaCardExecuteRequestJson.Companion.selectedItems(this.$selectedItemIds);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                IdeaCardsDataSource$executeCard$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 ideaCardsDataSource$executeCard$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = IdeaCardsDataSource$executeCard$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                IdeaCardsDataSource$executeCard$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 ideaCardsDataSource$executeCard$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = IdeaCardsDataSource$executeCard$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(ideaCardsDataSource$executeCard$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, ideaCardsDataSource$executeCard$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, ideaCardExecute, ideaCardExecuteRequestJson, RequestType.POST, this.this$0.userSession, new Long(60L), null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
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
                objM1599executeJarvisRequestWithFof5HsY = null;
            }
            IdeaCardExecuteResponseJson ideaCardExecuteResponseJson = (IdeaCardExecuteResponseJson) objM1599executeJarvisRequestWithFof5HsY;
            if (ideaCardExecuteResponseJson != null) {
                return ideaCardExecuteResponseJson.toDomain();
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super IdeaCardExecuteResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource", f = "IdeaCardsDataSource.kt", l = {266}, m = "fetchCardDetail", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetail$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdeaCardsDataSource.this.fetchCardDetail(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource", f = "IdeaCardsDataSource.kt", l = {540, 550, 145}, m = "loadFeed", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$loadFeed$1, reason: invalid class name and case insensitive filesystem */
    public final class C118481 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C118481(HtJ<? super C118481> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdeaCardsDataSource.this.loadFeed(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource", f = "IdeaCardsDataSource.kt", l = {535, 226}, m = "loadNext", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$loadNext$1, reason: invalid class name and case insensitive filesystem */
    public final class C118491 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C118491(HtJ<? super C118491> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdeaCardsDataSource.this.loadNext(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource$performLoadFeed$2", f = "IdeaCardsDataSource.kt", l = {545}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$performLoadFeed$2, reason: invalid class name and case insensitive filesystem */
    public final class C118502 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
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

        public C118502(HtJ<? super C118502> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return IdeaCardsDataSource.this.new C118502(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchNavQueryTrace hatchNavQueryTraceBegin;
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            int size = 0;
            if (i == 0) {
                Hwg.A00(obj);
                hatchNavQueryTraceBegin = HatchNavQueryTrace.Companion.begin(IdeaCardsDataSource.this.navTtrcCoordinator, HatchNavTTRCSpec.Surface.IDEAS, HatchNavTTRCSpec.Queries.IDEAS_DATA, HatchNavTTRCSpec.Points.IDEAS_FETCH_START, HatchNavTTRCSpec.Points.IDEAS_FETCH_END, HatchNavTTRCSpec.FailedSource.IDEAS, true);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                ExploreJarvisPath.IdeaCards ideaCards = ExploreJarvisPath.IdeaCards.INSTANCE;
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = IdeaCardsDataSource.this.userSession;
                HxE<String, Object>[] hxEArrIdeaCardsQueryParams = IdeaCardsDataSourceKt.ideaCardsQueryParams(null);
                HxE<String, ? extends Object>[] hxEArr = (HxE[]) Arrays.copyOf(hxEArrIdeaCardsQueryParams, hxEArrIdeaCardsQueryParams.length);
                Long l = new Long(60L);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                IdeaCardsDataSource$performLoadFeed$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 ideaCardsDataSource$performLoadFeed$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = IdeaCardsDataSource$performLoadFeed$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = hatchNavQueryTraceBegin;
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
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(ideaCardsDataSource$performLoadFeed$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, ideaCards, requestType, abstractC3358CGz, l, hxEArr, null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                hatchNavQueryTraceBegin = (HatchNavQueryTrace) this.L$0;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            if (thA00 != null) {
                hatchNavQueryTraceBegin.onFailure(HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_REQUEST_FAILED, thA00.getMessage());
                return false;
            }
            IdeaCardsFeedResponse domain = ((IdeaCardsResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
            IdeaCardsDataSource ideaCardsDataSource = IdeaCardsDataSource.this;
            AHD<IdeaCardSection> ahd = domain.sections;
            ArrayList arrayList = new ArrayList();
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                AHD<IdeaCard> ahd2 = ((IdeaCardSection) it.next()).cards;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd2);
                for (IdeaCard ideaCard : ahd2) {
                    AnonymousClass002.A1J(ideaCard.ideaCardId, ideaCard.sharing, arrayListA0i);
                }
                AbstractC0882AGj.A0r(arrayListA0i, arrayList);
            }
            ideaCardsDataSource.refreshSharingOverrides(arrayList);
            AnonymousClass002.A1I(IdeaCardsDataSource.this._feedState, new IdeasFeedState(domain.sections, domain.hasBuiltIdea, domain.nextCursor, domain.hasNextPage, ExploreLoadingState.LOADED));
            Iterator it2 = IdeaCardsDataSource.this._feedState.getValue().sections.iterator();
            while (it2.hasNext()) {
                size += ((IdeaCardSection) it2.next()).cards.size();
            }
            hatchNavQueryTraceBegin.annotate(HatchNavTTRCSpec.AnnotationKeys.IDEAS_COUNT, new Integer(size));
            hatchNavQueryTraceBegin.onDisplayed();
            return true;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return IdeaCardsDataSource.this.new C118502(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource$performLoadNext$2", f = "IdeaCardsDataSource.kt", l = {545}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$performLoadNext$2, reason: invalid class name and case insensitive filesystem */
    public final class C118512 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $cursor;
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
        public final /* synthetic */ IdeaCardsDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118512(String str, IdeaCardsDataSource ideaCardsDataSource, HtJ<? super C118512> htJ) {
            super(2, htJ);
            this.$cursor = str;
            this.this$0 = ideaCardsDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C118512(this.$cursor, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            IdeaCardsFeedResponse domain;
            IdeasFeedState value;
            IdeasFeedState ideasFeedState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                ExploreJarvisPath.IdeaCards ideaCards = ExploreJarvisPath.IdeaCards.INSTANCE;
                HxE<String, Object>[] hxEArrIdeaCardsQueryParams = IdeaCardsDataSourceKt.ideaCardsQueryParams(this.$cursor);
                HxE<String, ? extends Object>[] hxEArr = (HxE[]) Arrays.copyOf(hxEArrIdeaCardsQueryParams, hxEArrIdeaCardsQueryParams.length);
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                Long l = new Long(60L);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                IdeaCardsDataSource$performLoadNext$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 ideaCardsDataSource$performLoadNext$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = IdeaCardsDataSource$performLoadNext$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(ideaCardsDataSource$performLoadNext$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, ideaCards, requestType, abstractC3358CGz, l, hxEArr, null, setA18, true, c9jHA0E, true, null, false, this);
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
            IdeaCardsResponseJson ideaCardsResponseJson = (IdeaCardsResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (ideaCardsResponseJson == null || (domain = ideaCardsResponseJson.toDomain()) == null) {
                return false;
            }
            IdeaCardsDataSource ideaCardsDataSource = this.this$0;
            AHD<IdeaCardSection> ahd = domain.sections;
            ArrayList arrayList = new ArrayList();
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                AHD<IdeaCard> ahd2 = ((IdeaCardSection) it.next()).cards;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd2);
                for (IdeaCard ideaCard : ahd2) {
                    AnonymousClass002.A1J(ideaCard.ideaCardId, ideaCard.sharing, arrayListA0i);
                }
                AbstractC0882AGj.A0r(arrayListA0i, arrayList);
            }
            ideaCardsDataSource.refreshSharingOverrides(arrayList);
            BLG<IdeasFeedState> blg = this.this$0._feedState;
            do {
                value = blg.getValue();
                ideasFeedState = value;
            } while (!blg.A6e(value, ideasFeedState.copy(AGI.A07(AbstractC0878AGe.A0P(domain.sections, ideasFeedState.sections)), ideasFeedState.hasBuiltIdea, domain.nextCursor, domain.hasNextPage, ideasFeedState.loadingState)));
            return true;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C118512) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource$recordIdeaEngagement$2", f = "IdeaCardsDataSource.kt", l = {569}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$recordIdeaEngagement$2, reason: invalid class name and case insensitive filesystem */
    public final class C118522 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $anchorId;
        public final /* synthetic */ String $anchorKind;
        public final /* synthetic */ HatchEngagementEventType $eventType;
        public final /* synthetic */ String $ideaCardId;
        public final /* synthetic */ String $lane;
        public final /* synthetic */ JsonObject $metadata;
        public final /* synthetic */ String $surface;
        public final /* synthetic */ Double $value;
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
        public final /* synthetic */ IdeaCardsDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118522(String str, HatchEngagementEventType hatchEngagementEventType, String str2, Double d, String str3, String str4, String str5, JsonObject jsonObject, IdeaCardsDataSource ideaCardsDataSource, HtJ<? super C118522> htJ) {
            super(2, htJ);
            this.$ideaCardId = str;
            this.$eventType = hatchEngagementEventType;
            this.$surface = str2;
            this.$value = d;
            this.$anchorKind = str3;
            this.$anchorId = str4;
            this.$lane = str5;
            this.$metadata = jsonObject;
            this.this$0 = ideaCardsDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C118522(this.$ideaCardId, this.$eventType, this.$surface, this.$value, this.$anchorKind, this.$anchorId, this.$lane, this.$metadata, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ExploreJarvisPath.IdeaEngagement ideaEngagement;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                CFK.A08(IdeaCardsDataSourceKt.TAG, FGI.A0d("[engagement] POST ", ideaEngagement.getValue(), " threw: ", e.getMessage()), e);
            }
            if (i == 0) {
                Hwg.A00(obj);
                String str = this.$ideaCardId;
                if (str.length() == 0) {
                    CFK.A06(IdeaCardsDataSourceKt.TAG, "[engagement] missing ideaCardId");
                    return Unit.INSTANCE;
                }
                ideaEngagement = new ExploreJarvisPath.IdeaEngagement(str);
                IdeaEngagementRequestJson ideaEngagementRequestJson = new IdeaEngagementRequestJson(this.$eventType.getWireValue(), this.$surface, this.$value, this.$anchorKind, this.$anchorId, this.$lane, this.$metadata);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                IdeaCardsDataSource$recordIdeaEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 ideaCardsDataSource$recordIdeaEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = IdeaCardsDataSource$recordIdeaEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                IdeaCardsDataSource$recordIdeaEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 ideaCardsDataSource$recordIdeaEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = IdeaCardsDataSource$recordIdeaEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = ideaEngagement;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                if (HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(ideaCardsDataSource$recordIdeaEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, ideaCardsDataSource$recordIdeaEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, ideaEngagement, ideaEngagementRequestJson, RequestType.POST, this.this$0.userSession, new Long(60L), null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                ideaEngagement = (ExploreJarvisPath.IdeaEngagement) this.L$0;
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118522) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource", f = "IdeaCardsDataSource.kt", l = {296, 299, 300}, m = "shareCard", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$shareCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C118531 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C118531(HtJ<? super C118531> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdeaCardsDataSource.this.shareCard(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource$submitFeedback$2", f = "IdeaCardsDataSource.kt", l = {392}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$submitFeedback$2, reason: invalid class name and case insensitive filesystem */
    public final class C118542 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super IdeaFeedbackResult>, Object> {
        public final /* synthetic */ IdeaFeedback $feedback;
        public final /* synthetic */ String $ideaCardId;
        public final /* synthetic */ String $reason;
        public int label;
        public final /* synthetic */ IdeaCardsDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118542(String str, IdeaCardsDataSource ideaCardsDataSource, IdeaFeedback ideaFeedback, String str2, HtJ<? super C118542> htJ) {
            super(2, htJ);
            this.$ideaCardId = str;
            this.this$0 = ideaCardsDataSource;
            this.$feedback = ideaFeedback;
            this.$reason = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C118542(this.$ideaCardId, this.this$0, this.$feedback, this.$reason, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (this.$ideaCardId.length() == 0) {
                    CFK.A06(IdeaCardsDataSourceKt.TAG, "[feedback] missing ideaCardId");
                    return IdeaFeedbackResult.FAILED;
                }
                HatchFeedbackRepository companion = HatchFeedbackRepository.Companion.getInstance(this.this$0.userSession);
                FeedbackTarget feedbackTarget = new FeedbackTarget(FeedbackEntityType.IDEA, this.$ideaCardId, IdeaCardsModelsKt.IDEA_FEEDBACK_SURFACE, AnonymousClass006.A10(IdeaCardsModelsKt.IDEA_FEEDBACK_LANE_KEY, "explore"));
                FeedbackVerdict feedbackVerdict = this.$feedback == IdeaFeedback.UP ? FeedbackVerdict.UP : FeedbackVerdict.DOWN;
                String str = this.$reason;
                this.label = 1;
                obj = companion.submit(feedbackTarget, feedbackVerdict, str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (obj instanceof FeedbackResult.NotFound) {
                return IdeaFeedbackResult.NOT_FOUND;
            }
            if (obj instanceof FeedbackResult.Submitted) {
                return IdeaFeedbackResult.SUCCESS;
            }
            if (obj instanceof FeedbackResult.Failed) {
                return IdeaFeedbackResult.FAILED;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super IdeaFeedbackResult> htJ) {
            return ((C118542) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final String normalizeReason(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(IdeaCardsDataSourceKt.REASON_WHITESPACE.A03(str, InviteCodeScratcherKt.CODE_SEPARATOR))) == null) {
            strA0l = "";
        }
        int length = strA0l.length();
        if (length != 0) {
            if (strA0l.codePointCount(0, length) <= 600) {
                return strA0l;
            }
            CFK.A06(IdeaCardsDataSourceKt.TAG, "[feedback] reason over 600 chars, dropping it");
        }
        return null;
    }

    public final void markSharingUnavailable(String str) {
        Map<String, IdeaSharing> value;
        LinkedHashMap linkedHashMap;
        C7384Etj.A0Y(str, 0);
        BLG<Map<String, IdeaSharing>> blg = this._sharingOverrides;
        do {
            value = blg.getValue();
            Map mapA09 = AGH.A09(str, value);
            int i = IdeaSharing.$stable;
            List<Map.Entry> listA0e = AbstractC0878AGe.A0e(AbstractC0878AGe.A0X(AnonymousClass006.A11(str, new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null), mapA09).entrySet()), 256);
            linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(listA0e));
            for (Map.Entry entry : listA0e) {
                HxE hxE = new HxE(entry.getKey(), entry.getValue());
                linkedHashMap.put(hxE.first, hxE.second);
            }
        } while (!blg.A6e(value, linkedHashMap));
    }

    public final void removeCard(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.length() != 0) {
            IdeasFeedState value = this._feedState.getValue();
            Iterator it = value.sections.iterator();
            int i = 0;
            while (it.hasNext()) {
                AHD<IdeaCard> ahd = ((IdeaCardSection) it.next()).cards;
                if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
                    Iterator it2 = ahd.iterator();
                    while (it2.hasNext()) {
                        if (str.equals(((IdeaCard) it2.next()).ideaCardId)) {
                            if (i >= 0) {
                                IdeaCardSection ideaCardSection = (IdeaCardSection) value.sections.get(i);
                                AHD<IdeaCard> ahd2 = ideaCardSection.cards;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : ahd2) {
                                    if (!str.equals(((IdeaCard) obj).ideaCardId)) {
                                        arrayList.add(obj);
                                    }
                                }
                                ArrayList arrayListA0R = AbstractC0878AGe.A0R(value.sections);
                                if (arrayList.isEmpty()) {
                                    arrayListA0R.remove(i);
                                } else {
                                    arrayListA0R.set(i, ideaCardSection.copy(ideaCardSection.sectionId, ideaCardSection.title, ideaCardSection.subtitle, ideaCardSection.layout, AGI.A07(arrayList)));
                                }
                                this._feedState.Af8(value.copy(AGI.A07(arrayListA0R), value.hasBuiltIdea, value.nextCursor, value.hasNextPage, value.loadingState));
                                return;
                            }
                            return;
                        }
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object executeCard$default(IdeaCardsDataSource ideaCardsDataSource, String str, List list, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return ideaCardsDataSource.executeCard(str, list, htJ);
    }

    private final boolean isRetryableShareError(Throwable th) {
        NetworkException networkException;
        String str = null;
        if (th instanceof NetworkException) {
            networkException = (NetworkException) th;
            if (networkException != null) {
                str = networkException.errorCode;
            }
        } else {
            networkException = null;
        }
        return "idea_share_unavailable".equals(str) && AnonymousClass002.A1b(networkException.serverRetryable, true);
    }

    public static /* synthetic */ Object recordIdeaEngagement$default(IdeaCardsDataSource ideaCardsDataSource, String str, HatchEngagementEventType hatchEngagementEventType, String str2, Double d, String str3, String str4, String str5, JsonObject jsonObject, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            d = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            jsonObject = null;
        }
        return ideaCardsDataSource.recordIdeaEngagement(str, hatchEngagementEventType, str2, d, str3, str4, str5, jsonObject, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshSharingOverrides(List<HxE<String, IdeaSharing>> list) {
        Map<String, IdeaSharing> value;
        Map<String, IdeaSharing> map;
        ArrayList arrayList;
        BLG<Map<String, IdeaSharing>> blg = this._sharingOverrides;
        do {
            value = blg.getValue();
            map = value;
            arrayList = new ArrayList();
            for (HxE<String, IdeaSharing> hxE : list) {
                if (map.containsKey(hxE.first)) {
                    arrayList.add(hxE);
                }
            }
        } while (!blg.A6e(value, AGH.A02(map, AGH.A06(arrayList))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: shareCardOnce-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m766shareCardOncegIAlus(java.lang.String r7, X.HtJ<? super X.HsJ<com.facebook.aura.explore.repo.IdeaCardShareResponseJson>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.explore.repo.IdeaCardsDataSource$shareCardOnce$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.explore.repo.IdeaCardsDataSource$shareCardOnce$1 r5 = (com.facebook.aura.explore.repo.IdeaCardsDataSource$shareCardOnce$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.explore.repo.IdeaCardsDataSource$shareCardOnce$2 r0 = new com.facebook.aura.explore.repo.IdeaCardsDataSource$shareCardOnce$2
            r0.<init>(r7, r6, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.explore.repo.IdeaCardsDataSource$shareCardOnce$1 r5 = new com.facebook.aura.explore.repo.IdeaCardsDataSource$shareCardOnce$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.repo.IdeaCardsDataSource.m766shareCardOncegIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final String bugReportSummary() {
        StringBuilder sb = new StringBuilder();
        AHD<IdeaCardSection> ahd = this._feedState.getValue().sections;
        sb.append(FGI.A0H("sections: ", ahd.size()));
        sb.append('\n');
        if (ahd.isEmpty()) {
            sb.append("(no sections loaded)\n");
        } else {
            for (IdeaCardSection ideaCardSection : ahd) {
                String str = ideaCardSection.sectionId;
                IdeaCardLayout ideaCardLayout = ideaCardSection.layout;
                int size = ideaCardSection.cards.size();
                StringBuilder sb2 = new StringBuilder("  sectionId=");
                sb2.append(str);
                sb2.append(" layout=");
                sb2.append(ideaCardLayout);
                sb2.append(" cards=");
                sb2.append(size);
                sb.append(sb2.toString());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass001.A1E(this._feedState, null, new IdeasFeedState(AHI.A01, false, null, false, ExploreLoadingState.INITIAL));
        this._sharingOverrides.Af8(AGH.A0E());
        this.navTtrcCoordinator.clearObservedQuery(HatchNavTTRCSpec.Surface.IDEAS, HatchNavTTRCSpec.Queries.IDEAS_DATA);
        Hxb.A03(null, this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchCardDetail(java.lang.String r6, X.HtJ<? super com.facebook.aura.explore.repo.IdeaCardDetail> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.explore.repo.IdeaCardsDataSource.AnonymousClass1
            if (r0 == 0) goto L36
            r4 = r7
            com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetail$1 r4 = (com.facebook.aura.explore.repo.IdeaCardsDataSource.AnonymousClass1) r4
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
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L21:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L26
            r1 = 0
        L26:
            return r1
        L27:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r1 = r5.m767fetchCardDetailResultgIAlus(r6, r4)
            if (r1 != r2) goto L21
            return r2
        L36:
            com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetail$1 r4 = new com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetail$1
            r4.<init>(r7)
            goto L12
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.repo.IdeaCardsDataSource.fetchCardDetail(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: fetchCardDetailResult-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m767fetchCardDetailResultgIAlus(java.lang.String r7, X.HtJ<? super X.HsJ<com.facebook.aura.explore.repo.IdeaCardDetail>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetailResult$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetailResult$1 r5 = (com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetailResult$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetailResult$2 r0 = new com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetailResult$2
            r0.<init>(r7, r6, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetailResult$1 r5 = new com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetailResult$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.repo.IdeaCardsDataSource.m767fetchCardDetailResultgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final C1BN<IdeasFeedState> getFeedState() {
        return this.feedState;
    }

    public final C1BN<Map<String, IdeaSharing>> getSharingOverrides() {
        return this.sharingOverrides;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #1 {all -> 0x00fb, blocks: (B:39:0x00c4, B:41:0x00c8), top: B:56:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadFeed(boolean r15, X.HtJ<? super java.lang.Boolean> r16) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.repo.IdeaCardsDataSource.loadFeed(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadNext(X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.explore.repo.IdeaCardsDataSource.C118491
            if (r0 == 0) goto L8c
            r4 = r9
            com.facebook.aura.explore.repo.IdeaCardsDataSource$loadNext$1 r4 = (com.facebook.aura.explore.repo.IdeaCardsDataSource.C118491) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r6 = r4.label
            r3 = 2
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L31
            if (r6 == r1) goto L25
            if (r6 != r3) goto L92
            X.Hwg.A00(r0)
        L24:
            return r0
        L25:
            java.lang.Object r7 = r4.L$1
            X.BLa r7 = (X.InterfaceC2261BLa) r7
            java.lang.Object r6 = r4.L$0
            java.lang.String r6 = (java.lang.String) r6
            X.Hwg.A00(r0)
            goto L61
        L31:
            X.Hwg.A00(r0)
            X.BLG<com.facebook.aura.explore.repo.IdeasFeedState> r0 = r8._feedState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.explore.repo.IdeasFeedState r0 = (com.facebook.aura.explore.repo.IdeasFeedState) r0
            java.lang.String r6 = r0.nextCursor
            if (r6 == 0) goto L9c
            int r0 = r6.length()
            if (r0 == 0) goto L9c
            X.BLG<com.facebook.aura.explore.repo.IdeasFeedState> r0 = r8._feedState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.explore.repo.IdeasFeedState r0 = (com.facebook.aura.explore.repo.IdeasFeedState) r0
            boolean r0 = r0.hasNextPage
            if (r0 == 0) goto L9c
            X.BLa r7 = r8.nextPageMutex
            r4.L$0 = r6
            r4.L$1 = r7
            r4.label = r1
            java.lang.Object r0 = r7.APs(r2, r4)
            if (r0 != r5) goto L61
            return r5
        L61:
            X.27k<java.lang.Boolean> r1 = r8.nextPageInFlight     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L7a
            X.3UX r1 = r8.scope     // Catch: java.lang.Throwable -> L97
            com.facebook.aura.explore.repo.IdeaCardsDataSource$loadNext$deferred$1$1 r0 = new com.facebook.aura.explore.repo.IdeaCardsDataSource$loadNext$deferred$1$1     // Catch: java.lang.Throwable -> L97
            r0.<init>(r8, r6, r2)     // Catch: java.lang.Throwable -> L97
            X.Hrx r1 = X.AnonymousClass001.A10(r0, r1)     // Catch: java.lang.Throwable -> L97
            r8.nextPageInFlight = r1     // Catch: java.lang.Throwable -> L97
            com.facebook.aura.explore.repo.IdeaCardsDataSource$loadNext$deferred$1$2$1 r0 = new com.facebook.aura.explore.repo.IdeaCardsDataSource$loadNext$deferred$1$2$1     // Catch: java.lang.Throwable -> L97
            r0.<init>(r8, r1)     // Catch: java.lang.Throwable -> L97
            r1.AO5(r0)     // Catch: java.lang.Throwable -> L97
        L7a:
            r7.Ahe(r2)
            r4.L$0 = r2
            r4.L$1 = r2
            r4.label = r3
            X.GBM r1 = (X.GBM) r1
            java.lang.Object r0 = r1.A0E(r4)
            if (r0 != r5) goto L24
            return r5
        L8c:
            com.facebook.aura.explore.repo.IdeaCardsDataSource$loadNext$1 r4 = new com.facebook.aura.explore.repo.IdeaCardsDataSource$loadNext$1
            r4.<init>(r9)
            goto L12
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L97:
            r0 = move-exception
            r7.Ahe(r2)
            throw r0
        L9c:
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.repo.IdeaCardsDataSource.loadNext(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0065 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shareCard(java.lang.String r10, X.HtJ<? super com.facebook.aura.explore.repo.IdeaCardShareAttempt> r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.repo.IdeaCardsDataSource.shareCard(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final IdeaCardsDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (IdeaCardsDataSource) abstractC3358CGz.A03(IdeaCardsDataSource.class, new IdeaCardsDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ IdeaCardsDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object performLoadFeed(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C118502(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object performLoadNext(String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C118512(str, this, null));
    }

    public final Object executeCard(String str, List<String> list, HtJ<? super IdeaCardExecuteResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, list, this, null));
    }

    public final Object recordIdeaEngagement(String str, HatchEngagementEventType hatchEngagementEventType, String str2, Double d, String str3, String str4, String str5, JsonObject jsonObject, HtJ<? super Unit> htJ) {
        Object objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new C118522(str, hatchEngagementEventType, str2, d, str3, str4, str5, jsonObject, this, null));
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final Object submitFeedback(String str, IdeaFeedback ideaFeedback, String str2, HtJ<? super IdeaFeedbackResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C118542(str, this, ideaFeedback, str2, null));
    }

    public IdeaCardsDataSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCn = new C9286GCn(new IdeasFeedState(AHI.A01, false, null, false, ExploreLoadingState.INITIAL));
        this._feedState = c9286GCn;
        this.feedState = new C3Pi(null, c9286GCn);
        C9286GCn c9286GCnA01 = HnJ.A01(AGH.A0E());
        this._sharingOverrides = c9286GCnA01;
        this.sharingOverrides = new C3Pi(null, c9286GCnA01);
        this.navTtrcCoordinator = HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGz);
        this.scope = AnonymousClass007.A0k();
        this.inFlightMutex = new C9258GBl();
        this.nextPageMutex = new C9258GBl();
    }
}
