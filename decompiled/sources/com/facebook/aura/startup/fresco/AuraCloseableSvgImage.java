package com.facebook.aura.startup.fresco;

import X.AbstractC7065EfC;
import X.C7384Etj;
import X.HBA;

/* loaded from: classes5.dex */
public final class AuraCloseableSvgImage extends AbstractC7065EfC {
    public boolean closed;
    public final int sizeInBytes;
    public final HBA svg;

    public AuraCloseableSvgImage(HBA hba, int i) {
        C7384Etj.A0Y(hba, 0);
        this.svg = hba;
        this.sizeInBytes = i;
    }

    @Override // X.InterfaceC7064EfB, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    @Override // X.InterfaceC7064EfB, X.C2eL
    public int getHeight() {
        return AuraSvgSupportKt.documentSize(this.svg, false);
    }

    @Override // X.InterfaceC7064EfB
    public int getSizeInBytes() {
        return this.sizeInBytes;
    }

    public final HBA getSvg() {
        return this.svg;
    }

    @Override // X.InterfaceC7064EfB, X.C2eL
    public int getWidth() {
        return AuraSvgSupportKt.documentSize(this.svg, true);
    }

    @Override // X.InterfaceC7064EfB
    public boolean isClosed() {
        return this.closed;
    }
}
