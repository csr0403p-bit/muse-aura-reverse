package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C7197Ei9;
import X.G0V;
import com.facebook.aura.library.model.MediaEntryUiModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$LibraryTabContent$2$1$4$1$1$3$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ MediaEntryUiModel $entry;
    public final /* synthetic */ C7197Ei9 $thumbnailOptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$LibraryTabContent$2$1$4$1$1$3$1(MediaEntryUiModel mediaEntryUiModel, C7197Ei9 c7197Ei9) {
        super(2);
        this.$entry = mediaEntryUiModel;
        this.$thumbnailOptions = c7197Ei9;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            MediaEntryUiModel mediaEntryUiModel = this.$entry;
            MediaSectionKt.MediaThumbnailContent(mediaEntryUiModel, mediaEntryUiModel.tileImageUri, null, this.$thumbnailOptions, null, bfm, 0, 20);
        } else {
            bfm.Afo();
        }
    }
}
