package X;

import android.content.Context;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import androidx.glance.session.Session;
import kotlin.Unit;

/* renamed from: X.8ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07298ii extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final Object A04;

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i2;
        Object obj9;
        Object obj10;
        Object obj11;
        int i3;
        C07298ii c07298ii;
        switch (this.$t) {
            case 0:
                return new C07298ii(this.A03, this.A04, htJ, 0);
            case 1:
                obj4 = this.A02;
                obj3 = this.A04;
                obj2 = this.A01;
                i = 1;
                C07298ii c07298ii2 = new C07298ii(obj3, (GlanceAppWidget) obj2, (Context) obj4, (C6PP) htJ, (HtJ<? super C07298ii>) i);
                c07298ii2.A03 = obj;
                return c07298ii2;
            case 2:
                c07298ii = new C07298ii(this.A01, (GlanceAppWidgetReceiver) this.A03, (Context) htJ, (int[]) this.A04, (HtJ<? super C07298ii>) 2);
                c07298ii.A02 = obj;
                return c07298ii;
            case 3:
                obj4 = this.A02;
                obj3 = this.A04;
                obj2 = this.A01;
                i = 3;
                C07298ii c07298ii22 = new C07298ii(obj3, (GlanceAppWidget) obj2, (Context) obj4, (C6PP) htJ, (HtJ<? super C07298ii>) i);
                c07298ii22.A03 = obj;
                return c07298ii22;
            case 4:
                obj9 = this.A03;
                obj10 = this.A01;
                obj11 = this.A04;
                i3 = 4;
                c07298ii = new C07298ii(obj10, (GlanceAppWidgetReceiver) obj9, (Context) htJ, (int[]) obj11, (HtJ<? super C07298ii>) i3);
                c07298ii.A02 = obj;
                return c07298ii;
            case 5:
                obj9 = this.A03;
                obj10 = this.A01;
                obj11 = this.A04;
                i3 = 5;
                c07298ii = new C07298ii(obj10, (GlanceAppWidgetReceiver) obj9, (Context) htJ, (int[]) obj11, (HtJ<? super C07298ii>) i3);
                c07298ii.A02 = obj;
                return c07298ii;
            case 6:
                obj2 = this.A01;
                obj3 = this.A04;
                obj4 = this.A02;
                i = 6;
                C07298ii c07298ii222 = new C07298ii(obj3, (GlanceAppWidget) obj2, (Context) obj4, (C6PP) htJ, (HtJ<? super C07298ii>) i);
                c07298ii222.A03 = obj;
                return c07298ii222;
            case 7:
                obj6 = this.A01;
                obj8 = this.A04;
                obj5 = this.A03;
                obj7 = this.A02;
                i2 = 7;
                return new C07298ii(obj8, obj6, obj7, obj5, htJ, i2);
            case 8:
                obj5 = this.A03;
                obj6 = this.A01;
                obj7 = this.A02;
                obj8 = this.A04;
                i2 = 8;
                return new C07298ii(obj8, obj6, obj7, obj5, htJ, i2);
            case 9:
                return new C07298ii(htJ, (G0V) this.A04, (InterfaceC2261BLa) this.A01);
            case 10:
                obj4 = this.A02;
                obj2 = this.A01;
                obj3 = this.A04;
                i = 10;
                C07298ii c07298ii2222 = new C07298ii(obj3, (GlanceAppWidget) obj2, (Context) obj4, (C6PP) htJ, (HtJ<? super C07298ii>) i);
                c07298ii2222.A03 = obj;
                return c07298ii2222;
            case 11:
                obj2 = this.A01;
                obj3 = this.A04;
                obj4 = this.A02;
                i = 11;
                C07298ii c07298ii22222 = new C07298ii(obj3, (GlanceAppWidget) obj2, (Context) obj4, (C6PP) htJ, (HtJ<? super C07298ii>) i);
                c07298ii22222.A03 = obj;
                return c07298ii22222;
            default:
                return new C07298ii(this.A03, this.A04, htJ, 12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BLa;LX/G0V<-LX/3UX;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-LX/8ii;>;)V */
    public C07298ii(HtJ htJ, G0V g0v, InterfaceC2261BLa interfaceC2261BLa) {
        super(2, htJ);
        this.$t = 9;
        this.A01 = interfaceC2261BLa;
        this.A04 = g0v;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034b A[PHI: r15
  0x034b: PHI (r15v8 java.lang.Object) = (r15v4 java.lang.Object), (r15v12 java.lang.Object) binds: [B:168:0x0344, B:64:0x010e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x048b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0061 -> B:23:0x0067). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07298ii.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C07298ii) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07298ii(Object obj, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, G0V<? super TextClassifier, ? super HtJ<? super T>, ? extends Object> g0v, HtJ<? super C07298ii> htJ) {
        super(2, g0v);
        this.$t = htJ;
        this.A03 = obj;
        this.A04 = platformSelectionBehaviorsImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07298ii(Object obj, Session session, Context context, Throwable th, C77Q c77q, HtJ<? super C07298ii> htJ) {
        super(2, c77q);
        this.$t = htJ;
        this.A01 = session;
        this.A04 = obj;
        this.A03 = th;
        this.A02 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07298ii(Object obj, GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int[] iArr, HtJ<? super C07298ii> htJ) {
        super(2, context);
        this.$t = htJ;
        this.A03 = glanceAppWidgetReceiver;
        this.A01 = obj;
        this.A04 = iArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07298ii(Object obj, GlanceAppWidget glanceAppWidget, Context context, C6PP c6pp, HtJ<? super C07298ii> htJ) {
        super(2, c6pp);
        this.$t = htJ;
        this.A02 = context;
        this.A04 = obj;
        this.A01 = glanceAppWidget;
    }
}
