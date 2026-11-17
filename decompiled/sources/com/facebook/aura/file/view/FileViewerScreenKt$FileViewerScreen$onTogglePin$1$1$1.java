package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$onTogglePin$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ UnifiedArtifact $artifact;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ String $pinFailedMessage;
    public final /* synthetic */ String $pinSuccessMessage;
    public final /* synthetic */ MutableState<UnifiedArtifact> $pinnableArtifact$delegate;
    public final /* synthetic */ ArtifactsDataSource $pinning;
    public final /* synthetic */ String $unpinFailedMessage;
    public final /* synthetic */ String $unpinSuccessMessage;
    public final /* synthetic */ View $view;

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$onTogglePin$1$1$1$1", f = "FileViewerScreen.kt", l = {186, 188}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$onTogglePin$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ UnifiedArtifact $artifact;
        public final /* synthetic */ String $pinFailedMessage;
        public final /* synthetic */ String $pinSuccessMessage;
        public final /* synthetic */ MutableState<UnifiedArtifact> $pinnableArtifact$delegate;
        public final /* synthetic */ ArtifactsDataSource $pinning;
        public final /* synthetic */ String $unpinFailedMessage;
        public final /* synthetic */ String $unpinSuccessMessage;
        public final /* synthetic */ View $view;
        public int I$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnifiedArtifact unifiedArtifact, ArtifactsDataSource artifactsDataSource, View view, String str, String str2, String str3, String str4, MutableState<UnifiedArtifact> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$artifact = unifiedArtifact;
            this.$pinning = artifactsDataSource;
            this.$view = view;
            this.$pinSuccessMessage = str;
            this.$unpinSuccessMessage = str2;
            this.$pinFailedMessage = str3;
            this.$unpinFailedMessage = str4;
            this.$pinnableArtifact$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$artifact, this.$pinning, this.$view, this.$pinSuccessMessage, this.$unpinSuccessMessage, this.$pinFailedMessage, this.$unpinFailedMessage, this.$pinnableArtifact$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            Object objUnpin = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(objUnpin);
                UnifiedArtifact unifiedArtifact = this.$artifact;
                boolean z = unifiedArtifact.isPinned;
                i = !z ? 1 : 0;
                ArtifactsDataSource artifactsDataSource = this.$pinning;
                ArtifactSource artifactSource = unifiedArtifact.source;
                if (z) {
                    String str = unifiedArtifact.itemKey;
                    this.I$0 = i;
                    this.label = 2;
                    objUnpin = artifactsDataSource.unpin(artifactSource, str, this);
                } else {
                    String str2 = unifiedArtifact.itemKey;
                    this.I$0 = i;
                    this.label = 1;
                    objUnpin = artifactsDataSource.pinToTop(artifactSource, str2, this);
                }
                if (objUnpin == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw AnonymousClass001.A0n();
                }
                i = this.I$0;
                Hwg.A00(objUnpin);
            }
            boolean zA1X = AnonymousClass001.A1X(objUnpin);
            if (zA1X) {
                this.$pinnableArtifact$delegate.Af8(UnifiedArtifact.copy$default(this.$artifact, null, null, null, null, null, null, null, null, AnonymousClass002.A1L(i), 0L, false, false, false, null, null, null, null, null, null, false, false, false, 4194047, null));
            }
            AnonymousClass007.A0n(this.$view, AuraToast.Companion, zA1X ? i != 0 ? this.$pinSuccessMessage : this.$unpinSuccessMessage : i != 0 ? this.$pinFailedMessage : this.$unpinFailedMessage);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$onTogglePin$1$1$1(UnifiedArtifact unifiedArtifact, WorkspaceEntry workspaceEntry, C3UX c3ux, ArtifactsDataSource artifactsDataSource, View view, String str, String str2, String str3, String str4, MutableState<UnifiedArtifact> mutableState) {
        super(0);
        this.$artifact = unifiedArtifact;
        this.$entry = workspaceEntry;
        this.$coroutineScope = c3ux;
        this.$pinning = artifactsDataSource;
        this.$view = view;
        this.$pinSuccessMessage = str;
        this.$unpinSuccessMessage = str2;
        this.$pinFailedMessage = str3;
        this.$unpinFailedMessage = str4;
        this.$pinnableArtifact$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FileViewerScreenKt.logFileEditorClick(this.$artifact.isPinned ? HatchComponent.UNPIN_BUTTON : HatchComponent.PIN_BUTTON, this.$entry.getFileExtension(), null);
        AnonymousClass001.A1J(new AnonymousClass1(this.$artifact, this.$pinning, this.$view, this.$pinSuccessMessage, this.$unpinSuccessMessage, this.$pinFailedMessage, this.$unpinFailedMessage, this.$pinnableArtifact$delegate, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
