package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.HatchContentCache;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$13$1$1 extends AbstractC7559F3s implements G0U<HatchContentViewModelData, Unit> {
    public final /* synthetic */ G0U<String, Unit> $navigate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchContentViewModelData hatchContentViewModelData) {
        C7384Etj.A0Y(hatchContentViewModelData, 0);
        String strA0k = AnonymousClass002.A0k();
        HatchContentCache.INSTANCE.put(strA0k, hatchContentViewModelData);
        this.$navigate.invoke(strA0k);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$13$1$1(G0U<? super String, Unit> g0u) {
        super(1);
        this.$navigate = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchContentViewModelData hatchContentViewModelData) {
        invoke2(hatchContentViewModelData);
        return Unit.INSTANCE;
    }
}
