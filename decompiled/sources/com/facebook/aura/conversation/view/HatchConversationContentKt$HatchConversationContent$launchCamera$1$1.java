package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import java.util.Collections;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$launchCamera$1$1 extends AbstractC7559F3s implements G0U<File, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(File file) {
        C7384Etj.A0Y(file, 0);
        this.$viewModel.onAttachmentsPicked(Collections.singletonList(HatchFileProviderUtil.INSTANCE.getUriForFile(this.$context, file)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$launchCamera$1$1(HatchConversationViewModel hatchConversationViewModel, Context context) {
        super(1);
        this.$viewModel = hatchConversationViewModel;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(File file) {
        invoke2(file);
        return Unit.INSTANCE;
    }
}
