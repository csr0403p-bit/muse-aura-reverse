package com.facebook.aura.library.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C7BY;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.file.view.api.ContentTypeDetector;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.library.view.ArtifactsSectionKt$ArtifactFileViewer$1$1", f = "ArtifactsSection.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ArtifactsSectionKt$ArtifactFileViewer$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ArtifactFile $file;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtifactsSectionKt$ArtifactFileViewer$1$1(ArtifactFile artifactFile, AuraNavigator auraNavigator, Function0<Unit> function0, HtJ<? super ArtifactsSectionKt$ArtifactFileViewer$1$1> htJ) {
        super(2, htJ);
        this.$file = artifactFile;
        this.$navigator = auraNavigator;
        this.$onDismiss = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ArtifactsSectionKt$ArtifactFileViewer$1$1(this.$file, this.$navigator, this.$onDismiss, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String strResolveWorkspacePath = HatchFileUIUtils.INSTANCE.resolveWorkspacePath(this.$file.displayPath);
        String strA0V = C7BY.A0V(strResolveWorkspacePath, CustomConnectorRegisterRepositoryKt.ROOT_PATH, strResolveWorkspacePath);
        ContentType contentTypeFromFileName = ContentTypeDetector.INSTANCE.fromFileName(strResolveWorkspacePath);
        ArtifactFile artifactFile = this.$file;
        AnonymousClass006.A1C(new ContentItem(strA0V, contentTypeFromFileName, strResolveWorkspacePath, artifactFile.imageUri, null, FGI.A0M("lobster_artifact_", artifactFile.displayPath), null, null, null, false, null, null, null, null, null), this.$navigator);
        this.$onDismiss.invoke();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ArtifactsSectionKt$ArtifactFileViewer$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
