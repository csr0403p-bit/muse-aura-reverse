package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.FRy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8070FRy implements InterfaceC8065FRt {
    public final ContentInfo A00;

    @Override // X.InterfaceC8065FRt
    public final ClipData ADj() {
        return this.A00.getClip();
    }

    @Override // X.InterfaceC8065FRt
    public final int AFl() {
        return this.A00.getFlags();
    }

    @Override // X.InterfaceC8065FRt
    public final Uri AH6() {
        return this.A00.getLinkUri();
    }

    @Override // X.InterfaceC8065FRt
    public final int AKn() {
        return this.A00.getSource();
    }

    @Override // X.InterfaceC8065FRt
    public final ContentInfo AMo() {
        return this.A00;
    }

    @Override // X.InterfaceC8065FRt
    public final Bundle getExtras() {
        return this.A00.getExtras();
    }

    public final String toString() {
        return BV8.A0v(this.A00, C60O.A0x("ContentInfoCompat{"));
    }

    public C8070FRy(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.A00 = contentInfo;
    }
}
