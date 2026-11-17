package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerControls$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ContentItem $currentItem;
    public final /* synthetic */ Function0<Unit> $onCopyClick;
    public final /* synthetic */ Function0<Unit> $onDeleteClick;
    public final /* synthetic */ Function0<Unit> $onDownloadClick;
    public final /* synthetic */ Function0<Unit> $onReplyClick;
    public final /* synthetic */ Function0<Unit> $onShareClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerControls$1$1(ContentItem contentItem, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
        super(2);
        this.$currentItem = contentItem;
        this.$onDownloadClick = function0;
        this.$onReplyClick = function02;
        this.$onShareClick = function03;
        this.$onCopyClick = function04;
        this.$onDeleteClick = function05;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            if (this.$currentItem != null) {
                bfm.AgE(-1839172729);
                MediaViewerContentKt.MediaViewerItemActions(this.$currentItem, this.$onDownloadClick, this.$onReplyClick, this.$onShareClick, this.$onCopyClick, this.$onDeleteClick, null, null, bfm, 0, 192);
                AnonymousClass001.A1D(bfm);
                return;
            }
            AnonymousClass004.A1A(bfm, -1838848872);
            return;
        }
        bfm.Afo();
    }
}
