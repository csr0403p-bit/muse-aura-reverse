package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.library.repo.ArtifactItem;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$spaceSlugsForLogging$2$1 extends AbstractC7559F3s implements G0U<ArtifactItem, CharSequence> {
    public static final HatchSpacesModalScreenKt$spaceSlugsForLogging$2$1 INSTANCE = new HatchSpacesModalScreenKt$spaceSlugsForLogging$2$1();

    public HatchSpacesModalScreenKt$spaceSlugsForLogging$2$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(ArtifactItem artifactItem) {
        ArtifactItem artifactItem2 = artifactItem;
        C7384Etj.A0Y(artifactItem2, 0);
        return artifactItem2.itemKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(ArtifactItem artifactItem) {
        C7384Etj.A0Y(artifactItem, 0);
        return artifactItem.itemKey;
    }
}
