package com.facebook.graphql.query.interfaces;

import X.C06H;
import X.C10412Hbl;
import X.C10413Hbm;
import X.C10414Hbn;
import X.C10415Hbo;
import X.C10416Hbp;
import X.C10417Hbq;
import X.C10418Hbr;
import X.C10419Hbs;

/* loaded from: classes6.dex */
public interface IGraphQLRealtimeStatusListener {
    void onStatusChange(Status status);

    public abstract class Status {
        public Status() {
        }

        public static final Status fromInt(int i) {
            switch (i) {
                case 0:
                    return C10419Hbs.A00;
                case 1:
                    return C10416Hbp.A00;
                case 2:
                    return C10417Hbq.A00;
                case 3:
                    return C10415Hbo.A00;
                case 4:
                    return C10418Hbr.A00;
                case 5:
                    return C10414Hbn.A00;
                case 6:
                    return C10412Hbl.A00;
                case 7:
                    return C10413Hbm.A00;
                default:
                    return null;
            }
        }

        public /* synthetic */ Status(C06H c06h) {
        }
    }
}
