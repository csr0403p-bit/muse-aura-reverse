package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.10L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10L extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ long $containerColor;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ C11N $properties;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ float $shadowElevation;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ float $tonalElevation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BRg;JLX/AYw;LX/11N;LX/1DM;JFFLX/1DH;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;III)V */
    public C10L(C1DH c1dh, C1110AYw c1110AYw, BRg bRg, C1DM c1dm, C11N c11n, Function0 function0, G0W g0w, float f, float f2, int i, int i2, int i3, long j, long j2, boolean z) {
        super(2);
        this.$expanded = z;
        this.$onDismissRequest = function0;
        this.$modifier = bRg;
        this.$offset = j;
        this.$scrollState = c1110AYw;
        this.$properties = c11n;
        this.$shape = c1dm;
        this.$containerColor = j2;
        this.$tonalElevation = f;
        this.$shadowElevation = f2;
        this.$border = c1dh;
        this.$content = g0w;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        boolean z = this.$expanded;
        Function0<Unit> function0 = this.$onDismissRequest;
        BRg bRg = this.$modifier;
        long j = this.$offset;
        C1110AYw c1110AYw = this.$scrollState;
        C11N c11n = this.$properties;
        C1DM c1dm = this.$shape;
        long j2 = this.$containerColor;
        C11H.A00(this.$border, c1110AYw, bfmA0P, bRg, c1dm, c11n, function0, this.$content, this.$tonalElevation, this.$shadowElevation, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default, j, j2, z);
        return Unit.INSTANCE;
    }
}
