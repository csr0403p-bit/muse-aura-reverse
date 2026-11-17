package X;

import android.graphics.Rect;
import android.view.ViewStructure;
import kotlin.Unit;

/* renamed from: X.BUh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2333BUh extends AbstractC7559F3s implements G2j {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2333BUh(int i, Object obj, Object obj2) {
        super(4);
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.$t != 0) {
            int iA0F = AnonymousClass001.A0F(obj);
            int iA0F2 = AnonymousClass001.A0F(obj2);
            ((ViewStructure) this.A01).setDimens(iA0F, iA0F2, 0, 0, AnonymousClass001.A0F(obj3) - iA0F, AnonymousClass001.A0F(obj4) - iA0F2);
        } else {
            int iA0F3 = AnonymousClass001.A0F(obj);
            int iA0F4 = AnonymousClass001.A0F(obj2);
            int iA0F5 = AnonymousClass001.A0F(obj3);
            int iA0F6 = AnonymousClass001.A0F(obj4);
            C1558AlO c1558AlO = (C1558AlO) this.A01;
            Rect rect = c1558AlO.A00;
            rect.set(iA0F3, iA0F4, iA0F5, iA0F6);
            InterfaceC1491Ajy interfaceC1491Ajy = c1558AlO.A03;
            ((AlR) interfaceC1491Ajy).A00.requestAutofill(c1558AlO.A05, ((C1453AjM) ((AlS) this.A00)).A02, rect);
        }
        return Unit.INSTANCE;
    }
}
