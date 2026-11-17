package X;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r39v0 X.BYn, still in use, count: 1, list:
  (r39v0 X.BYn) from 0x0109: INVOKE (r1v19 android.util.SparseArray<X.BYn>), (0 int), (r39v0 X.BYn) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:265)
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
/* renamed from: X.BYn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2387BYn {
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE(0),
    /* JADX INFO: Fake field, exist only in values array */
    WIFI(1),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_MMS(2),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_SUPL(3),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_DUN(4),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_HIPRI(5),
    /* JADX INFO: Fake field, exist only in values array */
    WIMAX(6),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH(7),
    /* JADX INFO: Fake field, exist only in values array */
    DUMMY(8),
    /* JADX INFO: Fake field, exist only in values array */
    ETHERNET(9),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_FOTA(10),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IMS(11),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_CBS(12),
    /* JADX INFO: Fake field, exist only in values array */
    WIFI_P2P(13),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IA(14),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_EMERGENCY(15),
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(16),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(17),
    NONE(-1);

    public static final SparseArray<EnumC2387BYn> A00;
    public final int value;

    static {
        EnumC2387BYn enumC2387BYn = NONE;
        SparseArray<EnumC2387BYn> sparseArrayA0B = BV4.A0B();
        A00 = sparseArrayA0B;
        sparseArrayA0B.put(0, enumC2387BYn);
        sparseArrayA0B.put(1, enumC2387BYn);
        sparseArrayA0B.put(2, enumC2387BYn);
        sparseArrayA0B.put(3, enumC2387BYn);
        sparseArrayA0B.put(4, enumC2387BYn);
        sparseArrayA0B.put(5, enumC2387BYn);
        sparseArrayA0B.put(6, enumC2387BYn);
        sparseArrayA0B.put(7, enumC2387BYn);
        sparseArrayA0B.put(8, enumC2387BYn);
        sparseArrayA0B.put(9, enumC2387BYn);
        sparseArrayA0B.put(10, enumC2387BYn);
        sparseArrayA0B.put(11, enumC2387BYn);
        sparseArrayA0B.put(12, enumC2387BYn);
        sparseArrayA0B.put(13, enumC2387BYn);
        sparseArrayA0B.put(14, enumC2387BYn);
        sparseArrayA0B.put(15, enumC2387BYn);
        sparseArrayA0B.put(16, enumC2387BYn);
        sparseArrayA0B.put(17, enumC2387BYn);
        sparseArrayA0B.put(-1, enumC2387BYn);
    }

    public static EnumC2387BYn valueOf(String str) {
        return (EnumC2387BYn) Enum.valueOf(EnumC2387BYn.class, str);
    }

    public static EnumC2387BYn[] values() {
        return (EnumC2387BYn[]) A01.clone();
    }

    public EnumC2387BYn(int i) {
        this.value = i;
    }
}
