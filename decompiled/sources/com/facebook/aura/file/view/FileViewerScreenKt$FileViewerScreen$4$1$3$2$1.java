package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C0fG;
import X.CFK;
import android.os.TransactionTooLargeException;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$4$1$3$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0fG $clipboardManager;
    public final /* synthetic */ String $copiedMessage;
    public final /* synthetic */ MutableState<String> $currentContent$delegate;
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$4$1$3$2$1(WorkspaceEntry workspaceEntry, C0fG c0fG, View view, String str, MutableState<String> mutableState) {
        super(0);
        this.$entry = workspaceEntry;
        this.$clipboardManager = c0fG;
        this.$view = view;
        this.$copiedMessage = str;
        this.$currentContent$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FileViewerScreenKt.logFileEditorClick(HatchComponent.COPY_BUTTON, this.$entry.getFileExtension(), null);
        try {
            C0fG.A00(this.$clipboardManager, MutableState.A05(this.$currentContent$delegate));
            AuraToast auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(this.$view, this.$copiedMessage, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
            if (auraToastM3114makeKDArT4I != null) {
                auraToastM3114makeKDArT4I.show();
            }
        } catch (SecurityException e) {
            CFK.A0A("FileViewerScreen", "Clipboard refused the copy", e);
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof TransactionTooLargeException)) {
                throw e2;
            }
            CFK.A0A("FileViewerScreen", "File text too large to copy", e2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
