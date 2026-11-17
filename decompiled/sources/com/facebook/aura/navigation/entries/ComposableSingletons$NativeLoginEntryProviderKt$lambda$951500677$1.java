package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.login.nativeflow.NativeLoginRoutesKt;
import com.facebook.aura.navigation.key.NativeLoginCheckpointScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$NativeLoginEntryProviderKt$lambda$-951500677$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$NativeLoginEntryProviderKt$lambda$951500677$1 extends AbstractC7559F3s implements G0W<NativeLoginCheckpointScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$NativeLoginEntryProviderKt$lambda$951500677$1 INSTANCE = new ComposableSingletons$NativeLoginEntryProviderKt$lambda$951500677$1();

    public ComposableSingletons$NativeLoginEntryProviderKt$lambda$951500677$1() {
        super(3);
    }

    public final void invoke(NativeLoginCheckpointScreenKey nativeLoginCheckpointScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            NativeLoginRoutesKt.NativeLoginCheckpointRoute(bfm, 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(NativeLoginCheckpointScreenKey nativeLoginCheckpointScreenKey, BFM bfm, Integer num) {
        invoke(nativeLoginCheckpointScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
