package X;

import android.os.Build;

/* loaded from: classes5.dex */
public final class CGZ extends AbstractC5636DmK {
    public CGZ() {
        super(null);
    }

    @Override // X.AbstractC5636DmK, X.InterfaceC5637DmL
    public final void configureMediaCodecForSDK35() {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC2985Bqu.A00 = CGY.A00;
        }
    }
}
