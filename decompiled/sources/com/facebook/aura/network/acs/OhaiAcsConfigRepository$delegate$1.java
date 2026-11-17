package com.facebook.aura.network.acs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.acs.OhaiAcsConfigRepository$delegate$1", f = "OhaiAcsConfigRepository.kt", l = {55}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class OhaiAcsConfigRepository$delegate$1 extends AbstractC07127nr implements G0U<HtJ<? super FetchedOhaiAcsConfig>, Object> {
    public int label;

    public OhaiAcsConfigRepository$delegate$1(HtJ<? super OhaiAcsConfigRepository$delegate$1> htJ) {
        super(1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new OhaiAcsConfigRepository$delegate$1(htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super FetchedOhaiAcsConfig> htJ) {
        return new OhaiAcsConfigRepository$delegate$1(htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            OhaiAcsConfigFetcher ohaiAcsConfigFetcher = OhaiAcsConfigRepository.fetcher;
            this.label = 1;
            obj = ohaiAcsConfigFetcher.fetch(this);
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
}
