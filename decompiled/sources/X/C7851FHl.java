package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;

/* renamed from: X.FHl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7851FHl {
    public static final C7851FHl A00 = new C7851FHl();

    public static final Rect A01(Context context, FDW fdw, int i) {
        int iA0B = AbstractC7608F5v.A0B(fdw, 114, i);
        int iA0B2 = AbstractC7608F5v.A0B(fdw, 109, i);
        int iA0B3 = AbstractC7608F5v.A0B(fdw, 111, i);
        int iA0B4 = AbstractC7608F5v.A0B(fdw, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, i);
        int iA0B5 = AbstractC7608F5v.A0B(fdw, 113, i);
        int iA0B6 = AbstractC7608F5v.A0B(fdw, 110, i);
        if (iA0B == 0 && iA0B2 == 0 && iA0B3 == 0 && iA0B4 == 0 && iA0B5 == 0 && iA0B6 == 0) {
            if (A04(fdw).intValue() != 0) {
                return FF4.A00.A05(context, fdw).A04;
            }
            return null;
        }
        int i2 = iA0B6;
        if (!FKH.A00(context)) {
            i2 = iA0B5;
            iA0B5 = iA0B6;
        }
        if (i2 != 0) {
            iA0B3 = i2;
        }
        if (iA0B5 != 0) {
            iA0B4 = iA0B5;
        }
        return new Rect(Math.max(0, iA0B3), Math.max(0, iA0B), Math.max(0, iA0B4), Math.max(0, iA0B2));
    }

    public static final boolean A09(FBB fbb, FDW fdw) {
        int iIntValue;
        C7384Etj.A0Y(fbb, 1);
        int i = fdw.A00;
        return !((i & 1) == 0 && (i & 2) == 0) && FBA.A04(fbb).A03 && ((iIntValue = A04(fdw).intValue()) == 0 || (iIntValue == 1 && FF4.A00.A05(FBB.A00(fbb), fdw).A06 == C79.A00));
    }

    public final int A0A(FDW fdw) {
        C7384Etj.A0Y(fdw, 0);
        int i = fdw.A05;
        if (i == 13327) {
            return 35;
        }
        if (i == 13708) {
            return 41;
        }
        if (i == 14093) {
            return 36;
        }
        if (i != 16444) {
            return i != 16675 ? 32 : 36;
        }
        return 42;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a3 A[Catch: ParsingException -> 0x03b1, TryCatch #2 {ParsingException -> 0x03b1, blocks: (B:181:0x0349, B:182:0x0353, B:183:0x0356, B:184:0x035c, B:204:0x039d, B:206:0x03a3, B:207:0x03ac, B:186:0x0360, B:189:0x036b, B:192:0x0372, B:196:0x037c, B:198:0x0384, B:200:0x0390), top: B:306:0x0349 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0349 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<X.InterfaceC7751FDd<?>, java.lang.Object> A0B(X.FCY<X.FBB, X.FCT<java.lang.Object>> r55, X.FDW r56, java.lang.Object r57) throws com.instagram.common.bloks.lexer.ParsingException {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7851FHl.A0B(X.FCY, X.FDW, java.lang.Object):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x086f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x086d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x084f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x084f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cc  */
    /* JADX WARN: Type inference failed for: r4v9, types: [X.F8S] */
    /* JADX WARN: Type inference failed for: r6v106, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v111, types: [android.net.Uri] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.FGT<?> A0D(final X.FBB r29, X.FDW r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7851FHl.A0D(X.FBB, X.FDW):X.FGT");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FDr<LX/FBB;>;LX/FDW;LX/FGT<*>;II)LX/FGe; */
    public static final FJC A03(C7764FDr c7764FDr, FGT fgt, FDW fdw, int i, int i2) {
        FDW fdwA0C = fdw.A0C(36);
        if (fdwA0C == null) {
            throw C3cG.A0Q("bk.cds.bottomsheet.Wrapper has no content.");
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        FDW fdwA0C2 = fdw.A0C(40);
        FET fetA00 = fdwA0C2 != null ? FEE.A00(c7764FDr, fdwA0C2, C7827FGi.A00(i, iMakeMeasureSpec)) : null;
        int size = View.MeasureSpec.getSize(i2);
        int i3 = fetA00 != null ? fetA00.A00 : 0;
        InterfaceC7823FGe interfaceC7823FGeA5j = fdwA0C.A5j(c7764FDr, i, View.MeasureSpec.makeMeasureSpec(size - i3, Integer.MIN_VALUE));
        C7384Etj.A0U(interfaceC7823FGeA5j);
        return new FJC(interfaceC7823FGeA5j, fgt, fetA00, View.MeasureSpec.getSize(i), interfaceC7823FGeA5j.getHeight() + i3, 0, i3);
    }

    public static final Integer A04(FDW fdw) {
        Integer num = C79.A00;
        String strA0F = fdw.A0F(96);
        FDW fdwA0C = fdw.A0C(94);
        if (strA0F == null || fdwA0C == null) {
            return num;
        }
        if (strA0F.equals("grid")) {
            if (fdwA0C.A05 == 16373) {
                return C79.A01;
            }
            throw C60O.A0i("CollectionLayoutUtils: requested \"grid\" layout_config_type, but provided layout_config doesn't match bk.types.GridCollectionLayoutConfig");
        }
        if (!strA0F.equals("staggered_grid")) {
            return num;
        }
        if (fdwA0C.A05 == 16483) {
            return C79.A0C;
        }
        throw C60O.A0i("CollectionLayoutUtils: requested \"staggered_grid\" layout_config_type, but provided layout_config doesn't match bk.types.StaggeredGridCollectionLayoutConfig");
    }

    public static final <R> R A05(C7764FDr<FBB> c7764FDr, G0U<? super InterfaceC7780FEk, ? extends R> g0u) {
        C7763FDq c7763FDq = new C7763FDq(c7764FDr);
        FCN fcnA00 = AbstractC7757FDj.A00();
        C0938AIr c0938AIr = fcnA00.A02;
        fcnA00.A02 = null;
        try {
            R rInvoke = g0u.invoke(c7763FDq);
            fcnA00.A02 = c0938AIr;
            FDX fdxA01 = AbstractC7752FDe.A02.A01();
            if (fdxA01 != null && fdxA01.A09) {
                FDu fDu = new FDu(g0u);
                ArrayList arrayListA0h = fdxA01.A01;
                if (arrayListA0h == null) {
                    arrayListA0h = C3cG.A0h();
                    fdxA01.A01 = arrayListA0h;
                }
                arrayListA0h.add(fDu);
                fdxA01.A03 = true;
            }
            return rInvoke;
        } catch (Throwable th) {
            fcnA00.A02 = c0938AIr;
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A06(java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7851FHl.A06(java.lang.String):java.lang.String");
    }

    public static final void A07(FKW fkw, Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            fkw.A0Z = iIntValue != 1 ? (iIntValue == 8388611 || iIntValue != 8388613) ? C79.A00 : C79.A01 : C79.A0C;
        }
    }

    public static int A00(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size < Integer.MAX_VALUE) {
            return size;
        }
        return Integer.MAX_VALUE;
    }

    public static FSF A02(FSF fsf, Float f, Integer num, Integer num2) {
        int iIntValue = num2.intValue();
        int iIntValue2 = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue2 != 0 && iIntValue2 != 1 && iIntValue2 != 2) {
                throw C60Q.A0U("Invalid gravity type :", FKB.A00(num));
            }
            if (fsf instanceof C7878FIr) {
                FSH fsh = ((C7878FIr) fsf).A00;
                if (fsh.A02 == num && F8G.A00(fsh.A01, f)) {
                    return fsf;
                }
            }
            C7878FIr c7878FIr = new C7878FIr();
            FSH fsh2 = new FSH();
            fsh2.A00 = -1;
            fsh2.A02 = num;
            fsh2.A01 = f;
            c7878FIr.A00 = fsh2;
            return c7878FIr;
        }
        if (iIntValue2 != 0 && iIntValue2 != 1 && iIntValue2 != 2) {
            throw C60Q.A0U("Invalid gravity type :", FKB.A00(num));
        }
        if (fsf instanceof C7877FIq) {
            FSH fsh3 = ((C7877FIq) fsf).A00;
            if (fsh3.A02 == num && F8G.A00(fsh3.A01, f)) {
                return fsf;
            }
        }
        C7877FIq c7877FIq = new C7877FIq();
        FSH fsh4 = new FSH();
        fsh4.A00 = -1;
        fsh4.A02 = num;
        fsh4.A01 = f;
        c7877FIq.A00 = fsh4;
        return c7877FIq;
    }

    public static final void A08(FBB fbb, FDW fdw, int i) {
        if (fdw.A0J(i) && FBA.A0A(fbb)) {
            FBA.A04(fbb);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Incorrect types in method signature: (LX/FDr<LX/FBB;>;LX/FDW;LX/FGT<*>;II)LX/FGe; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1050:0x17d2  */
    /* JADX WARN: Removed duplicated region for block: B:1058:0x17f9  */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x182b  */
    /* JADX WARN: Removed duplicated region for block: B:1086:0x185d  */
    /* JADX WARN: Removed duplicated region for block: B:1113:0x18b7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:1138:0x1930  */
    /* JADX WARN: Removed duplicated region for block: B:1151:0x1963  */
    /* JADX WARN: Removed duplicated region for block: B:1158:0x197d  */
    /* JADX WARN: Removed duplicated region for block: B:1190:0x19f5  */
    /* JADX WARN: Removed duplicated region for block: B:1218:0x1a65  */
    /* JADX WARN: Removed duplicated region for block: B:1220:0x1a6b  */
    /* JADX WARN: Removed duplicated region for block: B:1231:0x1a93 A[PHI: r9
  0x1a93: PHI (r9v6 java.lang.String) = (r9v5 java.lang.String), (r9v57 java.lang.String) binds: [B:1227:0x1a87, B:1230:0x1a91] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1232:0x1a96  */
    /* JADX WARN: Removed duplicated region for block: B:1235:0x1aa5 A[Catch: ParsingException -> 0x1afd, TryCatch #0 {ParsingException -> 0x1afd, blocks: (B:1233:0x1a9f, B:1235:0x1aa5, B:1237:0x1aaf, B:1239:0x1ab5, B:1242:0x1abc, B:1243:0x1ac0, B:1244:0x1ad1, B:1246:0x1adb, B:1248:0x1ae1, B:1251:0x1ae8, B:1252:0x1aec), top: B:1553:0x1a9f }] */
    /* JADX WARN: Removed duplicated region for block: B:1244:0x1ad1 A[Catch: ParsingException -> 0x1afd, TryCatch #0 {ParsingException -> 0x1afd, blocks: (B:1233:0x1a9f, B:1235:0x1aa5, B:1237:0x1aaf, B:1239:0x1ab5, B:1242:0x1abc, B:1243:0x1ac0, B:1244:0x1ad1, B:1246:0x1adb, B:1248:0x1ae1, B:1251:0x1ae8, B:1252:0x1aec), top: B:1553:0x1a9f }] */
    /* JADX WARN: Removed duplicated region for block: B:1260:0x1b17 A[PHI: r9
  0x1b17: PHI (r9v17 java.lang.String) = (r9v16 java.lang.String), (r9v56 java.lang.String) binds: [B:1256:0x1b0b, B:1259:0x1b15] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1263:0x1b1f A[Catch: ParsingException -> 0x1b77, TryCatch #14 {ParsingException -> 0x1b77, blocks: (B:1261:0x1b19, B:1263:0x1b1f, B:1265:0x1b29, B:1267:0x1b2f, B:1270:0x1b36, B:1271:0x1b3a, B:1272:0x1b4b, B:1274:0x1b55, B:1276:0x1b5b, B:1279:0x1b62, B:1280:0x1b66), top: B:1574:0x1b19 }] */
    /* JADX WARN: Removed duplicated region for block: B:1272:0x1b4b A[Catch: ParsingException -> 0x1b77, TryCatch #14 {ParsingException -> 0x1b77, blocks: (B:1261:0x1b19, B:1263:0x1b1f, B:1265:0x1b29, B:1267:0x1b2f, B:1270:0x1b36, B:1271:0x1b3a, B:1272:0x1b4b, B:1274:0x1b55, B:1276:0x1b5b, B:1279:0x1b62, B:1280:0x1b66), top: B:1574:0x1b19 }] */
    /* JADX WARN: Removed duplicated region for block: B:1290:0x1b97 A[Catch: ParsingException -> 0x1bf5, TryCatch #11 {ParsingException -> 0x1bf5, blocks: (B:1288:0x1b91, B:1290:0x1b97, B:1292:0x1ba1, B:1294:0x1ba8, B:1297:0x1baf, B:1298:0x1bb3, B:1299:0x1bc6, B:1301:0x1bd0, B:1303:0x1bd7, B:1306:0x1bde, B:1307:0x1be2), top: B:1569:0x1b91 }] */
    /* JADX WARN: Removed duplicated region for block: B:1299:0x1bc6 A[Catch: ParsingException -> 0x1bf5, TryCatch #11 {ParsingException -> 0x1bf5, blocks: (B:1288:0x1b91, B:1290:0x1b97, B:1292:0x1ba1, B:1294:0x1ba8, B:1297:0x1baf, B:1298:0x1bb3, B:1299:0x1bc6, B:1301:0x1bd0, B:1303:0x1bd7, B:1306:0x1bde, B:1307:0x1be2), top: B:1569:0x1b91 }] */
    /* JADX WARN: Removed duplicated region for block: B:1317:0x1c11 A[Catch: ParsingException -> 0x1c6f, TryCatch #5 {ParsingException -> 0x1c6f, blocks: (B:1315:0x1c0b, B:1317:0x1c11, B:1319:0x1c1b, B:1321:0x1c22, B:1324:0x1c29, B:1325:0x1c2d, B:1326:0x1c40, B:1328:0x1c4a, B:1330:0x1c51, B:1333:0x1c58, B:1334:0x1c5c), top: B:1561:0x1c0b }] */
    /* JADX WARN: Removed duplicated region for block: B:1326:0x1c40 A[Catch: ParsingException -> 0x1c6f, TryCatch #5 {ParsingException -> 0x1c6f, blocks: (B:1315:0x1c0b, B:1317:0x1c11, B:1319:0x1c1b, B:1321:0x1c22, B:1324:0x1c29, B:1325:0x1c2d, B:1326:0x1c40, B:1328:0x1c4a, B:1330:0x1c51, B:1333:0x1c58, B:1334:0x1c5c), top: B:1561:0x1c0b }] */
    /* JADX WARN: Removed duplicated region for block: B:1344:0x1c8b A[Catch: ParsingException -> 0x1ce3, TryCatch #1 {ParsingException -> 0x1ce3, blocks: (B:1342:0x1c85, B:1344:0x1c8b, B:1346:0x1c95, B:1348:0x1c9b, B:1351:0x1ca2, B:1352:0x1ca6, B:1353:0x1cb7, B:1355:0x1cc1, B:1357:0x1cc7, B:1360:0x1cce, B:1361:0x1cd2), top: B:1554:0x1c85 }] */
    /* JADX WARN: Removed duplicated region for block: B:1353:0x1cb7 A[Catch: ParsingException -> 0x1ce3, TryCatch #1 {ParsingException -> 0x1ce3, blocks: (B:1342:0x1c85, B:1344:0x1c8b, B:1346:0x1c95, B:1348:0x1c9b, B:1351:0x1ca2, B:1352:0x1ca6, B:1353:0x1cb7, B:1355:0x1cc1, B:1357:0x1cc7, B:1360:0x1cce, B:1361:0x1cd2), top: B:1554:0x1c85 }] */
    /* JADX WARN: Removed duplicated region for block: B:1371:0x1d01 A[Catch: ParsingException -> 0x1d59, TryCatch #15 {ParsingException -> 0x1d59, blocks: (B:1369:0x1cfb, B:1371:0x1d01, B:1373:0x1d0b, B:1375:0x1d11, B:1378:0x1d18, B:1379:0x1d1c, B:1380:0x1d2d, B:1382:0x1d37, B:1384:0x1d3d, B:1387:0x1d44, B:1388:0x1d48), top: B:1575:0x1cfb }] */
    /* JADX WARN: Removed duplicated region for block: B:1380:0x1d2d A[Catch: ParsingException -> 0x1d59, TryCatch #15 {ParsingException -> 0x1d59, blocks: (B:1369:0x1cfb, B:1371:0x1d01, B:1373:0x1d0b, B:1375:0x1d11, B:1378:0x1d18, B:1379:0x1d1c, B:1380:0x1d2d, B:1382:0x1d37, B:1384:0x1d3d, B:1387:0x1d44, B:1388:0x1d48), top: B:1575:0x1cfb }] */
    /* JADX WARN: Removed duplicated region for block: B:1393:0x1d67  */
    /* JADX WARN: Removed duplicated region for block: B:1477:0x1e9f  */
    /* JADX WARN: Removed duplicated region for block: B:1496:0x1f58  */
    /* JADX WARN: Removed duplicated region for block: B:1514:0x1fdb  */
    /* JADX WARN: Removed duplicated region for block: B:1554:0x1c85 A[EXC_TOP_SPLITTER, PHI: r9
  0x1c85: PHI (r9v30 java.lang.String) = (r9v29 java.lang.String), (r9v55 java.lang.String) binds: [B:1338:0x1c79, B:1341:0x1c83] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1561:0x1c0b A[EXC_TOP_SPLITTER, PHI: r10
  0x1c0b: PHI (r10v16 java.lang.String) = (r10v15 java.lang.String), (r10v41 java.lang.String) binds: [B:1311:0x1c01, B:1314:0x1c09] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1563:0x0ab9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1564:0x1e43 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1569:0x1b91 A[EXC_TOP_SPLITTER, PHI: r10
  0x1b91: PHI (r10v5 java.lang.String) = (r10v4 java.lang.String), (r10v42 java.lang.String) binds: [B:1284:0x1b87, B:1287:0x1b8f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1570:0x1de7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1575:0x1cfb A[EXC_TOP_SPLITTER, PHI: r6
  0x1cfb: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v30 java.lang.String) binds: [B:1365:0x1cef, B:1368:0x1cf9] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1576:0x1d8b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1620:0x09b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1623:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1629:0x0c29 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1632:0x0c25 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1663:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0785 A[PHI: r16
  0x0785: PHI (r16v26 boolean) = (r16v18 boolean), (r16v27 boolean), (r16v27 boolean) binds: [B:288:0x077d, B:430:0x0a0f, B:291:0x0783] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0928 A[Catch: all -> 0x0cd7, TryCatch #9 {, blocks: (B:309:0x07e0, B:310:0x07f5, B:312:0x07fb, B:315:0x0810, B:316:0x082d, B:317:0x084e, B:319:0x0854, B:320:0x0869, B:323:0x0877, B:326:0x0888, B:329:0x08a0, B:331:0x08ae, B:334:0x08b8, B:336:0x08bc, B:338:0x08c2, B:339:0x08c4, B:341:0x08c8, B:343:0x08cc, B:346:0x08d8, B:349:0x08e6, B:351:0x08ee, B:359:0x0902, B:361:0x091a, B:363:0x0922, B:365:0x0928, B:366:0x0940, B:368:0x094a, B:371:0x0950, B:372:0x0952, B:376:0x095b, B:383:0x096e, B:381:0x096a, B:384:0x0970, B:387:0x0980, B:388:0x0982, B:392:0x098b, B:399:0x099c, B:397:0x0998, B:400:0x099e, B:402:0x09a2, B:408:0x09ad, B:409:0x09b1, B:390:0x0987, B:391:0x0989, B:374:0x0957, B:375:0x0959, B:404:0x09a6, B:412:0x09b9, B:416:0x09c9, B:414:0x09be, B:415:0x09c3, B:417:0x09cb, B:421:0x09d3, B:422:0x09d5, B:426:0x09e4, B:427:0x09e8, B:425:0x09dd, B:357:0x08fc, B:452:0x0ab9, B:453:0x0add, B:455:0x0ae3, B:456:0x0af8, B:459:0x0b0e, B:462:0x0b26, B:464:0x0b39, B:465:0x0b3b, B:467:0x0b41, B:473:0x0b51, B:476:0x0b5f, B:478:0x0b67, B:486:0x0b7b, B:488:0x0b93, B:490:0x0b9b, B:492:0x0ba1, B:493:0x0bb9, B:495:0x0bc3, B:498:0x0bc9, B:499:0x0bcb, B:503:0x0bd4, B:510:0x0be9, B:508:0x0be5, B:511:0x0beb, B:514:0x0bfb, B:515:0x0bfd, B:519:0x0c06, B:526:0x0c17, B:524:0x0c13, B:527:0x0c19, B:529:0x0c1e, B:533:0x0c25, B:534:0x0c29, B:517:0x0c02, B:518:0x0c04, B:501:0x0bd0, B:502:0x0bd2, B:537:0x0c31, B:543:0x0c47, B:546:0x0c4d, B:547:0x0c4f, B:551:0x0c59, B:552:0x0c5b, B:541:0x0c3c, B:542:0x0c41, B:484:0x0b75, B:588:0x0cd0, B:589:0x0cd6), top: B:1566:0x075f, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0ba1 A[Catch: ParsingException -> 0x0cd0, all -> 0x0cd7, TryCatch #7 {ParsingException -> 0x0cd0, blocks: (B:452:0x0ab9, B:453:0x0add, B:455:0x0ae3, B:456:0x0af8, B:459:0x0b0e, B:462:0x0b26, B:464:0x0b39, B:465:0x0b3b, B:467:0x0b41, B:473:0x0b51, B:476:0x0b5f, B:478:0x0b67, B:486:0x0b7b, B:488:0x0b93, B:490:0x0b9b, B:492:0x0ba1, B:493:0x0bb9, B:495:0x0bc3, B:498:0x0bc9, B:499:0x0bcb, B:503:0x0bd4, B:510:0x0be9, B:508:0x0be5, B:511:0x0beb, B:514:0x0bfb, B:515:0x0bfd, B:519:0x0c06, B:526:0x0c17, B:524:0x0c13, B:527:0x0c19, B:529:0x0c1e, B:533:0x0c25, B:534:0x0c29, B:517:0x0c02, B:518:0x0c04, B:501:0x0bd0, B:502:0x0bd2, B:537:0x0c31, B:543:0x0c47, B:546:0x0c4d, B:547:0x0c4f, B:551:0x0c59, B:552:0x0c5b, B:541:0x0c3c, B:542:0x0c41, B:484:0x0b75), top: B:1563:0x0ab9, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x11ed  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x1235  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x1243  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x124f  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x127b  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x1288  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x1294  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x12a4  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x12b4  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x12d0  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x12e0  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x12ef  */
    /* JADX WARN: Removed duplicated region for block: B:843:0x12f9  */
    /* JADX WARN: Removed duplicated region for block: B:846:0x1305  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x1346  */
    /* JADX WARN: Removed duplicated region for block: B:860:0x135c  */
    /* JADX WARN: Removed duplicated region for block: B:927:0x14f2  */
    /* JADX WARN: Removed duplicated region for block: B:930:0x152e  */
    /* JADX WARN: Removed duplicated region for block: B:933:0x1539  */
    /* JADX WARN: Removed duplicated region for block: B:936:0x1571  */
    /* JADX WARN: Removed duplicated region for block: B:943:0x15b2  */
    /* JADX WARN: Removed duplicated region for block: B:959:0x1602  */
    /* JADX WARN: Removed duplicated region for block: B:961:0x160b  */
    /* JADX WARN: Removed duplicated region for block: B:964:0x1614  */
    /* JADX WARN: Removed duplicated region for block: B:966:0x1617  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x1624  */
    /* JADX WARN: Removed duplicated region for block: B:976:0x1630  */
    /* JADX WARN: Removed duplicated region for block: B:981:0x165a  */
    /* JADX WARN: Removed duplicated region for block: B:983:0x1665 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.FDW, X.FDd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v184, types: [X.FDW] */
    /* JADX WARN: Type inference failed for: r0v189, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v3, types: [X.FF4] */
    /* JADX WARN: Type inference failed for: r6v145, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v146, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r6v157, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v160, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v161, types: [X.FF4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC7823FGe A0C(X.C7764FDr r46, X.FGT r47, X.FDW r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 8618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7851FHl.A0C(X.FDr, X.FGT, X.FDW, int, int):X.FGe");
    }
}
