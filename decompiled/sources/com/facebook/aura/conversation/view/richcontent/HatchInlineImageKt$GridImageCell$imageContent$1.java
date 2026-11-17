package com.facebook.aura.conversation.view.richcontent;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BJe;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3Ue;
import X.C7197Ei9;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$GridImageCell$imageContent$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasError$delegate;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$GridImageCell$imageContent$1(String str, MutableState<Boolean> mutableState, G0U<? super String, Unit> g0u) {
        super(2);
        this.$url = str;
        this.$hasError$delegate = mutableState;
        this.$onImageError = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            Alignment alignment = C2VU.A09;
            String str = this.$url;
            MutableState<Boolean> mutableState = this.$hasError$delegate;
            G0U<String, Unit> g0u = this.$onImageError;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            float f = HatchInlineImageKt.DefaultInlineImageSize;
            if (!MutableState.A0A((MutableState) mutableState)) {
                bfm.AgE(1183071663);
                BRg bRgA00 = BJe.A00(C10G.A02, 1.0f, false);
                C7197Ei9 c7197Ei9 = HatchInlineImageKt.CENTER_CROP;
                boolean zA1R = AnonymousClass005.A1R(bfm, mutableState, g0u, str);
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchInlineImageKt$GridImageCell$imageContent$1$1$1$1(g0u, str, mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraImageKt.AuraImage(str, bRgA00, c7197Ei9, null, null, false, null, (Function0) objAaT, true, null, bfm, 100663344, 632);
            } else {
                bfm.AgE(1183366225);
                HatchInlineImageKt.MediaNotAvailableView(null, 0.0f, bfm, 0, 3);
            }
            AnonymousClass003.A0q(bbi);
            return;
        }
        bfm.Afo();
    }
}
