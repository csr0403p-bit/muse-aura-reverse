package X;

/* renamed from: X.Eeo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7042Eeo implements InterfaceC7072EfU {
    public final /* synthetic */ AbstractC7043Eep A00;
    public final /* synthetic */ C7041Een A01;

    public C7042Eeo(AbstractC7043Eep abstractC7043Eep, C7041Een c7041Een) {
        this.A00 = abstractC7043Eep;
        this.A01 = c7041Een;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:153|40|12a|45|(19:(24:49|(1:64)|142|67|141|68|151|69|143|70|(1:72)|73|(3:75|(1:77)(1:80)|78)|79|(1:82)|83|(1:85)|86|(1:88)|145|89|(1:91)|133|134)(3:48|53|(1:55)(1:61))|151|69|143|70|(0)|73|(0)|79|(0)|83|(0)|86|(0)|145|89|(0)|133|134)|56|(3:58|(2:60|62)|65)(1:63)|66|142|67|141|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(6:(24:49|(1:64)|142|67|141|68|151|69|143|70|(1:72)|73|(3:75|(1:77)(1:80)|78)|79|(1:82)|83|(1:85)|86|(1:88)|145|89|(1:91)|133|134)(3:48|53|(1:55)(1:61))|145|89|(0)|133|134)|151|69|143|70|(0)|73|(0)|79|(0)|83|(0)|86|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026d, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x026f, code lost:
    
        r1 = r6.getExtra("failed_scan_count");
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0277, code lost:
    
        if ((r1 instanceof java.lang.Integer) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x027d, code lost:
    
        r0 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0281, code lost:
    
        r1 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0289, code lost:
    
        if (r6.getExtra("first_failed_scan_num") == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x028b, code lost:
    
        X.InterfaceC7060Ef7.A00(r6, "first_failed_scan_num", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0290, code lost:
    
        X.InterfaceC7060Ef7.A00(r6, "failed_scan_num", r13);
        r6.putExtra("failed_scan_intermediate", java.lang.Boolean.valueOf(!r24));
        X.InterfaceC7060Ef7.A00(r6, "failed_scan_count", r1);
        X.InterfaceC7060Ef7.A00(r6, "failed_scan_end_offset", r10);
        r6.putExtra("failed_scan_error_class", X.C60Q.A0e(r8));
        r3.AV2(r6, "DecodeProducer", r8, X.AbstractC7043Eep.A01(r2, r4, r7, r1, r19, r20, r21, r14, r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c4, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c6, code lost:
    
        if (r24 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c8, code lost:
    
        X.C6988Edo.A03(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02cb, code lost:
    
        X.AbstractC7043Eep.A02(r7, true);
        ((X.AbstractC7024EeV) r7).A00.onFailure(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022c, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0195 A[Catch: Exception -> 0x022c, all -> 0x02db, TRY_LEAVE, TryCatch #2 {Exception -> 0x022c, blocks: (B:70:0x0190, B:72:0x0195), top: B:143:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01de A[Catch: all -> 0x02db, TryCatch #7 {all -> 0x02db, blocks: (B:40:0x0128, B:41:0x012a, B:43:0x012f, B:44:0x0130, B:45:0x0131, B:53:0x0146, B:55:0x014a, B:56:0x0151, B:58:0x0155, B:65:0x0175, B:66:0x017f, B:67:0x0181, B:68:0x0186, B:69:0x0188, B:70:0x0190, B:72:0x0195, B:73:0x0197, B:75:0x01de, B:77:0x01e5, B:78:0x01e9, B:79:0x01f2, B:82:0x01fc, B:83:0x0203, B:85:0x0209, B:86:0x0210, B:91:0x0220, B:94:0x0228, B:95:0x022b, B:120:0x026f, B:122:0x0279, B:124:0x027d, B:125:0x0281, B:127:0x028b, B:128:0x0290, B:131:0x02c8, B:132:0x02cb, B:99:0x022f, B:101:0x0231, B:103:0x023c, B:105:0x0242, B:113:0x0261, B:110:0x0259, B:112:0x025e, B:116:0x0269, B:117:0x026c, B:114:0x0264, B:63:0x0167, B:61:0x0160, B:49:0x013d, B:64:0x0172, B:137:0x02da, B:89:0x0216, B:42:0x012b), top: B:153:0x0128, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fc A[Catch: all -> 0x02db, TryCatch #7 {all -> 0x02db, blocks: (B:40:0x0128, B:41:0x012a, B:43:0x012f, B:44:0x0130, B:45:0x0131, B:53:0x0146, B:55:0x014a, B:56:0x0151, B:58:0x0155, B:65:0x0175, B:66:0x017f, B:67:0x0181, B:68:0x0186, B:69:0x0188, B:70:0x0190, B:72:0x0195, B:73:0x0197, B:75:0x01de, B:77:0x01e5, B:78:0x01e9, B:79:0x01f2, B:82:0x01fc, B:83:0x0203, B:85:0x0209, B:86:0x0210, B:91:0x0220, B:94:0x0228, B:95:0x022b, B:120:0x026f, B:122:0x0279, B:124:0x027d, B:125:0x0281, B:127:0x028b, B:128:0x0290, B:131:0x02c8, B:132:0x02cb, B:99:0x022f, B:101:0x0231, B:103:0x023c, B:105:0x0242, B:113:0x0261, B:110:0x0259, B:112:0x025e, B:116:0x0269, B:117:0x026c, B:114:0x0264, B:63:0x0167, B:61:0x0160, B:49:0x013d, B:64:0x0172, B:137:0x02da, B:89:0x0216, B:42:0x012b), top: B:153:0x0128, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209 A[Catch: all -> 0x02db, TryCatch #7 {all -> 0x02db, blocks: (B:40:0x0128, B:41:0x012a, B:43:0x012f, B:44:0x0130, B:45:0x0131, B:53:0x0146, B:55:0x014a, B:56:0x0151, B:58:0x0155, B:65:0x0175, B:66:0x017f, B:67:0x0181, B:68:0x0186, B:69:0x0188, B:70:0x0190, B:72:0x0195, B:73:0x0197, B:75:0x01de, B:77:0x01e5, B:78:0x01e9, B:79:0x01f2, B:82:0x01fc, B:83:0x0203, B:85:0x0209, B:86:0x0210, B:91:0x0220, B:94:0x0228, B:95:0x022b, B:120:0x026f, B:122:0x0279, B:124:0x027d, B:125:0x0281, B:127:0x028b, B:128:0x0290, B:131:0x02c8, B:132:0x02cb, B:99:0x022f, B:101:0x0231, B:103:0x023c, B:105:0x0242, B:113:0x0261, B:110:0x0259, B:112:0x025e, B:116:0x0269, B:117:0x026c, B:114:0x0264, B:63:0x0167, B:61:0x0160, B:49:0x013d, B:64:0x0172, B:137:0x02da, B:89:0x0216, B:42:0x012b), top: B:153:0x0128, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0220 A[Catch: all -> 0x02db, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x02db, blocks: (B:40:0x0128, B:41:0x012a, B:43:0x012f, B:44:0x0130, B:45:0x0131, B:53:0x0146, B:55:0x014a, B:56:0x0151, B:58:0x0155, B:65:0x0175, B:66:0x017f, B:67:0x0181, B:68:0x0186, B:69:0x0188, B:70:0x0190, B:72:0x0195, B:73:0x0197, B:75:0x01de, B:77:0x01e5, B:78:0x01e9, B:79:0x01f2, B:82:0x01fc, B:83:0x0203, B:85:0x0209, B:86:0x0210, B:91:0x0220, B:94:0x0228, B:95:0x022b, B:120:0x026f, B:122:0x0279, B:124:0x027d, B:125:0x0281, B:127:0x028b, B:128:0x0290, B:131:0x02c8, B:132:0x02cb, B:99:0x022f, B:101:0x0231, B:103:0x023c, B:105:0x0242, B:113:0x0261, B:110:0x0259, B:112:0x025e, B:116:0x0269, B:117:0x026c, B:114:0x0264, B:63:0x0167, B:61:0x0160, B:49:0x013d, B:64:0x0172, B:137:0x02da, B:89:0x0216, B:42:0x012b), top: B:153:0x0128, inners: #3, #5 }] */
    @Override // X.InterfaceC7072EfU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Abs(X.C6988Edo r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7042Eeo.Abs(X.Edo, int):void");
    }
}
