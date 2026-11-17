package com.facebook.aura.file.repo;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ArtifactDeployHolder$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<ArtifactDeployHolder> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtifactDeployHolder$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ArtifactDeployHolder invoke() {
        return new ArtifactDeployHolder(this.$userSession);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ArtifactDeployHolder invoke() {
        return new ArtifactDeployHolder(this.$userSession);
    }
}
