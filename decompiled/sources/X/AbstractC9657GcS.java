package X;

/* renamed from: X.GcS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9657GcS {
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v3 int, still in use, count: 2, list:
          (r11v3 int) from 0x0019: IF  (r11v3 int) != (1 int)  -> B:10:0x001b A[HIDDEN] (LINE:25)
          (r11v3 int) from 0x001d: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:11:0x001c, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final X.C9656GcR A00(java.lang.Integer r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r1 = 0
            r5 = 1
            r6 = 0
            X.GcR r0 = new X.GcR
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            if (r12 == 0) goto L1b
            if (r13 == 0) goto L1b
            if (r14 == 0) goto L1b
            if (r15 == 0) goto L1b
            if (r11 == 0) goto L1c
            int r11 = r11.intValue()
            if (r11 == r5) goto L1d
        L1b:
            return r0
        L1c:
            r11 = 1
        L1d:
            r0 = 8
            byte[] r7 = android.util.Base64.decode(r12, r0)
            byte[] r8 = android.util.Base64.decode(r13, r0)
            byte[] r9 = android.util.Base64.decode(r14, r0)
            byte[] r10 = android.util.Base64.decode(r15, r0)
            X.GcR r0 = new X.GcR
            r6 = r0
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9657GcS.A00(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):X.GcR");
    }
}
