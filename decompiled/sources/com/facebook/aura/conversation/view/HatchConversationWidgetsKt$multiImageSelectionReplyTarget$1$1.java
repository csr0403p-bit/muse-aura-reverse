package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.G0U;
import com.facebook.aura.model.ImageOptionsWidgetData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchConversationWidgetsKt$multiImageSelectionReplyTarget$1$1 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
    public final /* synthetic */ ImageOptionsWidgetData $data;
    public final /* synthetic */ List<Integer> $indices;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C7pd c7pd) {
        C7384Etj.A0Y(c7pd, 0);
        List<Integer> list = this.$indices;
        ImageOptionsWidgetData imageOptionsWidgetData = this.$data;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iA03 = C60Q.A03(it);
            String str = (String) AbstractC0878AGe.A0A(iA03, imageOptionsWidgetData.images);
            if (str != null) {
                C7qW.A0B(new HatchConversationWidgetsKt$multiImageSelectionReplyTarget$1$1$1$1(str, imageOptionsWidgetData, iA03), c7pd);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationWidgetsKt$multiImageSelectionReplyTarget$1$1(List<Integer> list, ImageOptionsWidgetData imageOptionsWidgetData) {
        super(1);
        this.$indices = list;
        this.$data = imageOptionsWidgetData;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
        invoke2(c7pd);
        return Unit.INSTANCE;
    }
}
