package X;

import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Map;

/* renamed from: X.DnK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5681DnK implements Do0 {
    public boolean A00;
    public final AbrContextAwareConfiguration A01;
    public final InterfaceC5683DnM A02;
    public final Do0 A03;
    public final String A04;

    /* JADX WARN: Incorrect types in method signature: (LX/DoP;[LX/Dwx;Ljava/util/Map<Ljava/lang/String;LX/Dil;>;LX/Dwx;IILX/DnY;)LX/Drg; */
    @Override // X.Do0
    public final C5899Drg AAt(C6154Dwx c6154Dwx, C5730DoP c5730DoP, C5691DnY c5691DnY, Map map, C6154Dwx[] c6154DwxArr, int i, int i2) {
        String strA00;
        this.A00 = false;
        int length = c6154DwxArr.length;
        for (C6154Dwx c6154Dwx2 : c6154DwxArr) {
            String str = Dl5.A00(c6154Dwx2).A05;
            if (str != null && str.contains(this.A04)) {
                InterfaceC5683DnM interfaceC5683DnM = this.A02;
                interfaceC5683DnM.A3I(EnumC5684DnO.A02);
                if (length != 0 && AbstractC5655Dmj.A02(c6154DwxArr[0])) {
                    C5686DnS c5686DnS = this.A01.abrSetting;
                    if (c5686DnS.enableCdnDebugHeadersExtended && c5686DnS.enableCdnDebugHeadersAudioMos && (strA00 = DnN.A00(c5691DnY, c6154DwxArr)) != null) {
                        interfaceC5683DnM.A3O(strA00);
                    }
                }
                return C5899Drg.A00(c6154Dwx2);
            }
        }
        this.A00 = true;
        this.A02.A3I(EnumC5684DnO.A03);
        return this.A03.AAt(c6154Dwx, c5730DoP, c5691DnY, map, c6154DwxArr, i, i2);
    }

    @Override // X.Do0
    public final void A6b(C6154Dwx c6154Dwx) {
        if (this.A00) {
            this.A00 = false;
            this.A03.A6b(c6154Dwx);
        }
    }

    @Override // X.Do0
    public final boolean AOT() {
        return false;
    }

    @Override // X.Do0
    public final boolean Afa() {
        return false;
    }

    public C5681DnK(Do0 do0, AbrContextAwareConfiguration abrContextAwareConfiguration, InterfaceC5683DnM interfaceC5683DnM, String str) {
        this.A02 = interfaceC5683DnM;
        this.A01 = abrContextAwareConfiguration;
        this.A04 = str;
        this.A03 = do0;
    }
}
