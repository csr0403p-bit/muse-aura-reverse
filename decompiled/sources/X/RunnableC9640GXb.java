package X;

/* renamed from: X.GXb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9640GXb implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioOutputManagerImpl$cleanAudioStates$1";
    public final /* synthetic */ GXE A00;

    public RunnableC9640GXb(GXE gxe) {
        this.A00 = gxe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            GXE gxe = this.A00;
            DYL dyl = (DYL) gxe.A09.getValue();
            if (dyl != null) {
                try {
                    dyl.A00.listen(gxe.A00, 0);
                } catch (IllegalStateException e) {
                    e = e;
                    str = "Failed to register listener due to exceeded limit: ";
                    CFK.A08("SafeTelephonyManager", str, e);
                } catch (NoSuchMethodError e2) {
                    e = e2;
                    str = "TelephonyManager.listen() not available on this device. The method was deprecated in API 31 and removed in API 35. Some OEM devices may also lack this method.";
                    CFK.A08("SafeTelephonyManager", str, e);
                } catch (NullPointerException e3) {
                    e = e3;
                    str = "A null pointer exception is thrown here because a SELinux 'find' permission is required to access the access an object in the telelphony registry. ";
                    CFK.A08("SafeTelephonyManager", str, e);
                } catch (SecurityException e4) {
                    e = e4;
                    str = "Listen: Caught Security Exception ";
                    CFK.A08("SafeTelephonyManager", str, e);
                }
            }
        } catch (IllegalStateException e5) {
            if (!this.A00.A08.enableCatchListenIllegalStateException()) {
                throw e5;
            }
        }
    }
}
