package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import android.net.Uri;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$15$1 extends AbstractC7559F3s implements G0U<List<? extends Uri>, Unit> {
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Uri> list) {
        C7384Etj.A0Y(list, 0);
        HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<? extends Uri> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toString());
        }
        hatchConversationViewModel.addPendingImageUris(arrayListA0i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$15$1(HatchConversationViewModel hatchConversationViewModel) {
        super(1);
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Uri> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }
}
