package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7OU;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$onFilesClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C7OU<Intent, ActivityResult> $filePickerLauncher;
    public final /* synthetic */ String $filePickerTitle;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$onFilesClick$1$1(HatchConversationViewModel hatchConversationViewModel, C7OU<Intent, ActivityResult> c7ou, String str) {
        super(0);
        this.$viewModel = hatchConversationViewModel;
        this.$filePickerLauncher = c7ou;
        this.$filePickerTitle = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Integer numAttachmentPickerLimit = this.$viewModel.attachments.attachmentPickerLimit();
        if (numAttachmentPickerLimit != null) {
            C7OU<Intent, ActivityResult> c7ou = this.$filePickerLauncher;
            String str = this.$filePickerTitle;
            int iIntValue = numAttachmentPickerLimit.intValue();
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", iIntValue > 1);
            Intent intentCreateChooser = Intent.createChooser(intent, str);
            C7384Etj.A0U(intentCreateChooser);
            c7ou.A02(intentCreateChooser);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
