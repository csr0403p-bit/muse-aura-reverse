package X;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r44v0 X.BYo, still in use, count: 1, list:
  (r44v0 X.BYo) from 0x0136: INVOKE (r1v22 android.util.SparseArray<X.BYo>), (1 int), (r44v0 X.BYo) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:310)
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
/* renamed from: X.BYo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2388BYo {
    UNKNOWN_MOBILE_SUBTYPE(0),
    /* JADX INFO: Fake field, exist only in values array */
    GPRS(1),
    /* JADX INFO: Fake field, exist only in values array */
    EDGE(2),
    /* JADX INFO: Fake field, exist only in values array */
    UMTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    CDMA(4),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_0(5),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_A(6),
    /* JADX INFO: Fake field, exist only in values array */
    RTT(7),
    /* JADX INFO: Fake field, exist only in values array */
    HSDPA(8),
    /* JADX INFO: Fake field, exist only in values array */
    HSUPA(9),
    /* JADX INFO: Fake field, exist only in values array */
    HSPA(10),
    /* JADX INFO: Fake field, exist only in values array */
    IDEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_B(12),
    /* JADX INFO: Fake field, exist only in values array */
    LTE(13),
    /* JADX INFO: Fake field, exist only in values array */
    EHRPD(14),
    /* JADX INFO: Fake field, exist only in values array */
    HSPAP(15),
    /* JADX INFO: Fake field, exist only in values array */
    GSM(16),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(17),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(18),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(19),
    COMBINED(100);

    public static final SparseArray<EnumC2388BYo> A00;
    public final int value;

    static {
        EnumC2388BYo enumC2388BYo = UNKNOWN_MOBILE_SUBTYPE;
        SparseArray<EnumC2388BYo> sparseArrayA0B = BV4.A0B();
        A00 = sparseArrayA0B;
        sparseArrayA0B.put(0, enumC2388BYo);
        sparseArrayA0B.put(1, enumC2388BYo);
        sparseArrayA0B.put(2, enumC2388BYo);
        sparseArrayA0B.put(3, enumC2388BYo);
        sparseArrayA0B.put(4, enumC2388BYo);
        sparseArrayA0B.put(5, enumC2388BYo);
        sparseArrayA0B.put(6, enumC2388BYo);
        sparseArrayA0B.put(7, enumC2388BYo);
        sparseArrayA0B.put(8, enumC2388BYo);
        sparseArrayA0B.put(9, enumC2388BYo);
        sparseArrayA0B.put(10, enumC2388BYo);
        sparseArrayA0B.put(11, enumC2388BYo);
        sparseArrayA0B.put(12, enumC2388BYo);
        sparseArrayA0B.put(13, enumC2388BYo);
        sparseArrayA0B.put(14, enumC2388BYo);
        sparseArrayA0B.put(15, enumC2388BYo);
        sparseArrayA0B.put(16, enumC2388BYo);
        sparseArrayA0B.put(17, enumC2388BYo);
        sparseArrayA0B.put(18, enumC2388BYo);
        sparseArrayA0B.put(19, enumC2388BYo);
    }

    public static EnumC2388BYo valueOf(String str) {
        return (EnumC2388BYo) Enum.valueOf(EnumC2388BYo.class, str);
    }

    public static EnumC2388BYo[] values() {
        return (EnumC2388BYo[]) A01.clone();
    }

    public EnumC2388BYo(int i) {
        this.value = i;
    }
}
