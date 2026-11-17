package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C10G;
import X.G0W;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.spaces.conversation.ComposableSingletons$HatchSpaceProposalCardKt$lambda$-432471515$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchSpaceProposalCardKt$lambda$432471515$1 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchSpaceProposalCardKt$lambda$432471515$1 INSTANCE = new ComposableSingletons$HatchSpaceProposalCardKt$lambda$432471515$1();

    public ComposableSingletons$HatchSpaceProposalCardKt$lambda$432471515$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
        invoke(iconContext, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(IconContext iconContext, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(BRg.A00, 16.0f), null, 0L, bfm, 6, 6);
        } else {
            bfm.Afo();
        }
    }
}
