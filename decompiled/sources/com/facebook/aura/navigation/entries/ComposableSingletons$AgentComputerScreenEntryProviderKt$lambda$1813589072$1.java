package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.browsertask.screen.BrowserTaskScreensKt;
import com.facebook.aura.navigation.key.RemoteBrowserScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentComputerScreenEntryProviderKt$lambda$1813589072$1 extends AbstractC7559F3s implements G0W<RemoteBrowserScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentComputerScreenEntryProviderKt$lambda$1813589072$1 INSTANCE = new ComposableSingletons$AgentComputerScreenEntryProviderKt$lambda$1813589072$1();

    public ComposableSingletons$AgentComputerScreenEntryProviderKt$lambda$1813589072$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(RemoteBrowserScreenKey remoteBrowserScreenKey, BFM bfm, Integer num) {
        invoke(remoteBrowserScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(RemoteBrowserScreenKey remoteBrowserScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(remoteBrowserScreenKey, 0);
        BrowserTaskScreensKt.RemoteBrowserTaskScreen(remoteBrowserScreenKey.taskId, null, bfm, 0, 2);
    }
}
