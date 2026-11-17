package X;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.functions.Function0;

/* renamed from: X.89G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C89G {
    public static final C89G A02 = new C89G();
    public static final DateTimeFormatter A03 = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
    public static final C06827l3 A04 = C06827l3.A02("^\\d{4}-\\d{2}-\\d{2}$");
    public static final C06827l3 A05 = C06827l3.A02("^([+-])(\\d+)([smhdw])$");
    public static Function0<Instant> A00 = new C07348in(1);
    public static Function0<? extends ZoneId> A01 = new C07348in(2);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b A[Catch: ArithmeticException | DateTimeException -> 0x0115, TryCatch #0 {ArithmeticException | DateTimeException -> 0x0115, blocks: (B:25:0x0099, B:35:0x00b1, B:39:0x00c2, B:52:0x00fd, B:54:0x010b, B:55:0x0110, B:49:0x00f1, B:51:0x00f9, B:40:0x00ca, B:42:0x00d2, B:43:0x00d7, B:45:0x00df, B:46:0x00e4, B:48:0x00ec), top: B:70:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110 A[Catch: ArithmeticException | DateTimeException -> 0x0115, TRY_LEAVE, TryCatch #0 {ArithmeticException | DateTimeException -> 0x0115, blocks: (B:25:0x0099, B:35:0x00b1, B:39:0x00c2, B:52:0x00fd, B:54:0x010b, B:55:0x0110, B:49:0x00f1, B:51:0x00f9, B:40:0x00ca, B:42:0x00d2, B:43:0x00d7, B:45:0x00df, B:46:0x00e4, B:48:0x00ec), top: B:70:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.Instant A00(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89G.A00(java.lang.String):java.time.Instant");
    }
}
