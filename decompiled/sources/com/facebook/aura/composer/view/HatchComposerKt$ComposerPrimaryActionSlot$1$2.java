package com.facebook.aura.composer.view;

import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C1Cd;
import X.C78N;
import X.G0W;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerPrimaryActionSlot$1$2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Function0<Unit> $onStopClick;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ long $userMessageBubbleColor;
    public final /* synthetic */ long $userMessageTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerPrimaryActionSlot$1$2(boolean z, String str, Function0<Unit> function0, long j, long j2) {
        super(3);
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$onStopClick = function0;
        this.$userMessageTextColor = j;
        this.$userMessageBubbleColor = j2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120726);
            BRg bRgA00 = AbstractC07539Wl.A00(BRg.A00, "hatch-stop-button");
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onStopClick, AnonymousClass001.A1R(bfm, this.$threadId, bfm.A66(this.$isPrimaryThread)));
            boolean z = this.$isPrimaryThread;
            String str = this.$threadId;
            Function0<Unit> function0 = this.$onStopClick;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchComposerKt$ComposerPrimaryActionSlot$1$2$1$1(z, str, function0);
                bfm.Ai0(objAaT);
            }
            HatchComposerKt.m430ActionButtongI4cVvE(R.drawable.hatch_stop_square, (Function0) objAaT, this.$userMessageTextColor, this.$userMessageBubbleColor, bRgA00, strA01, 8.0f, 36.0f, true, bfm, 114843648, 0);
            return;
        }
        bfm.Afo();
    }
}
