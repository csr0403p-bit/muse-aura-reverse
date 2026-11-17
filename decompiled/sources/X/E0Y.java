package X;

/* loaded from: classes5.dex */
public final class E0Y implements InterfaceC5885DrL {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // X.InterfaceC5885DrL
    public final InterfaceC6304E0a A7S(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0b;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return new EBk(c6154Dwx.A0c);
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new C6318E0q();
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new C6314E0m();
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new E1Y();
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new C6313E0l(c6154Dwx.A0c);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new E1L(c6154Dwx.A0c);
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return new C6319E0r(c6154Dwx.A0c);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new C6305E0b();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new C6329E1e();
                    }
                    break;
            }
        }
        throw C60Q.A0U("Unsupported MIME type: ", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[RETURN] */
    @Override // X.InterfaceC5885DrL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AEI(X.C6154Dwx r3) {
        /*
            r2 = this;
            java.lang.String r3 = r3.A0b
            if (r3 == 0) goto Ld
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 2
            switch(r0) {
                case -1351681404: goto L34;
                case -1248334819: goto L31;
                case -1026075066: goto L2e;
                case -1004728940: goto L24;
                case 691401887: goto L21;
                case 822864842: goto L1d;
                case 1157994102: goto L1a;
                case 1668750253: goto L17;
                case 1693976202: goto L14;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = "Unsupported MIME type: "
            java.lang.IllegalArgumentException r0 = X.C60Q.A0U(r0, r3)
            throw r0
        L14:
            java.lang.String r0 = "application/ttml+xml"
            goto L27
        L17:
            java.lang.String r0 = "application/x-subrip"
            goto L27
        L1a:
            java.lang.String r0 = "application/vobsub"
            goto L36
        L1d:
            java.lang.String r0 = "text/x-ssa"
            goto L27
        L21:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            goto L36
        L24:
            java.lang.String r0 = "text/vtt"
        L27:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld
            return r2
        L2e:
            java.lang.String r0 = "application/x-mp4-vtt"
            goto L36
        L31:
            java.lang.String r0 = "application/pgs"
            goto L36
        L34:
            java.lang.String r0 = "application/dvbsubs"
        L36:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0Y.AEI(X.Dwx):int");
    }

    @Override // X.InterfaceC5885DrL
    public final boolean Agg(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0b;
        return C6xC.A00(str, "text/x-ssa") || C6xC.A00(str, "text/vtt") || C6xC.A00(str, "application/x-mp4-vtt") || C6xC.A00(str, "application/x-subrip") || C6xC.A00(str, "application/x-quicktime-tx3g") || C6xC.A00(str, "application/pgs") || C6xC.A00(str, "application/vobsub") || C6xC.A00(str, "application/dvbsubs") || C6xC.A00(str, "application/ttml+xml");
    }
}
