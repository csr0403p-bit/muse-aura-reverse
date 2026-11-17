package com.facebook.aura.file.view;

import X.AbstractC7202EiH;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.BYN;
import X.C0Yr;
import X.C3cG;
import X.C7184Ehu;
import X.C7189Ei0;
import X.C7197Ei9;
import X.C78g;
import X.C79;
import X.C7Je;
import X.EjN;
import X.EnumC7203EiK;
import X.G0U;
import X.InterfaceC7146EhC;
import X.InterfaceC7236Ej0;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class MediaViewerContentKt$MediaViewerContent$6$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ List<String> $adjacentImageUris;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerContent$6$1(List<String> list) {
        super(1);
        this.$adjacentImageUris = list;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        InterfaceC7146EhC interfaceC7146EhCA01 = EjN.A01();
        List<String> list = this.$adjacentImageUris;
        final ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(AnonymousClass005.A0j(it));
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null) {
                C7189Ei0 c7189Ei0 = (C7189Ei0) interfaceC7146EhCA01;
                C7197Ei9 c7197Ei9 = C7197Ei9.A0P;
                C7184Ehu c7184Ehu = new C7184Ehu();
                c7184Ehu.A02 = uriA01;
                EnumC7203EiK enumC7203EiK = ((AbstractC7202EiH) c7197Ei9).A00;
                if (enumC7203EiK != null) {
                    c7184Ehu.A05 = enumC7203EiK;
                }
                BYN byn = ((AbstractC7202EiH) c7197Ei9).A01;
                if (byn != null) {
                    c7184Ehu.A0A = byn;
                }
                String str = ((AbstractC7202EiH) c7197Ei9).A02;
                if (str != null) {
                    c7184Ehu.A0G = str;
                }
                arrayListA0h.add(C7189Ei0.A00(c7189Ei0, c7184Ehu.A01(), C79.A0C, MediaViewerContentKt.ADJACENT_PREFETCH_CALLER_CONTEXT, null));
            }
        }
        return new C78g() { // from class: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$6$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC7236Ej0) it2.next()).A6Q();
                }
            }
        };
    }
}
