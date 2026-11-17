package X;

import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Map;

/* renamed from: X.DnZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5692DnZ implements Do0 {
    public final AbrContextAwareConfiguration A00;
    public final InterfaceC5683DnM A01;

    /* JADX WARN: Incorrect types in method signature: (LX/DoP;[LX/Dwx;Ljava/util/Map<Ljava/lang/String;LX/Dil;>;LX/Dwx;IILX/DnY;)LX/Drg; */
    @Override // X.Do0
    public final C5899Drg AAt(C6154Dwx c6154Dwx, C5730DoP c5730DoP, C5691DnY c5691DnY, Map map, C6154Dwx[] c6154DwxArr, int i, int i2) {
        if (c6154Dwx == null || this.A00.isThumbnail) {
            this.A01.A3I(EnumC5684DnO.A05);
            return C5899Drg.A00(c6154DwxArr[c6154DwxArr.length - 1]);
        }
        this.A01.A3I(EnumC5684DnO.A06);
        return C5899Drg.A00(c6154Dwx);
    }

    @Override // X.Do0
    public final boolean AOT() {
        return false;
    }

    @Override // X.Do0
    public final boolean Afa() {
        return false;
    }

    public C5692DnZ(AbrContextAwareConfiguration abrContextAwareConfiguration, InterfaceC5683DnM interfaceC5683DnM) {
        this.A01 = interfaceC5683DnM;
        this.A00 = abrContextAwareConfiguration;
    }

    @Override // X.Do0
    public final /* synthetic */ void A6b(C6154Dwx c6154Dwx) {
    }
}
