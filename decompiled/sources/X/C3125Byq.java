package X;

import android.net.Uri;
import androidx.media3.common.util.Util;
import java.io.InputStream;

/* renamed from: X.Byq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3125Byq implements InterfaceC3126Byr<Long> {
    @Override // X.InterfaceC3126Byr
    public final /* bridge */ /* synthetic */ Long AXb(Uri uri, InputStream inputStream) {
        return Long.valueOf(Util.A0E(BV5.A0J(inputStream).readLine()));
    }
}
