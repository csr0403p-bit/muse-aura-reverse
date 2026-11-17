package X;

import com.facebook.aura.network.api.HatchUrlSegments;
import java.io.IOException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A0M' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Gub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC10321Gub {
    public static final /* synthetic */ EnumC10321Gub[] A00;
    public static final EnumC10321Gub A01;
    public static final EnumC10321Gub A02;
    public static final EnumC10321Gub A03;
    public static final EnumC10321Gub A04;
    public static final EnumC10321Gub A05;
    public static final EnumC10321Gub A06;
    public static final EnumC10321Gub A07;
    public static final EnumC10321Gub A08;
    public static final EnumC10321Gub A09;
    public static final EnumC10321Gub A0A;
    public static final EnumC10321Gub A0B;
    public static final EnumC10321Gub A0C;
    public static final EnumC10321Gub A0D;
    public static final EnumC10321Gub A0E;
    public static final EnumC10321Gub A0F;
    public static final EnumC10321Gub A0G;
    public static final EnumC10321Gub A0H;
    public static final EnumC10321Gub A0I;
    public static final EnumC10321Gub A0J;
    public static final EnumC10321Gub A0K;
    public static final EnumC10321Gub A0L;
    public static final EnumC10321Gub A0M;
    public static final EnumC10321Gub A0N;

    static {
        final int i = 0;
        final int i2 = 10;
        EnumC10321Gub enumC10321Gub = new EnumC10321Gub(i2) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i3;
                this.$t = i2;
                switch (i2) {
                    case 0:
                        str = "InCaption";
                        i3 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i3 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i3 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i3 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i3 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i3 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i3 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i3 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i3 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i3 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i3 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i3 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i3 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i3 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i3 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i3 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i3 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i3 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i3 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i3 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i3 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i3 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i3 = 8;
                        break;
                }
                super(str, i3);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub2) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub2);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final boolean A05(X.C10316GuW r8, X.AbstractC10326Gug r9) {
                /*
                    r7 = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:1021:0x1195, code lost:
            
                if (r8.equals("noscript") != false) goto L1022;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1035:0x11d5, code lost:
            
                if (X.Gt5.A09(r1, X.AbstractC10319GuZ.A0R) != false) goto L1291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1045:0x120b, code lost:
            
                if (X.Gt5.A09(r5, X.AbstractC10319GuZ.A0S) != false) goto L1046;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1066:0x124e, code lost:
            
                if (r18.A0c("html", "http://www.w3.org/1999/xhtml") != false) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1082:0x129b, code lost:
            
                if (r1.equals("html") == false) goto L1077;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1088:0x12af, code lost:
            
                if (r1.equals("template") == false) goto L1077;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1093:0x12be, code lost:
            
                if (r6.equals("template") != false) goto L1094;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1104:0x12ec, code lost:
            
                if (r1.A08("type").equalsIgnoreCase("hidden") != false) goto L1114;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1154:0x13e2, code lost:
            
                if (X.Gt5.A09(r1, X.AbstractC10319GuZ.A0H) != false) goto L1155;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1156:0x13ea, code lost:
            
                if (X.C10316GuW.A07(r1, r18, 8) == false) goto L1291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1186:0x14a7, code lost:
            
                if (X.Gt5.A09(r5.A04(), X.AbstractC10319GuZ.A0D) != false) goto L1187;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x01ef, code lost:
            
                if (r0 != false) goto L123;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1259:0x15f2, code lost:
            
                if (r1.equals("template") == false) goto L1291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1285:0x165b, code lost:
            
                if (X.Gt5.A09(r1, X.AbstractC10319GuZ.A0N) != false) goto L1286;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1287:0x1663, code lost:
            
                if (X.C10316GuW.A07("tr", r18, 8) == false) goto L1291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:1290:0x166c, code lost:
            
                if (X.Gt5.A09(r7, X.AbstractC10319GuZ.A0M) != false) goto L1291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
            
                if (r1 == X.EnumC10321Gub.A0N) goto L1213;
             */
            /* JADX WARN: Code restructure failed: missing block: B:209:0x0338, code lost:
            
                r18.A0U(r17);
             */
            /* JADX WARN: Code restructure failed: missing block: B:412:0x0683, code lost:
            
                if (X.Gt5.A09(r13, X.AbstractC10319GuZ.A08) != false) goto L1291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:612:0x0a60, code lost:
            
                if (r1.equals("head") != false) goto L1187;
             */
            /* JADX WARN: Code restructure failed: missing block: B:619:0x0a7e, code lost:
            
                if (r1.equals("template") != false) goto L1094;
             */
            /* JADX WARN: Code restructure failed: missing block: B:656:0x0b4d, code lost:
            
                if (r18.A0Z() == false) goto L657;
             */
            /* JADX WARN: Code restructure failed: missing block: B:821:0x0e32, code lost:
            
                if (r0 != false) goto L915;
             */
            /* JADX WARN: Code restructure failed: missing block: B:827:0x0e46, code lost:
            
                if (r0 != false) goto L924;
             */
            /* JADX WARN: Code restructure failed: missing block: B:888:0x0f77, code lost:
            
                if (r1.equals("noframes") == false) goto L1291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:891:0x0f7f, code lost:
            
                if (r1.equals("html") == false) goto L1291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:914:0x0fd2, code lost:
            
                if (r0 != false) goto L915;
             */
            /* JADX WARN: Code restructure failed: missing block: B:923:0x0ff6, code lost:
            
                if (r0 != false) goto L924;
             */
            /* JADX WARN: Code restructure failed: missing block: B:924:0x0ff8, code lost:
            
                r0 = X.EnumC10321Gub.A0E;
                r3 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:926:0x0ffe, code lost:
            
                if (r7 == X.C79.A0W) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:969:0x10c8, code lost:
            
                if (A02(r3, "template") != false) goto L970;
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:1079:0x128b  */
            /* JADX WARN: Removed duplicated region for block: B:1126:0x1353  */
            /* JADX WARN: Removed duplicated region for block: B:1131:0x1368  */
            /* JADX WARN: Removed duplicated region for block: B:1132:0x136d  */
            /* JADX WARN: Removed duplicated region for block: B:1134:0x1374  */
            /* JADX WARN: Removed duplicated region for block: B:1197:0x14c8  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x01eb  */
            /* JADX WARN: Removed duplicated region for block: B:1210:0x1500  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x01fa  */
            /* JADX WARN: Removed duplicated region for block: B:1291:0x166e A[PHI: r5
  0x166e: PHI (r5v49 boolean) = 
  (r5v7 boolean)
  (r5v7 boolean)
  (r5v7 boolean)
  (r5v7 boolean)
  (r5v8 boolean)
  (r5v8 boolean)
  (r5v10 boolean)
  (r5v18 boolean)
  (r5v18 boolean)
  (r5v19 boolean)
  (r5v19 boolean)
  (r5v19 boolean)
  (r5v19 boolean)
  (r5v19 boolean)
  (r5v19 boolean)
  (r5v19 boolean)
  (r5v19 boolean)
  (r5v25 boolean)
  (r5v25 boolean)
  (r5v26 boolean)
  (r5v26 boolean)
  (r5v26 boolean)
  (r5v26 boolean)
  (r5v26 boolean)
  (r5v26 boolean)
  (r5v26 boolean)
  (r5v26 boolean)
  (r5v33 boolean)
  (r5v36 boolean)
  (r5v36 boolean)
  (r5v39 boolean)
  (r5v39 boolean)
  (r5v39 boolean)
  (r5v41 boolean)
  (r5v41 boolean)
  (r5v41 boolean)
  (r5v46 boolean)
  (r5v46 boolean)
  (r5v67 boolean)
  (r5v70 boolean)
 binds: [B:1290:0x166c, B:1280:0x164c, B:1168:0x143a, B:1287:0x1663, B:1156:0x13ea, B:1152:0x13da, B:1073:0x126a, B:1035:0x11d5, B:1030:0x11bb, B:974:0x10e1, B:1021:0x1195, B:978:0x10f5, B:1259:0x15f2, B:1116:0x1328, B:984:0x110c, B:986:0x1112, B:981:0x10fe, B:910:0x0fc2, B:926:0x0ffe, B:875:0x0f3c, B:903:0x0fa8, B:898:0x0f97, B:879:0x0f54, B:891:0x0f7f, B:888:0x0f77, B:885:0x0f6a, B:882:0x0f5f, B:738:0x0cc4, B:727:0x0c91, B:1244:0x15b4, B:675:0x0b94, B:721:0x0c6a, B:686:0x0bbc, B:632:0x0ac6, B:1091:0x12b8, B:663:0x0b6c, B:581:0x09bf, B:1237:0x1593, B:446:0x0729, B:412:0x0683] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
            /* JADX WARN: Removed duplicated region for block: B:465:0x0784  */
            /* JADX WARN: Removed duplicated region for block: B:493:0x0808  */
            /* JADX WARN: Removed duplicated region for block: B:547:0x090e A[PHI: r5
  0x090e: PHI (r5v68 X.Guh) = (r5v58 X.Guh), (r5v69 X.Guh) binds: [B:546:0x090c, B:231:0x03ba] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:783:0x0d82  */
            /* JADX WARN: Removed duplicated region for block: B:841:0x0e79  */
            /* JADX WARN: Removed duplicated region for block: B:857:0x0eea  */
            /* JADX WARN: Removed duplicated region for block: B:864:0x0f11  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
            @Override // X.EnumC10321Gub
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean A04(X.C10316GuW r18, X.AbstractC10326Gug r19) throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0M = enumC10321Gub;
        final int i3 = 1;
        final int i4 = 15;
        EnumC10321Gub enumC10321Gub2 = new EnumC10321Gub(i4) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i4;
                switch (i4) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A07 = enumC10321Gub2;
        final int i5 = 2;
        final int i6 = 16;
        EnumC10321Gub enumC10321Gub3 = new EnumC10321Gub(i6) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i6;
                switch (i6) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A06 = enumC10321Gub3;
        final int i7 = 3;
        final int i8 = 17;
        EnumC10321Gub enumC10321Gub4 = new EnumC10321Gub(i8) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i8;
                switch (i8) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0E = enumC10321Gub4;
        final int i9 = 4;
        final int i10 = 18;
        EnumC10321Gub enumC10321Gub5 = new EnumC10321Gub(i10) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i10;
                switch (i10) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A05 = enumC10321Gub5;
        final int i11 = 5;
        final int i12 = 19;
        EnumC10321Gub enumC10321Gub6 = new EnumC10321Gub(i12) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i12;
                switch (i12) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A09 = enumC10321Gub6;
        final int i13 = 6;
        final int i14 = 20;
        EnumC10321Gub enumC10321Gub7 = new EnumC10321Gub(i14) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i14;
                switch (i14) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0N = enumC10321Gub7;
        final int i15 = 7;
        final int i16 = 21;
        EnumC10321Gub enumC10321Gub8 = new EnumC10321Gub(i16) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i16;
                switch (i16) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0I = enumC10321Gub8;
        final int i17 = 8;
        final int i18 = 22;
        EnumC10321Gub enumC10321Gub9 = new EnumC10321Gub(i18) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i18;
                switch (i18) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0K = enumC10321Gub9;
        final int i19 = 9;
        EnumC10321Gub enumC10321Gub10 = new EnumC10321Gub(i) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i;
                switch (i) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0A = enumC10321Gub10;
        EnumC10321Gub enumC10321Gub11 = new EnumC10321Gub(i3) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i3;
                switch (i3) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0C = enumC10321Gub11;
        final int i20 = 11;
        EnumC10321Gub enumC10321Gub12 = new EnumC10321Gub(i5) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i5;
                switch (i5) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0J = enumC10321Gub12;
        final int i21 = 12;
        EnumC10321Gub enumC10321Gub13 = new EnumC10321Gub(i7) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i7;
                switch (i7) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0F = enumC10321Gub13;
        final int i22 = 13;
        EnumC10321Gub enumC10321Gub14 = new EnumC10321Gub(i9) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i9;
                switch (i9) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0B = enumC10321Gub14;
        final int i23 = 14;
        EnumC10321Gub enumC10321Gub15 = new EnumC10321Gub(i11) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i11;
                switch (i11) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0G = enumC10321Gub15;
        EnumC10321Gub enumC10321Gub16 = new EnumC10321Gub(i13) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i13;
                switch (i13) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0H = enumC10321Gub16;
        EnumC10321Gub enumC10321Gub17 = new EnumC10321Gub(i15) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i15;
                switch (i15) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0L = enumC10321Gub17;
        EnumC10321Gub enumC10321Gub18 = new EnumC10321Gub(i17) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i17;
                switch (i17) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A03 = enumC10321Gub18;
        EnumC10321Gub enumC10321Gub19 = new EnumC10321Gub(i19) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i19;
                switch (i19) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A0D = enumC10321Gub19;
        EnumC10321Gub enumC10321Gub20 = new EnumC10321Gub(i20) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i20;
                switch (i20) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A04 = enumC10321Gub20;
        EnumC10321Gub enumC10321Gub21 = new EnumC10321Gub(i21) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i21;
                switch (i21) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub22) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub22);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A01 = enumC10321Gub21;
        EnumC10321Gub enumC10321Gub22 = new EnumC10321Gub(i22) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i22;
                switch (i22) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub222) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub222);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A02 = enumC10321Gub22;
        EnumC10321Gub enumC10321Gub23 = new EnumC10321Gub(i23) { // from class: X.FY5
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i32;
                this.$t = i23;
                switch (i23) {
                    case 0:
                        str = "InCaption";
                        i32 = 9;
                        break;
                    case 1:
                        str = "InColumnGroup";
                        i32 = 10;
                        break;
                    case 2:
                        str = "InTableBody";
                        i32 = 11;
                        break;
                    case 3:
                        str = "InRow";
                        i32 = 12;
                        break;
                    case 4:
                        str = "InCell";
                        i32 = 13;
                        break;
                    case 5:
                        str = "InSelect";
                        i32 = 14;
                        break;
                    case 6:
                        str = "InSelectInTable";
                        i32 = 15;
                        break;
                    case 7:
                        str = "InTemplate";
                        i32 = 16;
                        break;
                    case 8:
                        str = "AfterBody";
                        i32 = 17;
                        break;
                    case 9:
                        str = "InFrameset";
                        i32 = 18;
                        break;
                    case 10:
                        str = "Initial";
                        i32 = 0;
                        break;
                    case 11:
                        str = "AfterFrameset";
                        i32 = 19;
                        break;
                    case 12:
                        str = "AfterAfterBody";
                        i32 = 20;
                        break;
                    case 13:
                        str = "AfterAfterFrameset";
                        i32 = 21;
                        break;
                    case 14:
                        str = "ForeignContent";
                        i32 = 22;
                        break;
                    case 15:
                        str = "BeforeHtml";
                        i32 = 1;
                        break;
                    case 16:
                        str = "BeforeHead";
                        i32 = 2;
                        break;
                    case 17:
                        str = "InHead";
                        i32 = 3;
                        break;
                    case 18:
                        str = "AfterHead";
                        i32 = 4;
                        break;
                    case 19:
                        str = "InBody";
                        i32 = 5;
                        break;
                    case 20:
                        str = "Text";
                        i32 = 6;
                        break;
                    case 21:
                        str = "InTable";
                        i32 = 7;
                        break;
                    default:
                        str = "InTableText";
                        i32 = 8;
                        break;
                }
                super(str, i32);
            }

            public static void A00(String str, C10316GuW c10316GuW, EnumC10321Gub enumC10321Gub222) {
                if (c10316GuW.A0c(str, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
                c10316GuW.A0U(enumC10321Gub222);
            }

            public static void A01(C10316GuW c10316GuW) {
                if (C10316GuW.A07(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, c10316GuW, 5)) {
                    c10316GuW.A0b(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                }
            }

            public static boolean A02(Object obj, Object obj2) {
                return ((GuS) obj).A04().equals(obj2);
            }

            private final boolean A05(C10316GuW v, AbstractC10326Gug v2) {
                /*
                    this = this;
                    X.GuS r9 = (X.GuS) r9
                    java.lang.String r6 = r9.A05
                    java.util.ArrayList<X.Gt3> r5 = r8.A0N
                    X.Gt3 r0 = r8.A0B(r6)
                    r4 = 0
                    if (r0 == 0) goto L35
                    int r3 = r5.size()
                    r2 = 1
                    int r3 = r3 - r2
                L13:
                    if (r3 < 0) goto L28
                    X.Gt3 r1 = X.AbstractC7607F5u.A1E(r5, r3)
                    boolean r0 = X.AbstractC7608F5v.A1X(r6, r1)
                    if (r0 == 0) goto L29
                    r8.A0L(r6)
                    A00(r6, r8, r7)
                    r8.A0M(r6)
                L28:
                    return r2
                L29:
                    X.Guc r0 = r1.A02
                    r1 = 128(0x80, float:1.794E-43)
                    int r0 = r0.A01
                    r1 = r1 & r0
                    if (r1 != 0) goto L35
                    int r3 = r3 + (-1)
                    goto L13
                L35:
                    r8.A0U(r7)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A05(X.GuW, X.Gug):boolean");
            }

            @Override // X.EnumC10321Gub
            public final boolean A04(C10316GuW v, AbstractC10326Gug v2) throws IOException {
                /*
                    Method dump skipped, instructions count: 6514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.FY5.A04(X.GuW, X.Gug):boolean");
            }
        };
        A08 = enumC10321Gub23;
        A00 = new EnumC10321Gub[]{enumC10321Gub, enumC10321Gub2, enumC10321Gub3, enumC10321Gub4, enumC10321Gub5, enumC10321Gub6, enumC10321Gub7, enumC10321Gub8, enumC10321Gub9, enumC10321Gub10, enumC10321Gub11, enumC10321Gub12, enumC10321Gub13, enumC10321Gub14, enumC10321Gub15, enumC10321Gub16, enumC10321Gub17, enumC10321Gub18, enumC10321Gub19, enumC10321Gub20, enumC10321Gub21, enumC10321Gub22, enumC10321Gub23};
    }

    public abstract boolean A04(C10316GuW c10316GuW, AbstractC10326Gug abstractC10326Gug);

    public static boolean A03(AbstractC10326Gug abstractC10326Gug) {
        if (abstractC10326Gug.A02 == C79.A0P) {
            return Gt5.A08(((C10325Guf) abstractC10326Gug).A00.A00());
        }
        return false;
    }

    public static EnumC10321Gub valueOf(String str) {
        return (EnumC10321Gub) Enum.valueOf(EnumC10321Gub.class, str);
    }

    public static EnumC10321Gub[] values() {
        return (EnumC10321Gub[]) A00.clone();
    }

    public EnumC10321Gub(String str, int i) {
    }
}
