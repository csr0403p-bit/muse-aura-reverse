package com.facebook.aura.feed.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C0CD;
import X.C0v5;
import X.C10G;
import X.C1YD;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G2j;
import com.facebook.aura.feed.repo.FeedTapKind;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitAttachment$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ AHD<ContentItem> $contentItems;
    public final /* synthetic */ String $imageLabel;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;
    public final /* synthetic */ FeedUnit $unit;
    public final /* synthetic */ String $videoLabel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final AHD<ContentItem> ahd = this.$contentItems;
        final String str = this.$videoLabel;
        final String str2 = this.$imageLabel;
        final FeedUnit feedUnit = this.$unit;
        final int i = this.$absolutePosition;
        final G0U<FeedTapKind, Unit> g0u = this.$reportTap;
        final AuraNavigator auraNavigator = this.$navigator;
        c0cd.APL(null, new G0U<Integer, Object>() { // from class: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitAttachment$1$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                ahd.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i2) {
                ahd.get(i2);
                return null;
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitAttachment$1$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i2, BFM bfm, int i3) {
                int iA0d = (i3 & 6) == 0 ? i3 | AnonymousClass004.A0d(bfm, anonymousClass037) : i3;
                if ((i3 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i2);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ContentItem contentItem = (ContentItem) ahd.get(i2);
                bfm.AgE(1707662133);
                boolean z = contentItem.type instanceof ContentType.Video;
                String str3 = z ? contentItem.thumbnailUri : contentItem.imageUri;
                String str4 = z ? str : str2;
                String str5 = contentItem.sharedElementKey;
                BRg bRgA07 = C10G.A07(BRg.A00, FeedUnitRowKt.CarouselItemSize);
                C1YD c1yd = new C1YD(0);
                boolean zA1R = AnonymousClass001.A1R(bfm, ahd, AnonymousClass001.A1T(bfm, auraNavigator, AnonymousClass001.A1R(bfm, g0u, AnonymousClass001.A1a(AnonymousClass001.A1R(bfm, feedUnit, bfm.A66(z)), bfm, i)))) | ((((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) > 32 && bfm.A63(i2)) || (iA0d & 48) == 32);
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new FeedUnitRowKt$FeedUnitAttachment$1$1$1$1$1(z, feedUnit, i, g0u, auraNavigator, ahd, i2);
                    bfm.Ai0(objAaT);
                }
                HatchSharedElementKt.HatchSharedElement(str5, FeedUnitRowKt.AttachmentShape, C0v5.A04(bRgA07, c1yd, str4, (Function0) objAaT, true), null, null, null, B1V.A00(bfm, new FeedUnitRowKt$FeedUnitAttachment$1$1$1$2(str3, str4, z), -813648007), bfm, 1572912, 56);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), ahd.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUnitAttachment$1$1(AHD<ContentItem> ahd, String str, String str2, FeedUnit feedUnit, int i, G0U<? super FeedTapKind, Unit> g0u, AuraNavigator auraNavigator) {
        super(1);
        this.$contentItems = ahd;
        this.$videoLabel = str;
        this.$imageLabel = str2;
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$reportTap = g0u;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
