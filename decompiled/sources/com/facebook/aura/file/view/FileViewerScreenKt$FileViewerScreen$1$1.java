package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$1$1", f = "FileViewerScreen.kt", l = {176}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ UnifiedArtifactsRepository $artifactCatalog;
    public final /* synthetic */ MutableState<UnifiedArtifact> $pinnableArtifact$delegate;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ boolean $supportsPinning;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$1$1(boolean z, UnifiedArtifactsRepository unifiedArtifactsRepository, String str, MutableState<UnifiedArtifact> mutableState, HtJ<? super FileViewerScreenKt$FileViewerScreen$1$1> htJ) {
        super(2, htJ);
        this.$supportsPinning = z;
        this.$artifactCatalog = unifiedArtifactsRepository;
        this.$relativePath = str;
        this.$pinnableArtifact$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FileViewerScreenKt$FileViewerScreen$1$1(this.$supportsPinning, this.$artifactCatalog, this.$relativePath, this.$pinnableArtifact$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            mutableState = this.$pinnableArtifact$delegate;
            if (this.$supportsPinning) {
                UnifiedArtifactsRepository unifiedArtifactsRepository = this.$artifactCatalog;
                String str = this.$relativePath;
                this.L$0 = mutableState;
                this.label = 1;
                obj = unifiedArtifactsRepository.artifactForFilePath(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                obj = null;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$0;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FileViewerScreenKt$FileViewerScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
