package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$inlineCallbacks$1$2 extends AbstractC7559F3s implements G0V<AHD<? extends HatchInlineImageData>, Integer, Unit> {
    public final /* synthetic */ MutableState<String> $inlineMediaViewerKeySuffix$delegate;
    public final /* synthetic */ MutableState<String> $inlineMediaViewerUrl$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageItemKt$HatchMessageItem$inlineCallbacks$1$2(MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(2);
        this.$inlineMediaViewerKeySuffix$delegate = mutableState;
        this.$inlineMediaViewerUrl$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AHD<? extends HatchInlineImageData> ahd, Integer num) {
        invoke((AHD<HatchInlineImageData>) ahd, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AHD<HatchInlineImageData> ahd, int i) {
        C7384Etj.A0Y(ahd, 0);
        HatchInlineImageData hatchInlineImageData = (HatchInlineImageData) AbstractC0878AGe.A0A(i, ahd);
        if (hatchInlineImageData != null) {
            MutableState<String> mutableState = this.$inlineMediaViewerKeySuffix$delegate;
            MutableState<String> mutableState2 = this.$inlineMediaViewerUrl$delegate;
            mutableState.Af8(HatchInlineImageKt.inlineImageGridKeySuffix(ahd, i));
            mutableState2.Af8(hatchInlineImageData.url);
        }
    }
}
