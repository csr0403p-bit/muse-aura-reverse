package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SharedSpaceWidgetRendererKt$SharedSpaceCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ SharedSpace $space;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSpaceWidgetRendererKt$SharedSpaceCard$1$1(AuraNavigator auraNavigator, SharedSpace sharedSpace) {
        super(0);
        this.$navigator = auraNavigator;
        this.$space = sharedSpace;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        SharedSpace sharedSpace = this.$space;
        ArtifactOpenTarget.PeerSpace peerSpace = sharedSpace.target;
        auraNavigator.navigate((AuraNavKey) new PeerSpaceScreenKey(peerSpace.hostMuse, peerSpace.spaceId, sharedSpace.title, sharedSpace.senderName, false), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
