package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.pando.TreeWithGraphQL;

/* loaded from: classes5.dex */
public final class DZP implements DZT, InterfaceC5114DZj {
    public final InterfaceC5114DZj A00;
    public final C5131DaF<?> A01;
    public final DZW A02;

    @Override // X.DZT
    public final DZW AJQ() {
        return this.A02;
    }

    @Override // X.DZT
    public final Class<? extends TreeJNI> AM5() {
        return TreeWithGraphQL.class;
    }

    @Override // X.DZT
    public final TreeUpdaterJNI AhP() {
        InterfaceC5114DZj interfaceC5114DZj = this.A00;
        DZT dzt = (DZT) interfaceC5114DZj;
        if (dzt != null) {
            return dzt.AhP();
        }
        throw C60Q.A0V("GraphNode updater ", C60Q.A0e(interfaceC5114DZj), " does not support tree interoperability.");
    }

    public DZP(InterfaceC5114DZj interfaceC5114DZj, C5131DaF c5131DaF) {
        this.A01 = c5131DaF;
        this.A00 = interfaceC5114DZj;
        this.A02 = new DZW(c5131DaF.A01.A01.scope.buildConfigName, ((C5130DaE) c5131DaF.A00).A00);
    }
}
