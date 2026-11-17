package com.facebook.aura.composer.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B18;
import X.B1T;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C1SA;
import X.C2VU;
import X.C3U4;
import X.C90l;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.composer.util.ThumbnailResult;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$PendingFilePreview$5$1 extends AbstractC7559F3s implements G0W<ThumbnailResult, BFM, Integer, Unit> {
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ String $fileNameWithoutExtension;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$PendingFilePreview$5$1(String str, String str2) {
        super(3);
        this.$fileName = str;
        this.$fileNameWithoutExtension = str2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ThumbnailResult thumbnailResult, BFM bfm, Integer num) {
        invoke(thumbnailResult, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ThumbnailResult thumbnailResult, BFM bfm, int i) {
        if (thumbnailResult != null) {
            bfm.AgE(1641405296);
            C1SA.A01(bfm, null, C10G.A01, new B1T(thumbnailResult.bitmap), B18.A00, this.$fileName, 24960, 232);
        } else {
            bfm.AgE(1641628372);
            BS0 bs0 = BRg.A00;
            BRg bRgA09 = C3U4.A09(C10G.A01, 8.0f);
            String str = this.$fileNameWithoutExtension;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C01N.A07(bfm, C90l.A00.AiP(bs0, 1.0f, true));
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0S(bfm), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        }
        AnonymousClass002.A19(bfm);
    }
}
