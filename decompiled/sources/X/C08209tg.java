package X;

import java.util.Arrays;

/* renamed from: X.9tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08209tg extends C9tZ<Short, short[], C08379tx> implements C9hr<short[]> {
    public static final C08209tg A00 = new C08209tg();

    public C08209tg() {
        super(C9oK.A00);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08379tx c08379tx = (C08379tx) obj;
        AnonymousClass003.A0v(c9j4, c08379tx);
        short sA8d = c9j4.A8d(((C9tZ) this).A00, i);
        int iA00 = c08379tx.A00() + 1;
        short[] sArrCopyOf = c08379tx.A01;
        int length = sArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            sArrCopyOf = Arrays.copyOf(sArrCopyOf, iA00);
            C7384Etj.A0U(sArrCopyOf);
            c08379tx.A01 = sArrCopyOf;
        }
        int i3 = c08379tx.A00;
        c08379tx.A00 = i3 + 1;
        sArrCopyOf[i3] = sA8d;
    }
}
