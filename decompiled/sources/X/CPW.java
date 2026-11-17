package X;

import com.facebook.pando.PandoError;
import com.facebook.pando.Summary;

/* loaded from: classes5.dex */
public interface CPW<T> {
    void onError(PandoError pandoError);

    void onUpdate(T t, Summary summary);

    static void A00(CPW cpw, String str, Throwable th) {
        C0881AGi c0881AGi = C0881AGi.A00;
        cpw.onError(new PandoError(str, "", "", (short) 0, "", 0, "", "", false, false, false, false, 0, "", "", false, c0881AGi, 0, c0881AGi, th));
    }
}
