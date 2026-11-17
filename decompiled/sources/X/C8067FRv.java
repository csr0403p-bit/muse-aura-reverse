package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;

/* renamed from: X.FRv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8067FRv implements InterfaceC8065FRt {
    public final int A00;
    public final int A01;
    public final ClipData A02;
    public final Uri A03;
    public final Bundle A04;

    @Override // X.InterfaceC8065FRt
    public final ClipData ADj() {
        return this.A02;
    }

    @Override // X.InterfaceC8065FRt
    public final int AFl() {
        return this.A00;
    }

    @Override // X.InterfaceC8065FRt
    public final Uri AH6() {
        return this.A03;
    }

    @Override // X.InterfaceC8065FRt
    public final int AKn() {
        return this.A01;
    }

    @Override // X.InterfaceC8065FRt
    public final ContentInfo AMo() {
        return null;
    }

    @Override // X.InterfaceC8065FRt
    public final Bundle getExtras() {
        return this.A04;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ContentInfoCompat{clip=");
        sbA0x.append(this.A02.getDescription());
        sbA0x.append(C8j2.A00(13));
        int i = this.A01;
        sbA0x.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
        sbA0x.append(", flags=");
        int i2 = this.A00;
        sbA0x.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        Uri uri = this.A03;
        sbA0x.append(uri == null ? "" : FGI.A0I(", hasLinkUri(", uri.toString().length(), ")"));
        return AbstractC7610F5x.A0w(this.A04 != null ? ", hasExtras" : "", sbA0x);
    }

    public C8067FRv(C8068FRw c8068FRw) {
        ClipData clipData = c8068FRw.A02;
        clipData.getClass();
        this.A02 = clipData;
        int i = c8068FRw.A01;
        BeS.A04(PhotosSearchHandlerKt.PARAM_SOURCE, i, 0, 5);
        this.A01 = i;
        int i2 = c8068FRw.A00;
        if ((i2 & 1) != i2) {
            throw FGI.A01("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
        }
        this.A00 = i2;
        this.A03 = c8068FRw.A03;
        this.A04 = c8068FRw.A04;
    }
}
