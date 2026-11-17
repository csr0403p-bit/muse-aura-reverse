package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AttachmentUrisSaver$2 extends AbstractC7559F3s implements G0U<List<? extends String>, List<? extends Uri>> {
    public static final AuraBugReportScreenKt$AttachmentUrisSaver$2 INSTANCE = new AuraBugReportScreenKt$AttachmentUrisSaver$2();

    public AuraBugReportScreenKt$AttachmentUrisSaver$2() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<Uri> invoke2(List<String> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(Uri.parse(AnonymousClass005.A0j(it)));
        }
        return arrayListA0i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ List<? extends Uri> invoke(List<? extends String> list) {
        return invoke2((List<String>) list);
    }
}
