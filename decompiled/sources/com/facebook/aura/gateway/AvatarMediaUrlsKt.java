package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMediaSelectionKt;
import com.facebook.aura.model.AvatarStatusVideos;
import com.facebook.aura.model.AvatarVideoVariant;
import com.facebook.aura.model.SelectedAvatarMedia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AvatarMediaUrlsKt {
    public static final HxE<String, String> selectedStill(AiIdentity aiIdentity, AbstractC3358CGz abstractC3358CGz, boolean z) {
        C7384Etj.A0Y(aiIdentity, 0);
        C7384Etj.A0Y(abstractC3358CGz, 1);
        String str = (String) AbstractC0878AGe.A0G(AvatarMediaSelectionKt.select(aiIdentity.avatarMedia, z).stills);
        return str == null ? new HxE<>(null, null) : new HxE<>(HatchAiIdentityHandler.Companion.avatarImageUrl(str, abstractC3358CGz), str);
    }

    public static final String videoUrl(SelectedAvatarMedia selectedAvatarMedia, AvatarVideoVariant avatarVideoVariant, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(selectedAvatarMedia, 0);
        C7384Etj.A0Y(avatarVideoVariant, 1);
        C7384Etj.A0Y(abstractC3358CGz, 2);
        List<String> list = selectedAvatarMedia.videos.get(avatarVideoVariant);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strBuildFSRawFileUrl = HatchFileOperations.INSTANCE.buildFSRawFileUrl(it.next(), abstractC3358CGz);
                if (strBuildFSRawFileUrl != null) {
                    return strBuildFSRawFileUrl;
                }
            }
        }
        return null;
    }

    public static final AvatarStatusVideos statusVideos(SelectedAvatarMedia selectedAvatarMedia, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(selectedAvatarMedia, abstractC3358CGz);
        AvatarVideoVariant avatarVideoVariant = AvatarVideoVariant.IDLE;
        String strStatusVideos$frame = statusVideos$frame(selectedAvatarMedia, abstractC3358CGz, avatarVideoVariant);
        AvatarVideoVariant avatarVideoVariant2 = AvatarVideoVariant.WORKING;
        String strStatusVideos$frame2 = statusVideos$frame(selectedAvatarMedia, abstractC3358CGz, avatarVideoVariant2);
        AvatarVideoVariant avatarVideoVariant3 = AvatarVideoVariant.MAKING_SOMETHING;
        String strStatusVideos$frame3 = statusVideos$frame(selectedAvatarMedia, abstractC3358CGz, avatarVideoVariant3);
        AvatarVideoVariant avatarVideoVariant4 = AvatarVideoVariant.CONNECTING;
        String strStatusVideos$frame4 = statusVideos$frame(selectedAvatarMedia, abstractC3358CGz, avatarVideoVariant4);
        AvatarVideoVariant avatarVideoVariant5 = AvatarVideoVariant.WAKING;
        AvatarStatusVideos avatarStatusVideos = new AvatarStatusVideos(strStatusVideos$frame, strStatusVideos$frame2, strStatusVideos$frame3, strStatusVideos$frame4, statusVideos$frame(selectedAvatarMedia, abstractC3358CGz, avatarVideoVariant5), null);
        String strVideoUrl = videoUrl(selectedAvatarMedia, avatarVideoVariant, abstractC3358CGz);
        String strVideoUrl2 = videoUrl(selectedAvatarMedia, avatarVideoVariant2, abstractC3358CGz);
        String strVideoUrl3 = videoUrl(selectedAvatarMedia, avatarVideoVariant3, abstractC3358CGz);
        String strVideoUrl4 = videoUrl(selectedAvatarMedia, avatarVideoVariant4, abstractC3358CGz);
        String strVideoUrl5 = videoUrl(selectedAvatarMedia, avatarVideoVariant5, abstractC3358CGz);
        if (avatarStatusVideos.equals(new AvatarStatusVideos(null, null, null, null, null, null))) {
            avatarStatusVideos = null;
        }
        return new AvatarStatusVideos(strVideoUrl, strVideoUrl2, strVideoUrl3, strVideoUrl4, strVideoUrl5, avatarStatusVideos);
    }

    public static final String statusVideos$frame(SelectedAvatarMedia selectedAvatarMedia, AbstractC3358CGz abstractC3358CGz, AvatarVideoVariant avatarVideoVariant) {
        List<String> list = selectedAvatarMedia.startFrames.get(avatarVideoVariant);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strBuildFSRawFileUrl = HatchFileOperations.INSTANCE.buildFSRawFileUrl(it.next(), abstractC3358CGz);
                if (strBuildFSRawFileUrl != null) {
                    return strBuildFSRawFileUrl;
                }
            }
        }
        return null;
    }

    public static final List<String> stillUrls(SelectedAvatarMedia selectedAvatarMedia, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(selectedAvatarMedia, abstractC3358CGz);
        List<String> list = selectedAvatarMedia.stills;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strAvatarImageUrl = HatchAiIdentityHandler.Companion.avatarImageUrl(AnonymousClass005.A0j(it), abstractC3358CGz);
            if (strAvatarImageUrl != null) {
                arrayListA0h.add(strAvatarImageUrl);
            }
        }
        return arrayListA0h;
    }
}
