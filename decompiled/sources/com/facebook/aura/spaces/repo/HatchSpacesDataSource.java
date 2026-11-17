package com.facebook.aura.spaces.repo;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7536F0j;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3pd;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C7Je;
import X.C9286GCn;
import X.C9290GCr;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC7549F2g;
import android.net.Uri;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.gateway.FeedUpdateEvent;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.VmAuthTokenKt;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.HatchHttpStreamRequestFailure;
import com.facebook.aura.network.http.HatchHttpStreamRequestResult;
import com.facebook.aura.network.http.HatchHttpStreamRequestSuccess;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseBody;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.spaces.repo.SpaceExportResult;
import com.facebook.aura.spaces.repo.SpacesJarvisPath;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes3.dex */
public final class HatchSpacesDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<HatchSpacesData> _data;
    public final C3Em<String> _spacesContentUpdatedEvents;
    public AHD<SpaceCard> allSpaceCards;
    public final C1BN<HatchSpacesData> data;
    public final Set<String> dismissedCardIds;
    public final HatchNavTTRCCoordinator navTtrcCoordinator;
    public final SpacesListPersistedStore persistedStore;
    public final C22I<String> spacesContentUpdatedEvents;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource", f = "HatchSpacesDataSource.kt", l = {331, 338}, m = "deleteSpace", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpace$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchSpacesDataSource.this.deleteSpace(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource", f = "HatchSpacesDataSource.kt", l = {782}, m = "deleteSpaceViaJarvis", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpaceViaJarvis$1, reason: invalid class name and case insensitive filesystem */
    public final class C139151 extends HzP {
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

        public C139151(HtJ<? super C139151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchSpacesDataSource.this.deleteSpaceViaJarvis(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$fetchExportHtml$2", f = "HatchSpacesDataSource.kt", l = {594}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$fetchExportHtml$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SpaceExportResult>, Object> {
        public final /* synthetic */ SpacesJarvisPath $endpoint;
        public final /* synthetic */ G0U<InputStream, Uri> $save;
        public int label;
        public final /* synthetic */ HatchSpacesDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(SpacesJarvisPath spacesJarvisPath, HatchSpacesDataSource hatchSpacesDataSource, G0U<? super InputStream, ? extends Uri> g0u, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$endpoint = spacesJarvisPath;
            this.this$0 = hatchSpacesDataSource;
            this.$save = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$endpoint, this.this$0, this.$save, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchSpacesDataSource$fetchExportHtml$2$result$1 hatchSpacesDataSource$fetchExportHtml$2$result$1 = new HatchSpacesDataSource$fetchExportHtml$2$result$1(this.$endpoint, this.this$0, null);
                    this.label = 1;
                    obj = GAX.A00(this, hatchSpacesDataSource$fetchExportHtml$2$result$1, 60000L);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                HatchHttpStreamRequestResult hatchHttpStreamRequestResult = (HatchHttpStreamRequestResult) obj;
                if (!(hatchHttpStreamRequestResult instanceof HatchHttpStreamRequestSuccess)) {
                    if (!(hatchHttpStreamRequestResult instanceof HatchHttpStreamRequestFailure)) {
                        throw C3cG.A0q();
                    }
                    CFK.A0H("HatchSpacesDataSource", "GET /%s failed: %s", this.$endpoint.getValue(), ((HatchHttpStreamRequestFailure) hatchHttpStreamRequestResult).failure.getLogValue());
                    return SpaceExportResult.Failed.INSTANCE;
                }
                HatchHttpResponseStream hatchHttpResponseStream = ((HatchHttpStreamRequestSuccess) hatchHttpStreamRequestResult).response;
                SpacesJarvisPath spacesJarvisPath = this.$endpoint;
                G0U<InputStream, Uri> g0u = this.$save;
                try {
                    int i2 = hatchHttpResponseStream.statusCode;
                    if (i2 == 400) {
                        CFK.A0H("HatchSpacesDataSource", "GET /%s returned 400 (not exportable)", spacesJarvisPath.getValue());
                        SpaceExportResult.NotExportable notExportable = SpaceExportResult.NotExportable.INSTANCE;
                        hatchHttpResponseStream.close();
                        return notExportable;
                    }
                    if (i2 == 404) {
                        spacesJarvisPath.getValue();
                        SpaceExportResult.NotBuilt notBuilt = SpaceExportResult.NotBuilt.INSTANCE;
                        hatchHttpResponseStream.close();
                        return notBuilt;
                    }
                    InputStream inputStream = hatchHttpResponseStream.body;
                    if (!hatchHttpResponseStream.isSuccessful || inputStream == null) {
                        CFK.A0H("HatchSpacesDataSource", "GET /%s returned HTTP %d", spacesJarvisPath.getValue(), C3cG.A0R(hatchHttpResponseStream.statusCode));
                        SpaceExportResult.Failed failed = SpaceExportResult.Failed.INSTANCE;
                        hatchHttpResponseStream.close();
                        return failed;
                    }
                    String strA0p = C60O.A0p("Content-Type", hatchHttpResponseStream.headers);
                    if (strA0p == null) {
                        strA0p = "";
                    }
                    if (C7BY.A0q(strA0p, "application/json", true)) {
                        CFK.A0H("HatchSpacesDataSource", "GET /%s returned JSON, not an export", spacesJarvisPath.getValue());
                        SpaceExportResult.NotExportable notExportable2 = SpaceExportResult.NotExportable.INSTANCE;
                        hatchHttpResponseStream.close();
                        return notExportable2;
                    }
                    Uri uriInvoke = g0u.invoke(inputStream);
                    Object saved = uriInvoke != null ? new SpaceExportResult.Saved(uriInvoke) : SpaceExportResult.SaveFailed.INSTANCE;
                    hatchHttpResponseStream.close();
                    return saved;
                } finally {
                }
            } catch (TimeoutCancellationException unused) {
                CFK.A0H("HatchSpacesDataSource", "GET /%s timed out", this.$endpoint.getValue());
                return SpaceExportResult.Failed.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SpaceExportResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$fetchSpace$2", f = "HatchSpacesDataSource.kt", l = {529}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$fetchSpace$2, reason: invalid class name and case insensitive filesystem */
    public final class C139162 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SpaceCard>, Object> {
        public final /* synthetic */ String $slug;
        public int label;
        public final /* synthetic */ HatchSpacesDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139162(String str, HatchSpacesDataSource hatchSpacesDataSource, HtJ<? super C139162> htJ) {
            super(2, htJ);
            this.$slug = str;
            this.this$0 = hatchSpacesDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C139162(this.$slug, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String message;
            StringBuilder sbA0x;
            String str;
            SpaceEntryJson singleSpaceResponse;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                    String strEncode = Uri.encode(this.$slug);
                    C7384Etj.A0U(strEncode);
                    this.label = 1;
                    obj = hatchHttpApi.makeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY(new SpacesJarvisPath.Space(strEncode), RequestType.GET, this.this$0.userSession, null, new HxE[0], null, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) obj;
                if (hatchHttpResponse == null) {
                    C60Q.A1J("GET /spaces/", this.$slug, " returned null response", "HatchSpacesDataSource");
                    return null;
                }
                int i2 = hatchHttpResponse.statusCode;
                if (i2 != 200) {
                    String str2 = this.$slug;
                    if (i2 != 404) {
                        CFK.A06("HatchSpacesDataSource", FGI.A0V("GET /spaces/", str2, " returned HTTP ", i2));
                    }
                    return null;
                }
                try {
                    HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
                    if (hatchHttpResponseBodyBody != null) {
                        String strString = hatchHttpResponseBodyBody.string();
                        if (strString != null && !C7BY.A0j(strString) && (singleSpaceResponse = HatchSpacesDataSourceJsonKt.parseSingleSpaceResponse(strString)) != null) {
                            return this.this$0.spaceEntryToCard(singleSpaceResponse);
                        }
                    }
                    return null;
                } catch (Exception e) {
                    String str3 = this.$slug;
                    message = e.getMessage();
                    sbA0x = C3cI.A0x("GET /spaces/", str3);
                    str = " body read failed: ";
                    CFK.A06("HatchSpacesDataSource", C60P.A1M(str, message, sbA0x));
                    return null;
                }
            } catch (Exception e2) {
                String str4 = this.$slug;
                message = e2.getMessage();
                sbA0x = C3cI.A0x("GET /spaces/", str4);
                str = " failed: ";
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SpaceCard> htJ) {
            return ((C139162) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$fetchSpaces$2", f = "HatchSpacesDataSource.kt", l = {HatchTransportHttpDataSourceKt.HTTP_RANGE_NOT_SATISFIABLE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$fetchSpaces$2, reason: invalid class name and case insensitive filesystem */
    public final class C139172 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super FetchSpacesResult>, Object> {
        public int label;

        public C139172(HtJ<? super C139172> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchSpacesDataSource.this.new C139172(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super FetchSpacesResult> htJ) {
            return HatchSpacesDataSource.this.new C139172(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchSpacesDataSource hatchSpacesDataSource = HatchSpacesDataSource.this;
                this.label = 1;
                obj = hatchSpacesDataSource.fetchSpacesViaJarvis(this);
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
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource", f = "HatchSpacesDataSource.kt", l = {782}, m = "fetchSpacesViaJarvis", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$fetchSpacesViaJarvis$1, reason: invalid class name and case insensitive filesystem */
    public final class C139181 extends HzP {
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
        public /* synthetic */ Object result;

        public C139181(HtJ<? super C139181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchSpacesDataSource.this.fetchSpacesViaJarvis(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$hydrateFromPersistedStore$1", f = "HatchSpacesDataSource.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$hydrateFromPersistedStore$1, reason: invalid class name and case insensitive filesystem */
    public final class C139191 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C139191(HtJ<? super C139191> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchSpacesDataSource.this.new C139191(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchSpacesDataSource.this.new C139191(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AHD<SpaceCard> ahdDistinctById;
            HatchSpacesData value;
            HatchSpacesData hatchSpacesData;
            boolean z;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SpacesListPersistedStore spacesListPersistedStore = HatchSpacesDataSource.this.persistedStore;
                this.label = 1;
                obj = spacesListPersistedStore.load(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AHD ahd = (AHD) obj;
            if (ahd != null && (ahdDistinctById = HatchSpacesDataSourceKt.distinctById(ahd)) != null) {
                BLG<HatchSpacesData> blg = HatchSpacesDataSource.this._data;
                do {
                    value = blg.getValue();
                    hatchSpacesData = value;
                    if (hatchSpacesData.loadingState == LoadingState.INITIAL && hatchSpacesData.spaceCards.isEmpty()) {
                        hatchSpacesData = new HatchSpacesData(ahdDistinctById, LoadingState.SUCCESS, hatchSpacesData.lastRefreshed, true);
                        z = true;
                    } else {
                        z = false;
                    }
                } while (!blg.A6e(value, hatchSpacesData));
                if (z) {
                    HatchSpacesDataSource.this.allSpaceCards = ahdDistinctById;
                    CFK.A05("HatchSpacesDataSource", FGI.A0I("Hydrated ", ahdDistinctById.size(), " spaces from persisted store"));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$persistFavoriteOrder$2", f = "HatchSpacesDataSource.kt", l = {806}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$persistFavoriteOrder$2, reason: invalid class name and case insensitive filesystem */
    public final class C139202 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ double $favoriteOrder;
        public final /* synthetic */ String $slug;
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
        public final /* synthetic */ HatchSpacesDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139202(String str, double d, HatchSpacesDataSource hatchSpacesDataSource, HtJ<? super C139202> htJ) {
            super(2, htJ);
            this.$slug = str;
            this.$favoriteOrder = d;
            this.this$0 = hatchSpacesDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C139202(this.$slug, this.$favoriteOrder, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    HatchSpacesDataSource$persistFavoriteOrder$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchSpacesDataSource$persistFavoriteOrder$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchSpacesDataSource$persistFavoriteOrder$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                    HatchSpacesDataSource$persistFavoriteOrder$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchSpacesDataSource$persistFavoriteOrder$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchSpacesDataSource$persistFavoriteOrder$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
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
                    objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchSpacesDataSource$persistFavoriteOrder$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchSpacesDataSource$persistFavoriteOrder$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, SpacesJarvisPath.SpacesFavorites.INSTANCE, new SpacesFavoritesRequestJson(this.$slug, this.$favoriteOrder), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                    if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                }
                z = !(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud);
            } catch (Exception e) {
                CFK.A08("HatchSpacesDataSource", C60P.A1L("spaces/favorites failed for slug=", this.$slug, e.getMessage()), e);
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C139202) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource", f = "HatchSpacesDataSource.kt", l = {238, 251, 287}, m = "refreshSpaceCards", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$refreshSpaceCards$1, reason: invalid class name and case insensitive filesystem */
    public final class C139211 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C139211(HtJ<? super C139211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchSpacesDataSource.this.refreshSpaceCards(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource", f = "HatchSpacesDataSource.kt", l = {711}, m = "reorderCard", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$reorderCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C139221 extends HzP {
        public double D$0;
        public double D$1;
        public double D$2;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C139221(HtJ<? super C139221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchSpacesDataSource.this.reorderCard(0, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$1", f = "HatchSpacesDataSource.kt", l = {381}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$1, reason: invalid class name and case insensitive filesystem */
    public final class C139231 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ HatchSpacesDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139231(HatchGatewayConnection hatchGatewayConnection, HatchSpacesDataSource hatchSpacesDataSource, HtJ<? super C139231> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = hatchSpacesDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C139231(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<FeedUpdateEvent> c22i = this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().feedUpdateEvents;
                final HatchSpacesDataSource hatchSpacesDataSource = this.this$0;
                C20Z<? super FeedUpdateEvent> c20z = new C20Z() { // from class: com.facebook.aura.spaces.repo.HatchSpacesDataSource.setupSpacesSubscription.1.1
                    public final Object emit(FeedUpdateEvent feedUpdateEvent, HtJ<? super Unit> htJ) {
                        Object objRefreshSpaceCards;
                        return (feedUpdateEvent.isGenerating || (objRefreshSpaceCards = hatchSpacesDataSource.refreshSpaceCards(htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objRefreshSpaceCards;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((FeedUpdateEvent) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
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
            return ((C139231) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$2", f = "HatchSpacesDataSource.kt", l = {389}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$2, reason: invalid class name and case insensitive filesystem */
    public final class C139242 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$2$1, reason: invalid class name */
        public final class AnonymousClass1<T> implements C20Z {
            public final /* synthetic */ HatchSpacesDataSource this$0;

            public AnonymousClass1(HatchSpacesDataSource hatchSpacesDataSource) {
                this.this$0 = hatchSpacesDataSource;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.String r10, X.HtJ<? super kotlin.Unit> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$2$1$emit$1
                    if (r0 == 0) goto L2a
                    r5 = r11
                    com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$2$1$emit$1 r5 = (com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$2$1$emit$1) r5
                    int r2 = r5.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L2a
                    int r2 = r2 - r1
                    r5.label = r2
                L12:
                    java.lang.Object r8 = r5.result
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r0 = r5.label
                    java.lang.String r3 = "HatchSpacesDataSource"
                    r6 = 3
                    r2 = 2
                    r7 = 1
                    if (r0 == 0) goto L30
                    if (r0 == r7) goto L58
                    if (r0 == r2) goto L79
                    if (r0 == r6) goto L79
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L2a:
                    com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$2$1$emit$1 r5 = new com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$2$1$emit$1
                    r5.<init>(r9, r11)
                    goto L12
                L30:
                    X.Hwg.A00(r8)
                    java.lang.String r1 = "Received spaces.updated event for slug="
                    java.lang.String r0 = ", triggering refresh"
                    java.lang.String r0 = X.FGI.A0U(r1, r10, r0)
                    X.CFK.A05(r3, r0)
                    com.facebook.aura.webview.HtmlWebViewPool$Companion r1 = com.facebook.aura.webview.HtmlWebViewPool.Companion
                    com.facebook.aura.spaces.repo.HatchSpacesDataSource r0 = r9.this$0
                    X.CGz r0 = r0.userSession
                    com.facebook.aura.webview.HtmlWebViewPool r0 = r1.getInstance(r0)
                    com.facebook.aura.spaces.repo.HatchSpacesDataSourceKt.evictSpacesForSlug(r0, r10)
                    com.facebook.aura.spaces.repo.HatchSpacesDataSource r0 = r9.this$0
                    r5.L$0 = r10
                    r5.label = r7
                    java.lang.Object r8 = com.facebook.aura.spaces.repo.HatchSpacesDataSource.access$fetchSpace(r0, r10, r5)
                    if (r8 != r4) goto L5e
                    return r4
                L58:
                    java.lang.Object r0 = r5.L$0
                    java.lang.String r10 = X.C3cG.A0d(r0, r8)
                L5e:
                    com.facebook.aura.spaces.repo.SpaceCard r8 = (com.facebook.aura.spaces.repo.SpaceCard) r8
                    com.facebook.aura.spaces.repo.HatchSpacesDataSource r1 = r9.this$0
                    r5.L$0 = r10
                    r0 = 0
                    r5.L$1 = r0
                    if (r8 == 0) goto L72
                    r5.label = r2
                    java.lang.Object r0 = com.facebook.aura.spaces.repo.HatchSpacesDataSource.access$mergeSingleSpace(r1, r8, r5)
                L6f:
                    if (r0 != r4) goto L7f
                    return r4
                L72:
                    r5.label = r6
                    java.lang.Object r0 = com.facebook.aura.spaces.repo.HatchSpacesDataSource.access$refreshSpaceCards(r1, r5)
                    goto L6f
                L79:
                    java.lang.Object r0 = r5.L$0
                    java.lang.String r10 = X.C3cG.A0d(r0, r8)
                L7f:
                    java.lang.String r0 = "Spaces refresh completed after spaces.updated event for slug="
                    X.C60Q.A1I(r0, r10, r3)
                    com.facebook.aura.spaces.repo.HatchSpacesDataSource r0 = r9.this$0
                    X.3Em<java.lang.String> r0 = r0._spacesContentUpdatedEvents
                    r0.AhV(r10)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.HatchSpacesDataSource.C139242.AnonymousClass1.emit(java.lang.String, X.HtJ):java.lang.Object");
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((String) obj, (HtJ<? super Unit>) htJ);
            }
        }

        public C139242(HtJ<? super C139242> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchSpacesDataSource.this.new C139242(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchSpacesDataSource.this.new C139242(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<String> c22i = SpacesGatewayEvents.Companion.getInstance(HatchSpacesDataSource.this.userSession).updates;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HatchSpacesDataSource.this);
                this.label = 1;
                if (c22i.collect(anonymousClass1, this) == enumC10460Hji) {
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
    }

    public final String buildSourceUrl(String str) {
        String strJarvisHttpBaseUrl;
        C7384Etj.A0Y(str, 0);
        String strA0m = C60O.A0m(HatchGatewayPrefsStore.Companion, this.userSession);
        String strVmBoundAuthToken = VmAuthTokenKt.vmBoundAuthToken(this.userSession);
        if (C7BY.A0j(strA0m) || C7BY.A0j(strVmBoundAuthToken) || (strJarvisHttpBaseUrl = HatchHttpApi.INSTANCE.jarvisHttpBaseUrl(strA0m)) == null) {
            return null;
        }
        return C7Je.A01(FGI.A0d(strJarvisHttpBaseUrl, "spaces/v2/", Uri.encode(str), CustomConnectorRegisterRepositoryKt.ROOT_PATH)).toString();
    }

    public final SpaceCard getSpaceCard(String str) {
        Object next;
        C7384Etj.A0Y(str, 0);
        Iterator it = this.allSpaceCards.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(((SpaceCard) next).id)) {
                break;
            }
        }
        return (SpaceCard) next;
    }

    public final String spaceUuidForSlug(String str) {
        Object next;
        C7384Etj.A0Y(str, 0);
        Iterator it = this.allSpaceCards.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(((SpaceCard) next).id)) {
                break;
            }
        }
        SpaceCard spaceCard = (SpaceCard) next;
        if (spaceCard != null) {
            return spaceCard.spaceId;
        }
        return null;
    }

    private final String buildSpaceStageUrl(String str, Long l) {
        String strJarvisHttpBaseUrl;
        String strA0m = C60O.A0m(HatchGatewayPrefsStore.Companion, this.userSession);
        String strVmBoundAuthToken = VmAuthTokenKt.vmBoundAuthToken(this.userSession);
        if (C7BY.A0j(strA0m) || C7BY.A0j(strVmBoundAuthToken) || (strJarvisHttpBaseUrl = HatchHttpApi.INSTANCE.jarvisHttpBaseUrl(strA0m)) == null) {
            return null;
        }
        Uri uriA01 = C7Je.A01(FGI.A0d(strJarvisHttpBaseUrl, "spaces/v2/", Uri.encode(str), CustomConnectorRegisterRepositoryKt.ROOT_PATH));
        C7384Etj.A0U(uriA01);
        if (l != null) {
            uriA01 = uriA01.buildUpon().appendQueryParameter(HatchSpacesDataSourceKt.VERSION_QUERY_PARAM, String.valueOf(l.longValue())).build();
        }
        return uriA01.toString();
    }

    private final void clearCache() {
        AHI ahi = AHI.A01;
        this.allSpaceCards = ahi;
        this.dismissedCardIds.clear();
        this.navTtrcCoordinator.clearObservedQuery(HatchNavTTRCSpec.Surface.SPACES, HatchNavTTRCSpec.Queries.SPACES_DATA);
        AnonymousClass001.A1E(this._data, null, new HatchSpacesData(ahi, LoadingState.INITIAL, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteSpaceViaJarvis(java.lang.String r19, java.lang.String r20, X.HtJ<? super java.lang.Boolean> r21) {
        /*
            r18 = this;
            r4 = r21
            boolean r0 = r4 instanceof com.facebook.aura.spaces.repo.HatchSpacesDataSource.C139151
            r5 = r18
            if (r0 == 0) goto L23
            r3 = r4
            com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpaceViaJarvis$1 r3 = (com.facebook.aura.spaces.repo.HatchSpacesDataSource.C139151) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r4 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 0
            r8 = 1
            if (r0 == 0) goto L2e
            if (r0 != r8) goto L29
            goto L86
        L23:
            com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpaceViaJarvis$1 r3 = new com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpaceViaJarvis$1
            r3.<init>(r4)
            goto L16
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            java.lang.String r0 = android.net.Uri.encode(r19)     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            X.C7384Etj.A0U(r0)     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            com.facebook.aura.spaces.repo.SpacesJarvisPath$SpaceV2 r9 = new com.facebook.aura.spaces.repo.SpacesJarvisPath$SpaceV2     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r9.<init>(r0)     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            com.facebook.aura.network.http.RequestType r10 = com.facebook.aura.network.http.RequestType.DELETE     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            X.CGz r11 = r5.userSession     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            java.lang.String r0 = "source"
            r4 = r20
            X.HxE r0 = X.C3cG.A0r(r0, r4)     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            X.HxE[] r13 = new X.HxE[]{r0}     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            java.util.Set r15 = X.AnonymousClass004.A18()     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            X.9jH r17 = X.AGH.A0E()     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpaceViaJarvis$$inlined$executeJarvisRequest-1iavgos$default$1 r7 = com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpaceViaJarvis$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r12 = 0
            r3.L$0 = r12     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.L$1 = r12     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.L$2 = r12     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.L$3 = r12     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.L$4 = r12     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.L$5 = r12     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.L$6 = r12     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.L$7 = r12     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.L$8 = r12     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.I$0 = r8     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.I$1 = r1     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.I$2 = r1     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r3.label = r8     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r14 = r12
            r16 = r8
            r19 = r12
            r20 = r1
            r21 = r3
            r18 = r1
            java.lang.Object r0 = r6.m1595executeBodylessJarvisRequestWithp3iPjrY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            if (r0 != r2) goto L8a
            return r2
        L86:
            java.lang.Object r0 = X.AnonymousClass001.A0q(r4)     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
        L8a:
            java.lang.Throwable r1 = X.HsJ.A00(r0)     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            if (r1 == 0) goto La0
            boolean r0 = r1 instanceof com.facebook.aura.json.NetworkException     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            if (r0 == 0) goto L97
            com.facebook.aura.json.NetworkException r1 = (com.facebook.aura.json.NetworkException) r1     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            goto L98
        L97:
            r1 = 0
        L98:
            if (r1 == 0) goto Lb2
            int r1 = r1.httpResponseCode     // Catch: java.lang.Exception -> La2 java.util.concurrent.CancellationException -> Lb8
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto Lb2
        La0:
            r0 = 1
            goto Lb3
        La2:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "DELETE /spaces/v2 failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "HatchSpacesDataSource"
            X.CFK.A08(r0, r1, r2)
        Lb2:
            r0 = 0
        Lb3:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        Lb8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.HatchSpacesDataSource.deleteSpaceViaJarvis(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSpacesViaJarvis(X.HtJ<? super com.facebook.aura.spaces.repo.FetchSpacesResult> r23) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.HatchSpacesDataSource.fetchSpacesViaJarvis(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object mergeSingleSpace(SpaceCard spaceCard, HtJ<? super Unit> htJ) {
        ArrayList arrayListA0Q;
        HatchSpacesData value;
        LoadingState loadingState;
        Long lA0S;
        AHD<SpaceCard> ahd = this.allSpaceCards;
        Iterator it = ahd.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!C7384Etj.areEqual(((SpaceCard) it.next()).id, spaceCard.id)) {
                i++;
            } else if (i >= 0) {
                arrayListA0Q = new ArrayList(ahd);
                arrayListA0Q.set(i, spaceCard);
            }
        }
        arrayListA0Q = AbstractC0878AGe.A0Q(spaceCard, ahd);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it2 = arrayListA0Q.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C60Q.A1H(((SpaceCard) next).id, next, arrayListA0h, this.dismissedCardIds);
        }
        AHD<SpaceCard> ahdA07 = AGI.A07(arrayListA0h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.allSpaceCards = ahdA07;
        BLG<HatchSpacesData> blg = this._data;
        do {
            value = blg.getValue();
            loadingState = LoadingState.SUCCESS;
            lA0S = C3cG.A0S(jCurrentTimeMillis);
            C7384Etj.A0Y(ahdA07, 0);
        } while (!blg.A6e(value, new HatchSpacesData(ahdA07, loadingState, lA0S, false)));
        return C3cG.A0U(this.persistedStore.save(ahdA07, htJ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.facebook.aura.spaces.repo.HatchSpacesDataSource] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshSpaceCards(X.HtJ<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.HatchSpacesDataSource.refreshSpaceCards(X.HtJ):java.lang.Object");
    }

    private final void setupSpacesSubscription() {
        try {
            HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
            HzC hzCA01 = Hxb.A01();
            C139231 c139231 = new C139231(gateway, this, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, c139231, hzCA01);
            GAo.A02(num, c6ys, new C139242(null), Hxb.A01());
        } catch (Exception e) {
            CFK.A06("HatchSpacesDataSource", FGI.A0M("Failed to setup feed subscription: ", e.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097 A[PHI: r7 r34
  0x0097: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v6 java.lang.String) binds: [B:44:0x0113, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x0097: PHI (r34v2 java.lang.String) = (r34v0 java.lang.String), (r34v3 java.lang.String) binds: [B:44:0x0113, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.spaces.repo.SpaceCard spaceEntryToCard(com.facebook.aura.spaces.repo.SpaceEntryJson r61) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.HatchSpacesDataSource.spaceEntryToCard(com.facebook.aura.spaces.repo.SpaceEntryJson):com.facebook.aura.spaces.repo.SpaceCard");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteSpace(java.lang.String r12, boolean r13, X.HtJ<? super java.lang.Boolean> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.spaces.repo.HatchSpacesDataSource.AnonymousClass1
            if (r0 == 0) goto Ld0
            r8 = r14
            com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpace$1 r8 = (com.facebook.aura.spaces.repo.HatchSpacesDataSource.AnonymousClass1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld0
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r0 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r8.label
            r9 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L6f
            if (r1 != r9) goto Ld7
            boolean r6 = r8.Z$1
            X.Hwg.A00(r0)
        L25:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            return r7
        L2a:
            X.Hwg.A00(r0)
            r4 = 0
            if (r13 != 0) goto L53
            X.AHD<com.facebook.aura.spaces.repo.SpaceCard> r0 = r11.allSpaceCards
            java.util.Iterator r2 = r0.iterator()
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.spaces.repo.SpaceCard r0 = (com.facebook.aura.spaces.repo.SpaceCard) r0
            java.lang.String r0 = r0.id
            boolean r0 = X.C7384Etj.areEqual(r0, r12)
            if (r0 == 0) goto L36
        L4b:
            com.facebook.aura.spaces.repo.SpaceCard r1 = (com.facebook.aura.spaces.repo.SpaceCard) r1
            if (r1 == 0) goto L53
            java.lang.String r0 = r1.sharedShortcode
            if (r0 != 0) goto L54
        L53:
            r0 = r12
        L54:
            X.78T r2 = X.AnonymousClass001.A0y()
            com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpace$removed$1 r1 = new com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpace$removed$1
            r1.<init>(r11, r0, r13, r4)
            r8.L$0 = r12
            r0 = 0
            r8.L$1 = r0
            r8.Z$0 = r13
            r8.label = r3
            java.lang.Object r0 = X.GAo.A00(r8, r2, r1)
            if (r0 != r7) goto L76
            return r7
        L6d:
            r1 = r4
            goto L4b
        L6f:
            boolean r13 = r8.Z$0
            java.lang.Object r12 = r8.L$0
            X.Hwg.A00(r0)
        L76:
            boolean r6 = X.AnonymousClass001.A1X(r0)
            if (r6 == 0) goto Lbe
            X.AHD<com.facebook.aura.spaces.repo.SpaceCard> r0 = r11.allSpaceCards
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r0.iterator()
        L86:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.spaces.repo.SpaceCard r0 = (com.facebook.aura.spaces.repo.SpaceCard) r0
            java.lang.String r0 = r0.id
            X.AnonymousClass006.A1O(r0, r12, r1, r3)
            goto L86
        L99:
            X.AHD r0 = X.AGI.A07(r3)
            r11.allSpaceCards = r0
            X.BLG<com.facebook.aura.spaces.repo.HatchSpacesData> r10 = r11._data
        La1:
            java.lang.Object r5 = r10.getValue()
            r0 = r5
            com.facebook.aura.spaces.repo.HatchSpacesData r0 = (com.facebook.aura.spaces.repo.HatchSpacesData) r0
            X.AHD<com.facebook.aura.spaces.repo.SpaceCard> r4 = r11.allSpaceCards
            com.facebook.aura.spaces.repo.LoadingState r3 = r0.loadingState
            java.lang.Long r2 = r0.lastRefreshed
            boolean r1 = r0.isFromOfflineCache
            X.AnonymousClass003.A0u(r4, r3)
            com.facebook.aura.spaces.repo.HatchSpacesData r0 = new com.facebook.aura.spaces.repo.HatchSpacesData
            r0.<init>(r4, r3, r2, r1)
            boolean r0 = r10.A6e(r5, r0)
            if (r0 == 0) goto La1
        Lbe:
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.Z$0 = r13
            r8.Z$1 = r6
            r8.label = r9
            java.lang.Object r0 = r11.refreshSpaceCards(r8)
            if (r0 != r7) goto L25
            return r7
        Ld0:
            com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpace$1 r8 = new com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpace$1
            r8.<init>(r14)
            goto L12
        Ld7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.HatchSpacesDataSource.deleteSpace(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    public final C1BN<HatchSpacesData> getData() {
        return this.data;
    }

    public final C22I<String> getSpacesContentUpdatedEvents() {
        return this.spacesContentUpdatedEvents;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadSpacesData(boolean r4, X.HtJ<? super kotlin.Unit> r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L1f
            X.BLG<com.facebook.aura.spaces.repo.HatchSpacesData> r0 = r3._data
            java.lang.Object r2 = r0.getValue()
            com.facebook.aura.spaces.repo.HatchSpacesData r2 = (com.facebook.aura.spaces.repo.HatchSpacesData) r2
            com.facebook.aura.spaces.repo.LoadingState r1 = r2.loadingState
            com.facebook.aura.spaces.repo.LoadingState r0 = com.facebook.aura.spaces.repo.LoadingState.SUCCESS
            if (r1 != r0) goto L1f
            X.AHD<com.facebook.aura.spaces.repo.SpaceCard> r0 = r2.spaceCards
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            boolean r0 = r2.isFromOfflineCache
            if (r0 != 0) goto L1f
        L1c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L1f:
            java.lang.Object r1 = r3.refreshSpaceCards(r5)
            X.Hji r0 = X.EnumC10460Hji.A02
            if (r1 != r0) goto L1c
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.HatchSpacesDataSource.loadSpacesData(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reorderCard(int r46, int r47, X.HtJ<? super kotlin.Unit> r48) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.repo.HatchSpacesDataSource.reorderCard(int, int, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchSpacesDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchSpacesDataSource) abstractC3358CGz.A03(HatchSpacesDataSource.class, new HatchSpacesDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchSpacesDataSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.persistedStore = SpacesListPersistedStore.Companion.getInstance(abstractC3358CGz);
        this.navTtrcCoordinator = HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGz);
        AHI ahi = AHI.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchSpacesData(ahi, LoadingState.INITIAL, null, false));
        this._data = c9286GCnA14;
        this.data = C3cG.A11(c9286GCnA14);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 1);
        this._spacesContentUpdatedEvents = c9290GCrA12;
        this.spacesContentUpdatedEvents = C3pd.A00(c9290GCrA12);
        this.allSpaceCards = ahi;
        this.dismissedCardIds = C3cG.A0k();
        setupSpacesSubscription();
        hydrateFromPersistedStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchExportHtml(SpacesJarvisPath spacesJarvisPath, G0U<? super InputStream, ? extends Uri> g0u, HtJ<? super SpaceExportResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(spacesJarvisPath, this, g0u, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchSpace(String str, HtJ<? super SpaceCard> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C139162(str, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchSpaces(HtJ<? super FetchSpacesResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C139172(null));
    }

    private final void hydrateFromPersistedStore() {
        AnonymousClass001.A1J(new C139191(null), Hxb.A01());
    }

    private final List<SpaceCard> parseSpacesResponse(List<SpaceEntryJson> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<SpaceEntryJson> it = list.iterator();
        while (it.hasNext()) {
            SpaceCard spaceCardSpaceEntryToCard = spaceEntryToCard(it.next());
            if (spaceCardSpaceEntryToCard != null) {
                arrayListA0h.add(spaceCardSpaceEntryToCard);
            }
        }
        if (!(arrayListA0h instanceof Collection) || !arrayListA0h.isEmpty()) {
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                if (((SpaceCard) it2.next()).favoriteOrder != null) {
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    ArrayList arrayListA0h3 = C3cG.A0h();
                    for (Object obj : arrayListA0h) {
                        if (((SpaceCard) obj).favoriteOrder != null) {
                            arrayListA0h2.add(obj);
                        } else {
                            arrayListA0h3.add(obj);
                        }
                    }
                    return AbstractC0878AGe.A0P(arrayListA0h3, AbstractC0878AGe.A0c(arrayListA0h2, new Comparator() { // from class: com.facebook.aura.spaces.repo.HatchSpacesDataSource$parseSpacesResponse$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return AbstractC7536F0j.A00(((SpaceCard) t).favoriteOrder, ((SpaceCard) t2).favoriteOrder);
                        }
                    }));
                }
            }
        }
        return arrayListA0h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object persistFavoriteOrder(String str, double d, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C139202(str, d, this, null));
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        clearCache();
    }

    public final Object fetchPeerSpaceExportHtml(String str, String str2, G0U<? super InputStream, ? extends Uri> g0u, HtJ<? super SpaceExportResult> htJ) {
        String strEncode = Uri.encode(str);
        C7384Etj.A0U(strEncode);
        String strEncode2 = Uri.encode(str2);
        C7384Etj.A0U(strEncode2);
        return fetchExportHtml(new SpacesJarvisPath.PeerSpaceExportHtml(strEncode, strEncode2), g0u, htJ);
    }

    public final Object fetchSpaceExportHtml(String str, G0U<? super InputStream, ? extends Uri> g0u, HtJ<? super SpaceExportResult> htJ) {
        String strEncode = Uri.encode(str);
        C7384Etj.A0U(strEncode);
        return fetchExportHtml(new SpacesJarvisPath.SpaceExportHtml(strEncode), g0u, htJ);
    }

    public /* synthetic */ HatchSpacesDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
