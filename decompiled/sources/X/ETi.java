package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.soloader.NoBaseApkException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
public final class ETi {
    public static boolean A00 = true;
    public static int A01;
    public static int A02;
    public static Context A03;
    public static C3B A04;
    public static C3I A05;
    public static C3D A06;
    public static String A07;
    public static volatile C3g[] A0E;
    public static final ReentrantReadWriteLock A0A = new ReentrantReadWriteLock();
    public static final AtomicInteger A09 = BV5.A17();
    public static final Set<String> A08 = C60O.A18();
    public static final Map<String, Object> A0C = BV4.A0u();
    public static final Set<String> A0D = C60O.A18();
    public static final Map<String, Object> A0B = BV4.A0u();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01da A[Catch: all -> 0x0243, TryCatch #2 {all -> 0x0243, blocks: (B:51:0x00d6, B:53:0x00da, B:56:0x00f6, B:101:0x01d3, B:102:0x01d6, B:104:0x01da, B:105:0x01e2, B:106:0x01f3, B:108:0x01f7, B:110:0x0211, B:111:0x0214, B:112:0x022d, B:58:0x0108, B:100:0x01cb, B:61:0x0111, B:63:0x0116, B:65:0x011a, B:71:0x0125, B:86:0x0175, B:73:0x012d, B:74:0x013c, B:76:0x0144, B:78:0x0161, B:79:0x0164, B:85:0x016f, B:88:0x0177, B:91:0x017f, B:93:0x0185, B:95:0x018d, B:97:0x0193, B:98:0x0197, B:99:0x01ad), top: B:150:0x00d6, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f7 A[Catch: all -> 0x0243, TryCatch #2 {all -> 0x0243, blocks: (B:51:0x00d6, B:53:0x00da, B:56:0x00f6, B:101:0x01d3, B:102:0x01d6, B:104:0x01da, B:105:0x01e2, B:106:0x01f3, B:108:0x01f7, B:110:0x0211, B:111:0x0214, B:112:0x022d, B:58:0x0108, B:100:0x01cb, B:61:0x0111, B:63:0x0116, B:65:0x011a, B:71:0x0125, B:86:0x0175, B:73:0x012d, B:74:0x013c, B:76:0x0144, B:78:0x0161, B:79:0x0164, B:85:0x016f, B:88:0x0177, B:91:0x017f, B:93:0x0185, B:95:0x018d, B:97:0x0193, B:98:0x0197, B:99:0x01ad), top: B:150:0x00d6, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022d A[EDGE_INSN: B:155:0x022d->B:112:0x022d BREAK  A[LOOP:0: B:106:0x01f3->B:111:0x0214], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.C2y] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.C3j] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(android.content.Context r15, int r16) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ETi.A06(android.content.Context, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int A00() {
        ReentrantReadWriteLock reentrantReadWriteLock = A0A;
        BV4.A1T(reentrantReadWriteLock);
        try {
            int i = A02;
            boolean zA1L = AnonymousClass002.A1L(i & 2);
            boolean z = zA1L;
            if ((i & 256) != 0) {
                z = (zA1L ? 1 : 0) | 4;
            }
            int i2 = z;
            if ((i & 128) == 0) {
                i2 = (z ? 1 : 0) | 8;
            }
            return i2;
        } finally {
            BV4.A1Q(reentrantReadWriteLock);
        }
    }

    public static ApplicationInfo A01() {
        C3B c3b = A04;
        if (c3b != null) {
            return c3b.A00.getApplicationInfo();
        }
        throw C3cG.A0Q("SoLoader not initialized");
    }

    public static String A03() {
        String str = A07;
        if (str != null) {
            return str;
        }
        throw C3cG.A0Q("no primary abi");
    }

    public static String A04(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = A0A;
        BV4.A1S(reentrantReadWriteLock);
        try {
            String strA05 = null;
            if (A0E != null) {
                int i = 0;
                while (strA05 == null) {
                    if (i >= A0E.length) {
                        break;
                    }
                    strA05 = A0E[i].A05(str);
                    i++;
                }
            }
            return strA05;
        } finally {
            BV4.A1R(reentrantReadWriteLock);
        }
    }

