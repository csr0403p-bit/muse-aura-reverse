package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.CFK;
import X.FGI;
import X.G0U;

/* loaded from: classes.dex */
public final class SpaceNavigationIconKt$SpaceNavigationIcon$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ String $xmdsIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceNavigationIconKt$SpaceNavigationIcon$1$1(String str, String str2) {
        super(1);
        this.$iconUrl = str;
        this.$xmdsIcon = str2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        CFK.A05("SavedSpaceViewer", FGI.A0d("event=nav_icon icon=", SpaceNavigationIconKt.savedIconKind(this.$iconUrl), " xmds=", SpaceNavigationIconKt.savedIconKind(this.$xmdsIcon)));
        return new C78g() { // from class: com.facebook.aura.tabs.SpaceNavigationIconKt$SpaceNavigationIcon$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
