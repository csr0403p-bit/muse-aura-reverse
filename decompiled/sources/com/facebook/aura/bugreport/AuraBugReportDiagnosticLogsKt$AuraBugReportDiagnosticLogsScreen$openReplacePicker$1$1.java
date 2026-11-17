package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7OU;
import X.G0U;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$openReplacePicker$1$1 extends AbstractC7559F3s implements G0U<AuraBugReportCollector.CollectedItem, Unit> {
    public final /* synthetic */ MutableState<String> $pendingReplaceName$delegate;
    public final /* synthetic */ String $replaceFailedMessage;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $replaceLauncher;
    public final /* synthetic */ View $view;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraBugReportCollector.CollectedItem collectedItem) {
        C7384Etj.A0Y(collectedItem, 0);
        this.$pendingReplaceName$delegate.Af8(collectedItem.getName());
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        try {
            A02(intent);
        } catch (ActivityNotFoundException unused) {
            this.$pendingReplaceName$delegate.Af8(null);
            AuraToast auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(this.$view, this.$replaceFailedMessage, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
            if (auraToastM3114makeKDArT4I != null) {
                auraToastM3114makeKDArT4I.show();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$openReplacePicker$1$1(C7OU<Intent, ActivityResult> c7ou, View view, String str, MutableState<String> mutableState) {
        super(1);
        this.$replaceLauncher = c7ou;
        this.$view = view;
        this.$replaceFailedMessage = str;
        this.$pendingReplaceName$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraBugReportCollector.CollectedItem collectedItem) {
        invoke2(collectedItem);
        return Unit.INSTANCE;
    }
}
