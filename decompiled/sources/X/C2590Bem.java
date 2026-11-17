package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;

/* renamed from: X.Bem, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2590Bem extends C7462Ewq {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2590Bem(Object obj, int i) {
        Class cls;
        String str;
        String str2;
        int i2;
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                cls = C1BO.class;
                str = "getValue()Ljava/lang/Object;";
                str2 = BrowserOperationCatalogKt.VALUE;
                i2 = 0;
                break;
            default:
                cls = AbstractC10504Hnh.class;
                str = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;";
                str2 = "classSimpleName";
                i2 = 1;
                break;
        }
        super(obj, cls, str2, str, i2);
    }

    @Override // X.C7462Ewq, X.InterfaceC7364Enb
    public final Object get() {
        return 4 - this.$t != 0 ? ((C1BO) this.receiver).getValue() : C3cI.A0Y(this.receiver);
    }
}
