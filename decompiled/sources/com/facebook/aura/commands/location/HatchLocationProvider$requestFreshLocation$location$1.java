package com.facebook.aura.commands.location;

import X.AbstractC07127nr;
import X.AbstractC3001Brc;
import X.AnonymousClass001;
import X.C3511CRl;
import X.C3UX;
import X.C7384Etj;
import X.CSC;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC3519CRu;
import android.location.Location;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.location.HatchLocationProvider$requestFreshLocation$location$1", f = "HatchLocationProvider.kt", l = {220}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchLocationProvider$requestFreshLocation$location$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Location>, Object> {
    public final /* synthetic */ C3511CRl $cancellationSource;
    public final /* synthetic */ InterfaceC3519CRu $client;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLocationProvider$requestFreshLocation$location$1(InterfaceC3519CRu interfaceC3519CRu, C3511CRl c3511CRl, HtJ<? super HatchLocationProvider$requestFreshLocation$location$1> htJ) {
        super(2, htJ);
        this.$client = interfaceC3519CRu;
        this.$cancellationSource = c3511CRl;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchLocationProvider$requestFreshLocation$location$1(this.$client, this.$cancellationSource, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            CSC cscAET = this.$client.AET(this.$cancellationSource.A00, 100);
            C7384Etj.A0U(cscAET);
            this.label = 1;
            obj = AbstractC3001Brc.A00(cscAET, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Location> htJ) {
        return ((HatchLocationProvider$requestFreshLocation$location$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
