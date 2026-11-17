package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class JarvisProtocolJsonKt$buildChatStreamBody$params$1$2$2 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ String $text;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A06("type", "text", c2nw);
        C7qW.A06("text", this.$text, c2nw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JarvisProtocolJsonKt$buildChatStreamBody$params$1$2$2(String str) {
        super(1);
        this.$text = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
