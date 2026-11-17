package X;

import androidx.media3.common.PlaybackException;

/* loaded from: classes5.dex */
public final class F50 implements E7R {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F50(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.E7R
    public final void ANx(Object obj) {
        switch (this.$t) {
            case 9:
                ((InterfaceC6481E7w) obj).ASb((C6202Dxm) this.A00, (C5893Dra) this.A01);
                break;
            case 10:
                ((InterfaceC6481E7w) obj).AUi((PlaybackException) this.A01);
                break;
            case 12:
                ((InterfaceC6481E7w) obj).ASn((Exception) this.A01);
                break;
            case 13:
                ((InterfaceC6481E7w) obj).AX7((C6173DxG) this.A01);
                break;
            case 15:
                ((InterfaceC6481E7w) obj).AXH((C6232Dya) this.A01);
                break;
        }
    }
}
