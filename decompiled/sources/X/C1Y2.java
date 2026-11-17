package X;

import java.util.Locale;
import kotlin.Unit;

/* renamed from: X.1Y2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ AbstractC04741Xc $calendarModel;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ C1Y4 $dateInputFormat;
    public final /* synthetic */ C1Y5 $dateInputValidator;
    public final /* synthetic */ Long $initialDateMillis;
    public final /* synthetic */ int $inputIdentifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $label;
    public final /* synthetic */ Locale $locale;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Long, Unit> $onDateSelectionChange;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;Ljava/lang/Long;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1Xc;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ILX/1Y5;LX/1Y4;Ljava/util/Locale;LX/1Wz;II)V */
    public C1Y2(C1Y5 c1y5, C1Wz c1Wz, AbstractC04741Xc abstractC04741Xc, C1Y4 c1y4, BRg bRg, Long l, Locale locale, G0U g0u, G0V g0v, G0V g0v2, int i, int i2, int i3) {
        super(2);
        this.$modifier = bRg;
        this.$initialDateMillis = l;
        this.$onDateSelectionChange = g0u;
        this.$calendarModel = abstractC04741Xc;
        this.$label = g0v;
        this.$placeholder = g0v2;
        this.$inputIdentifier = i;
        this.$dateInputValidator = c1y5;
        this.$dateInputFormat = c1y4;
        this.$locale = locale;
        this.$colors = c1Wz;
        this.$$changed = i2;
        this.$$changed1 = i3;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        BRg bRg = this.$modifier;
        Long l = this.$initialDateMillis;
        G0U<Long, Unit> g0u = this.$onDateSelectionChange;
        AbstractC04741Xc abstractC04741Xc = this.$calendarModel;
        G0V<BFM, Integer, Unit> g0v = this.$label;
        G0V<BFM, Integer, Unit> g0v2 = this.$placeholder;
        int i = this.$inputIdentifier;
        AbstractC04941Xz.A00(this.$dateInputValidator, this.$colors, abstractC04741Xc, this.$dateInputFormat, bfmA0P, bRg, l, this.$locale, g0u, g0v, g0v2, i, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        return Unit.INSTANCE;
    }
}
