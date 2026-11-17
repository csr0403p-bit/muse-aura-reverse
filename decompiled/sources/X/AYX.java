package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AYX extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EnumC1820Arj $layoutDirection;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ C1711Aou $popupLayout;
    public final /* synthetic */ C11N $properties;
    public final /* synthetic */ String $testTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Aou;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/11N;Ljava/lang/String;LX/Arj;)V */
    public AYX(EnumC1820Arj enumC1820Arj, C1711Aou c1711Aou, C11N c11n, String str, Function0 function0) {
        super(0);
        this.$popupLayout = c1711Aou;
        this.$onDismissRequest = function0;
        this.$properties = c11n;
        this.$testTag = str;
        this.$layoutDirection = enumC1820Arj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        C1711Aou c1711Aou = this.$popupLayout;
        Function0<Unit> function0 = this.$onDismissRequest;
        c1711Aou.A0I(this.$layoutDirection, this.$properties, this.$testTag, function0);
        return Unit.INSTANCE;
    }
}
