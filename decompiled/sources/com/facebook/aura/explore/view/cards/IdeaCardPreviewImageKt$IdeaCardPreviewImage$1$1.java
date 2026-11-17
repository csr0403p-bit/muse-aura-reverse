package com.facebook.aura.explore.view.cards;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.CFK;
import X.G0U;

/* loaded from: classes.dex */
public final class IdeaCardPreviewImageKt$IdeaCardPreviewImage$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $previewImageUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaCardPreviewImageKt$IdeaCardPreviewImage$1$1(String str) {
        super(1);
        this.$previewImageUrl = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        CFK.A0H(IdeaCardPreviewImageKt.TAG, "resolveIdeaPreviewImageUrl returned null for previewImageUrl=%s", this.$previewImageUrl);
        return new C78g() { // from class: com.facebook.aura.explore.view.cards.IdeaCardPreviewImageKt$IdeaCardPreviewImage$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
