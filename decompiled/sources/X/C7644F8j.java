package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.F8j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7644F8j implements DKe {
    public final Map<String, String> A00 = new DQd(0);

    @Override // X.DKe
    public final void putCustomData(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        this.A00.put(str, str2);
    }

    @Override // X.DKe
    public final void report(String str, String str2, Throwable th) {
        AnonymousClass005.A0x(str, str2, th);
        Map<String, String> map = this.A00;
        if (map.size() <= 0) {
            C7384Etj.A0Y(str, 0);
            FFI.A01(null, str2, th);
            return;
        }
        StringBuilder sbA0x = C3cI.A0x("message:", str2);
        sbA0x.append(PairsDiscretionDocument.TERMINATOR);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            String str3 = (String) entryA0l.getValue();
            sbA0x.append(strA0t);
            sbA0x.append(":");
            sbA0x.append(str3);
            sbA0x.append(PairsDiscretionDocument.TERMINATOR);
        }
        String string = sbA0x.toString();
        C7384Etj.A0Y(str, 0);
        FFI.A01(null, string, th);
        map.clear();
    }
}
