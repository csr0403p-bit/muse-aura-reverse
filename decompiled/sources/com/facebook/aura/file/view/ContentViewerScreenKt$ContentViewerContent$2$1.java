package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ContentViewerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$2$1(ContentViewerViewModel contentViewerViewModel) {
        super(1);
        this.$viewModel = contentViewerViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.refreshFromDataHolder();
        return new C78g() { // from class: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
