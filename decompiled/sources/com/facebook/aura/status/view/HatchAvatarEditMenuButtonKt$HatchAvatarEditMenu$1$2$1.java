package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ String $changeAvatarPrompt;
    public final /* synthetic */ String $changeVoicePrompt;
    public final /* synthetic */ String $editNamePrompt;
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        String str;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$expanded$delegate);
        HatchAvatarEditMenuButtonKt.logAvatarEditMenuPick(auraContextMenuItem.id);
        int i = auraContextMenuItem.id;
        if (i == 1) {
            str = this.$changeAvatarPrompt;
        } else if (i == 2) {
            str = this.$editNamePrompt;
        } else if (i != 3 || !Voice.INSTANCE.isVoiceDesignSupported()) {
            return;
        } else {
            str = this.$changeVoicePrompt;
        }
        HatchAvatarEditMenuButtonKt.draftIdentityPromptInComposer(str, this.$navigator);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$2$1(String str, AuraNavigator auraNavigator, String str2, String str3, MutableState<Boolean> mutableState) {
        super(1);
        this.$changeAvatarPrompt = str;
        this.$navigator = auraNavigator;
        this.$editNamePrompt = str2;
        this.$changeVoicePrompt = str3;
        this.$expanded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
