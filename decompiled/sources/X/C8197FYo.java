package X;

import com.meta.maps.display.MapContext;
import com.meta.maps.display.fancypins.FancyPinsPlugin;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FYo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8197FYo extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8197FYo(F0C f0c, F0C f0c2, int i) {
        super(0);
        this.$t = i;
        if (15 - i != 0) {
            this.A01 = f0c;
            this.A00 = f0c2;
        } else {
            this.A00 = f0c;
            this.A01 = f0c2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0103, code lost:
    
        if (X.C3cI.A1W((java.util.concurrent.atomic.AtomicBoolean) r19.A01) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02db  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8197FYo.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8197FYo(MapContext mapContext, FancyPinsPlugin fancyPinsPlugin, int i) {
        super(0);
        this.$t = i;
        if (9 - i != 0) {
            this.A00 = mapContext;
            this.A01 = fancyPinsPlugin;
        } else {
            this.A01 = fancyPinsPlugin;
            this.A00 = mapContext;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8197FYo(int i, Object obj, Object obj2) {
        super(0);
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
