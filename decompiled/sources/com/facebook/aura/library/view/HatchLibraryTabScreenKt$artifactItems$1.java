package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import com.facebook.aura.library.model.ArtifactFile;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$artifactItems$1 extends AbstractC7559F3s implements G0U<ArtifactFile, Object> {
    public final /* synthetic */ String $keyPrefix;

    @Override // X.G0U
    public final Object invoke(ArtifactFile artifactFile) {
        C7384Etj.A0Y(artifactFile, 0);
        return FGI.A0U(this.$keyPrefix, "_list_", artifactFile.id);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$artifactItems$1(String str) {
        super(1);
        this.$keyPrefix = str;
    }
}
