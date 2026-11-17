package com.facebook.aura.explore.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class IdeaConnectionContextKt$IdeaConnectionContext$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AHD<String> $connectionIds;
    public final /* synthetic */ IdeaConnectionNamesViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaConnectionContextKt$IdeaConnectionContext$2$1(IdeaConnectionNamesViewModel ideaConnectionNamesViewModel, AHD<String> ahd) {
        super(1);
        this.$viewModel = ideaConnectionNamesViewModel;
        this.$connectionIds = ahd;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.load(this.$connectionIds);
        return new C78g() { // from class: com.facebook.aura.explore.view.IdeaConnectionContextKt$IdeaConnectionContext$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
