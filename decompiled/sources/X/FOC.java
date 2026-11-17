package X;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class FOC implements Dg5 {
    public final /* synthetic */ FOB A00;

    public FOC(FOB fob) {
        this.A00 = fob;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dg5
    public final void onCreate(C1HY c1hy) {
        FND fndValueOf;
        FOB fob = this.A00;
        Bundle bundle = fob.A03.mArguments;
        if (bundle == null) {
            throw C3cG.A0Q("Arguments should not be null!");
        }
        String string = bundle.getString("cds_platform");
        if (string == null || (fndValueOf = FND.valueOf(string)) == null) {
            throw C3cG.A0Q("Platform is missing from the bundle. Please check that 'cds_platform' field is set.");
        }
        fob.A02 = fndValueOf;
        HxE hxEA00 = FOB.A00(fob, fndValueOf);
        FOA foa = (FOA) hxEA00.first;
        FOD fod = (FOD) hxEA00.second;
        fob.A01 = foa;
        FOF.A00.A01();
        if (fob.A02 == null) {
            C7384Etj.A0b("currentType");
            throw F60.createAndThrow();
        }
        String str = (String) C7384Etj.A0G(FNW.A00);
        if (!str.equals("DEFAULT")) {
            throw AbstractC7610F5x.A0o(str);
        }
        C5303Dfm c5303Dfm = fod.A00;
        fob.A00 = c5303Dfm;
        if (c5303Dfm == null) {
            C7384Etj.A0b("lifecycle");
            throw F60.createAndThrow();
        }
        c5303Dfm.A07(EnumC10573Huf.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dg5
    public final void onDestroy(C1HY c1hy) {
        Iterator itA10 = BV5.A10(this.A00.A04);
        while (itA10.hasNext()) {
            HxE hxEA10 = C60Q.A10(itA10);
            if (((FOD) hxEA10.second).A00.A01.A00(EnumC10573Huf.A02)) {
                ((FOD) hxEA10.second).A00.A07(EnumC10573Huf.A03);
            }
        }
    }

    @Override // X.Dg5
    public final void onPause(C1HY c1hy) {
        C5303Dfm c5303Dfm = this.A00.A00;
        if (c5303Dfm == null) {
            C7384Etj.A0b("lifecycle");
            throw F60.createAndThrow();
        }
        c5303Dfm.A07(EnumC10573Huf.A06);
    }

    @Override // X.Dg5
    public final void onResume(C1HY c1hy) {
        C5303Dfm c5303Dfm = this.A00.A00;
        if (c5303Dfm == null) {
            C7384Etj.A0b("lifecycle");
            throw F60.createAndThrow();
        }
        c5303Dfm.A07(EnumC10573Huf.A05);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dg5
    public final void onStart(C1HY c1hy) {
        Iterator itA10 = BV5.A10(this.A00.A04);
        while (itA10.hasNext()) {
            ((FOD) C60Q.A10(itA10).second).A00.A07(EnumC10573Huf.A06);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dg5
    public final void onStop(C1HY c1hy) {
        Iterator itA10 = BV5.A10(this.A00.A04);
        while (itA10.hasNext()) {
            ((FOD) C60Q.A10(itA10).second).A00.A07(EnumC10573Huf.A02);
        }
    }
}
