package X;

import kotlin.Unit;

/* renamed from: X.1BM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BM extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AOe<Float> $animationSpec;
    public final /* synthetic */ G0W<T, BFM, Integer, Unit> $content;
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ T $targetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;LX/BRg;LX/AOe<Ljava/lang/Float;>;Ljava/lang/String;LX/G0W<-TT;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C1BM(AOe aOe, BRg bRg, Object obj, String str, G0W g0w, int i, int i2) {
        super(2);
        this.$targetState = obj;
        this.$modifier = bRg;
        this.$animationSpec = aOe;
        this.$label = str;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        T t = this.$targetState;
        C1Dt.A01(this.$animationSpec, bfmA0P, this.$modifier, t, this.$label, this.$content, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
