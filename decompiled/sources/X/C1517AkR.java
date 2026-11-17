package X;

/* renamed from: X.AkR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1517AkR implements InterfaceC1536Aks {
    public C1523Akc A00;
    public C1506AkD A02;
    public final C1442AjB A05;
    public final InterfaceC1508AkF A06;
    public final InterfaceC1464AjX A07;
    public C1506AkD A01 = new C1506AkD(false, null, 2);
    public final BRg A04 = new AkW(this);
    public final C0912AHo<InterfaceC1530Akm> A03 = new C0912AHo<>(1);

    @Override // X.InterfaceC1536Aks
    public final boolean AbM(int i) {
        Boolean boolABh;
        boolean zBooleanValue = false;
        if (A6H(i, false, true, false) && ((boolABh = ABh(null, new BUW(i, 3), i)) == null || !(zBooleanValue = boolABh.booleanValue()))) {
            this.A06.A6L();
        }
        return zBooleanValue;
    }

    @Override // X.C0Hi
    public final void A6G(boolean z) {
        A6H(8, z, true, true);
    }

    @Override // X.InterfaceC1536Aks
    public final boolean A6H(int i, boolean z, boolean z2, boolean z3) {
        if (!z) {
            int iIntValue = AbstractC1507AkE.A00(this.A01, i).intValue();
            if (iIntValue == 2 || iIntValue == 1 || iIntValue == 3) {
                return false;
            }
            if (iIntValue != 0) {
                throw C3cG.A0q();
            }
        }
        C1506AkD c1506AkDACD = ACD();
        if (c1506AkDACD != null) {
            Acg(null);
            if (z2) {
                EnumC1443AjC enumC1443AjC = EnumC1443AjC.A02;
                EnumC1443AjC enumC1443AjC2 = EnumC1443AjC.A04;
                c1506AkDACD.A06(enumC1443AjC, enumC1443AjC2);
                AbstractC1439Aj8 abstractC1439Aj8 = c1506AkDACD.node;
                if (!abstractC1439Aj8.isAttached) {
                    ASP.A01("visitAncestors called on an unattached node");
                    throw F60.createAndThrow();
                }
                AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.parent;
                C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(c1506AkDACD);
                if (c1453AjMA04 != null) {
                    while (true) {
                        if (C1438Aj7.A00(c1453AjMA04, 1024) != 0) {
                            while (abstractC1439Aj82 != null) {
                                if ((abstractC1439Aj82.kindSet & 1024) != 0) {
                                    C0910AHm c0910AHmA0K = null;
                                    AbstractC1439Aj8 abstractC1439Aj8A0X = abstractC1439Aj82;
                                    do {
                                        if (abstractC1439Aj8A0X instanceof C1506AkD) {
                                            ((C1506AkD) abstractC1439Aj8A0X).A06(EnumC1443AjC.A03, enumC1443AjC2);
                                        } else if ((abstractC1439Aj8A0X.kindSet & 1024) != 0 && (abstractC1439Aj8A0X instanceof AbstractC1437Aj6)) {
                                            int i2 = 0;
                                            for (AbstractC1439Aj8 abstractC1439Aj83 = ((AbstractC1437Aj6) abstractC1439Aj8A0X).A00; abstractC1439Aj83 != null; abstractC1439Aj83 = abstractC1439Aj83.child) {
                                                if ((abstractC1439Aj83.kindSet & 1024) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        abstractC1439Aj8A0X = abstractC1439Aj83;
                                                    } else {
                                                        c0910AHmA0K = C8j5.A0K(c0910AHmA0K);
                                                        abstractC1439Aj8A0X = C8j4.A0X(c0910AHmA0K, abstractC1439Aj8A0X);
                                                        c0910AHmA0K.A0G(abstractC1439Aj83);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        abstractC1439Aj8A0X = AbstractC1414Aij.A00(c0910AHmA0K);
                                    } while (abstractC1439Aj8A0X != null);
                                }
                                abstractC1439Aj82 = abstractC1439Aj82.parent;
                            }
                        }
                        c1453AjMA04 = c1453AjMA04.A0E();
                        if (c1453AjMA04 == null) {
                            break;
                        }
                        C1438Aj7 c1438Aj7 = c1453AjMA04.A0f;
                        abstractC1439Aj82 = c1438Aj7 != null ? c1438Aj7.A06 : null;
                    }
                }
            }
        }
        if (z3) {
            this.A06.A6L();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fb, code lost:
    
        if (r8 == null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144 A[Catch: all -> 0x02b2, PHI: r0
  0x0144: PHI (r0v70 X.AHm) = (r0v69 X.AHm), (r0v69 X.AHm), (r0v72 X.AHm) binds: [B:93:0x0119, B:95:0x011d, B:110:0x0149] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x02b2, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0015, B:8:0x0020, B:10:0x0024, B:11:0x0031, B:12:0x0039, B:67:0x00d4, B:70:0x00dc, B:71:0x00e3, B:72:0x00e4, B:74:0x00eb, B:76:0x00ef, B:78:0x00f4, B:125:0x016b, B:127:0x0171, B:129:0x017a, B:132:0x0182, B:135:0x0189, B:156:0x01be, B:157:0x01c2, B:158:0x01c5, B:139:0x0190, B:141:0x0195, B:143:0x0199, B:145:0x01a1, B:147:0x01a6, B:151:0x01ae, B:153:0x01b4, B:154:0x01b8, B:155:0x01bb, B:162:0x01cf, B:163:0x01d2, B:165:0x01d8, B:167:0x01dc, B:170:0x01e3, B:172:0x01e9, B:176:0x01fb, B:178:0x0200, B:180:0x0204, B:202:0x023f, B:183:0x020e, B:185:0x0213, B:187:0x0217, B:189:0x021f, B:191:0x0224, B:195:0x022c, B:197:0x0232, B:198:0x0236, B:199:0x0239, B:203:0x0244, B:205:0x024a, B:207:0x024f, B:209:0x0253, B:231:0x028d, B:212:0x025c, B:214:0x0261, B:216:0x0265, B:218:0x026d, B:220:0x0272, B:224:0x027a, B:226:0x0280, B:227:0x0284, B:228:0x0287, B:233:0x0294, B:235:0x029b, B:237:0x02a7, B:82:0x00fd, B:84:0x0103, B:87:0x010b, B:90:0x0112, B:92:0x0116, B:94:0x011b, B:96:0x011f, B:98:0x0127, B:100:0x012c, B:104:0x0134, B:106:0x013a, B:107:0x013e, B:108:0x0141, B:109:0x0144, B:121:0x0161, B:123:0x0165, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b, B:23:0x005e, B:25:0x0064, B:27:0x006c, B:30:0x0074, B:33:0x007b, B:35:0x007f, B:37:0x0084, B:39:0x0088, B:41:0x0090, B:43:0x0095, B:47:0x009d, B:49:0x00a3, B:50:0x00a7, B:51:0x00aa, B:52:0x00ad, B:64:0x00ca, B:66:0x00ce, B:56:0x00b7, B:57:0x00ba, B:59:0x00c0, B:61:0x00c4, B:15:0x0043, B:17:0x0047, B:19:0x004d), top: B:245:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d A[LOOP:13: B:90:0x0112->B:112:0x014d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016b A[Catch: all -> 0x02b2, PHI: r8
  0x016b: PHI (r8v9 X.Aj8) = (r8v8 X.Aj8), (r8v25 X.Aj8) binds: [B:124:0x0169, B:81:0x00fb] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x02b2, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0015, B:8:0x0020, B:10:0x0024, B:11:0x0031, B:12:0x0039, B:67:0x00d4, B:70:0x00dc, B:71:0x00e3, B:72:0x00e4, B:74:0x00eb, B:76:0x00ef, B:78:0x00f4, B:125:0x016b, B:127:0x0171, B:129:0x017a, B:132:0x0182, B:135:0x0189, B:156:0x01be, B:157:0x01c2, B:158:0x01c5, B:139:0x0190, B:141:0x0195, B:143:0x0199, B:145:0x01a1, B:147:0x01a6, B:151:0x01ae, B:153:0x01b4, B:154:0x01b8, B:155:0x01bb, B:162:0x01cf, B:163:0x01d2, B:165:0x01d8, B:167:0x01dc, B:170:0x01e3, B:172:0x01e9, B:176:0x01fb, B:178:0x0200, B:180:0x0204, B:202:0x023f, B:183:0x020e, B:185:0x0213, B:187:0x0217, B:189:0x021f, B:191:0x0224, B:195:0x022c, B:197:0x0232, B:198:0x0236, B:199:0x0239, B:203:0x0244, B:205:0x024a, B:207:0x024f, B:209:0x0253, B:231:0x028d, B:212:0x025c, B:214:0x0261, B:216:0x0265, B:218:0x026d, B:220:0x0272, B:224:0x027a, B:226:0x0280, B:227:0x0284, B:228:0x0287, B:233:0x0294, B:235:0x029b, B:237:0x02a7, B:82:0x00fd, B:84:0x0103, B:87:0x010b, B:90:0x0112, B:92:0x0116, B:94:0x011b, B:96:0x011f, B:98:0x0127, B:100:0x012c, B:104:0x0134, B:106:0x013a, B:107:0x013e, B:108:0x0141, B:109:0x0144, B:121:0x0161, B:123:0x0165, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b, B:23:0x005e, B:25:0x0064, B:27:0x006c, B:30:0x0074, B:33:0x007b, B:35:0x007f, B:37:0x0084, B:39:0x0088, B:41:0x0090, B:43:0x0095, B:47:0x009d, B:49:0x00a3, B:50:0x00a7, B:51:0x00aa, B:52:0x00ad, B:64:0x00ca, B:66:0x00ce, B:56:0x00b7, B:57:0x00ba, B:59:0x00c0, B:61:0x00c4, B:15:0x0043, B:17:0x0047, B:19:0x004d), top: B:245:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad A[Catch: all -> 0x02b2, PHI: r0
  0x00ad: PHI (r0v13 X.AHm) = (r0v12 X.AHm), (r0v12 X.AHm), (r0v15 X.AHm) binds: [B:36:0x0082, B:38:0x0086, B:53:0x00b2] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x02b2, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0015, B:8:0x0020, B:10:0x0024, B:11:0x0031, B:12:0x0039, B:67:0x00d4, B:70:0x00dc, B:71:0x00e3, B:72:0x00e4, B:74:0x00eb, B:76:0x00ef, B:78:0x00f4, B:125:0x016b, B:127:0x0171, B:129:0x017a, B:132:0x0182, B:135:0x0189, B:156:0x01be, B:157:0x01c2, B:158:0x01c5, B:139:0x0190, B:141:0x0195, B:143:0x0199, B:145:0x01a1, B:147:0x01a6, B:151:0x01ae, B:153:0x01b4, B:154:0x01b8, B:155:0x01bb, B:162:0x01cf, B:163:0x01d2, B:165:0x01d8, B:167:0x01dc, B:170:0x01e3, B:172:0x01e9, B:176:0x01fb, B:178:0x0200, B:180:0x0204, B:202:0x023f, B:183:0x020e, B:185:0x0213, B:187:0x0217, B:189:0x021f, B:191:0x0224, B:195:0x022c, B:197:0x0232, B:198:0x0236, B:199:0x0239, B:203:0x0244, B:205:0x024a, B:207:0x024f, B:209:0x0253, B:231:0x028d, B:212:0x025c, B:214:0x0261, B:216:0x0265, B:218:0x026d, B:220:0x0272, B:224:0x027a, B:226:0x0280, B:227:0x0284, B:228:0x0287, B:233:0x0294, B:235:0x029b, B:237:0x02a7, B:82:0x00fd, B:84:0x0103, B:87:0x010b, B:90:0x0112, B:92:0x0116, B:94:0x011b, B:96:0x011f, B:98:0x0127, B:100:0x012c, B:104:0x0134, B:106:0x013a, B:107:0x013e, B:108:0x0141, B:109:0x0144, B:121:0x0161, B:123:0x0165, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b, B:23:0x005e, B:25:0x0064, B:27:0x006c, B:30:0x0074, B:33:0x007b, B:35:0x007f, B:37:0x0084, B:39:0x0088, B:41:0x0090, B:43:0x0095, B:47:0x009d, B:49:0x00a3, B:50:0x00a7, B:51:0x00aa, B:52:0x00ad, B:64:0x00ca, B:66:0x00ce, B:56:0x00b7, B:57:0x00ba, B:59:0x00c0, B:61:0x00c4, B:15:0x0043, B:17:0x0047, B:19:0x004d), top: B:245:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6 A[LOOP:17: B:33:0x007b->B:55:0x00b6, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v9, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // X.InterfaceC1536Aks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A97(android.view.KeyEvent r14, kotlin.jvm.functions.Function0<java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1517AkR.A97(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/AaC;LX/G0U<-LX/AkD;Ljava/lang/Boolean;>;)Ljava/lang/Boolean; */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x024d A[EDGE_INSN: B:231:0x024d->B:194:0x024d BREAK  A[LOOP:5: B:153:0x01d6->B:234:0x01d6], SYNTHETIC] */
    @Override // X.InterfaceC1536Aks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean ABh(X.AaC r14, X.G0U r15, int r16) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1517AkR.ABh(X.AaC, X.G0U, int):java.lang.Boolean");
    }

    @Override // X.InterfaceC1536Aks
    public final C1506AkD ACD() {
        C1506AkD c1506AkD = this.A02;
        if (c1506AkD == null || !c1506AkD.isAttached) {
            return null;
        }
        return c1506AkD;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Boolean] */
    @Override // X.InterfaceC1536Aks
    public final boolean AQv(int i, boolean z) {
        T t;
        Boolean boolABh;
        C1506AkD c1506AkDACD;
        if ((AbstractC1512AkJ.A00 || ((c1506AkDACD = ACD()) != null && c1506AkDACD.A03)) && this.A06.AQw(i)) {
            return true;
        }
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        c10543HqvA0z.element = false;
        C1506AkD c1506AkDACD2 = ACD();
        Boolean boolABh2 = ABh(this.A06.getEmbeddedViewFocusRect(), new C2331BUf(c10543HqvA0z, i, 0), i);
        if (AnonymousClass002.A1b(boolABh2, true) && c1506AkDACD2 != ACD()) {
            return true;
        }
        if (boolABh2 != null && (t = c10543HqvA0z.element) != 0) {
            if (boolABh2.booleanValue() && AnonymousClass001.A1X(t)) {
                return true;
            }
            if ((i == 1 || i == 2) && z && A6H(i, false, true, false) && (boolABh = ABh(null, new BUW(i, 4), i)) != null && boolABh.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1536Aks
    public final void Acg(C1506AkD c1506AkD) {
        C1506AkD c1506AkD2 = this.A02;
        this.A02 = c1506AkD;
        C0912AHo<InterfaceC1530Akm> c0912AHo = this.A03;
        Object[] objArr = c0912AHo.A01;
        int i = ((AbstractC0913AHp) c0912AHo).A00;
        for (int i2 = 0; i2 < i; i2++) {
            ((InterfaceC1530Akm) objArr[i2]).ATO(c1506AkD2, c1506AkD);
        }
    }

    public C1517AkR(InterfaceC1508AkF interfaceC1508AkF, InterfaceC1464AjX interfaceC1464AjX) {
        this.A06 = interfaceC1508AkF;
        this.A07 = interfaceC1464AjX;
        this.A05 = new C1442AjB(this, interfaceC1464AjX);
    }
}
