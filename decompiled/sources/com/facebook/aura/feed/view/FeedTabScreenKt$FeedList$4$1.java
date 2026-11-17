package com.facebook.aura.feed.view;

import X.AKQ;
import X.AOI;
import X.AOW;
import X.APt;
import X.APu;
import X.AQJ;
import X.AT5;
import X.AbstractC04661Bq;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C05433bp;
import X.C0CD;
import X.C1003AOr;
import X.C1515AkP;
import X.C15k;
import X.C1AC;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedUnitViewportContext;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedList$4$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ boolean $cardSlotPresent;
    public final /* synthetic */ AOI<Boolean> $cardVisibleState;
    public final /* synthetic */ int $editionCount;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $feedItems;
    public final /* synthetic */ AT5<Float, AOW> $highlightGlowAlpha;
    public final /* synthetic */ MutableState<String> $highlightedUnitId$delegate;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $infiniteItems;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onComment;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDelete;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDislike;
    public final /* synthetic */ Function0<Unit> $onInstructionsEditClick;
    public final /* synthetic */ Function0<Unit> $onInstructionsGotItClick;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onLike;
    public final /* synthetic */ G0V<FeedUnitViewportContext, Boolean, Unit> $onUnitVisibilityChanged;
    public final /* synthetic */ String $promptDisplayText;
    public final /* synthetic */ FeedViewModel.FeedUiState $uiState;
    public final /* synthetic */ int $unitCount;
    public final /* synthetic */ Function0<Integer> $unitCountProvider;

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $cardSlotPresent;
        public final /* synthetic */ AOI<Boolean> $cardVisibleState;
        public final /* synthetic */ Function0<Unit> $onInstructionsEditClick;
        public final /* synthetic */ Function0<Unit> $onInstructionsGotItClick;
        public final /* synthetic */ String $promptDisplayText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AOI<Boolean> aoi, boolean z, String str, Function0<Unit> function0, Function0<Unit> function02) {
            super(3);
            this.$cardVisibleState = aoi;
            this.$cardSlotPresent = z;
            this.$promptDisplayText = str;
            this.$onInstructionsEditClick = function0;
            this.$onInstructionsGotItClick = function02;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
                AOI<Boolean> aoi = this.$cardVisibleState;
                boolean z = this.$cardSlotPresent;
                String str = this.$promptDisplayText;
                Function0<Unit> function0 = this.$onInstructionsEditClick;
                Function0<Unit> function02 = this.$onInstructionsGotItClick;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C90l c90l = C90l.A00;
                APu aPu = APu.A00;
                C1003AOr c1003AOr = new C1003AOr(null, 0.8f, 204.0f);
                C1AC c1ac = C2VU.A03;
                AQJ aqjA0G = AbstractC1011APs.A0G(c1003AOr, c1ac, new C05433bp(11));
                C1003AOr c1003AOr2 = new C1003AOr(null, 0.8f, 247.0f);
                long jA0J = AnonymousClass005.A0J(0.5f, 0.0f);
                long j = C15k.A01;
                AbstractC04661Bq.A01(aPu, aqjA0G.A00(AbstractC1011APs.A0F(c1003AOr2, 0.8f, jA0J)).A00(AbstractC1011APs.A0E(new C1003AOr(null, 0.8f, 247.0f))), aoi, c90l, bfm, null, null, B1V.A00(bfm, new FeedTabScreenKt$FeedList$4$1$1$1$1(str, function0, function02), 210000721), 1572870, 18);
                AbstractC04661Bq.A06(AbstractC1011APs.A06(new C1003AOr(null, 0.8f, 204.0f), c1ac, new C05433bp(8)).A00(AbstractC1011APs.A05(new C1003AOr(null, 0.8f, 247.0f), 0.8f, AnonymousClass005.A0J(0.5f, 0.0f))).A00(AbstractC1011APs.A04(new C1003AOr(null, 0.8f, 247.0f), 0.0f)), APt.A00, c90l, bfm, null, null, B1V.A00(bfm, new FeedTabScreenKt$FeedList$4$1$1$1$2(str, function0), 1374098362), 1572870, 18, !z);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        if (this.$uiState.isLoadingPreviousPage) {
            c0cd.APJ("feed_loading_previous", "feed_loading_previous", ComposableSingletons$FeedTabScreenKt.f52lambda$142558602);
        }
        c0cd.APJ("feed_heading", "feed_heading", ComposableSingletons$FeedTabScreenKt.f53lambda$1984037647);
        if (this.$cardSlotPresent || !C7BY.A0j(this.$promptDisplayText)) {
            c0cd.APJ("feed_prompt_slot", "feed_prompt_slot", B1V.A01(new AnonymousClass1(this.$cardVisibleState, this.$cardSlotPresent, this.$promptDisplayText, this.$onInstructionsEditClick, this.$onInstructionsGotItClick), -1245526433, true));
        }
        if (this.$unitCount == 0) {
            c0cd.APJ("feed_setup_status", "feed_setup_status", ComposableSingletons$FeedTabScreenKt.f55lambda$900963074);
        }
        final SnapshotStateList<FeedUnit> snapshotStateList = this.$feedItems;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final Function0<Integer> function0 = this.$unitCountProvider;
        final AT5<Float, AOW> at5 = this.$highlightGlowAlpha;
        final G0V<FeedUnit, Integer, Unit> g0v = this.$onLike;
        final G0V<FeedUnit, Integer, Unit> g0v2 = this.$onDislike;
        final G0V<FeedUnit, Integer, Unit> g0v3 = this.$onComment;
        final G0V<FeedUnit, Integer, Unit> g0v4 = this.$onDelete;
        final G0V<FeedUnitViewportContext, Boolean, Unit> g0v5 = this.$onUnitVisibilityChanged;
        final MutableState<String> mutableState = this.$highlightedUnitId$delegate;
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$4$1$invoke$$inlined$itemsIndexed$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), snapshotStateList, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$4$1$invoke$$inlined$itemsIndexed$2
            public final Object invoke(int i) {
                return FeedTabScreenKt.feedContentType((FeedUnit) snapshotStateList.get(i));
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$4$1$invoke$$inlined$itemsIndexed$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                FeedUnit feedUnit = (FeedUnit) snapshotStateList.get(i);
                bfm.AgE(-676167600);
                Function0 function02 = function0;
                boolean zA1T = AnonymousClass001.A1T(bfm, at5, bfm.A65(feedUnit));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new FeedTabScreenKt$FeedList$4$1$4$1$1(feedUnit, at5, mutableState);
                    bfm.Ai0(objAaT);
                }
                FeedTabScreenKt.FeedUnitListItem(feedUnit, i, function02, (Function0) objAaT, g0v, g0v2, g0v3, g0v4, g0v5, null, bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 512);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), snapshotStateList.size());
        final SnapshotStateList<FeedUnit> snapshotStateList2 = this.$infiniteItems;
        final AnonymousClass5 anonymousClass5 = AnonymousClass5.INSTANCE;
        final int i = this.$editionCount;
        final Function0<Integer> function02 = this.$unitCountProvider;
        final AT5<Float, AOW> at52 = this.$highlightGlowAlpha;
        final G0V<FeedUnit, Integer, Unit> g0v6 = this.$onLike;
        final G0V<FeedUnit, Integer, Unit> g0v7 = this.$onDislike;
        final G0V<FeedUnit, Integer, Unit> g0v8 = this.$onComment;
        final G0V<FeedUnit, Integer, Unit> g0v9 = this.$onDelete;
        final G0V<FeedUnitViewportContext, Boolean, Unit> g0v10 = this.$onUnitVisibilityChanged;
        final MutableState<String> mutableState2 = this.$highlightedUnitId$delegate;
        c0cd.APL(anonymousClass5 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$4$1$invoke$$inlined$itemsIndexed$4
            public final Object invoke(int i2) {
                return AnonymousClass006.A0n(Integer.valueOf(i2), snapshotStateList2, anonymousClass5, i2);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$4$1$invoke$$inlined$itemsIndexed$5
            public final Object invoke(int i2) {
                return FeedTabScreenKt.feedContentType((FeedUnit) snapshotStateList2.get(i2));
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$4$1$invoke$$inlined$itemsIndexed$6
            public final void invoke(AnonymousClass037 anonymousClass037, int i2, BFM bfm, int i3) {
                int iA0d = (i3 & 6) == 0 ? i3 | AnonymousClass004.A0d(bfm, anonymousClass037) : i3;
                if ((i3 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i2);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                FeedUnit feedUnit = (FeedUnit) snapshotStateList2.get(i2);
                bfm.AgE(-2134422440);
                int i4 = i + i2;
                Function0 function03 = function02;
                boolean zA1T = AnonymousClass001.A1T(bfm, at52, bfm.A65(feedUnit));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new FeedTabScreenKt$FeedList$4$1$7$1$1(feedUnit, at52, mutableState2);
                    bfm.Ai0(objAaT);
                }
                FeedTabScreenKt.FeedUnitListItem(feedUnit, i4, function03, (Function0) objAaT, g0v6, g0v7, g0v8, g0v9, g0v10, null, bfm, 0, 512);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), snapshotStateList2.size());
        if (this.$uiState.isLoadingNextPage) {
            c0cd.APJ("feed_loading_next", "feed_loading_next", ComposableSingletons$FeedTabScreenKt.f54lambda$556399715);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedTabScreenKt$FeedList$4$1(FeedViewModel.FeedUiState feedUiState, boolean z, String str, int i, SnapshotStateList<FeedUnit> snapshotStateList, SnapshotStateList<FeedUnit> snapshotStateList2, AOI<Boolean> aoi, Function0<Unit> function0, Function0<Unit> function02, Function0<Integer> function03, AT5<Float, AOW> at5, G0V<? super FeedUnit, ? super Integer, Unit> g0v, G0V<? super FeedUnit, ? super Integer, Unit> g0v2, G0V<? super FeedUnit, ? super Integer, Unit> g0v3, G0V<? super FeedUnit, ? super Integer, Unit> g0v4, G0V<? super FeedUnitViewportContext, ? super Boolean, Unit> g0v5, MutableState<String> mutableState, int i2) {
        super(1);
        this.$uiState = feedUiState;
        this.$cardSlotPresent = z;
        this.$promptDisplayText = str;
        this.$unitCount = i;
        this.$feedItems = snapshotStateList;
        this.$infiniteItems = snapshotStateList2;
        this.$cardVisibleState = aoi;
        this.$onInstructionsEditClick = function0;
        this.$onInstructionsGotItClick = function02;
        this.$unitCountProvider = function03;
        this.$highlightGlowAlpha = at5;
        this.$onLike = g0v;
        this.$onDislike = g0v2;
        this.$onComment = g0v3;
        this.$onDelete = g0v4;
        this.$onUnitVisibilityChanged = g0v5;
        this.$highlightedUnitId$delegate = mutableState;
        this.$editionCount = i2;
    }

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Integer, FeedUnit, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        public final Object invoke(int i, FeedUnit feedUnit) {
            C7384Etj.A0Y(feedUnit, 1);
            return feedUnit.getId();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, FeedUnit feedUnit) {
            AnonymousClass005.A0w(num);
            FeedUnit feedUnit2 = feedUnit;
            C7384Etj.A0Y(feedUnit2, 1);
            return feedUnit2.getId();
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$4$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<Integer, FeedUnit, Object> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(2);
        }

        public final Object invoke(int i, FeedUnit feedUnit) {
            C7384Etj.A0Y(feedUnit, 1);
            return feedUnit.getId();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, FeedUnit feedUnit) {
            AnonymousClass005.A0w(num);
            FeedUnit feedUnit2 = feedUnit;
            C7384Etj.A0Y(feedUnit2, 1);
            return feedUnit2.getId();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
