package com.facebook.aura.library.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7195Ei7;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7481Exe;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC8647Fhz;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.R;
import com.facebook.aura.library.model.MediaEntryUiModel;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class MediaSectionKt {
    public static final C7197Ei9 FIT_CENTER_IMAGE_OPTIONS;
    public static final C1D3 MEDIA_SECTION_ITEM_SHAPE = C1D8.A00(22.0f);
    public static final C7197Ei9 THUMBNAIL_IMAGE_OPTIONS;

    /* renamed from: com.facebook.aura.library.view.MediaSectionKt$MediaEmptyState$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MediaSectionKt.MediaEmptyState(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaSectionKt$MediaErrorState$2, reason: invalid class name and case insensitive filesystem */
    public final class C123962 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123962(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MediaSectionKt.MediaErrorState(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaSectionKt$MediaLoadingState$2, reason: invalid class name and case insensitive filesystem */
    public final class C123972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123972(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MediaSectionKt.MediaLoadingState(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaSectionKt$MediaSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoadingMore;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ LoadingState $loadingState;
        public final /* synthetic */ AHD<MediaEntryUiModel> $mediaEntries;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ Function0<Unit> $onSeeAllClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AHD<MediaEntryUiModel> ahd, LoadingState loadingState, Function0<Unit> function0, BRg bRg, LazyListState lazyListState, boolean z, Function0<Unit> function02, int i, int i2) {
            super(2);
            this.$mediaEntries = ahd;
            this.$loadingState = loadingState;
            this.$onSeeAllClick = function0;
            this.$modifier = bRg;
            this.$listState = lazyListState;
            this.$isLoadingMore = z;
            this.$onLoadMore = function02;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MediaSectionKt.MediaSection(this.$mediaEntries, this.$loadingState, this.$onSeeAllClick, this.$modifier, this.$listState, this.$isLoadingMore, this.$onLoadMore, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaSectionKt$MediaThumbnailContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C123983 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $displayUri;
        public final /* synthetic */ MediaEntryUiModel $entry;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C7197Ei9 $options;
        public final /* synthetic */ String $sharedElementKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123983(MediaEntryUiModel mediaEntryUiModel, String str, BRg bRg, C7197Ei9 c7197Ei9, String str2, int i, int i2) {
            super(2);
            this.$entry = mediaEntryUiModel;
            this.$displayUri = str;
            this.$modifier = bRg;
            this.$options = c7197Ei9;
            this.$sharedElementKey = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MediaSectionKt.MediaThumbnailContent(this.$entry, this.$displayUri, this.$modifier, this.$options, this.$sharedElementKey, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaSectionKt$VideoNotAvailableView$2, reason: invalid class name and case insensitive filesystem */
    public final class C123992 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123992(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            MediaSectionKt.VideoNotAvailableView(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaSectionKt$VideoThumbnail$2, reason: invalid class name and case insensitive filesystem */
    public final class C124002 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C7197Ei9 $options;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ AHD<String> $uris;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124002(AHD<String> ahd, BRg bRg, C7197Ei9 c7197Ei9, String str, int i, int i2) {
            super(2);
            this.$uris = ahd;
            this.$modifier = bRg;
            this.$options = c7197Ei9;
            this.$sharedElementKey = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MediaSectionKt.VideoThumbnail(this.$uris, this.$modifier, this.$options, this.$sharedElementKey, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    static {
        C7197Ei9 c7197Ei9 = C7197Ei9.A0P;
        THUMBNAIL_IMAGE_OPTIONS = AnonymousClass005.A0Z(c7197Ei9);
        C7196Ei8 c7196Ei8 = new C7196Ei8(c7197Ei9);
        c7196Ei8.A00(InterfaceC8647Fhz.A05);
        FIT_CENTER_IMAGE_OPTIONS = new C7197Ei9(c7196Ei8);
    }

    public static final void MediaEmptyState(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(426957476);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c64);
            BS0 bs0 = BRg.A00;
            SectionHeaderKt.SectionHeader(strA01, AbstractC07539Wl.A00(bs0, "hatch-section-media"), null, null, bfm, 48, 12);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c65), C3U4.A05(bs0, C06G.A00(bfm)), C06G.A09(bfm), C06G.A0T(bfm), null, null, null, false, 0, 2, 0, null, null, null, bfm, 805306368, 0, 15856);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    public static final void MediaErrorState(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1667812599);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c64);
            BS0 bs0 = BRg.A00;
            SectionHeaderKt.SectionHeader(strA01, AbstractC07539Wl.A00(bs0, "hatch-section-media"), null, null, bfm, 48, 12);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c68), C3U4.A05(bs0, C06G.A00(bfm)), C06G.A09(bfm), C06G.A0T(bfm), null, null, null, false, 0, 2, 0, null, null, null, bfm, 805306368, 0, 15856);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123962(bRg2, i, i2);
        }
    }

    public static final void MediaLoadingState(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1829384747);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c64);
            BS0 bs0 = BRg.A00;
            SectionHeaderKt.SectionHeader(strA01, AbstractC07539Wl.A00(bs0, "hatch-section-media"), null, null, bfm, 48, 12);
            float f = AuraDimensKt.SpacingSmall;
            C01N.A08(bfm, bs0, f);
            BRg bRgA0M = C06G.A0M(bfm, bs0);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f), bfm, C2VU.A04, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0M);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AnonymousClass007.A0u(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c69), null, C06G.A09(bfm), C06G.A0T(bfm), null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15858);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123972(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MediaSection(X.AHD<com.facebook.aura.library.model.MediaEntryUiModel> r34, com.facebook.aura.library.repo.LoadingState r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, X.BRg r37, androidx.compose.foundation.lazy.LazyListState r38, boolean r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.MediaSectionKt.MediaSection(X.AHD, com.facebook.aura.library.repo.LoadingState, kotlin.jvm.functions.Function0, X.BRg, androidx.compose.foundation.lazy.LazyListState, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MediaThumbnailContent(com.facebook.aura.library.model.MediaEntryUiModel r22, java.lang.String r23, X.BRg r24, X.C7197Ei9 r25, java.lang.String r26, X.BFM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.MediaSectionKt.MediaThumbnailContent(com.facebook.aura.library.model.MediaEntryUiModel, java.lang.String, X.BRg, X.Ei9, java.lang.String, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VideoThumbnail(X.AHD<java.lang.String> r23, X.BRg r24, X.C7197Ei9 r25, java.lang.String r26, X.BFM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.MediaSectionKt.VideoThumbnail(X.AHD, X.BRg, X.Ei9, java.lang.String, X.BFM, int, int):void");
    }

    public static final C7197Ei9 thumbnailImageOptions(int i) {
        C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
        c7196Ei8.A00(InterfaceC8647Fhz.A01);
        ((C7195Ei7) c7196Ei8).A06 = i <= 0 ? null : new C7481Exe(i, i);
        return new C7197Ei9(c7196Ei8);
    }

    public static final void VideoNotAvailableView(BFM bfm, int i) {
        bfm.AgG(137307017);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            C1062ATq c1062ATq = C10G.A01;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA01 = C1b8.A01(c1062ATq, C06G.A0K(bfm, akh));
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_info, 0), AuraIconSize.SMALL, null, C06G.A0I(bfm, akh), null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123992(i);
        }
    }
}
