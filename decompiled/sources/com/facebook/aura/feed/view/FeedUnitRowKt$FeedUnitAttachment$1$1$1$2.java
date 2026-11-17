package com.facebook.aura.feed.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B18;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3Ue;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitAttachment$1$1$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $cellUri;
    public final /* synthetic */ boolean $isVideo;
    public final /* synthetic */ String $label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedUnitAttachment$1$1$1$2(String str, String str2, boolean z) {
        super(2);
        this.$cellUri = str;
        this.$label = str2;
        this.$isVideo = z;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            Alignment alignment = C2VU.A09;
            String str = this.$cellUri;
            String str2 = this.$label;
            boolean z = this.$isVideo;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            if (str != null) {
                bfm.AgE(-527641881);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, c1062ATq, B18.A00, str2, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 432, 0, 32752);
            } else {
                bfm.AgE(-527414589);
            }
            BBI.A0R(bbi, false);
            if (z) {
                bfm.AgE(-527380117);
                FeedUnitRowKt.FeedVideoControlButton(R.drawable.media_play_wght400_filled_24, C10G.A07(bs0, FeedUnitRowKt.CarouselPlayButtonSize), bfm, 48, 0);
            } else {
                bfm.AgE(-527172541);
            }
            AnonymousClass003.A0q(bbi);
            return;
        }
        bfm.Afo();
    }
}
