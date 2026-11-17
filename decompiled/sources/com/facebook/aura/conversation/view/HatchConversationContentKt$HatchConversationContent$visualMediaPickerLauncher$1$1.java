package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$visualMediaPickerLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(androidx.activity.result.ActivityResult r6) {
        /*
            r5 = this;
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r5 = r5.$viewModel
            int r1 = X.C7L3.A00()
            r0 = 1
            if (r1 <= r0) goto L53
            int r2 = r6.A00
            android.content.Intent r1 = r6.A01
            r0 = -1
            if (r2 != r0) goto L30
            if (r1 == 0) goto L30
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            android.net.Uri r0 = r1.getData()
            if (r0 == 0) goto L24
            r4.add(r0)
        L24:
            android.content.ClipData r3 = r1.getClipData()
            if (r3 != 0) goto L36
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L4d
        L30:
            X.AGi r0 = X.C0881AGi.A00
        L32:
            r5.onAttachmentsPicked(r0)
            return
        L36:
            int r2 = r3.getItemCount()
            r1 = 0
        L3b:
            if (r1 >= r2) goto L4d
            android.content.ClipData$Item r0 = r3.getItemAt(r1)
            android.net.Uri r0 = r0.getUri()
            if (r0 == 0) goto L4a
            r4.add(r0)
        L4a:
            int r1 = r1 + 1
            goto L3b
        L4d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            goto L32
        L53:
            java.lang.String r1 = "Max items must be higher than 1"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$visualMediaPickerLauncher$1$1.invoke2(androidx.activity.result.ActivityResult):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$visualMediaPickerLauncher$1$1(HatchConversationViewModel hatchConversationViewModel) {
        super(1);
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
