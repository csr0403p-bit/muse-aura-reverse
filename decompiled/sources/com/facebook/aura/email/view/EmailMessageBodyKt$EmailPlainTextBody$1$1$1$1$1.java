package com.facebook.aura.email.view;

import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailMessageBodyKt$EmailPlainTextBody$1$1$1$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $quoteColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        long j = this.$quoteColor;
        float fA01 = AnonymousClass001.A01(at3.AKb(), 4294967295L);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fA01) & 4294967295L;
        at3.A9X(null, null, at3.Ah4(2.0f), 1.0f, 0, 3, j, 0L, jFloatToRawIntBits | (AnonymousClass002.A0F() << 32));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailMessageBodyKt$EmailPlainTextBody$1$1$1$1$1(long j) {
        super(1);
        this.$quoteColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
