package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.library.model.ArtifactFile;

/* loaded from: classes.dex */
public final class ArtifactsDetailScreenKt$ArtifactsDetailScreen$4$1 extends AbstractC7559F3s implements G0U<ArtifactFile, String> {
    public static final ArtifactsDetailScreenKt$ArtifactsDetailScreen$4$1 INSTANCE = new ArtifactsDetailScreenKt$ArtifactsDetailScreen$4$1();

    public ArtifactsDetailScreenKt$ArtifactsDetailScreen$4$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ String invoke(ArtifactFile artifactFile) {
        ArtifactFile artifactFile2 = artifactFile;
        C7384Etj.A0Y(artifactFile2, 0);
        return artifactFile2.imageUri;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final String invoke2(ArtifactFile artifactFile) {
        C7384Etj.A0Y(artifactFile, 0);
        return artifactFile.imageUri;
    }
}
