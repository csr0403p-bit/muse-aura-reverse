package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.G2k;
import X.G2l;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $attachmentSender;
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ G2k<String, String, BRg, BFM, Integer, Unit> $onInlineAudioContent;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
    public final /* synthetic */ String $sharedElementKeyPrefix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$8(HatchContentViewModelData hatchContentViewModelData, G0V<? super String, ? super String, Unit> g0v, G0U<? super String, Unit> g0u, String str, G2k<? super String, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, G0U<? super String, Unit> g0u2, String str2, G0V<? super String, ? super String, Unit> g0v2, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l) {
        super(2);
        this.$contentViewModel = hatchContentViewModelData;
        this.$onInlineVideoClick = g0v;
        this.$onImageError = g0u;
        this.$sharedElementKeyPrefix = str;
        this.$onInlineAudioContent = g2k;
        this.$onArtifactVisible = g0u2;
        this.$attachmentSender = str2;
        this.$onInlineFileClick = g0v2;
        this.$inlineFilePreview = g2l;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r25, int r26) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$8.invoke(X.BFM, int):void");
    }
}
