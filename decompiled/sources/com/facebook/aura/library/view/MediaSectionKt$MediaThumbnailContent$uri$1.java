package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C7197Ei9;
import X.G0V;
import com.facebook.aura.library.model.MediaEntryUiModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaSectionKt$MediaThumbnailContent$uri$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $displayUri;
    public final /* synthetic */ MediaEntryUiModel $entry;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C7197Ei9 $options;
    public final /* synthetic */ String $sharedElementKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSectionKt$MediaThumbnailContent$uri$1(MediaEntryUiModel mediaEntryUiModel, String str, BRg bRg, C7197Ei9 c7197Ei9, String str2, int i, int i2) {
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
