package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.G2j;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.library.view.ComposableSingletons$ArtifactsDetailScreenKt$lambda$-875524665$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ArtifactsDetailScreenKt$lambda$875524665$1 extends AbstractC7559F3s implements G2j<ArtifactFile, Function0<? extends Unit>, BFM, Integer, Unit> {
    public static final ComposableSingletons$ArtifactsDetailScreenKt$lambda$875524665$1 INSTANCE = new ComposableSingletons$ArtifactsDetailScreenKt$lambda$875524665$1();

    public ComposableSingletons$ArtifactsDetailScreenKt$lambda$875524665$1() {
        super(4);
    }

    public final void invoke(ArtifactFile artifactFile, Function0<Unit> function0, BFM bfm, int i) {
        AnonymousClass003.A0u(artifactFile, function0);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(artifactFile, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            ArtifactsSectionKt.ArtifactFileViewer(artifactFile, function0, bfm, ArtifactFile.$stable | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(ArtifactFile artifactFile, Function0<? extends Unit> function0, BFM bfm, Integer num) {
        invoke(artifactFile, (Function0<Unit>) function0, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
