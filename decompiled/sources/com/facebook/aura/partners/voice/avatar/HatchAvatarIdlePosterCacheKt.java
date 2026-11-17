package com.facebook.aura.partners.voice.avatar;

import X.AbstractC7559F3s;
import X.BFI;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.CEV;
import X.CFK;
import X.G0U;
import android.content.Context;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.model.AvatarCallIdleVideo;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class HatchAvatarIdlePosterCacheKt {
    public static final String CALL_IDLE_VIDEO_DIR = "hatch_call_idle_videos";
    public static final long FAILED_PREPARE_COOLDOWN_MS = 60000;
    public static final int MAX_CALL_IDLE_VIDEOS = 3;
    public static final String POSTER_DIR = "hatch_avatar_idle_posters";
    public static final String RETIRED_SUFFIX = ".retired-";
    public static final String TAG = "HatchAvatarIdlePoster";

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCacheKt$sha256$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            return C3cJ.A0K(Integer.valueOf(b & 255));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }

    public static final HatchAvatarIdleKey posterKey(AvatarCallIdleVideo avatarCallIdleVideo) {
        C7384Etj.A0Y(avatarCallIdleVideo, 0);
        return new HatchAvatarIdleKey(avatarCallIdleVideo.path, avatarCallIdleVideo.url);
    }

    public static final void deleteRetiredCallIdleVideos() {
        File cacheDir;
        File[] fileArrListFiles;
        try {
            Context context = AuraAppContext.INSTANCE.getContext();
            if (context == null || (cacheDir = context.getCacheDir()) == null || (fileArrListFiles = cacheDir.listFiles()) == null) {
                return;
            }
            ArrayList<File> arrayListA0h = C3cG.A0h();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                C7384Etj.A0U(name);
                if (name.startsWith("hatch_call_idle_videos.retired-")) {
                    arrayListA0h.add(file);
                }
            }
            for (File file2 : arrayListA0h) {
                C7384Etj.A0X(file2);
                CEV.A03(file2);
            }
        } catch (Exception e) {
            CFK.A0K(TAG, e, "Could not delete call idle clips");
        }
    }

    public static final String sha256(String str) {
        byte[] bArrA1T = C3cH.A1T(str);
        C7384Etj.A0U(bArrA1T);
        return BFI.A0C("", AnonymousClass1.INSTANCE, bArrA1T);
    }
}
