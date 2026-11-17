package com.facebook.aura.conversation.view;

import X.ADq;
import X.ATD;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.BNt;
import X.C7384Etj;
import X.G0U;
import android.content.ClipData;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$filePickerLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.aura.conversation.viewmodel.HatchConversationViewModel] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        ?? A0z;
        C7384Etj.A0Y(activityResult, 0);
        Intent intent = activityResult.A01;
        if (activityResult.A00 != -1 || intent == null) {
            return;
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            ADq aDqA0C = ATD.A0C(0, clipData.getItemCount());
            A0z = AnonymousClass003.A0i(aDqA0C);
            Iterator<Integer> it = aDqA0C.iterator();
            while (it.hasNext()) {
                A0z.add(clipData.getItemAt(((BNt) it).A00()).getUri());
            }
        } else {
            A0z = AbstractC0885AGm.A0z(intent.getData());
        }
        this.$viewModel.onAttachmentsPicked(A0z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$filePickerLauncher$1$1(HatchConversationViewModel hatchConversationViewModel) {
        super(1);
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
