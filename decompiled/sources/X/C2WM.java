package X;

import androidx.compose.ui.Alignment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.2WM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2WM extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Alignment $alignment;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ C11N $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/11N;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
    public C2WM(Alignment alignment, C11N c11n, Function0 function0, G0V g0v, int i, int i2, long j) {
        super(2);
        this.$alignment = alignment;
        this.$offset = j;
        this.$onDismissRequest = function0;
        this.$properties = c11n;
        this.$content = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        Alignment alignment = this.$alignment;
        long j = this.$offset;
        AYW.A00(bfmA0P, alignment, this.$properties, this.$onDismissRequest, this.$content, AnonymousClass011.A00(this.$$changed), this.$$default, j);
        return Unit.INSTANCE;
    }
}
