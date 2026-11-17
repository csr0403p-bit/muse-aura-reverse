package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.9Wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07469Wb extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C9WZ $kind;
    public final /* synthetic */ String $label;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ C9WY $style;
    public final /* synthetic */ int $textDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/9WZ;Ljava/lang/String;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/9WY;IIII)V */
    public C07469Wb(C9WY c9wy, C9WZ c9wz, String str, Function0 function0, int i, int i2, int i3, int i4) {
        super(2);
        this.$kind = c9wz;
        this.$label = str;
        this.$onClick = function0;
        this.$style = c9wy;
        this.$textDirection = i;
        this.$maxLines = i2;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        C9WX.A01(AnonymousClass005.A0P(bfm, num), this.$style, this.$kind, this.$label, this.$onClick, this.$textDirection, this.$maxLines, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
