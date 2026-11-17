package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.maplibre.android.maps.AttributionDialogManager;
import org.maplibre.android.maps.MapLibreMap;

/* loaded from: classes4.dex */
public final class BE4 extends AttributionDialogManager {
    public final Context A00;
    public final ALJ A01;

    public static final /* synthetic */ void A00(BE4 be4, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", C7Je.A01(str));
        Context context = be4.A00;
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            C7mU.A00().A04().A05(context, intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final void onClick(View view) {
        Context context = this.A00;
        Context baseContext = context;
        while (!(baseContext instanceof Activity)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            C7384Etj.A0U(baseContext);
        }
        Activity activity = (Activity) baseContext;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        ALJ alj = this.A01;
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(alj.A04, Arrays.asList(new BE6(context.getString(R.string._name_removed__res_0x7f1206be), "https://www.openstreetmap.org/copyright"), new BE6(context.getString(R.string._name_removed__res_0x7f1206bd), "https://www.facebook.com/maps/attribution_terms/")));
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0P);
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((BE6) it.next()).A00);
        }
        String[] strArr = (String[]) arrayListA0i.toArray(new String[0]);
        int iA00 = DialogInterfaceC8226FZy.A00(activity, 0);
        C8229Fa1 c8229Fa1 = new C8229Fa1(new ContextThemeWrapper(activity, DialogInterfaceC8226FZy.A00(activity, iA00)));
        c8229Fa1.A09 = context.getString(R.string._name_removed__res_0x7f1206bc);
        BE5 be5 = new BE5(this, arrayListA0P);
        c8229Fa1.A0B = strArr;
        c8229Fa1.A02 = be5;
        AbstractC8228Fa0.A00(c8229Fa1, iA00).show();
    }

    public BE4(Context context, ALJ alj, MapLibreMap mapLibreMap) {
        super(context, mapLibreMap);
        this.A00 = context;
        this.A01 = alj;
    }
}
