package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* renamed from: X.11I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11I extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ long $containerColor;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ AOI<Boolean> $expandedState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ float $shadowElevation;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ float $tonalElevation;
    public final /* synthetic */ MutableState<C15k> $transformOriginState;

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            BRg bRg = this.$modifier;
            AOI<Boolean> aoi = this.$expandedState;
            MutableState<C15k> mutableState = this.$transformOriginState;
            C1110AYw c1110AYw = this.$scrollState;
            C1DM c1dm = this.$shape;
            long j = this.$containerColor;
            C11P.A00(aoi, this.$border, c1110AYw, bfm2, mutableState, bRg, c1dm, this.$content, this.$tonalElevation, this.$shadowElevation, 384, j);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/AOI<Ljava/lang/Boolean;>;Landroidx/compose/runtime/MutableState<LX/15k;>;LX/AYw;LX/1DM;JFFLX/1DH;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public C11I(AOI aoi, C1DH c1dh, C1110AYw c1110AYw, MutableState mutableState, BRg bRg, C1DM c1dm, G0W g0w, float f, float f2, long j) {
        super(2);
        this.$modifier = bRg;
        this.$expandedState = aoi;
        this.$transformOriginState = mutableState;
        this.$scrollState = c1110AYw;
        this.$shape = c1dm;
        this.$containerColor = j;
        this.$tonalElevation = f;
        this.$shadowElevation = f2;
        this.$border = c1dh;
        this.$content = g0w;
    }
}
