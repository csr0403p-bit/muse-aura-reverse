package com.facebook.aura.marketplacemap;

import X.AGI;
import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D8;
import X.C1DM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.maps.intf.NativeMapRenderer;
import com.facebook.aura.maps.intf.NativeMaps;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.model.MarketplaceMapListing;
import com.facebook.aura.model.MarketplaceMapWidgetData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchMarketplaceMapCardKt {

    /* renamed from: com.facebook.aura.marketplacemap.HatchMarketplaceMapCardKt$ApproximateLocationsCaption$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceMapCardKt.ApproximateLocationsCaption(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.HatchMarketplaceMapCardKt$MarketplaceEmbeddedMap$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onExpand;
        public final /* synthetic */ G0U<MarketplaceMapListing, Unit> $onPinTapped;
        public final /* synthetic */ G0U<String, Unit> $onSelectedListingChanged;
        public final /* synthetic */ MarketplaceMapPins $pins;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ NativeMapRenderer $renderer;
        public final /* synthetic */ String $selectedListingId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(NativeMapRenderer nativeMapRenderer, MarketplaceMapPins marketplaceMapPins, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super MarketplaceMapListing, Unit> g0u2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$renderer = nativeMapRenderer;
            this.$pins = marketplaceMapPins;
            this.$hostMessageId = str;
            this.$presentationId = str2;
            this.$selectedListingId = str3;
            this.$onSelectedListingChanged = g0u;
            this.$onPinTapped = g0u2;
            this.$onExpand = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceMapCardKt.MarketplaceEmbeddedMap(this.$renderer, this.$pins, this.$hostMessageId, this.$presentationId, this.$selectedListingId, this.$onSelectedListingChanged, this.$onPinTapped, this.$onExpand, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.HatchMarketplaceMapCardKt$MarketplaceMapListingList$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<MarketplaceMapListing> $listings;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<MarketplaceMapListing, Unit> $onRowTapped;
        public final /* synthetic */ String $selectedListingId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<MarketplaceMapListing> ahd, String str, G0U<? super MarketplaceMapListing, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$listings = ahd;
            this.$selectedListingId = str;
            this.$onRowTapped = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceMapCardKt.MarketplaceMapListingList(this.$listings, this.$selectedListingId, this.$onRowTapped, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.HatchMarketplaceMapCardKt$MarketplaceMapSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C126842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onExpand;
        public final /* synthetic */ G0U<MarketplaceMapListing, Unit> $onPinTapped;
        public final /* synthetic */ G0U<String, Unit> $onSelectedListingChanged;
        public final /* synthetic */ MarketplaceMapPins $pins;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ NativeMapRenderer $renderer;
        public final /* synthetic */ String $selectedListingId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126842(NativeMapRenderer nativeMapRenderer, MarketplaceMapPins marketplaceMapPins, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super MarketplaceMapListing, Unit> g0u2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$renderer = nativeMapRenderer;
            this.$pins = marketplaceMapPins;
            this.$hostMessageId = str;
            this.$presentationId = str2;
            this.$selectedListingId = str3;
            this.$onSelectedListingChanged = g0u;
            this.$onPinTapped = g0u2;
            this.$onExpand = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceMapCardKt.MarketplaceMapSection(this.$renderer, this.$pins, this.$hostMessageId, this.$presentationId, this.$selectedListingId, this.$onSelectedListingChanged, this.$onPinTapped, this.$onExpand, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void MarketplaceMapListingList(AHD<MarketplaceMapListing> ahd, String str, G0U<? super MarketplaceMapListing, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(561777456);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -643780235);
            while (itA0w.hasNext()) {
                MarketplaceMapListing marketplaceMapListing = (MarketplaceMapListing) itA0w.next();
                bfm.Ag8(-1407737616, marketplaceMapListing.id);
                boolean zAreEqual = C7384Etj.areEqual(marketplaceMapListing.id, str);
                boolean zA1T = AnonymousClass001.A1T(bfm, marketplaceMapListing, AnonymousClass003.A1D(iA05));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchMarketplaceMapCardKt$MarketplaceMapListingList$1$1$1$1(g0u, marketplaceMapListing);
                    BBI.A0O(bbi, objAaT);
                }
                MarketplaceMapListingRowKt.MarketplaceMapListingRow(marketplaceMapListing, zAreEqual, (Function0) objAaT, null, bfm, MarketplaceMapListing.$stable, 8);
                BBI.A0R(bbi, false);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ahd, str, g0u, bRg2, i, i2);
        }
    }

    public static final void ApproximateLocationsCaption(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2135273683);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120446);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(C1b8.A03(bRg2, C1D8.A00(4.0f), auraTheme.getColors(bfm, 6).card), AuraDimensKt.SpacingXsmall, AuraDimensKt.SpacingMicro), C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption1Regular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    /* renamed from: HatchMarketplaceMapCard-8r3B23s, reason: not valid java name */
    public static final void m1440HatchMarketplaceMapCard8r3B23s(MarketplaceMapWidgetData marketplaceMapWidgetData, String str, String str2, long j, C1DM c1dm, G0V<? super MarketplaceMapListing, ? super MarketplaceMapTapSource, Unit> g0v, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(marketplaceMapWidgetData, str, str2);
        C7384Etj.A0Y(c1dm, 4);
        AnonymousClass003.A0z(g0v, g0u);
        bfm.AgG(1022567268);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(marketplaceMapWidgetData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0P(bfm, j);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, c1dm);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0v);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0u);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA05 |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA05 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA05 & 14;
            boolean z = i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(marketplaceMapWidgetData));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = MarketplaceMapPinsKt.toMapPins(marketplaceMapWidgetData);
                bfm.Ai0(objAaT);
            }
            MarketplaceMapPins marketplaceMapPins = (MarketplaceMapPins) objAaT;
            boolean z2 = i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(marketplaceMapWidgetData));
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == C78N.A00) {
                objAaT2 = AGI.A07(marketplaceMapWidgetData.listings);
                bfm.Ai0(objAaT2);
            }
            AHD ahd = (AHD) objAaT2;
            Object[] objArr = {str, str2};
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT3 == obj) {
                objAaT3 = HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$selectedListingId$2$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT3, objArr);
            String strA05 = MutableState.A05(mutableStateA0N);
            if (strA05 == null || !marketplaceMapPins.artifactIdsByListingId.containsKey(strA05)) {
                strA05 = null;
            }
            NativeMapRenderer renderer = NativeMaps.INSTANCE.getRenderer();
            if (renderer == null || !(!marketplaceMapPins.listingsByArtifactId.isEmpty())) {
                renderer = null;
            }
            BRg bRgA01 = C1b8.A01(C11U.A03(AnonymousClass001.A0R(bRg2), c1dm), j);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            if (renderer != null) {
                boolean zA1Y = AnonymousClass001.A1Y(mutableStateA0N, bfm, -1115714020);
                Object objAaT4 = bfm.AaT();
                if (zA1Y || objAaT4 == obj) {
                    objAaT4 = new HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$1$1$1(mutableStateA0N);
                    BBI.A0O(bbi, objAaT4);
                }
                G0U g0u2 = (G0U) objAaT4;
                boolean zA1Q = AnonymousClass002.A1Q(iA05 & 458752, 131072);
                Object objAaT5 = bfm.AaT();
                if (zA1Q || objAaT5 == obj) {
                    objAaT5 = new HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$1$2$1(g0v);
                    BBI.A0O(bbi, objAaT5);
                }
                G0U g0u3 = (G0U) objAaT5;
                boolean zA1R = AnonymousClass001.A1R(bfm, strA05, AnonymousClass005.A1B(iA05));
                Object objAaT6 = bfm.AaT();
                if (zA1R || objAaT6 == obj) {
                    objAaT6 = new HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$1$3$1(g0u, strA05);
                    BBI.A0O(bbi, objAaT6);
                }
                MarketplaceMapSection(renderer, marketplaceMapPins, str, str2, strA05, g0u2, g0u3, (Function0) objAaT6, null, bfm, (iA05 << 3) & 8064, 256);
                AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1115271960);
                BBI.A0R(bbi, false);
            }
            boolean zA1K = AnonymousClass003.A1K(bfm, mutableStateA0N, marketplaceMapPins) | AnonymousClass002.A1Q(iA05 & 458752, 131072);
            Object objAaT7 = bfm.AaT();
            if (zA1K || objAaT7 == obj) {
                objAaT7 = new HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$1$4$1(marketplaceMapPins, g0v, mutableStateA0N);
                BBI.A0O(bbi, objAaT7);
            }
            MarketplaceMapListingList(ahd, strA05, (G0U) objAaT7, null, bfm, MarketplaceMapListing.$stable, 8);
            BBI.A0R(bbi, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$2(marketplaceMapWidgetData, str, str2, j, c1dm, g0v, g0u, bRg2, i, i2);
        }
    }

    public static final void MarketplaceEmbeddedMap(NativeMapRenderer nativeMapRenderer, MarketplaceMapPins marketplaceMapPins, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super MarketplaceMapListing, Unit> g0u2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1574433086);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeMapRenderer, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, marketplaceMapPins);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str3);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0u2);
        }
        if ((12582912 & i) == 0) {
            iA05 |= AnonymousClass004.A0a(bfm, function0);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA05 |= iA0l;
        } else if ((100663296 & i) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA05 |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 38347923, 38347922), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchMapScene hatchMapScene = marketplaceMapPins.scene;
            String strA0p = str3 != null ? C60O.A0p(str3, marketplaceMapPins.artifactIdsByListingId) : null;
            boolean zA1H = AnonymousClass007.A1H(iA05);
            int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA18 = zA1H | AnonymousClass003.A18(i4);
            Object objAaT = bfm.AaT();
            if (zA18 || objAaT == C78N.A00) {
                objAaT = new HatchMarketplaceMapCardKt$MarketplaceEmbeddedMap$2$1(g0u, marketplaceMapPins);
                BBI.A0T(bfm, objAaT);
            }
            G0U<? super String, Unit> g0u3 = (G0U) objAaT;
            boolean zA182 = AnonymousClass003.A18(i4) | AnonymousClass006.A1Y(iA05, 3670016);
            Object objAaT2 = bfm.AaT();
            if (zA182 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMarketplaceMapCardKt$MarketplaceEmbeddedMap$3$1(marketplaceMapPins, g0u2);
                BBI.A0T(bfm, objAaT2);
            }
            nativeMapRenderer.EmbeddedMap(hatchMapScene, str, str2, strA0p, g0u3, (G0U) objAaT2, function0, bRg2, bfm, AnonymousClass001.A09(iA05 << 24, (iA05 >> 3) & 33031152));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(nativeMapRenderer, marketplaceMapPins, str, str2, str3, g0u, g0u2, function0, bRg2, i, i2);
        }
    }

    public static final void MarketplaceMapSection(NativeMapRenderer nativeMapRenderer, MarketplaceMapPins marketplaceMapPins, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super MarketplaceMapListing, Unit> g0u2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1719935791);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeMapRenderer, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, marketplaceMapPins);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str3);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0u2);
        }
        if ((12582912 & i) == 0) {
            iA05 |= AnonymousClass004.A0a(bfm, function0);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA05 |= iA0l;
        } else if ((100663296 & i) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA05 |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(38347923 & iA05, 38347922), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg2), 280.0f);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            MarketplaceEmbeddedMap(nativeMapRenderer, marketplaceMapPins, str, str2, str3, g0u, g0u2, function0, c0z7.AQJ(bs0), bfm, iA05 & 33554430, 0);
            ApproximateLocationsCaption(C3U4.A09(c0z7.A4C(C2VU.A08, bs0), AuraDimensKt.SpacingXsmall), bfm, 0, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126842(nativeMapRenderer, marketplaceMapPins, str, str2, str3, g0u, g0u2, function0, bRg2, i, i2);
        }
    }
}
