package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.HatchContentViewModelData;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
    public final /* synthetic */ String $sharedElementKeyPrefix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$7(HatchContentViewModelData hatchContentViewModelData, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u, String str) {
        super(2);
        this.$contentViewModel = hatchContentViewModelData;
        this.$onInlineImageGridClick = g0v;
        this.$onImageError = g0u;
        this.$sharedElementKeyPrefix = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            boolean zA65 = bfm.A65(((HatchContentViewModelData.InlineImageGroup) this.$contentViewModel).images);
            HatchContentViewModelData hatchContentViewModelData = this.$contentViewModel;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                AHD<HatchContentViewModelData.InlineImage> ahd = ((HatchContentViewModelData.InlineImageGroup) hatchContentViewModelData).images;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                for (HatchContentViewModelData.InlineImage inlineImage : ahd) {
                    arrayListA0i.add(new HatchInlineImageData(inlineImage.url, inlineImage.alt, inlineImage.deleted, null));
                }
                objAaT = AnonymousClass001.A0z(bfm, arrayListA0i);
            }
            HatchInlineImageKt.m677HatchInlineImageGridtw_glAc((AHD) objAaT, null, 0.0f, 0.0f, this.$onInlineImageGridClick, this.$onImageError, this.$sharedElementKeyPrefix, false, bfm, HatchInlineImageData.$stable, 142);
            return;
        }
        bfm.Afo();
    }
}
