package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.B6A;
import X.C60P;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchTextWithButtonCardKt$TextWithButtonCtaButton$1$1 extends AbstractC7559F3s implements Function0<B6A> {
    public final /* synthetic */ long $disabledContentColor;
    public final /* synthetic */ boolean $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTextWithButtonCardKt$TextWithButtonCtaButton$1$1(long j, boolean z) {
        super(0);
        this.$disabledContentColor = j;
        this.$enabled = z;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke-QN2ZGVo, reason: not valid java name and merged with bridge method [inline-methods] */
    public final B6A invoke() {
        B6A b6aA04 = C60P.A04(this.$disabledContentColor);
        if (this.$enabled) {
            return null;
        }
        return b6aA04;
    }
}
