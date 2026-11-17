package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.PowerManager;
import com.facebook.analytics2.logger.interfaces.IllegalRemoteArgumentException;
import com.facebook.common.build.BuildConstants;
import java.util.List;

/* renamed from: X.Ckx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4054Ckx {
    public static List<Handler> A09;
    public PowerManager.WakeLock A00;
    public InterfaceC4069ClG A01;
    public final int A02;
    public final Context A03;
    public final Bundle A04;
    public final Messenger A05;
    public final C4045Cko A06;
    public final Cl7 A07;
    public final String A08;

    public static C4054Ckx A00(Context context, Bundle bundle) {
        Messenger messenger = (Messenger) bundle.getParcelable("_messenger");
        Bundle bundle2 = bundle.getBundle("_extras");
        String string = bundle.getString("_hack_action");
        int i = bundle.getInt("_job_id", -1);
        if (i == -1) {
            throw new IllegalRemoteArgumentException(C8j3.A14(bundle.get("_job_id"), C60O.A0x("_job_id is ")));
        }
        Bundle bundle3 = bundle.getBundle("_fallback_config");
        return new C4054Ckx(context, bundle2, messenger, new C4045Cko(bundle.getBundle("_upload_job_config")), bundle3 != null ? new Cl7(bundle3.getLong("min_delay_ms", -1L), bundle3.getLong("max_delay_ms", -1L), bundle3.getString("action")) : null, string, i);
    }

    public C4054Ckx(Context context, Bundle bundle, Messenger messenger, C4045Cko c4045Cko, Cl7 cl7, String str, int i) {
        this.A05 = messenger;
        this.A04 = bundle;
        this.A08 = str;
        this.A06 = c4045Cko;
        this.A02 = i;
        this.A03 = context;
        this.A07 = cl7;
    }

    public final Bundle A01() {
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putParcelable("_messenger", this.A05);
        bundleA0N.putBundle("_extras", this.A04);
        bundleA0N.putString("_hack_action", this.A08);
        C4045Cko c4045Cko = this.A06;
        C4059Cl2 c4059Cl2 = new C4059Cl2(BV6.A0N());
        String str = c4045Cko.A0C;
        Bundle bundle = c4059Cl2.A00;
        bundle.putString("uploader_class", str);
        C4045Cko.A00(bundle, c4045Cko);
        InterfaceC4014Cju interfaceC4014Cju = c4045Cko.A02;
        bundle.putString("upload_extra_params_user_id", interfaceC4014Cju != null ? ((C4068ClF) interfaceC4014Cju).A00 : null);
        bundleA0N.putBundle("_upload_job_config", new Bundle(bundle));
        bundleA0N.putInt("_job_id", this.A02);
        Cl7 cl7 = this.A07;
        if (cl7 != null) {
            Bundle bundleA0N2 = BV6.A0N();
            bundleA0N2.putLong("min_delay_ms", cl7.A01);
            bundleA0N2.putLong("max_delay_ms", cl7.A00);
            bundleA0N2.putString("action", cl7.A02);
            bundleA0N2.putInt("__VERSION_CODE", BuildConstants.A01());
            bundleA0N.putBundle("_fallback_config", bundleA0N2);
        }
        return bundleA0N;
    }
}
