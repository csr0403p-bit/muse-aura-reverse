package com.facebook.aura.pairs;

import X.A3q;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.BGK;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ConnectionsActivityEvents {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final BLG<Set<String>> _ids;
    public final C1BN<Set<String>> ids;

    public final void add(String str) {
        Set<String> value;
        C7384Etj.A0Y(str, 0);
        BLG<Set<String>> blg = this._ids;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AbstractC0878AGe.A0g(AbstractC0878AGe.A0e(AbstractC0878AGe.A0X(BGK.A02(str, value)), 50))));
    }

    public final C1BN<Set<String>> getIds() {
        return this.ids;
    }

    public final class Companion {
        public final ConnectionsActivityEvents getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConnectionsActivityEvents) abstractC3358CGz.A03(ConnectionsActivityEvents.class, ConnectionsActivityEvents$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ ConnectionsActivityEvents(C06H c06h) {
        this();
    }

    public ConnectionsActivityEvents() {
        C9286GCn c9286GCnA01 = HnJ.A01(A3q.A00);
        this._ids = c9286GCnA01;
        this.ids = C3Pi.A00(c9286GCnA01);
    }
}
