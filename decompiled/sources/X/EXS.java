package X;

import android.app.Activity;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EXS extends AbstractC7559F3s implements G0W<String, Integer, Integer, Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ G0U<InterfaceC10512HoG, Unit> $dcpListener;
    public final /* synthetic */ EXZ $iacParams;
    public final /* synthetic */ C6729EXn $sheetEvent;
    public final /* synthetic */ C6718EXb $sheetStopwatch;
    public final /* synthetic */ EXP this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/EXP;Landroid/app/Activity;LX/EXZ;LX/G0U<-LX/HoG;Lkotlin/Unit;>;LX/EXn;LX/EXb;)V */
    public EXS(Activity activity, EXZ exz, EXP exp, C6729EXn c6729EXn, C6718EXb c6718EXb, G0U g0u) {
        super(3);
        this.this$0 = exp;
        this.$activity = activity;
        this.$iacParams = exz;
        this.$dcpListener = g0u;
        this.$sheetEvent = c6729EXn;
        this.$sheetStopwatch = c6718EXb;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Unit invoke(String str, Integer num, Integer num2) throws Exception {
        Object next;
        String str2 = str;
        int iA0F = AnonymousClass001.A0F(num);
        int iA0F2 = AnonymousClass001.A0F(num2);
        C7384Etj.A0Y(str2, 0);
        Iterator<E> it = EnumC7495EyA.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str2.equals(((EnumC7495EyA) next).bloksValue)) {
                break;
            }
        }
        EnumC7495EyA enumC7495EyA = (EnumC7495EyA) next;
        if (enumC7495EyA == null) {
            enumC7495EyA = EnumC7495EyA.A05;
        }
        EXP exp = this.this$0;
        EXP.A01(this.$activity, this.$iacParams, exp, C6729EXn.A0y(this.$sheetEvent, null, Long.valueOf(this.$sheetStopwatch.A00()), null), enumC7495EyA, this.$dcpListener, iA0F, iA0F2);
        return Unit.INSTANCE;
    }
}