    public static void A07(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        AtomicReference<InterfaceC10426Hc0[]> atomicReference = C3M.A00;
        InterfaceC10426Hc0[] interfaceC10426Hc0Arr = atomicReference.get();
        if (interfaceC10426Hc0Arr != null && 0 < interfaceC10426Hc0Arr.length) {
            throw BV4.A0a("onLoadDependencyStart");
        }
        try {
            A0B(threadPolicy, str, null, null, i | 1);
            InterfaceC10426Hc0[] interfaceC10426Hc0Arr2 = atomicReference.get();
            if (interfaceC10426Hc0Arr2 != null && 0 < interfaceC10426Hc0Arr2.length) {
                throw BV4.A0a("onLoadDependencyEnd");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InterfaceC10426Hc0[] interfaceC10426Hc0Arr3 = atomicReference.get();
                if (interfaceC10426Hc0Arr3 != null && 0 < interfaceC10426Hc0Arr3.length) {
                    throw BV4.A0a("onLoadDependencyEnd");
                }
                throw th2;
            }
        }
    }

    public static void A09(ArrayList<C3g> arrayList, int i) {
        Context context = A03;
        C3205C3f c3205C3f = new C3205C3f();
        c3205C3f.A00 = new C3H(BV4.A0G(context.getApplicationInfo().nativeLibraryDir), i);
        C35.A00(BV4.A0k("Adding application source: ", c3205C3f));
        arrayList.add(0, c3205C3f);
    }

