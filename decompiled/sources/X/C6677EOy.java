package X;

import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.EOy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6677EOy implements CQG<EOM> {
    public final /* synthetic */ F6D A00;
    public final /* synthetic */ HsM A01;

    public C6677EOy(HsM hsM, F6D f6d) {
        this.A01 = hsM;
        this.A00 = f6d;
    }

    @Override // X.CQG
    public final void onFailure(Throwable th) {
        HsM hsM = this.A01;
        C9115Fyg c9115Fyg = new C9115Fyg();
        c9115Fyg.A06(C0881AGi.A00, 0);
        AbstractC7691FAk.A00(this.A00, c9115Fyg.A05(), hsM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.CQG
    public final /* bridge */ /* synthetic */ void onSuccess(EOM eom) {
        Object objA0i;
        EOW next;
        String str;
        Integer numACC;
        int iIntValue;
        EOM eom2 = eom;
        if (eom2 != null) {
            List<ENw> list = eom2.A01;
            objA0i = AnonymousClass003.A0i(list);
            for (ENw eNw : list) {
                Set<EOW> set = C6678EOz.A00;
                C7384Etj.A0Y(eNw, 0);
                HashMap mapA0u = BV4.A0u();
                mapA0u.put(NodeCommandFallbackWorker.KEY_USER_ID, eNw.A02);
                mapA0u.put("auth_token", eNw.A01);
                EP0 ep0 = eNw.A03;
                Iterator<EOW> it = C6678EOz.A00.iterator();
                do {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                } while (next.ACR() != ep0);
                EOW eow = next;
                if (eow == null || (numACC = eow.ACC()) == null || (iIntValue = numACC.intValue()) == -1) {
                    str = "";
                } else if (iIntValue == 0) {
                    str = "Facebook";
                } else if (iIntValue == 1) {
                    str = "Instagram";
                } else if (iIntValue == 3) {
                    str = "FRL";
                } else if (iIntValue == 4) {
                    str = "Barcelona";
                } else {
                    if (iIntValue != 2) {
                        throw C3cG.A0q();
                    }
                    str = "WhatsApp";
                }
                mapA0u.put("account_type", str);
                mapA0u.put("account_source", eNw.A04.accountSourceString);
                mapA0u.put("app_source", ep0.appSourceString);
                objA0i.add(mapA0u);
            }
        } else {
            objA0i = C0881AGi.A00;
        }
        HsM hsM = this.A01;
        C9115Fyg c9115Fyg = new C9115Fyg();
        c9115Fyg.A06(objA0i, 0);
        AbstractC7691FAk.A00(this.A00, c9115Fyg.A05(), hsM);
    }
}
