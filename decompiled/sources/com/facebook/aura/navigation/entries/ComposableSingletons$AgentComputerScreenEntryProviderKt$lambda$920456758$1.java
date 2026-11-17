package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.browsertask.screen.BrowserTaskScreensKt;
import com.facebook.aura.navigation.key.AgentComputerTakeOverScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AgentComputerScreenEntryProviderKt$lambda$-920456758$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentComputerScreenEntryProviderKt$lambda$920456758$1 extends AbstractC7559F3s implements G0W<AgentComputerTakeOverScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentComputerScreenEntryProviderKt$lambda$920456758$1 INSTANCE = new ComposableSingletons$AgentComputerScreenEntryProviderKt$lambda$920456758$1();

    public ComposableSingletons$AgentComputerScreenEntryProviderKt$lambda$920456758$1() {
        super(3);
    }

    public final void invoke(AgentComputerTakeOverScreenKey agentComputerTakeOverScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BrowserTaskScreensKt.VmBrowserTaskScreen(true, null, bfm, 6, 2);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AgentComputerTakeOverScreenKey agentComputerTakeOverScreenKey, BFM bfm, Integer num) {
        invoke(agentComputerTakeOverScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
