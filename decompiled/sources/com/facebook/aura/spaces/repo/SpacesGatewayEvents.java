package com.facebook.aura.spaces.repo;

import X.AbstractC3358CGz;
import X.C06H;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.InterfaceC7549F2g;

/* loaded from: classes3.dex */
public final class SpacesGatewayEvents implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final C3Em<SpacesDataInvalidatedEvent> _dataInvalidated;
    public final C3Em<String> _updates;
    public final C22I<SpacesDataInvalidatedEvent> dataInvalidated;
    public final C22I<String> updates;

    public final void emitDataInvalidated$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(SpacesDataInvalidatedEvent spacesDataInvalidatedEvent) {
        C7384Etj.A0Y(spacesDataInvalidatedEvent, 0);
        this._dataInvalidated.AhV(spacesDataInvalidatedEvent);
    }

    public final void emitUpdate$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(String str) {
        C7384Etj.A0Y(str, 0);
        this._updates.AhV(str);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final C22I<SpacesDataInvalidatedEvent> getDataInvalidated() {
        return this.dataInvalidated;
    }

    public final C22I<String> getUpdates() {
        return this.updates;
    }

    public final class Companion {
        public final SpacesGatewayEvents getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (SpacesGatewayEvents) abstractC3358CGz.A03(SpacesGatewayEvents.class, SpacesGatewayEvents$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ SpacesGatewayEvents(C06H c06h) {
        this();
    }

    public SpacesGatewayEvents() {
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 8);
        this._updates = c9290GCrA12;
        this.updates = C3pd.A00(c9290GCrA12);
        C9290GCr c9290GCrA122 = C3cG.A12(num, 0, 4);
        this._dataInvalidated = c9290GCrA122;
        this.dataInvalidated = C3pd.A00(c9290GCrA122);
    }
}
