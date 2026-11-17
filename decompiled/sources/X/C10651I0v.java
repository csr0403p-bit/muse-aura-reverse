package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.function.Function;

/* renamed from: X.I0v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10651I0v implements Function {
    public final int $t;

    public C10651I0v(int i) {
        this.$t = i;
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return new C9317GDt();
            case 1:
                boolean z = NioPathDeserializer.A01;
                return FGI.A0U("\"", (String) obj, "\"");
            case 2:
                return ((AbstractC9970Gmj) obj).A0E();
            case 3:
                C10280Gtk c10280Gtk = (C10280Gtk) obj;
                String strA01 = Gt5.A01(c10280Gtk.A00);
                c10280Gtk.A00 = null;
                return strA01;
            case 4:
                return Collections.unmodifiableList((List) obj);
            case 5:
                Gt4 gt4 = (Gt4) obj;
                String str = Gt3.A03;
                return gt4 instanceof C10262GtH ? ((GtD) gt4).A0T() : AbstractC7608F5v.A1X("br", gt4) ? PairsDiscretionDocument.TERMINATOR : "";
            case 6:
                C10317GuX c10317GuX = C10317GuX.A03;
                return BV4.A0u();
            case 7:
                return ((Gt4) obj).A09();
            case 8:
                return new C10246Gsh((AbstractC10245Gsg) obj);
            case 9:
                return new C10260Gsz((AbstractC10245Gsg) obj);
            default:
                return new WeakHashMap();
        }
    }
}
