package com.facebook.aura.spaces.menu;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.BLG;
import X.C06H;
import X.C0953AJg;
import X.C1BN;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import X.InterfaceC0962AJp;
import X.InterfaceC7549F2g;
import com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint;
import java.util.Map;

/* loaded from: classes.dex */
public final class SpaceOpenOrigins implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final BLG<InterfaceC0962AJp<String, HatchSpaceEntryPoint>> _origins;
    public final C1BN<Map<String, HatchSpaceEntryPoint>> origins;

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._origins.Af8(C0953AJg.A00());
    }

    public final C1BN<Map<String, HatchSpaceEntryPoint>> getOrigins() {
        return this.origins;
    }

    public final class Companion {
        public final SpaceOpenOrigins getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (SpaceOpenOrigins) abstractC3358CGz.A03(SpaceOpenOrigins.class, SpaceOpenOrigins$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void record(String str, HatchSpaceEntryPoint hatchSpaceEntryPoint) {
        InterfaceC0962AJp<String, HatchSpaceEntryPoint> value;
        AnonymousClass003.A0u(str, hatchSpaceEntryPoint);
        BLG<InterfaceC0962AJp<String, HatchSpaceEntryPoint>> blg = this._origins;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, value.AYj(str, hatchSpaceEntryPoint)));
    }

    public final void take(String str, HatchSpaceEntryPoint hatchSpaceEntryPoint) {
        InterfaceC0962AJp<String, HatchSpaceEntryPoint> value;
        InterfaceC0962AJp<String, HatchSpaceEntryPoint> interfaceC0962AJpAaZ;
        AnonymousClass003.A0u(str, hatchSpaceEntryPoint);
        BLG<InterfaceC0962AJp<String, HatchSpaceEntryPoint>> blg = this._origins;
        do {
            value = blg.getValue();
            interfaceC0962AJpAaZ = value;
            if (interfaceC0962AJpAaZ.get(str) == hatchSpaceEntryPoint) {
                interfaceC0962AJpAaZ = interfaceC0962AJpAaZ.AaZ(str);
            }
        } while (!blg.A6e(value, interfaceC0962AJpAaZ));
    }

    public /* synthetic */ SpaceOpenOrigins(C06H c06h) {
        this();
    }

    public SpaceOpenOrigins() {
        C9286GCn c9286GCnA01 = HnJ.A01(C0953AJg.A00());
        this._origins = c9286GCnA01;
        this.origins = c9286GCnA01;
    }
}