    public static boolean A0A() {
        if (A0E != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = A0A;
        BV4.A1S(reentrantReadWriteLock);
        try {
            return A0E != null;
        } finally {
            BV4.A1R(reentrantReadWriteLock);
        }
    }

    public static boolean loadLibrary(String str) {
        return A00 ? loadLibrary(str, 0) : C3463COl.loadLibrary(str);
    }

    public static File A02(String str) {
        File fileA03;
        String strA05 = A05(str);
        if (strA05 != null) {
            str = strA05;
        }
        String strMapLibraryName = System.mapLibraryName(str);
        ReentrantReadWriteLock reentrantReadWriteLock = A0A;
        BV4.A1S(reentrantReadWriteLock);
        try {
            if (A0E != null) {
                for (int i = 0; i < A0E.length; i++) {
                    try {
                        fileA03 = A0E[i].A03(strMapLibraryName);
                    } catch (IOException unused) {
                    }
                    if (fileA03 != null) {
                        return fileA03;
                    }
                }
            }
            BV4.A1R(reentrantReadWriteLock);
            return null;
        } finally {
            BV4.A1R(reentrantReadWriteLock);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0321 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0349 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0355 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x038a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0395 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A05(java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 1936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ETi.A05(java.lang.String):java.lang.String");
    }

    public static void A08(ArrayList<C3g> arrayList) {
        String strA0U = AbstractC3181C1l.A00() ? "/system/lib64:/system_ext/lib64:/vendor/lib64" : "/system/lib:/system_ext/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strA0U = FGI.A0U(str, ":", strA0U);
        }
        Iterator it = BV5.A0v(strA0U.split(":")).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C35.A00(FGI.A0M("adding system library source: ", str2));
            arrayList.add(new C3H(new File(str2), 2));
        }
    }

    public static boolean loadLibraryUnsafe(String str) {
        return loadLibrary(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0e98  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x0e99 A[Catch: UnsatisfiedLinkError -> 0x0eb6, all -> 0x0ec5, TryCatch #0 {UnsatisfiedLinkError -> 0x0eb6, blocks: (B:127:0x01d9, B:128:0x01e6, B:129:0x01e9, B:130:0x01f4, B:131:0x01f5, B:133:0x01fd, B:821:0x0ea2, B:820:0x0e99, B:134:0x0203, B:136:0x020c, B:137:0x0212, B:139:0x021b, B:140:0x0221, B:142:0x022a, B:143:0x0230, B:145:0x0238, B:146:0x023e, B:148:0x0246, B:149:0x024c, B:151:0x0254, B:152:0x025a, B:154:0x0262, B:155:0x0268, B:157:0x0271, B:158:0x0277, B:160:0x027f, B:161:0x0285, B:163:0x028d, B:164:0x0293, B:166:0x029b, B:167:0x02a1, B:169:0x02a9, B:170:0x02af, B:172:0x02b7, B:173:0x02bd, B:175:0x02c5, B:176:0x02cb, B:178:0x02d3, B:179:0x02d9, B:181:0x02e1, B:182:0x02e7, B:184:0x02ef, B:185:0x02f5, B:187:0x02fd, B:188:0x0303, B:190:0x030b, B:191:0x0311, B:193:0x0319, B:194:0x031f, B:196:0x0327, B:197:0x032d, B:199:0x0335, B:200:0x033b, B:202:0x0343, B:203:0x0349, B:205:0x0352, B:206:0x0358, B:208:0x0360, B:209:0x0366, B:211:0x036f, B:212:0x0375, B:214:0x037d, B:215:0x0383, B:217:0x038b, B:218:0x0391, B:220:0x0399, B:221:0x039f, B:223:0x03a7, B:224:0x03ad, B:226:0x03b5, B:227:0x03bb, B:229:0x03c3, B:230:0x03c9, B:232:0x03d1, B:233:0x03d7, B:235:0x03df, B:236:0x03e5, B:238:0x03ed, B:239:0x03f3, B:241:0x03fb, B:242:0x0401, B:244:0x0409, B:245:0x040f, B:247:0x0417, B:248:0x041d, B:250:0x0425, B:251:0x042b, B:253:0x0433, B:254:0x0439, B:256:0x0441, B:257:0x0447, B:259:0x044f, B:260:0x0455, B:262:0x045d, B:263:0x0463, B:265:0x046c, B:266:0x0472, B:268:0x047a, B:269:0x0480, B:271:0x0488, B:272:0x048e, B:274:0x0496, B:275:0x049c, B:277:0x04a4, B:278:0x04aa, B:280:0x04b2, B:281:0x04b8, B:283:0x04c0, B:284:0x04c6, B:286:0x04ce, B:287:0x04d4, B:289:0x04dc, B:290:0x04e2, B:292:0x04ea, B:293:0x04f0, B:295:0x04f8, B:296:0x04fe, B:298:0x0506, B:299:0x050c, B:301:0x0514, B:302:0x051a, B:304:0x0522, B:305:0x0528, B:307:0x0530, B:308:0x0536, B:310:0x053e, B:311:0x0544, B:313:0x054c, B:314:0x0552, B:316:0x055a, B:317:0x0560, B:319:0x0568, B:320:0x056e, B:322:0x0576, B:323:0x057c, B:325:0x0584, B:326:0x058a, B:328:0x0592, B:329:0x0598, B:331:0x05a0, B:332:0x05a6, B:334:0x05ae, B:335:0x05b4, B:337:0x05bc, B:338:0x05c2, B:340:0x05ca, B:341:0x05d0, B:343:0x05d8, B:344:0x05de, B:346:0x05e6, B:347:0x05ec, B:349:0x05f4, B:350:0x05fa, B:352:0x0602, B:353:0x0608, B:355:0x0610, B:356:0x0616, B:358:0x061e, B:359:0x0624, B:361:0x062c, B:362:0x0632, B:364:0x063b, B:365:0x0641, B:367:0x064a, B:368:0x0650, B:370:0x0658, B:371:0x065e, B:373:0x0666, B:374:0x066c, B:376:0x0674, B:377:0x067a, B:379:0x0683, B:380:0x0689, B:382:0x0692, B:383:0x0698, B:385:0x06a1, B:386:0x06a7, B:388:0x06af, B:389:0x06b5, B:391:0x06be, B:392:0x06c4, B:394:0x06cd, B:395:0x06d3, B:397:0x06db, B:398:0x06e1, B:400:0x06ea, B:401:0x06f0, B:403:0x06f8, B:404:0x06fe, B:406:0x0706, B:407:0x070c, B:409:0x0714, B:410:0x071a, B:412:0x0722, B:413:0x0728, B:415:0x0730, B:416:0x0736, B:418:0x073e, B:419:0x0744, B:421:0x074c, B:422:0x0752, B:424:0x075b, B:425:0x0761, B:427:0x0769, B:428:0x076f, B:430:0x0777, B:431:0x077d, B:433:0x0785, B:434:0x078b, B:436:0x0793, B:437:0x0799, B:439:0x07a1, B:440:0x07a7, B:442:0x07af, B:443:0x07b5, B:445:0x07bd, B:446:0x07c3, B:448:0x07cb, B:449:0x07d1, B:451:0x07da, B:452:0x07e0, B:454:0x07e8, B:455:0x07ee, B:457:0x07f6, B:458:0x07fc, B:460:0x0804, B:461:0x080a, B:463:0x0812, B:464:0x0818, B:466:0x0820, B:467:0x0826, B:469:0x082e, B:470:0x0834, B:472:0x083c, B:473:0x0842, B:475:0x084a, B:476:0x0850, B:478:0x0858, B:479:0x085e, B:481:0x0866, B:482:0x086c, B:484:0x0874, B:485:0x087a, B:487:0x0882, B:488:0x0888, B:490:0x0890, B:491:0x0896, B:493:0x089e, B:494:0x08a4, B:496:0x08ac, B:497:0x08b2, B:499:0x08ba, B:500:0x08c0, B:502:0x08c9, B:503:0x08cf, B:505:0x08d7, B:506:0x08dd, B:508:0x08e5, B:509:0x08eb, B:511:0x08f4, B:512:0x08fa, B:514:0x0902, B:515:0x0908, B:517:0x0910, B:518:0x0916, B:520:0x091e, B:521:0x0924, B:523:0x092c, B:524:0x0932, B:526:0x093a, B:527:0x0940, B:529:0x0948, B:530:0x094e, B:532:0x0956, B:533:0x095c, B:535:0x0964, B:536:0x096a, B:538:0x0972, B:539:0x0978, B:541:0x0980, B:542:0x0986, B:544:0x098f, B:545:0x0995, B:547:0x099e, B:548:0x09a4, B:550:0x09ac, B:551:0x09b2, B:553:0x09ba, B:554:0x09c0, B:556:0x09c9, B:557:0x09cf, B:559:0x09d7, B:560:0x09dd, B:562:0x09e5, B:563:0x09eb, B:565:0x09f3, B:566:0x09f9, B:568:0x0a02, B:569:0x0a08, B:571:0x0a10, B:572:0x0a16, B:574:0x0a1e, B:575:0x0a24, B:577:0x0a2c, B:578:0x0a32, B:580:0x0a3a, B:581:0x0a40, B:583:0x0a48, B:584:0x0a4e, B:586:0x0a56, B:587:0x0a5c, B:589:0x0a65, B:590:0x0a6b, B:592:0x0a73, B:593:0x0a79, B:595:0x0a81, B:596:0x0a87, B:598:0x0a8f, B:599:0x0a95, B:601:0x0a9d, B:602:0x0aa3, B:604:0x0aab, B:605:0x0ab1, B:607:0x0ab9, B:608:0x0abf, B:610:0x0ac8, B:611:0x0ace, B:613:0x0ad6, B:614:0x0adc, B:616:0x0ae4, B:617:0x0aea, B:619:0x0af2, B:620:0x0af8, B:622:0x0b00, B:623:0x0b06, B:625:0x0b0e, B:626:0x0b14, B:628:0x0b1d, B:629:0x0b23, B:631:0x0b2b, B:632:0x0b31, B:634:0x0b39, B:635:0x0b3f, B:637:0x0b47, B:638:0x0b4d, B:640:0x0b55, B:641:0x0b5b, B:643:0x0b64, B:644:0x0b6a, B:646:0x0b72, B:647:0x0b78, B:649:0x0b80, B:650:0x0b86, B:652:0x0b8e, B:653:0x0b94, B:655:0x0b9c, B:656:0x0ba2, B:658:0x0baa, B:659:0x0bb0, B:661:0x0bb8, B:662:0x0bbe, B:664:0x0bc6, B:665:0x0bcc, B:667:0x0bd4, B:668:0x0bda, B:670:0x0be2, B:671:0x0be8, B:673:0x0bf0, B:674:0x0bf6, B:676:0x0bfe, B:677:0x0c04, B:679:0x0c0c, B:680:0x0c12, B:682:0x0c1a, B:683:0x0c20, B:685:0x0c28, B:686:0x0c2e, B:688:0x0c36, B:689:0x0c3c, B:691:0x0c44, B:692:0x0c4a, B:694:0x0c52, B:695:0x0c58, B:697:0x0c60, B:698:0x0c66, B:700:0x0c6f, B:701:0x0c75, B:703:0x0c7d, B:704:0x0c83, B:706:0x0c8c, B:707:0x0c92, B:709:0x0c9a, B:710:0x0ca0, B:712:0x0ca8, B:713:0x0cae, B:715:0x0cb6, B:716:0x0cbc, B:718:0x0cc4, B:719:0x0cca, B:721:0x0cd2, B:722:0x0cd8, B:724:0x0ce0, B:725:0x0ce6, B:727:0x0cee, B:728:0x0cf4, B:730:0x0cfd, B:731:0x0d03, B:733:0x0d0c, B:734:0x0d12, B:736:0x0d1a, B:737:0x0d20, B:739:0x0d29, B:740:0x0d2f, B:742:0x0d37, B:743:0x0d3d, B:745:0x0d45, B:746:0x0d4b, B:748:0x0d53, B:749:0x0d59, B:751:0x0d62, B:752:0x0d68, B:754:0x0d70, B:755:0x0d76, B:757:0x0d7e, B:758:0x0d84, B:760:0x0d8c, B:761:0x0d92, B:763:0x0d9a, B:764:0x0da0, B:766:0x0da8, B:767:0x0dae, B:769:0x0db7, B:770:0x0dbd, B:772:0x0dc5, B:773:0x0dcb, B:775:0x0dd3, B:776:0x0dd9, B:778:0x0de2, B:779:0x0de8, B:781:0x0df0, B:782:0x0df6, B:784:0x0dfe, B:785:0x0e04, B:787:0x0e0c, B:788:0x0e12, B:790:0x0e1a, B:791:0x0e1f, B:793:0x0e27, B:794:0x0e2c, B:796:0x0e34, B:797:0x0e39, B:799:0x0e41, B:800:0x0e46, B:802:0x0e4f, B:803:0x0e54, B:805:0x0e5d, B:806:0x0e62, B:808:0x0e6a, B:809:0x0e6f, B:811:0x0e78, B:812:0x0e7d, B:814:0x0e85, B:815:0x0e8a, B:817:0x0e92), top: B:843:0x01d9, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0B(android.os.StrictMode.ThreadPolicy r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            Method dump skipped, instructions count: 4722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ETi.A0B(android.os.StrictMode$ThreadPolicy, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public static boolean loadLibrary(String str, int i) {
        boolean z;
        Throwable th;
        InterfaceC3204C3e[] interfaceC3204C3eArr;
        boolean z2;
        int i2 = 0;
        InterfaceC3204C3e[] interfaceC3204C3eArr2 = null;
        if (A0E == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = A0A;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (A0E == null) {
                    if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        if (!A0A()) {
                            throw new IllegalStateException("SoLoader.init() not called yet");
                        }
                    } else {
                        synchronized (ETi.class) {
                            try {
                                boolean zContains = A08.contains(str);
                                z2 = !zContains;
                                if (!zContains) {
                                    System.loadLibrary(str);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return z2;
                    }
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Log.w("SoLoader", FGI.A0U("Loading ", str, " on the main thread"));
        }
        if (!A00) {
            return C3463COl.loadLibrary(str);
        }
        String strA05 = A05(str);
        String str2 = str;
        if (strA05 != null) {
            str2 = strA05;
        }
        AtomicReference<InterfaceC10426Hc0[]> atomicReference = C3M.A00;
        InterfaceC10426Hc0[] interfaceC10426Hc0Arr = atomicReference.get();
        if (interfaceC10426Hc0Arr != null && 0 < interfaceC10426Hc0Arr.length) {
            throw new NullPointerException("onLoadLibraryStart");
        }
        try {
            String strMapLibraryName = System.mapLibraryName(str2);
            boolean z3 = false;
            while (true) {
                try {
                    boolean zA0B = A0B(null, strMapLibraryName, str, strA05, i);
                    InterfaceC10426Hc0[] interfaceC10426Hc0Arr2 = atomicReference.get();
                    if (interfaceC10426Hc0Arr2 == null || 0 >= interfaceC10426Hc0Arr2.length) {
                        return zA0B;
                    }
                    throw new NullPointerException("onLoadLibraryEnd");
                } catch (UnsatisfiedLinkError e) {
                    Log.w("SoLoader", FGI.A0d("Running a recovery step for ", strMapLibraryName, " due to ", e.toString()));
                    ReentrantReadWriteLock reentrantReadWriteLock2 = A0A;
                    reentrantReadWriteLock2.writeLock().lock();
                    InterfaceC3204C3e[] interfaceC3204C3eArr3 = interfaceC3204C3eArr2;
                    if (!z3) {
                        try {
                            try {
                                synchronized (ETi.class) {
                                    try {
                                        C3D c3d = A06;
                                        if (c3d == null) {
                                            z3 = false;
                                            interfaceC3204C3eArr = interfaceC3204C3eArr2;
                                        } else {
                                            C2W c2w = c3d.A02;
                                            C3B c3b = c3d.A01;
                                            C3C c3c = new C3C(c3b, c2w);
                                            C3E c3e = new C3E(c3b, c2w);
                                            C3197C2w c3197C2w = new C3197C2w();
                                            C3A c3a = new C3A(c3b);
                                            int i3 = c3d.A00;
                                            C3V c3v = new C3V();
                                            c3v.A00 = i3;
                                            InterfaceC3204C3e[] interfaceC3204C3eArr4 = {c3c, c3e, c3197C2w, c3a, c3v, new C39(), new C3U(), new C3197C2w()};
                                            i2 = 0;
                                            z3 = true;
                                            interfaceC3204C3eArr = interfaceC3204C3eArr4;
                                        }
                                        interfaceC3204C3eArr3 = interfaceC3204C3eArr;
                                        if (!z3) {
                                            Log.w("SoLoader", "No recovery strategy");
                                            throw e;
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                reentrantReadWriteLock2.writeLock().unlock();
                                throw th4;
                            }
                        } catch (NoBaseApkException e2) {
                            Log.e("SoLoader", "Base APK not found during recovery", e2);
                            th = e2;
                            throw th;
                        } catch (Exception e3) {
                            Log.e("SoLoader", "Got an exception during recovery, will throw the initial error instead", e3);
                            th = e;
                            throw th;
                        }
                    }
                    InterfaceC10426Hc0[] interfaceC10426Hc0Arr3 = atomicReference.get();
                    if (interfaceC10426Hc0Arr3 != null && 0 < interfaceC10426Hc0Arr3.length) {
                        throw new NullPointerException("onRecoveryStart");
                    }
                    try {
                        C3g[] c3gArr = A0E;
                        while (true) {
                            int i4 = i2;
                            if (i2 < interfaceC3204C3eArr3.length) {
                                i2++;
                                if (interfaceC3204C3eArr3[i4].AZs(e, c3gArr)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        InterfaceC10426Hc0[] interfaceC10426Hc0Arr4 = atomicReference.get();
                        if (interfaceC10426Hc0Arr4 != null && 0 < interfaceC10426Hc0Arr4.length) {
                            throw new NullPointerException("onRecoveryEnd");
                        }
                        if (z) {
                            A09.getAndIncrement();
                            reentrantReadWriteLock2.writeLock().unlock();
                            interfaceC3204C3eArr2 = interfaceC3204C3eArr3;
                        } else {
                            reentrantReadWriteLock2.writeLock().unlock();
                            Log.w("SoLoader", "Failed to recover");
                            throw e;
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            InterfaceC10426Hc0[] interfaceC10426Hc0Arr5 = atomicReference.get();
                            if (interfaceC10426Hc0Arr5 == null || 0 >= interfaceC10426Hc0Arr5.length) {
                                throw th6;
                            }
                            throw new NullPointerException("onRecoveryEnd");
                        }
                    }
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                InterfaceC10426Hc0[] interfaceC10426Hc0Arr6 = atomicReference.get();
                if (interfaceC10426Hc0Arr6 != null && 0 < interfaceC10426Hc0Arr6.length) {
                    throw new NullPointerException("onLoadLibraryEnd");
                }
                throw th8;
            }
        }
    }

    public static boolean loadLibraryUnsafe(String str, int i) {
        return loadLibrary(str, i);
    }
}
