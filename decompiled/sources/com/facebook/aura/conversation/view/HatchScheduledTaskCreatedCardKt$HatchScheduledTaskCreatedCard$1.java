package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.C06G;
import X.C07C;
import X.G0W;
import com.facebook.aura.model.ScheduledTaskCreatedPresentation;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchScheduledTaskCreatedCardKt$HatchScheduledTaskCreatedCard$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ ScheduledTaskCreatedPresentation $task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchScheduledTaskCreatedCardKt$HatchScheduledTaskCreatedCard$1(ScheduledTaskCreatedPresentation scheduledTaskCreatedPresentation) {
        super(3);
        this.$task = scheduledTaskCreatedPresentation;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
            HatchInternalLinkActionCardKt.InternalLinkCardHeader(this.$task.title, ComposableSingletons$HatchScheduledTaskCreatedCardKt.lambda$588655323, ComposableSingletons$HatchScheduledTaskCreatedCardKt.f33lambda$1413656006, null, bfm, 432, 8);
            String str = this.$task.description;
            if (str == null) {
                bfm.AgE(203810988);
            } else {
                bfm.AgE(203810989);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            AnonymousClass001.A1D(bfm);
            HatchScheduledTaskCreatedCardKt.ScheduledTaskCreatedButton(this.$task.taskId, null, bfm, 0, 2);
            return;
        }
        bfm.Afo();
    }
}
