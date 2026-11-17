package com.facebook.aura.composer.view;

import X.AbstractC2022Awb;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BHJ;
import X.BRg;
import X.C0dx;
import X.C1518AkS;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$leadingButtons$1$1$1 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ C1518AkS $attachButtonFocusRequester;
    public final /* synthetic */ boolean $captureActionsInPlusMenu;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ boolean $isSendEnabled;
    public final /* synthetic */ Function0<Unit> $onCancelDictation;
    public final /* synthetic */ MutableState<Boolean> $showAttachmentMenu$delegate;
    public final /* synthetic */ MutableState<Boolean> $showCaptureMenu$delegate;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$leadingButtons$1$1$1(Function0<Unit> function0, C1518AkS c1518AkS, boolean z, String str, boolean z2, boolean z3, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(3);
        this.$onCancelDictation = function0;
        this.$attachButtonFocusRequester = c1518AkS;
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$captureActionsInPlusMenu = z2;
        this.$isSendEnabled = z3;
        this.$showCaptureMenu$delegate = mutableState;
        this.$showAttachmentMenu$delegate = mutableState2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
        invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, BFM bfm, int i) {
        int iA0n = i;
        if ((i & 6) == 0) {
            iA0n = i | AnonymousClass004.A0n(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (z) {
                bfm.AgE(-631990548);
                TapDictationComposerKt.DictationCancelButton(this.$onCancelDictation, null, bfm, 0, 2);
            } else {
                bfm.AgE(-631855419);
                C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120709);
                BRg bRgA00 = BHJ.A00(BRg.A00, this.$attachButtonFocusRequester);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$leadingButtons$1$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                BRg bRgA002 = AbstractC2022Awb.A00(bRgA00, (G0U) objAaT);
                boolean zA1U = AnonymousClass001.A1U(bfm, this.$captureActionsInPlusMenu, AnonymousClass001.A1R(bfm, this.$threadId, AnonymousClass001.A1U(bfm, this.$isPrimaryThread, bfm.A67(c0dxA0T))));
                boolean z2 = this.$isPrimaryThread;
                String str = this.$threadId;
                boolean z3 = this.$captureActionsInPlusMenu;
                MutableState<Boolean> mutableState = this.$showCaptureMenu$delegate;
                MutableState<Boolean> mutableState2 = this.$showAttachmentMenu$delegate;
                Object objAaT2 = bfm.AaT();
                if (zA1U || objAaT2 == obj) {
                    objAaT2 = new HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$leadingButtons$1$1$1$2$1(c0dxA0T, z2, str, z3, mutableState, mutableState2);
                    bfm.Ai0(objAaT2);
                }
                HatchComposerKt.m431ComposerInlineIconButtonHYR8e34(R.drawable.ic_wearables_plus, strA01, (Function0) objAaT2, bRgA002, this.$isSendEnabled, 0.0f, bfm, 0, 32);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
