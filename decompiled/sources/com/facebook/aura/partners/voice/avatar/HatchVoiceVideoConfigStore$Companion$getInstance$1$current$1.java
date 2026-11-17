package com.facebook.aura.partners.voice.avatar;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3cH;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.HatchAiIdentityHandler;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceVideoConfigStore$Companion$getInstance$1$current$1 extends AbstractC7559F3s implements Function0<HatchVoiceVideoConfigStore.Snapshot> {
    public final /* synthetic */ HatchVoiceAvatarStore $avatarStore;
    public final /* synthetic */ HatchGatewayConnection $connection;
    public final /* synthetic */ HatchGatewayPrefsStore $gateway;
    public final /* synthetic */ HatchAvatarReferenceImageProvider $provider;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceVideoConfigStore$Companion$getInstance$1$current$1(HatchGatewayPrefsStore hatchGatewayPrefsStore, HatchVoiceAvatarStore hatchVoiceAvatarStore, HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, AbstractC3358CGz abstractC3358CGz, HatchGatewayConnection hatchGatewayConnection) {
        super(0);
        this.$gateway = hatchGatewayPrefsStore;
        this.$avatarStore = hatchVoiceAvatarStore;
        this.$provider = hatchAvatarReferenceImageProvider;
        this.$userSession = abstractC3358CGz;
        this.$connection = hatchGatewayConnection;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchVoiceVideoConfigStore.Snapshot invoke() {
        HxE<String, String> hxEA0q = C3cH.A0q(this.$gateway, this.$gateway.getGatewayUrl());
        String strCurrentVoiceAvatarPath = this.$avatarStore.currentVoiceAvatarPath(hxEA0q);
        PreparedHatchAvatar preparedHatchAvatarPreparedAvatarFor = this.$provider.preparedAvatarFor(strCurrentVoiceAvatarPath);
        if (preparedHatchAvatarPreparedAvatarFor == null || !C7384Etj.areEqual(strCurrentVoiceAvatarPath, this.$avatarStore.currentVoiceAvatarPath(hxEA0q)) || !AuraSessionManager.INSTANCE.isCurrentSession(this.$userSession) || !AnonymousClass002.A1Y(VoiceGating.INSTANCE.getEmbodimentOffReason())) {
            return null;
        }
        HatchAiIdentityHandler.AvatarImageKey committedAvatarImageKey = this.$connection.getCommittedAvatarImageKey();
        AiIdentity aiIdentityA0R = C3cH.A0R(this.$connection);
        return new HatchVoiceVideoConfigStore.Snapshot(preparedHatchAvatarPreparedAvatarFor, hxEA0q, committedAvatarImageKey, aiIdentityA0R != null ? aiIdentityA0R.avatarStem : null);
    }
}
