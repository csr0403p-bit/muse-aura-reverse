package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmLeave$delegate;
    public final /* synthetic */ PeerSpaceMenuSheetKey $key;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$9$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public final /* synthetic */ PeerSpaceMenuSheetKey $key;

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(((auraNavKey instanceof PeerSpaceMenuSheetKey) && C7384Etj.areEqual(((PeerSpaceMenuSheetKey) auraNavKey).spaceId, this.$key.spaceId)) || ((auraNavKey instanceof PeerSpaceScreenKey) && C7384Etj.areEqual(((PeerSpaceScreenKey) auraNavKey).spaceId, this.$key.spaceId)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey) {
            super(1);
            this.$key = peerSpaceMenuSheetKey;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$9$1(AuraNavigator auraNavigator, MutableState<Boolean> mutableState, PeerSpaceMenuSheetKey peerSpaceMenuSheetKey) {
        super(0);
        this.$navigator = auraNavigator;
        this.$confirmLeave$delegate = mutableState;
        this.$key = peerSpaceMenuSheetKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$confirmLeave$delegate);
        this.$navigator.popAll(new AnonymousClass1(this.$key));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
