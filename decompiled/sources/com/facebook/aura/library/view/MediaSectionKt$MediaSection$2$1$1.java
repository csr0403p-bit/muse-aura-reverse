package com.facebook.aura.library.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BJe;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0CD;
import X.C0t8;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1D3;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C3Ue;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.library.model.MediaEntryUiModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaSectionKt$MediaSection$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AHD<ContentItem> $contentItems;
    public final /* synthetic */ C1BO<AuraNavigator> $currentNavigator;
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ AHD<MediaEntryUiModel> $mediaEntries;
    public final /* synthetic */ C7197Ei9 $thumbnailOptions;

    /* renamed from: com.facebook.aura.library.view.MediaSectionKt$MediaSection$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Object> {
        public final /* synthetic */ AHD<MediaEntryUiModel> $mediaEntries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AHD<MediaEntryUiModel> ahd) {
            super(1);
            this.$mediaEntries = ahd;
        }

        public final Object invoke(int i) {
            return ((MediaEntryUiModel) this.$mediaEntries.get(i)).relativePath;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaSectionKt$MediaSection$2$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<AnonymousClass037, Integer, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<ContentItem> $contentItems;
        public final /* synthetic */ C1BO<AuraNavigator> $currentNavigator;
        public final /* synthetic */ AHD<MediaEntryUiModel> $mediaEntries;
        public final /* synthetic */ C7197Ei9 $thumbnailOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<MediaEntryUiModel> ahd, C1BO<? extends AuraNavigator> c1bo, AHD<ContentItem> ahd2, C7197Ei9 c7197Ei9) {
            super(4);
            this.$mediaEntries = ahd;
            this.$currentNavigator = c1bo;
            this.$contentItems = ahd2;
            this.$thumbnailOptions = c7197Ei9;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
            int iA0E = i2;
            C7384Etj.A0Y(anonymousClass037, 0);
            if ((i2 & 48) == 0) {
                iA0E = i2 | AnonymousClass004.A0E(bfm, i);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0E & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0E)) {
                bfm.Afo();
                return;
            }
            MediaEntryUiModel mediaEntryUiModel = (MediaEntryUiModel) this.$mediaEntries.get(i);
            String strA0M = FGI.A0M("lobster_msection_", mediaEntryUiModel.relativePath);
            BRg bRgA07 = C10G.A07(BRg.A00, 110.0f);
            C1D3 c1d3 = MediaSectionKt.MEDIA_SECTION_ITEM_SHAPE;
            BRg bRgA00 = BJe.A00(C11U.A03(bRgA07, c1d3), 1.0f, false);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA02 = C1DI.A02(C1b8.A01(bRgA00, C06G.A0K(bfm, akh)), c1d3, 0.0f, C06G.A0E(bfm, akh));
            boolean zA1C = AnonymousClass003.A1C(iA0E) | AnonymousClass001.A1R(bfm, this.$contentItems, AnonymousClass001.A1R(bfm, this.$currentNavigator, bfm.A65(mediaEntryUiModel)));
            C1BO<AuraNavigator> c1bo = this.$currentNavigator;
            AHD<ContentItem> ahd = this.$contentItems;
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new MediaSectionKt$MediaSection$2$1$1$2$1$1(mediaEntryUiModel, c1bo, ahd, i);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgA02, null, null, (Function0) objAaT, true);
            Alignment alignment = C2VU.A09;
            C7197Ei9 c7197Ei9 = this.$thumbnailOptions;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0D);
            HatchSharedElementKt.HatchSharedElement(strA0M, c1d3, null, null, null, null, B1V.A00(bfm, new MediaSectionKt$MediaSection$2$1$1$2$2$1(mediaEntryUiModel, c7197Ei9, strA0M), 608080966), bfm, 1572912, 60);
            BBI.A0R(bbi, true);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
            invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        int size = this.$mediaEntries.size();
        AHD<MediaEntryUiModel> ahd = this.$mediaEntries;
        c0cd.APL(new AnonymousClass1(ahd), C0t8.A00, AnonymousClass001.A0M(new AnonymousClass2(ahd, this.$currentNavigator, this.$contentItems, this.$thumbnailOptions), -1313402282), size);
        if (this.$isLoadingMore) {
            c0cd.APJ("media_loading_more", null, ComposableSingletons$MediaSectionKt.f73lambda$1940433020);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaSectionKt$MediaSection$2$1$1(AHD<MediaEntryUiModel> ahd, boolean z, C1BO<? extends AuraNavigator> c1bo, AHD<ContentItem> ahd2, C7197Ei9 c7197Ei9) {
        super(1);
        this.$mediaEntries = ahd;
        this.$isLoadingMore = z;
        this.$currentNavigator = c1bo;
        this.$contentItems = ahd2;
        this.$thumbnailOptions = c7197Ei9;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
