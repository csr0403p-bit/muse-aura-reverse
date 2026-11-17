package X;

/* loaded from: classes6.dex */
public abstract class F6Q {
    public final int A00;
    public final F6Q A01;

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private final X.HjM A00(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.DRt, X.HjM, java.lang.Object] */
    public final HjM A01(HjM hjM) {
        boolean zA1Q;
        ?? r1;
        HjM hjMA0N;
        if (hjM == null) {
            return null;
        }
        HjM hjMA00 = A00(hjM);
        if (hjMA00 == null) {
            boolean z = this instanceof F6S;
            if (z) {
                zA1Q = AnonymousClass002.A1M(this.A00);
            } else if (this instanceof F6A) {
                zA1Q = AnonymousClass002.A1Q(this.A00, 3);
            } else {
                boolean z2 = this instanceof F69;
                int i = this.A00;
                zA1Q = z2 ? AnonymousClass002.A1Q(i, 5) : AnonymousClass002.A1Q(i, 3);
            }
            if (!zA1Q) {
                if (z) {
                    HjM hjM2 = new HjM();
                    hjMA0N = AbstractC7611F5y.A0N(hjM2, hjM, hjM2, 6);
                } else if (this instanceof F6A) {
                    HjM hjM3 = new HjM();
                    hjMA0N = AbstractC7611F5y.A0N(hjM3, hjM, hjM3, 26);
                } else if (this instanceof F69) {
                    HjM hjM4 = new HjM();
                    hjMA0N = AbstractC7611F5y.A0N(r1, hjM, r1, 12);
                    r1 = hjM4;
                } else {
                    Object obj = new Object();
                    hjMA0N = AbstractC7611F5y.A0N(r1, hjM, r1, 6);
                    r1 = obj;
                }
                F6Q f6q = this.A01;
                return f6q != null ? f6q.A01(hjMA0N) : hjMA0N;
            }
        }
        return hjMA00;
    }

    public F6Q(F6Q f6q, int i) {
        this.A00 = i;
        this.A01 = f6q;
    }
}
