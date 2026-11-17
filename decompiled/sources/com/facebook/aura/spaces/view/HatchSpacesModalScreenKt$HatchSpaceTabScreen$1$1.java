package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SpaceMenuSheetKey;
import com.facebook.aura.utils.HatchUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$HatchSpaceTabScreen$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isModal;
    public final /* synthetic */ String $menuParentContentKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ boolean $useNavigationArtifact;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$HatchSpaceTabScreen$1$1(AuraNavigator auraNavigator, String str, boolean z, boolean z2, String str2, MutableState<Boolean> mutableState) {
        super(0);
        this.$navigator = auraNavigator;
        this.$slug = str;
        this.$isModal = z;
        this.$useNavigationArtifact = z2;
        this.$menuParentContentKey = str2;
        this.$showMenu$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (HatchUtil.INSTANCE.isConnectionsTabEnabled()) {
            this.$navigator.navigate((AuraNavKey) new SpaceMenuSheetKey(this.$slug, !this.$isModal, this.$useNavigationArtifact, this.$menuParentContentKey), false);
        } else {
            MutableState.A09(true, this.$showMenu$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
