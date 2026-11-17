package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import com.facebook.aura.model.ImageOptionsWidgetData;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchConversationWidgetsKt$multiImageSelectionReplyTarget$1$1$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ ImageOptionsWidgetData $data;
    public final /* synthetic */ int $index;
    public final /* synthetic */ String $path;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A06("path", this.$path, c2nw);
        String str = (String) AbstractC0878AGe.A0A(this.$index, this.$data.imageIds);
        if (str != null) {
            C7qW.A06("image_id", str, c2nw);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationWidgetsKt$multiImageSelectionReplyTarget$1$1$1$1(String str, ImageOptionsWidgetData imageOptionsWidgetData, int i) {
        super(1);
        this.$path = str;
        this.$data = imageOptionsWidgetData;
        this.$index = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
