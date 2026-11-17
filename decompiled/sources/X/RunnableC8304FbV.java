package X;

import com.facebook.acra.util.minidump.MinidumpReader;

/* renamed from: X.FbV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8304FbV implements Runnable {
    public static final String __redex_internal_original_name = "AppCompatDelegateImpl$1";
    public final /* synthetic */ LayoutInflaterFactory2C8250FaT A00;

    public RunnableC8304FbV(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        this.A00 = layoutInflaterFactory2C8250FaT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = this.A00;
        if ((layoutInflaterFactory2C8250FaT.A01 & 1) != 0) {
            layoutInflaterFactory2C8250FaT.A0S(0);
        }
        if ((layoutInflaterFactory2C8250FaT.A01 & 4096) != 0) {
            layoutInflaterFactory2C8250FaT.A0S(MinidumpReader.MODULE_FULL_SIZE);
        }
        layoutInflaterFactory2C8250FaT.A0Y = false;
        layoutInflaterFactory2C8250FaT.A01 = 0;
    }
}
