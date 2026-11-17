package X;

import com.google.android.gms.wearable.Channel;

/* renamed from: X.Cap, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3638Cap implements InterfaceC3987Ciw {
    public final C3639Cas A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C3638Cap) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC3987Ciw
    public final void onChannelClosed(Channel channel, int i, int i2) {
        CRy.A04(channel, "channel must not be null");
    }

    @Override // X.InterfaceC3987Ciw
    public final void onChannelOpened(Channel channel) {
        CRy.A04(channel, "channel must not be null");
    }

    @Override // X.InterfaceC3987Ciw
    public final void onInputClosed(Channel channel, int i, int i2) {
        CRy.A04(channel, "channel must not be null");
    }

    @Override // X.InterfaceC3987Ciw
    public final void onOutputClosed(Channel channel, int i, int i2) {
        CRy.A04(channel, "channel must not be null");
    }

    public C3638Cap(C3639Cas c3639Cas) {
        this.A00 = c3639Cas;
    }
}
