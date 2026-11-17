package X;

/* renamed from: X.COl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3463COl {
    public static InterfaceC3465COn A00;

    public static boolean loadLibrary(String str) {
        return loadLibrary(str, 0);
    }

    public static boolean loadLibrary(String str, int i) {
        InterfaceC3465COn interfaceC3465COn;
        synchronized (C3463COl.class) {
            interfaceC3465COn = A00;
            if (interfaceC3465COn == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC3465COn.APj(str, i);
    }
}
