package X;

import android.webkit.ValueCallback;

/* renamed from: X.EnI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7345EnI implements ValueCallback<String> {
    public final /* synthetic */ EnH A00;
    public final /* synthetic */ BZ1 A01;

    public C7345EnI(EnH enH, BZ1 bz1) {
        this.A00 = enH;
        this.A01 = bz1;
    }

    @Override // android.webkit.ValueCallback
    public final /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        this.A01.A00.put(this.A00.A04, str);
    }
}
