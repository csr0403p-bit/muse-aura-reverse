package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.C00s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.model.SpaceConstructionStatus;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$HatchSpacesModalScreen$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ SpaceConstructionStatus $constructionStatus;
    public final /* synthetic */ C00s $documentRevision$delegate;
    public final /* synthetic */ SpaceDocumentRevisionTracker $documentRevisionTracker;
    public final /* synthetic */ boolean $hasMetadata;
    public final /* synthetic */ String $slug;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$HatchSpacesModalScreen$2$1(boolean z, SpaceDocumentRevisionTracker spaceDocumentRevisionTracker, String str, SpaceConstructionStatus spaceConstructionStatus, C00s c00s) {
        super(1);
        this.$hasMetadata = z;
        this.$documentRevisionTracker = spaceDocumentRevisionTracker;
        this.$slug = str;
        this.$constructionStatus = spaceConstructionStatus;
        this.$documentRevision$delegate = c00s;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$hasMetadata) {
            this.$documentRevision$delegate.Adh(this.$documentRevisionTracker.recordConstructionStatus(this.$slug, this.$constructionStatus));
        }
        return new C78g() { // from class: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$HatchSpacesModalScreen$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
