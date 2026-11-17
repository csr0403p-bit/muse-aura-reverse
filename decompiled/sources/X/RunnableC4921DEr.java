package X;

/* renamed from: X.DEr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC4921DEr implements Runnable {
    public static final String __redex_internal_original_name = "DashLiveSegmentPrefetcher$SimplePrefetchTask";
    public final int A00;
    public final /* synthetic */ C4922DEs A01;

    public RunnableC4921DEr(C4922DEs c4922DEs, int i) {
        this.A01 = c4922DEs;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0318, code lost:
    
        r0 = com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt.NO_POSTAL_FIELD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x031a, code lost:
    
        X.AbstractC3426CMt.A03("DashLiveSegmentPrefetcher", "[thread=%d] Prefetch is done, fetched: %d, url=%s, cacheKey=%s", r4, r3, r6, r0);
        r10 = r1.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0323, code lost:
    
        if (r10 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0325, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0326, code lost:
    
        r0 = r10.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0328, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x032a, code lost:
    
        r9 = r0.A01;
        r7 = r10.A03;
        r5 = r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0330, code lost:
    
        if (r5 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0332, code lost:
    
        X.AbstractC5687DnT.A00(r9, r5, r7, r10.A04, 1, true, r10.A05, false, true, r10.A06);
        r10.A00 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0353, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0356, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0359, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x035a, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x035b, code lost:
    
        r13.A02(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0363, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0364, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0369, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (r9.A01.A0V == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
    
        if (r9 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
    
        r41 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        if (r9.A01.A0W != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        r41 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        if (r9 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cf, code lost:
    
        r42 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r9.A01.A0X != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        r42 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
    
        if (r9 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        r43 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        if (r9.A01.A0S != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
    
        r43 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e5, code lost:
    
        r7 = r0.A0G;
        r7 = r0.A0D;
        r7 = r0.A0B;
        r7 = r0.A0C;
        r14 = r0.A00;
        r10 = new X.DEY(r0.A0P);
        X.C7384Etj.A0Y(r11, 9);
        r3.add(new X.DEW(null, null, r4, r4, r10, r15, null, r12, null, r4, r11, null, null, r32, r33, r34, new X.EZ8(X.C7426Evi.A00, 2), r14, true, false, false, r40, r41, r42, r43, r7, r7, r7, r7, false));
        r5.A01(r3);
        r3 = r4.value;
        r13 = r0.A08;
        r12 = r0.A0M;
        r11 = r0.A01;
        r10 = r0.A0H;
        r9 = r0.A0K;
        r7 = r5.A01;
        r3 = X.DE0.A0G;
        X.C7384Etj.A0Y(r13, 1);
        r3 = new X.DE0(r12, X.DDU.defaultFactory, r5, r7, r15, r13, null, r11, r9, r10, false);
        r61 = java.util.Collections.EMPTY_MAP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016d, code lost:
    
        if (r0.A0E == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0171, code lost:
    
        if (r2.A07 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0175, code lost:
    
        if (r4 == X.DEF.LIVE_VIDEO) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0179, code lost:
    
        if (r4 != X.DEF.LIVE_AUDIO) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017b, code lost:
    
        r58 = X.AbstractC3426CMt.A00(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017f, code lost:
    
        r7 = r2.A04;
        r5 = X.BV6.A0o(r7);
        r10 = r7.A05;
        r18 = new X.C4890DDe(X.DE7.A02, new X.DE6(r15.A04, true), r5, null, null, "", "", null, null, null, r2.A02, r2.A01, -1, r3, -1, -1, -1, -1, -1, r10, -1, r2.A00, -1, -1, -1, -1, false, false, false, false, false, false);
        X.C1G.A04(r58);
        r7 = new X.C1O(r58, r18, null, r61, null, 1, 0, 0, 0, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f9, code lost:
    
        if (r0.A0I == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01fd, code lost:
    
        if (r2.A08 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ff, code lost:
    
        X.C4890DDe.A00(r7).A05 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0207, code lost:
    
        if (r0.A09 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020a, code lost:
    
        r58 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x020e, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0210, code lost:
    
        X.AbstractC4889DDd.A01(r7, "x-fb-abr-quality-label", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0216, code lost:
    
        X.AbstractC4889DDd.A01(r7, "x-fb-abr-bitrate", java.lang.Integer.toString(r10));
        X.AbstractC4889DDd.A01(r7, "x-fb-abr-is-prefetch", "1");
        X.AbstractC4889DDd.A01(r7, "x-fb-abr-is-live", "1");
        X.AbstractC4889DDd.A01(r7, "x-fb-abr-track-type", java.lang.Integer.toString(r4.value));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x023a, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x023b, code lost:
    
        r12 = r3.A09;
        r10 = r12.A04;
        r9 = r7.A06;
        r14 = new X.DEC(r9, r10, (int) X.C4890DDe.A00(r7).A0I, X.C4890DDe.A00(r7).A0E);
        r13 = r3.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0255, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0256, code lost:
    
        r4 = r13.A00(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x025a, code lost:
    
        if (r4 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x025e, code lost:
    
        if ((r4 instanceof X.C4901DDu) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0260, code lost:
    
        r9 = new X.C4929DEz(((X.C4901DDu) r4).A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x026c, code lost:
    
        if ((r4 instanceof X.DE1) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x026e, code lost:
    
        r4 = (X.DE1) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0270, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0275, code lost:
    
        if (r4.A04() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0277, code lost:
    
        r0 = java.lang.Integer.valueOf(r4.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x027f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0280, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0283, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0285, code lost:
    
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0289, code lost:
    
        r9 = new X.C4929DEz(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0292, code lost:
    
        r9 = new X.C4929DEz(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x029a, code lost:
    
        r11 = r3.A05;
        r0 = r11.A01(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a0, code lost:
    
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a2, code lost:
    
        r9 = new X.C4929DEz(r0.A02.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02aa, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ac, code lost:
    
        r0 = r3.A07;
        r15 = r3.A0A;
        r0 = X.C4890DDe.A00(r7).A0a;
        X.C4890DDe.A00(r7);
        r24 = 8000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02bd, code lost:
    
        if (r0 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02bf, code lost:
    
        r24 = 8500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c1, code lost:
    
        r0 = X.C4890DDe.A00(r7).A0a;
        X.C4890DDe.A00(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ca, code lost:
    
        if (r0 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02cd, code lost:
    
        r10 = 8000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d0, code lost:
    
        r10 = r3.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02d2, code lost:
    
        r0 = new X.C4906DDz(r11, r0, r3.A01, r3.A08, r15, r24, r10, r3.A03);
        r13.A01(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ee, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ef, code lost:
    
        r9 = new X.C4929DEz(X.DE0.A00(r7, r0, r3, r12.A02, r12.A03));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02fc, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02fd, code lost:
    
        r1.A00(X.C79.A01);
        r4 = java.lang.Integer.valueOf(r72.A00);
        r3 = java.lang.Integer.valueOf(r9.A00);
        r0 = r2.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0316, code lost:
    
        if (r0 != null) goto L101;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC4921DEr.run():void");
    }
}
