package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HotelSelectionSheetKt$HotelSelectionLoaded$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onAskAboutRooms;
    public final /* synthetic */ Function0<Unit> $onReserve;
    public final /* synthetic */ HotelReserveAction $reserveAction;
    public final /* synthetic */ boolean $reserveEnabled;
    public final /* synthetic */ HotelReviewState $reviewState;
    public final /* synthetic */ HotelReviewState $roomDiscussionState;
    public final /* synthetic */ HotelSelection $selection;
    public final /* synthetic */ HotelSelectionSheetKey $selectionKey;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ String $visitWebsiteUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionSheetKt$HotelSelectionLoaded$2(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, HotelReserveAction hotelReserveAction, boolean z, Function0<Unit> function0, String str, HotelReviewState hotelReviewState, HotelReviewState hotelReviewState2, Function0<Unit> function02, String str2, float f, float f2, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$selection = hotelSelection;
        this.$selectionKey = hotelSelectionSheetKey;
        this.$reserveAction = hotelReserveAction;
        this.$reserveEnabled = z;
        this.$onReserve = function0;
        this.$visitWebsiteUrl = str;
        this.$reviewState = hotelReviewState;
        this.$roomDiscussionState = hotelReviewState2;
        this.$onAskAboutRooms = function02;
        this.$sessionId = str2;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public final void invoke(BFM bfm, int i) {
        HotelSelectionSheetKt.m1091HotelSelectionLoadedtwS62J8(this.$selection, this.$selectionKey, this.$reserveAction, this.$reserveEnabled, this.$onReserve, this.$visitWebsiteUrl, this.$reviewState, this.$roomDiscussionState, this.$onAskAboutRooms, this.$sessionId, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
