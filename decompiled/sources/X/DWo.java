package X;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes5.dex */
public final class DWo implements DWp {
    @Override // X.DWp
    public final List<InetAddress> AQ0(String str) throws UnknownHostException {
        C7384Etj.A0Y(str, 0);
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            C7384Etj.A0U(allByName);
            return BFI.A0G(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(AnonymousClass006.A0y(str, "Broken system behaviour for dns lookup of ", C60O.A0w()));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
