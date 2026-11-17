package com.facebook.aura.crashreporting;

import X.AbstractC2258BHp;
import X.AbstractC3287C9e;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3286C9d;
import X.C4S;
import X.C4T;
import X.C60N;
import X.C60R;
import X.C7384Etj;
import X.C9N;
import X.C9Y;
import X.C9g;
import X.CFK;
import android.net.Uri;
import java.io.File;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes5.dex */
public final class AuraBugReportSender extends C9Y {
    public final C9g endpointSelector;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C9Y
    public void processParamsForAttachment(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        map.put("bug_id", AbstractC2258BHp.A0L("id", map));
        map.remove("id");
    }

    @Override // X.C9Y, X.C4U
    public boolean send(String str, File file, C4S c4s, Map<String, File> map, int i, C4T c4t) {
        AnonymousClass002.A1B(c4s, 2, map);
        C7384Etj.A0Y(c4t, 5);
        CFK.A05(C60N.A00(42), "send()");
        Properties propertiesACk = c4s.ACk();
        C7384Etj.A0U(propertiesACk);
        return sendImpl(propertiesACk, map, i, c4t);
    }

    private final boolean sendImpl(Properties properties, Map<String, File> map, int i, C4T c4t) {
        return doSend(properties, map, i, c4t, C60R.A0b(new Uri.Builder().scheme("https").authority(this.endpointSelector.facebookAuthority("ar"))), true);
    }

    @Override // X.C9Y
    public String getAttachmentEndpoint() {
        return "bug_attachments";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportSender(AbstractC3287C9e abstractC3287C9e, String str, String str2, String str3, String str4, int i, C9N<C3286C9d> c9n, C9g c9g) {
        super(abstractC3287C9e, str, str2, str3, str4, Integer.valueOf(i), c9n);
        AnonymousClass005.A17(abstractC3287C9e, str, str2, str3, str4);
        C7384Etj.A0Y(c9g, 7);
        this.endpointSelector = c9g;
    }
}
