package com.facebook.aura.marketplacemap;

import X.AKO;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1er;
import X.C3cG;
import X.C60O;
import X.C78N;
import X.G0U;
import X.G0V;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.maps.intf.NativeMapRenderer;
import com.facebook.aura.maps.intf.NativeMaps;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.model.MarketplaceMapWidgetData;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchMarketplaceMapFullscreenScreenKt {

    /* renamed from: com.facebook.aura.marketplacemap.HatchMarketplaceMapFullscreenScreenKt$DismissEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ MarketplaceMapFullscreenScreenKey $key;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, Function0<Unit> function0, int i) {
            super(2);
            this.$key = marketplaceMapFullscreenScreenKey;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceMapFullscreenScreenKt.DismissEffect(this.$key, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.HatchMarketplaceMapFullscreenScreenKt$HatchMarketplaceMapFullscreenScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MarketplaceMapFullscreenScreenKey $key;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$key = marketplaceMapFullscreenScreenKey;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceMapFullscreenScreenKt.HatchMarketplaceMapFullscreenScreen(this.$key, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.HatchMarketplaceMapFullscreenScreenKt$HatchMarketplaceMapFullscreenScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C126852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MarketplaceMapFullscreenScreenKey $key;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126852(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$key = marketplaceMapFullscreenScreenKey;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceMapFullscreenScreenKt.HatchMarketplaceMapFullscreenScreen(this.$key, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MarketplaceMapWidgetData $data;
        public final /* synthetic */ MarketplaceMapFullscreenScreenKey $key;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ NativeMapRenderer $renderer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(NativeMapRenderer nativeMapRenderer, MarketplaceMapWidgetData marketplaceMapWidgetData, MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$renderer = nativeMapRenderer;
            this.$data = marketplaceMapWidgetData;
            this.$key = marketplaceMapFullscreenScreenKey;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceMapFullscreenScreenKt.MarketplaceFullscreenMap(this.$renderer, this.$data, this.$key, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchMarketplaceMapFullscreenScreen(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        Object c126852;
        BBb bBbAAc;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(marketplaceMapFullscreenScreenKey, function0);
        bfm.AgG(-863364941);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(marketplaceMapFullscreenScreenKey, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            MarketplaceMapWidgetData marketplaceMapWidgetDataData = MarketplaceMapRegistry.Companion.getInstance(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi)).data(marketplaceMapFullscreenScreenKey.hostMessageId, marketplaceMapFullscreenScreenKey.widgetId);
            NativeMapRenderer renderer = NativeMaps.INSTANCE.getRenderer();
            if (marketplaceMapWidgetDataData == null || renderer == null) {
                bfm.AgE(2054534109);
                DismissEffect(marketplaceMapFullscreenScreenKey, function0, bfm, MarketplaceMapFullscreenScreenKey.$stable | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc != null) {
                    c126852 = new AnonymousClass1(marketplaceMapFullscreenScreenKey, function0, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c126852);
                }
                return;
            }
            bfm.AgE(2054582159);
            BBI.A0R(bbi, zA1b);
            int i4 = iA05 << 6;
            MarketplaceFullscreenMap(renderer, marketplaceMapWidgetDataData, marketplaceMapFullscreenScreenKey, function0, bRg2, bfm, (i4 & 57344) | AnonymousClass002.A08(i4, (MarketplaceMapWidgetData.$stable << 3) | (MarketplaceMapFullscreenScreenKey.$stable << 6)), zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c126852 = new C126852(marketplaceMapFullscreenScreenKey, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c126852);
        }
    }

    public static final void MarketplaceFullscreenMap(NativeMapRenderer nativeMapRenderer, MarketplaceMapWidgetData marketplaceMapWidgetData, MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1169710618);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeMapRenderer, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(marketplaceMapWidgetData, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(marketplaceMapFullscreenScreenKey, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A65(marketplaceMapWidgetData));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = MarketplaceMapPinsKt.toMapPins(marketplaceMapWidgetData);
                bfm.Ai0(objAaT);
            }
            MarketplaceMapPins marketplaceMapPins = (MarketplaceMapPins) objAaT;
            Object[] objArr = {marketplaceMapFullscreenScreenKey};
            int i4 = iA05 & 896;
            boolean z2 = i4 == 256 || ((iA05 & 512) != 0 && bfm.A67(marketplaceMapFullscreenScreenKey));
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$selectedListingId$2$1(marketplaceMapFullscreenScreenKey);
                BBI.A0T(bfm, objAaT2);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            Context contextA01 = AKO.A01(bbi);
            boolean zA1K = AnonymousClass003.A1K(bfm, marketplaceMapFullscreenScreenKey.sessionId, marketplaceMapFullscreenScreenKey.hostMessageId);
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == C78N.A00) {
                objAaT3 = new MarketplaceMapLogContext(marketplaceMapFullscreenScreenKey.sessionId, marketplaceMapFullscreenScreenKey.hostMessageId);
                BBI.A0O(bbi, objAaT3);
            }
            MarketplaceMapLogContext marketplaceMapLogContext = (MarketplaceMapLogContext) objAaT3;
            HatchMapScene hatchMapScene = marketplaceMapPins.scene;
            String str = marketplaceMapFullscreenScreenKey.hostMessageId;
            String str2 = marketplaceMapFullscreenScreenKey.widgetId;
            String strA05 = MutableState.A05(mutableStateA0N);
            String strA0p = strA05 != null ? C60O.A0p(strA05, marketplaceMapPins.artifactIdsByListingId) : null;
            boolean zA1K2 = AnonymousClass003.A1K(bfm, mutableStateA0N, marketplaceMapPins);
            Object objAaT4 = bfm.AaT();
            if (zA1K2 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$2$1(marketplaceMapPins, mutableStateA0N);
                BBI.A0O(bbi, objAaT4);
            }
            G0U<? super String, Unit> g0u = (G0U) objAaT4;
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA01, AnonymousClass005.A1Y(bfm, auraNavigatorA05, abstractC3358CGzA06, bfm.A65(marketplaceMapPins), bfm.A65(marketplaceMapLogContext)), i4 == 256 || ((iA05 & 512) != 0 && bfm.A67(marketplaceMapFullscreenScreenKey)));
            Object objAaT5 = bfm.AaT();
            if (zA1V || objAaT5 == C78N.A00) {
                objAaT5 = new HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$3$1(marketplaceMapPins, marketplaceMapLogContext, auraNavigatorA05, abstractC3358CGzA06, marketplaceMapFullscreenScreenKey, contextA01);
                BBI.A0O(bbi, objAaT5);
            }
            nativeMapRenderer.FullscreenMap(hatchMapScene, str, str2, strA0p, g0u, (G0U) objAaT5, function0, bRg2, bfm, AnonymousClass001.A09(iA05 << 24, (iA05 << 9) & 33030144));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(nativeMapRenderer, marketplaceMapWidgetData, marketplaceMapFullscreenScreenKey, function0, bRg2, i, i2);
        }
    }

    public static final void DismissEffect(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(113319421);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(marketplaceMapFullscreenScreenKey, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchMarketplaceMapFullscreenScreenKt$DismissEffect$1$1(mutableStateA00);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, marketplaceMapFullscreenScreenKey);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(marketplaceMapFullscreenScreenKey, function0, i);
        }
    }
}
