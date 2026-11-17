package X;

import android.content.SharedPreferences;
import com.facebook.aura.bloks.fbpay.pttprovider.AuraFBPayExecutors;
import com.facebook.aura.bloks.fbpay.pttprovider.NoopAuthTicketApi;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class EVa {
    public final SharedPreferences A00;
    public final String A01;
    public final F3H A02;
    public final EVb A03;
    public final List<EWA> A04 = new CopyOnWriteArrayList();

    public EVa(SharedPreferences sharedPreferences, AuraFBPayExecutors auraFBPayExecutors, NoopAuthTicketApi noopAuthTicketApi, F3H f3h, String str) {
        this.A01 = str;
        this.A02 = f3h;
        this.A00 = sharedPreferences;
        this.A03 = new EVb(auraFBPayExecutors, noopAuthTicketApi, this);
    }
}
