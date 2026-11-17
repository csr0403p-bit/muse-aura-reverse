package com.facebook.aura.feedback.view;

import X.AnonymousClass002;
import X.C4JM;
import android.view.View;
import com.facebook.aura.R;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FeedbackToastsKt {
    public static final void showFeedbackPromptToast(String str, Integer num, final Function0<Unit> function0) {
        AnonymousClass002.A1A(str, 0, function0);
        ToastApi._toasts.AhV(new AuraToast.ToastArgs(str, null, AuraToast.Duration.LONG, num, new AuraToastOption.Button(C4JM.A00().getString(R.string._name_removed__res_0x7f120299), null, false, true), new View.OnClickListener() { // from class: com.facebook.aura.feedback.view.FeedbackToastsKt.showFeedbackPromptToast.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                function0.invoke();
            }
        }, true, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.SMALL, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void showFeedbackResultToast(com.facebook.aura.feedback.FeedbackResult r17, com.facebook.aura.feedback.FeedbackVerdict r18, java.lang.String r19) {
        /*
            r0 = r17
            r2 = r18
            boolean r8 = X.AnonymousClass004.A1b(r0, r2)
            boolean r0 = r0 instanceof com.facebook.aura.feedback.FeedbackResult.Failed
            if (r0 == 0) goto L15
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131886744(0x7f120298, float:1.9408075E38)
            r1.showToast(r0)
            return
        L15:
            android.app.Application r1 = X.C4JM.A00()
            com.facebook.aura.feedback.FeedbackVerdict r0 = com.facebook.aura.feedback.FeedbackVerdict.UP
            r3 = r19
            if (r2 != r0) goto L24
            r0 = 2131886753(0x7f1202a1, float:1.9408094E38)
            if (r19 != 0) goto L27
        L24:
            r0 = 2131886752(0x7f1202a0, float:1.9408092E38)
        L27:
            java.lang.String r2 = r1.getString(r0)
            r5 = 0
            com.facebook.aura.vds.toast.AuraToast$Duration r4 = com.facebook.aura.vds.toast.AuraToast.Duration.SHORT
            com.facebook.aura.vds.compose.toast.AuraToastOption$None r6 = com.facebook.aura.vds.compose.toast.AuraToastOption.None.INSTANCE
            com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r10 = com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode.DEFAULT
            com.facebook.aura.vds.compose.icons.AuraIconSize r18 = com.facebook.aura.vds.compose.icons.AuraIconSize.MEDIUM
            com.facebook.aura.vds.toast.AuraToast$ToastArgs r1 = new com.facebook.aura.vds.toast.AuraToast$ToastArgs
            r7 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r13 = r8
            r14 = r8
            r15 = r5
            r16 = r5
            r17 = r5
            r19 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.3Em<com.facebook.aura.vds.toast.AuraToast$ToastArgs> r0 = com.facebook.aura.toast.api.ToastApi._toasts
            r0.AhV(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feedback.view.FeedbackToastsKt.showFeedbackResultToast(com.facebook.aura.feedback.FeedbackResult, com.facebook.aura.feedback.FeedbackVerdict, java.lang.String):void");
    }
}
