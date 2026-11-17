package androidx.work.impl;

import X.AbstractC6554EEq;
import X.C0861A6i;
import X.C0881AGi;
import X.C3cG;
import X.C5322DgG;
import X.C6639ELj;
import X.C6640ELk;
import X.C6641ELl;
import X.C6642ELm;
import X.C6643ELn;
import X.C7589F5c;
import X.C9uG;
import X.EII;
import X.EIN;
import X.EIR;
import X.EKQ;
import X.EL5;
import X.ELG;
import X.ELH;
import X.ELU;
import X.ELX;
import X.EMT;
import X.EMw;
import X.EN0;
import X.EN5;
import X.ENC;
import X.ENO;
import X.F0C;
import X.InterfaceC6590EIi;
import X.InterfaceC6658EMq;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public final F0C<EL5> A06 = new C5322DgG(null, new C7589F5c(this, 13));
    public final F0C<InterfaceC6658EMq> A00 = EIN.A00(this, 14);
    public final F0C<EN0> A07 = EIN.A00(this, 15);
    public final F0C<EMw> A03 = EIN.A00(this, 16);
    public final F0C<ENO> A04 = EIN.A00(this, 17);
    public final F0C<ENC> A05 = EIN.A00(this, 18);
    public final F0C<EMT> A01 = EIN.A00(this, 19);
    public final F0C<EII> A02 = EIN.A00(this, 20);

    @Override // X.EIN
    public final void clearAllTables() {
        performClear(true, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // X.EIN
    public final /* bridge */ /* synthetic */ InterfaceC6590EIi createOpenDelegate() {
        return new EKQ(this);
    }

    @Override // X.EIN
    public final List<AbstractC6554EEq> createAutoMigrations(Map<C9uG<? extends EN5>, ? extends EN5> map) {
        ArrayList arrayListA0h = C3cG.A0h();
        arrayListA0h.add(new ELX());
        arrayListA0h.add(new ELG());
        arrayListA0h.add(new ELU());
        arrayListA0h.add(new C6639ELj());
        arrayListA0h.add(new C6640ELk());
        arrayListA0h.add(new ELH());
        arrayListA0h.add(new C6641ELl());
        arrayListA0h.add(new C6642ELm());
        arrayListA0h.add(new C6643ELn());
        return arrayListA0h;
    }

    @Override // X.EIN
    public final EIR createInvalidationTracker() {
        return new EIR(this, C3cG.A0j(), C3cG.A0j(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // X.EIN
    public final Set<C9uG<? extends EN5>> getRequiredAutoMigrationSpecClasses() {
        return C3cG.A0k();
    }

    @Override // X.EIN
    public final Map<C9uG<?>, List<C9uG<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        C0861A6i c0861A6i = new C0861A6i(EL5.class);
        C0881AGi c0881AGi = C0881AGi.A00;
        linkedHashMapA0j.put(c0861A6i, c0881AGi);
        EIN.A01(InterfaceC6658EMq.class, c0881AGi, linkedHashMapA0j);
        EIN.A01(EN0.class, c0881AGi, linkedHashMapA0j);
        EIN.A01(EMw.class, c0881AGi, linkedHashMapA0j);
        EIN.A01(ENO.class, c0881AGi, linkedHashMapA0j);
        EIN.A01(ENC.class, c0881AGi, linkedHashMapA0j);
        EIN.A01(EMT.class, c0881AGi, linkedHashMapA0j);
        EIN.A01(EII.class, c0881AGi, linkedHashMapA0j);
        return linkedHashMapA0j;
    }
}
