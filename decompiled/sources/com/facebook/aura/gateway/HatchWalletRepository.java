package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cH;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchWalletRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<Map<String, CheckoutInfoState>> _checkoutInfo;
    public volatile int cacheGeneration;
    public volatile WalletCatalog cachedCatalog;
    public final SingleFlight catalogFetch;
    public final C1BN<Map<String, CheckoutInfoState>> checkoutInfo;
    public final SingleFlight checkoutInfoFetch;
    public final C3UX checkoutInfoScope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchWalletRepository$loadCheckoutInfo$2", f = "HatchWalletRepository.kt", l = {74}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchWalletRepository$loadCheckoutInfo$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $paymentMethod;
        public final /* synthetic */ CheckoutInfoState $requested;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchWalletRepository$loadCheckoutInfo$2$1", f = "HatchWalletRepository.kt", l = {163}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchWalletRepository$loadCheckoutInfo$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $paymentMethod;
            public final /* synthetic */ CheckoutInfoState $requested;
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
            public final /* synthetic */ HatchWalletRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchWalletRepository hatchWalletRepository, String str, CheckoutInfoState checkoutInfoState, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = hatchWalletRepository;
                this.$paymentMethod = str;
                this.$requested = checkoutInfoState;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$paymentMethod, this.$requested, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    r21 = this;
                    X.Hji r3 = X.EnumC10460Hji.A02
                    r4 = r21
                    int r0 = r4.label
                    r9 = 0
                    r2 = 1
                    if (r0 == 0) goto L5f
                    if (r0 != r2) goto Lab
                    java.lang.Object r2 = X.AnonymousClass002.A0j(r22)
                L10:
                    boolean r1 = r2 instanceof X.C10571Hud
                    r0 = 0
                    if (r1 == 0) goto L16
                    r2 = r0
                L16:
                    com.facebook.aura.gateway.CheckoutInfoJson r2 = (com.facebook.aura.gateway.CheckoutInfoJson) r2
                    if (r2 == 0) goto L5a
                    java.lang.String r1 = r4.$paymentMethod
                    java.lang.String r0 = r2.payment_method
                    boolean r0 = X.C7384Etj.areEqual(r0, r1)
                    if (r0 == 0) goto L5a
                    com.facebook.aura.gateway.CheckoutInfo r0 = r2.toDomain()
                    if (r0 == 0) goto L5a
                L2a:
                    com.facebook.aura.gateway.HatchWalletRepository r1 = r4.this$0
                    X.BLG<java.util.Map<java.lang.String, com.facebook.aura.gateway.CheckoutInfoState>> r8 = r1._checkoutInfo
                    java.lang.String r7 = r4.$paymentMethod
                    com.facebook.aura.gateway.CheckoutInfoState r6 = r4.$requested
                L32:
                    java.lang.Object r5 = r8.getValue()
                    r4 = r5
                    java.util.Map r4 = (java.util.Map) r4
                    java.lang.Object r1 = r4.get(r7)
                    if (r1 != r6) goto L51
                    boolean r3 = X.AnonymousClass002.A1Y(r0)
                    java.lang.String r2 = r6.locale
                    X.C7384Etj.A0Y(r2, r9)
                    com.facebook.aura.gateway.CheckoutInfoState r1 = new com.facebook.aura.gateway.CheckoutInfoState
                    r1.<init>(r2, r0, r3, r9)
                    java.util.Map r4 = X.AnonymousClass006.A11(r7, r1, r4)
                L51:
                    boolean r1 = r8.A6e(r5, r4)
                    if (r1 == 0) goto L32
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                L5a:
                    com.facebook.aura.gateway.CheckoutInfoState r0 = r4.$requested
                    com.facebook.aura.gateway.CheckoutInfo r0 = r0.info
                    goto L2a
                L5f:
                    X.Hwg.A00(r22)
                    com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
                    com.facebook.aura.network.api.JarvisPath$WalletCheckoutInfo r10 = com.facebook.aura.network.api.JarvisPath.WalletCheckoutInfo.INSTANCE
                    com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.GET
                    com.facebook.aura.gateway.HatchWalletRepository r0 = r4.this$0
                    X.CGz r12 = r0.userSession
                    java.lang.String r1 = "payment_method"
                    java.lang.String r0 = r4.$paymentMethod
                    X.HxE r0 = X.C3cG.A0r(r1, r0)
                    X.HxE[] r14 = new X.HxE[]{r0}
                    java.util.Set r16 = X.AnonymousClass004.A18()
                    X.9jH r18 = X.AGH.A0E()
                    com.facebook.aura.gateway.HatchWalletRepository$loadCheckoutInfo$2$1$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1 r8 = com.facebook.aura.gateway.HatchWalletRepository$loadCheckoutInfo$2$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
                    r13 = 0
                    r4.L$0 = r13
                    r4.L$1 = r13
                    r4.L$2 = r13
                    r4.L$3 = r13
                    r4.L$4 = r13
                    r4.L$5 = r13
                    r4.L$6 = r13
                    r4.I$0 = r2
                    r4.I$1 = r2
                    r4.I$2 = r9
                    r4.label = r2
                    r15 = r13
                    r17 = r2
                    r19 = r2
                    r20 = r13
                    r21 = r9
                    r22 = r4
                    java.lang.Object r2 = r7.m1595executeBodylessJarvisRequestWithp3iPjrY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                    if (r2 != r3) goto L10
                    return r3
                Lab:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchWalletRepository.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, CheckoutInfoState checkoutInfoState, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$paymentMethod = str;
            this.$requested = checkoutInfoState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWalletRepository.this.new AnonymousClass2(this.$paymentMethod, this.$requested, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Map<String, CheckoutInfoState> value;
            Map<String, CheckoutInfoState> mapA11;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                BLG<Map<String, CheckoutInfoState>> blg = HatchWalletRepository.this._checkoutInfo;
                String str = this.$paymentMethod;
                CheckoutInfoState checkoutInfoState = this.$requested;
                do {
                    value = blg.getValue();
                    mapA11 = value;
                    if (mapA11.get(str) == checkoutInfoState) {
                        CheckoutInfo checkoutInfo = checkoutInfoState.info;
                        boolean zA1Y = AnonymousClass002.A1Y(checkoutInfo);
                        String str2 = checkoutInfoState.locale;
                        C7384Etj.A0Y(str2, 0);
                        mapA11 = AnonymousClass006.A11(str, new CheckoutInfoState(str2, checkoutInfo, zA1Y, false), mapA11);
                    }
                } while (!blg.A6e(value, mapA11));
            }
            if (i == 0) {
                Hwg.A00(obj);
                CheckoutInfoState checkoutInfoState2 = HatchWalletRepository.this._checkoutInfo.getValue().get(this.$paymentMethod);
                CheckoutInfoState checkoutInfoState3 = this.$requested;
                if (checkoutInfoState2 == checkoutInfoState3) {
                    HatchWalletRepository hatchWalletRepository = HatchWalletRepository.this;
                    SingleFlight singleFlight = hatchWalletRepository.checkoutInfoFetch;
                    String str3 = this.$paymentMethod;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchWalletRepository, str3, checkoutInfoState3, null);
                    this.label = 1;
                    if (singleFlight.invoke(str3, anonymousClass1, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadCheckoutInfo(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            r5 = 0
            X.C7384Etj.A0Y(r7, r5)
            X.BLG<java.util.Map<java.lang.String, com.facebook.aura.gateway.CheckoutInfoState>> r0 = r6._checkoutInfo
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r0.get(r7)
            com.facebook.aura.gateway.CheckoutInfoState r1 = (com.facebook.aura.gateway.CheckoutInfoState) r1
            com.facebook.aura.network.AuraAcceptLanguage r0 = com.facebook.aura.network.AuraAcceptLanguage.INSTANCE
            java.lang.String r2 = r0.headerValue()
            r4 = 0
            if (r8 != 0) goto L2c
            if (r1 == 0) goto L2a
            java.lang.String r0 = r1.locale
        L1f:
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 == 0) goto L2c
            boolean r0 = r1.failed
            if (r0 != 0) goto L2e
            return
        L2a:
            r0 = r4
            goto L1f
        L2c:
            if (r1 == 0) goto L5c
        L2e:
            java.lang.String r0 = r1.locale
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 == 0) goto L5c
            com.facebook.aura.gateway.CheckoutInfo r1 = r1.info
        L38:
            r0 = 1
            com.facebook.aura.gateway.CheckoutInfoState r3 = new com.facebook.aura.gateway.CheckoutInfoState
            r3.<init>(r2, r1, r5, r0)
            X.BLG<java.util.Map<java.lang.String, com.facebook.aura.gateway.CheckoutInfoState>> r2 = r6._checkoutInfo
        L40:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = X.AnonymousClass006.A11(r7, r3, r0)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L40
            X.3UX r1 = r6.checkoutInfoScope
            com.facebook.aura.gateway.HatchWalletRepository$loadCheckoutInfo$2 r0 = new com.facebook.aura.gateway.HatchWalletRepository$loadCheckoutInfo$2
            r0.<init>(r7, r3, r4)
            X.AnonymousClass001.A1J(r0, r1)
            return
        L5c:
            r1 = r4
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchWalletRepository.loadCheckoutInfo(java.lang.String, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* renamed from: fetchCatalog-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m968fetchCatalogIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.gateway.WalletCatalog>> r19) {
        /*
            r18 = this;
            r5 = r19
            boolean r0 = r5 instanceof com.facebook.aura.gateway.HatchWalletRepository$fetchCatalog$1
            r3 = r18
            if (r0 == 0) goto L86
            r2 = r5
            com.facebook.aura.gateway.HatchWalletRepository$fetchCatalog$1 r2 = (com.facebook.aura.gateway.HatchWalletRepository$fetchCatalog$1) r2
            int r4 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L86
            int r4 = r4 - r1
            r2.label = r4
        L16:
            java.lang.Object r4 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r14 = 1
            if (r0 == 0) goto L43
            if (r0 != r14) goto L8c
            int r0 = r2.I$0
            java.lang.Object r4 = X.AnonymousClass001.A0q(r4)
        L27:
            boolean r1 = r4 instanceof X.C10571Hud
            r1 = r1 ^ 1
            if (r1 == 0) goto L33
            com.facebook.aura.gateway.WalletCatalogJson r4 = (com.facebook.aura.gateway.WalletCatalogJson) r4
            com.facebook.aura.gateway.WalletCatalog r4 = r4.toDomain()
        L33:
            boolean r1 = r4 instanceof X.C10571Hud
            r1 = r1 ^ 1
            if (r1 == 0) goto L42
            r2 = r4
            com.facebook.aura.gateway.WalletCatalog r2 = (com.facebook.aura.gateway.WalletCatalog) r2
            int r1 = r3.cacheGeneration
            if (r1 != r0) goto L42
            r3.cachedCatalog = r2
        L42:
            return r4
        L43:
            X.Hwg.A00(r4)
            int r0 = r3.cacheGeneration
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$Wallet r7 = com.facebook.aura.network.api.JarvisPath.Wallet.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r9 = r3.userSession
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.AGH.A0E()
            com.facebook.aura.gateway.HatchWalletRepository$fetchCatalog-IoAF18A$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.gateway.HatchWalletRepository$fetchCatalogIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r10 = 0
            r2.L$0 = r10
            r2.L$1 = r10
            r2.L$2 = r10
            r2.L$3 = r10
            r2.L$4 = r10
            r2.L$5 = r10
            r2.L$6 = r10
            r2.I$0 = r0
            r2.I$1 = r14
            r2.I$2 = r14
            r2.I$3 = r6
            r2.label = r14
            r12 = r10
            r16 = r14
            r17 = r10
            r18 = r6
            r19 = r2
            java.lang.Object r4 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r4 != r1) goto L27
            return r1
        L86:
            com.facebook.aura.gateway.HatchWalletRepository$fetchCatalog$1 r2 = new com.facebook.aura.gateway.HatchWalletRepository$fetchCatalog$1
            r2.<init>(r3, r5)
            goto L16
        L8c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchWalletRepository.m968fetchCatalogIoAF18A(X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cacheGeneration++;
        this.cachedCatalog = null;
        this.catalogFetch.clearAndCancelAll();
        Hxb.A03(null, this.checkoutInfoScope);
        this.checkoutInfoFetch.clearAndCancelAll();
        this._checkoutInfo.Af8(AGH.A0E());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: getCatalog-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m969getCataloggIAlus(boolean r7, X.HtJ<? super X.HsJ<com.facebook.aura.gateway.WalletCatalog>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchWalletRepository$getCatalog$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.gateway.HatchWalletRepository$getCatalog$1 r5 = (com.facebook.aura.gateway.HatchWalletRepository$getCatalog$1) r5
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
            com.facebook.aura.gateway.HatchWalletRepository$getCatalog$2 r0 = new com.facebook.aura.gateway.HatchWalletRepository$getCatalog$2
            r0.<init>(r7, r6, r1)
            r5.Z$0 = r7
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.gateway.HatchWalletRepository$getCatalog$1 r5 = new com.facebook.aura.gateway.HatchWalletRepository$getCatalog$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchWalletRepository.m969getCataloggIAlus(boolean, X.HtJ):java.lang.Object");
    }

    public final C1BN<Map<String, CheckoutInfoState>> getCheckoutInfo() {
        return this.checkoutInfo;
    }

    public final class Companion {
        public final HatchWalletRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchWalletRepository) abstractC3358CGz.A03(HatchWalletRepository.class, new HatchWalletRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchWalletRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        C7384Etj.A0Y(join, 1);
        this.catalogFetch = new LazyStartSingleFlightImpl(join);
        this.checkoutInfoScope = C3cH.A0w();
        OnDuplicateCall.Cancel cancel = OnDuplicateCall.Cancel.INSTANCE;
        C7384Etj.A0Y(cancel, 1);
        this.checkoutInfoFetch = new LazyStartSingleFlightImpl(cancel);
        C9286GCn c9286GCnA01 = HnJ.A01(AGH.A0E());
        this._checkoutInfo = c9286GCnA01;
        this.checkoutInfo = c9286GCnA01;
    }

    public /* synthetic */ HatchWalletRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
