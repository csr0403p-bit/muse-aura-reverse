package X;

/* renamed from: X.Dhy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5405Dhy implements InterfaceC5404Dhx {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // X.InterfaceC5404Dhx
    public final DgA A7i(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0b;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        return new C6339E1p();
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        return new CXE();
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        return new E2P(null);
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        return new C5550DkT();
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        return new E1Q();
                    }
                    break;
            }
        }
        throw C60Q.A0U("Attempted to create decoder for unsupported MIME type: ", str);
    }

    @Override // X.InterfaceC5404Dhx
    public final boolean Agg(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0b;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
