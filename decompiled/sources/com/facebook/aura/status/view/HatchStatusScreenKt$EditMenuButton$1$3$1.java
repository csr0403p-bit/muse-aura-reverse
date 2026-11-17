package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$EditMenuButton$1$3$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ String $changeAvatarPrompt;
    public final /* synthetic */ String $changeVoicePrompt;
    public final /* synthetic */ String $editNamePrompt;
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ G0U<String, Unit> $onChangeAvatar;
    public final /* synthetic */ G0U<String, Unit> $onChangeVoice;
    public final /* synthetic */ G0U<String, Unit> $onEditName;
    public final /* synthetic */ Function0<Unit> $onShareAvatar;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        G0U<String, Unit> g0u;
        String str;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$expanded$delegate);
        int i = auraContextMenuItem.id;
        if (i == 1) {
            g0u = this.$onChangeAvatar;
            str = this.$changeAvatarPrompt;
        } else if (i == 2) {
            g0u = this.$onEditName;
            str = this.$editNamePrompt;
        } else if (i == 3) {
            this.$onShareAvatar.invoke();
            return;
        } else {
            if (i != 4 || !Voice.INSTANCE.isVoiceDesignSupported()) {
                return;
            }
            g0u = this.$onChangeVoice;
            str = this.$changeVoicePrompt;
        }
        g0u.invoke(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusScreenKt$EditMenuButton$1$3$1(G0U<? super String, Unit> g0u, String str, G0U<? super String, Unit> g0u2, String str2, Function0<Unit> function0, G0U<? super String, Unit> g0u3, String str3, MutableState<Boolean> mutableState) {
        super(1);
        this.$onChangeAvatar = g0u;
        this.$changeAvatarPrompt = str;
        this.$onEditName = g0u2;
        this.$editNamePrompt = str2;
        this.$onShareAvatar = function0;
        this.$onChangeVoice = g0u3;
        this.$changeVoicePrompt = str3;
        this.$expanded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
