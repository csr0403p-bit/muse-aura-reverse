package X;

/* renamed from: X.EbJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6861EbJ implements InterfaceC6926EcZ {
    public static final C6861EbJ A00 = new C6861EbJ();

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0232, code lost:
    
        r1 = X.C3cI.A0x("No route to ", r2);
        r1.append(com.facebook.aura.maps.model.HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        r1.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0417, code lost:
    
        r1 = r3.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0419, code lost:
    
        if (r1 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x041b, code lost:
    
        X.AbstractC6843Eav.A0C(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x041e, code lost:
    
        r3.A05 = null;
        r3.A0A = null;
        r3.A0B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0426, code lost:
    
        if (r13 >= 21) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0452, code lost:
    
        if (r3.A05 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x045c, code lost:
    
        throw X.BV4.A0K("TLS tunnel buffered too many bytes!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0821, code lost:
    
        throw X.BV4.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0829, code lost:
    
        throw X.BV4.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0843, code lost:
    
        throw X.C7384Etj.A0C(r11, "cipherSuite == ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0884, code lost:
    
        throw X.BV4.A0a("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0892, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0897, code lost:
    
        X.AbstractC6843Eav.A0C(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x089e, code lost:
    
        X.AbstractC6843Eav.A0C(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x08b4, code lost:
    
        r21 = new okhttp3.internal.connection.RouteException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x08bc, code lost:
    
        X.CU7.A01(r21.firstConnectException, r1);
        r21.lastConnectException = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x08cd, code lost:
    
        if ((r1 instanceof java.net.ProtocolException) == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x08d1, code lost:
    
        if ((r1 instanceof java.io.InterruptedIOException) == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x08d5, code lost:
    
        if ((r1 instanceof javax.net.ssl.SSLHandshakeException) == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x08df, code lost:
    
        throw r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x08e2, code lost:
    
        if ((r1 instanceof javax.net.ssl.SSLPeerUnverifiedException) == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0965, code lost:
    
        throw X.BV4.A0S();
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:?, code lost:
    
        throw r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:?, code lost:
    
        throw r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:?, code lost:
    
        throw r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:?, code lost:
    
        throw r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:?, code lost:
    
        throw new java.net.SocketException(X.AnonymousClass001.A0v("; port is out of range", r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026d A[Catch: all -> 0x0975, TryCatch #15 {all -> 0x0975, blocks: (B:114:0x0269, B:116:0x026d, B:118:0x0286, B:120:0x0290, B:122:0x029a, B:136:0x02e3, B:138:0x02ef, B:140:0x0305, B:143:0x036f, B:144:0x0374, B:145:0x038d, B:147:0x03dc, B:149:0x03e2, B:177:0x045d, B:178:0x0461, B:150:0x03f5, B:154:0x03ff, B:156:0x0409, B:158:0x0417, B:160:0x041b, B:161:0x041e, B:172:0x0450, B:389:0x08ec, B:391:0x08f8, B:393:0x08fc, B:394:0x0908, B:395:0x0909, B:291:0x0735, B:295:0x0743, B:297:0x0780, B:298:0x0785, B:299:0x0789, B:308:0x07c0, B:309:0x07c1, B:310:0x07c3, B:325:0x07fc, B:326:0x07fd, B:328:0x0806, B:329:0x080b, B:339:0x082c, B:358:0x088f, B:357:0x0887, B:362:0x0893, B:364:0x0897, B:365:0x089a, B:367:0x089e, B:368:0x08a1, B:370:0x08b4, B:374:0x08cb, B:376:0x08cf, B:378:0x08d3, B:380:0x08d7, B:383:0x08e0, B:385:0x08e4, B:382:0x08df, B:371:0x08bc, B:164:0x042a, B:165:0x0430, B:166:0x0431, B:167:0x043b, B:168:0x043c, B:170:0x0446, B:175:0x0456, B:176:0x045c, B:179:0x0462, B:180:0x0468, B:185:0x046f, B:187:0x0478, B:294:0x0741, B:190:0x0488, B:124:0x029e, B:126:0x02a8, B:127:0x02ba, B:128:0x02bb, B:129:0x02c7, B:130:0x02c8, B:132:0x02d2, B:133:0x02de, B:417:0x096e, B:418:0x0974), top: B:531:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x046f A[Catch: IOException -> 0x0892, all -> 0x0975, TRY_ENTER, TryCatch #5 {IOException -> 0x0892, blocks: (B:172:0x0450, B:185:0x046f), top: B:520:0x0450 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0a04, TRY_LEAVE, TryCatch #1 {all -> 0x0a04, blocks: (B:18:0x004a, B:20:0x004e, B:22:0x0061, B:447:0x09dc, B:25:0x006d), top: B:512:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0780 A[Catch: IOException -> 0x0890, all -> 0x0975, TryCatch #10 {IOException -> 0x0890, blocks: (B:291:0x0735, B:295:0x0743, B:297:0x0780, B:298:0x0785, B:299:0x0789, B:308:0x07c0, B:309:0x07c1, B:310:0x07c3, B:325:0x07fc, B:326:0x07fd, B:328:0x0806, B:329:0x080b, B:339:0x082c, B:358:0x088f, B:357:0x0887, B:187:0x0478, B:294:0x0741, B:190:0x0488), top: B:526:0x0735 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: IOException -> 0x0aac, RouteException -> 0x0ab6, TryCatch #21 {IOException -> 0x0aac, RouteException -> 0x0ab6, blocks: (B:12:0x001c, B:13:0x003e, B:15:0x0044, B:17:0x0049, B:26:0x0071, B:27:0x0072, B:30:0x0078, B:478:0x0a34, B:425:0x0993, B:427:0x09ae, B:429:0x09b4, B:431:0x09ba, B:433:0x09c0, B:435:0x09c4, B:479:0x0a35, B:480:0x0a36, B:482:0x0a49, B:483:0x0a53, B:466:0x0a0e, B:446:0x09db, B:448:0x09de, B:449:0x09df, B:454:0x09ec, B:456:0x09f9, B:460:0x0a00, B:461:0x0a03, B:467:0x0a0f, B:469:0x0a16, B:471:0x0a1a, B:473:0x0a24, B:475:0x0a28, B:477:0x0a2e, B:32:0x0080, B:463:0x0a05, B:33:0x0083, B:35:0x0099, B:37:0x009f, B:106:0x0205, B:396:0x090f, B:397:0x0915, B:399:0x091d, B:400:0x091e, B:402:0x092b, B:403:0x093d, B:407:0x095e, B:412:0x0967, B:420:0x0976, B:38:0x00a2, B:40:0x00a6, B:42:0x00b0, B:44:0x00bf, B:46:0x00cf, B:47:0x00d5, B:49:0x00d9, B:50:0x00e8, B:52:0x00ee, B:53:0x00f2, B:55:0x00fc, B:57:0x0104, B:59:0x011e, B:61:0x0126, B:63:0x012e, B:65:0x013c, B:66:0x0140, B:73:0x015c, B:75:0x0164, B:76:0x016b, B:77:0x0171, B:79:0x0177, B:80:0x0186, B:82:0x018d, B:86:0x0193, B:87:0x0195, B:94:0x01c0, B:88:0x0199, B:90:0x01a7, B:91:0x01ab, B:93:0x01b1, B:111:0x0221, B:112:0x0232, B:67:0x0148, B:107:0x0211, B:68:0x014d, B:113:0x024d, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:101:0x01e3, B:103:0x01ef, B:105:0x01f7, B:421:0x097a, B:422:0x0980, B:423:0x0988, B:424:0x098e, B:465:0x0a07), top: B:539:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0897 A[Catch: all -> 0x0975, TryCatch #15 {all -> 0x0975, blocks: (B:114:0x0269, B:116:0x026d, B:118:0x0286, B:120:0x0290, B:122:0x029a, B:136:0x02e3, B:138:0x02ef, B:140:0x0305, B:143:0x036f, B:144:0x0374, B:145:0x038d, B:147:0x03dc, B:149:0x03e2, B:177:0x045d, B:178:0x0461, B:150:0x03f5, B:154:0x03ff, B:156:0x0409, B:158:0x0417, B:160:0x041b, B:161:0x041e, B:172:0x0450, B:389:0x08ec, B:391:0x08f8, B:393:0x08fc, B:394:0x0908, B:395:0x0909, B:291:0x0735, B:295:0x0743, B:297:0x0780, B:298:0x0785, B:299:0x0789, B:308:0x07c0, B:309:0x07c1, B:310:0x07c3, B:325:0x07fc, B:326:0x07fd, B:328:0x0806, B:329:0x080b, B:339:0x082c, B:358:0x088f, B:357:0x0887, B:362:0x0893, B:364:0x0897, B:365:0x089a, B:367:0x089e, B:368:0x08a1, B:370:0x08b4, B:374:0x08cb, B:376:0x08cf, B:378:0x08d3, B:380:0x08d7, B:383:0x08e0, B:385:0x08e4, B:382:0x08df, B:371:0x08bc, B:164:0x042a, B:165:0x0430, B:166:0x0431, B:167:0x043b, B:168:0x043c, B:170:0x0446, B:175:0x0456, B:176:0x045c, B:179:0x0462, B:180:0x0468, B:185:0x046f, B:187:0x0478, B:294:0x0741, B:190:0x0488, B:124:0x029e, B:126:0x02a8, B:127:0x02ba, B:128:0x02bb, B:129:0x02c7, B:130:0x02c8, B:132:0x02d2, B:133:0x02de, B:417:0x096e, B:418:0x0974), top: B:531:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x089e A[Catch: all -> 0x0975, TryCatch #15 {all -> 0x0975, blocks: (B:114:0x0269, B:116:0x026d, B:118:0x0286, B:120:0x0290, B:122:0x029a, B:136:0x02e3, B:138:0x02ef, B:140:0x0305, B:143:0x036f, B:144:0x0374, B:145:0x038d, B:147:0x03dc, B:149:0x03e2, B:177:0x045d, B:178:0x0461, B:150:0x03f5, B:154:0x03ff, B:156:0x0409, B:158:0x0417, B:160:0x041b, B:161:0x041e, B:172:0x0450, B:389:0x08ec, B:391:0x08f8, B:393:0x08fc, B:394:0x0908, B:395:0x0909, B:291:0x0735, B:295:0x0743, B:297:0x0780, B:298:0x0785, B:299:0x0789, B:308:0x07c0, B:309:0x07c1, B:310:0x07c3, B:325:0x07fc, B:326:0x07fd, B:328:0x0806, B:329:0x080b, B:339:0x082c, B:358:0x088f, B:357:0x0887, B:362:0x0893, B:364:0x0897, B:365:0x089a, B:367:0x089e, B:368:0x08a1, B:370:0x08b4, B:374:0x08cb, B:376:0x08cf, B:378:0x08d3, B:380:0x08d7, B:383:0x08e0, B:385:0x08e4, B:382:0x08df, B:371:0x08bc, B:164:0x042a, B:165:0x0430, B:166:0x0431, B:167:0x043b, B:168:0x043c, B:170:0x0446, B:175:0x0456, B:176:0x045c, B:179:0x0462, B:180:0x0468, B:185:0x046f, B:187:0x0478, B:294:0x0741, B:190:0x0488, B:124:0x029e, B:126:0x02a8, B:127:0x02ba, B:128:0x02bb, B:129:0x02c7, B:130:0x02c8, B:132:0x02d2, B:133:0x02de, B:417:0x096e, B:418:0x0974), top: B:531:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08b4 A[Catch: all -> 0x0975, TryCatch #15 {all -> 0x0975, blocks: (B:114:0x0269, B:116:0x026d, B:118:0x0286, B:120:0x0290, B:122:0x029a, B:136:0x02e3, B:138:0x02ef, B:140:0x0305, B:143:0x036f, B:144:0x0374, B:145:0x038d, B:147:0x03dc, B:149:0x03e2, B:177:0x045d, B:178:0x0461, B:150:0x03f5, B:154:0x03ff, B:156:0x0409, B:158:0x0417, B:160:0x041b, B:161:0x041e, B:172:0x0450, B:389:0x08ec, B:391:0x08f8, B:393:0x08fc, B:394:0x0908, B:395:0x0909, B:291:0x0735, B:295:0x0743, B:297:0x0780, B:298:0x0785, B:299:0x0789, B:308:0x07c0, B:309:0x07c1, B:310:0x07c3, B:325:0x07fc, B:326:0x07fd, B:328:0x0806, B:329:0x080b, B:339:0x082c, B:358:0x088f, B:357:0x0887, B:362:0x0893, B:364:0x0897, B:365:0x089a, B:367:0x089e, B:368:0x08a1, B:370:0x08b4, B:374:0x08cb, B:376:0x08cf, B:378:0x08d3, B:380:0x08d7, B:383:0x08e0, B:385:0x08e4, B:382:0x08df, B:371:0x08bc, B:164:0x042a, B:165:0x0430, B:166:0x0431, B:167:0x043b, B:168:0x043c, B:170:0x0446, B:175:0x0456, B:176:0x045c, B:179:0x0462, B:180:0x0468, B:185:0x046f, B:187:0x0478, B:294:0x0741, B:190:0x0488, B:124:0x029e, B:126:0x02a8, B:127:0x02ba, B:128:0x02bb, B:129:0x02c7, B:130:0x02c8, B:132:0x02d2, B:133:0x02de, B:417:0x096e, B:418:0x0974), top: B:531:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x08bc A[Catch: all -> 0x0975, TryCatch #15 {all -> 0x0975, blocks: (B:114:0x0269, B:116:0x026d, B:118:0x0286, B:120:0x0290, B:122:0x029a, B:136:0x02e3, B:138:0x02ef, B:140:0x0305, B:143:0x036f, B:144:0x0374, B:145:0x038d, B:147:0x03dc, B:149:0x03e2, B:177:0x045d, B:178:0x0461, B:150:0x03f5, B:154:0x03ff, B:156:0x0409, B:158:0x0417, B:160:0x041b, B:161:0x041e, B:172:0x0450, B:389:0x08ec, B:391:0x08f8, B:393:0x08fc, B:394:0x0908, B:395:0x0909, B:291:0x0735, B:295:0x0743, B:297:0x0780, B:298:0x0785, B:299:0x0789, B:308:0x07c0, B:309:0x07c1, B:310:0x07c3, B:325:0x07fc, B:326:0x07fd, B:328:0x0806, B:329:0x080b, B:339:0x082c, B:358:0x088f, B:357:0x0887, B:362:0x0893, B:364:0x0897, B:365:0x089a, B:367:0x089e, B:368:0x08a1, B:370:0x08b4, B:374:0x08cb, B:376:0x08cf, B:378:0x08d3, B:380:0x08d7, B:383:0x08e0, B:385:0x08e4, B:382:0x08df, B:371:0x08bc, B:164:0x042a, B:165:0x0430, B:166:0x0431, B:167:0x043b, B:168:0x043c, B:170:0x0446, B:175:0x0456, B:176:0x045c, B:179:0x0462, B:180:0x0468, B:185:0x046f, B:187:0x0478, B:294:0x0741, B:190:0x0488, B:124:0x029e, B:126:0x02a8, B:127:0x02ba, B:128:0x02bb, B:129:0x02c7, B:130:0x02c8, B:132:0x02d2, B:133:0x02de, B:417:0x096e, B:418:0x0974), top: B:531:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x08cb A[Catch: all -> 0x0975, TryCatch #15 {all -> 0x0975, blocks: (B:114:0x0269, B:116:0x026d, B:118:0x0286, B:120:0x0290, B:122:0x029a, B:136:0x02e3, B:138:0x02ef, B:140:0x0305, B:143:0x036f, B:144:0x0374, B:145:0x038d, B:147:0x03dc, B:149:0x03e2, B:177:0x045d, B:178:0x0461, B:150:0x03f5, B:154:0x03ff, B:156:0x0409, B:158:0x0417, B:160:0x041b, B:161:0x041e, B:172:0x0450, B:389:0x08ec, B:391:0x08f8, B:393:0x08fc, B:394:0x0908, B:395:0x0909, B:291:0x0735, B:295:0x0743, B:297:0x0780, B:298:0x0785, B:299:0x0789, B:308:0x07c0, B:309:0x07c1, B:310:0x07c3, B:325:0x07fc, B:326:0x07fd, B:328:0x0806, B:329:0x080b, B:339:0x082c, B:358:0x088f, B:357:0x0887, B:362:0x0893, B:364:0x0897, B:365:0x089a, B:367:0x089e, B:368:0x08a1, B:370:0x08b4, B:374:0x08cb, B:376:0x08cf, B:378:0x08d3, B:380:0x08d7, B:383:0x08e0, B:385:0x08e4, B:382:0x08df, B:371:0x08bc, B:164:0x042a, B:165:0x0430, B:166:0x0431, B:167:0x043b, B:168:0x043c, B:170:0x0446, B:175:0x0456, B:176:0x045c, B:179:0x0462, B:180:0x0468, B:185:0x046f, B:187:0x0478, B:294:0x0741, B:190:0x0488, B:124:0x029e, B:126:0x02a8, B:127:0x02ba, B:128:0x02bb, B:129:0x02c7, B:130:0x02c8, B:132:0x02d2, B:133:0x02de, B:417:0x096e, B:418:0x0974), top: B:531:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x098e A[Catch: IOException -> 0x0aac, RouteException -> 0x0ab6, TryCatch #21 {IOException -> 0x0aac, RouteException -> 0x0ab6, blocks: (B:12:0x001c, B:13:0x003e, B:15:0x0044, B:17:0x0049, B:26:0x0071, B:27:0x0072, B:30:0x0078, B:478:0x0a34, B:425:0x0993, B:427:0x09ae, B:429:0x09b4, B:431:0x09ba, B:433:0x09c0, B:435:0x09c4, B:479:0x0a35, B:480:0x0a36, B:482:0x0a49, B:483:0x0a53, B:466:0x0a0e, B:446:0x09db, B:448:0x09de, B:449:0x09df, B:454:0x09ec, B:456:0x09f9, B:460:0x0a00, B:461:0x0a03, B:467:0x0a0f, B:469:0x0a16, B:471:0x0a1a, B:473:0x0a24, B:475:0x0a28, B:477:0x0a2e, B:32:0x0080, B:463:0x0a05, B:33:0x0083, B:35:0x0099, B:37:0x009f, B:106:0x0205, B:396:0x090f, B:397:0x0915, B:399:0x091d, B:400:0x091e, B:402:0x092b, B:403:0x093d, B:407:0x095e, B:412:0x0967, B:420:0x0976, B:38:0x00a2, B:40:0x00a6, B:42:0x00b0, B:44:0x00bf, B:46:0x00cf, B:47:0x00d5, B:49:0x00d9, B:50:0x00e8, B:52:0x00ee, B:53:0x00f2, B:55:0x00fc, B:57:0x0104, B:59:0x011e, B:61:0x0126, B:63:0x012e, B:65:0x013c, B:66:0x0140, B:73:0x015c, B:75:0x0164, B:76:0x016b, B:77:0x0171, B:79:0x0177, B:80:0x0186, B:82:0x018d, B:86:0x0193, B:87:0x0195, B:94:0x01c0, B:88:0x0199, B:90:0x01a7, B:91:0x01ab, B:93:0x01b1, B:111:0x0221, B:112:0x0232, B:67:0x0148, B:107:0x0211, B:68:0x014d, B:113:0x024d, B:96:0x01c6, B:98:0x01cc, B:99:0x01d4, B:101:0x01e3, B:103:0x01ef, B:105:0x01f7, B:421:0x097a, B:422:0x0980, B:423:0x0988, B:424:0x098e, B:465:0x0a07), top: B:539:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0916 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x096e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x08df A[SYNTHETIC] */
    @Override // X.InterfaceC6926EcZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C6886Ebi ANq(X.C6875EbX r47) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6861EbJ.ANq(X.EbX):X.Ebi");
    }
}
