package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.HatchDragDismissState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerDragDismissStateKt$mediaViewerDragDismissBackground$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ HatchDragDismissState $state;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(this.$state.getSurroundingContentAlpha());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerDragDismissStateKt$mediaViewerDragDismissBackground$1(HatchDragDismissState hatchDragDismissState) {
        super(1);
        this.$state = hatchDragDismissState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
