package com.facebook.aura.shopping.repo;

import X.AGH;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
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
import X.C10533Hqc;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.C7BY;
import X.C8j4;
import X.C8j5;
import X.C9286GCn;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.FGI;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.HzS;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import android.util.LruCache;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.shopping.model.CurrentShoppingCart;
import com.facebook.aura.shopping.model.PdpCouponPrice;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import com.facebook.aura.shopping.model.ShoppingCouponPriceKey;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.repo.ProductDetailsFetchResult;
import com.facebook.aura.shopping.repo.ShoppingJarvisPath;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchProductDetailsRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<ShoppingCouponPrices> _couponPrices;
    public volatile String cachedGatewayUrl;
    public final F0C<LruCache<CatalogDetailsKey, CatalogDetailsEntry>> catalogDetails;
    public final F0C<SingleFlight> catalogFlight;
    public final C1BN<ShoppingCouponPrices> couponPrices;
    public final AtomicReference<HoC> couponPruneJob;
    public final AtomicReference<HoC> foregroundPruneJob;
    public final F0C<HatchGatewayPrefsStore> gatewayPrefs;
    public final ConcurrentHashMap.KeySetView<ShoppingCouponPriceKey, Boolean> ownCouponPriceKeys;
    public final C3UX repositoryScope;
    public final AbstractC3358CGz userSession;

    public final class CatalogDetailsEntry extends C06G {
        public final Double couponExpiresAt;
        public final long expiresAtElapsedMs;
        public final ProductDetailsPresentation presentation;
        public final long respondedAtElapsedMs;

        public CatalogDetailsEntry(ProductDetailsPresentation productDetailsPresentation, long j, Double d, long j2) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            this.presentation = productDetailsPresentation;
            this.expiresAtElapsedMs = j;
            this.couponExpiresAt = d;
            this.respondedAtElapsedMs = j2;
        }

        public static /* synthetic */ CatalogDetailsEntry copy$default(CatalogDetailsEntry catalogDetailsEntry, ProductDetailsPresentation productDetailsPresentation, long j, Double d, long j2, int i, Object obj) {
            ProductDetailsPresentation productDetailsPresentation2 = productDetailsPresentation;
            long j3 = j;
            Double d2 = d;
            long j4 = j2;
            if ((i & 1) != 0) {
                productDetailsPresentation2 = catalogDetailsEntry.presentation;
            }
            if ((i & 2) != 0) {
                j3 = catalogDetailsEntry.expiresAtElapsedMs;
            }
            if ((i & 4) != 0) {
                d2 = catalogDetailsEntry.couponExpiresAt;
            }
            if ((i & 8) != 0) {
                j4 = catalogDetailsEntry.respondedAtElapsedMs;
            }
            C7384Etj.A0Y(productDetailsPresentation2, 0);
            return new CatalogDetailsEntry(productDetailsPresentation2, j3, d2, j4);
        }

        public final CatalogDetailsEntry copy(ProductDetailsPresentation productDetailsPresentation, long j, Double d, long j2) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return new CatalogDetailsEntry(productDetailsPresentation, j, d, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CatalogDetailsEntry) {
                    CatalogDetailsEntry catalogDetailsEntry = (CatalogDetailsEntry) obj;
                    if (!C7384Etj.areEqual(this.presentation, catalogDetailsEntry.presentation) || this.expiresAtElapsedMs != catalogDetailsEntry.expiresAtElapsedMs || !C7384Etj.areEqual(this.couponExpiresAt, catalogDetailsEntry.couponExpiresAt) || this.respondedAtElapsedMs != catalogDetailsEntry.respondedAtElapsedMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public final ProductDetailsPresentation component1() {
            return this.presentation;
        }

        public final long component2() {
            return this.expiresAtElapsedMs;
        }

        public final Double component3() {
            return this.couponExpiresAt;
        }

        public final long component4() {
            return this.respondedAtElapsedMs;
        }

        public final Double getCouponExpiresAt() {
            return this.couponExpiresAt;
        }

        public final long getExpiresAtElapsedMs() {
            return this.expiresAtElapsedMs;
        }

        public final ProductDetailsPresentation getPresentation() {
            return this.presentation;
        }

        public final long getRespondedAtElapsedMs() {
            return this.respondedAtElapsedMs;
        }

        public int hashCode() {
            return C8j4.A0B(this.respondedAtElapsedMs, (AnonymousClass006.A06(this.expiresAtElapsedMs, AnonymousClass005.A0E(this.presentation)) + AnonymousClass006.A0D(this.couponExpiresAt)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CatalogDetailsKey extends C06G {
        public final String gatewayUrl;
        public final String priceCurrency;
        public final String productId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CatalogDetailsKey) {
                    CatalogDetailsKey catalogDetailsKey = (CatalogDetailsKey) obj;
                    if (!C7384Etj.areEqual(this.gatewayUrl, catalogDetailsKey.gatewayUrl) || !C7384Etj.areEqual(this.productId, catalogDetailsKey.productId) || !C7384Etj.areEqual(this.priceCurrency, catalogDetailsKey.priceCurrency)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CatalogDetailsKey copy$default(CatalogDetailsKey catalogDetailsKey, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = catalogDetailsKey.gatewayUrl;
            }
            if ((i & 2) != 0) {
                str2 = catalogDetailsKey.productId;
            }
            if ((i & 4) != 0) {
                str3 = catalogDetailsKey.priceCurrency;
            }
            return catalogDetailsKey.copy(str, str2, str3);
        }

        public final String component1() {
            return this.gatewayUrl;
        }

        public final String component2() {
            return this.productId;
        }

        public final String component3() {
            return this.priceCurrency;
        }

        public final String getGatewayUrl() {
            return this.gatewayUrl;
        }

        public final String getPriceCurrency() {
            return this.priceCurrency;
        }

        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.productId, AnonymousClass001.A0G(this.gatewayUrl)) + AnonymousClass006.A0G(this.priceCurrency);
        }

        public CatalogDetailsKey(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.gatewayUrl = str;
            this.productId = str2;
            this.priceCurrency = str3;
        }

        public final CatalogDetailsKey copy(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new CatalogDetailsKey(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository", f = "HatchProductDetailsRepository.kt", l = {647}, m = "fetchBrowserTryOnEligibility", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchBrowserTryOnEligibility$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchProductDetailsRepository.this.fetchBrowserTryOnEligibility(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository", f = "HatchProductDetailsRepository.kt", l = {155}, m = "fetchCatalogDetails", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetails$1, reason: invalid class name and case insensitive filesystem */
    public final class C137181 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C137181(HtJ<? super C137181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchProductDetailsRepository.this.fetchCatalogDetails(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetails$3", f = "HatchProductDetailsRepository.kt", l = {149}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetails$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ProductDetailsFetchResult>, Object> {
        public final /* synthetic */ CatalogDetailsKey $key;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CatalogDetailsKey catalogDetailsKey, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$key = catalogDetailsKey;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchProductDetailsRepository.this.new AnonymousClass3(this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SingleFlightResult.Result result;
            T t;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SingleFlight value = HatchProductDetailsRepository.this.catalogFlight.getValue();
                CatalogDetailsKey catalogDetailsKey = this.$key;
                HatchProductDetailsRepository$fetchCatalogDetails$3$flight$1 hatchProductDetailsRepository$fetchCatalogDetails$3$flight$1 = new HatchProductDetailsRepository$fetchCatalogDetails$3$flight$1(HatchProductDetailsRepository.this, catalogDetailsKey, null);
                this.label = 1;
                obj = value.invoke(catalogDetailsKey, hatchProductDetailsRepository$fetchCatalogDetails$3$flight$1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
            return (!(singleFlightResult instanceof SingleFlightResult.Result) || (result = (SingleFlightResult.Result) singleFlightResult) == null || (t = result.value) == 0) ? ProductDetailsFetchResult.Failed.INSTANCE : t;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ProductDetailsFetchResult> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository", f = "HatchProductDetailsRepository.kt", l = {647, 202, 203}, m = "fetchCatalogDetailsUncached", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetailsUncached$1, reason: invalid class name and case insensitive filesystem */
    public final class C137191 extends HzP {
        public double D$0;
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
        public Object L$9;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C137191(HtJ<? super C137191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchProductDetailsRepository.this.fetchCatalogDetailsUncached(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository", f = "HatchProductDetailsRepository.kt", l = {647}, m = "fetchCurrentCart", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCurrentCart$1, reason: invalid class name and case insensitive filesystem */
    public final class C137201 extends HzP {
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
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C137201(HtJ<? super C137201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchProductDetailsRepository.this.fetchCurrentCart(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository", f = "HatchProductDetailsRepository.kt", l = {647}, m = "fetchDetails", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchDetails$1, reason: invalid class name and case insensitive filesystem */
    public final class C137211 extends HzP {
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

        public C137211(HtJ<? super C137211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchProductDetailsRepository.this.fetchDetails(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository", f = "HatchProductDetailsRepository.kt", l = {671}, m = "postShoppingEvent", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$postShoppingEvent$1, reason: invalid class name and case insensitive filesystem */
    public final class C137221 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public boolean Z$0;
        public boolean Z$1;
        public boolean Z$2;
        public int label;
        public /* synthetic */ Object result;

        public C137221(HtJ<? super C137221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchProductDetailsRepository.this.postShoppingEvent(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository$prefetch$1", f = "HatchProductDetailsRepository.kt", l = {331}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$prefetch$1, reason: invalid class name and case insensitive filesystem */
    public final class C137231 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ProductDetailsHydrationTarget $target;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137231(ProductDetailsHydrationTarget productDetailsHydrationTarget, HtJ<? super C137231> htJ) {
            super(2, htJ);
            this.$target = productDetailsHydrationTarget;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchProductDetailsRepository.this.new C137231(this.$target, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchProductDetailsRepository hatchProductDetailsRepository = HatchProductDetailsRepository.this;
                ProductDetailsHydrationTarget productDetailsHydrationTarget = this.$target;
                String str = productDetailsHydrationTarget.productId;
                ShoppingProductType shoppingProductType = productDetailsHydrationTarget.productType;
                String str2 = productDetailsHydrationTarget.priceCurrency;
                this.label = 1;
                if (hatchProductDetailsRepository.fetchProductDetails(str, shoppingProductType, str2, null, null, this) == enumC10460Hji) {
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
            return ((C137231) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository$pruneExpiredCouponPricesOnForeground$1", f = "HatchProductDetailsRepository.kt", l = {MC.mwa_time_spent_killswitch.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$pruneExpiredCouponPricesOnForeground$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C137241 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C137241(HtJ<? super C137241> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchProductDetailsRepository.this.new C137241(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchProductDetailsRepository.this.new C137241(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05573ua c05573uaA01 = AbstractC05633ui.A01(new HatchProductDetailsRepository$pruneExpiredCouponPricesOnForeground$1$invokeSuspend$$inlined$filter$1(AuraAppLifecycleManager.isAppInForegroundFlow), new HatchProductDetailsRepository$pruneExpiredCouponPricesOnForeground$1$invokeSuspend$$inlined$filter$2(AuraAppLifecycleManager.isAssistOverlayActiveFlow));
                final HatchProductDetailsRepository hatchProductDetailsRepository = HatchProductDetailsRepository.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.shopping.repo.HatchProductDetailsRepository.pruneExpiredCouponPricesOnForeground.1.3
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        hatchProductDetailsRepository.pruneExpiredCouponPrices();
                        return Unit.INSTANCE;
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        hatchProductDetailsRepository.pruneExpiredCouponPrices();
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
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository$signalDeveloperMessage$1", f = "HatchProductDetailsRepository.kt", l = {647}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$signalDeveloperMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C137251 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HxE<String, Object>[] $queryParams;
        public final /* synthetic */ Long $timeoutSeconds;
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
        public C137251(Long l, HxE<String, Object>[] hxEArr, HtJ<? super C137251> htJ) {
            super(2, htJ);
            this.$timeoutSeconds = l;
            this.$queryParams = hxEArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchProductDetailsRepository.this.new C137251(this.$timeoutSeconds, this.$queryParams, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                    ShoppingJarvisPath.Shopping shopping = ShoppingJarvisPath.Shopping.INSTANCE;
                    RequestType requestType = RequestType.GET;
                    AbstractC3358CGz abstractC3358CGz = HatchProductDetailsRepository.this.userSession;
                    Long l = this.$timeoutSeconds;
                    HxE<String, Object>[] hxEArr = this.$queryParams;
                    HxE<String, ? extends Object>[] hxEArr2 = (HxE[]) Arrays.copyOf(hxEArr, hxEArr.length);
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jH = C9jH.A00;
                    HatchProductDetailsRepository$signalDeveloperMessage$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchProductDetailsRepository$signalDeveloperMessage$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchProductDetailsRepository$signalDeveloperMessage$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                    if (hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchProductDetailsRepository$signalDeveloperMessage$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, shopping, requestType, abstractC3358CGz, l, hxEArr2, null, setA18, true, c9jH, true, null, false, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A06(HatchProductDetailsRepositoryKt.TAG, FGI.A0M("signalDeveloperMessage failed: ", e2.getMessage()));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C137251) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final synchronized String currentGatewayUrl() {
        String gatewayUrl;
        gatewayUrl = this.gatewayPrefs.getValue().getGatewayUrl();
        String str = this.cachedGatewayUrl;
        if (str != null && !str.equals(gatewayUrl)) {
            resetCatalogState();
        }
        this.cachedGatewayUrl = gatewayUrl;
        return gatewayUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void pruneExpiredCouponPrices() {
        ShoppingCouponPrices value;
        ShoppingCouponPrices shoppingCouponPrices;
        C10533Hqc c10533HqcA11;
        double dA00 = C8j5.A00();
        BLG<ShoppingCouponPrices> blg = this._couponPrices;
        do {
            value = blg.getValue();
            Map<ShoppingCouponPriceKey, PdpCouponPrice> map = value.prices;
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (((PdpCouponPrice) entryA0l.getValue()).expiresAt > dA00) {
                    AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                }
            }
            shoppingCouponPrices = new ShoppingCouponPrices(linkedHashMapA0j);
        } while (!blg.A6e(value, shoppingCouponPrices));
        this.ownCouponPriceKeys.retainAll(shoppingCouponPrices.prices.keySet());
        Iterator<PdpCouponPrice> it = shoppingCouponPrices.prices.values().iterator();
        if (it.hasNext()) {
            double dMin = it.next().expiresAt;
            while (it.hasNext()) {
                dMin = Math.min(dMin, it.next().expiresAt);
            }
            c10533HqcA11 = AnonymousClass001.A11(new HatchProductDetailsRepository$pruneExpiredCouponPrices$job$1$1(Double.valueOf(dMin).doubleValue(), this, null), this.repositoryScope);
        } else {
            c10533HqcA11 = null;
        }
        HoC andSet = this.couponPruneJob.getAndSet(c10533HqcA11);
        if (andSet != null) {
            andSet.A5w(null);
        }
    }

    private final synchronized void resetCatalogState() {
        if (this.catalogFlight.AOX()) {
            this.catalogFlight.getValue().clearAndCancelAll();
        }
        if (this.catalogDetails.AOX()) {
            this.catalogDetails.getValue().evictAll();
        }
        C8j5.A0r(this.couponPruneJob);
        C8j5.A0r(this.foregroundPruneJob);
        this.ownCouponPriceKeys.clear();
        AnonymousClass001.A1E(this._couponPrices, null, new ShoppingCouponPrices(C9jH.A00));
    }

    private final synchronized void storeCatalogDetails(CatalogDetailsKey catalogDetailsKey, ProductDetailsPresentation productDetailsPresentation, Map<String, PdpCouponPrice> map, boolean z) {
        Double dValueOf;
        if (C7384Etj.areEqual(this.gatewayPrefs.getValue().getGatewayUrl(), catalogDetailsKey.gatewayUrl)) {
            LinkedHashMap linkedHashMapA02 = AGH.A02(map, productDetailsPresentation.couponPrices);
            Iterator it = linkedHashMapA02.values().iterator();
            if (it.hasNext()) {
                double dMin = ((PdpCouponPrice) it.next()).expiresAt;
                while (it.hasNext()) {
                    dMin = Math.min(dMin, ((PdpCouponPrice) it.next()).expiresAt);
                }
                dValueOf = Double.valueOf(dMin);
            } else {
                dValueOf = null;
            }
            long jMin = 300000;
            if (dValueOf != null) {
                long jDoubleValue = (long) ((dValueOf.doubleValue() - C8j5.A00()) * 1000.0d);
                if (jDoubleValue < 0) {
                    jDoubleValue = 0;
                }
                jMin = Math.min(300000L, jDoubleValue);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            F0C<LruCache<CatalogDetailsKey, CatalogDetailsEntry>> f0c = this.catalogDetails;
            if (z) {
                f0c.getValue().put(catalogDetailsKey, new CatalogDetailsEntry(productDetailsPresentation, jMin + jElapsedRealtime, dValueOf, jElapsedRealtime));
            } else {
                f0c.getValue().remove(catalogDetailsKey);
            }
            ShoppingCouponPriceKey shoppingCouponPriceKey = new ShoppingCouponPriceKey(productDetailsPresentation.productId, catalogDetailsKey.priceCurrency);
            PdpCouponPrice pdpCouponPrice = productDetailsPresentation.couponPrices.get(productDetailsPresentation.productId);
            Map mapA09 = AGH.A09(productDetailsPresentation.productId, linkedHashMapA02);
            double dA00 = C8j5.A00();
            Map<ShoppingCouponPriceKey, PdpCouponPrice> map2 = this._couponPrices.getValue().prices;
            C7384Etj.A0Y(map2, 0);
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            HashSet hashSet = new HashSet();
            linkedHashMap.remove(shoppingCouponPriceKey);
            if (pdpCouponPrice != null) {
                linkedHashMap.put(shoppingCouponPriceKey, pdpCouponPrice);
            }
            Iterator itA0n = AnonymousClass002.A0n(mapA09);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String strA0t = C60O.A0t(entryA0l);
                PdpCouponPrice pdpCouponPrice2 = (PdpCouponPrice) entryA0l.getValue();
                ShoppingCouponPriceKey shoppingCouponPriceKey2 = new ShoppingCouponPriceKey(strA0t, catalogDetailsKey.priceCurrency);
                if (!hasFreshNoCouponResponse(new CatalogDetailsKey(catalogDetailsKey.gatewayUrl, strA0t, catalogDetailsKey.priceCurrency), jElapsedRealtime) && putUnlessOwnLive(linkedHashMap, shoppingCouponPriceKey2, pdpCouponPrice2, dA00)) {
                    hashSet.add(shoppingCouponPriceKey2);
                }
            }
            AnonymousClass002.A1I(this._couponPrices, new ShoppingCouponPrices(linkedHashMap));
            this.ownCouponPriceKeys.removeAll(hashSet);
            ConcurrentHashMap.KeySetView<ShoppingCouponPriceKey, Boolean> keySetView = this.ownCouponPriceKeys;
            if (pdpCouponPrice != null) {
                keySetView.add(shoppingCouponPriceKey);
            } else {
                keySetView.remove(shoppingCouponPriceKey);
            }
            pruneExpiredCouponPrices();
            if (!this._couponPrices.getValue().prices.isEmpty()) {
                pruneExpiredCouponPricesOnForeground();
            }
        }
    }

    public final Object fetchProductDetails(String str, ShoppingProductType shoppingProductType, String str2, String str3, String str4, HtJ<? super ProductDetailsFetchResult> htJ) {
        HxE<String, Object>[] hxEArrDetailsQueryParams;
        if (str4 != null) {
            hxEArrDetailsQueryParams = HatchProductDetailsHydrationKt.connectorDetailsQueryParams(str4, str);
        } else {
            if (shoppingProductType == ShoppingProductType.CATALOG) {
                return fetchCatalogDetails(str, str2, htJ);
            }
            hxEArrDetailsQueryParams = HatchProductDetailsHydrationKt.detailsQueryParams(shoppingProductType, str, str2, false, str3, AbstractC0878AGe.A0g(ProductDetailsActionButton.getEntries()));
            if (hxEArrDetailsQueryParams == null) {
                return ProductDetailsFetchResult.Failed.INSTANCE;
            }
        }
        return fetchDetails(hxEArrDetailsQueryParams, htJ);
    }

    public final synchronized boolean hasFreshOwnNoCouponResponse(String str, String str2) {
        CatalogDetailsKey catalogDetailsKeyCatalogKey;
        C7384Etj.A0Y(str, 0);
        catalogDetailsKeyCatalogKey = catalogKey(str, str2);
        return catalogDetailsKeyCatalogKey != null ? hasFreshNoCouponResponse(catalogDetailsKeyCatalogKey, SystemClock.elapsedRealtime()) : false;
    }

    public final void prefetch(ProductDetailsHydrationTarget productDetailsHydrationTarget) {
        C7384Etj.A0Y(productDetailsHydrationTarget, 0);
        if (productDetailsHydrationTarget.productType == ShoppingProductType.MARKETPLACE) {
            AnonymousClass001.A1J(new C137231(productDetailsHydrationTarget, null), this.repositoryScope);
        }
    }

    public final synchronized void resetGatewayState$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo() {
        resetCatalogState();
        this.cachedGatewayUrl = null;
    }

    public final void signalDeveloperMessage(String str, ShoppingProductType shoppingProductType, String str2, Set<? extends ProductDetailsActionButton> set) {
        HxE<String, Object>[] hxEArrDetailsQueryParams;
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1B(shoppingProductType, 1, set);
        if (C7BY.A0j(str) || shoppingProductType == ShoppingProductType.BROWSER || (hxEArrDetailsQueryParams = HatchProductDetailsHydrationKt.detailsQueryParams(shoppingProductType, str, str2, true, null, set)) == null) {
            return;
        }
        AnonymousClass001.A1J(new C137251(shoppingProductType != ShoppingProductType.CATALOG ? null : 65L, hxEArrDetailsQueryParams, null), this.repositoryScope);
    }

    public final synchronized void storeShoppingResultCouponPrices(Map<ShoppingCouponPriceKey, PdpCouponPrice> map) {
        C7384Etj.A0Y(map, 0);
        String strCurrentGatewayUrl = currentGatewayUrl();
        double dA00 = C8j5.A00();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            ShoppingCouponPriceKey shoppingCouponPriceKey = (ShoppingCouponPriceKey) entryA0l.getKey();
            if (((PdpCouponPrice) entryA0l.getValue()).expiresAt > dA00 && !hasFreshNoCouponResponse(new CatalogDetailsKey(strCurrentGatewayUrl, shoppingCouponPriceKey.productId, shoppingCouponPriceKey.priceCurrency), jElapsedRealtime)) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        if (!linkedHashMapA0j.isEmpty()) {
            Map<ShoppingCouponPriceKey, PdpCouponPrice> map2 = this._couponPrices.getValue().prices;
            C7384Etj.A0Y(map2, 0);
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            HashSet hashSet = new HashSet();
            Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(itA0i);
                ShoppingCouponPriceKey shoppingCouponPriceKey2 = (ShoppingCouponPriceKey) entryA0l2.getKey();
                if (putUnlessOwnLive(linkedHashMap, shoppingCouponPriceKey2, (PdpCouponPrice) entryA0l2.getValue(), dA00)) {
                    hashSet.add(shoppingCouponPriceKey2);
                }
            }
            AnonymousClass002.A1I(this._couponPrices, new ShoppingCouponPrices(linkedHashMap));
            this.ownCouponPriceKeys.removeAll(hashSet);
            pruneExpiredCouponPrices();
            if (!this._couponPrices.getValue().prices.isEmpty()) {
                pruneExpiredCouponPricesOnForeground();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductDetailsPresentation cachedCatalogDetails(CatalogDetailsKey catalogDetailsKey) {
        Double d;
        CatalogDetailsEntry catalogDetailsEntry = this.catalogDetails.getValue().get(catalogDetailsKey);
        if (catalogDetailsEntry == null || SystemClock.elapsedRealtime() >= catalogDetailsEntry.expiresAtElapsedMs || ((d = catalogDetailsEntry.couponExpiresAt) != null && d.doubleValue() <= C8j5.A00())) {
            return null;
        }
        return catalogDetailsEntry.presentation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchCatalogDetails(java.lang.String r8, java.lang.String r9, X.HtJ<? super com.facebook.aura.shopping.repo.ProductDetailsFetchResult> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.shopping.repo.HatchProductDetailsRepository.C137181
            if (r0 == 0) goto L1e
            r6 = r10
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetails$1 r6 = (com.facebook.aura.shopping.repo.HatchProductDetailsRepository.C137181) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L28
            goto L24
        L1e:
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetails$1 r6 = new com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetails$1
            r6.<init>(r10)
            goto L12
        L24:
            X.Hwg.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L61
            return r0
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r0)
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$CatalogDetailsKey r3 = r7.catalogKey(r8, r9)
            if (r3 != 0) goto L39
            com.facebook.aura.shopping.repo.ProductDetailsFetchResult$Failed r1 = com.facebook.aura.shopping.repo.ProductDetailsFetchResult.Failed.INSTANCE
            return r1
        L39:
            com.facebook.aura.shopping.model.ProductDetailsPresentation r0 = r7.cachedCatalogDetails(r3)
            if (r0 == 0) goto L45
            com.facebook.aura.shopping.repo.ProductDetailsFetchResult$Success r1 = new com.facebook.aura.shopping.repo.ProductDetailsFetchResult$Success
            r1.<init>(r0)
            return r1
        L45:
            X.3UX r2 = r7.repositoryScope     // Catch: java.util.concurrent.CancellationException -> L61
            r1 = 0
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetails$3 r0 = new com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetails$3     // Catch: java.util.concurrent.CancellationException -> L61
            r0.<init>(r3, r1)     // Catch: java.util.concurrent.CancellationException -> L61
            X.Hrx r0 = X.AnonymousClass001.A10(r0, r2)     // Catch: java.util.concurrent.CancellationException -> L61
            r6.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L61
            r6.L$1 = r1     // Catch: java.util.concurrent.CancellationException -> L61
            r6.L$2 = r1     // Catch: java.util.concurrent.CancellationException -> L61
            r6.label = r4     // Catch: java.util.concurrent.CancellationException -> L61
            java.lang.Object r0 = r0.A0E(r6)     // Catch: java.util.concurrent.CancellationException -> L61
            if (r0 != r5) goto L60
            return r5
        L60:
            return r0
        L61:
            X.C3cG.A1H(r6)
            com.facebook.aura.shopping.repo.ProductDetailsFetchResult$Failed r0 = com.facebook.aura.shopping.repo.ProductDetailsFetchResult.Failed.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.HatchProductDetailsRepository.fetchCatalogDetails(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0193 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchCatalogDetailsUncached(com.facebook.aura.shopping.repo.HatchProductDetailsRepository.CatalogDetailsKey r43, boolean r44, X.HtJ<? super com.facebook.aura.shopping.repo.ProductDetailsFetchResult> r45) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.HatchProductDetailsRepository.fetchCatalogDetailsUncached(com.facebook.aura.shopping.repo.HatchProductDetailsRepository$CatalogDetailsKey, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchDetails(X.HxE<java.lang.String, java.lang.Object>[] r36, X.HtJ<? super com.facebook.aura.shopping.repo.ProductDetailsFetchResult> r37) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.HatchProductDetailsRepository.fetchDetails(X.HxE[], X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object fetchProductDetails$default(HatchProductDetailsRepository hatchProductDetailsRepository, String str, ShoppingProductType shoppingProductType, String str2, String str3, String str4, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        return hatchProductDetailsRepository.fetchProductDetails(str, shoppingProductType, str2, str3, str4, htJ);
    }

    private final boolean hasFreshNoCouponResponse(CatalogDetailsKey catalogDetailsKey, long j) {
        CatalogDetailsEntry catalogDetailsEntry = this.catalogDetails.getValue().get(catalogDetailsKey);
        return catalogDetailsEntry != null && j - catalogDetailsEntry.respondedAtElapsedMs < 300000 && C7384Etj.areEqual(catalogDetailsEntry.presentation.productId, catalogDetailsKey.productId) && !catalogDetailsEntry.presentation.ownCouponPriceIds.contains(catalogDetailsKey.productId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postShoppingEvent(com.facebook.aura.shopping.repo.ShoppingEventRequestJson r23, boolean r24, X.HtJ<? super java.lang.Boolean> r25) {
        /*
            r22 = this;
            r4 = r25
            r8 = r23
            boolean r0 = r4 instanceof com.facebook.aura.shopping.repo.HatchProductDetailsRepository.C137221
            r5 = r22
            if (r0 == 0) goto L29
            r2 = r4
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$postShoppingEvent$1 r2 = (com.facebook.aura.shopping.repo.HatchProductDetailsRepository.C137221) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L29
            int r3 = r3 - r1
            r2.label = r3
        L18:
            java.lang.Object r3 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r15 = 1
            r6 = 0
            if (r0 == 0) goto L34
            if (r0 != r15) goto L2f
            java.lang.Object r8 = r2.L$0
            com.facebook.aura.shopping.repo.ShoppingEventRequestJson r8 = (com.facebook.aura.shopping.repo.ShoppingEventRequestJson) r8
            goto L8c
        L29:
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$postShoppingEvent$1 r2 = new com.facebook.aura.shopping.repo.HatchProductDetailsRepository$postShoppingEvent$1
            r2.<init>(r4)
            goto L18
        L2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L34:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            com.facebook.aura.shopping.repo.ShoppingJarvisPath$ShoppingEvents r7 = com.facebook.aura.shopping.repo.ShoppingJarvisPath.ShoppingEvents.INSTANCE     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            X.CGz r10 = r5.userSession     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            X.HxE[] r13 = new X.HxE[r6]     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            java.util.Set r14 = X.AnonymousClass004.A18()     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            X.9jH r17 = X.C9jH.A00     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$postShoppingEvent$$inlined$executeJarvisRequest-Z6QaZII$default$1 r4 = com.facebook.aura.shopping.repo.HatchProductDetailsRepository$postShoppingEvent$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$postShoppingEvent$$inlined$executeJarvisRequest-Z6QaZII$default$2 r5 = com.facebook.aura.shopping.repo.HatchProductDetailsRepository$postShoppingEvent$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.L$0 = r8     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r11 = 0
            r2.L$1 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.L$2 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.L$3 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.L$4 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.L$5 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.L$6 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.L$7 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.L$8 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r0 = r24
            r2.Z$0 = r0     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.I$0 = r15     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.Z$1 = r0     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.I$1 = r6     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.Z$2 = r0     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.I$2 = r6     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.I$3 = r6     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.I$4 = r6     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r2.label = r15     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r12 = r11
            r18 = r11
            r19 = r6
            r20 = r0
            r21 = r6
            r22 = r6
            r23 = r11
            r24 = r6
            r25 = r2
            r16 = r0
            java.lang.Object r0 = r3.m1599executeJarvisRequestWithFof5HsY(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            if (r0 != r1) goto L90
            return r1
        L8c:
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
        L90:
            boolean r0 = r0 instanceof X.C10571Hud     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Laf
            r0 = r0 ^ 1
            goto Laa
        L95:
            r4 = move-exception
            java.lang.String r3 = r8.type
            java.lang.String r2 = r4.getMessage()
            java.lang.String r1 = "shopping event "
            java.lang.String r0 = " failed: "
            java.lang.String r1 = X.FGI.A0d(r1, r3, r0, r2)
            java.lang.String r0 = "HatchProductDetailsRepository"
            X.CFK.A08(r0, r1, r4)
            r0 = 0
        Laa:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        Laf:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.HatchProductDetailsRepository.postShoppingEvent(com.facebook.aura.shopping.repo.ShoppingEventRequestJson, boolean, X.HtJ):java.lang.Object");
    }

    private final void pruneExpiredCouponPricesOnForeground() {
        HoC hoC = this.foregroundPruneJob.get();
        if (hoC == null || !hoC.isActive()) {
            this.foregroundPruneJob.set(AnonymousClass001.A11(new C137241(null), this.repositoryScope));
        }
    }

    private final boolean putUnlessOwnLive(Map<ShoppingCouponPriceKey, PdpCouponPrice> map, ShoppingCouponPriceKey shoppingCouponPriceKey, PdpCouponPrice pdpCouponPrice, double d) {
        PdpCouponPrice pdpCouponPrice2;
        if (this.ownCouponPriceKeys.contains(shoppingCouponPriceKey) && (pdpCouponPrice2 = map.get(shoppingCouponPriceKey)) != null && pdpCouponPrice2.expiresAt > d) {
            return false;
        }
        map.put(shoppingCouponPriceKey, pdpCouponPrice);
        return true;
    }

    public static /* synthetic */ Object recordShoppingEvent$default(HatchProductDetailsRepository hatchProductDetailsRepository, HatchShoppingEventType hatchShoppingEventType, String str, String str2, String str3, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return hatchProductDetailsRepository.recordShoppingEvent(hatchShoppingEventType, str, str2, str3, htJ);
    }

    private final ShoppingEventRequestJson toAddToCartRequest(ShoppingAddToCartTarget shoppingAddToCartTarget, String str) {
        String shoppingEventRef;
        String shoppingEventRef2;
        if (shoppingAddToCartTarget instanceof ShoppingAddToCartTarget.Widget) {
            String wire = HatchShoppingEventType.CLICKED_ADD_TO_CART.getWire();
            ShoppingAddToCartTarget.Widget widget = (ShoppingAddToCartTarget.Widget) shoppingAddToCartTarget;
            String shoppingEventRef3 = toShoppingEventRef(widget.productId);
            if (shoppingEventRef3 != null && (shoppingEventRef2 = toShoppingEventRef(widget.widgetId)) != null) {
                return new ShoppingEventRequestJson(wire, shoppingEventRef3, null, str, shoppingEventRef2, null, null, null, null);
            }
        } else {
            if (!(shoppingAddToCartTarget instanceof ShoppingAddToCartTarget.Citation)) {
                throw C3cG.A0q();
            }
            String wire2 = HatchShoppingEventType.CLICKED_ADD_TO_CART.getWire();
            ShoppingAddToCartTarget.Citation citation = (ShoppingAddToCartTarget.Citation) shoppingAddToCartTarget;
            String shoppingEventRef4 = toShoppingEventRef(citation.messageId);
            if (shoppingEventRef4 != null && (shoppingEventRef = toShoppingEventRef(citation.citationId)) != null) {
                return new ShoppingEventRequestJson(wire2, null, null, str, null, shoppingEventRef4, shoppingEventRef, null, null);
            }
        }
        return null;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        HzS.A04(this.repositoryScope.AEA());
        resetGatewayState$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchBrowserTryOnEligibility(java.lang.String r20, java.lang.String r21, java.lang.String r22, X.HtJ<? super java.lang.Boolean> r23) {
        /*
            r19 = this;
            r4 = r23
            boolean r0 = r4 instanceof com.facebook.aura.shopping.repo.HatchProductDetailsRepository.AnonymousClass1
            r6 = r19
            if (r0 == 0) goto L23
            r0 = r4
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchBrowserTryOnEligibility$1 r0 = (com.facebook.aura.shopping.repo.HatchProductDetailsRepository.AnonymousClass1) r0
            int r3 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L23
            int r3 = r3 - r2
            r0.label = r3
        L16:
            java.lang.Object r4 = r0.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r3 = r0.label
            r5 = 0
            r1 = 1
            if (r3 == 0) goto L2e
            if (r3 != r1) goto L29
            goto L9a
        L23:
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchBrowserTryOnEligibility$1 r0 = new com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchBrowserTryOnEligibility$1
            r0.<init>(r4)
            goto L16
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r4)
            java.lang.String r3 = com.facebook.aura.shopping.model.ProductDetailsPresentationKt.trimToNonEmpty(r21)
            if (r3 != 0) goto L38
            return r5
        L38:
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            com.facebook.aura.shopping.repo.ShoppingJarvisPath$Shopping r10 = com.facebook.aura.shopping.repo.ShoppingJarvisPath.Shopping.INSTANCE     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.GET     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            X.CGz r12 = r6.userSession     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r6 = r20
            r4 = r22
            X.HxE[] r4 = com.facebook.aura.shopping.repo.HatchProductDetailsHydrationKt.browserProductDetailsQueryParams(r6, r3, r4)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            int r3 = r4.length     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r4, r3)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            X.HxE[] r14 = (X.HxE[]) r14     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r13 = 0
            r16 = 300000(0x493e0, double:1.482197E-318)
            r18 = 3600000(0x36ee80, double:1.7786363E-317)
            r21 = 1048576(0x100000, double:5.180654E-318)
            com.facebook.aura.network.transport.HatchHttpCachePolicy r15 = new com.facebook.aura.network.transport.HatchHttpCachePolicy     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r20 = r13
            r23 = r1
            r15.<init>(r16, r18, r20, r21, r23)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            java.util.Set r16 = X.AnonymousClass004.A18()     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            X.9jH r18 = X.C9jH.A00     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchBrowserTryOnEligibility$$inlined$executeJarvisRequest-1iavgos$default$1 r8 = com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchBrowserTryOnEligibility$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r9 = 0
            r0.L$0 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$1 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$2 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$3 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$4 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$5 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$6 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$7 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$8 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$9 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$10 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.L$11 = r13     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.I$0 = r1     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.I$1 = r9     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.I$2 = r9     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r0.label = r1     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            r19 = r9
            r21 = r9
            r22 = r0
            r17 = r1
            java.lang.Object r1 = r7.m1595executeBodylessJarvisRequestWithp3iPjrY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            if (r1 != r2) goto L9e
            return r2
        L9a:
            java.lang.Object r1 = X.AnonymousClass001.A0q(r4)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
        L9e:
            boolean r0 = r1 instanceof X.C10571Hud     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            if (r0 == 0) goto La3
            r1 = r5
        La3:
            com.facebook.aura.shopping.repo.ShoppingResponseEnvelopeJson r1 = (com.facebook.aura.shopping.repo.ShoppingResponseEnvelopeJson) r1     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            if (r1 == 0) goto Laa
            java.lang.Boolean r2 = r1.is_tryon_eligible     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lbc
            return r2
        Laa:
            return r5
        Lab:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "fetchBrowserTryOnEligibility failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "HatchProductDetailsRepository"
            X.CFK.A06(r0, r1)
            return r5
        Lbc:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.HatchProductDetailsRepository.fetchBrowserTryOnEligibility(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchCurrentCart(java.lang.String r22, X.HtJ<? super com.facebook.aura.shopping.model.CurrentShoppingCart> r23) {
        /*
            r21 = this;
            r4 = r23
            boolean r0 = r4 instanceof com.facebook.aura.shopping.repo.HatchProductDetailsRepository.C137201
            r5 = r21
            if (r0 == 0) goto L91
            r3 = r4
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCurrentCart$1 r3 = (com.facebook.aura.shopping.repo.HatchProductDetailsRepository.C137201) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r4 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L98
            java.lang.Object r1 = X.AnonymousClass001.A0q(r4)
        L26:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L2b
            r1 = r7
        L2b:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            if (r1 == 0) goto L97
            com.facebook.aura.shopping.model.CurrentShoppingCart r2 = com.facebook.aura.shopping.model.ShoppingCartPresentationJsonKt.parseCurrentShoppingCart(r1)
            return r2
        L34:
            X.Hwg.A00(r4)
            r0 = r22
            java.lang.String r6 = r5.toShoppingEventRef(r0)
            if (r6 != 0) goto L40
            return r7
        L40:
            com.facebook.aura.network.http.HatchHttpApi r8 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.shopping.repo.ShoppingJarvisPath$ShoppingCart r11 = com.facebook.aura.shopping.repo.ShoppingJarvisPath.ShoppingCart.INSTANCE
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r13 = r5.userSession
            r4 = 100
            java.lang.Long r14 = X.C3cG.A0S(r4)
            java.lang.String r0 = "widget_id"
            X.HxE r0 = X.C3cG.A0r(r0, r6)
            r10 = 0
            X.HxE[] r15 = new X.HxE[]{r0}
            java.util.Set r17 = X.AnonymousClass004.A18()
            X.9jH r19 = X.C9jH.A00
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCurrentCart$$inlined$executeJarvisRequest-1iavgos$default$1 r9 = com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCurrentCart$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.L$3 = r0
            r3.L$4 = r0
            r3.L$5 = r0
            r3.L$6 = r0
            r3.L$7 = r0
            r3.L$8 = r0
            r3.L$9 = r0
            r3.I$0 = r1
            r3.I$1 = r1
            r3.I$2 = r10
            r3.label = r1
            r20 = r1
            r21 = r0
            r22 = r10
            r23 = r3
            r16 = r0
            r18 = r1
            java.lang.Object r1 = r8.m1595executeBodylessJarvisRequestWithp3iPjrY(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r1 != r2) goto L26
            return r2
        L91:
            com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCurrentCart$1 r3 = new com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCurrentCart$1
            r3.<init>(r4)
            goto L16
        L97:
            return r7
        L98:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.HatchProductDetailsRepository.fetchCurrentCart(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final C1BN<ShoppingCouponPrices> getCouponPrices() {
        return this.couponPrices;
    }

    public final class Companion {
        public final HatchProductDetailsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchProductDetailsRepository) abstractC3358CGz.A03(HatchProductDetailsRepository.class, new HatchProductDetailsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchProductDetailsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.repositoryScope = C78W.A03();
        this.catalogFlight = AbstractC5321DgF.A03(new HatchProductDetailsRepository$catalogFlight$1(this));
        this.gatewayPrefs = AbstractC5321DgF.A03(new HatchProductDetailsRepository$gatewayPrefs$1(this));
        this.catalogDetails = AbstractC5321DgF.A03(HatchProductDetailsRepository$catalogDetails$1.INSTANCE);
        C9286GCn c9286GCnA14 = C3cG.A14(new ShoppingCouponPrices(C9jH.A00));
        this._couponPrices = c9286GCnA14;
        this.ownCouponPriceKeys = ConcurrentHashMap.newKeySet();
        this.couponPruneJob = new AtomicReference<>(null);
        this.foregroundPruneJob = new AtomicReference<>(null);
        this.couponPrices = C3cG.A11(c9286GCnA14);
    }

    private final CatalogDetailsKey catalogKey(String str, String str2) {
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str);
        if (strTrimToNonEmpty == null) {
            return null;
        }
        return new CatalogDetailsKey(currentGatewayUrl(), strTrimToNonEmpty, ProductDetailsPresentationKt.trimToNonEmpty(str2));
    }

    private final String toShoppingEventRef(String str) {
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str);
        if (strTrimToNonEmpty == null || C3cG.A1S(strTrimToNonEmpty).length > 160) {
            return null;
        }
        return strTrimToNonEmpty;
    }

    public final Object recordAddToCart(ShoppingAddToCartTarget shoppingAddToCartTarget, String str, HtJ<? super Boolean> htJ) {
        ShoppingEventRequestJson addToCartRequest = toAddToCartRequest(shoppingAddToCartTarget, str);
        if (addToCartRequest == null) {
            return false;
        }
        return postShoppingEvent(addToCartRequest, false, htJ);
    }

    public final Object recordCartCheckout(String str, CurrentShoppingCart currentShoppingCart, String str2, String str3, HtJ<? super Boolean> htJ) {
        String str4;
        String shoppingEventRef = toShoppingEventRef(str);
        if (shoppingEventRef == null || (str4 = currentShoppingCart.capturedAt) == null || currentShoppingCart.checkoutLabel == null) {
            return false;
        }
        return postShoppingEvent(new ShoppingEventRequestJson(HatchShoppingEventType.CLICKED_CHECKOUT_CART.getWire(), null, null, str2, shoppingEventRef, null, null, new ShoppingDisplayedCartJson(str4, currentShoppingCart.cart.retailerName), str3), false, htJ);
    }

    public final Object recordShoppingEvent(HatchShoppingEventType hatchShoppingEventType, String str, String str2, String str3, HtJ<? super Boolean> htJ) {
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str);
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(str2);
        if (strTrimToNonEmpty != null ? strTrimToNonEmpty2 == null : strTrimToNonEmpty2 != null) {
            return postShoppingEvent(new ShoppingEventRequestJson(hatchShoppingEventType.getWire(), strTrimToNonEmpty, strTrimToNonEmpty2, str3, null, null, null, null, null), false, htJ);
        }
        return false;
    }

    public /* synthetic */ HatchProductDetailsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
