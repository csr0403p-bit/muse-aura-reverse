package X;

import android.util.Base64;

/* renamed from: X.Cg5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3874Cg5 {
    public final String toString() {
        C3867Cfw c3867Cfw = (C3867Cfw) this;
        String str = c3867Cfw.A01;
        Ce5 ce5 = c3867Cfw.A00;
        byte[] bArr = c3867Cfw.A02;
        return String.format("TransportContext(%s, %s, %s)", str, ce5, bArr == null ? "" : Base64.encodeToString(bArr, 2));
    }
}
