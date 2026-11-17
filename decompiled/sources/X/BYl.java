package X;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v0 X.BYl, still in use, count: 1, list:
  (r9v0 X.BYl) from 0x0042: INVOKE (r0v7 android.util.SparseArray<X.BYl>), (1 int), (r9v0 X.BYl) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:66)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class BYl {
    DEFAULT(0),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY(2),
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE(3),
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(4),
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(-1);

    public static final SparseArray<BYl> A00;
    public final int value;

    static {
        BYl bYl = DEFAULT;
        SparseArray<BYl> sparseArrayA0B = BV4.A0B();
        A00 = sparseArrayA0B;
        sparseArrayA0B.put(0, bYl);
        sparseArrayA0B.put(1, bYl);
        sparseArrayA0B.put(2, bYl);
        sparseArrayA0B.put(3, bYl);
        sparseArrayA0B.put(4, bYl);
        sparseArrayA0B.put(-1, bYl);
    }

    public static BYl valueOf(String str) {
        return (BYl) Enum.valueOf(BYl.class, str);
    }

    public static BYl[] values() {
        return (BYl[]) A01.clone();
    }

    public BYl(int i) {
        this.value = i;
    }
}
