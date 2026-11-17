package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CJN {
    public static C3381CIn A00(Bundle bundle) {
        int i = bundle.getInt("session_id");
        int i2 = bundle.getInt(AuraDeeplinkRouteMapper.STATUS_ROUTE);
        int i3 = bundle.getInt("error_code");
        long j = bundle.getLong("bytes_downloaded");
        long j2 = bundle.getLong("total_bytes_to_download");
        return new C3381CIn((PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), bundle.getParcelableArrayList("split_file_intents"), i, i2, i3, j, j2);
    }

    public final List<String> A01() {
        List list = ((C3381CIn) this).A06;
        return list != null ? BV4.A0t(list) : C3cG.A0h();
    }
}
