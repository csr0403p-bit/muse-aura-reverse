package com.facebook.aura.hotels;

import X.AGI;
import X.AHD;
import X.AKQ;
import X.ARD;
import X.AbstractC1061ATk;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.B1U;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C03X;
import X.C10G;
import X.C1515AkP;
import X.C1Cj;
import X.C1V6;
import X.C1VA;
import X.C1VW;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HotelResultsScreenKt$HotelResultsGrid$2$1 extends AbstractC7559F3s implements G0U<C1Cj, Unit> {
    public final /* synthetic */ HotelResultsCollection $collection;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ String $sessionId;

    /* renamed from: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsGrid$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C1V6, C1VW> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke-BHJ-flc, reason: not valid java name */
        public final long m1082invokeBHJflc(C1V6 c1v6) {
            C7384Etj.A0Y(c1v6, 0);
            int i = C1VA.A00;
            if (i > 0) {
                return i;
            }
            AbstractC1061ATk.A00("The span value should be higher than 0");
            throw F60.createAndThrow();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ C1VW invoke(C1V6 c1v6) {
            return new C1VW(m1082invokeBHJflc(c1v6));
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsGrid$2$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C03X, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(3);
            this.$onRetry = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C03X c03x, BFM bfm, Integer num) {
            invoke(c03x, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C03X c03x, BFM bfm, int i) {
            C7384Etj.A0Y(c03x, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HotelResultsScreenKt$HotelResultsGrid$2$1$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                BRg bRgA01 = ARD.A01(bs0, (G0U) objAaT, false);
                Function0<Unit> function0 = this.$onRetry;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA01);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
                HotelBookingTextKt.SecondaryLine(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120349), null, bfm, 0, 2);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12034b), null, null, AnonymousClass006.A0g(bfm), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134201325);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsGrid$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<HotelResultsEntry, Object> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public final Object invoke(HotelResultsEntry hotelResultsEntry) {
            C7384Etj.A0Y(hotelResultsEntry, 0);
            return HotelBookingFormattingKt.identityKey(hotelResultsEntry.hotel);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1Cj c1Cj) {
        C7384Etj.A0Y(c1Cj, 0);
        if (this.$collection.refreshFailed) {
            c1Cj.APK(null, null, AnonymousClass1.INSTANCE, B1U.A02(new AnonymousClass2(this.$onRetry), -1914772737));
        }
        final AHD<HotelResultsEntry> ahd = this.$collection.entries;
        final AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
        final AuraNavigator auraNavigator = this.$navigator;
        final String str = this.$sessionId;
        final HotelResultsScreenKt$HotelResultsGrid$2$1$invoke$$inlined$items$default$1 hotelResultsScreenKt$HotelResultsGrid$2$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsGrid$2$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(HotelResultsEntry hotelResultsEntry) {
                return null;
            }
        };
        c1Cj.APM(anonymousClass3 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsGrid$2$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return anonymousClass3.invoke(ahd.get(i));
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsGrid$2$1$invoke$$inlined$items$default$4
            public final Object invoke(int i) {
                return hotelResultsScreenKt$HotelResultsGrid$2$1$invoke$$inlined$items$default$1.invoke(ahd.get(i));
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, null, B1U.A02(new G2j<C03X, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsGrid$2$1$invoke$$inlined$items$default$5
            public final void invoke(C03X c03x, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, c03x) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                HotelResultsEntry hotelResultsEntry = (HotelResultsEntry) ahd.get(i);
                bfm.AgE(-1381235245);
                HotelResult hotelResult = hotelResultsEntry.hotel;
                String strHotelImageSharedKey = HotelResultsCardKt.hotelImageSharedKey(hotelResultsEntry.searchRef, hotelResult.resultRef, true);
                BRg bRgPrefetchHotelDetailsOnImpression = HotelDetailsPrefetchModifierKt.prefetchHotelDetailsOnImpression(C10G.A02, AGI.A0E(new HotelReviewSource(hotelResultsEntry.searchRef, hotelResultsEntry.hotel.resultRef)), bfm, (HotelReviewSource.$stable << 3) | 6);
                boolean zA1R = AnonymousClass001.A1R(bfm, str, AnonymousClass003.A1N(bfm, auraNavigator, hotelResultsEntry));
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HotelResultsScreenKt$HotelResultsGrid$2$1$4$1$1(auraNavigator, hotelResultsEntry, str);
                    bfm.Ai0(objAaT);
                }
                HotelResultsCardKt.HotelResultTile(hotelResult, strHotelImageSharedKey, (Function0) objAaT, bRgPrefetchHotelDetailsOnImpression, bfm, 0, 0);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(C03X c03x, Integer num, BFM bfm, Integer num2) {
                invoke(c03x, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, -1117249557), ahd.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelResultsScreenKt$HotelResultsGrid$2$1(HotelResultsCollection hotelResultsCollection, Function0<Unit> function0, AuraNavigator auraNavigator, String str) {
        super(1);
        this.$collection = hotelResultsCollection;
        this.$onRetry = function0;
        this.$navigator = auraNavigator;
        this.$sessionId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1Cj c1Cj) {
        invoke2(c1Cj);
        return Unit.INSTANCE;
    }
}
