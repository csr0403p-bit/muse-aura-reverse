package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1bi;
import X.C7384Etj;
import X.G0V;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AttachmentUrisSaver$1 extends AbstractC7559F3s implements G0V<C1bi, List<? extends Uri>, List<? extends String>> {
    public static final AuraBugReportScreenKt$AttachmentUrisSaver$1 INSTANCE = new AuraBugReportScreenKt$AttachmentUrisSaver$1();

    public AuraBugReportScreenKt$AttachmentUrisSaver$1() {
        super(2);
    }

    @Override // X.G0V
    public final List<String> invoke(C1bi c1bi, List<? extends Uri> list) {
        C7384Etj.A0Y(list, 1);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<? extends Uri> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toString());
        }
        return arrayListA0i;
    }
}
