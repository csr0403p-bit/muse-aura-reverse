package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PeerSpaceScreenKt$PeerSpaceScreen$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PeerSpaceScreenKey $key;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceScreenKt$PeerSpaceScreen$2$1(AuraNavigator auraNavigator, PeerSpaceScreenKey peerSpaceScreenKey) {
        super(0);
        this.$navigator = auraNavigator;
        this.$key = peerSpaceScreenKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        PeerSpaceScreenKey peerSpaceScreenKey = this.$key;
        auraNavigator.navigate((AuraNavKey) new PeerSpaceMenuSheetKey(peerSpaceScreenKey.hostMuse, peerSpaceScreenKey.spaceId, peerSpaceScreenKey.title), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
