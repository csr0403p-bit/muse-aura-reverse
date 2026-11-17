package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.EDc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6530EDc {
    public static final void A00(InterfaceC6539EDu interfaceC6539EDu, EDW edw, File file) {
        C7384Etj.A0Y(file, 0);
        ArrayList arrayListA0t = BV4.A0t(edw.A02.values());
        if (arrayListA0t.isEmpty()) {
            return;
        }
        Iterator it = arrayListA0t.iterator();
        while (it.hasNext()) {
            EE9 ee9 = (EE9) it.next();
            InterfaceC6536EDr<EE9> interfaceC6536EDrControllerForPlugin = interfaceC6539EDu.controllerForPlugin(ee9);
            if (interfaceC6536EDrControllerForPlugin == null) {
                interfaceC6539EDu.onUnhandledPlugin(edw, ee9);
            } else {
                interfaceC6536EDrControllerForPlugin.onPathRequested(edw, ee9, file);
            }
        }
    }
}
