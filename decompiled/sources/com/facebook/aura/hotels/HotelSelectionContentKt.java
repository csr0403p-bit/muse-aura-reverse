package com.facebook.aura.hotels;

import X.AHD;
import X.AKO;
import X.AKQ;
import X.ARD;
import X.ARK;
import X.AVy;
import X.AbstractC05192Wm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0A8;
import X.C0dm;
import X.C0v5;
import X.C1003AOr;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1BO;
import X.C1YD;
import X.C1YY;
import X.C2VU;
import X.C31t;
import X.C3TH;
import X.C3U4;
import X.C3UC;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C8j3;
import X.C8j4;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.text.BidiFormatter;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.hotels.HotelRefundability;
import com.facebook.aura.hotels.policy.HotelTaxesInfoLabelKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HotelSelectionContentKt {

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelProviderRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, String str3, int i, int i2) {
            super(2);
            this.$name = str;
            this.$iconUrl = str2;
            this.$modifier = bRg;
            this.$subtitle = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelProviderRow(this.$name, this.$iconUrl, this.$modifier, this.$subtitle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionCancellation$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;
        public final /* synthetic */ HotelSelectionSheetKey $selectionKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$selectionKey = hotelSelectionSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionCancellation(this.$selection, this.$selectionKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C122042 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $actionsEnabled;
        public final /* synthetic */ boolean $linksEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAskAboutRooms;
        public final /* synthetic */ HotelReviewState $roomDiscussionState;
        public final /* synthetic */ HotelSelection $selection;
        public final /* synthetic */ HotelSelectionSheetKey $selectionKey;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122042(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, HotelReviewState hotelReviewState, Function0<Unit> function0, boolean z, String str, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$selectionKey = hotelSelectionSheetKey;
            this.$roomDiscussionState = hotelReviewState;
            this.$onAskAboutRooms = function0;
            this.$actionsEnabled = z;
            this.$sourceSessionId = str;
            this.$linksEnabled = z2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionContent(this.$selection, this.$selectionKey, this.$roomDiscussionState, this.$onAskAboutRooms, this.$actionsEnabled, this.$sourceSessionId, this.$linksEnabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionDate$2, reason: invalid class name and case insensitive filesystem */
    public final class C122052 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $date;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122052(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$date = str;
            this.$time = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionDate(this.$date, this.$time, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionDates$2, reason: invalid class name and case insensitive filesystem */
    public final class C122062 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122062(HotelSelection hotelSelection, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionDates(this.$selection, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionFeeRows$1, reason: invalid class name and case insensitive filesystem */
    public final class C122071 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowTaxes;
        public final /* synthetic */ HotelPrice $price;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122071(HotelPrice hotelPrice, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$price = hotelPrice;
            this.$onShowTaxes = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionFeeRows(this.$price, this.$onShowTaxes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionFeeRows$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowTaxes;
        public final /* synthetic */ HotelPrice $price;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HotelPrice hotelPrice, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$price = hotelPrice;
            this.$onShowTaxes = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionFeeRows(this.$price, this.$onShowTaxes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionImportantInformation$1, reason: invalid class name and case insensitive filesystem */
    public final class C122081 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122081(HotelSelection hotelSelection, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionImportantInformation(this.$selection, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionImportantInformation$3, reason: invalid class name and case insensitive filesystem */
    public final class C122093 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122093(HotelSelection hotelSelection, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionImportantInformation(this.$selection, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionImportantInformationHeader$3, reason: invalid class name and case insensitive filesystem */
    public final class C122103 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onToggle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122103(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$expanded = z;
            this.$onToggle = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionImportantInformationHeader(this.$expanded, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionInfoSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C122112 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelInfoSection $section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122112(HotelInfoSection hotelInfoSection, BRg bRg, int i, int i2) {
            super(2);
            this.$section = hotelInfoSection;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionInfoSection(this.$section, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionIntroduction$2, reason: invalid class name and case insensitive filesystem */
    public final class C122122 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122122(HotelSelection hotelSelection, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionIntroduction(this.$selection, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionOverviewSummary$2, reason: invalid class name and case insensitive filesystem */
    public final class C122132 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122132(HotelSelection hotelSelection, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionOverviewSummary(this.$selection, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPaymentRows$1, reason: invalid class name and case insensitive filesystem */
    public final class C122141 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122141(HotelSelection hotelSelection, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionPaymentRows(this.$selection, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPaymentRows$3, reason: invalid class name and case insensitive filesystem */
    public final class C122153 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122153(HotelSelection hotelSelection, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionPaymentRows(this.$selection, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPhotos$1, reason: invalid class name and case insensitive filesystem */
    public final class C122161 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hotelName;
        public final /* synthetic */ List<HotelImage> $images;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sharedKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122161(List<HotelImage> list, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$images = list;
            this.$hotelName = str;
            this.$sharedKey = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionPhotos(this.$images, this.$hotelName, this.$sharedKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPhotos$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hotelName;
        public final /* synthetic */ List<HotelImage> $images;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sharedKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(List<HotelImage> list, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$images = list;
            this.$hotelName = str;
            this.$sharedKey = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionPhotos(this.$images, this.$hotelName, this.$sharedKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPrice$1, reason: invalid class name and case insensitive filesystem */
    public final class C122171 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;
        public final /* synthetic */ HotelSelectionSheetKey $selectionKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122171(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$selectionKey = hotelSelectionSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionPrice(this.$selection, this.$selectionKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPrice$3, reason: invalid class name and case insensitive filesystem */
    public final class C122183 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;
        public final /* synthetic */ HotelSelectionSheetKey $selectionKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122183(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$selectionKey = hotelSelectionSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionPrice(this.$selection, this.$selectionKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPriceBreakdown$1, reason: invalid class name and case insensitive filesystem */
    public final class C122191 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;
        public final /* synthetic */ HotelSelectionSheetKey $selectionKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122191(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$selectionKey = hotelSelectionSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionPriceBreakdown(this.$selection, this.$selectionKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPriceBreakdown$3, reason: invalid class name and case insensitive filesystem */
    public final class C122203 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;
        public final /* synthetic */ HotelSelectionSheetKey $selectionKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122203(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$selectionKey = hotelSelectionSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionPriceBreakdown(this.$selection, this.$selectionKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPriceRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C122213 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $amount;
        public final /* synthetic */ boolean $emphasized;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $note;
        public final /* synthetic */ Function0<Unit> $onShowTaxes;
        public final /* synthetic */ boolean $secondary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122213(String str, String str2, BRg bRg, boolean z, boolean z2, String str3, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$label = str;
            this.$amount = str2;
            this.$modifier = bRg;
            this.$emphasized = z;
            this.$secondary = z2;
            this.$note = str3;
            this.$onShowTaxes = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionPriceRow(this.$label, this.$amount, this.$modifier, this.$emphasized, this.$secondary, this.$note, this.$onShowTaxes, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionRefundPolicyLine$2, reason: invalid class name and case insensitive filesystem */
    public final class C122222 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $refundTerms;
        public final /* synthetic */ HotelSelectionSheetKey $selectionKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122222(String str, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$refundTerms = str;
            this.$selectionKey = hotelSelectionSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionRefundPolicyLine(this.$refundTerms, this.$selectionKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionRoom$1, reason: invalid class name and case insensitive filesystem */
    public final class C122231 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $actionsEnabled;
        public final /* synthetic */ HotelReviewState $discussion;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAskAboutRooms;
        public final /* synthetic */ HotelSelection $selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122231(HotelSelection hotelSelection, HotelReviewState hotelReviewState, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$discussion = hotelReviewState;
            this.$onAskAboutRooms = function0;
            this.$actionsEnabled = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionRoom(this.$selection, this.$discussion, this.$onAskAboutRooms, this.$actionsEnabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionRoom$3, reason: invalid class name and case insensitive filesystem */
    public final class C122243 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $actionsEnabled;
        public final /* synthetic */ HotelReviewState $discussion;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAskAboutRooms;
        public final /* synthetic */ HotelSelection $selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122243(HotelSelection hotelSelection, HotelReviewState hotelReviewState, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$discussion = hotelReviewState;
            this.$onAskAboutRooms = function0;
            this.$actionsEnabled = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionRoom(this.$selection, this.$discussion, this.$onAskAboutRooms, this.$actionsEnabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionSecondaryText$1, reason: invalid class name and case insensitive filesystem */
    public final class C122251 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122251(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionSecondaryText(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionSectionTitle$2, reason: invalid class name and case insensitive filesystem */
    public final class C122262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122262(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContentKt.HotelSelectionSectionTitle(this.$title, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HotelSelectionCancellation(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        Object anonymousClass1;
        BBb bBbAAc;
        String strA01;
        BBI bbiA07;
        BRg bRg2 = bRg;
        bfm.AgG(128984416);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelSelection) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, hotelSelectionSheetKey);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HotelCancellation hotelCancellation = hotelSelection.cancellation;
            HotelRefundability refundability = hotelCancellation != null ? HotelBookingModelsKt.getRefundability(hotelCancellation) : null;
            if (refundability instanceof HotelRefundability.FullyRefundable) {
                bfm.AgE(-1420696099);
                String str = ((HotelRefundability.FullyRefundable) refundability).until;
                if (str == null) {
                    bbiA07 = AnonymousClass002.A0M(bfm, -1420677779);
                } else {
                    bfm.AgE(-1420677778);
                    strA01 = AnonymousClass001.A0t(bfm, HotelSelectionFormattingKt.hotelCancellationDeadline(str, C60Q.A0w()), R.string._name_removed__res_0x7f120337);
                    bbiA07 = C3cG.A07(bfm);
                    if (strA01 != null) {
                        bfm.AgE(-600018235);
                    }
                    BBI.A0R(bbiA07, false);
                }
                bfm.AgE(-600011880);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120336);
                BBI.A0R(bbiA07, false);
            } else if (refundability instanceof HotelRefundability.FullRefundBefore) {
                bfm.AgE(-600007972);
                strA01 = AnonymousClass001.A0t(bfm, HotelSelectionFormattingKt.hotelCancellationDeadline(((HotelRefundability.FullRefundBefore) refundability).deadline, C60Q.A0w()), R.string._name_removed__res_0x7f120335);
            } else {
                if (!C7384Etj.areEqual(refundability, HotelRefundability.NonRefundable.INSTANCE)) {
                    if (refundability != null) {
                        throw AnonymousClass005.A0k(bfm, -600021834);
                    }
                    AnonymousClass003.A0l(bfm, -1420092932);
                    bBbAAc = bfm.AAc();
                    if (bBbAAc != null) {
                        anonymousClass1 = new HotelSelectionContentKt$HotelSelectionCancellation$text$2(hotelSelection, hotelSelectionSheetKey, bRg2, i, i2);
                        C3cG.A1D(bBbAAc, anonymousClass1);
                    }
                    return;
                }
                bfm.AgE(-600001250);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12032f);
            }
            BBI bbiA072 = C3cG.A07(bfm);
            if (HotelBookingModelsKt.getPartialRefundPolicy(hotelSelection.cancellation) == null) {
                bfm.AgE(-599996419);
                HotelBookingTextKt.SecondaryLine(strA01, bRg2, bfm, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            } else {
                bfm.AgE(-599995204);
                HotelSelectionRefundPolicyLine(strA01, hotelSelectionSheetKey, bRg2, bfm, iA0d & 1008, 0);
            }
            BBI.A0R(bbiA072, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(hotelSelection, hotelSelectionSheetKey, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass1);
        }
    }

    public static final void HotelSelectionContent(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, HotelReviewState hotelReviewState, Function0<Unit> function0, boolean z, String str, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(hotelSelection, hotelSelectionSheetKey);
        AnonymousClass002.A1B(hotelReviewState, 2, function0);
        bfm.AgG(-1666173354);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelSelection) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, hotelSelectionSheetKey);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass005.A0A(bfm, hotelReviewState);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0t(bfm, z2);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingLargePlusMicro, zA1b ? 1 : 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            int i4 = iA0d & 14;
            HotelSelectionIntroduction(hotelSelection, null, bfm, i4, 2);
            int i5 = iA0d >> 3;
            HotelSelectionRoom(hotelSelection, hotelReviewState, function0, z, null, bfm, (i5 & 7168) | (i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i4 | (i5 & 896), 16);
            HotelSelectionDates(hotelSelection, null, bfm, i4, 2);
            HotelSelectionPrice(hotelSelection, hotelSelectionSheetKey, null, bfm, iA0d & 126, 4);
            HotelSelectionImportantInformation(hotelSelection, null, bfm, i4, 2);
            HotelSelectionContactInfoKt.HotelSelectionContactInfo(hotelSelection, z2, str, null, bfm, ((iA0d >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i4 | ((iA0d >> 9) & 896), 8);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122042(hotelSelection, hotelSelectionSheetKey, hotelReviewState, function0, z, str, z2, bRg2, i, i2);
        }
    }

    public static final void HotelSelectionDates(HotelSelection hotelSelection, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c122062;
        BRg bRg2 = bRg;
        bfm.AgG(191928940);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelSelection) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HotelTrip hotelTrip = hotelSelection.trip;
            if (hotelTrip == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c122062 = new HotelSelectionContentKt$HotelSelectionDates$trip$1(hotelSelection, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c122062);
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0X);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            HotelSelectionSectionTitle(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12032b), null, bfm, 0, 2);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMedium);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, C2VU.A05, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            HotelSelectionDate(HotelSelectionFormattingKt.hotelStayDate(C60O.A0o(hotelTrip.checkIn), C60Q.A0w()), HotelSelectionFormattingKt.hotelLocalTime(hotelSelection.propertyDetails.checkInStart, C60Q.A0w()), ARK.A01(bs0, 1.0f, true), bfm, 0, 0);
            HotelSelectionDate(HotelSelectionFormattingKt.hotelStayDate(C60O.A0o(hotelTrip.checkOut), C60Q.A0w()), HotelSelectionFormattingKt.hotelLocalTime(hotelSelection.propertyDetails.checkOut, C60Q.A0w()), ARK.A01(bs0, 1.0f, true), bfm, 0, 0);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c122062 = new C122062(hotelSelection, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c122062);
        }
    }

    public static final void HotelProviderRow(String str, String str2, BRg bRg, String str3, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        String str4 = str3;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(747566091);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str4);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            if (i4 != 0) {
                str4 = null;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0P);
            InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(AcQ.A00(AuraDimensKt.SpacingMicroPlusNano), bfm, C2VU.A04);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0b);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (str2 == null) {
                bfm.AgE(1179986099);
                BBI.A0R(bbi, false);
            } else {
                AuraImageKt.m2573AuraImageXRP3Ue8(str2, C11U.A01(C10G.A07(C3cG.A09(bfm, 1179986100), 20.0f), 2.0f), null, null, null, false, C8j3.A0k(20.0f), 0L, false, false, false, null, null, null, null, bfm, 1575936, 0, 32692);
                BBI.A0R(bbi, false);
            }
            if (str4 == null) {
                bfm.AgE(1180205580);
                HotelSelectionSecondaryText(str, null, bfm, iA0d & 14, 2);
            } else {
                bfm.AgE(1180265875);
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingNano);
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                HotelSelectionSecondaryText(str, null, bfm, iA0d & 14, 2);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(str4, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 9) & 14, 0, 16370);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRgA0P, str4, i, i2);
        }
    }

    public static final void HotelSelectionDate(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1293670379);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            if (str2 == null) {
                bfm.AgE(24566703);
            } else {
                bfm.AgE(24566704);
                HotelSelectionSecondaryText(str2, null, bfm, 0, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122052(str, str2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HotelSelectionFeeRows(com.facebook.aura.hotels.HotelPrice r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, X.BRg r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionContentKt.HotelSelectionFeeRows(com.facebook.aura.hotels.HotelPrice, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void HotelSelectionImportantInformation(HotelSelection hotelSelection, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c122093;
        BRg bRg2 = bRg;
        bfm.AgG(1539295965);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelSelection) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (hotelSelection.importantInformation.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c122093 = new C122081(hotelSelection, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c122093);
                }
                return;
            }
            Object[] objArr = {hotelSelection.selectionRef};
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HotelSelectionContentKt$HotelSelectionImportantInformation$expanded$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            BRg bRgA00 = AbstractC05192Wm.A00(AnonymousClass005.A0O(), AnonymousClass001.A0R(bRg2));
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingXsmall);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            boolean zA0A = MutableState.A0A(mutableStateA0N);
            boolean zA65 = bfm.A65(mutableStateA0N);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HotelSelectionContentKt$HotelSelectionImportantInformation$2$1$1(mutableStateA0N);
                BBI.A0O(bbi, objAaT2);
            }
            HotelSelectionImportantInformationHeader(zA0A, (Function0) objAaT2, null, bfm, 0, 4);
            if (MutableState.A0A(mutableStateA0N)) {
                bfm.AgE(-1830908430);
                C9m9 c9m9A002 = AcQ.A00(AuraDimensKt.SpacingSmall);
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A002, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                bfm.AgE(868000575);
                Iterator it = hotelSelection.importantInformation.iterator();
                while (it.hasNext()) {
                    HotelSelectionInfoSection((HotelInfoSection) it.next(), null, bfm, 0, 2);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(-1830746021);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c122093 = new C122093(hotelSelection, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c122093);
        }
    }

    public static final void HotelSelectionImportantInformationHeader(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2087372356);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA01 = C31t.A01(new C1003AOr(null, 1.0f, 500.0f), bfm, z ? 90.0f : 0.0f, 3120, 20);
            int i4 = R.string._name_removed__res_0x7f120339;
            if (z) {
                i4 = R.string._name_removed__res_0x7f12033a;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HotelSelectionContentKt$HotelSelectionImportantInformationHeader$1$1(strA01);
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA0O = AnonymousClass006.A0O(AnonymousClass001.A0Y(bRgA04, objAaT, true));
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingMicroPlusNano), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0O);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA02);
            HotelSelectionSectionTitle(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120338), null, bfm, 0, 2);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0);
            AuraIconSize auraIconSize = AuraIconSize.TINY;
            long j = C3cH.A0W(bfm).secondaryText;
            BS0 bs0 = BRg.A00;
            boolean zA652 = bfm.A65(c1boA01);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new HotelSelectionContentKt$HotelSelectionImportantInformationHeader$2$1$1(c1boA01);
                BBI.A0O(bbi, objAaT2);
            }
            AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0W(bs0, objAaT2), aVyA00, auraIconSize, null, j, null, bfm, AnonymousClass001.A04(), 32);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122103(z, function0, bRg2, i, i2);
        }
    }

    public static final void HotelSelectionInfoSection(HotelInfoSection hotelInfoSection, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1109370131);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, hotelInfoSection) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String str = hotelInfoSection.title;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).subheadlineMedium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HotelSelectionContentKt$HotelSelectionInfoSection$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            bfm.AgE(12909076);
            Iterator it = hotelInfoSection.items.iterator();
            while (it.hasNext()) {
                HotelSelectionSecondaryText(AnonymousClass005.A0j(it), null, bfm, 0, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122112(hotelInfoSection, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.B0A] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.ApY] */
    /* JADX WARN: Type inference failed for: r26v0, types: [X.1YL] */
    /* JADX WARN: Type inference failed for: r31v0, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r32v0, types: [X.ArU] */
    /* JADX WARN: Type inference failed for: r33v1, types: [X.013] */
    public static final void HotelSelectionIntroduction(HotelSelection hotelSelection, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2;
        BRg bRgA0Q = bRg;
        bfm.AgG(-750236339);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, hotelSelection) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingXsmall);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C9m9 c9m9A002 = AcQ.A00(AuraDimensKt.SpacingMicro);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A002, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = hotelSelection.providerName;
            if (str == null) {
                bfm.AgE(-422065623);
                BBI.A0R(bbi, false);
                bRg2 = null;
            } else {
                bfm.AgE(-422065622);
                bRg2 = null;
                HotelProviderRow(str, hotelSelection.providerIconUrl, null, null, bfm, 0, 12);
                BBI.A0R(bbi, false);
            }
            String str2 = hotelSelection.hotelName;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HotelSelectionContentKt$HotelSelectionIntroduction$1$1$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            ?? r25 = bRg2;
            ?? r26 = bRg2;
            ?? r31 = bRg2;
            ?? r32 = bRg2;
            ?? r33 = bRg2;
            ?? r24 = bRg2;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, bRgA0Y, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title2Medium, r24, r25, r26, false, 0, 0, 0, r31, r32, r33, bfm, 0, 0, 16368);
            HotelSelectionOverviewSummary(hotelSelection, bRg2, bfm, iA0d & 14, 2);
            BBI.A0R(bbi, true);
            String str3 = hotelSelection.description;
            if (str3 == null) {
                bfm.AgE(-220415404);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str3, bRg2, 0L, C3cH.A0X(bfm, auraTheme, -220415403).subheadlineRegular, r24, r25, r26, false, 0, 0, 0, r31, r32, r33, bfm, 0, 0, 16374);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122122(hotelSelection, bRgA0Q, i, i2);
        }
    }

    public static final void HotelSelectionOverviewSummary(HotelSelection hotelSelection, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c122132;
        String strA0w;
        BBI bbiA0M;
        BRg bRg2 = bRg;
        bfm.AgG(1541391188);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelSelection) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HotelGuestReviews hotelGuestReviews = hotelSelection.guestReviews;
            if (hotelGuestReviews == null) {
                bbiA0M = AnonymousClass002.A0M(bfm, 2089698268);
                strA0w = null;
            } else {
                bfm.AgE(2089698269);
                Integer num = hotelGuestReviews.count;
                if (num == null) {
                    bfm.AgE(759911395);
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                } else {
                    bfm.AgE(759911396);
                    strA0w = AnonymousClass006.A0w(bfm, hotelGuestReviews.score, AnonymousClass007.A0Y(num.intValue(), bfm, R.plurals._name_removed__res_0x7f10000e), R.string._name_removed__res_0x7f120351);
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                    if (strA0w == null) {
                    }
                    BBI.A0R(bbiA0M, false);
                }
                strA0w = hotelGuestReviews.score;
                BBI.A0R(bbiA0M, false);
            }
            String str = hotelSelection.city;
            String strUnicodeWrap = str != null ? BidiFormatter.getInstance().unicodeWrap(str) : null;
            String str2 = hotelSelection.region;
            String strUnicodeWrap2 = str2 != null ? BidiFormatter.getInstance().unicodeWrap(str2) : null;
            if (strUnicodeWrap == null || strUnicodeWrap2 == null) {
                bfm.AgE(2090242784);
                BBI.A0R(bbiA0M, false);
                if (strUnicodeWrap == null) {
                    strUnicodeWrap = strUnicodeWrap2;
                }
            } else {
                bfm.AgE(2090156635);
                strUnicodeWrap = AnonymousClass006.A0w(bfm, strUnicodeWrap, strUnicodeWrap2, R.string._name_removed__res_0x7f120327);
                BBI.A0R(bbiA0M, false);
            }
            if (strA0w == null || strUnicodeWrap == null) {
                bfm.AgE(2090420910);
                if (strA0w == null) {
                    if (strUnicodeWrap == null) {
                        bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                        if (bBbAAc != null) {
                            c122132 = new HotelSelectionContentKt$HotelSelectionOverviewSummary$text$1(hotelSelection, bRg2, i, i2);
                            bBbAAc.A06 = c122132;
                        }
                        return;
                    }
                    strA0w = strUnicodeWrap;
                }
            } else {
                bfm.AgE(2090322671);
                strA0w = AnonymousClass006.A0w(bfm, strA0w, strUnicodeWrap, R.string._name_removed__res_0x7f12034f);
            }
            BBI.A0R(bbiA0M, false);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(AcQ.A00(AuraDimensKt.SpacingMicro), bfm, C2VU.A04);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            if (hotelGuestReviews != null) {
                bfm.AgE(-781768104);
                AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.star_filled_24_wght400, 0), 12.0f, null, AuraTheme.INSTANCE.getColors(bfm, 6).ratingStar, null, bfm, AnonymousClass001.A04(), 33);
            } else {
                bfm.AgE(-781566294);
            }
            BBI.A0R(bbiA0M, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA0w, null, 0L, C3cH.A0B(bfm, AuraTheme.INSTANCE), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c122132 = new C122132(hotelSelection, bRg2, i, i2);
            bBbAAc.A06 = c122132;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[PHI: r9
  0x004a: PHI (r9v6 java.util.List) = (r9v0 java.util.List), (r9v7 java.util.List) binds: [B:21:0x0048, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[PHI: r9
  0x004e: PHI (r9v5 java.util.List) = (r9v0 java.util.List), (r9v6 java.util.List) binds: [B:21:0x0048, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[LOOP:0: B:41:0x0089->B:43:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de A[PHI: r9 r11
  0x00de: PHI (r9v1 java.util.List) = (r9v5 java.util.List), (r9v6 java.util.List) binds: [B:35:0x0068, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r11v0 com.facebook.aura.hotels.HotelMoney) = (r11v7 com.facebook.aura.hotels.HotelMoney), (r11v9 com.facebook.aura.hotels.HotelMoney) binds: [B:35:0x0068, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HotelSelectionPaymentRows(com.facebook.aura.hotels.HotelSelection r16, X.BRg r17, X.BFM r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionContentKt.HotelSelectionPaymentRows(com.facebook.aura.hotels.HotelSelection, X.BRg, X.BFM, int, int):void");
    }

    public static final void HotelSelectionPhotos(List<HotelImage> list, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        String strA0t;
        BBI bbiA07;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(list, 0, str2);
        bfm.AgG(-784667346);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
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
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new C122161(list, str, str2, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            if (str == null) {
                bbiA07 = AnonymousClass002.A0M(bfm, 1482292384);
                strA0t = null;
            } else {
                bfm.AgE(1482292385);
                strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120330);
                bbiA07 = C3cG.A07(bfm);
            }
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingNano);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HotelSelectionContentKt$HotelSelectionPhotos$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = C3UC.A00(bRgA0R, (G0W) objAaT);
            boolean zA1W = AnonymousClass002.A1W(bfm, strA0t, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(list)), (iA05 & 896) == 256);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == obj) {
                objAaT2 = new HotelSelectionContentKt$HotelSelectionPhotos$3$1(list, str2, strA0t);
                BBI.A0O(bbiA07, objAaT2);
            }
            C1YY.A00(null, null, c9m9A00, null, null, bfm, null, bRgA00, (G0U) objAaT2, 0, 494, false, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(list, str, str2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final void HotelSelectionPrice(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c122183;
        HotelCancellation hotelCancellation;
        BRg bRg2 = bRg;
        bfm.AgG(-2095071706);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelSelection) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, hotelSelectionSheetKey);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (hotelSelection.price == null && (((hotelCancellation = hotelSelection.cancellation) == null || HotelBookingModelsKt.getRefundability(hotelCancellation) == null) && !hasPaymentAmounts(hotelSelection))) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c122183 = new C122171(hotelSelection, hotelSelectionSheetKey, bRg2, i, i2);
                    bBbAAc.A06 = c122183;
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            HotelSelectionSectionTitle(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120342), null, bfm, 0, 2);
            if (hotelSelection.priceChanged) {
                bfm.AgE(597872571);
                HotelBookingTextKt.SecondaryLine(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120343), null, bfm, 0, 2);
            } else {
                bfm.AgE(1354252594);
            }
            BBI.A0R(bbi, false);
            HotelSelectionPriceBreakdown(hotelSelection, hotelSelectionSheetKey, null, bfm, iA0d & 126, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c122183 = new C122183(hotelSelection, hotelSelectionSheetKey, bRg2, i, i2);
            bBbAAc.A06 = c122183;
        }
    }

    public static final void HotelSelectionPriceBreakdown(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c122203;
        BRg bRg2;
        HotelMoney hotelMoney;
        AHD<HotelFee> ahd;
        BRg bRg3 = bRg;
        bfm.AgG(786901099);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelSelection) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, hotelSelectionSheetKey);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            HotelPrice hotelPrice = hotelSelection.price;
            if (hotelPrice == null && !hasPaymentAmounts(hotelSelection)) {
                bfm.AgE(639370437);
                BRg bRg4 = bRg3;
                HotelSelectionCancellation(hotelSelection, hotelSelectionSheetKey, bRg4, bfm, iA0d & 1022, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c122203 = new C122191(hotelSelection, hotelSelectionSheetKey, bRg4, i, i2);
                    bBbAAc.A06 = c122203;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 639449239);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbiA0M);
            Function0 function0 = null;
            if (hotelSelection.taxesDisclosure == null) {
                bfm.AgE(639561675);
            } else {
                bfm.AgE(639561676);
                boolean zA1M = AnonymousClass003.A1M(bfm, auraNavigatorA05, hotelSelectionSheetKey);
                Object objAaT = bfm.AaT();
                if (zA1M || objAaT == C78N.A00) {
                    objAaT = new HotelSelectionContentKt$HotelSelectionPriceBreakdown$onShowTaxes$1$1$1(auraNavigatorA05, hotelSelectionSheetKey);
                    BBI.A0O(bbiA0M, objAaT);
                }
                function0 = (Function0) objAaT;
            }
            BBI.A0R(bbiA0M, false);
            boolean z = (hotelSelection.trip == null && hotelSelection.averageNightlyBaseRate == null && (hotelPrice == null || (hotelPrice.baseRate == null && (((ahd = hotelPrice.taxAndFeeRows) == null || !(ahd.isEmpty() ^ true)) && hotelPrice.mandatoryPropertyFees == null)))) ? false : true;
            BRg bRgA0R = AnonymousClass001.A0R(bRg3);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            int iA02 = C3cG.A02(bbiA0M.A06);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (z) {
                bfm.AgE(-562800841);
                C9m9 c9m9A002 = AcQ.A00(AuraDimensKt.SpacingXsmall);
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A002, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbiA0M);
                AKQ akqA042 = BBI.A04(bbiA0M);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbiA0M, function02);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                if (hotelPrice != null && hotelPrice.baseRate != null) {
                    bfm.AgE(1235289891);
                    HotelSelectionPriceRow(hotelBaseRateLabel(hotelSelection, bfm, iA0d & 14), HotelResultsFormattingKt.formatted(hotelPrice.baseRate, C60Q.A0w()), null, false, false, null, null, bfm, 0, 124);
                } else if (hotelSelection.trip == null && hotelSelection.averageNightlyBaseRate == null) {
                    bfm.AgE(-360403120);
                } else {
                    bfm.AgE(1235295680);
                    AuraTextKt.m2639AuraTextUY9GdpU(hotelBaseRateLabel(hotelSelection, bfm, iA0d & 14), null, 0L, C8j4.A0l(bfm).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
                }
                BBI.A0R(bbiA0M, false);
                if (hotelPrice == null) {
                    bfm.AgE(-360385823);
                } else {
                    bfm.AgE(-360385822);
                    HotelSelectionFeeRows(hotelPrice, function0, null, bfm, 0, 4);
                }
                BBI.A0R(bbiA0M, false);
                BBI.A0R(bbiA0M, true);
            } else {
                bfm.AgE(-562299199);
            }
            BBI.A0R(bbiA0M, false);
            C9m9 c9m9A003 = AcQ.A00(AuraDimensKt.SpacingMicroPlusNano);
            BS0 bs02 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(c9m9A003, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA043 = BBI.A04(bbiA0M);
            BRg bRgA013 = AxM.A01(bfm, bs02);
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            if (hotelPrice == null || (hotelMoney = hotelPrice.total) == null) {
                bfm.AgE(-202029812);
                BBI.A0R(bbiA0M, false);
                bRg2 = null;
            } else {
                bfm.AgE(-202029811);
                String strA0t = AnonymousClass001.A0t(bfm, hotelMoney.currency, R.string._name_removed__res_0x7f120333);
                bRg2 = null;
                String str = HotelResultsFormattingKt.formatted(hotelMoney, C60Q.A0w());
                AHD<HotelFee> ahd2 = hotelPrice.taxAndFeeRows;
                if (!(ahd2 instanceof Collection) || !ahd2.isEmpty()) {
                    Iterator it = ahd2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (!((HotelFee) it.next()).isPropertyFee) {
                            function0 = null;
                            break;
                        }
                    }
                }
                HotelSelectionPriceRow(strA0t, str, null, true, false, null, function0, bfm, 3072, 52);
                BBI.A0R(bbiA0M, false);
            }
            HotelSelectionPaymentRows(hotelSelection, bRg2, bfm, iA0d & 14, 2);
            HotelSelectionCancellation(hotelSelection, hotelSelectionSheetKey, bRg2, bfm, iA0d & 126, 4);
            BBI.A0R(bbiA0M, true);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c122203 = new C122203(hotelSelection, hotelSelectionSheetKey, bRg3, i, i2);
            bBbAAc.A06 = c122203;
        }
    }

    /* renamed from: HotelSelectionPriceLabel-fWhpE4E, reason: not valid java name */
    public static final void m1085HotelSelectionPriceLabelfWhpE4E(String str, String str2, C1822Arm c1822Arm, long j, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object hotelSelectionContentKt$HotelSelectionPriceLabel$3;
        BRg bRgA0P = bRg;
        bfm.AgG(-1946756355);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1822Arm);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0P(bfm, j);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRgA0P);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            if (str2 == null) {
                bfm.AgE(-874973748);
                int i4 = iA0d >> 3;
                m1086HotelSelectionPriceTitleT042LqI(str, c1822Arm, j, function0, bRgA0P, bfm, AnonymousClass001.A0B(i4, AnonymousClass003.A06(i4, iA0d & 14)), 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    hotelSelectionContentKt$HotelSelectionPriceLabel$3 = new HotelSelectionContentKt$HotelSelectionPriceLabel$1(str, str2, c1822Arm, j, function0, bRgA0P, i, i2);
                    C3cG.A1D(bBbAAc, hotelSelectionContentKt$HotelSelectionPriceLabel$3);
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -874888219);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0P);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            int i5 = iA0d >> 3;
            m1086HotelSelectionPriceTitleT042LqI(str, c1822Arm, j, function0, null, bfm, AnonymousClass003.A06(i5, iA0d & 14), 16);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, i5 & 14, 0, 16370);
            bRgA0P = AnonymousClass001.A0P(bbiA0M, bRgA0P);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hotelSelectionContentKt$HotelSelectionPriceLabel$3 = new HotelSelectionContentKt$HotelSelectionPriceLabel$3(str, str2, c1822Arm, j, function0, bRgA0P, i, i2);
            C3cG.A1D(bBbAAc, hotelSelectionContentKt$HotelSelectionPriceLabel$3);
        }
    }

    public static final void HotelSelectionPriceRow(String str, String str2, BRg bRg, boolean z, boolean z2, String str3, Function0<Unit> function0, BFM bfm, int i, int i2) {
        AuraTheme auraTheme;
        C1822Arm c1822ArmA0B;
        BBI bbi;
        boolean z3;
        long jA06;
        C1822Arm c1822Arm;
        boolean z4 = z;
        boolean zA1K = z2;
        String strA0e = str3;
        Function0<Unit> function02 = function0;
        BRg bRgA0Q = bRg;
        bfm.AgG(-632853133);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z4);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, zA1K);
        }
        int i6 = i2 & 32;
        int iA0i = 196608;
        if (i6 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, strA0e);
            iA0d |= iA0i;
        }
        int i7 = i2 & 64;
        int iA0Z = 1572864;
        if (i7 != 0) {
            iA0d |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, function02);
            iA0d |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i4 != 0) {
                z4 = false;
            }
            zA1K = C3cG.A1K(i5, zA1K);
            strA0e = C3cG.A0e(strA0e, i6);
            if (i7 != 0) {
                function02 = null;
            }
            if (z4) {
                bfm.AgE(1713505021);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0B = C60Q.A0D(bfm, auraTheme);
                bbi = (BBI) bfm;
                z3 = false;
                BBI.A0R(bbi, false);
                if (zA1K) {
                    bfm.AgE(1713510752);
                    jA06 = C3cH.A07(bfm, auraTheme);
                } else {
                    bfm.AgE(1713511902);
                    jA06 = C3cH.A06(bfm, auraTheme);
                }
            } else if (zA1K) {
                bfm.AgE(1713506722);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0B = C3cH.A0E(bfm, auraTheme);
                bbi = (BBI) bfm;
                z3 = false;
                BBI.A0R(bbi, false);
                bfm.AgE(1713510752);
                jA06 = C3cH.A07(bfm, auraTheme);
            } else {
                bfm.AgE(1713508421);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
                bbi = (BBI) bfm;
                z3 = false;
                BBI.A0R(bbi, false);
                bfm.AgE(1713511902);
                jA06 = C3cH.A06(bfm, auraTheme);
            }
            BBI.A0R(bbi, z3);
            if (z4) {
                c1822Arm = C3cH.A0X(bfm, auraTheme, 1713514111).title3Medium;
                BBI.A0R(bbi, z3);
            } else {
                bfm.AgE(1713514680);
                BBI.A0R(bbi, z3);
                c1822Arm = c1822ArmA0B;
            }
            if (((C0dm) AKO.A07(Am0.A04, bbi)).AFo() >= 1.5f) {
                bfm.AgE(1579405066);
                BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                int iA02 = C3cG.A02(bbi.A06);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0R);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function03);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
                    m1085HotelSelectionPriceLabelfWhpE4E(str, strA0e, c1822ArmA0B, jA06, function02, null, bfm, AnonymousClass001.A0B(iA0d >> 6, (iA0d & 14) | ((iA0d >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), 32);
                    AuraTextKt.m2639AuraTextUY9GdpU(str2, null, jA06, c1822Arm, null, null, null, z3, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, null, null, null, bfm, (iA0d >> 3) & 14, z3 ? 1 : 0, 16370);
                    bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, true, z3);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.AgE(1579630932);
            BRg bRgA0R2 = AnonymousClass001.A0R(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A05);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0R2);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V != null) {
                AnonymousClass005.A0n(bfm, bbi, function04);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA042, bRgA012, iA0J);
                BS0 bs0 = BRg.A00;
                m1085HotelSelectionPriceLabelfWhpE4E(str, strA0e, c1822ArmA0B, jA06, function02, ARK.A01(bs0, 1.0f, true), bfm, AnonymousClass001.A0B(iA0d >> 6, (iA0d & 14) | ((iA0d >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), z3 ? 1 : 0);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HotelSelectionContentKt$HotelSelectionPriceRow$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str2, C3UC.A00(bs0, (G0W) objAaT), jA06, c1822Arm, null, null, C3cH.A0F(6), z3, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, null, null, null, bfm, (iA0d >> 3) & 14, z3 ? 1 : 0, 16304);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, z3);
            }
            C00x.A00();
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122213(str, str2, bRgA0Q, z4, zA1K, strA0e, function02, i, i2);
        }
    }

    /* renamed from: HotelSelectionPriceTitle-T042LqI, reason: not valid java name */
    public static final void m1086HotelSelectionPriceTitleT042LqI(String str, C1822Arm c1822Arm, long j, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1068409650);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (function0 == null) {
                bfm.AgE(-244483849);
                AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | ((iA0d >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA0d & 896) | ((iA0d << 6) & 7168), 0, 16368);
            } else {
                bfm.AgE(-244481267);
                HotelTaxesInfoLabelKt.m1099HotelTaxesInfoLabelT042LqI(str, c1822Arm, j, function0, bRg2, bfm, iA0d & 65534, 0);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HotelSelectionContentKt$HotelSelectionPriceTitle$1(str, c1822Arm, j, function0, bRg2, i, i2);
        }
    }

    public static final void HotelSelectionRefundPolicyLine(String str, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-167605250);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, hotelSelectionSheetKey);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120357);
            String strA0w = AnonymousClass006.A0w(bfm, str, strA01, R.string._name_removed__res_0x7f120345);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).accent;
            boolean zA1K = AnonymousClass003.A1K(bfm, strA0w, strA01) | bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                c1731ApSA0W.A0E(strA0w);
                int iA0C = C7BY.A0C(strA0w, strA01, C8j3.A0J(strA0w, 0) - 1, false);
                if (iA0C >= 0) {
                    long j2 = C1809ArT.A01;
                    c1731ApSA0W.A0A(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07), iA0C, strA01.length() + iA0C);
                }
                objAaT = c1731ApSA0W.A04();
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120359);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1M = AnonymousClass003.A1M(bfm, auraNavigatorA05, hotelSelectionSheetKey);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new HotelSelectionContentKt$HotelSelectionRefundPolicyLine$1$1(auraNavigatorA05, hotelSelectionSheetKey);
                BBI.A0O(bbi, objAaT2);
            }
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, C0v5.A04(bRgA0R, c1ydA0A, strA012, (Function0) objAaT2, true), jA07, c1822ArmA0E, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32752);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122222(str, hotelSelectionSheetKey, bRg2, i, i2);
        }
    }

    public static final void HotelSelectionRoom(HotelSelection hotelSelection, HotelReviewState hotelReviewState, Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c122243;
        BRg bRg2 = bRg;
        bfm.AgG(-1896397549);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelSelection) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, hotelReviewState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zIsEmpty = hotelSelection.roomDetails.isEmpty();
            String strHotelRoomLabel = hotelSelection.roomName;
            if (zIsEmpty) {
                strHotelRoomLabel = HotelBookingFormattingKt.hotelRoomLabel(strHotelRoomLabel, hotelSelection.bedOptions, C60Q.A0w());
            }
            Integer num = hotelSelection.capacity;
            if (num == null || hotelSelection.roomName != null || !hotelSelection.roomDetails.isEmpty()) {
                num = null;
            }
            if (strHotelRoomLabel == null && num == null && hotelSelection.roomDetails.isEmpty() && !hotelSelection.canAskAboutRooms) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c122243 = new C122231(hotelSelection, hotelReviewState, function0, z, bRg2, i, i2);
                    bBbAAc.A06 = c122243;
                }
                return;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMedium);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C9m9 c9m9A002 = AcQ.A00(AuraDimensKt.SpacingXsmall);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A002, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            HotelSelectionSectionTitle(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120353), null, bfm, 0, 2);
            if (strHotelRoomLabel == null && num == null && hotelSelection.roomDetails.isEmpty()) {
                bfm.AgE(-518622045);
            } else {
                bfm.AgE(-518971849);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingMicro, 0);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                if (strHotelRoomLabel == null) {
                    bfm.AgE(89753226);
                } else {
                    bfm.AgE(89753227);
                    HotelSelectionSecondaryText(strHotelRoomLabel, null, bfm, 0, 2);
                }
                BBI.A0R(bbi, false);
                bfm.AgE(1804012891);
                Iterator it = hotelSelection.roomDetails.iterator();
                while (it.hasNext()) {
                    HotelSelectionSecondaryText(AnonymousClass005.A0j(it), null, bfm, 0, 2);
                }
                BBI.A0R(bbi, false);
                if (num == null) {
                    bfm.AgE(89890525);
                } else {
                    bfm.AgE(89890526);
                    HotelSelectionSecondaryText(AnonymousClass001.A0t(bfm, Integer.valueOf(num.intValue()), R.string._name_removed__res_0x7f120354), null, bfm, 0, 2);
                }
                AnonymousClass003.A0q(bbi);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            if (hotelSelection.canAskAboutRooms) {
                bfm.AgE(664918289);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12035b), null, AnonymousClass003.A0U(c1062ATq), AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), null, null, false, false, z, AnonymousClass002.A1Z(hotelReviewState, HotelReviewState.REQUESTING), false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0d << 18) & 1879048192) | 3072, (iA0d << 6) & 57344, 0, 134199781);
            } else {
                bfm.AgE(665264249);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c122243 = new C122243(hotelSelection, hotelReviewState, function0, z, bRg2, i, i2);
            bBbAAc.A06 = c122243;
        }
    }

    public static final void HotelSelectionSecondaryText(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(119898095);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 126, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122251(str, bRg2, i, i2);
        }
    }

    public static final void HotelSelectionSectionTitle(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1955451885);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title3Medium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HotelSelectionContentKt$HotelSelectionSectionTitle$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRg2, (G0U) objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122262(str, bRg2, i, i2);
        }
    }

    public static final boolean hasPaymentAmounts(HotelSelection hotelSelection) {
        HotelPayment hotelPayment = hotelSelection.payment;
        if (hotelPayment == null) {
            return false;
        }
        if (hotelPayment.dueNow != null || hotelPayment.dueAtProperty != null) {
            return true;
        }
        AHD<HotelInstallment> ahd = hotelPayment.installments;
        return (ahd == null || ahd.isEmpty()) ? false : true;
    }

    public static final String hotelPaymentAmount(HotelMoney hotelMoney, BFM bfm, int i) {
        if (hotelMoney == null) {
            bfm.AgE(-94063725);
            return AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120340);
        }
        if (hotelMoney.amount.signum() == 0) {
            AnonymousClass004.A1A(bfm, 1379084388);
            return null;
        }
        AnonymousClass004.A1A(bfm, -94059932);
        return HotelResultsFormattingKt.formatted(hotelMoney, C60Q.A0w());
    }

    public static final String hotelBaseRateLabel(HotelSelection hotelSelection, BFM bfm, int i) {
        BBI bbiA0M;
        int i2;
        String strA0Y;
        bfm.AgE(1764688096);
        HotelTrip hotelTrip = hotelSelection.trip;
        if (hotelTrip == null) {
            i2 = 1423457154;
        } else {
            bbiA0M = AnonymousClass002.A0M(bfm, -646819246);
            long jBetween = ChronoUnit.DAYS.between(hotelTrip.checkIn, hotelTrip.checkOut);
            if (1 <= jBetween && jBetween < 2147483648L) {
                bfm.AgE(1423704162);
                BBI.A0R(bbiA0M, false);
                strA0Y = AnonymousClass007.A0Y((int) jBetween, bfm, R.plurals._name_removed__res_0x7f10000d);
                HotelMoney hotelMoney = hotelSelection.averageNightlyBaseRate;
                if (hotelMoney == null) {
                    bfm.AgE(1423865702);
                    bbiA0M = C3cG.A07(bfm);
                    BBI.A0R(bbiA0M, false);
                    return strA0Y;
                }
                bfm.AgE(1423865703);
                String strA0w = AnonymousClass006.A0w(bfm, strA0Y, HotelResultsFormattingKt.formatted(hotelMoney, C60Q.A0w()), R.string._name_removed__res_0x7f12033b);
                BBI.A0R(bbiA0M, false);
                if (strA0w != null) {
                    strA0Y = strA0w;
                }
                BBI.A0R(bbiA0M, false);
                return strA0Y;
            }
            i2 = 1423642658;
        }
        bfm.AgE(i2);
        strA0Y = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12032c);
        bbiA0M = C3cG.A07(bfm);
        BBI.A0R(bbiA0M, false);
        return strA0Y;
    }
}
