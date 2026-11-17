package com.facebook.aura.status.repo;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AII;
import X.AIM;
import X.AIW;
import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AbstractC7536F0j;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3pd;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7BY;
import X.C9258GBl;
import X.C9286GCn;
import X.C9290GCr;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.F1F;
import X.F60;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.gateway.ActivityUpdatedEvent;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.pairs.PairsPendingLevelStoreKt;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.repo.ActivityError;
import com.facebook.aura.status.repo.ActivityGoalActionsResult;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ActivityDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<ActivityData> _data;
    public final C3Em<ActivityGoalUpdate> _goalUpdates;
    public final C1BN<ActivityData> data;
    public final InterfaceC2261BLa goalEventMutex;
    public final ConcurrentHashMap<String, HoC> goalPreviewRefreshJobs;
    public final C22I<ActivityGoalUpdate> goalUpdates;
    public final ConcurrentHashMap<String, Long> lastGoalEventSeqs;
    public final C3UX scope;
    public final ConcurrentHashMap.KeySetView<String, Boolean> untrustedGoalPreviews;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource", f = "ActivityDataSource.kt", l = {1090}, m = "applyPage", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$applyPage$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivityDataSource.this.applyPage(null, false, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource$executeLoadActions$2", f = "ActivityDataSource.kt", l = {1097}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$executeLoadActions$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ActivityPage>, Object> {
        public final /* synthetic */ String $before;
        public final /* synthetic */ String $cursor;
        public final /* synthetic */ int $limit;
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
        public AnonymousClass2(String str, int i, String str2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$cursor = str;
            this.$limit = i;
            this.$before = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivityDataSource.this.new AnonymousClass2(this.$cursor, this.$limit, this.$before, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ActivityPage> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource", f = "ActivityDataSource.kt", l = {1095, 250, 249}, m = "loadActions", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$loadActions$1, reason: invalid class name and case insensitive filesystem */
    public final class C140141 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C140141(HtJ<? super C140141> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivityDataSource.this.loadActions(0, false, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource$loadActivityDetail$2", f = "ActivityDataSource.kt", l = {1095}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$loadActivityDetail$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C140152 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ActivityDetailResponse>, Object> {
        public final /* synthetic */ String $hash;
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
        public final /* synthetic */ ActivityDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140152(String str, ActivityDataSource activityDataSource, HtJ<? super C140152> htJ) {
            super(2, htJ);
            this.$hash = str;
            this.this$0 = activityDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140152(this.$hash, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    String strEncode = URLEncoder.encode(this.$hash, HatchWebPageParserKt.UTF_8);
                    HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                    C7384Etj.A0X(strEncode);
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    ActivityDataSource$loadActivityDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 activityDataSource$loadActivityDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = ActivityDataSource$loadActivityDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(activityDataSource$loadActivityDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, new JarvisPath.ActivityDetail(strEncode), RequestType.GET, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
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
                ActivityDetailResponseJson activityDetailResponseJson = (ActivityDetailResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
                if (activityDetailResponseJson != null) {
                    return activityDetailResponseJson.toDomain();
                }
                return null;
            } catch (Exception e) {
                CFK.A04(ActivityDataSourceKt.TAG, FGI.A0d("GET /activity/", this.$hash, " failed: ", e.getMessage()));
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ActivityDetailResponse> htJ) {
            return ((C140152) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource$loadGoalActionReport$2", f = "ActivityDataSource.kt", l = {1095}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$loadGoalActionReport$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C140162 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ActivityGoalActionReportChunk>, Object> {
        public final /* synthetic */ String $actionId;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ long $offset;
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
        public final /* synthetic */ ActivityDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140162(String str, String str2, ActivityDataSource activityDataSource, long j, HtJ<? super C140162> htJ) {
            super(2, htJ);
            this.$goalId = str;
            this.$actionId = str2;
            this.this$0 = activityDataSource;
            this.$offset = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140162(this.$goalId, this.$actionId, this.this$0, this.$offset, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                JarvisPath.ActivityGoalActionReport activityGoalActionReport = new JarvisPath.ActivityGoalActionReport(this.$goalId, this.$actionId);
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                HxE<String, ? extends Object>[] hxEArr = {C3cG.A0r("report_offset", C3cG.A0S(this.$offset))};
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                ActivityDataSource$loadGoalActionReport$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 activityDataSource$loadGoalActionReport$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = ActivityDataSource$loadGoalActionReport$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(activityDataSource$loadGoalActionReport$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, activityGoalActionReport, requestType, abstractC3358CGz, null, hxEArr, null, setA18, true, c9jHA0E, true, null, false, this);
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
            ActivityGoalActionReportJson activityGoalActionReportJson = (ActivityGoalActionReportJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (activityGoalActionReportJson != null) {
                return activityGoalActionReportJson.toDomain();
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ActivityGoalActionReportChunk> htJ) {
            return ((C140162) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource$loadGoalActions$2", f = "ActivityDataSource.kt", l = {1098}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$loadGoalActions$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C140172 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ActivityGoalActionsResult>, Object> {
        public final /* synthetic */ String $cursor;
        public final /* synthetic */ String $goalId;
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
        public final /* synthetic */ ActivityDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140172(String str, ActivityDataSource activityDataSource, String str2, HtJ<? super C140172> htJ) {
            super(2, htJ);
            this.$goalId = str;
            this.this$0 = activityDataSource;
            this.$cursor = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140172(this.$goalId, this.this$0, this.$cursor, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                JarvisPath.ActivityGoalActions activityGoalActions = new JarvisPath.ActivityGoalActions(this.$goalId);
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                String str = this.$cursor;
                AII aiiA17 = AIM.A17();
                AnonymousClass002.A1J(PhotosSearchHandlerKt.PARAM_LIMIT, C3cG.A0R(50), aiiA17);
                if (str != null) {
                    AnonymousClass002.A1J("cursor", str, aiiA17);
                }
                HxE[] hxEArr = (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
                HxE<String, ? extends Object>[] hxEArr2 = (HxE[]) Arrays.copyOf(hxEArr, hxEArr.length);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                ActivityDataSource$loadGoalActions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 activityDataSource$loadGoalActions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = ActivityDataSource$loadGoalActions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(activityDataSource$loadGoalActions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, activityGoalActions, requestType, abstractC3358CGz, null, hxEArr2, null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            String str2 = this.$cursor;
            Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            return thA00 == null ? new ActivityGoalActionsResult.Loaded(((ActivityGoalActionsPageJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain()) : (str2 == null || !(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null || networkException.httpResponseCode != 400) ? ActivityGoalActionsResult.Failed.INSTANCE : ActivityGoalActionsResult.CursorExpired.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ActivityGoalActionsResult> htJ) {
            return ((C140172) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource", f = "ActivityDataSource.kt", l = {263, 262}, m = "loadMore", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$loadMore$1, reason: invalid class name and case insensitive filesystem */
    public final class C140181 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C140181(HtJ<? super C140181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivityDataSource.this.loadMore(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource", f = "ActivityDataSource.kt", l = {1085}, m = "onGatewayReconnected", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$onGatewayReconnected$1, reason: invalid class name and case insensitive filesystem */
    public final class C140191 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C140191(HtJ<? super C140191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivityDataSource.this.onGatewayReconnected(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource$refreshGoalPreview$1", f = "ActivityDataSource.kt", l = {434, 1085}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$refreshGoalPreview$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C140201 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $goalId;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140201(String str, HtJ<? super C140201> htJ) {
            super(2, htJ);
            this.$goalId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C140201 c140201 = ActivityDataSource.this.new C140201(this.$goalId, htJ);
            c140201.L$0 = obj;
            return c140201;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:16:0x005b, B:18:0x0067, B:20:0x0070, B:21:0x0084), top: B:27:0x005b }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r8 = r10.L$0
                X.3UX r8 = (X.C3UX) r8
                X.Hji r9 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r7 = 2
                r2 = 1
                r4 = 0
                if (r0 == 0) goto L2a
                if (r0 == r2) goto L3c
                if (r0 != r7) goto L25
                java.lang.Object r5 = r10.L$4
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r3 = r10.L$3
                com.facebook.aura.status.repo.ActivityDataSource r3 = (com.facebook.aura.status.repo.ActivityDataSource) r3
                java.lang.Object r2 = r10.L$2
                X.BLa r2 = (X.InterfaceC2261BLa) r2
                java.lang.Object r6 = r10.L$1
                com.facebook.aura.status.repo.ActivityGoalActionsResult r6 = (com.facebook.aura.status.repo.ActivityGoalActionsResult) r6
                X.Hwg.A00(r11)
                goto L5b
            L25:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L2a:
                X.Hwg.A00(r11)
                com.facebook.aura.status.repo.ActivityDataSource r1 = com.facebook.aura.status.repo.ActivityDataSource.this
                java.lang.String r0 = r10.$goalId
                r10.L$0 = r8
                r10.label = r2
                java.lang.Object r11 = r1.loadGoalActions(r0, r4, r10)
                if (r11 != r9) goto L3f
                return r9
            L3c:
                X.Hwg.A00(r11)
            L3f:
                r6 = r11
                com.facebook.aura.status.repo.ActivityGoalActionsResult r6 = (com.facebook.aura.status.repo.ActivityGoalActionsResult) r6
                com.facebook.aura.status.repo.ActivityDataSource r3 = com.facebook.aura.status.repo.ActivityDataSource.this
                X.BLa r2 = r3.goalEventMutex
                java.lang.String r5 = r10.$goalId
                r10.L$0 = r8
                r10.L$1 = r6
                r10.L$2 = r2
                r10.L$3 = r3
                r10.L$4 = r5
                r10.label = r7
                java.lang.Object r0 = r2.APs(r4, r10)
                if (r0 != r9) goto L5b
                return r9
            L5b:
                java.util.concurrent.ConcurrentHashMap<java.lang.String, X.HoC> r0 = r3.goalPreviewRefreshJobs     // Catch: java.lang.Throwable -> L8a
                java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L8a
                X.78X r0 = X.C3cH.A0t(r8)     // Catch: java.lang.Throwable -> L8a
                if (r1 != r0) goto L84
                java.util.concurrent.ConcurrentHashMap<java.lang.String, X.HoC> r0 = r3.goalPreviewRefreshJobs     // Catch: java.lang.Throwable -> L8a
                r0.remove(r5)     // Catch: java.lang.Throwable -> L8a
                boolean r0 = r6 instanceof com.facebook.aura.status.repo.ActivityGoalActionsResult.Loaded     // Catch: java.lang.Throwable -> L8a
                if (r0 == 0) goto L84
                java.util.concurrent.ConcurrentHashMap$KeySetView<java.lang.String, java.lang.Boolean> r0 = r3.untrustedGoalPreviews     // Catch: java.lang.Throwable -> L8a
                r0.remove(r5)     // Catch: java.lang.Throwable -> L8a
                com.facebook.aura.status.repo.ActivityGoalActionsResult$Loaded r6 = (com.facebook.aura.status.repo.ActivityGoalActionsResult.Loaded) r6     // Catch: java.lang.Throwable -> L8a
                com.facebook.aura.status.repo.ActivityGoalActionsPage r0 = r6.page     // Catch: java.lang.Throwable -> L8a
                java.util.List<com.facebook.aura.status.repo.ActivityGoalAction> r1 = r0.actions     // Catch: java.lang.Throwable -> L8a
                r0 = 10
                java.util.List r0 = X.AbstractC0878AGe.A0e(r1, r0)     // Catch: java.lang.Throwable -> L8a
                com.facebook.aura.status.repo.ActivityDataSource.access$replaceGoalPreview(r3, r5, r0)     // Catch: java.lang.Throwable -> L8a
            L84:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8a
                r2.Ahe(r4)
                return r9
            L8a:
                r0 = move-exception
                r2.Ahe(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.C140201.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C140201) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$1", f = "ActivityDataSource.kt", l = {480}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$1, reason: invalid class name and case insensitive filesystem */
    public final class C140211 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ ActivityDataSource this$0;

        /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C03911<T> implements C20Z {
            public final /* synthetic */ ActivityDataSource this$0;

            public C03911(ActivityDataSource activityDataSource) {
                this.this$0 = activityDataSource;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((ActivityUpdatedEvent) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.gateway.ActivityUpdatedEvent r11, X.HtJ<? super kotlin.Unit> r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$1$1$emit$1
                    if (r0 == 0) goto L31
                    r6 = r12
                    com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$1$1$emit$1 r6 = (com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$1$1$emit$1) r6
                    int r2 = r6.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L31
                    int r2 = r2 - r1
                    r6.label = r2
                L12:
                    java.lang.Object r9 = r6.result
                    X.Hji r5 = X.EnumC10460Hji.A02
                    int r0 = r6.label
                    r4 = 0
                    r7 = 1
                    java.lang.String r3 = "ActivityDataSource"
                    if (r0 == 0) goto L40
                    if (r0 != r7) goto L3b
                    java.lang.Object r8 = r6.L$4
                    com.facebook.aura.status.repo.ActivityDataSource r8 = (com.facebook.aura.status.repo.ActivityDataSource) r8
                    java.lang.Object r2 = r6.L$3
                    X.BLa r2 = (X.InterfaceC2261BLa) r2
                    java.lang.Object r1 = r6.L$2
                    com.facebook.aura.status.repo.ActivityAction r1 = (com.facebook.aura.status.repo.ActivityAction) r1
                    java.lang.Object r11 = r6.L$0
                    com.facebook.aura.gateway.ActivityUpdatedEvent r11 = (com.facebook.aura.gateway.ActivityUpdatedEvent) r11
                    goto L37
                L31:
                    com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$1$1$emit$1 r6 = new com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$1$1$emit$1
                    r6.<init>(r10, r12)
                    goto L12
                L37:
                    X.Hwg.A00(r9)     // Catch: java.lang.Exception -> L8a
                    goto L78
                L3b:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L40:
                    X.Hwg.A00(r9)
                    X.9sU r2 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L8a
                    com.facebook.aura.status.repo.ActivityEntryJson$$serializer r1 = com.facebook.aura.status.repo.ActivityEntryJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> L8a
                    kotlinx.serialization.json.JsonObject r0 = r11.payload     // Catch: java.lang.Exception -> L8a
                    java.lang.Object r0 = r2.A01(r1, r0)     // Catch: java.lang.Exception -> L8a
                    com.facebook.aura.status.repo.ActivityEntryJson r0 = (com.facebook.aura.status.repo.ActivityEntryJson) r0     // Catch: java.lang.Exception -> L8a
                    com.facebook.aura.status.repo.ActivityEntry r1 = r0.toDomain()     // Catch: java.lang.Exception -> L8a
                    com.facebook.aura.status.repo.ActivityDataSource r0 = r10.this$0     // Catch: java.lang.Exception -> L8a
                    com.facebook.aura.status.repo.ActivityAction r1 = com.facebook.aura.status.repo.ActivityDataSource.access$parseActivityEntry(r0, r1)     // Catch: java.lang.Exception -> L8a
                    if (r1 == 0) goto L84
                    boolean r0 = r1.shouldDisplayInActivityFeed()     // Catch: java.lang.Exception -> L8a
                    if (r0 == 0) goto L84
                    com.facebook.aura.status.repo.ActivityDataSource r8 = r10.this$0     // Catch: java.lang.Exception -> L8a
                    X.BLa r2 = r8.goalEventMutex     // Catch: java.lang.Exception -> L8a
                    r6.L$0 = r11     // Catch: java.lang.Exception -> L8a
                    r6.L$1 = r4     // Catch: java.lang.Exception -> L8a
                    r6.L$2 = r1     // Catch: java.lang.Exception -> L8a
                    r6.L$3 = r2     // Catch: java.lang.Exception -> L8a
                    r6.L$4 = r8     // Catch: java.lang.Exception -> L8a
                    r6.label = r7     // Catch: java.lang.Exception -> L8a
                    java.lang.Object r0 = r2.APs(r4, r6)     // Catch: java.lang.Exception -> L8a
                    if (r0 != r5) goto L78
                    return r5
                L78:
                    com.facebook.aura.status.repo.ActivityDataSource.access$onActivityUpdated(r8, r1, r11)     // Catch: java.lang.Throwable -> L7f
                    r2.Ahe(r4)     // Catch: java.lang.Exception -> L8a
                    goto L94
                L7f:
                    r0 = move-exception
                    r2.Ahe(r4)     // Catch: java.lang.Exception -> L8a
                    throw r0     // Catch: java.lang.Exception -> L8a
                L84:
                    java.lang.String r0 = "activity.updated: failed to parse full ActionRecord from payload"
                    X.CFK.A06(r3, r0)     // Catch: java.lang.Exception -> L8a
                    goto L94
                L8a:
                    r0 = move-exception
                    java.lang.String r1 = r0.getMessage()
                    java.lang.String r0 = "Failed to parse activity.updated payload: "
                    X.C3cG.A1G(r0, r1, r3)
                L94:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.C140211.C03911.emit(com.facebook.aura.gateway.ActivityUpdatedEvent, X.HtJ):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140211(HatchGatewayConnection hatchGatewayConnection, ActivityDataSource activityDataSource, HtJ<? super C140211> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = activityDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140211(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<ActivityUpdatedEvent> c22i = this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().activityUpdateEvents;
                C03911 c03911 = new C03911(this.this$0);
                this.label = 1;
                if (c22i.collect(c03911, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C140211) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$2", f = "ActivityDataSource.kt", l = {501}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$2, reason: invalid class name and case insensitive filesystem */
    public final class C140222 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ ActivityDataSource this$0;

        /* renamed from: com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$2$1, reason: invalid class name */
        public final class AnonymousClass1<T> implements C20Z {
            public final /* synthetic */ F1F $hasConnected;
            public final /* synthetic */ F1F $isConnected;
            public final /* synthetic */ ActivityDataSource this$0;

            public AnonymousClass1(F1F f1f, F1F f1f2, ActivityDataSource activityDataSource) {
                this.$isConnected = f1f;
                this.$hasConnected = f1f2;
                this.this$0 = activityDataSource;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
            /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.gateway.HatchGatewayConnectionState r7, X.HtJ<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$2$1$emit$1
                    if (r0 == 0) goto L5b
                    r5 = r8
                    com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$2$1$emit$1 r5 = (com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$2$1$emit$1) r5
                    int r2 = r5.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L5b
                    int r2 = r2 - r1
                    r5.label = r2
                L12:
                    java.lang.Object r1 = r5.result
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r0 = r5.label
                    r3 = 1
                    if (r0 == 0) goto L38
                    if (r0 != r3) goto L61
                    int r2 = r5.I$0
                    X.Hwg.A00(r1)
                L22:
                    X.F1F r1 = r6.$hasConnected
                    boolean r0 = r1.element
                    if (r0 != 0) goto L2b
                    r0 = 0
                    if (r2 == 0) goto L2c
                L2b:
                    r0 = 1
                L2c:
                    r1.element = r0
                    X.F1F r0 = r6.$isConnected
                    if (r2 != 0) goto L33
                    r3 = 0
                L33:
                    r0.element = r3
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L38:
                    X.Hwg.A00(r1)
                    boolean r2 = r7 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
                    if (r2 == 0) goto L22
                    X.F1F r0 = r6.$isConnected
                    boolean r0 = r0.element
                    if (r0 != 0) goto L22
                    X.F1F r0 = r6.$hasConnected
                    boolean r0 = r0.element
                    if (r0 == 0) goto L22
                    com.facebook.aura.status.repo.ActivityDataSource r1 = r6.this$0
                    r0 = 0
                    r5.L$0 = r0
                    r5.I$0 = r2
                    r5.label = r3
                    java.lang.Object r0 = com.facebook.aura.status.repo.ActivityDataSource.access$onGatewayReconnected(r1, r5)
                    if (r0 != r4) goto L22
                    return r4
                L5b:
                    com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$2$1$emit$1 r5 = new com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$2$1$emit$1
                    r5.<init>(r6, r8)
                    goto L12
                L61:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.C140222.AnonymousClass1.emit(com.facebook.aura.gateway.HatchGatewayConnectionState, X.HtJ):java.lang.Object");
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((HatchGatewayConnectionState) obj, (HtJ<? super Unit>) htJ);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140222(HatchGatewayConnection hatchGatewayConnection, ActivityDataSource activityDataSource, HtJ<? super C140222> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = activityDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140222(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                F1F f1f = new F1F();
                F1F f1f2 = new F1F();
                C1BN<HatchGatewayConnectionState> c1bn = this.$gateway.connectionState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(f1f2, f1f, this.this$0);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (c1bn.collect(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C140222) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.status.repo.ActivityPage parseActivityPayload(com.facebook.aura.status.repo.ActivityListResponseJson r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.parseActivityPayload(com.facebook.aura.status.repo.ActivityListResponseJson, boolean):com.facebook.aura.status.repo.ActivityPage");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivityAction.ActivityType.values().length];
            try {
                AnonymousClass002.A13(ActivityAction.ActivityType.GOAL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyPage(com.facebook.aura.status.repo.ActivityPage r15, boolean r16, java.util.Map<java.lang.String, java.lang.Long> r17, X.HtJ<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.applyPage(com.facebook.aura.status.repo.ActivityPage, boolean, java.util.Map, X.HtJ):java.lang.Object");
    }

    private final String getActivityIdentity(ActivityAction activityAction) {
        String str;
        String strA0l;
        ActivityGoal activityGoal;
        if (activityAction.type.ordinal() == 4) {
            ActivityDetails activityDetails = activityAction.details;
            if (activityDetails != null && (activityGoal = activityDetails.goal) != null) {
                str = activityGoal.id;
            }
            return null;
        }
        str = activityAction.turnId;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    private final String getOldestTimestamp() {
        ActivityAction activityAction;
        AHD<TimelineDayGroup> ahd = this._data.getValue().days;
        if (ahd.isEmpty() || (activityAction = (ActivityAction) AbstractC0878AGe.A0I(((TimelineDayGroup) AbstractC0878AGe.A0H(ahd)).activities)) == null) {
            return null;
        }
        return C60R.A0k("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(activityAction.timestamp);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r2.equals(com.facebook.aura.model.ReplyAttributionSerializer.TYPE_MESSAGE) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (X.C7BY.A0q(r2, "tool_calls=0", false) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        return com.facebook.aura.status.repo.ActivityAction.ActivityCategory.TOOL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r2.equals(com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.status.repo.ActivityAction.ActivityCategory inferCategoryFromSubject(java.lang.String r2, com.facebook.aura.status.repo.ActivityNote r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L31
            java.lang.String r0 = r3.tag
            if (r0 == 0) goto L31
            java.lang.String r2 = X.AnonymousClass001.A0u(r0)
            int r1 = r2.hashCode()
            r0 = -887328209(0xffffffffcb1c722f, float:-1.0252847E7)
            if (r1 == r0) goto L55
            r0 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r1 == r0) goto L28
            r0 = 1224578480(0x48fd95b0, float:519341.5)
            if (r1 != r0) goto L5d
            java.lang.String r0 = "thinking"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5d
            com.facebook.aura.status.repo.ActivityAction$ActivityCategory r0 = com.facebook.aura.status.repo.ActivityAction.ActivityCategory.THINKING
            return r0
        L28:
            java.lang.String r0 = "message"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L60
            goto L5d
        L31:
            java.lang.String r0 = "feed_generate"
            r1 = 0
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 != 0) goto L60
            java.lang.String r0 = "turn_complete"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "tool_calls"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 == 0) goto L5d
            java.lang.String r0 = "tool_calls=0"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 != 0) goto L5d
        L52:
            com.facebook.aura.status.repo.ActivityAction$ActivityCategory r0 = com.facebook.aura.status.repo.ActivityAction.ActivityCategory.TOOL
            return r0
        L55:
            java.lang.String r0 = "system"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L52
        L5d:
            com.facebook.aura.status.repo.ActivityAction$ActivityCategory r0 = com.facebook.aura.status.repo.ActivityAction.ActivityCategory.LIFECYCLE
            return r0
        L60:
            com.facebook.aura.status.repo.ActivityAction$ActivityCategory r0 = com.facebook.aura.status.repo.ActivityAction.ActivityCategory.MESSAGE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.inferCategoryFromSubject(java.lang.String, com.facebook.aura.status.repo.ActivityNote):com.facebook.aura.status.repo.ActivityAction$ActivityCategory");
    }

    private final ActivityAction.ActivityType inferTypeFromSubject(String str) {
        if (C7BY.A0q(str, "feed_generate", false)) {
            return ActivityAction.ActivityType.MESSAGE_SENT;
        }
        if (!C7BY.A0q(str, "turn_complete", false) && !C7BY.A0q(str, "tool_calls", false)) {
            if (C7BY.A0q(str, "commit", false)) {
                return ActivityAction.ActivityType.GIT_COMMIT;
            }
            if (C7BY.A0q(str, "file", false)) {
                return ActivityAction.ActivityType.FILE_UPDATED;
            }
        }
        return ActivityAction.ActivityType.RUN;
    }

    public static /* synthetic */ Object loadActions$default(ActivityDataSource activityDataSource, int i, boolean z, boolean z2, HtJ htJ, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        return activityDataSource.loadActions(i, AnonymousClass001.A1Q(i2, z), AnonymousClass005.A1O(i2, z2), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onGatewayReconnected(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.status.repo.ActivityDataSource.C140191
            if (r0 == 0) goto L26
            r6 = r8
            com.facebook.aura.status.repo.ActivityDataSource$onGatewayReconnected$1 r6 = (com.facebook.aura.status.repo.ActivityDataSource.C140191) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L31
            if (r1 != r0) goto L2c
            java.lang.Object r2 = r6.L$0
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            X.Hwg.A00(r5)
            goto L41
        L26:
            com.facebook.aura.status.repo.ActivityDataSource$onGatewayReconnected$1 r6 = new com.facebook.aura.status.repo.ActivityDataSource$onGatewayReconnected$1
            r6.<init>(r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r5)
            X.BLa r2 = r7.goalEventMutex
            r6.L$0 = r2
            r6.label = r0
            java.lang.Object r0 = r2.APs(r3, r6)
            if (r0 != r4) goto L41
            return r4
        L41:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r7.lastGoalEventSeqs     // Catch: java.lang.Throwable -> L74
            r0.clear()     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.HoC> r0 = r7.goalPreviewRefreshJobs     // Catch: java.lang.Throwable -> L74
            java.util.Iterator r1 = X.C60P.A1R(r0)     // Catch: java.lang.Throwable -> L74
        L4c:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L74
            X.HoC r0 = (X.HoC) r0     // Catch: java.lang.Throwable -> L74
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Throwable -> L74
            r0.A5w(r3)     // Catch: java.lang.Throwable -> L74
            goto L4c
        L5f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.HoC> r0 = r7.goalPreviewRefreshJobs     // Catch: java.lang.Throwable -> L74
            r0.clear()     // Catch: java.lang.Throwable -> L74
            r2.Ahe(r3)
            X.3Em<com.facebook.aura.status.repo.ActivityGoalUpdate> r1 = r7._goalUpdates
            com.facebook.aura.status.repo.ActivityGoalUpdate r0 = new com.facebook.aura.status.repo.ActivityGoalUpdate
            r0.<init>(r3, r3)
            r1.AhV(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L74:
            r0 = move-exception
            r2.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.onGatewayReconnected(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityAction parseActivityEntry(ActivityEntry activityEntry) {
        String str;
        String str2;
        String str3;
        if (activityEntry.timestamp != null) {
            return parseNewFormatEntry(activityEntry);
        }
        Long l = activityEntry.tsMs;
        AHD ahdA07 = null;
        if (l != null) {
            Date date = new Date(l.longValue());
            String str4 = activityEntry.hash;
            if (str4 != null) {
                String str5 = activityEntry.subject;
                if (str5 == null) {
                    str5 = "";
                }
                ActivityAction.ActivityType activityTypeInferTypeFromSubject = inferTypeFromSubject(str5);
                ActivityAction.ActivityCategory activityCategoryInferCategoryFromSubject = inferCategoryFromSubject(str5, activityEntry.note);
                ActivityNote activityNote = activityEntry.note;
                if (activityNote != null) {
                    str = activityNote.title;
                    str2 = activityNote.summary;
                } else {
                    str = null;
                    str2 = null;
                }
                ActivityAction.ActivityStatus activityStatus = ActivityAction.ActivityStatus.SUCCESS;
                String str6 = activityEntry.hash;
                boolean zA0q = C7BY.A0q(str5, "changed_files", false);
                AHI ahi = AHI.A01;
                ActivityNote activityNote2 = activityEntry.note;
                if (activityNote2 != null) {
                    str3 = activityNote2.tag;
                    List<String> list = activityNote2.highlights;
                    if (list != null) {
                        ahdA07 = AGI.A07(list);
                    }
                } else {
                    str3 = null;
                }
                return new ActivityAction(str4, date, activityTypeInferTypeFromSubject, str, str2, str5, activityStatus, null, str6, activityCategoryInferCategoryFromSubject, zA0q, ahi, null, null, str3, ahdA07, null, null, null);
            }
        }
        return null;
    }

    private final ActivityAction parseNewFormatEntry(ActivityEntry activityEntry) {
        ActivityDetails activityDetails;
        List<String> list;
        List<ActivityFile> list2;
        Date isoTimestampToDate = ActivityTimestampParserKt.parseIsoTimestampToDate(activityEntry.timestamp);
        if (isoTimestampToDate == null) {
            CFK.A06(ActivityDataSourceKt.TAG, FGI.A0M("Failed to parse timestamp: ", activityEntry.timestamp));
            return null;
        }
        String str = activityEntry.type;
        if (str == null) {
            str = "";
        }
        ActivityAction.ActivityType activityType = parseActivityType(str);
        String str2 = activityEntry.status;
        if (str2 == null) {
            str2 = "";
        }
        ActivityAction.ActivityStatus activityStatus = parseActivityStatus(str2);
        String strA0h = activityEntry.turnId;
        if (strA0h == null && (strA0h = activityEntry.hash) == null) {
            String str3 = activityEntry.timestamp;
            String str4 = activityEntry.title;
            strA0h = FGI.A0h(str3, "_", str, "_", str4 != null ? str4 : "");
        }
        String str5 = activityEntry.title;
        String str6 = activityEntry.subtitle;
        ActivityDetails activityDetails2 = activityEntry.details;
        return new ActivityAction(strA0h, isoTimestampToDate, activityType, str5, str6, null, activityStatus, null, activityDetails2 != null ? activityDetails2.commit : null, inferCategoryFromType(str), ((activityDetails2 == null || (list2 = activityDetails2.files) == null || list2.isEmpty()) && ((activityDetails = activityEntry.details) == null || (list = activityDetails.createdFiles) == null || list.isEmpty())) ? false : true, AHI.A01, null, null, str, null, activityEntry.turnId, activityEntry.taskLabel, activityEntry.details);
    }

    private final void refreshGoalPreview(String str) {
        HtJ htJA13 = AnonymousClass006.A13(this.goalPreviewRefreshJobs.remove(str));
        this.goalPreviewRefreshJobs.put(str, AnonymousClass001.A11(new C140201(str, htJA13), this.scope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceGoalPreview(String str, List<ActivityGoalAction> list) {
        ActivityData value;
        ActivityData activityData;
        ArrayList arrayListA0m;
        BLG<ActivityData> blg = this._data;
        do {
            value = blg.getValue();
            activityData = value;
            AHD<TimelineDayGroup> ahd = activityData.days;
            arrayListA0m = AnonymousClass002.A0m(ahd);
            for (TimelineDayGroup timelineDayGroup : ahd) {
                AHD<ActivityAction> ahd2 = timelineDayGroup.activities;
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
                for (ActivityAction activityActionWithGoalActions : ahd2) {
                    if (C7384Etj.areEqual(ActivityDataSourceKt.lazyGoalId(activityActionWithGoalActions), str)) {
                        activityActionWithGoalActions = ActivityDataSourceKt.withGoalActions(activityActionWithGoalActions, list);
                    }
                    arrayListA0m2.add(activityActionWithGoalActions);
                }
                arrayListA0m.add(timelineDayGroup.copy(timelineDayGroup.date, timelineDayGroup.count, AGI.A07(arrayListA0m2)));
            }
        } while (!blg.A6e(value, activityData.copy(AGI.A07(arrayListA0m), activityData.hasMore, activityData.isLoading, activityData.isLoadingMore, activityData.isRefreshing, activityData.error, activityData.nextCursor)));
    }

    private final void setupActivitySubscription() {
        try {
            HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
            C3UX c3ux = this.scope;
            C140211 c140211 = new C140211(gateway, this, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, c140211, c3ux);
            GAo.A02(num, c6ys, new C140222(gateway, this, null), this.scope);
        } catch (Exception e) {
            CFK.A06(ActivityDataSourceKt.TAG, FGI.A0M("Failed to setup activity subscription: ", e.getMessage()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        r6.set(r8, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144 A[EDGE_INSN: B:75:0x0144->B:50:0x0144 BREAK  A[LOOP:5: B:43:0x010b->B:49:0x0141], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void upsertTimelineAction(com.facebook.aura.status.repo.ActivityAction r23, com.facebook.aura.status.repo.GoalActionsUpsert r24) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.upsertTimelineAction(com.facebook.aura.status.repo.ActivityAction, com.facebook.aura.status.repo.GoalActionsUpsert):void");
    }

    public final void clearData() {
        AnonymousClass001.A1E(this._data, null, new ActivityData(AHI.A01, false, false, false, false, null, null));
    }

    public final C1BN<ActivityData> getData() {
        return this.data;
    }

    public final C22I<ActivityGoalUpdate> getGoalUpdates() {
        return this.goalUpdates;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r2._data.getValue().isLoading == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[LOOP:0: B:27:0x006d->B:52:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[LOOP:1: B:32:0x00ac->B:54:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadActions(int r19, boolean r20, boolean r21, X.HtJ<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.loadActions(int, boolean, boolean, X.HtJ):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 java.lang.String, still in use, count: 2, list:
          (r1v4 java.lang.String) from 0x0048: IF  (r1v4 java.lang.String) == (null java.lang.String)  -> B:12:0x0026 A[HIDDEN] (LINE:72)
          (r1v4 java.lang.String) from 0x004c: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:21:0x004b, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMore(X.HtJ<? super kotlin.Unit> r16) {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.status.repo.ActivityDataSource.C140181
            if (r0 == 0) goto L96
            r4 = r3
            com.facebook.aura.status.repo.ActivityDataSource$loadMore$1 r4 = (com.facebook.aura.status.repo.ActivityDataSource.C140181) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r13 = 0
            r2 = 2
            r11 = 1
            if (r0 == 0) goto L29
            if (r0 == r11) goto L7a
            if (r0 != r2) goto L9d
            X.Hwg.A00(r1)
        L26:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L29:
            X.Hwg.A00(r1)
            X.BLG<com.facebook.aura.status.repo.ActivityData> r0 = r15._data
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.status.repo.ActivityData r0 = (com.facebook.aura.status.repo.ActivityData) r0
            boolean r0 = r0.isLoadingMore
            if (r0 != 0) goto L26
            X.BLG<com.facebook.aura.status.repo.ActivityData> r0 = r15._data
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.status.repo.ActivityData r0 = (com.facebook.aura.status.repo.ActivityData) r0
            java.lang.String r5 = r0.nextCursor
            if (r5 != 0) goto L4b
            java.lang.String r1 = r15.getOldestTimestamp()
            if (r1 != 0) goto L4c
            goto L26
        L4b:
            r1 = r13
        L4c:
            X.BLG<com.facebook.aura.status.repo.ActivityData> r6 = r15._data
        L4e:
            java.lang.Object r0 = r6.getValue()
            r7 = r0
            com.facebook.aura.status.repo.ActivityData r7 = (com.facebook.aura.status.repo.ActivityData) r7
            X.AHD<com.facebook.aura.status.repo.TimelineDayGroup> r8 = r7.days
            boolean r9 = r7.hasMore
            boolean r10 = r7.isLoading
            boolean r12 = r7.isRefreshing
            java.lang.String r14 = r7.nextCursor
            com.facebook.aura.status.repo.ActivityData r7 = r7.copy(r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r6.A6e(r0, r7)
            if (r0 == 0) goto L4e
            r4.L$0 = r13
            r4.L$1 = r13
            r4.L$2 = r15
            r4.label = r11
            r0 = 15
            java.lang.Object r1 = r15.executeLoadActions(r0, r5, r1, r4)
            if (r1 != r3) goto L81
            return r3
        L7a:
            java.lang.Object r15 = r4.L$2
            com.facebook.aura.status.repo.ActivityDataSource r15 = (com.facebook.aura.status.repo.ActivityDataSource) r15
            X.Hwg.A00(r1)
        L81:
            com.facebook.aura.status.repo.ActivityPage r1 = (com.facebook.aura.status.repo.ActivityPage) r1
            X.9jH r0 = X.AGH.A0E()
            r4.L$0 = r13
            r4.L$1 = r13
            r4.L$2 = r13
            r4.label = r2
            java.lang.Object r0 = r15.applyPage(r1, r11, r0, r4)
            if (r0 != r3) goto L26
            return r3
        L96:
            com.facebook.aura.status.repo.ActivityDataSource$loadMore$1 r4 = new com.facebook.aura.status.repo.ActivityDataSource$loadMore$1
            r4.<init>(r3)
            goto L14
        L9d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.loadMore(X.HtJ):java.lang.Object");
    }

    public final Object refresh(boolean z, HtJ<? super Unit> htJ) {
        Object objLoadActions;
        return (this._data.getValue().isRefreshing || (objLoadActions = loadActions(15, z ^ true, z, htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objLoadActions;
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final ActivityDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ActivityDataSource) abstractC3358CGz.A03(ActivityDataSource.class, new ActivityDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ActivityDataSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C78T.A01(AnonymousClass001.A0y(), null);
        C9286GCn c9286GCnA14 = C3cG.A14(new ActivityData(AHI.A01, false, false, false, false, null, null));
        this._data = c9286GCnA14;
        this.data = C3cG.A11(c9286GCnA14);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 16);
        this._goalUpdates = c9290GCrA12;
        this.goalUpdates = C3pd.A00(c9290GCrA12);
        this.goalEventMutex = new C9258GBl();
        this.lastGoalEventSeqs = C60O.A1C();
        this.untrustedGoalPreviews = ConcurrentHashMap.newKeySet();
        this.goalPreviewRefreshJobs = C60O.A1C();
        setupActivitySubscription();
    }

    private final AHD<TimelineDayGroup> appendTimelineDays(AHD<TimelineDayGroup> ahd, AHD<TimelineDayGroup> ahd2) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (TimelineDayGroup timelineDayGroup : ahd) {
            ((List) C60R.A0Z(timelineDayGroup.date, linkedHashMapA0j)).addAll(timelineDayGroup.activities);
        }
        for (TimelineDayGroup timelineDayGroup2 : ahd2) {
            List list = (List) C60R.A0Z(timelineDayGroup2.date, linkedHashMapA0j);
            for (ActivityAction activityAction : timelineDayGroup2.activities) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (C7384Etj.areEqual(((ActivityAction) it.next()).id, activityAction.id)) {
                            break;
                        }
                    }
                }
                list.add(activityAction);
            }
        }
        Set setEntrySet = linkedHashMapA0j.entrySet();
        C7384Etj.A0U(setEntrySet);
        List listA0c = AbstractC0878AGe.A0c(setEntrySet, new Comparator() { // from class: com.facebook.aura.status.repo.ActivityDataSource$appendTimelineDays$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00(C60O.A0t((Map.Entry) t2), C60O.A0t((Map.Entry) t));
            }
        });
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0c);
        Iterator it2 = listA0c.iterator();
        while (it2.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it2);
            C7384Etj.A0X(entryA0l);
            Object key = entryA0l.getKey();
            C7384Etj.A0U(key);
            Object value = entryA0l.getValue();
            C7384Etj.A0U(value);
            AHD ahdA07 = AGI.A07(AbstractC0878AGe.A0c((Iterable) value, new Comparator() { // from class: com.facebook.aura.status.repo.ActivityDataSource$appendTimelineDays$lambda$4$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC7536F0j.A00(((ActivityAction) t2).timestamp, ((ActivityAction) t).timestamp);
                }
            }));
            arrayListA0i.add(new TimelineDayGroup((String) key, ahdA07.size(), ahdA07));
        }
        return AGI.A07(arrayListA0i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object executeLoadActions(int i, String str, String str2, HtJ<? super ActivityPage> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, i, str2, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final ActivityAction.ActivityCategory inferCategoryFromType(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1286114096:
                str2 = "message_sent";
                break;
            case 1019277555:
                if (str.equals("web_search")) {
                    return ActivityAction.ActivityCategory.TOOL;
                }
                return ActivityAction.ActivityCategory.LIFECYCLE;
            case 1318657627:
                str2 = "email_sent";
                break;
            default:
                return ActivityAction.ActivityCategory.LIFECYCLE;
        }
        if (str.equals(str2)) {
            return ActivityAction.ActivityCategory.MESSAGE;
        }
        return ActivityAction.ActivityCategory.LIFECYCLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityUpdated(com.facebook.aura.status.repo.ActivityAction r11, com.facebook.aura.gateway.ActivityUpdatedEvent r12) {
        /*
            r10 = this;
            java.lang.String r3 = com.facebook.aura.status.repo.ActivityDataSourceKt.lazyGoalId(r11)
            if (r3 != 0) goto Lc
            com.facebook.aura.status.repo.GoalActionsUpsert$Replace r0 = com.facebook.aura.status.repo.GoalActionsUpsert.Replace.INSTANCE
            r10.upsertTimelineAction(r11, r0)
            return
        Lc:
            java.lang.Long r6 = r12.seq
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r10.lastGoalEventSeqs
            java.lang.Object r9 = r0.get(r3)
            java.lang.Number r9 = (java.lang.Number) r9
            if (r6 == 0) goto L27
            if (r9 == 0) goto L27
            long r4 = r6.longValue()
            long r1 = r9.longValue()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L27
            return
        L27:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r10.lastGoalEventSeqs
            if (r6 == 0) goto Lb5
            r0.put(r3, r6)
        L2e:
            kotlinx.serialization.json.JsonObject r0 = r12.payload
            com.facebook.aura.status.repo.GoalActionsDelta r8 = com.facebook.aura.status.repo.ActivityDataSourceJsonKt.goalActionsDelta(r0)
            r2 = 0
            if (r8 != 0) goto L59
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.HoC> r0 = r10.goalPreviewRefreshJobs
            java.lang.Object r0 = r0.remove(r3)
            X.HoC r0 = (X.HoC) r0
            if (r0 == 0) goto L44
            r0.A5w(r2)
        L44:
            java.util.concurrent.ConcurrentHashMap$KeySetView<java.lang.String, java.lang.Boolean> r0 = r10.untrustedGoalPreviews
            r0.remove(r3)
            com.facebook.aura.status.repo.GoalActionsUpsert$Replace r0 = com.facebook.aura.status.repo.GoalActionsUpsert.Replace.INSTANCE
            r10.upsertTimelineAction(r11, r0)
        L4e:
            X.3Em<com.facebook.aura.status.repo.ActivityGoalUpdate> r1 = r10._goalUpdates
            com.facebook.aura.status.repo.ActivityGoalUpdate r0 = new com.facebook.aura.status.repo.ActivityGoalUpdate
            r0.<init>(r3, r2)
            r1.AhV(r0)
            return
        L59:
            if (r6 == 0) goto La7
            java.lang.Long r0 = r8.baseSeq
            if (r0 == 0) goto La7
            long r6 = r0.longValue()
            if (r9 == 0) goto La7
            long r4 = r9.longValue()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto La7
            java.util.concurrent.ConcurrentHashMap$KeySetView<java.lang.String, java.lang.Boolean> r0 = r10.untrustedGoalPreviews
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto La7
            java.util.Set<java.lang.String> r1 = r8.removedIds
            com.facebook.aura.status.repo.GoalActionsUpsert$Merge r0 = new com.facebook.aura.status.repo.GoalActionsUpsert$Merge
            r0.<init>(r1)
            r10.upsertTimelineAction(r11, r0)
            com.facebook.aura.status.repo.ActivityDetails r0 = r11.details
            if (r0 == 0) goto L87
            java.util.List<com.facebook.aura.status.repo.ActivityGoalAction> r1 = r0.goalActions
            if (r1 != 0) goto L89
        L87:
            X.AGi r1 = X.C0881AGi.A00
        L89:
            java.util.Set<java.lang.String> r0 = r8.removedIds
            java.util.Set r2 = X.AbstractC0878AGe.A0f(r0)
            java.util.Iterator r1 = r1.iterator()
        L93:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r1.next()
            com.facebook.aura.status.repo.ActivityGoalAction r0 = (com.facebook.aura.status.repo.ActivityGoalAction) r0
            java.lang.String r0 = r0.id
            if (r0 == 0) goto L93
            r2.add(r0)
            goto L93
        La7:
            java.util.concurrent.ConcurrentHashMap$KeySetView<java.lang.String, java.lang.Boolean> r0 = r10.untrustedGoalPreviews
            r0.add(r3)
            com.facebook.aura.status.repo.GoalActionsUpsert$KeepPrevious r0 = com.facebook.aura.status.repo.GoalActionsUpsert.KeepPrevious.INSTANCE
            r10.upsertTimelineAction(r11, r0)
            r10.refreshGoalPreview(r3)
            goto L4e
        Lb5:
            r0.remove(r3)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.ActivityDataSource.onActivityUpdated(com.facebook.aura.status.repo.ActivityAction, com.facebook.aura.gateway.ActivityUpdatedEvent):void");
    }

    private final ActivityAction.ActivityStatus parseActivityStatus(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1867169789) {
            if (iHashCode != -682587753) {
                if (iHashCode == 96784904 && str.equals("error")) {
                    return ActivityAction.ActivityStatus.ERROR;
                }
            } else if (str.equals(PairsPendingLevelStoreKt.STATE_PENDING)) {
                return ActivityAction.ActivityStatus.PENDING;
            }
        }
        return ActivityAction.ActivityStatus.SUCCESS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final ActivityAction.ActivityType parseActivityType(String str) {
        switch (str.hashCode()) {
            case -2051171067:
                if (str.equals("task_running")) {
                    return ActivityAction.ActivityType.TASK_RUNNING;
                }
                break;
            case -1286114096:
                if (str.equals("message_sent")) {
                    return ActivityAction.ActivityType.MESSAGE_SENT;
                }
                break;
            case -30792939:
                if (str.equals("reminder_set")) {
                    return ActivityAction.ActivityType.REMINDER_SET;
                }
                break;
            case 3178259:
                if (str.equals(ReplyAttributionSerializer.TYPE_GOAL)) {
                    return ActivityAction.ActivityType.GOAL;
                }
                break;
            case 791101688:
                if (str.equals("file_updated")) {
                    return ActivityAction.ActivityType.FILE_UPDATED;
                }
                break;
            case 1019277555:
                if (str.equals("web_search")) {
                    return ActivityAction.ActivityType.WEB_SEARCH;
                }
                break;
            case 1318657627:
                if (str.equals("email_sent")) {
                    return ActivityAction.ActivityType.EMAIL_SENT;
                }
                break;
            case 2054086437:
                if (str.equals("file_created")) {
                    return ActivityAction.ActivityType.FILE_CREATED;
                }
                break;
            case 2085979716:
                if (str.equals("git_commit")) {
                    return ActivityAction.ActivityType.GIT_COMMIT;
                }
                break;
        }
        return ActivityAction.ActivityType.UNKNOWN;
    }

    public final String bugReportSummary() {
        String strA0r;
        int i;
        StringBuilder sbA0w = C60O.A0w();
        ActivityData value = this._data.getValue();
        AHD<TimelineDayGroup> ahd = value.days;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(((TimelineDayGroup) it.next()).activities, arrayListA0h);
        }
        sbA0w.append(FGI.A0T("days: ", ", actions: ", value.days.size(), arrayListA0h.size()));
        sbA0w.append('\n');
        boolean z = value.isLoading;
        boolean z2 = value.isLoadingMore;
        boolean z3 = value.isRefreshing;
        boolean z4 = value.hasMore;
        StringBuilder sbA10 = C60O.A10("isLoading=", z);
        sbA10.append(" isLoadingMore=");
        sbA10.append(z2);
        sbA10.append(" isRefreshing=");
        sbA10.append(z3);
        sbA0w.append(C60P.A1P(" hasMore=", sbA10, z4));
        sbA0w.append('\n');
        ActivityError activityError = value.error;
        if (activityError == null) {
            strA0r = "(none)";
        } else if (activityError instanceof ActivityError.MissingCredentials) {
            strA0r = "MissingCredentials";
        } else if (activityError instanceof ActivityError.InvalidResponse) {
            strA0r = "InvalidResponse";
        } else if (activityError instanceof ActivityError.ApiError) {
            strA0r = "ApiError";
        } else {
            if (!(activityError instanceof ActivityError.NetworkError)) {
                throw C3cG.A0q();
            }
            strA0r = C60O.A0r("NetworkError(", C3cI.A0Y(((ActivityError.NetworkError) activityError).exception));
        }
        C60Q.A1L("error: ", strA0r, sbA0w);
        ActivityAction.ActivityStatus[] activityStatusArrValues = ActivityAction.ActivityStatus.values();
        int iA0H = AIW.A0H(activityStatusArrValues.length);
        if (iA0H < 16) {
            iA0H = 16;
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(iA0H);
        for (ActivityAction.ActivityStatus activityStatus : activityStatusArrValues) {
            if ((arrayListA0h instanceof Collection) && arrayListA0h.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = arrayListA0h.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((ActivityAction) it2.next()).status == activityStatus && (i = i + 1) < 0) {
                        AbstractC0885AGm.A13();
                        throw F60.createAndThrow();
                    }
                }
            }
            linkedHashMapA15.put(activityStatus, Integer.valueOf(i));
        }
        C60Q.A1L("status counts: ", AbstractC06907md.A01(", ", linkedHashMapA15.entrySet(), ActivityDataSource$bugReportSummary$1$1.INSTANCE), sbA0w);
        List<ActivityAction> listA0a = AbstractC0878AGe.A0a(AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.status.repo.ActivityDataSource$bugReportSummary$lambda$0$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00(((ActivityAction) t2).timestamp, ((ActivityAction) t).timestamp);
            }
        }), 20);
        if (listA0a.isEmpty()) {
            sbA0w.append("recent actions: (none)\n");
        } else {
            SimpleDateFormat simpleDateFormatA0k = C60R.A0k("yyyy-MM-dd'T'HH:mm:ss'Z'");
            sbA0w.append("recent actions (most recent first, max 20):\n");
            for (ActivityAction activityAction : listA0a) {
                String str = simpleDateFormatA0k.format(activityAction.timestamp);
                ActivityAction.ActivityType activityType = activityAction.type;
                ActivityAction.ActivityStatus activityStatus2 = activityAction.status;
                ActivityAction.ActivityCategory activityCategory = activityAction.category;
                String str2 = activityAction.turnId;
                if (str2 == null) {
                    str2 = "-";
                }
                String str3 = activityAction.id;
                StringBuilder sbA0x = C3cI.A0x("  ", str);
                sbA0x.append(" | ");
                sbA0x.append(activityType);
                sbA0x.append(" | ");
                sbA0x.append(activityStatus2);
                sbA0x.append(" | ");
                sbA0x.append(activityCategory);
                sbA0x.append(" | turnId=");
                sbA0x.append(str2);
                sbA0w.append(C60P.A1M(" | id=", str3, sbA0x));
                sbA0w.append('\n');
            }
        }
        return sbA0w.toString();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        clearData();
    }

    public final Object loadActivityDetail(String str, HtJ<? super ActivityDetailResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C140152(str, this, null));
    }

    public final Object loadGoalActionReport(String str, String str2, long j, HtJ<? super ActivityGoalActionReportChunk> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C140162(str, str2, this, j, null));
    }

    public final Object loadGoalActions(String str, String str2, HtJ<? super ActivityGoalActionsResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C140172(str, this, str2, null));
    }

    public /* synthetic */ ActivityDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
