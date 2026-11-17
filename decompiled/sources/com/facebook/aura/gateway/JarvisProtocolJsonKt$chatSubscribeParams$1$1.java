package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.C7pd;
import X.C9oY;
import X.G0U;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class JarvisProtocolJsonKt$chatSubscribeParams$1$1 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
    public final /* synthetic */ String $sessionId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C7pd c7pd) {
        C7384Etj.A0Y(c7pd, 0);
        Iterator<String> it = JarvisProtocolJsonKt.chatSubscribeCapabilities(AnonymousClass002.A1Y(this.$sessionId)).iterator();
        while (it.hasNext()) {
            c7pd.A06(C9oY.A07(it.next()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JarvisProtocolJsonKt$chatSubscribeParams$1$1(String str) {
        super(1);
        this.$sessionId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
        invoke2(c7pd);
        return Unit.INSTANCE;
    }
}
