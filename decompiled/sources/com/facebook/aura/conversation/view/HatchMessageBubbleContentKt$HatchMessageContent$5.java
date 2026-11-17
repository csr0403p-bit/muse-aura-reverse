package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.G2j;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageContent$5 extends AbstractC7559F3s implements G2j<BRg, Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ G2j<BRg, Boolean, BFM, Integer, Unit> $richContentBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageBubbleContentKt$HatchMessageContent$5(G2j<? super BRg, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j) {
        super(4);
        this.$richContentBody = g2j;
    }

    public final void invoke(BRg bRg, boolean z, BFM bfm, int i) {
        int iA0d = AnonymousClass002.A0B(bRg, i) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            AnonymousClass001.A1F(bRg, Boolean.valueOf(z), bfm, this.$richContentBody, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA0d & 14) | 384);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, Boolean bool, BFM bfm, Integer num) {
        invoke(bRg, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
