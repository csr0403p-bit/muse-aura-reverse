package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.Fij, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8683Fij implements InterfaceC8696Fiw {
    public final Integer A00;
    public final boolean A01;

    @Override // X.InterfaceC8696Fiw
    public final InterfaceC8698Fiy Agv(C6837Eap c6837Eap, C8659FiK c8659FiK, AbstractC8671FiX abstractC8671FiX) {
        if (c8659FiK.A0K) {
            return new C8676Fic(this);
        }
        BXP.A00("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "ADD";
                    break;
                case 2:
                    str = "SUBTRACT";
                    break;
                case 3:
                    str = "INTERSECT";
                    break;
                case 4:
                    str = "EXCLUDE_INTERSECTIONS";
                    break;
                default:
                    str = "MERGE";
                    break;
            }
        } else {
            str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        return FGI.A0N("MergePaths{mode=", str, '}');
    }

    public C8683Fij(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
