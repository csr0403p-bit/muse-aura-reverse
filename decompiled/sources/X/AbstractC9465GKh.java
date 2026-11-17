package X;

import java.security.GeneralSecurityException;

/* renamed from: X.GKh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9465GKh {
    public static GeneralSecurityException A00(AbstractC9465GKh abstractC9465GKh) {
        Object gkx;
        StringBuilder sb = new StringBuilder("Cannot get output prefix for key of class ");
        sb.append(abstractC9465GKh.getClass().getName());
        sb.append(" with parameters ");
        if (abstractC9465GKh instanceof Ho4) {
            gkx = ((Ho4) abstractC9465GKh).A00;
        } else if (abstractC9465GKh instanceof Htd) {
            gkx = ((Htd) abstractC9465GKh).A00;
        } else if (abstractC9465GKh instanceof C9475GKr) {
            GKV gkv = ((C9475GKr) abstractC9465GKh).A00;
            gkx = new GKX(gkv.A01, gkv.A05);
        } else {
            gkx = abstractC9465GKh instanceof C9492GLi ? ((C9492GLi) abstractC9465GKh).A00 : abstractC9465GKh instanceof GM0 ? ((GM0) abstractC9465GKh).A00 : abstractC9465GKh instanceof C9507GLy ? ((C9507GLy) abstractC9465GKh).A00 : abstractC9465GKh instanceof GM2 ? ((GM2) abstractC9465GKh).A00 : abstractC9465GKh instanceof GM1 ? ((GM1) abstractC9465GKh).A00 : abstractC9465GKh instanceof C9508GLz ? ((C9508GLz) abstractC9465GKh).A00 : abstractC9465GKh instanceof HjH ? ((HjH) abstractC9465GKh).A00 : abstractC9465GKh instanceof GMI ? ((GMI) abstractC9465GKh).A00 : abstractC9465GKh instanceof Hnc ? ((Hnc) abstractC9465GKh).A00 : ((C10536Hqh) abstractC9465GKh).A00;
        }
        sb.append(gkx);
        return new GeneralSecurityException(sb.toString());
    }
}
