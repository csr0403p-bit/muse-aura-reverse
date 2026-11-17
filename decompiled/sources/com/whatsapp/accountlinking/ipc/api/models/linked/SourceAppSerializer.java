package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.AnonymousClass003;
import X.C07669ib;
import X.C7384Etj;
import X.C9hr;
import X.C9iY;
import X.C9iZ;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class SourceAppSerializer implements C9hr<SourceApp> {
    public static final SourceAppSerializer A00 = new SourceAppSerializer();
    public static final C9iZ A01 = C9iY.A05("SourceApp", C07669ib.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        String strA8e = interfaceC07829iw.A8e();
        for (SourceApp sourceApp : SourceApp.values()) {
            if (sourceApp.name().equals(strA8e)) {
                return sourceApp;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        SourceApp sourceApp = (SourceApp) obj;
        AnonymousClass003.A0u(interfaceC07789is, sourceApp);
        interfaceC07789is.AAU(sourceApp.name());
    }
}
