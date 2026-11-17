package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.G0U;
import com.facebook.aura.markdown.render.spacing.BlockSpacingCategory;
import com.facebook.aura.markdown.render.spacing.BlockSpacingKt;
import com.facebook.aura.markdown.render.spacing.BlockSpacingSpec;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$WidgetPresentations$3$1 extends AbstractC7559F3s implements G0U<Integer, BlockSpacingSpec> {
    public static final HatchConversationPresentationsKt$WidgetPresentations$3$1 INSTANCE = new HatchConversationPresentationsKt$WidgetPresentations$3$1();

    public HatchConversationPresentationsKt$WidgetPresentations$3$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ BlockSpacingSpec invoke(Integer num) {
        AnonymousClass005.A0w(num);
        return BlockSpacingKt.messageSpacingFor(BlockSpacingCategory.PRESENTATION);
    }

    public final BlockSpacingSpec invoke(int i) {
        return BlockSpacingKt.messageSpacingFor(BlockSpacingCategory.PRESENTATION);
    }
}
