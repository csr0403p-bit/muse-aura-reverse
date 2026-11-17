package X;

/* renamed from: X.Al5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1542Al5 extends AVy {
    public float A00 = 1.0f;
    public C1423Ais A01;
    public final C1DM A02;
    public final InterfaceC1550AlF A03;
    public final C1543Al6 A04;

    @Override // X.AVy
    public final boolean applyLayoutDirection(EnumC1820Arj enumC1820Arj) {
        return true;
    }

    @Override // X.AVy
    public final boolean applyAlpha(float f) {
        this.A00 = f;
        return true;
    }

    @Override // X.AVy
    public final boolean applyColorFilter(C1423Ais c1423Ais) {
        this.A01 = c1423Ais;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x003a, B:5:0x005c, B:6:0x0060, B:12:0x0076, B:24:0x0092, B:26:0x0096, B:31:0x00aa, B:28:0x009e, B:58:0x0203, B:60:0x020b, B:62:0x0215, B:64:0x0219, B:67:0x022d, B:69:0x0231, B:80:0x0296, B:82:0x02ba, B:89:0x02eb, B:90:0x02f1, B:71:0x0239, B:73:0x024d, B:74:0x026b, B:76:0x026f, B:78:0x0273, B:83:0x02c1, B:79:0x028d, B:84:0x02c6, B:35:0x00b9, B:37:0x00d5, B:39:0x00fb, B:41:0x0106, B:42:0x010d, B:54:0x01c5, B:55:0x01cc, B:56:0x01e9, B:57:0x01ee, B:45:0x0138, B:47:0x013e, B:48:0x0145, B:49:0x0164, B:51:0x0198, B:52:0x019f, B:7:0x0063, B:9:0x0068, B:11:0x0072, B:17:0x0082, B:13:0x0079, B:15:0x007d, B:87:0x02e5, B:81:0x029b), top: B:94:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x003a, B:5:0x005c, B:6:0x0060, B:12:0x0076, B:24:0x0092, B:26:0x0096, B:31:0x00aa, B:28:0x009e, B:58:0x0203, B:60:0x020b, B:62:0x0215, B:64:0x0219, B:67:0x022d, B:69:0x0231, B:80:0x0296, B:82:0x02ba, B:89:0x02eb, B:90:0x02f1, B:71:0x0239, B:73:0x024d, B:74:0x026b, B:76:0x026f, B:78:0x0273, B:83:0x02c1, B:79:0x028d, B:84:0x02c6, B:35:0x00b9, B:37:0x00d5, B:39:0x00fb, B:41:0x0106, B:42:0x010d, B:54:0x01c5, B:55:0x01cc, B:56:0x01e9, B:57:0x01ee, B:45:0x0138, B:47:0x013e, B:48:0x0145, B:49:0x0164, B:51:0x0198, B:52:0x019f, B:7:0x0063, B:9:0x0068, B:11:0x0072, B:17:0x0082, B:13:0x0079, B:15:0x007d, B:87:0x02e5, B:81:0x029b), top: B:94:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x003a, B:5:0x005c, B:6:0x0060, B:12:0x0076, B:24:0x0092, B:26:0x0096, B:31:0x00aa, B:28:0x009e, B:58:0x0203, B:60:0x020b, B:62:0x0215, B:64:0x0219, B:67:0x022d, B:69:0x0231, B:80:0x0296, B:82:0x02ba, B:89:0x02eb, B:90:0x02f1, B:71:0x0239, B:73:0x024d, B:74:0x026b, B:76:0x026f, B:78:0x0273, B:83:0x02c1, B:79:0x028d, B:84:0x02c6, B:35:0x00b9, B:37:0x00d5, B:39:0x00fb, B:41:0x0106, B:42:0x010d, B:54:0x01c5, B:55:0x01cc, B:56:0x01e9, B:57:0x01ee, B:45:0x0138, B:47:0x013e, B:48:0x0145, B:49:0x0164, B:51:0x0198, B:52:0x019f, B:7:0x0063, B:9:0x0068, B:11:0x0072, B:17:0x0082, B:13:0x0079, B:15:0x007d, B:87:0x02e5, B:81:0x029b), top: B:94:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x003a, B:5:0x005c, B:6:0x0060, B:12:0x0076, B:24:0x0092, B:26:0x0096, B:31:0x00aa, B:28:0x009e, B:58:0x0203, B:60:0x020b, B:62:0x0215, B:64:0x0219, B:67:0x022d, B:69:0x0231, B:80:0x0296, B:82:0x02ba, B:89:0x02eb, B:90:0x02f1, B:71:0x0239, B:73:0x024d, B:74:0x026b, B:76:0x026f, B:78:0x0273, B:83:0x02c1, B:79:0x028d, B:84:0x02c6, B:35:0x00b9, B:37:0x00d5, B:39:0x00fb, B:41:0x0106, B:42:0x010d, B:54:0x01c5, B:55:0x01cc, B:56:0x01e9, B:57:0x01ee, B:45:0x0138, B:47:0x013e, B:48:0x0145, B:49:0x0164, B:51:0x0198, B:52:0x019f, B:7:0x0063, B:9:0x0068, B:11:0x0072, B:17:0x0082, B:13:0x0079, B:15:0x007d, B:87:0x02e5, B:81:0x029b), top: B:94:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0219 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x003a, B:5:0x005c, B:6:0x0060, B:12:0x0076, B:24:0x0092, B:26:0x0096, B:31:0x00aa, B:28:0x009e, B:58:0x0203, B:60:0x020b, B:62:0x0215, B:64:0x0219, B:67:0x022d, B:69:0x0231, B:80:0x0296, B:82:0x02ba, B:89:0x02eb, B:90:0x02f1, B:71:0x0239, B:73:0x024d, B:74:0x026b, B:76:0x026f, B:78:0x0273, B:83:0x02c1, B:79:0x028d, B:84:0x02c6, B:35:0x00b9, B:37:0x00d5, B:39:0x00fb, B:41:0x0106, B:42:0x010d, B:54:0x01c5, B:55:0x01cc, B:56:0x01e9, B:57:0x01ee, B:45:0x0138, B:47:0x013e, B:48:0x0145, B:49:0x0164, B:51:0x0198, B:52:0x019f, B:7:0x0063, B:9:0x0068, B:11:0x0072, B:17:0x0082, B:13:0x0079, B:15:0x007d, B:87:0x02e5, B:81:0x029b), top: B:94:0x003a, inners: #1 }] */
    @Override // X.AVy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(X.AT3 r41) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1542Al5.onDraw(X.AT3):void");
    }

    public C1542Al5(C1DM c1dm, InterfaceC1550AlF interfaceC1550AlF, C1543Al6 c1543Al6) {
        this.A02 = c1dm;
        this.A04 = c1543Al6;
        this.A03 = interfaceC1550AlF;
    }

    @Override // X.AVy
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo0getIntrinsicSizeNHjbRc() {
        return 9205357640488583168L;
    }
}
