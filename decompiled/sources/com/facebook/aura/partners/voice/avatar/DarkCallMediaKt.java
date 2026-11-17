package com.facebook.aura.partners.voice.avatar;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C7384Etj;
import X.Hr7;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.model.AppearancePaths;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarVideoVariant;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class DarkCallMediaKt {
    public static final boolean getSupportsDarkCall(AvatarMedia avatarMedia) {
        AppearancePaths appearancePaths;
        List<String> list;
        C7384Etj.A0Y(avatarMedia, 0);
        return (avatarMedia.callIdle.dark.isEmpty() || avatarMedia.callIdleDarkCrop == null || (appearancePaths = avatarMedia.videos.get(AvatarVideoVariant.WORKING)) == null || (list = appearancePaths.dark) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.AvatarCallIdleVideo callIdleVideo(com.facebook.aura.model.AiIdentity r7, X.AbstractC3358CGz r8, boolean r9) {
        /*
            X.AnonymousClass003.A0u(r7, r8)
            r6 = 0
            if (r9 == 0) goto L26
            com.facebook.aura.model.AvatarMedia r0 = r7.avatarMedia
            boolean r0 = getSupportsDarkCall(r0)
            if (r0 == 0) goto L26
            com.facebook.aura.model.AvatarMedia r0 = r7.avatarMedia
            com.facebook.aura.model.AppearancePaths r0 = r0.callIdle
            java.util.List<java.lang.String> r0 = r0.dark
            java.lang.Object r1 = X.AbstractC0878AGe.A0G(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L27
            r2 = r1
        L1d:
            com.facebook.aura.gateway.HatchFileOperations r0 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            java.lang.String r3 = r0.buildFSRawFileUrl(r2, r8)
            if (r3 != 0) goto L36
            return r6
        L26:
            r1 = r6
        L27:
            com.facebook.aura.model.AvatarMedia r0 = r7.avatarMedia
            com.facebook.aura.model.AppearancePaths r0 = r0.callIdle
            java.util.List<java.lang.String> r0 = r0.light
            java.lang.Object r2 = X.AbstractC0878AGe.A0G(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L1d
            return r6
        L36:
            com.facebook.aura.model.AvatarMedia r0 = r7.avatarMedia
            if (r1 == 0) goto L51
            com.facebook.aura.model.AvatarDisplayCrop r0 = r0.callIdleDarkCrop
        L3c:
            if (r0 == 0) goto L4e
            java.lang.Float r4 = r0.x
            java.lang.Float r5 = r0.y
            java.lang.Float r6 = r0.size
        L44:
            boolean r7 = X.AnonymousClass002.A1X(r1)
            com.facebook.aura.model.AvatarCallIdleVideo r1 = new com.facebook.aura.model.AvatarCallIdleVideo
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L4e:
            r4 = r6
            r5 = r6
            goto L44
        L51:
            com.facebook.aura.model.AvatarDisplayCrop r0 = r0.callIdleCrop
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.DarkCallMediaKt.callIdleVideo(com.facebook.aura.model.AiIdentity, X.CGz, boolean):com.facebook.aura.model.AvatarCallIdleVideo");
    }

    public static final String darkCallMakingSomethingUrl(AvatarMedia avatarMedia, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(avatarMedia, abstractC3358CGz);
        AppearancePaths appearancePaths = avatarMedia.videos.get(AvatarVideoVariant.MAKING_SOMETHING);
        AppearancePaths appearancePaths2 = avatarMedia.videos.get(AvatarVideoVariant.WORKING);
        Iterator it = Hr7.A1F(BFI.A0F(new List[]{appearancePaths != null ? appearancePaths.dark : null, appearancePaths2 != null ? appearancePaths2.dark : null, appearancePaths != null ? appearancePaths.light : null, appearancePaths2 != null ? appearancePaths2.light : null})).iterator();
        while (it.hasNext()) {
            String strBuildFSRawFileUrl = HatchFileOperations.INSTANCE.buildFSRawFileUrl(AnonymousClass005.A0j(it), abstractC3358CGz);
            if (strBuildFSRawFileUrl != null) {
                return strBuildFSRawFileUrl;
            }
        }
        return null;
    }
}
