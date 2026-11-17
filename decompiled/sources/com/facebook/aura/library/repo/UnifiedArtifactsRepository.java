package com.facebook.aura.library.repo;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AII;
import X.AIM;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C05573ua;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C8eO;
import X.C9258GBl;
import X.C9286GCn;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.iap.MC;
import com.facebook.aura.json.HatchEnvelopeDecoderKt;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.ArtifactPlacementOutcome;
import com.facebook.aura.library.repo.SpaceRenameOutcome;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.utils.HatchUtils;
import com.facebook.aura.wearablebroadcast.MC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class UnifiedArtifactsRepository implements InterfaceC7549F2g {
    public static final int CATALOG_LOOKUP_ATTEMPTS = 2;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _hasNextPage;
    public final BLG<Boolean> _isLoadingMore;
    public final BLG<AHD<UnifiedArtifact>> _items;
    public final BLG<LoadingState> _loadingState;
    public final BLG<ArtifactSortMode> _sort;
    public volatile String endCursor;
    public final C1BN<Boolean> hasNextPage;
    public final C1BN<Boolean> isLoadingMore;
    public final C1BN<AHD<UnifiedArtifact>> items;
    public final C1BN<LoadingState> loadingState;
    public final InterfaceC2261BLa pagingMutex;
    public volatile HoC reloadJob;
    public final C3UX scope;
    public final C1BN<ArtifactSortMode> sort;
    public final AbstractC3358CGz userSession;

    public final class ArtifactsPage extends C06G {
        public final String endCursor;
        public final boolean hasNextPage;
        public final List<UnifiedArtifact> items;

        public ArtifactsPage(List<UnifiedArtifact> list, String str, boolean z) {
            C7384Etj.A0Y(list, 0);
            this.items = list;
            this.endCursor = str;
            this.hasNextPage = z;
        }

        public final ArtifactsPage copy(List<UnifiedArtifact> list, String str, boolean z) {
            C7384Etj.A0Y(list, 0);
            return new ArtifactsPage(list, str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ArtifactsPage) {
                    ArtifactsPage artifactsPage = (ArtifactsPage) obj;
                    if (!C7384Etj.areEqual(this.items, artifactsPage.items) || !C7384Etj.areEqual(this.endCursor, artifactsPage.endCursor) || this.hasNextPage != artifactsPage.hasNextPage) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ArtifactsPage copy$default(ArtifactsPage artifactsPage, List list, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = artifactsPage.items;
            }
            if ((i & 2) != 0) {
                str = artifactsPage.endCursor;
            }
            if ((i & 4) != 0) {
                z = artifactsPage.hasNextPage;
            }
            return artifactsPage.copy(list, str, z);
        }

        public final List<UnifiedArtifact> component1() {
            return this.items;
        }

        public final String component2() {
            return this.endCursor;
        }

        public final boolean component3() {
            return this.hasNextPage;
        }

        public final String getEndCursor() {
            return this.endCursor;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final List<UnifiedArtifact> getItems() {
            return this.items;
        }

        public int hashCode() {
            return C0KA.A00((AnonymousClass005.A0E(this.items) + AnonymousClass006.A0G(this.endCursor)) * 31, this.hasNextPage);
        }

        public String toString() {
            return super.toString();
        }
    }

    public interface PageResult {

        public final class CatalogChanged implements PageResult {
            public static final CatalogChanged INSTANCE = new CatalogChanged();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CatalogChanged);
            }

            public String toString() {
                return "CatalogChanged";
            }

            public int hashCode() {
                return 1094875905;
            }
        }

        public final class Failure implements PageResult {
            public static final Failure INSTANCE = new Failure();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Failure);
            }

            public String toString() {
                return "Failure";
            }

            public int hashCode() {
                return -1061404252;
            }
        }

        public final class Success extends C06G implements PageResult {
            public final ArtifactsPage page;

            public Success(ArtifactsPage artifactsPage) {
                C7384Etj.A0Y(artifactsPage, 0);
                this.page = artifactsPage;
            }

            public final Success copy(ArtifactsPage artifactsPage) {
                C7384Etj.A0Y(artifactsPage, 0);
                return new Success(artifactsPage);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.page, ((Success) obj).page));
            }

            public static /* synthetic */ Success copy$default(Success success, ArtifactsPage artifactsPage, int i, Object obj) {
                if ((i & 1) != 0) {
                    artifactsPage = success.page;
                }
                C7384Etj.A0Y(artifactsPage, 0);
                return new Success(artifactsPage);
            }

            public final ArtifactsPage component1() {
                return this.page;
            }

            public final ArtifactsPage getPage() {
                return this.page;
            }

            public int hashCode() {
                return this.page.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public interface SpaceLookupResult {

        public final class Failed implements SpaceLookupResult {
            public static final Failed INSTANCE = new Failed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Failed);
            }

            public String toString() {
                return "Failed";
            }

            public int hashCode() {
                return -289403734;
            }
        }

        public final class Found extends C06G implements SpaceLookupResult {
            public final UnifiedArtifact artifact;

            public Found(UnifiedArtifact unifiedArtifact) {
                C7384Etj.A0Y(unifiedArtifact, 0);
                this.artifact = unifiedArtifact;
            }

            public final Found copy(UnifiedArtifact unifiedArtifact) {
                C7384Etj.A0Y(unifiedArtifact, 0);
                return new Found(unifiedArtifact);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Found) && C7384Etj.areEqual(this.artifact, ((Found) obj).artifact));
            }

            public static /* synthetic */ Found copy$default(Found found, UnifiedArtifact unifiedArtifact, int i, Object obj) {
                if ((i & 1) != 0) {
                    unifiedArtifact = found.artifact;
                }
                C7384Etj.A0Y(unifiedArtifact, 0);
                return new Found(unifiedArtifact);
            }

            public final UnifiedArtifact component1() {
                return this.artifact;
            }

            public final UnifiedArtifact getArtifact() {
                return this.artifact;
            }

            public int hashCode() {
                return this.artifact.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Missing implements SpaceLookupResult {
            public static final Missing INSTANCE = new Missing();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Missing);
            }

            public String toString() {
                return "Missing";
            }

            public int hashCode() {
                return 1774458521;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {210}, m = "artifactForFilePath", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$artifactForFilePath$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.artifactForFilePath(null, this);
        }
    }

    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$artifactForOriginalFilePath$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<UnifiedArtifact, Boolean> {
        public final /* synthetic */ String $normalized;

        @Override // X.G0U
        public final Boolean invoke(UnifiedArtifact unifiedArtifact) {
            UnifiedArtifactsRepository unifiedArtifactsRepository;
            String str;
            boolean zOriginalPathMatches;
            boolean zAreEqual;
            C7384Etj.A0Y(unifiedArtifact, 0);
            ArtifactOpenTarget artifactOpenTarget = unifiedArtifact.openTarget;
            if (!(artifactOpenTarget instanceof ArtifactOpenTarget.File)) {
                if (artifactOpenTarget instanceof ArtifactOpenTarget.Space) {
                    zOriginalPathMatches = UnifiedArtifactsRepository.this.originalPathMatches((ArtifactOpenTarget.Space) artifactOpenTarget, this.$normalized);
                } else {
                    if (!(artifactOpenTarget instanceof ArtifactOpenTarget.SavedSpace)) {
                        if (!(artifactOpenTarget instanceof ArtifactOpenTarget.PeerSpace)) {
                            if (artifactOpenTarget != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            unifiedArtifactsRepository = UnifiedArtifactsRepository.this;
                            str = unifiedArtifact.itemKey;
                        }
                        return Boolean.valueOf(zAreEqual);
                    }
                    zOriginalPathMatches = UnifiedArtifactsRepository.this.originalPathMatches((ArtifactOpenTarget.SavedSpace) artifactOpenTarget, this.$normalized);
                }
                zAreEqual = zOriginalPathMatches || C7384Etj.areEqual(UnifiedArtifactsRepository.this.normalizeFilePath(unifiedArtifact.itemKey), this.$normalized);
                return Boolean.valueOf(zAreEqual);
            }
            unifiedArtifactsRepository = UnifiedArtifactsRepository.this;
            str = ((ArtifactOpenTarget.File) artifactOpenTarget).path;
            zAreEqual = C7384Etj.areEqual(unifiedArtifactsRepository.normalizeFilePath(str), this.$normalized);
            return Boolean.valueOf(zAreEqual);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(1);
            this.$normalized = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {253}, m = "artifactForSpaceSlug", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$artifactForSpaceSlug$1, reason: invalid class name and case insensitive filesystem */
    public final class C123211 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C123211(HtJ<? super C123211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.artifactForSpaceSlug(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {192, 623, 199}, m = "ensureLoaded", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$ensureLoaded$1, reason: invalid class name and case insensitive filesystem */
    public final class C123221 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C123221(HtJ<? super C123221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.ensureLoaded(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository$fetchPage$2", f = "UnifiedArtifactsRepository.kt", l = {MC.wearables_hatch.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$fetchPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C123232 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PageResult>, Object> {
        public final /* synthetic */ String $after;
        public final /* synthetic */ boolean $filterLibraryPlacement;
        public final /* synthetic */ int $first;
        public final /* synthetic */ ArtifactSortMode $sort;
        public Object L$0;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objMakeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                boolean z = this.$filterLibraryPlacement;
                ArtifactSortMode artifactSortMode = this.$sort;
                int i2 = this.$first;
                String str = this.$after;
                AII aiiA17 = AIM.A17();
                AnonymousClass002.A1J("collection", UnifiedArtifactsRepositoryKt.COLLECTION_ALL, aiiA17);
                if (z && HatchUtils.INSTANCE.isSidePanelSpacesEnabled()) {
                    AnonymousClass002.A1J("placement", "library", aiiA17);
                }
                AnonymousClass002.A1J("sort", artifactSortMode.getWire(), aiiA17);
                AnonymousClass002.A1J("first", new Integer(i2), aiiA17);
                if (str != null && !C7BY.A0j(str)) {
                    AnonymousClass002.A1J("after", str, aiiA17);
                }
                HxE[] hxEArr = (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                JarvisPath.Artifacts artifacts = JarvisPath.Artifacts.INSTANCE;
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = UnifiedArtifactsRepository.this.userSession;
                HxE<String, ? extends Object>[] hxEArr2 = (HxE[]) Arrays.copyOf(hxEArr, hxEArr.length);
                this.L$0 = null;
                this.label = 1;
                objMakeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY = hatchHttpApi.makeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY(artifacts, requestType, abstractC3358CGz, null, hxEArr2, null, this);
                if (objMakeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objMakeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY;
            if (hatchHttpResponse != null) {
                int i3 = hatchHttpResponse.statusCode;
                JarvisPath.Artifacts artifacts2 = JarvisPath.Artifacts.INSTANCE;
                if (i3 == 409) {
                    CFK.A06(UnifiedArtifactsRepositoryKt.TAG, FGI.A0U("GET /", artifacts2.getValue(), " 409 catalog_changed; restarting pagination"));
                    return PageResult.CatalogChanged.INSTANCE;
                }
                Object objDecodeEnvelopeWith = HatchEnvelopeDecoderKt.decodeEnvelopeWith(hatchHttpResponse, UnifiedArtifactsRepository$fetchPage$2$invokeSuspend$$inlined$decodeEnvelope$default$1.INSTANCE, false, artifacts2.getValue(), AnonymousClass004.A18(), false);
                Throwable thA00 = HsJ.A00(objDecodeEnvelopeWith);
                if (thA00 == null) {
                    UnifiedArtifactsResponseJson unifiedArtifactsResponseJson = (UnifiedArtifactsResponseJson) objDecodeEnvelopeWith;
                    List<ArtifactEdgeJson> list = unifiedArtifactsResponseJson.edges;
                    ArrayList arrayList = new ArrayList();
                    Iterator<ArtifactEdgeJson> it = list.iterator();
                    while (it.hasNext()) {
                        UnifiedArtifact domain = it.next().node.toDomain();
                        if (domain != null) {
                            arrayList.add(domain);
                        }
                    }
                    ArtifactPageInfoJson artifactPageInfoJson = unifiedArtifactsResponseJson.page_info;
                    String str2 = artifactPageInfoJson.end_cursor;
                    if (str2 == null || str2.length() <= 0) {
                        str2 = null;
                    }
                    return new PageResult.Success(new ArtifactsPage(arrayList, str2, artifactPageInfoJson.has_next_page));
                }
                CFK.A06(UnifiedArtifactsRepositoryKt.TAG, FGI.A0d("GET /", artifacts2.getValue(), " failed: ", thA00.getMessage()));
            }
            return PageResult.Failure.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123232(boolean z, ArtifactSortMode artifactSortMode, int i, String str, HtJ<? super C123232> htJ) {
            super(2, htJ);
            this.$filterLibraryPlacement = z;
            this.$sort = artifactSortMode;
            this.$first = i;
            this.$after = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return UnifiedArtifactsRepository.this.new C123232(this.$filterLibraryPlacement, this.$sort, this.$first, this.$after, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super PageResult> htJ) {
            return ((C123232) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {411}, m = "findArtifactInCatalog", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$findArtifactInCatalog$1, reason: invalid class name and case insensitive filesystem */
    public final class C123241 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C123241(HtJ<? super C123241> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.findArtifactInCatalog(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {623, 158, 167}, m = "loadMore", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$loadMore$1, reason: invalid class name and case insensitive filesystem */
    public final class C123251 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C123251(HtJ<? super C123251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.loadMore(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {287}, m = "lookUpSpaceBySlug", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$lookUpSpaceBySlug$1, reason: invalid class name and case insensitive filesystem */
    public final class C123261 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C123261(HtJ<? super C123261> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.lookUpSpaceBySlug(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository$observeGateway$1", f = "UnifiedArtifactsRepository.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$observeGateway$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C123271 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ UnifiedArtifactsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123271(HatchGatewayConnection hatchGatewayConnection, UnifiedArtifactsRepository unifiedArtifactsRepository, HtJ<? super C123271> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = unifiedArtifactsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C123271(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05573ua c05573uaA01 = AbstractC05633ui.A01(new UnifiedArtifactsRepository$observeGateway$1$invokeSuspend$$inlined$map$1(this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactsSnapshotEvents), new UnifiedArtifactsRepository$observeGateway$1$invokeSuspend$$inlined$map$2(this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactItemsUpdated), new UnifiedArtifactsRepository$observeGateway$1$invokeSuspend$$inlined$map$3(this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactItemsRemoved));
                final UnifiedArtifactsRepository unifiedArtifactsRepository = this.this$0;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.library.repo.UnifiedArtifactsRepository.observeGateway.1.4
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        unifiedArtifactsRepository.scheduleReload();
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        unifiedArtifactsRepository.scheduleReload();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c05573uaA01.collect(c20z, this) == enumC10460Hji) {
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
            return ((C123271) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository$observeGateway$2", f = "UnifiedArtifactsRepository.kt", l = {110}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$observeGateway$2, reason: invalid class name and case insensitive filesystem */
    public final class C123282 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123282(HatchGatewayConnection hatchGatewayConnection, HtJ<? super C123282> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C123282(this.$gateway, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection hatchGatewayConnection = this.$gateway;
                this.label = 1;
                if (hatchGatewayConnection.subscribeArtifacts(this) == enumC10460Hji) {
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
            return new C123282(this.$gateway, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {239, 241}, m = "openTargetForOriginalFilePath", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$openTargetForOriginalFilePath$1, reason: invalid class name and case insensitive filesystem */
    public final class C123291 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C123291(HtJ<? super C123291> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.openTargetForOriginalFilePath(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {623, 125}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C123301 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C123301(HtJ<? super C123301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.refresh(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {623, MC.stella_payments_in_app_purchases.__CONFIG__}, m = "reloadLoadedRange", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$reloadLoadedRange$1, reason: invalid class name and case insensitive filesystem */
    public final class C123311 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C123311(HtJ<? super C123311> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.reloadLoadedRange(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository$renameSpace$2", f = "UnifiedArtifactsRepository.kt", l = {657}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$renameSpace$2, reason: invalid class name and case insensitive filesystem */
    public final class C123322 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SpaceRenameOutcome>, Object> {
        public final /* synthetic */ String $name;
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
        public Object L$8;
        public Object L$9;
        public int label;
        public final /* synthetic */ UnifiedArtifactsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123322(String str, String str2, UnifiedArtifactsRepository unifiedArtifactsRepository, HtJ<? super C123322> htJ) {
            super(2, htJ);
            this.$slug = str;
            this.$name = str2;
            this.this$0 = unifiedArtifactsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C123322(this.$slug, this.$name, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strA0l;
            String strA0l2;
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                strA0l = AnonymousClass002.A0l(this.$slug);
                strA0l2 = AnonymousClass002.A0l(this.$name);
                if (strA0l.length() == 0 || strA0l2.length() == 0) {
                    return SpaceRenameOutcome.Invalid.INSTANCE;
                }
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                UnifiedArtifactsRepository$renameSpace$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 unifiedArtifactsRepository$renameSpace$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = UnifiedArtifactsRepository$renameSpace$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                UnifiedArtifactsRepository$renameSpace$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 unifiedArtifactsRepository$renameSpace$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = UnifiedArtifactsRepository$renameSpace$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = strA0l;
                this.L$1 = strA0l2;
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
                objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(unifiedArtifactsRepository$renameSpace$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, unifiedArtifactsRepository$renameSpace$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.SpacesRename.INSTANCE, new SpaceRenameRequestJson(strA0l, strA0l2), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                strA0l2 = (String) this.L$1;
                strA0l = (String) this.L$0;
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            UnifiedArtifactsRepository unifiedArtifactsRepository = this.this$0;
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                return UnifiedArtifactsRepositoryKt.toSpaceRenameOutcome(thA00);
            }
            SpaceRenameResponseJson spaceRenameResponseJson = (SpaceRenameResponseJson) objM1599executeJarvisRequestWithFof5HsY;
            String str = spaceRenameResponseJson.slug;
            if (!C7BY.A0j(str) && str != null) {
                strA0l = str;
            }
            String str2 = spaceRenameResponseJson.name;
            if (!C7BY.A0j(str2) && str2 != null) {
                strA0l2 = str2;
            }
            unifiedArtifactsRepository.applyRenamedSpace(strA0l, strA0l2);
            return new SpaceRenameOutcome.Renamed(new SpaceRenameResult(strA0l, strA0l2));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SpaceRenameOutcome> htJ) {
            return ((C123322) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {454}, m = "restartPaginationLocked", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$restartPaginationLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C123331 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C123331(HtJ<? super C123331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.restartPaginationLocked(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository$scheduleReload$1", f = "UnifiedArtifactsRepository.kt", l = {396, 397}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$scheduleReload$1, reason: invalid class name and case insensitive filesystem */
    public final class C123341 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C123341(HtJ<? super C123341> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return UnifiedArtifactsRepository.this.new C123341(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(400L, this) == enumC10460Hji) {
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
            UnifiedArtifactsRepository unifiedArtifactsRepository = UnifiedArtifactsRepository.this;
            this.label = 2;
            if (unifiedArtifactsRepository.reloadLoadedRange(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return UnifiedArtifactsRepository.this.new C123341(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository$setArtifactPlacement$2", f = "UnifiedArtifactsRepository.kt", l = {657, 331}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$setArtifactPlacement$2, reason: invalid class name and case insensitive filesystem */
    public final class C123352 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ArtifactPlacementOutcome>, Object> {
        public final /* synthetic */ ArtifactPlacementRequest $request;
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
        public final /* synthetic */ UnifiedArtifactsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123352(ArtifactPlacementRequest artifactPlacementRequest, UnifiedArtifactsRepository unifiedArtifactsRepository, HtJ<? super C123352> htJ) {
            super(2, htJ);
            this.$request = artifactPlacementRequest;
            this.this$0 = unifiedArtifactsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C123352(this.$request, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ArtifactPlacementRequest artifactPlacementRequest = this.$request;
                ArtifactPlacementRequestJson artifactPlacementRequestJson = new ArtifactPlacementRequestJson(artifactPlacementRequest.artifactRef, artifactPlacementRequest.spaceId, artifactPlacementRequest.placement.getWire());
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                UnifiedArtifactsRepository$setArtifactPlacement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 unifiedArtifactsRepository$setArtifactPlacement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = UnifiedArtifactsRepository$setArtifactPlacement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                UnifiedArtifactsRepository$setArtifactPlacement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 unifiedArtifactsRepository$setArtifactPlacement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = UnifiedArtifactsRepository$setArtifactPlacement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
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
                objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(unifiedArtifactsRepository$setArtifactPlacement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, unifiedArtifactsRepository$setArtifactPlacement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, JarvisPath.ArtifactsPlacement.INSTANCE, artifactPlacementRequestJson, RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return ArtifactPlacementOutcome.Moved.INSTANCE;
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            UnifiedArtifactsRepository unifiedArtifactsRepository = this.this$0;
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                return UnifiedArtifactsRepositoryKt.toArtifactPlacementOutcome(thA00);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.label = 2;
            if (unifiedArtifactsRepository.refresh(true, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return ArtifactPlacementOutcome.Moved.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ArtifactPlacementOutcome> htJ) {
            return ((C123352) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository$setArtifactPlacementDetached$1", f = "UnifiedArtifactsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$setArtifactPlacementDetached$1, reason: invalid class name and case insensitive filesystem */
    public final class C123361 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;

        public C123361(HtJ<? super C123361> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C123361(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            if (htJ != null) {
                htJ.getContext();
            }
            Unit unit = Unit.INSTANCE;
            Hwg.A00(unit);
            return unit;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository$setArtifactPlacementDetached$2", f = "UnifiedArtifactsRepository.kt", l = {350, 351}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$setArtifactPlacementDetached$2, reason: invalid class name and case insensitive filesystem */
    public final class C123372 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onMoved;
        public final /* synthetic */ ArtifactPlacementRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123372(ArtifactPlacementRequest artifactPlacementRequest, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super C123372> htJ) {
            super(2, htJ);
            this.$request = artifactPlacementRequest;
            this.$onMoved = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return UnifiedArtifactsRepository.this.new C123372(this.$request, this.$onMoved, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                UnifiedArtifactsRepository unifiedArtifactsRepository = UnifiedArtifactsRepository.this;
                ArtifactPlacementRequest artifactPlacementRequest = this.$request;
                this.label = 1;
                obj = unifiedArtifactsRepository.setArtifactPlacement(artifactPlacementRequest, this);
                if (obj == enumC10460Hji) {
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
            if (C7384Etj.areEqual(obj, ArtifactPlacementOutcome.Moved.INSTANCE)) {
                G0U<HtJ<? super Unit>, Object> g0u = this.$onMoved;
                this.label = 2;
                if (g0u.invoke(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C123372) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.UnifiedArtifactsRepository", f = "UnifiedArtifactsRepository.kt", l = {623, 182}, m = "setSort", v = 2)
    /* renamed from: com.facebook.aura.library.repo.UnifiedArtifactsRepository$setSort$1, reason: invalid class name and case insensitive filesystem */
    public final class C123381 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C123381(HtJ<? super C123381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedArtifactsRepository.this.setSort(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0092 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findArtifactInCatalog(X.G0U<? super com.facebook.aura.library.repo.UnifiedArtifact, java.lang.Boolean> r14, X.HtJ<? super com.facebook.aura.library.repo.UnifiedArtifact> r15) {
        /*
            r13 = this;
            r4 = r15
            r1 = r14
            boolean r0 = r15 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123241
            r10 = r13
            if (r0 == 0) goto L94
            r15 = r4
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$findArtifactInCatalog$1 r15 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123241) r15
            int r3 = r15.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L94
            int r3 = r3 - r2
            r15.label = r3
        L15:
            java.lang.Object r6 = r15.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r3 = 1
            r9 = 0
            if (r0 == 0) goto L75
            if (r0 != r3) goto Laa
            int r2 = r15.I$0
            java.lang.Object r7 = r15.L$1
            java.lang.Object r1 = r15.L$0
            X.G0U r1 = (X.G0U) r1
            X.Hwg.A00(r6)
        L2c:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$PageResult r6 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.PageResult) r6
            boolean r0 = r6 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.PageResult.Success
            if (r0 == 0) goto L6a
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$PageResult$Success r6 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.PageResult.Success) r6
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$ArtifactsPage r0 = r6.page
            java.util.List<com.facebook.aura.library.repo.UnifiedArtifact> r0 = r0.items
            java.util.Iterator r8 = r0.iterator()
        L3c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r5 = r8.next()
            boolean r0 = X.AnonymousClass003.A1X(r5, r1)
            if (r0 == 0) goto L3c
            if (r5 == 0) goto L4f
            return r5
        L4f:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$ArtifactsPage r0 = r6.page
            java.lang.String r11 = r0.endCursor
            java.util.List<com.facebook.aura.library.repo.UnifiedArtifact> r0 = r0.items
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L69
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$ArtifactsPage r0 = r6.page
            boolean r0 = r0.hasNextPage
            if (r0 == 0) goto L69
            if (r11 == 0) goto L69
            boolean r0 = r11.equals(r7)
            if (r0 == 0) goto L7e
        L69:
            return r9
        L6a:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$PageResult$CatalogChanged r0 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.PageResult.CatalogChanged.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r6, r0)
            if (r0 == 0) goto L9b
            if (r2 != 0) goto L7b
            return r9
        L75:
            X.Hwg.A00(r6)
            r11 = r9
            r2 = 1
            goto L7e
        L7b:
            int r2 = r2 + (-1)
            r11 = r9
        L7e:
            com.facebook.aura.library.repo.ArtifactSortMode r13 = com.facebook.aura.library.repo.ArtifactSortMode.LAST_OPENED
            r15.L$0 = r1
            r15.L$1 = r11
            r15.I$0 = r2
            r15.label = r3
            r12 = 100
            r14 = 0
            java.lang.Object r6 = r10.fetchPage(r11, r12, r13, r14, r15)
            if (r6 != r4) goto L92
            return r4
        L92:
            r7 = r11
            goto L2c
        L94:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$findArtifactInCatalog$1 r15 = new com.facebook.aura.library.repo.UnifiedArtifactsRepository$findArtifactInCatalog$1
            r15.<init>(r4)
            goto L15
        L9b:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$PageResult$Failure r0 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.PageResult.Failure.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r6, r0)
            if (r0 == 0) goto La4
            return r9
        La4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Laa:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.findArtifactInCatalog(X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:48:0x00ae, B:50:0x00b4, B:51:0x00d6, B:53:0x00dc, B:54:0x00e8, B:55:0x00fd, B:57:0x0103, B:59:0x0112, B:60:0x0116, B:61:0x0122, B:63:0x012a, B:66:0x0139, B:68:0x0141, B:69:0x0146), top: B:92:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:48:0x00ae, B:50:0x00b4, B:51:0x00d6, B:53:0x00dc, B:54:0x00e8, B:55:0x00fd, B:57:0x0103, B:59:0x0112, B:60:0x0116, B:61:0x0122, B:63:0x012a, B:66:0x0139, B:68:0x0141, B:69:0x0146), top: B:92:0x00ae }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMore(X.HtJ<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.loadMore(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lookUpSpaceBySlug(java.lang.String r14, X.HtJ<? super com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult> r15) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.lookUpSpaceBySlug(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRenamedSpace(String str, String str2) {
        BLG<AHD<UnifiedArtifact>> blg = this._items;
        AHD<UnifiedArtifact> value = blg.getValue();
        ArrayList arrayListA0i = AnonymousClass003.A0i(value);
        for (UnifiedArtifact unifiedArtifactCopy$default : value) {
            if (unifiedArtifactCopy$default.source == ArtifactSource.SPACE && C7384Etj.areEqual(unifiedArtifactCopy$default.itemKey, str)) {
                unifiedArtifactCopy$default = UnifiedArtifact.copy$default(unifiedArtifactCopy$default, null, null, null, str2, null, null, null, null, false, 0L, false, false, false, null, null, null, null, null, null, false, false, false, 4194295, null);
            }
            arrayListA0i.add(unifiedArtifactCopy$default);
        }
        blg.Af8(AGI.A07(arrayListA0i));
    }

    public static /* synthetic */ Object fetchPage$default(UnifiedArtifactsRepository unifiedArtifactsRepository, String str, int i, ArtifactSortMode artifactSortMode, boolean z, HtJ htJ, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return unifiedArtifactsRepository.fetchPage(str, i, artifactSortMode, z, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String normalizeFilePath(String str) {
        return C7BY.A0K("your_files/", C7BY.A0K("workspace/", C7BY.A0a(C7BY.A0K("file:", str), '/')));
    }

    private final void observeGateway() {
        HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
        C3UX c3ux = this.scope;
        C123271 c123271 = new C123271(gateway, this, null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, c123271, c3ux);
        GAo.A02(num, c6ys, new C123282(gateway, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean originalPathMatches(ArtifactOpenTarget.Space space, String str) {
        String str2 = space.originalPath;
        return str2 != null && C7384Etj.areEqual(normalizeFilePath(str2), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reloadLoadedRange(X.HtJ<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123311
            if (r0 == 0) goto L26
            r6 = r8
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$reloadLoadedRange$1 r6 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123311) r6
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
            r3 = 2
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L39
            if (r1 == r0) goto L31
            if (r1 != r3) goto L2c
            java.lang.Object r1 = r6.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            goto L54
        L26:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$reloadLoadedRange$1 r6 = new com.facebook.aura.library.repo.UnifiedArtifactsRepository$reloadLoadedRange$1
            r6.<init>(r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r1 = r6.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            X.Hwg.A00(r5)
            goto L49
        L39:
            X.Hwg.A00(r5)
            X.BLa r1 = r7.pagingMutex
            r6.L$0 = r1
            r6.label = r0
            java.lang.Object r0 = r1.APs(r2, r6)
            if (r0 != r4) goto L49
            return r4
        L49:
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L5d
            r6.label = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r7.restartPaginationLocked(r6)     // Catch: java.lang.Throwable -> L5d
            if (r0 != r4) goto L57
            return r4
        L54:
            X.Hwg.A00(r5)     // Catch: java.lang.Throwable -> L5f
        L57:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5f
            r1.Ahe(r2)
            return r0
        L5d:
            r0 = move-exception
            goto L60
        L5f:
            r0 = move-exception
        L60:
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.reloadLoadedRange(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[LOOP:0: B:21:0x0078->B:23:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e7 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object restartPaginationLocked(X.HtJ<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.restartPaginationLocked(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleReload() {
        HtJ htJA13 = AnonymousClass006.A13(this.reloadJob);
        this.reloadJob = AnonymousClass001.A11(new C123341(htJA13), this.scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setArtifactPlacementDetached$default(UnifiedArtifactsRepository unifiedArtifactsRepository, ArtifactPlacementRequest artifactPlacementRequest, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = new C123361(null);
        }
        unifiedArtifactsRepository.setArtifactPlacementDetached(artifactPlacementRequest, g0u);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object artifactForFilePath(java.lang.String r12, X.HtJ<? super com.facebook.aura.library.repo.UnifiedArtifact> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.AnonymousClass1
            r6 = r11
            if (r0 == 0) goto L83
            r11 = r13
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$artifactForFilePath$1 r11 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.AnonymousClass1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r11.label = r2
        L13:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r10 = 1
            r7 = 0
            if (r0 == 0) goto L65
            if (r0 != r10) goto L89
            java.lang.Object r1 = r11.L$1
            X.Hwg.A00(r3)
        L24:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$PageResult r3 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.PageResult) r3
            boolean r0 = r3 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.PageResult.Success
            if (r0 == 0) goto L8e
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$PageResult$Success r3 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.PageResult.Success) r3
            if (r3 == 0) goto L8e
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$ArtifactsPage r0 = r3.page
            if (r0 == 0) goto L8e
            java.util.List<com.facebook.aura.library.repo.UnifiedArtifact> r0 = r0.items
            if (r0 == 0) goto L8e
            java.util.Iterator r5 = r0.iterator()
        L3a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r4 = r5.next()
            r3 = r4
            com.facebook.aura.library.repo.UnifiedArtifact r3 = (com.facebook.aura.library.repo.UnifiedArtifact) r3
            com.facebook.aura.library.repo.ArtifactSource r2 = r3.source
            com.facebook.aura.library.repo.ArtifactSource r0 = com.facebook.aura.library.repo.ArtifactSource.LIBRARY
            if (r2 != r0) goto L3a
            com.facebook.aura.library.repo.ArtifactOpenTarget r2 = r3.openTarget
            boolean r0 = r2 instanceof com.facebook.aura.library.repo.ArtifactOpenTarget.File
            if (r0 == 0) goto L62
            com.facebook.aura.library.repo.ArtifactOpenTarget$File r2 = (com.facebook.aura.library.repo.ArtifactOpenTarget.File) r2
            java.lang.String r0 = r2.path
        L57:
            java.lang.String r0 = r6.normalizeFilePath(r0)
            boolean r0 = X.C7384Etj.areEqual(r0, r1)
            if (r0 == 0) goto L3a
            return r4
        L62:
            java.lang.String r0 = r3.itemKey
            goto L57
        L65:
            X.Hwg.A00(r3)
            java.lang.String r1 = r6.normalizeFilePath(r12)
            int r0 = r1.length()
            if (r0 == 0) goto L8e
            com.facebook.aura.library.repo.ArtifactSortMode r9 = com.facebook.aura.library.repo.ArtifactSortMode.LAST_OPENED
            r11.L$0 = r7
            r11.L$1 = r1
            r11.label = r10
            r8 = 100
            java.lang.Object r3 = r6.fetchPage(r7, r8, r9, r10, r11)
            if (r3 != r2) goto L24
            return r2
        L83:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$artifactForFilePath$1 r11 = new com.facebook.aura.library.repo.UnifiedArtifactsRepository$artifactForFilePath$1
            r11.<init>(r13)
            goto L13
        L89:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L8e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.artifactForFilePath(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object artifactForPeerSpace(String str, String str2, HtJ<? super UnifiedArtifact> htJ) {
        UnifiedArtifactsRepository$artifactForPeerSpace$matches$1 unifiedArtifactsRepository$artifactForPeerSpace$matches$1 = new UnifiedArtifactsRepository$artifactForPeerSpace$matches$1(str, str2);
        Iterator<E> it = this._items.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (unifiedArtifactsRepository$artifactForPeerSpace$matches$1.invoke((UnifiedArtifact) next).booleanValue()) {
                if (next != null) {
                    return next;
                }
            }
        }
        return findArtifactInCatalog(unifiedArtifactsRepository$artifactForPeerSpace$matches$1, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object artifactForSpaceSlug(java.lang.String r6, X.HtJ<? super com.facebook.aura.library.repo.UnifiedArtifact> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123211
            if (r0 == 0) goto L3b
            r4 = r7
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$artifactForSpaceSlug$1 r4 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123211) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L41
            X.Hwg.A00(r3)
        L20:
            boolean r0 = r3 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Found
            r2 = 0
            if (r0 == 0) goto L2b
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult$Found r3 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Found) r3
            if (r3 == 0) goto L2b
            com.facebook.aura.library.repo.UnifiedArtifact r2 = r3.artifact
        L2b:
            return r2
        L2c:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r3 = r5.lookUpSpaceBySlug(r6, r4)
            if (r3 != r2) goto L20
            return r2
        L3b:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$artifactForSpaceSlug$1 r4 = new com.facebook.aura.library.repo.UnifiedArtifactsRepository$artifactForSpaceSlug$1
            r4.<init>(r7)
            goto L12
        L41:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.artifactForSpaceSlug(java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
        this._items.Af8(AHI.A01);
        AnonymousClass001.A1E(this._loadingState, null, LoadingState.INITIAL);
        BLG<Boolean> blg = this._hasNextPage;
        Boolean boolA0h = AnonymousClass001.A0h();
        AnonymousClass001.A1E(blg, null, boolA0h);
        AnonymousClass001.A1E(this._isLoadingMore, null, boolA0h);
        this.endCursor = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ensureLoaded(com.facebook.aura.library.repo.ArtifactSortMode r9, X.HtJ<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123221
            if (r0 == 0) goto L29
            r4 = r10
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$ensureLoaded$1 r4 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123221) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r7 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r6 = 3
            r5 = 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L39
            if (r0 == r1) goto L82
            if (r0 == r5) goto L2f
            if (r0 == r6) goto L82
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$ensureLoaded$1 r4 = new com.facebook.aura.library.repo.UnifiedArtifactsRepository$ensureLoaded$1
            r4.<init>(r10)
            goto L12
        L2f:
            java.lang.Object r1 = r4.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r9 = r4.L$0
            X.Hwg.A00(r7)
            goto L6c
        L39:
            X.Hwg.A00(r7)
            X.BLG<com.facebook.aura.library.repo.ArtifactSortMode> r0 = r8._sort
            java.lang.Object r0 = r0.getValue()
            if (r0 != r9) goto L5d
            X.BLG<X.AHD<com.facebook.aura.library.repo.UnifiedArtifact>> r0 = r8._items
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5d
            r4.L$0 = r2
            r4.label = r1
            java.lang.Object r0 = r8.reloadLoadedRange(r4)
        L5a:
            if (r0 != r3) goto L85
            return r3
        L5d:
            X.BLa r1 = r8.pagingMutex
            r4.L$0 = r9
            r4.L$1 = r1
            r4.label = r5
            java.lang.Object r0 = r1.APs(r2, r4)
            if (r0 != r3) goto L6c
            return r3
        L6c:
            X.BLG<com.facebook.aura.library.repo.ArtifactSortMode> r0 = r8._sort     // Catch: java.lang.Throwable -> L88
            r0.Af8(r9)     // Catch: java.lang.Throwable -> L88
            r8.endCursor = r2     // Catch: java.lang.Throwable -> L88
            r1.Ahe(r2)
            r4.L$0 = r2
            r4.L$1 = r2
            r4.label = r6
            r0 = 0
            java.lang.Object r0 = r8.refresh(r0, r4)
            goto L5a
        L82:
            X.Hwg.A00(r7)
        L85:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L88:
            r0 = move-exception
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.ensureLoaded(com.facebook.aura.library.repo.ArtifactSortMode, X.HtJ):java.lang.Object");
    }

    public final C1BN<Boolean> getHasNextPage() {
        return this.hasNextPage;
    }

    public final C1BN<AHD<UnifiedArtifact>> getItems() {
        return this.items;
    }

    public final C1BN<LoadingState> getLoadingState() {
        return this.loadingState;
    }

    public final C1BN<ArtifactSortMode> getSort() {
        return this.sort;
    }

    public final C1BN<Boolean> isLoadingMore() {
        return this.isLoadingMore;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openTargetForOriginalFilePath(java.lang.String r8, X.HtJ<? super com.facebook.aura.library.repo.ArtifactOpenTarget> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123291
            if (r0 == 0) goto L67
            r6 = r9
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$openTargetForOriginalFilePath$1 r6 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123291) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L3d
            if (r0 != r4) goto L6d
            X.Hwg.A00(r1)
        L24:
            com.facebook.aura.library.repo.UnifiedArtifact r1 = (com.facebook.aura.library.repo.UnifiedArtifact) r1
            if (r1 == 0) goto L2a
            com.facebook.aura.library.repo.ArtifactOpenTarget r2 = r1.openTarget
        L2a:
            return r2
        L2b:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchFileOperations r1 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r0 = r7.userSession
            r6.L$0 = r8
            r6.label = r3
            java.lang.Object r1 = r1.statFile(r8, r0, r6)
            if (r1 != r5) goto L44
            return r5
        L3d:
            java.lang.Object r8 = r6.L$0
            java.lang.String r8 = (java.lang.String) r8
            X.Hwg.A00(r1)
        L44:
            com.facebook.aura.gateway.HatchFileOperations$StatResult r1 = (com.facebook.aura.gateway.HatchFileOperations.StatResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Failed
            if (r0 == 0) goto L2a
            com.facebook.aura.gateway.HatchFileOperations$StatResult$Failed r1 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Failed) r1
            if (r1 == 0) goto L2a
            java.lang.Integer r0 = r1.statusCode
            if (r0 == 0) goto L2a
            int r1 = r0.intValue()
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L2a
            r6.L$0 = r2
            r6.L$1 = r2
            r6.label = r4
            java.lang.Object r1 = r7.artifactForOriginalFilePath(r8, r6)
            if (r1 != r5) goto L24
            return r5
        L67:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$openTargetForOriginalFilePath$1 r6 = new com.facebook.aura.library.repo.UnifiedArtifactsRepository$openTargetForOriginalFilePath$1
            r6.<init>(r9)
            goto L12
        L6d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.openTargetForOriginalFilePath(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3 A[Catch: all -> 0x0115, TryCatch #4 {all -> 0x0115, blocks: (B:38:0x009d, B:40:0x00a3, B:41:0x00c9, B:43:0x00d1, B:45:0x00d9, B:46:0x00de, B:47:0x00df, B:50:0x00ef, B:51:0x00f5), top: B:83:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9 A[Catch: all -> 0x0115, TryCatch #4 {all -> 0x0115, blocks: (B:38:0x009d, B:40:0x00a3, B:41:0x00c9, B:43:0x00d1, B:45:0x00d9, B:46:0x00de, B:47:0x00df, B:50:0x00ef, B:51:0x00f5), top: B:83:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a A[Catch: all -> 0x0132, TryCatch #2 {all -> 0x0132, blocks: (B:52:0x00fa, B:54:0x0106, B:57:0x010f, B:56:0x010a, B:65:0x011a, B:67:0x0126, B:70:0x012f, B:69:0x012a), top: B:80:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0126 A[Catch: all -> 0x0132, TryCatch #2 {all -> 0x0132, blocks: (B:52:0x00fa, B:54:0x0106, B:57:0x010f, B:56:0x010a, B:65:0x011a, B:67:0x0126, B:70:0x012f, B:69:0x012a), top: B:80:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a A[Catch: all -> 0x0132, TryCatch #2 {all -> 0x0132, blocks: (B:52:0x00fa, B:54:0x0106, B:57:0x010f, B:56:0x010a, B:65:0x011a, B:67:0x0126, B:70:0x012f, B:69:0x012a), top: B:80:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(boolean r12, X.HtJ<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.refresh(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setSort(com.facebook.aura.library.repo.ArtifactSortMode r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123381
            if (r0 == 0) goto L5b
            r6 = r9
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$setSort$1 r6 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.C123381) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r3 = 2
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L31
            if (r1 == r0) goto L27
            if (r1 != r3) goto L61
            X.Hwg.A00(r5)
        L24:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L27:
            java.lang.Object r1 = r6.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r8 = r6.L$0
            X.Hwg.A00(r5)
            goto L43
        L31:
            X.Hwg.A00(r5)
            X.BLa r1 = r7.pagingMutex
            r6.L$0 = r8
            r6.L$1 = r1
            r6.label = r0
            java.lang.Object r0 = r1.APs(r2, r6)
            if (r0 != r4) goto L43
            return r4
        L43:
            X.BLG<com.facebook.aura.library.repo.ArtifactSortMode> r0 = r7._sort     // Catch: java.lang.Throwable -> L66
            r0.Af8(r8)     // Catch: java.lang.Throwable -> L66
            r7.endCursor = r2     // Catch: java.lang.Throwable -> L66
            r1.Ahe(r2)
            r6.L$0 = r2
            r6.L$1 = r2
            r6.label = r3
            r0 = 0
            java.lang.Object r0 = r7.refresh(r0, r6)
            if (r0 != r4) goto L24
            return r4
        L5b:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$setSort$1 r6 = new com.facebook.aura.library.repo.UnifiedArtifactsRepository$setSort$1
            r6.<init>(r9)
            goto L12
        L61:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L66:
            r0 = move-exception
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepository.setSort(com.facebook.aura.library.repo.ArtifactSortMode, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final UnifiedArtifactsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (UnifiedArtifactsRepository) abstractC3358CGz.A03(UnifiedArtifactsRepository.class, new UnifiedArtifactsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ UnifiedArtifactsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchPage(String str, int i, ArtifactSortMode artifactSortMode, boolean z, HtJ<? super PageResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C123232(z, artifactSortMode, i, str, null));
    }

    public final Object artifactForOriginalFilePath(String str, HtJ<? super UnifiedArtifact> htJ) {
        String strNormalizeFilePath = normalizeFilePath(str);
        if (strNormalizeFilePath.length() == 0) {
            return null;
        }
        return findArtifactInCatalog(new AnonymousClass2(strNormalizeFilePath), htJ);
    }

    public final Object renameSpace(String str, String str2, HtJ<? super SpaceRenameOutcome> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C123322(str, str2, this, null));
    }

    public final Object setArtifactPlacement(ArtifactPlacementRequest artifactPlacementRequest, HtJ<? super ArtifactPlacementOutcome> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C123352(artifactPlacementRequest, this, null));
    }

    public final void setArtifactPlacementDetached(ArtifactPlacementRequest artifactPlacementRequest, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        AnonymousClass003.A0u(artifactPlacementRequest, g0u);
        AnonymousClass001.A1J(new C123372(artifactPlacementRequest, g0u, null), this.scope);
    }

    public UnifiedArtifactsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = Hxb.A02(AnonymousClass001.A0y().plus(new C8eO(null)).plus(new UnifiedArtifactsRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
        C9286GCn c9286GCnA01 = HnJ.A01(AHI.A01);
        this._items = c9286GCnA01;
        this.items = new C3Pi(null, c9286GCnA01);
        C9286GCn c9286GCn = new C9286GCn(LoadingState.INITIAL);
        this._loadingState = c9286GCn;
        this.loadingState = new C3Pi(null, c9286GCn);
        Boolean boolA0h = AnonymousClass001.A0h();
        C9286GCn c9286GCn2 = new C9286GCn(boolA0h);
        this._hasNextPage = c9286GCn2;
        this.hasNextPage = new C3Pi(null, c9286GCn2);
        C9286GCn c9286GCn3 = new C9286GCn(boolA0h);
        this._isLoadingMore = c9286GCn3;
        this.isLoadingMore = new C3Pi(null, c9286GCn3);
        C9286GCn c9286GCn4 = new C9286GCn(ArtifactSortMode.LAST_MODIFIED);
        this._sort = c9286GCn4;
        this.sort = new C3Pi(null, c9286GCn4);
        this.pagingMutex = new C9258GBl();
        observeGateway();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean originalPathMatches(ArtifactOpenTarget.SavedSpace savedSpace, String str) {
        String str2 = savedSpace.originalPath;
        if (str2 == null || !C7384Etj.areEqual(normalizeFilePath(str2), str)) {
            return false;
        }
        return true;
    }
}
