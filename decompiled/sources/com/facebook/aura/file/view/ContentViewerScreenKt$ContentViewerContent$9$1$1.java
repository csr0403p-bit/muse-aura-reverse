package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class ContentViewerScreenKt$ContentViewerContent$9$1$1 extends C7438Evz implements G0U<Integer, Unit> {
    public ContentViewerScreenKt$ContentViewerContent$9$1$1(Object obj) {
        super(1, obj, ContentViewerViewModel.class, "onPageChanged", "onPageChanged(I)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((ContentViewerViewModel) this.receiver).onPageChanged(i);
    }
}
