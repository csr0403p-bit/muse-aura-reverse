package com.facebook.aura.hotels;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C1DG;
import X.G0V;
import X.G2j;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HotelSelectionSheetKt {

    /* renamed from: com.facebook.aura.hotels.HotelSelectionSheetKt$HotelSelectionActions$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $linksEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onReserve;
        public final /* synthetic */ HotelReserveAction $reserveAction;
        public final /* synthetic */ boolean $reserveEnabled;
        public final /* synthetic */ HotelReviewState $reviewState;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ String $visitWebsiteUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HotelReserveAction hotelReserveAction, boolean z, Function0<Unit> function0, String str, HotelReviewState hotelReviewState, String str2, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$reserveAction = hotelReserveAction;
            this.$reserveEnabled = z;
            this.$onReserve = function0;
            this.$visitWebsiteUrl = str;
            this.$reviewState = hotelReviewState;
            this.$sessionId = str2;
            this.$linksEnabled = z2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionSheetKt.HotelSelectionActions(this.$reserveAction, this.$reserveEnabled, this.$onReserve, this.$visitWebsiteUrl, this.$reviewState, this.$sessionId, this.$linksEnabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionSheetKt$HotelSelectionSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ HotelSelectionSheetKey $key;
        public final /* synthetic */ HotelSelectionViewModel $model;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C1BO<HotelSelectionUiState> $state$delegate;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HotelSelectionSheetKey hotelSelectionSheetKey, HotelSelectionViewModel hotelSelectionViewModel, C1BO<HotelSelectionUiState> c1bo, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator) {
            super(4);
            this.$key = hotelSelectionSheetKey;
            this.$model = hotelSelectionViewModel;
            this.$state$delegate = c1bo;
            this.$userSession = abstractC3358CGz;
            this.$navigator = auraNavigator;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1094invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1094invokei1RSzL4(float r33, float r34, X.BFM r35, int r36) {
            /*
                Method dump skipped, instructions count: 591
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionSheetKt.AnonymousClass4.m1094invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionSheetKt$HotelSelectionSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HotelSelectionSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = hotelSelectionSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionSheetKt.HotelSelectionSheet(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0268  */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.facebook.aura.vds.compose.button.AuraButtonStyles] */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v1, types: [X.1YL] */
    /* JADX WARN: Type inference failed for: r24v1, types: [com.facebook.aura.vds.compose.button.AuraButtonSize] */
    /* JADX WARN: Type inference failed for: r25v1, types: [X.G0W] */
    /* JADX WARN: Type inference failed for: r31v0, types: [X.AWd] */
    /* JADX WARN: Type inference failed for: r32v0, types: [X.1Yg] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r36v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r37v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r38v0, types: [X.G0V] */
    /* JADX WARN: Type inference failed for: r39v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r40v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r41v0, types: [com.facebook.aura.vds.compose.button.AuraButtonAccessibility] */
    /* JADX WARN: Type inference failed for: r55v0, types: [X.BFM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HotelSelectionActions(com.facebook.aura.hotels.HotelReserveAction r47, boolean r48, kotlin.jvm.functions.Function0<kotlin.Unit> r49, java.lang.String r50, com.facebook.aura.hotels.HotelReviewState r51, java.lang.String r52, boolean r53, X.BRg r54, X.BFM r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionSheetKt.HotelSelectionActions(com.facebook.aura.hotels.HotelReserveAction, boolean, kotlin.jvm.functions.Function0, java.lang.String, com.facebook.aura.hotels.HotelReviewState, java.lang.String, boolean, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HotelSelectionSheet(com.facebook.aura.hotels.HotelSelectionSheetKey r46, X.BRg r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionSheetKt.HotelSelectionSheet(com.facebook.aura.hotels.HotelSelectionSheetKey, X.BRg, X.BFM, int, int):void");
    }

    public static final /* synthetic */ HotelSelectionUiState access$HotelSelectionSheet$lambda$0(C1BO c1bo) {
        return (HotelSelectionUiState) c1bo.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0215  */
    /* renamed from: HotelSelectionLoaded-twS62J8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1091HotelSelectionLoadedtwS62J8(com.facebook.aura.hotels.HotelSelection r48, com.facebook.aura.hotels.HotelSelectionSheetKey r49, com.facebook.aura.hotels.HotelReserveAction r50, boolean r51, kotlin.jvm.functions.Function0<kotlin.Unit> r52, java.lang.String r53, com.facebook.aura.hotels.HotelReviewState r54, com.facebook.aura.hotels.HotelReviewState r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, java.lang.String r57, float r58, float r59, X.BRg r60, X.BFM r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionSheetKt.m1091HotelSelectionLoadedtwS62J8(com.facebook.aura.hotels.HotelSelection, com.facebook.aura.hotels.HotelSelectionSheetKey, com.facebook.aura.hotels.HotelReserveAction, boolean, kotlin.jvm.functions.Function0, java.lang.String, com.facebook.aura.hotels.HotelReviewState, com.facebook.aura.hotels.HotelReviewState, kotlin.jvm.functions.Function0, java.lang.String, float, float, X.BRg, X.BFM, int, int, int):void");
    }
}
