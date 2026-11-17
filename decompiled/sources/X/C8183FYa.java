package X;

import android.view.View;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FYa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8183FYa extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8183FYa(Object obj, F1F f1f, FL4 fl4, C7925FKx c7925FKx, C10543Hqv<View.OnFocusChangeListener> c10543Hqv, ViewOnFocusChangeListenerC7920FKs viewOnFocusChangeListenerC7920FKs) {
        super(0);
        this.$t = viewOnFocusChangeListenerC7920FKs;
        this.A01 = c7925FKx;
        this.A04 = fl4;
        this.A00 = obj;
        this.A03 = c10543Hqv;
        this.A02 = f1f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        ViewOnFocusChangeListenerC7920FKs viewOnFocusChangeListenerC7920FKs;
        if (this.$t != 0) {
            F1F f1f = (F1F) this.A02;
            if (((F1F) this.A01).element) {
                throw C3cG.A0Q("You may not unsubscribe from a store listener while the reducer\nis executing. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details.");
            }
            f1f.element = false;
            C10543Hqv c10543Hqv = (C10543Hqv) this.A04;
            C10543Hqv c10543Hqv2 = (C10543Hqv) this.A00;
            Object obj = c10543Hqv.element;
            Object obj2 = c10543Hqv2.element;
            Object obj3 = obj;
            if (obj == obj2) {
                ?? A0R = AbstractC0878AGe.A0R((Collection) obj2);
                c10543Hqv.element = A0R;
                obj3 = A0R;
            }
            ((List) c10543Hqv.element).remove(((List) obj3).indexOf(this.A03));
        } else {
            if (((F1F) this.A01).element) {
                TextView textView = (TextView) this.A04;
                C7923FKv c7923FKv = ((C7925FKx) this.A00).A03;
                if (c7923FKv == null) {
                    throw BV4.A0U();
                }
                textView.setKeyListener(c7923FKv.A0H);
            }
            Object obj4 = ((C10543Hqv) this.A03).element;
            if (obj4 != null && (viewOnFocusChangeListenerC7920FKs = (ViewOnFocusChangeListenerC7920FKs) this.A02) != null) {
                viewOnFocusChangeListenerC7920FKs.A00.remove(obj4);
            }
        }
        return Unit.INSTANCE;
    }
}
