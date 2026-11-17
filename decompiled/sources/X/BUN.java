package X;

import androidx.compose.ui.text.input.ImeAction;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUN extends F2X implements G0U {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public BUN(Object obj, int i) {
        Class cls;
        String str;
        int i2;
        int i3;
        String str2;
        this.$t = i;
        if (i != 0) {
            cls = C0910AHm.class;
            str = "add(Ljava/lang/Object;)Z";
            i2 = 8;
            i3 = 1;
            str2 = "add";
        } else {
            cls = C1871Asl.class;
            str = "onImeActionPerformed-KlQnJC8(I)Z";
            i2 = 8;
            i3 = 1;
            str2 = "onImeActionPerformed";
        }
        super(i3, obj, cls, str2, str, i2);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.$t != 0) {
            ((C0910AHm) this.receiver).A0G(obj);
        } else {
            C1871Asl.A04((C1871Asl) this.receiver, ((ImeAction) obj).A00);
        }
        return Unit.INSTANCE;
    }
}
