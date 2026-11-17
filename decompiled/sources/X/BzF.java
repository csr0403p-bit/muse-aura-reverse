package X;

import com.facebook.crudolib.prefs.LightSharedPreferencesImpl;

/* loaded from: classes5.dex */
public final class BzF implements Runnable {
    public static final String __redex_internal_original_name = "LightSharedPreferencesImpl$notifyListeners$1";
    public final /* synthetic */ InterfaceC3137BzH A00;
    public final /* synthetic */ LightSharedPreferencesImpl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Throwable A03;

    public BzF(InterfaceC3137BzH interfaceC3137BzH, LightSharedPreferencesImpl lightSharedPreferencesImpl, String str, Throwable th) {
        this.A01 = lightSharedPreferencesImpl;
        this.A03 = th;
        this.A00 = interfaceC3137BzH;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LightSharedPreferencesImpl lightSharedPreferencesImpl = this.A01;
        lightSharedPreferencesImpl.A01 = this.A03;
        this.A00.onSharedPreferenceChanged(lightSharedPreferencesImpl, this.A02);
    }
}
