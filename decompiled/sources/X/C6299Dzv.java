package X;

import android.media.MediaFormat;

/* renamed from: X.Dzv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6299Dzv implements Dv4, InterfaceC6271DzO, InterfaceC6300Dzw {
    public InterfaceC6271DzO A00;
    public InterfaceC6300Dzw A01;

    @Override // X.Dv4
    public final void AN4(int i, Object obj) {
        if (i == 7) {
            this.A00 = (InterfaceC6271DzO) obj;
        } else if (i == 8) {
            this.A01 = (InterfaceC6300Dzw) obj;
        }
    }

    @Override // X.InterfaceC6271DzO
    public final void AX9(MediaFormat mediaFormat, C6154Dwx c6154Dwx, long j, long j2) {
        InterfaceC6271DzO interfaceC6271DzO = this.A00;
        if (interfaceC6271DzO != null) {
            interfaceC6271DzO.AX9(mediaFormat, c6154Dwx, j, j2);
        }
    }
}
