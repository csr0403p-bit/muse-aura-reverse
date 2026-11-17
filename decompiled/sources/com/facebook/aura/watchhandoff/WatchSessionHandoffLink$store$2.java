package com.facebook.aura.watchhandoff;

import X.AbstractC7559F3s;
import X.C3cG;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class WatchSessionHandoffLink$store$2 extends AbstractC7559F3s implements Function0<WatchSessionLinkStore> {
    public static final WatchSessionHandoffLink$store$2 INSTANCE = new WatchSessionHandoffLink$store$2();

    public WatchSessionHandoffLink$store$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final WatchSessionLinkStore invoke() {
        return new WatchSessionLinkStore(C3cG.A06());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ WatchSessionLinkStore invoke() {
        return new WatchSessionLinkStore(C3cG.A06());
    }
}
