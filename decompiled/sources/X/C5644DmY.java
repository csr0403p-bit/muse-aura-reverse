package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.DmY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5644DmY implements DFB<C5580Dky> {
    public final /* synthetic */ C5615Dlu A00;

    public C5644DmY(C5615Dlu c5615Dlu) {
        this.A00 = c5615Dlu;
    }

    @Override // X.DFB
    public final /* bridge */ /* synthetic */ void AVu(C5580Dky c5580Dky) {
        String strA08;
        C5580Dky c5580Dky2 = c5580Dky;
        C5615Dlu c5615Dlu = this.A00;
        if (c5580Dky2 != null) {
            if (((C5580Dky.A00(c5580Dky2) <= 0 || C5580Dky.A06(c5580Dky2) || C5580Dky.A03(c5580Dky2).A0C.isEmpty()) && (!(c5580Dky2.A0Y && c5615Dlu.A0k.enableUsingASRCaptions) && C5615Dlu.A08(c5580Dky2) == null)) || !c5615Dlu.A08.A0E().A01.get(2)) {
                return;
            }
            HeroPlayerSetting heroPlayerSetting = c5615Dlu.A0k;
            if (heroPlayerSetting.disableLiveCaptioningOnPlayerInit) {
                return;
            }
            C6137Dwf c6137DwfA01 = AbstractC5736DoV.A01(c5615Dlu);
            c6137DwfA01.A07(2, false);
            if (c5580Dky2.A0Y && heroPlayerSetting.enableUsingASRCaptions && (strA08 = C5615Dlu.A08(c5580Dky2)) != null && !"default".equals(strA08)) {
                c6137DwfA01.A06(strA08);
                c5615Dlu.A0e.A1U(new BeN(Collections.singletonList(strA08), strA08, true));
            }
            DoW.A06(new C6136Dwe(c6137DwfA01), c5615Dlu.A08);
        }
    }

    @Override // X.DFB
    public final void AVv(IOException iOException) {
    }
}
